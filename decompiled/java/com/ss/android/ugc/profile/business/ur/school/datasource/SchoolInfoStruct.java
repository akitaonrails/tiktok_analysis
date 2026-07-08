package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import X.EnumC1579340rCW;

/* JADX INFO: loaded from: classes25.dex */
public final class SchoolInfoStruct {

    @C09CT("graduate_year")
    public final Long graduateYear;

    @C09CT("school_id")
    public final String schoolId;

    @C09CT("school_name")
    public final String schoolName;

    @C09CT("verify_status")
    public final Integer verifyStatus;

    public SchoolInfoStruct() {
        this(null, null, null, Integer.valueOf(EnumC1579340rCW.DEFAULT.getValue()));
    }

    public SchoolInfoStruct(String str, String str2, Long l, Integer num) {
        this.schoolId = str;
        this.schoolName = str2;
        this.graduateYear = l;
        this.verifyStatus = num;
    }
}
