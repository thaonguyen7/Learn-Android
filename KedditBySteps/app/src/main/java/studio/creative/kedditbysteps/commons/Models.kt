package studio.creative.kedditbysteps.commons

import android.os.Parcel
import android.os.Parcelable
import studio.creative.kedditbysteps.commons.adapter.AdapterConstants
import studio.creative.kedditbysteps.commons.adapter.ViewType
import studio.creative.kedditbysteps.commons.extensions.createParcel

data class RedditNews(
        val after: String,
        val before: String,
        val news: List<RedditNewsItem>) : Parcelable {
    companion object {
        @JvmField @Suppress("unused")
        val CREATOR = createParcel { RedditNews(it) }
    }

    protected constructor(parcelIn: Parcel) : this(
            parcelIn.readString(),
            parcelIn.readString(),
            mutableListOf<RedditNewsItem>().apply {
                parcelIn.readTypedList(this, RedditNewsItem.CREATOR)
            }
    )

    override fun writeToParcel(parcel: Parcel?, flags: Int) {
        parcel?.let {
            it.writeString(after)
            it.writeString(before)
            it.writeTypedList(news)
        }
    }

    override fun describeContents() = 0
}

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType, Parcelable {

    companion object {
        @JvmField @Suppress("unused")
        val CREATOR = createParcel { RedditNewsItem(it) }
    }

    protected constructor(parceIn: Parcel) : this(
        parceIn.readString(),
            parceIn.readString(),
            parceIn.readInt(),
            parceIn.readLong(),
            parceIn.readString(),
            parceIn.readString()
    )

    override fun writeToParcel(parcel: Parcel?, flags: Int) {
        parcel?.let {
            it.writeString(author)
            it.writeString(title)
            it.writeInt(numComments)
            it.writeLong(created)
            it.writeString(thumbnail)
            it.writeString(url)
        }
    }

    override fun describeContents() = 0

    override fun getViewType() = AdapterConstants.NEWS
}