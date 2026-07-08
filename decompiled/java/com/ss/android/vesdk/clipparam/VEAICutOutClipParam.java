package com.ss.android.vesdk.clipparam;

import X.C2188811AlT;
import X.InterfaceC20188013yw;

/* JADX INFO: loaded from: classes.dex */
public class VEAICutOutClipParam {
    public InterfaceC20188013yw listener;
    public int trimIn;
    public int trimOut;
    public String mWorkSpace = "";
    public String mModelPath = "";
    public int archerStrategy = -1;
    public String originPicForMask = "";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAICutOutClipParam{trimIn=");
        sbLIZ.append(this.trimIn);
        sbLIZ.append(", maskPath='");
        sbLIZ.append(this.mWorkSpace);
        sbLIZ.append('\'');
        sbLIZ.append(", mModelPath='");
        sbLIZ.append(this.mModelPath);
        sbLIZ.append('\'');
        sbLIZ.append(", trimOut='");
        sbLIZ.append(this.trimOut);
        sbLIZ.append('\'');
        sbLIZ.append(", archerStrategy='");
        sbLIZ.append(this.archerStrategy);
        sbLIZ.append('\'');
        sbLIZ.append(", originPicForMask='");
        sbLIZ.append(this.originPicForMask);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
