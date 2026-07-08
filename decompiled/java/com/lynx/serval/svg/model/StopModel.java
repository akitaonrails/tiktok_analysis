package com.lynx.serval.svg.model;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public class StopModel {
    public long mColor;
    public float mOffset;
    public float mStopOpacity;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StopModel{mOffset=");
        sbLIZ.append(this.mOffset);
        sbLIZ.append(", mColor=");
        sbLIZ.append(this.mColor);
        sbLIZ.append(", mStopOpacity=");
        sbLIZ.append(this.mStopOpacity);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StopModel(float f, long j, float f2) {
        this.mOffset = f;
        this.mColor = j;
        this.mStopOpacity = f2;
    }
}
