package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UcpProperties {

    @C09CT("contents")
    public final List<UcpContentItem> contents;

    @C09CT("currency")
    public final String currency;

    @C09CT("value")
    public final String value;

    public UcpProperties() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpProperties)) {
            return false;
        }
        UcpProperties ucpProperties = (UcpProperties) obj;
        return Intrinsics.LJFF(this.value, ucpProperties.value) && Intrinsics.LJFF(this.currency, ucpProperties.currency) && Intrinsics.LJFF(this.contents, ucpProperties.contents);
    }

    public final int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UcpContentItem> list = this.contents;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpProperties(value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", currency=");
        sbLIZ.append(this.currency);
        sbLIZ.append(", contents=");
        sbLIZ.append(this.contents);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpProperties(String str, String str2, List<UcpContentItem> list) {
        this.value = str;
        this.currency = str2;
        this.contents = list;
    }
}
