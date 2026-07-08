package com.ss.android.ugc.aweme.components.purchaseoption;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PricePacket implements Serializable {
    public static final int $stable = 0;

    @C09CT("iap_id")
    public final String iapId;

    @C09CT("local_currency_code")
    public final String localCurrencyCode;

    @C09CT("local_price_amount")
    public final String localPriceAmount;

    @C09CT("price_in_usd")
    public final String priceInUsd;

    public PricePacket() {
        this(null, null, null, null);
    }

    public final PricePacket copy(String str, String str2, String str3, String str4) {
        return new PricePacket(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricePacket)) {
            return false;
        }
        PricePacket pricePacket = (PricePacket) obj;
        return Intrinsics.LJFF(this.iapId, pricePacket.iapId) && Intrinsics.LJFF(this.localCurrencyCode, pricePacket.localCurrencyCode) && Intrinsics.LJFF(this.localPriceAmount, pricePacket.localPriceAmount) && Intrinsics.LJFF(this.priceInUsd, pricePacket.priceInUsd);
    }

    public PricePacket(String str, String str2, String str3, String str4) {
        this.iapId = str;
        this.localCurrencyCode = str2;
        this.localPriceAmount = str3;
        this.priceInUsd = str4;
    }
}
