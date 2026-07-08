package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes5.dex */
public final class SchoolInfoResponse {

    @C09CT("enable_school_group")
    public final Boolean enableSchoolGroup;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("school_name")
    public final String schoolName;

    public SchoolInfoResponse() {
        this(null, null, null);
    }

    public SchoolInfoResponse(String str, String str2, Boolean bool) {
        this.id = str;
        this.schoolName = str2;
        this.enableSchoolGroup = bool;
    }
}
