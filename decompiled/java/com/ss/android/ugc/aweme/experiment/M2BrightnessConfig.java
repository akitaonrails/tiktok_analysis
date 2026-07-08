package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes10.dex */
public final class M2BrightnessConfig {

    @C09CT("area")
    public final int area;

    @C09CT("brightness_mean_skip_threshold")
    public final float brightnessMeanSkipThreshold;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("first_frame")
    public final boolean firstFrame;

    @C09CT("interval")
    public final int interval;

    @C09CT("optimize")
    public final boolean optimize;

    @C09CT("target_contrast")
    public final float targetContrast;

    @C09CT("threshold")
    public final int threshold;

    @C09CT("video_duration_limit")
    public final int videoDurationLimit;

    public M2BrightnessConfig() {
        this(false, 30, false, 50, 30, -1.0f, false, 180.0f, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2BrightnessConfig)) {
            return false;
        }
        M2BrightnessConfig m2BrightnessConfig = (M2BrightnessConfig) obj;
        return this.enable == m2BrightnessConfig.enable && this.area == m2BrightnessConfig.area && this.firstFrame == m2BrightnessConfig.firstFrame && this.interval == m2BrightnessConfig.interval && this.threshold == m2BrightnessConfig.threshold && Float.compare(this.targetContrast, m2BrightnessConfig.targetContrast) == 0 && this.optimize == m2BrightnessConfig.optimize && Float.compare(this.brightnessMeanSkipThreshold, m2BrightnessConfig.brightnessMeanSkipThreshold) == 0 && this.videoDurationLimit == m2BrightnessConfig.videoDurationLimit;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("M2BrightnessConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", area=");
        sbLIZ.append(this.area);
        sbLIZ.append(", firstFrame=");
        sbLIZ.append(this.firstFrame);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(", threshold=");
        sbLIZ.append(this.threshold);
        sbLIZ.append(", targetContrast=");
        sbLIZ.append(this.targetContrast);
        sbLIZ.append(", optimize=");
        sbLIZ.append(this.optimize);
        sbLIZ.append(", brightnessMeanSkipThreshold=");
        sbLIZ.append(this.brightnessMeanSkipThreshold);
        sbLIZ.append(", videoDurationLimit=");
        sbLIZ.append(this.videoDurationLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((((C786410Ut5.Z2(this.enable) * 31) + this.area) * 31) + C786410Ut5.Z2(this.firstFrame)) * 31) + this.interval) * 31) + this.threshold) * 31) + Float.floatToIntBits(this.targetContrast)) * 31) + C786410Ut5.Z2(this.optimize)) * 31) + Float.floatToIntBits(this.brightnessMeanSkipThreshold)) * 31) + this.videoDurationLimit;
    }

    public M2BrightnessConfig(boolean z, int i, boolean z2, int i2, int i3, float f, boolean z3, float f2, int i4) {
        this.enable = z;
        this.area = i;
        this.firstFrame = z2;
        this.interval = i2;
        this.threshold = i3;
        this.targetContrast = f;
        this.optimize = z3;
        this.brightnessMeanSkipThreshold = f2;
        this.videoDurationLimit = i4;
    }
}
