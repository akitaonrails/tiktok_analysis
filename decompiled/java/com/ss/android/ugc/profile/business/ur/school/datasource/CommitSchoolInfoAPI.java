package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.C1005410cGp;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface CommitSchoolInfoAPI {
    public static final C1005410cGp LIZ = C1005410cGp.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/commit/user/")
    Object updateSchoolInfo(@InterfaceC1501050pAF("commit_school_info") String str, InterfaceC1364105Vn<BaseResponse> interfaceC1364105Vn);

    public static final class CommitSchoolInfo {

        @C09CT("action_type")
        public final Integer actionType;

        @C09CT("affiliation_id")
        public final String affiliationId;

        @C09CT("code")
        public final String code;

        @C09CT("graduate_year")
        public final Integer graduateYear;

        @C09CT("school_id")
        public final String schoolId;

        public CommitSchoolInfo(Integer num, String str, Integer num2, String str2, String str3) {
            this.actionType = num;
            this.schoolId = str;
            this.graduateYear = num2;
            this.code = str2;
            this.affiliationId = str3;
        }
    }
}
