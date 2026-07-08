package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C13LP;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class RelatedMediaSourceStruct implements Serializable {

    @C09CT("button")
    public MediaSourceButtonStruct button;

    @C09CT("classification")
    public List<String> classification;

    @C09CT("compass_id")
    public String compassId;

    @C09CT("seqs_count")
    public int epCount;

    @C09CT("episode_info")
    public MovieSource episodeInfo;

    @C09CT("movie_info")
    public Movie movieInfo;

    @C09CT("title")
    public String title = "";

    @C09CT("read_more")
    public String readMore = "";

    @C09CT("read_more_url")
    public String readMoreUrl = "";

    @C09CT("media_type")
    public int mediaType = 1;

    @C09CT("media_name")
    public String mediaName = "";

    @C09CT("cover")
    public UrlModel cover = new UrlModel();

    @C09CT("release_date")
    public String releaseData = "";

    @C09CT("duration")
    public Integer duration = 0;

    @C09CT("rating")
    public Float rating = Float.valueOf(0.0f);

    @C09CT("rating_status")
    public Integer ratingStatus = 0;

    @C09CT("media_tag")
    public String mediaTag = "";

    public final String getContentType() {
        String strLJJLIIIJ;
        List<String> list = this.classification;
        return (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, " ", null, null, 0, null, null, 62)) == null) ? "" : strLJJLIIIJ;
    }

    public final boolean isMovie() {
        return this.mediaType == 3;
    }

    public final MediaSourceButtonStruct getButton() {
        return this.button;
    }

    public final List<String> getClassification() {
        return this.classification;
    }

    public final String getCompassId() {
        return this.compassId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final int getEpCount() {
        return this.epCount;
    }

    public final MovieSource getEpisodeInfo() {
        return this.episodeInfo;
    }

    public final String getMediaName() {
        return this.mediaName;
    }

    public final String getMediaTag() {
        return this.mediaTag;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final Movie getMovieInfo() {
        return this.movieInfo;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final Integer getRatingStatus() {
        return this.ratingStatus;
    }

    public final String getReadMore() {
        return this.readMore;
    }

    public final String getReadMoreUrl() {
        return this.readMoreUrl;
    }

    public final String getReleaseData() {
        return this.releaseData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setButton(MediaSourceButtonStruct mediaSourceButtonStruct) {
        this.button = mediaSourceButtonStruct;
    }

    public final void setClassification(List<String> list) {
        this.classification = list;
    }

    public final void setCompassId(String str) {
        this.compassId = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEpCount(int i) {
        this.epCount = i;
    }

    public final void setEpisodeInfo(MovieSource movieSource) {
        this.episodeInfo = movieSource;
    }

    public final void setMediaName(String str) {
        this.mediaName = str;
    }

    public final void setMediaTag(String str) {
        this.mediaTag = str;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setMovieInfo(Movie movie) {
        this.movieInfo = movie;
    }

    public final void setRating(Float f) {
        this.rating = f;
    }

    public final void setRatingStatus(Integer num) {
        this.ratingStatus = num;
    }

    public final void setReadMore(String str) {
        this.readMore = str;
    }

    public final void setReadMoreUrl(String str) {
        this.readMoreUrl = str;
    }

    public final void setReleaseData(String str) {
        this.releaseData = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
