package com.ss.android.ugc.aweme.topic.movie.model;

import X.C09CT;
import X.C0O4X;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieDetail {

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("description")
    public final String desc;

    @C09CT("topic_id")
    public final String id;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("external_rating")
    public final Double rating;

    @C09CT("title")
    public final String title;

    @C09CT("year")
    public final Integer year;

    public MovieDetail() {
        this(null, null, null, null, null, null, null);
    }

    public final TopicRawInfo LIZ() {
        int type = C0O4X.MOVIE.getType();
        String str = this.id;
        UrlModel urlModel = this.cover;
        String str2 = this.title;
        Double d = this.rating;
        Boolean bool = this.isCollected;
        return new TopicRawInfo(Integer.valueOf(type), str, str2, urlModel, null, d, this.year, null, bool, null, null, null, null, null, null);
    }

    public MovieDetail(String str, String str2, Integer num, Double d, String str3, UrlModel urlModel, Boolean bool) {
        this.id = str;
        this.title = str2;
        this.year = num;
        this.rating = d;
        this.desc = str3;
        this.cover = urlModel;
        this.isCollected = bool;
    }
}
