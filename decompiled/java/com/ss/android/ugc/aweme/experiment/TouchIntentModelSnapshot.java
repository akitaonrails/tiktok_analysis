package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class TouchIntentModelSnapshot {

    @C09CT("click")
    public final TouchIntentClassStats click;

    @C09CT("minVariance")
    public final double minVariance;

    @C09CT("swipe")
    public final TouchIntentClassStats swipe;

    @C09CT("totalCount")
    public final int totalCount;

    @C09CT("varSmoothing")
    public final double varSmoothing;

    @C09CT("version")
    public final int version;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchIntentModelSnapshot)) {
            return false;
        }
        TouchIntentModelSnapshot touchIntentModelSnapshot = (TouchIntentModelSnapshot) obj;
        return Intrinsics.LJFF(this.click, touchIntentModelSnapshot.click) && Intrinsics.LJFF(this.swipe, touchIntentModelSnapshot.swipe) && this.totalCount == touchIntentModelSnapshot.totalCount && Double.compare(this.minVariance, touchIntentModelSnapshot.minVariance) == 0 && Double.compare(this.varSmoothing, touchIntentModelSnapshot.varSmoothing) == 0 && this.version == touchIntentModelSnapshot.version;
    }

    public final int hashCode() {
        return (((((((((this.click.hashCode() * 31) + this.swipe.hashCode()) * 31) + this.totalCount) * 31) + C786410Ut5.X2(this.minVariance)) * 31) + C786410Ut5.X2(this.varSmoothing)) * 31) + this.version;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TouchIntentModelSnapshot(click=");
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

    public TouchIntentModelSnapshot() {
        this(new TouchIntentClassStats(0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d), new TouchIntentClassStats(0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d), 0, 0.0d, 0.0d, 0);
    }

    public final boolean LIZIZ() {
        if (this.version <= 0 || this.totalCount < 0 || !LIZJ(this.click) || !LIZJ(this.swipe)) {
            return false;
        }
        int i = this.totalCount;
        TouchIntentClassStats touchIntentClassStats = this.click;
        int i2 = touchIntentClassStats.count;
        TouchIntentClassStats touchIntentClassStats2 = this.swipe;
        if (i != touchIntentClassStats2.count + i2) {
            return false;
        }
        if (i == 0) {
            if (Math.abs((touchIntentClassStats.prior + touchIntentClassStats2.prior) - 1.0d) >= 1.0E-6d) {
                return false;
            }
        } else {
            if (Math.abs(touchIntentClassStats.prior - (((double) i2) / ((double) i))) >= 1.0E-6d) {
                return false;
            }
            TouchIntentClassStats touchIntentClassStats3 = this.swipe;
            if (Math.abs(touchIntentClassStats3.prior - (((double) touchIntentClassStats3.count) / ((double) this.totalCount))) >= 1.0E-6d) {
                return false;
            }
        }
        return LIZ(this.minVariance) && LIZ(this.varSmoothing) && this.minVariance > 0.0d && this.varSmoothing >= 0.0d;
    }

    public static boolean LIZ(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(TouchIntentClassStats touchIntentClassStats) {
        if (touchIntentClassStats != null && touchIntentClassStats.count > 0 && LIZ(touchIntentClassStats.prior) && LIZ(touchIntentClassStats.meanX) && LIZ(touchIntentClassStats.meanY) && LIZ(touchIntentClassStats.varX) && LIZ(touchIntentClassStats.varY) && touchIntentClassStats.prior >= 0.0d && touchIntentClassStats.varX > 0.0d && touchIntentClassStats.varY > 0.0d) {
            return true;
        }
        return false;
    }

    public TouchIntentModelSnapshot(TouchIntentClassStats touchIntentClassStats, TouchIntentClassStats touchIntentClassStats2, int i, double d, double d2, int i2) {
        this.click = touchIntentClassStats;
        this.swipe = touchIntentClassStats2;
        this.totalCount = i;
        this.minVariance = d;
        this.varSmoothing = d2;
        this.version = i2;
    }
}
