package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class RecommendDiscountDto implements Serializable {

    @C09CT("code")
    public final String code;

    @C09CT("scope")
    public final String scope;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendDiscountDto)) {
            return false;
        }
        RecommendDiscountDto recommendDiscountDto = (RecommendDiscountDto) obj;
        return Intrinsics.LJFF(this.code, recommendDiscountDto.code) && Intrinsics.LJFF(this.scope, recommendDiscountDto.scope) && Intrinsics.LJFF(this.title, recommendDiscountDto.title) && Intrinsics.LJFF(this.type, recommendDiscountDto.type);
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.scope;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendDiscountDto(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", scope=");
        sbLIZ.append(this.scope);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendDiscountDto(String str, String str2, String str3, Integer num) {
        this.code = str;
        this.scope = str2;
        this.title = str3;
        this.type = num;
    }
}
