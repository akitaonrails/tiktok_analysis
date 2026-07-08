package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VerifyEmailResponse extends BaseResponse {

    @C09CT("affiliation_id")
    public final String affiliationId;

    @C09CT("matched_school_info")
    public final SchoolInfoResponse matchedSchoolInfo;

    @C09CT("school_info")
    public final List<SchoolInfoResponse> schoolInfo;

    public VerifyEmailResponse() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyEmailResponse)) {
            return false;
        }
        VerifyEmailResponse verifyEmailResponse = (VerifyEmailResponse) obj;
        return Intrinsics.LJFF(this.schoolInfo, verifyEmailResponse.schoolInfo) && Intrinsics.LJFF(this.affiliationId, verifyEmailResponse.affiliationId) && Intrinsics.LJFF(this.matchedSchoolInfo, verifyEmailResponse.matchedSchoolInfo);
    }

    public final int hashCode() {
        List<SchoolInfoResponse> list = this.schoolInfo;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.affiliationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SchoolInfoResponse schoolInfoResponse = this.matchedSchoolInfo;
        return iHashCode2 + (schoolInfoResponse != null ? schoolInfoResponse.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerifyEmailResponse(schoolInfo=");
        sbLIZ.append(this.schoolInfo);
        sbLIZ.append(", affiliationId=");
        sbLIZ.append(this.affiliationId);
        sbLIZ.append(", matchedSchoolInfo=");
        sbLIZ.append(this.matchedSchoolInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VerifyEmailResponse(List<SchoolInfoResponse> list, String str, SchoolInfoResponse schoolInfoResponse) {
        this.schoolInfo = list;
        this.affiliationId = str;
        this.matchedSchoolInfo = schoolInfoResponse;
    }
}
