package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationControlExperimentModel {

    @C09CT("enable_refine")
    public final boolean useNewPlatform;

    @C09CT("use_new_request_permissions")
    public final boolean useNewRequestPermissions;

    public LocationControlExperimentModel() {
        this(true, false);
    }

    public LocationControlExperimentModel(boolean z, boolean z2) {
        this.useNewPlatform = z;
        this.useNewRequestPermissions = z2;
    }
}
