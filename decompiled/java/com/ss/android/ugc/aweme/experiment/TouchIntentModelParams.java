package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TouchIntentModelParams {

    @C09CT("click")
    public final TouchIntentClassStatsParams click;

    @C09CT("minVariance")
    public final Double minVariance;

    @C09CT("swipe")
    public final TouchIntentClassStatsParams swipe;

    @C09CT("totalCount")
    public final int totalCount;

    @C09CT("varSmoothing")
    public final Double varSmoothing;

    @C09CT("version")
    public final Integer version;

    public TouchIntentModelParams() {
        this(null, null, 0, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchIntentModelParams)) {
            return false;
        }
        TouchIntentModelParams touchIntentModelParams = (TouchIntentModelParams) obj;
        return Intrinsics.LJFF(this.click, touchIntentModelParams.click) && Intrinsics.LJFF(this.swipe, touchIntentModelParams.swipe) && this.totalCount == touchIntentModelParams.totalCount && Intrinsics.LJFF(this.minVariance, touchIntentModelParams.minVariance) && Intrinsics.LJFF(this.varSmoothing, touchIntentModelParams.varSmoothing) && Intrinsics.LJFF(this.version, touchIntentModelParams.version);
    }

    public final int hashCode() {
        TouchIntentClassStatsParams touchIntentClassStatsParams = this.click;
        int iHashCode = (touchIntentClassStatsParams == null ? 0 : touchIntentClassStatsParams.hashCode()) * 31;
        TouchIntentClassStatsParams touchIntentClassStatsParams2 = this.swipe;
        int iHashCode2 = (((iHashCode + (touchIntentClassStatsParams2 == null ? 0 : touchIntentClassStatsParams2.hashCode())) * 31) + this.totalCount) * 31;
        Double d = this.minVariance;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.varSmoothing;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.version;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TouchIntentModelParams(click=");
        sbLIZ.append(this.click);
        sbLIZ.append(", swipe=");
        sbLIZ.append(this.swipe);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", minVariance=");
        sbLIZ.append(this.minVariance);
        sbLIZ.append(", varSmoothing=");
        sbLIZ.append(this.varSmoothing);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TouchIntentModelParams(TouchIntentClassStatsParams touchIntentClassStatsParams, TouchIntentClassStatsParams touchIntentClassStatsParams2, int i, Double d, Double d2, Integer num) {
        this.click = touchIntentClassStatsParams;
        this.swipe = touchIntentClassStatsParams2;
        this.totalCount = i;
        this.minVariance = d;
        this.varSmoothing = d2;
        this.version = num;
    }
}
