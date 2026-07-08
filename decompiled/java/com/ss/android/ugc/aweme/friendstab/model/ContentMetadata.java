package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class ContentMetadata {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("aweme_type")
    public final Integer awemeType;

    @C09CT("create_time")
    public final Long createTime;

    @C09CT("friend_relation_status")
    public final int friendRelationStatus;

    @C09CT("is_tiktok_story")
    public final Boolean isTikTokStory;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("share_feed_recall_reason")
    public final String shareRecallReason;

    public ContentMetadata() {
        this("", "", -1, Boolean.FALSE, 0L, 0, "");
    }

    public final Boolean isTikTokStory() {
        return this.isTikTokStory;
    }

    public ContentMetadata(String str, String str2, Integer num, Boolean bool, Long l, int i, String str3) {
        this.itemId = str;
        this.authorId = str2;
        this.awemeType = num;
        this.isTikTokStory = bool;
        this.createTime = l;
        this.friendRelationStatus = i;
        this.shareRecallReason = str3;
    }
}
