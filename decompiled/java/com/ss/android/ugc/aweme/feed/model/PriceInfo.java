package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceInfo implements Serializable {

    @C09CT("diamond_id")
    public long diamondId;

    @C09CT("iap_id")
    public String iapId = "";

    @C09CT("price_in_usd")
    public String priceInUsd = "";

    public final long getDiamondId() {
        return this.diamondId;
    }

    public final String getIapId() {
        return this.iapId;
    }

    public final String getPriceInUsd() {
        return this.priceInUsd;
    }

    public final void setDiamondId(long j) {
        this.diamondId = j;
    }

    public final void setIapId(String str) {
        this.iapId = str;
    }

    public final void setPriceInUsd(String str) {
        this.priceInUsd = str;
    }
}
