package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes35.dex */
public final class TouchIntentClassStats {

    @C09CT("count")
    public final int count;

    @C09CT("meanX")
    public final double meanX;

    @C09CT("meanY")
    public final double meanY;

    @C09CT("prior")
    public final double prior;

    @C09CT("varX")
    public final double varX;

    @C09CT("varY")
    public final double varY;

    public TouchIntentClassStats() {
        this(0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchIntentClassStats)) {
            return false;
        }
        TouchIntentClassStats touchIntentClassStats = (TouchIntentClassStats) obj;
        return this.count == touchIntentClassStats.count && Double.compare(this.prior, touchIntentClassStats.prior) == 0 && Double.compare(this.meanX, touchIntentClassStats.meanX) == 0 && Double.compare(this.meanY, touchIntentClassStats.meanY) == 0 && Double.compare(this.varX, touchIntentClassStats.varX) == 0 && Double.compare(this.varY, touchIntentClassStats.varY) == 0;
    }

    public final int hashCode() {
        return (((((((((this.count * 31) + C786410Ut5.X2(this.prior)) * 31) + C786410Ut5.X2(this.meanX)) * 31) + C786410Ut5.X2(this.meanY)) * 31) + C786410Ut5.X2(this.varX)) * 31) + C786410Ut5.X2(this.varY);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TouchIntentClassStats(count=");
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

    public TouchIntentClassStats(int i, double d, double d2, double d3, double d4, double d5) {
        this.count = i;
        this.prior = d;
        this.meanX = d2;
        this.meanY = d3;
        this.varX = d4;
        this.varY = d5;
    }

    public static TouchIntentClassStats LIZ(TouchIntentClassStats touchIntentClassStats, int i, double d, double d2, double d3, double d4, double d5, int i2) {
        double d6 = d5;
        double d7 = d4;
        double d8 = d2;
        double d9 = d;
        double d10 = d3;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = touchIntentClassStats.count;
        }
        if ((i2 & 2) != 0) {
            d9 = touchIntentClassStats.prior;
        }
        if ((i2 & 4) != 0) {
            d8 = touchIntentClassStats.meanX;
        }
        if ((i2 & 8) != 0) {
            d10 = touchIntentClassStats.meanY;
        }
        if ((i2 & 16) != 0) {
            d7 = touchIntentClassStats.varX;
        }
        if ((i2 & 32) != 0) {
            d6 = touchIntentClassStats.varY;
        }
        touchIntentClassStats.getClass();
        return new TouchIntentClassStats(i3, d9, d8, d10, d7, d6);
    }
}
