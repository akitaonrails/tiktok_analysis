package com.ss.android.ugc.aweme.placediscovery.param;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class MapBounds implements Serializable {

    @C09CT("recommend_max_lat")
    public final String maxLat;

    @C09CT("recommend_max_lng")
    public final String maxLng;

    @C09CT("recommend_min_lat")
    public final String minLat;

    @C09CT("recommend_min_lng")
    public final String minLng;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapBounds)) {
            return false;
        }
        MapBounds mapBounds = (MapBounds) obj;
        return Intrinsics.LJFF(this.maxLng, mapBounds.maxLng) && Intrinsics.LJFF(this.maxLat, mapBounds.maxLat) && Intrinsics.LJFF(this.minLng, mapBounds.minLng) && Intrinsics.LJFF(this.minLat, mapBounds.minLat);
    }

    public int hashCode() {
        return (((((this.maxLng.hashCode() * 31) + this.maxLat.hashCode()) * 31) + this.minLng.hashCode()) * 31) + this.minLat.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapBounds(maxLng=");
        sbLIZ.append(this.maxLng);
        sbLIZ.append(", maxLat=");
        sbLIZ.append(this.maxLat);
        sbLIZ.append(", minLng=");
        sbLIZ.append(this.minLng);
        sbLIZ.append(", minLat=");
        sbLIZ.append(this.minLat);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MapBounds() {
        this("", "", "", "");
    }

    public MapBounds(String str, String str2, String str3, String str4) {
        this.maxLng = str;
        this.maxLat = str2;
        this.minLng = str3;
        this.minLat = str4;
    }
}
