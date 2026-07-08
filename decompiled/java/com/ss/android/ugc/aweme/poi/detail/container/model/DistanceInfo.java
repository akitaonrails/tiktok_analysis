package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DistanceInfo implements Serializable {

    @C09CT("distance_text")
    public final String distanceText;

    @C09CT("distance_type")
    public final int distanceType;

    public DistanceInfo() {
        this(0, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistanceInfo)) {
            return false;
        }
        DistanceInfo distanceInfo = (DistanceInfo) obj;
        return this.distanceType == distanceInfo.distanceType && Intrinsics.LJFF(this.distanceText, distanceInfo.distanceText);
    }

    public int hashCode() {
        int i = this.distanceType * 31;
        String str = this.distanceText;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistanceInfo(distanceType=");
        sbLIZ.append(this.distanceType);
        sbLIZ.append(", distanceText=");
        sbLIZ.append(this.distanceText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DistanceInfo(int i, String str) {
        this.distanceType = i;
        this.distanceText = str;
    }
}
