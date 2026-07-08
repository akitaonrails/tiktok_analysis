package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class LocationControllerSettingsModel {

    @C09CT("click_outside_delayed_mills")
    public final long clickOutsideDelayedMills;

    @C09CT("force_popup_allowed")
    public final boolean forcePopupAllowed;

    public LocationControllerSettingsModel() {
        this(500L, false);
    }

    public LocationControllerSettingsModel(long j, boolean z) {
        this.clickOutsideDelayedMills = j;
        this.forcePopupAllowed = z;
    }
}
