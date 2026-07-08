package com.ss.bytertc.audio.device.router.bluetooth;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes27.dex */
public class BluetoothDeviceInfo {
    public final boolean connected;
    public final String deviceName;
    public final int profile;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BluetoothDeviceInfo{profile=");
        sbLIZ.append(this.profile);
        sbLIZ.append(", connected=");
        sbLIZ.append(this.connected);
        sbLIZ.append(", deviceName='");
        sbLIZ.append(this.deviceName);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int getProfile() {
        return this.profile;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public BluetoothDeviceInfo(int i, boolean z, String str) {
        this.profile = i;
        this.connected = z;
        this.deviceName = str == null ? "" : str;
    }
}
