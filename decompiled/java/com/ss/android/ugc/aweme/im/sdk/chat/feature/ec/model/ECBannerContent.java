package com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class ECBannerContent {

    @C09CT("btn_text")
    public final String btnText;

    @C09CT("header")
    public final String header;

    @C09CT("jump_link")
    public final String jumpLink;

    @C09CT("order_id")
    public final Long orderId;

    @C09CT("product_info")
    public final ECBannerProductInfo productInfo;

    public ECBannerContent() {
        this(null, null, null, null, null);
    }

    public ECBannerContent(String str, String str2, String str3, Long l, ECBannerProductInfo eCBannerProductInfo) {
        this.header = str;
        this.btnText = str2;
        this.jumpLink = str3;
        this.orderId = l;
        this.productInfo = eCBannerProductInfo;
    }
}
