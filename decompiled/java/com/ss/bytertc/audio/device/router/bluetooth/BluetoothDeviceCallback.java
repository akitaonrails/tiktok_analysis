package com.ss.bytertc.audio.device.router.bluetooth;

/* JADX INFO: loaded from: classes35.dex */
public interface BluetoothDeviceCallback {
    void onBluetoothDeviceChanged(BluetoothDeviceInfo bluetoothDeviceInfo);

    void onBluetoothScoStateChanged(boolean z);
}
