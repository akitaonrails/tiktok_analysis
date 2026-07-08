package com.ss.android.ugc.profile.platform.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class CampusExperimentResponse {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("profile_school_name_router_to_edit")
    public final boolean profileSchoolNameRouterToEdit;

    public CampusExperimentResponse() {
        this(false, false);
    }

    public CampusExperimentResponse(boolean z, boolean z2) {
        this.enabled = z;
        this.profileSchoolNameRouterToEdit = z2;
    }
}
