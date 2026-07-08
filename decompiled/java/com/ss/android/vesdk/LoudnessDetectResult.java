package com.ss.android.vesdk;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public class LoudnessDetectResult {
    public double avgLoudness;
    public double peakLoudness;
    public int result;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoudnessDetectResult{result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", avgLoudness=");
        sbLIZ.append(this.avgLoudness);
        sbLIZ.append(", peakLoudness=");
        sbLIZ.append(this.peakLoudness);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
