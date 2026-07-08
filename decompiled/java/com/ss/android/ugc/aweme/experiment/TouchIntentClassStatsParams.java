package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TouchIntentClassStatsParams {

    @C09CT("count")
    public final int count;

    @C09CT("meanX")
    public final Double meanX;

    @C09CT("meanY")
    public final Double meanY;

    @C09CT("prior")
    public final Double prior;

    @C09CT("varX")
    public final Double varX;

    @C09CT("varY")
    public final Double varY;

    public TouchIntentClassStatsParams() {
        this(0, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchIntentClassStatsParams)) {
            return false;
        }
        TouchIntentClassStatsParams touchIntentClassStatsParams = (TouchIntentClassStatsParams) obj;
        return this.count == touchIntentClassStatsParams.count && Intrinsics.LJFF(this.prior, touchIntentClassStatsParams.prior) && Intrinsics.LJFF(this.meanX, touchIntentClassStatsParams.meanX) && Intrinsics.LJFF(this.meanY, touchIntentClassStatsParams.meanY) && Intrinsics.LJFF(this.varX, touchIntentClassStatsParams.varX) && Intrinsics.LJFF(this.varY, touchIntentClassStatsParams.varY);
    }

    public final int hashCode() {
        int i = this.count * 31;
        Double d = this.prior;
        int iHashCode = (i + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.meanX;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.meanY;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.varX;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.varY;
        return iHashCode4 + (d5 != null ? d5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TouchIntentClassStatsParams(count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", prior=");
        sbLIZ.append(this.prior);
        sbLIZ.append(", meanX=");
        sbLIZ.append(this.meanX);
        sbLIZ.append(", meanY=");
        sbLIZ.append(this.meanY);
        sbLIZ.append(", varX=");
        sbLIZ.append(this.varX);
        sbLIZ.append(", varY=");
        sbLIZ.append(this.varY);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZ(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return true;
        }
        return false;
    }

    public TouchIntentClassStatsParams(int i, Double d, Double d2, Double d3, Double d4, Double d5) {
        this.count = i;
        this.prior = d;
        this.meanX = d2;
        this.meanY = d3;
        this.varX = d4;
        this.varY = d5;
    }
}
