package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class BFFData {

    @C09CT("card_config")
    public final CardConfig cardConfig;

    public BFFData() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BFFData) && Intrinsics.LJFF(this.cardConfig, ((BFFData) obj).cardConfig);
    }

    public final int hashCode() {
        CardConfig cardConfig = this.cardConfig;
        if (cardConfig == null) {
            return 0;
        }
        return cardConfig.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BFFData(cardConfig=");
        sbLIZ.append(this.cardConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BFFData(CardConfig cardConfig) {
        this.cardConfig = cardConfig;
    }
}
