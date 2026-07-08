package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ACPGetProductsContextDto {

    @C09CT("currency")
    public final String currency;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACPGetProductsContextDto) && Intrinsics.LJFF(this.currency, ((ACPGetProductsContextDto) obj).currency);
    }

    public final int hashCode() {
        String str = this.currency;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACPGetProductsContextDto(currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ACPGetProductsContextDto(String str) {
        this.currency = str;
    }
}
