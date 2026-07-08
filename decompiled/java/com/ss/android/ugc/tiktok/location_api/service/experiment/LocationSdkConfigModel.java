package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class LocationSdkConfigModel {

    @C09CT("enable_local_geocode")
    public final boolean enableLocalGeocode;

    @C09CT("enable_token_check")
    public final boolean enableTokenCheck;

    public LocationSdkConfigModel() {
        this(false, false);
    }

    public LocationSdkConfigModel(boolean z, boolean z2) {
        this.enableLocalGeocode = z;
        this.enableTokenCheck = z2;
    }
}
