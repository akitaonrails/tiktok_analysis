package com.ss.android.ugc.ur.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class CampusAddCollegeFlowSimplificationData {

    @C09CT("college_copy")
    public final Boolean collegeCopyEnabled;

    @C09CT("enabled")
    public final Boolean enabled;

    public CampusAddCollegeFlowSimplificationData() {
        this(Boolean.FALSE, Boolean.FALSE);
    }

    public CampusAddCollegeFlowSimplificationData(Boolean bool, Boolean bool2) {
        this.enabled = bool;
        this.collegeCopyEnabled = bool2;
    }
}
