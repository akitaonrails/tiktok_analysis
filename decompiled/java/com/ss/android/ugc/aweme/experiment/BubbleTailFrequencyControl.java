package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class BubbleTailFrequencyControl {

    @C09CT("n_day")
    public final int nDay;

    @C09CT("x_count")
    public final int xCount;

    public BubbleTailFrequencyControl() {
        this(5, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BubbleTailFrequencyControl)) {
            return false;
        }
        BubbleTailFrequencyControl bubbleTailFrequencyControl = (BubbleTailFrequencyControl) obj;
        return this.xCount == bubbleTailFrequencyControl.xCount && this.nDay == bubbleTailFrequencyControl.nDay;
    }

    public int hashCode() {
        return (this.xCount * 31) + this.nDay;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleTailFrequencyControl(xCount=");
        sbLIZ.append(this.xCount);
        sbLIZ.append(", nDay=");
        sbLIZ.append(this.nDay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BubbleTailFrequencyControl(int i, int i2) {
        this.xCount = i;
        this.nDay = i2;
    }
}
