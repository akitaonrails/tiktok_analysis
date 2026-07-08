package com.ss.android.ugc.ur.school.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class UserSchoolInfoResponse extends BaseResponse {

    @C09CT("enable_school_group")
    public final Boolean enableSchoolGroup;

    @C09CT("graduate_year")
    public final Integer graduateYear;

    @C09CT("is_verified")
    public final Boolean isVerified;

    @C09CT("member_count")
    public final Long memberCount;

    @C09CT("school_id")
    public final String schoolId;

    @C09CT("school_name")
    public final String schoolName;

    public UserSchoolInfoResponse() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSchoolInfoResponse)) {
            return false;
        }
        UserSchoolInfoResponse userSchoolInfoResponse = (UserSchoolInfoResponse) obj;
        return Intrinsics.LJFF(this.schoolName, userSchoolInfoResponse.schoolName) && Intrinsics.LJFF(this.schoolId, userSchoolInfoResponse.schoolId) && Intrinsics.LJFF(this.graduateYear, userSchoolInfoResponse.graduateYear) && Intrinsics.LJFF(this.isVerified, userSchoolInfoResponse.isVerified) && Intrinsics.LJFF(this.enableSchoolGroup, userSchoolInfoResponse.enableSchoolGroup) && Intrinsics.LJFF(this.memberCount, userSchoolInfoResponse.memberCount);
    }

    public final int hashCode() {
        String str = this.schoolName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schoolId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.graduateYear;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isVerified;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enableSchoolGroup;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.memberCount;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserSchoolInfoResponse(schoolName=");
        sbLIZ.append(this.schoolName);
        sbLIZ.append(", schoolId=");
        sbLIZ.append(this.schoolId);
        sbLIZ.append(", graduateYear=");
        sbLIZ.append(this.graduateYear);
        sbLIZ.append(", isVerified=");
        sbLIZ.append(this.isVerified);
        sbLIZ.append(", enableSchoolGroup=");
        sbLIZ.append(this.enableSchoolGroup);
        sbLIZ.append(", memberCount=");
        sbLIZ.append(this.memberCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserSchoolInfoResponse(String str, String str2, Integer num, Boolean bool, Boolean bool2, Long l) {
        this.schoolName = str;
        this.schoolId = str2;
        this.graduateYear = num;
        this.isVerified = bool;
        this.enableSchoolGroup = bool2;
        this.memberCount = l;
    }
}
