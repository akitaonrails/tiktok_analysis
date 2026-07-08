package com.ss.android.ugc.aweme.topic.book.model;

import X.C09CT;
import X.C0O4X;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class BookDetail {

    @C09CT("author_name")
    public final String author;

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("description")
    public final String desc;

    @C09CT("have_reviewed")
    public final Boolean hasReviewed;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("is_collected")
    public final Boolean isCollected;

    @C09CT("review_count")
    public final Long reviewCount;

    @C09CT("show_stat_count_trigger")
    public final Long reviewCountThreshold;

    @C09CT("title")
    public final String title;

    @C09CT("topic_rating")
    public final Float topicRating;

    public BookDetail() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final TopicRawInfo LIZ() {
        return new TopicRawInfo(Integer.valueOf(C0O4X.BOOK.getType()), this.id, this.title, this.cover, this.author, null, null, this.topicRating, this.isCollected, null, null, null, null, null, null);
    }

    public BookDetail(String str, String str2, String str3, String str4, UrlModel urlModel, Float f, Long l, Boolean bool, Long l2, Boolean bool2) {
        this.id = str;
        this.title = str2;
        this.author = str3;
        this.desc = str4;
        this.cover = urlModel;
        this.topicRating = f;
        this.reviewCount = l;
        this.hasReviewed = bool;
        this.reviewCountThreshold = l2;
        this.isCollected = bool2;
    }
}
