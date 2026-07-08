package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolInfo {

    @C09CT("alias")
    public final String alias;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("school_name")
    public final String schoolName;

    @C09CT("state")
    public final String state;

    public SchoolInfo() {
        this(null, null, null, null);
    }

    public SchoolInfo(String str, String str2, String str3, String str4) {
        this.id = str;
        this.schoolName = str2;
        this.state = str3;
        this.alias = str4;
    }
}
