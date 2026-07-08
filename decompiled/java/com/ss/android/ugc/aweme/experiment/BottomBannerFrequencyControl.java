package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class BottomBannerFrequencyControl {

    @C09CT("click")
    public final int click;

    @C09CT("n_day")
    public final int nDay;

    @C09CT("x_times")
    public final int xTimes;

    @C09CT("y_day")
    public final int yDay;

    @C09CT("z_cycle")
    public final int zCycle;

    public BottomBannerFrequencyControl() {
        this(3, 5, 5, 5, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomBannerFrequencyControl)) {
            return false;
        }
        BottomBannerFrequencyControl bottomBannerFrequencyControl = (BottomBannerFrequencyControl) obj;
        return this.nDay == bottomBannerFrequencyControl.nDay && this.xTimes == bottomBannerFrequencyControl.xTimes && this.yDay == bottomBannerFrequencyControl.yDay && this.zCycle == bottomBannerFrequencyControl.zCycle && this.click == bottomBannerFrequencyControl.click;
    }

    public int hashCode() {
        return (((((((this.nDay * 31) + this.xTimes) * 31) + this.yDay) * 31) + this.zCycle) * 31) + this.click;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBannerFrequencyControl(nDay=");
        sbLIZ.append(this.nDay);
        sbLIZ.append(", xTimes=");
        sbLIZ.append(this.xTimes);
        sbLIZ.append(", yDay=");
        sbLIZ.append(this.yDay);
        sbLIZ.append(", zCycle=");
        sbLIZ.append(this.zCycle);
        sbLIZ.append(", click=");
        sbLIZ.append(this.click);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BottomBannerFrequencyControl(int i, int i2, int i3, int i4, int i5) {
        this.nDay = i;
        this.xTimes = i2;
        this.yDay = i3;
        this.zCycle = i4;
        this.click = i5;
    }
}
