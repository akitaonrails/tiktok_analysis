package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C0TE7;
import X.C0TER;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class DualCameraCaptureSizeMessage implements C0TER {

    @C09CT("height")
    public int height;

    @C09CT("width")
    public int width;

    public DualCameraCaptureSizeMessage() {
        this(0, 0);
    }

    @Override // X.C0TER
    public final String getMethodName() {
        return C0TE7.DUAL_CAMERA_CAPTURE_SIZE.getMethod();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("width = ");
        sbLIZ.append(this.width);
        sbLIZ.append(", height = ");
        sbLIZ.append(this.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DualCameraCaptureSizeMessage(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
