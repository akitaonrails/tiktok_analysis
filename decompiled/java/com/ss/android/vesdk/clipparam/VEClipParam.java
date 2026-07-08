package com.ss.android.vesdk.clipparam;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class VEClipParam {
    public int clipIndex;
    public int clipRotate;
    public int clipType;
    public String path;
    public int seqIn;
    public int seqOut;
    public double speed;
    public int trimIn;
    public int trimOut;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEClipParam: clipType=");
        sbLIZ.append(this.clipType);
        sbLIZ.append("path=");
        sbLIZ.append(this.path);
        sbLIZ.append(" trimIn=");
        sbLIZ.append(this.trimIn);
        sbLIZ.append(" trimOut:=");
        sbLIZ.append(this.trimOut);
        sbLIZ.append(" speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(" clipRotate=");
        sbLIZ.append(this.clipRotate);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
