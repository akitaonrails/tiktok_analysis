package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class VariantEligibleDto implements Serializable {

    @C09CT("native_checkout")
    public final Boolean nativeCheckout;

    public VariantEligibleDto() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VariantEligibleDto) && Intrinsics.LJFF(this.nativeCheckout, ((VariantEligibleDto) obj).nativeCheckout);
    }

    public int hashCode() {
        Boolean bool = this.nativeCheckout;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VariantEligibleDto(nativeCheckout=");
        sbLIZ.append(this.nativeCheckout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VariantEligibleDto(Boolean bool) {
        this.nativeCheckout = bool;
    }
}
