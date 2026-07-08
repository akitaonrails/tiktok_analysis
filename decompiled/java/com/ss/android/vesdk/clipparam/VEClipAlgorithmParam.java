package com.ss.android.vesdk.clipparam;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes23.dex */
public class VEClipAlgorithmParam {
    public static int BINGO_EFFECT_NULL = 0;
    public static int BINGO_EFFECT_ZOOMIN = 1;
    public static int BINGO_EFFECT_ZOOMOUT = 2;
    public int bingoEffect;
    public int index;
    public int range;
    public int rotate;
    public int trimIn;
    public int trimOut;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index: ");
        sbLIZ.append(this.index);
        sbLIZ.append(", trimIn: ");
        sbLIZ.append(this.trimIn);
        sbLIZ.append(", trimOut: ");
        sbLIZ.append(this.trimOut);
        sbLIZ.append(", range: ");
        sbLIZ.append(this.range);
        sbLIZ.append(", bingoEffect: ");
        sbLIZ.append(this.bingoEffect);
        sbLIZ.append(", rotate: ");
        sbLIZ.append(this.rotate);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
