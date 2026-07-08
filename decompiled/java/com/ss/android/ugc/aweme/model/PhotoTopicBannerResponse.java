package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class PhotoTopicBannerResponse {

    @C09CT("banner_display_info")
    public final BannerDisplayInfo bannerData;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public PhotoTopicBannerResponse(Integer num, String str, BannerDisplayInfo bannerDisplayInfo) {
        this.statusCode = num;
        this.statusMsg = str;
        this.bannerData = bannerDisplayInfo;
    }
}
