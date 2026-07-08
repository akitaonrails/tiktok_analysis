package com.ss.android.ttve.vealgorithm.params;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes28.dex */
public class VEBorderDetectResult extends VEAlgorithmResult {
    public int frameHeight;
    public int frameWidth;
    public int x1;
    public int x2;
    public int y1;
    public int y2;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEBorderDetectResult{x1=");
        sbLIZ.append(this.x1);
        sbLIZ.append(", y1=");
        sbLIZ.append(this.y1);
        sbLIZ.append(", x2=");
        sbLIZ.append(this.x2);
        sbLIZ.append(", y2=");
        sbLIZ.append(this.y2);
        sbLIZ.append(", frameWidth=");
        sbLIZ.append(this.frameWidth);
        sbLIZ.append(", frameHeight=");
        sbLIZ.append(this.frameHeight);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEBorderDetectResult(int i, int i2, int i3, int i4, int i5, int i6) {
        this.type = VEAlgorithmType.VE_ALGORITHM_TYPE_BORDER_DETECT;
        this.x1 = i;
        this.y1 = i2;
        this.x2 = i3;
        this.y2 = i4;
        this.frameWidth = i5;
        this.frameHeight = i6;
    }
}
