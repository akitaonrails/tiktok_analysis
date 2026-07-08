package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class AiPdpPriceInfo implements Serializable {
    public static final int $stable = 0;
    public final String currentPrice;
    public final String discountRate;
    public final String originalPrice;

    public AiPdpPriceInfo() {
        this(null, null, null);
    }

    public AiPdpPriceInfo(String str, String str2, String str3) {
        this.currentPrice = str;
        this.originalPrice = str2;
        this.discountRate = str3;
    }
}
