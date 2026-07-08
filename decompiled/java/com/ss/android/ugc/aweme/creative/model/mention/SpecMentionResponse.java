package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SpecMentionResponse {

    @C09CT("data")
    public final SpecMentionData data;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public SpecMentionResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecMentionResponse)) {
            return false;
        }
        SpecMentionResponse specMentionResponse = (SpecMentionResponse) obj;
        return Intrinsics.LJFF(this.statusCode, specMentionResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, specMentionResponse.statusMsg) && Intrinsics.LJFF(this.data, specMentionResponse.data);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SpecMentionData specMentionData = this.data;
        return iHashCode2 + (specMentionData != null ? specMentionData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpecMentionResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SpecMentionResponse(Integer num, String str, SpecMentionData specMentionData) {
        this.statusCode = num;
        this.statusMsg = str;
        this.data = specMentionData;
    }
}
