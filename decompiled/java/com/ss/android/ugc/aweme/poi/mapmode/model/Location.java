package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Location implements Serializable {

    @C09CT("lat")
    public final Double lat;

    @C09CT("lng")
    public final Double lng;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return Intrinsics.LJFF(this.lat, location.lat) && Intrinsics.LJFF(this.lng, location.lng);
    }

    public int hashCode() {
        Double d = this.lat;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.lng;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Location(lat=");
        sbLIZ.append(this.lat);
        sbLIZ.append(", lng=");
        sbLIZ.append(this.lng);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Location() {
        Double dValueOf = Double.valueOf(0.0d);
        this(dValueOf, dValueOf);
    }

    public Location(Double d, Double d2) {
        this.lat = d;
        this.lng = d2;
    }
}
