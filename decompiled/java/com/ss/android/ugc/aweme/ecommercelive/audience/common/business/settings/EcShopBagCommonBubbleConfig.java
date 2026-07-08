package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class EcShopBagCommonBubbleConfig {

    @C09CT("bubble_key")
    public final String bubbleKey;

    @C09CT("frequency_limit")
    public final int frequencyLimit;

    @C09CT("notice_type")
    public final String noticeType;

    @C09CT("show_image")
    public final boolean showImage;

    @C09CT("show_time")
    public final long showTime;

    public EcShopBagCommonBubbleConfig() {
        this(4000L, 1, false, "", "");
    }

    public EcShopBagCommonBubbleConfig(long j, int i, boolean z, String str, String str2) {
        this.showTime = j;
        this.frequencyLimit = i;
        this.showImage = z;
        this.bubbleKey = str;
        this.noticeType = str2;
    }
}
