package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class UcpOptionDto implements Serializable {

    @C09CT("name")
    public final String name;

    @C09CT("values")
    public final List<UcpOptionValueDto> values;

    public UcpOptionDto() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpOptionDto)) {
            return false;
        }
        UcpOptionDto ucpOptionDto = (UcpOptionDto) obj;
        return Intrinsics.LJFF(this.name, ucpOptionDto.name) && Intrinsics.LJFF(this.values, ucpOptionDto.values);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UcpOptionValueDto> list = this.values;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpOptionDto(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", values=");
        sbLIZ.append(this.values);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpOptionDto(String str, List<UcpOptionValueDto> list) {
        this.name = str;
        this.values = list;
    }
}
