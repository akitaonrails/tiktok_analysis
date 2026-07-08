package com.ss.android.ugc.nearby.roaming;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class NearbyRegionListV1Request {

    @C09CT("encrypted_lat")
    public final String encryptedLat;

    @C09CT("encrypted_lng")
    public final String encryptedLng;

    @C09CT("is_gps_drift")
    public final boolean isGpsDrift;

    public NearbyRegionListV1Request(String str, String str2, boolean z) {
        this.encryptedLat = str;
        this.encryptedLng = str2;
        this.isGpsDrift = z;
    }
}
