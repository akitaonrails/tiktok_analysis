package com.ss.android.vesdk.clipparam;

import X.C2188811AlT;
import com.ss.android.vesdk.ROTATE_DEGREE;

/* JADX INFO: loaded from: classes23.dex */
public class VECommonClipParam {
    public String mp4DecryptionKey;
    public String path;
    public int trimIn = -1;
    public int trimOut = -1;
    public double speed = 1.0d;
    public int seqIn = -1;
    public int seqOut = -1;
    public int videoClipRotate = ROTATE_DEGREE.ROTATE_NONE.ordinal();

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VECommonClip{trimIn=");
        sbLIZ.append(this.trimIn);
        sbLIZ.append(", trimOut=");
        sbLIZ.append(this.trimOut);
        sbLIZ.append(", path='");
        sbLIZ.append(this.path);
        sbLIZ.append('\'');
        sbLIZ.append(", mp4DecryptionKey='");
        sbLIZ.append(this.mp4DecryptionKey);
        sbLIZ.append('\'');
        sbLIZ.append(", speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", seqIn=");
        sbLIZ.append(this.seqIn);
        sbLIZ.append(", seqOut=");
        sbLIZ.append(this.seqOut);
        sbLIZ.append(", videoClipRotate=");
        sbLIZ.append(this.videoClipRotate);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
