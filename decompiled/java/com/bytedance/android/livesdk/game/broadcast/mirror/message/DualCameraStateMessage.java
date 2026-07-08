package com.bytedance.android.livesdk.game.broadcast.mirror.message;

import X.C09CT;
import X.C0TE7;
import X.C0TER;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class DualCameraStateMessage implements C0TER {

    @C09CT("camera_state")
    public int cameraState;

    public DualCameraStateMessage() {
        this(-1);
    }

    @Override // X.C0TER
    public final String getMethodName() {
        return C0TE7.DUAL_CAMERA_STATE.getMethod();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameraState = ");
        sbLIZ.append(this.cameraState);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DualCameraStateMessage(int i) {
        this.cameraState = i;
    }
}
