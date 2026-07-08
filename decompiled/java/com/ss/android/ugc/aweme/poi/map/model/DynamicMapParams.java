package com.ss.android.ugc.aweme.poi.map.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DynamicMapParams implements Serializable {

    @C09CT("default_zoom_level")
    public final Integer defaultZoomLevel;

    @C09CT("enable_dynamic_map")
    public final Boolean enableDynamicMap;

    @C09CT("lat_max")
    public final Double latMax;

    @C09CT("lat_min")
    public final Double latMin;

    @C09CT("lng_max")
    public final Double lngMax;

    @C09CT("lng_min")
    public final Double lngMin;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicMapParams)) {
            return false;
        }
        DynamicMapParams dynamicMapParams = (DynamicMapParams) obj;
        return Intrinsics.LJFF(this.enableDynamicMap, dynamicMapParams.enableDynamicMap) && Intrinsics.LJFF(this.defaultZoomLevel, dynamicMapParams.defaultZoomLevel) && Intrinsics.LJFF(this.latMax, dynamicMapParams.latMax) && Intrinsics.LJFF(this.latMin, dynamicMapParams.latMin) && Intrinsics.LJFF(this.lngMax, dynamicMapParams.lngMax) && Intrinsics.LJFF(this.lngMin, dynamicMapParams.lngMin);
    }

    public int hashCode() {
        Boolean bool = this.enableDynamicMap;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.defaultZoomLevel;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.latMax;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.latMin;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.lngMax;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.lngMin;
        return iHashCode5 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicMapParams(enableDynamicMap=");
        sbLIZ.append(this.enableDynamicMap);
        sbLIZ.append(", defaultZoomLevel=");
        sbLIZ.append(this.defaultZoomLevel);
        sbLIZ.append(", latMax=");
        sbLIZ.append(this.latMax);
        sbLIZ.append(", latMin=");
        sbLIZ.append(this.latMin);
        sbLIZ.append(", lngMax=");
        sbLIZ.append(this.lngMax);
        sbLIZ.append(", lngMin=");
        sbLIZ.append(this.lngMin);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicMapParams(Boolean bool, Integer num, Double d, Double d2, Double d3, Double d4) {
        this.enableDynamicMap = bool;
        this.defaultZoomLevel = num;
        this.latMax = d;
        this.latMin = d2;
        this.lngMax = d3;
        this.lngMin = d4;
    }
}
