package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SchoolInfo implements Serializable {

    @C09CT("graduate_year")
    public final Integer graduateYear;

    @C09CT("is_verified")
    public final String isVerified;

    @C09CT("school_id")
    public final String schoolId;

    @C09CT("school_name")
    public final String schoolName;

    public SchoolInfo() {
        this(null, null, null, null);
    }

    public final String isVerified() {
        return this.isVerified;
    }

    public SchoolInfo(String str, Integer num, String str2, String str3) {
        this.schoolName = str;
        this.graduateYear = num;
        this.schoolId = str2;
        this.isVerified = str3;
    }
}
