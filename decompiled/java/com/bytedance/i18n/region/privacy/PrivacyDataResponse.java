package com.bytedance.i18n.region.privacy;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PrivacyDataResponse {

    @C09CT("code")
    public final Integer code;

    @C09CT("message")
    public final String message;

    @C09CT("results")
    public final List<PrivacyDataResult> results;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyDataResponse)) {
            return false;
        }
        PrivacyDataResponse privacyDataResponse = (PrivacyDataResponse) obj;
        return Intrinsics.LJFF(this.code, privacyDataResponse.code) && Intrinsics.LJFF(this.message, privacyDataResponse.message) && Intrinsics.LJFF(this.results, privacyDataResponse.results);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PrivacyDataResult> list = this.results;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataResponse(code=");
        sbLIZ.append(this.code);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", results=");
        sbLIZ.append(this.results);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PrivacyDataResponse(Integer num, String str, List<PrivacyDataResult> list) {
        this.code = num;
        this.message = str;
        this.results = list;
    }
}
