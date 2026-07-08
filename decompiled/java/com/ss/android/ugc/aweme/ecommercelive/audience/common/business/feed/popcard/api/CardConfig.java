package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CardConfig {

    @C09CT("card_schema")
    public final String cardSchema;

    public CardConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardConfig) && Intrinsics.LJFF(this.cardSchema, ((CardConfig) obj).cardSchema);
    }

    public final int hashCode() {
        String str = this.cardSchema;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardConfig(cardSchema=");
        sbLIZ.append(this.cardSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CardConfig(String str) {
        this.cardSchema = str;
    }
}
