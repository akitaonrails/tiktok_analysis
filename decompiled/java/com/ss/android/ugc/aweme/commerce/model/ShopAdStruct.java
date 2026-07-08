package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class ShopAdStruct implements Serializable {

    @C09CT("ad_id")
    public String adId;

    @C09CT("creative_id")
    public String creativeId;

    @C09CT("is_ad")
    public String isAd;

    public final String isAd() {
        return this.isAd;
    }

    public final void setAd(String str) {
        this.isAd = str;
    }

    public final void setAdId(String str) {
        this.adId = str;
    }

    public final void setCreativeId(String str) {
        this.creativeId = str;
    }

    public ShopAdStruct(String str, String str2, String str3) {
        this.isAd = str;
        this.adId = str2;
        this.creativeId = str3;
    }
}
