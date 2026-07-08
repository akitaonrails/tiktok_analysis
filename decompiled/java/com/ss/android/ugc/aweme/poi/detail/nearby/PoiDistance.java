package com.ss.android.ugc.aweme.poi.detail.nearby;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class PoiDistance implements Serializable {

    @C09CT("distance_in_meter")
    public final int distanceInMeter;

    @C09CT("distance_show_text")
    public final String distanceShowText;

    public PoiDistance() {
        this(0, null);
    }

    public int hashCode() {
        int i = this.distanceInMeter * 31;
        String str = this.distanceShowText;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDistance(distanceInMeter=");
        sbLIZ.append(this.distanceInMeter);
        sbLIZ.append(", distanceShowText=");
        sbLIZ.append(this.distanceShowText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PoiDistance(int i, String str) {
        this.distanceInMeter = i;
        this.distanceShowText = str;
    }
}
