package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class UserActionContent {

    @C09CT("ad_video_content")
    public final AdVideoContent adVideoContent;

    @C09CT("anti_cheat_content")
    public final AntiCheatContent antiCheatContent;

    @C09CT("feed_ads_content")
    public final FeedAdsContent feedAdsContent;

    @C09CT("follow_content")
    public final FollowContent followContent;

    @C09CT("like_content")
    public final CommonVideoContent likeVideoContent;

    @C09CT("repost_content")
    public final CommonVideoContent repostVideoContent;

    @C09CT("share_content")
    public final CommonVideoContent shareContent;

    @C09CT(alternate = {"watch_video_count_content"}, value = "watch_video_item_count_content")
    public final CommonVideoContent watchVideoItemCountContent;

    @C09CT("watch_video_time_content")
    public final WatchVideoTimeContent watchVideoTimeContent;

    public UserActionContent() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public UserActionContent(FeedAdsContent feedAdsContent, WatchVideoTimeContent watchVideoTimeContent, CommonVideoContent commonVideoContent, CommonVideoContent commonVideoContent2, CommonVideoContent commonVideoContent3, AdVideoContent adVideoContent, CommonVideoContent commonVideoContent4, AntiCheatContent antiCheatContent, FollowContent followContent) {
        this.feedAdsContent = feedAdsContent;
        this.watchVideoTimeContent = watchVideoTimeContent;
        this.watchVideoItemCountContent = commonVideoContent;
        this.likeVideoContent = commonVideoContent2;
        this.repostVideoContent = commonVideoContent3;
        this.adVideoContent = adVideoContent;
        this.shareContent = commonVideoContent4;
        this.antiCheatContent = antiCheatContent;
        this.followContent = followContent;
    }
}
