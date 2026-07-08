package com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class ECBannerProductInfo {

    @C09CT("amount")
    public final String amount;

    @C09CT("name")
    public final String name;

    @C09CT("price")
    public final String price;

    @C09CT("thumbnail")
    public final String thumbnail;

    public ECBannerProductInfo() {
        this(null, null, null, null);
    }

    public ECBannerProductInfo(String str, String str2, String str3, String str4) {
        this.thumbnail = str;
        this.name = str2;
        this.amount = str3;
        this.price = str4;
    }
}
