package com.ss.android.ugc.aweme.topic.review.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicReview implements Serializable {

    @C09CT("digg_count")
    public final int diggCount;
    public final transient boolean isMocked;

    @C09CT("review_id")
    public final String reviewId;

    @C09CT("text")
    public final String text;

    @C09CT("topic_id")
    public final String topicId;

    @C09CT("topic_rating")
    public final int topicRating;

    @C09CT("topic_type")
    public final int topicType;

    @C09CT("update_time")
    public final long updateTime;

    @C09CT("user")
    public final User user;

    @C09CT("user_digged")
    public final boolean userDigged;

    public final TopicReview copy(String str, int i, String str2, int i2, String str3, int i3, boolean z, long j, User user, boolean z2) {
        return new TopicReview(str, i, str2, i2, str3, i3, z, j, user, z2);
    }

    public final boolean isMocked() {
        return this.isMocked;
    }

    public TopicReview(String str, int i, String str2, int i2, String str3, int i3, boolean z, long j, User user, boolean z2) {
        this.topicId = str;
        this.topicType = i;
        this.reviewId = str2;
        this.topicRating = i2;
        this.text = str3;
        this.diggCount = i3;
        this.userDigged = z;
        this.updateTime = j;
        this.user = user;
        this.isMocked = z2;
    }
}
