package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SchoolListResponse extends BaseResponse {

    @C09CT("school_info_list")
    public final List<SchoolInfo> schoolInfoList;

    public SchoolListResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchoolListResponse) && Intrinsics.LJFF(this.schoolInfoList, ((SchoolListResponse) obj).schoolInfoList);
    }

    public final int hashCode() {
        List<SchoolInfo> list = this.schoolInfoList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolListResponse(schoolInfoList=");
        sbLIZ.append(this.schoolInfoList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SchoolListResponse(List<SchoolInfo> list) {
        this.schoolInfoList = list;
    }
}
