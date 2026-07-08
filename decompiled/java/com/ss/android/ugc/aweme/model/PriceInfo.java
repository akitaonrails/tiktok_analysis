package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PriceInfo implements Serializable {

    @C09CT("diamond_id")
    public long diamondId;

    @C09CT("iap_id")
    public String iapId;

    @C09CT("local_currency_code")
    public String localCurrencyCode;

    @C09CT("local_price_amount")
    public String localPriceAmount;

    @C09CT("price_in_usd")
    public String priceInUsd;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceInfo)) {
            return false;
        }
        PriceInfo priceInfo = (PriceInfo) obj;
        return this.diamondId == priceInfo.diamondId && Intrinsics.LJFF(this.iapId, priceInfo.iapId) && Intrinsics.LJFF(this.priceInUsd, priceInfo.priceInUsd) && Intrinsics.LJFF(this.localPriceAmount, priceInfo.localPriceAmount) && Intrinsics.LJFF(this.localCurrencyCode, priceInfo.localCurrencyCode);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PriceInfo(diamondId=");
        sbLIZ.append(this.diamondId);
        sbLIZ.append(", iapId=");
        sbLIZ.append(this.iapId);
        sbLIZ.append(", priceInUsd=");
        sbLIZ.append(this.priceInUsd);
        sbLIZ.append(", localPriceAmount=");
        sbLIZ.append(this.localPriceAmount);
        sbLIZ.append(", localCurrencyCode=");
        sbLIZ.append(this.localCurrencyCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PriceInfo() {
        this(0L, "", "", "", "");
    }

    public final void setDiamondId(long j) {
        this.diamondId = j;
    }

    public final void setIapId(String str) {
        this.iapId = str;
    }

    public final void setLocalCurrencyCode(String str) {
        this.localCurrencyCode = str;
    }

    public final void setLocalPriceAmount(String str) {
        this.localPriceAmount = str;
    }

    public final void setPriceInUsd(String str) {
        this.priceInUsd = str;
    }

    public PriceInfo(long j, String str, String str2, String str3, String str4) {
        this.diamondId = j;
        this.iapId = str;
        this.priceInUsd = str2;
        this.localPriceAmount = str3;
        this.localCurrencyCode = str4;
    }
}
