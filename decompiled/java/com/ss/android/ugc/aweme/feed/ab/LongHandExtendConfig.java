package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes32.dex */
public final class LongHandExtendConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("extend_width")
    public final int extendWidth;

    @C09CT("normal_x_max")
    public final int normalXMax;

    @C09CT("normal_x_min")
    public final int normalXMin;

    @C09CT("normal_y_max")
    public final int normalYMax;

    @C09CT("normal_y_min")
    public final int normalYMin;

    @C09CT("small_x_max")
    public final int smallXMax;

    @C09CT("small_x_min")
    public final int smallXMin;

    @C09CT("small_y_max")
    public final int smallYMax;

    @C09CT("small_y_min")
    public final int smallYMin;

    @C09CT("window_size")
    public final int windowSize;

    public LongHandExtendConfig() {
        this(false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongHandExtendConfig)) {
            return false;
        }
        LongHandExtendConfig longHandExtendConfig = (LongHandExtendConfig) obj;
        return this.enable == longHandExtendConfig.enable && this.extendWidth == longHandExtendConfig.extendWidth && this.smallXMin == longHandExtendConfig.smallXMin && this.smallXMax == longHandExtendConfig.smallXMax && this.smallYMin == longHandExtendConfig.smallYMin && this.smallYMax == longHandExtendConfig.smallYMax && this.normalXMin == longHandExtendConfig.normalXMin && this.normalXMax == longHandExtendConfig.normalXMax && this.normalYMin == longHandExtendConfig.normalYMin && this.normalYMax == longHandExtendConfig.normalYMax && this.windowSize == longHandExtendConfig.windowSize;
    }

    public final int hashCode() {
        return (((((((((((((((((((C786410Ut5.Z2(this.enable) * 31) + this.extendWidth) * 31) + this.smallXMin) * 31) + this.smallXMax) * 31) + this.smallYMin) * 31) + this.smallYMax) * 31) + this.normalXMin) * 31) + this.normalXMax) * 31) + this.normalYMin) * 31) + this.normalYMax) * 31) + this.windowSize;
    }

    public final String toString() {
        return "LongHandExtendConfig(enable=" + this.enable + ", extendWidth=" + this.extendWidth + ", smallXMin=" + this.smallXMin + ", smallXMax=" + this.smallXMax + ", smallYMin=" + this.smallYMin + ", smallYMax=" + this.smallYMax + ", normalXMin=" + this.normalXMin + ", normalXMax=" + this.normalXMax + ", normalYMin=" + this.normalYMin + ", normalYMax=" + this.normalYMax + ", windowSize=" + this.windowSize + ')';
    }

    public LongHandExtendConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.enable = z;
        this.extendWidth = i;
        this.smallXMin = i2;
        this.smallXMax = i3;
        this.smallYMin = i4;
        this.smallYMax = i5;
        this.normalXMin = i6;
        this.normalXMax = i7;
        this.normalYMin = i8;
        this.normalYMax = i9;
        this.windowSize = i10;
    }
}
