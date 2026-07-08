package com.ss.android.ugc.aweme.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GiftSettings {

    @C09CT("enable_video_gift")
    public final boolean enableVideoGift;

    @C09CT("auto_select_gift_after_recharge")
    public final boolean isSendGiftAfterRechargeEnabled;

    @C09CT("privacy_url")
    public final PrivacyUrls privacyUrls;

    @C09CT("promotion_url")
    public final String promotionUrl;

    public GiftSettings(String str, boolean z, PrivacyUrls privacyUrls, boolean z2) {
        this.promotionUrl = str;
        this.enableVideoGift = z;
        this.privacyUrls = privacyUrls;
        this.isSendGiftAfterRechargeEnabled = z2;
    }
}
