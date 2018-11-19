package studio.creative.kedditbysteps.features.news

import rx.Observable
import studio.creative.kedditbysteps.api.RestAPI
import studio.creative.kedditbysteps.commons.RedditNewsItem

class NewsManager(private val api: RestAPI = RestAPI()) {

    fun getNews(limit: String = "10"): Observable<List<RedditNewsItem>> {
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
            val callResponse = api.getNews("", limit)
            val response = callResponse.execute()

            if (response.isSuccessful) {
                val news = response.body().data.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments, item.created, item.thumbnail, item.url)
                }
                subscriber.onNext(news)
                subscriber.onCompleted()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}