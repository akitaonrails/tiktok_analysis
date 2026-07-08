package com.ss.android.ugc.aweme.poi_api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLocation implements Serializable {

    @C09CT("geohash")
    public final String geohash;

    @C09CT("lat")
    public final Double lat;

    @C09CT("lng")
    public final Double lng;

    public PoiLocation() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiLocation)) {
            return false;
        }
        PoiLocation poiLocation = (PoiLocation) obj;
        return Intrinsics.LJFF(this.lat, poiLocation.lat) && Intrinsics.LJFF(this.lng, poiLocation.lng) && Intrinsics.LJFF(this.geohash, poiLocation.geohash);
    }

    public int hashCode() {
        Double d = this.lat;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.lng;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.geohash;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiLocation(lat=");
        sbLIZ.append(this.lat);
        sbLIZ.append(", lng=");
        sbLIZ.append(this.lng);
        sbLIZ.append(", geohash=");
        sbLIZ.append(this.geohash);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiLocation(Double d, Double d2, String str) {
        this.lat = d;
        this.lng = d2;
        this.geohash = str;
    }
}
