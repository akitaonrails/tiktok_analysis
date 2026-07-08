package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VariantOptionDto implements Serializable {

    @C09CT("label")
    public final String label;

    @C09CT("name")
    public final String name;

    public VariantOptionDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariantOptionDto)) {
            return false;
        }
        VariantOptionDto variantOptionDto = (VariantOptionDto) obj;
        return Intrinsics.LJFF(this.name, variantOptionDto.name) && Intrinsics.LJFF(this.label, variantOptionDto.label);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VariantOptionDto(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", label=");
        sbLIZ.append(this.label);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VariantOptionDto(String str, String str2) {
        this.name = str;
        this.label = str2;
    }
}
