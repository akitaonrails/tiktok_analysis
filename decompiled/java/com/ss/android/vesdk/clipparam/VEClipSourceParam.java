package com.ss.android.vesdk.clipparam;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public class VEClipSourceParam {
    public int clipColorValue;
    public int clipHeight;
    public int clipRefIndex;
    public int clipWidth;
    public int sourceType;
    public String clipFilePath = "";
    public String clipSegmentId = "";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEClipSourceParam{sourceType=");
        sbLIZ.append(this.sourceType);
        sbLIZ.append(", clipFilePath='");
        sbLIZ.append(this.clipFilePath);
        sbLIZ.append('\'');
        sbLIZ.append(", clipSegmentId='");
        sbLIZ.append(this.clipSegmentId);
        sbLIZ.append('\'');
        sbLIZ.append(", clipRefIndex=");
        sbLIZ.append(this.clipRefIndex);
        sbLIZ.append(", clipColorValue=");
        sbLIZ.append(this.clipColorValue);
        sbLIZ.append(", clipWidth=");
        sbLIZ.append(this.clipWidth);
        sbLIZ.append(", clipHeight=");
        sbLIZ.append(this.clipHeight);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
