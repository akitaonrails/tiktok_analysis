package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoExpressCheckoutPaymentResultPageConfigModel {

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("enable_height_calculation")
    public final boolean enableHeightCalculation;

    @C09CT("enable_roma_short_link")
    public final boolean enableRomaShortLink;

    @C09CT("roma_group_key")
    public final String groupKey;

    @C09CT("roma_page_key")
    public final String pageKey;

    @C09CT("roma_page_key_nine_split")
    public final String pageKeyForNineSplit;

    public PipoExpressCheckoutPaymentResultPageConfigModel() {
        this(300L, false, null, null, null, false);
    }

    public PipoExpressCheckoutPaymentResultPageConfigModel(long j, boolean z, String str, String str2, String str3, boolean z2) {
        this.delayTime = j;
        this.enableRomaShortLink = z;
        this.groupKey = str;
        this.pageKey = str2;
        this.pageKeyForNineSplit = str3;
        this.enableHeightCalculation = z2;
    }
}
