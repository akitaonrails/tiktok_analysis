package com.ss.bytertc.engine.device;

import X.C2188811AlT;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes.dex */
public class MediaDeviceInfo {
    public DeviceError error;
    public String message;
    public DeviceState state;
    public DeviceType type;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(", error=");
        sbLIZ.append(this.error);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.message);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MediaDeviceInfo(DeviceType deviceType, DeviceState deviceState, DeviceError deviceError, String str) {
        this.type = deviceType;
        this.state = deviceState;
        this.error = deviceError;
        this.message = str;
    }
}
