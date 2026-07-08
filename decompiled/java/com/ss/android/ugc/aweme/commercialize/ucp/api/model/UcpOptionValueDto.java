package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpOptionValueDto implements Serializable {

    @C09CT("available")
    public final Boolean available;

    @C09CT("exists")
    public final Boolean exists;

    @C09CT("image")
    public final String image;

    @C09CT("label")
    public final String label;

    public UcpOptionValueDto() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpOptionValueDto)) {
            return false;
        }
        UcpOptionValueDto ucpOptionValueDto = (UcpOptionValueDto) obj;
        return Intrinsics.LJFF(this.label, ucpOptionValueDto.label) && Intrinsics.LJFF(this.available, ucpOptionValueDto.available) && Intrinsics.LJFF(this.exists, ucpOptionValueDto.exists) && Intrinsics.LJFF(this.image, ucpOptionValueDto.image);
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.available;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.exists;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.image;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpOptionValueDto(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(", available=");
        sbLIZ.append(this.available);
        sbLIZ.append(", exists=");
        sbLIZ.append(this.exists);
        sbLIZ.append(", image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpOptionValueDto(String str, Boolean bool, Boolean bool2, String str2) {
        this.label = str;
        this.available = bool;
        this.exists = bool2;
        this.image = str2;
    }
}
