package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SchoolInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable_school_group")
    public final Boolean enableSchoolGroup;

    @C09CT("graduate_year")
    public final Integer graduateYear;

    @C09CT("school_id")
    public final String schoolId;

    @C09CT("school_name")
    public final String schoolName;

    public SchoolInfo() {
        this(null, null, null, null);
    }

    public SchoolInfo(String str, Integer num, String str2, Boolean bool) {
        this.schoolName = str;
        this.graduateYear = num;
        this.schoolId = str2;
        this.enableSchoolGroup = bool;
    }
}
