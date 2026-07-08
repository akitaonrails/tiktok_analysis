package com.ss.android.ugc.nearby.roaming;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyRegionSearchV1Request {

    @C09CT("query")
    public final String query;

    @C09CT("region_code")
    public final String regionCode;

    public NearbyRegionSearchV1Request() {
        this(null, null);
    }

    public NearbyRegionSearchV1Request(String str, String str2) {
        this.regionCode = str;
        this.query = str2;
    }
}
