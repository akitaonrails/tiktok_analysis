package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GetDraftDetailResponse {

    @C09CT("data")
    public final DraftDetailData data;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public GetDraftDetailResponse() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDraftDetailResponse)) {
            return false;
        }
        GetDraftDetailResponse getDraftDetailResponse = (GetDraftDetailResponse) obj;
        return Intrinsics.LJFF(this.data, getDraftDetailResponse.data) && Intrinsics.LJFF(this.statusCode, getDraftDetailResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, getDraftDetailResponse.statusMsg);
    }

    public int hashCode() {
        DraftDetailData draftDetailData = this.data;
        int iHashCode = (draftDetailData == null ? 0 : draftDetailData.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.statusMsg;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetDraftDetailResponse(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetDraftDetailResponse(DraftDetailData draftDetailData, Integer num, String str) {
        this.data = draftDetailData;
        this.statusCode = num;
        this.statusMsg = str;
    }
}
