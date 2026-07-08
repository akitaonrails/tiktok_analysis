package com.ss.android.ugc.aweme.creative.compileconfig.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes21.dex */
public final class SmartSynthesisUploadSettings {

    @C09CT("delta_vmaf")
    public final double deltaVmaf;

    @C09CT("upload_speed_max")
    public final int maxSpeed;

    @C09CT("upload_speed_min")
    public final int minSpeed;

    public SmartSynthesisUploadSettings() {
        this(-1, -1, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSynthesisUploadSettings)) {
            return false;
        }
        SmartSynthesisUploadSettings smartSynthesisUploadSettings = (SmartSynthesisUploadSettings) obj;
        return this.maxSpeed == smartSynthesisUploadSettings.maxSpeed && this.minSpeed == smartSynthesisUploadSettings.minSpeed && Double.compare(this.deltaVmaf, smartSynthesisUploadSettings.deltaVmaf) == 0;
    }

    public final int hashCode() {
        return (((this.maxSpeed * 31) + this.minSpeed) * 31) + C786410Ut5.X2(this.deltaVmaf);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartSynthesisUploadSettings(maxSpeed=");
        sbLIZ.append(this.maxSpeed);
        sbLIZ.append(", minSpeed=");
        sbLIZ.append(this.minSpeed);
        sbLIZ.append(", deltaVmaf=");
        sbLIZ.append(this.deltaVmaf);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SmartSynthesisUploadSettings(int i, int i2, double d) {
        this.maxSpeed = i;
        this.minSpeed = i2;
        this.deltaVmaf = d;
    }
}
