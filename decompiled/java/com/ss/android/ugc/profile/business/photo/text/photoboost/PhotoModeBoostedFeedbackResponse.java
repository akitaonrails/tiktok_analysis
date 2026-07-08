package com.ss.android.ugc.profile.business.photo.text.photoboost;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class PhotoModeBoostedFeedbackResponse {
    public static final int $stable = 0;

    @C09CT("banner_text")
    public final String bannerText;

    @C09CT("hot_request_count")
    public final String hotRequestCount;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("link")
    public final String link;

    @C09CT("photo_queue_hot_request_cnt")
    public final String photoQueueHotRequestCnt;

    @C09CT("thumbnail_url")
    public final String thumbnailUrl;

    public PhotoModeBoostedFeedbackResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.itemId = str;
        this.thumbnailUrl = str2;
        this.bannerText = str3;
        this.link = str4;
        this.photoQueueHotRequestCnt = str5;
        this.hotRequestCount = str6;
    }
}
