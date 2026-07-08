package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationMRowPreciseExperimentModel {

    @C09CT("enable_consent")
    public final boolean enableConsent;

    @C09CT("max_accuracy_level")
    public final int maxAccuracyLevel;

    public LocationMRowPreciseExperimentModel() {
        this(2, false);
    }

    public LocationMRowPreciseExperimentModel(int i, boolean z) {
        this.maxAccuracyLevel = i;
        this.enableConsent = z;
    }
}
