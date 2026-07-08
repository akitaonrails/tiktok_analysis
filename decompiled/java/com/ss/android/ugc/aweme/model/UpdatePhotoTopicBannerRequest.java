package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class UpdatePhotoTopicBannerRequest {

    @C09CT("interaction")
    public final Integer bannerInteractionType;

    @C09CT("category")
    public final Integer category;

    @C09CT("extra")
    public final String extra;

    @C09CT("item_id")
    public final Long itemId;

    @C09CT("trend_id")
    public final String trendId;

    public UpdatePhotoTopicBannerRequest(String str, Integer num, Integer num2, Long l, String str2) {
        this.trendId = str;
        this.bannerInteractionType = num;
        this.category = num2;
        this.itemId = l;
        this.extra = str2;
    }
}
