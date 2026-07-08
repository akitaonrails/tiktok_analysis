package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SupplementDiscount implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("scope")
    public final String summary;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    public SupplementDiscount() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupplementDiscount)) {
            return false;
        }
        SupplementDiscount supplementDiscount = (SupplementDiscount) obj;
        return Intrinsics.LJFF(this.code, supplementDiscount.code) && Intrinsics.LJFF(this.summary, supplementDiscount.summary) && Intrinsics.LJFF(this.title, supplementDiscount.title) && Intrinsics.LJFF(this.type, supplementDiscount.type);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.summary;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupplementDiscount(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.summary);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SupplementDiscount(String str, String str2, String str3, Integer num) {
        this.code = str;
        this.summary = str2;
        this.title = str3;
        this.type = num;
    }
}
