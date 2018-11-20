package studio.creative.kedditbysteps.features.news

import rx.Observable
import studio.creative.kedditbysteps.api.RestAPI
import studio.creative.kedditbysteps.commons.RedditNews
import studio.creative.kedditbysteps.commons.RedditNewsItem

class NewsManager(private val api: RestAPI = RestAPI()) {

    fun getNews(after: String, limit: String = "10"): Observable<RedditNews> {
        return Observable.create { subscriber ->
            /*
            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "title $i",
                        i,
                        1457207701L - i * 200,
                        "https://picsum.photos/200/200?image=$i",
                        "url"
                ))
            }
            subscriber.onNext(news)
            */
            val callResponse = api.getNews(after, limit)
            val response = callResponse.execute()

            if (response.isSuccessful) {
                val dataResponse = response.body().data
                val news = dataResponse.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments, item.created, item.thumbnail, item.url)
                }
                val redditNews = RedditNews(dataResponse.after ?: "",
                        dataResponse.before ?: "",
                        news)
                subscriber.onNext(redditNews)
                subscriber.onCompleted()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}