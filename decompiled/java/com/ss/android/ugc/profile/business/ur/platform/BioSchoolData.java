package com.ss.android.ugc.profile.business.ur.platform;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class BioSchoolData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("school_info")
    public SchoolInfo schoolInfo;

    public final SchoolInfo getSchoolInfo() {
        return this.schoolInfo;
    }

    public final void setSchoolInfo(SchoolInfo schoolInfo) {
        this.schoolInfo = schoolInfo;
    }
}
