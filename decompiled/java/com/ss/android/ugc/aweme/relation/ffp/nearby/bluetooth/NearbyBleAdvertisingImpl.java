package com.ss.android.ugc.aweme.relation.ffp.nearby.bluetooth;

import X.C1697830uHd;
import X.C2217181Bq8;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.os.ParcelUuid;
import com.ss.android.ugc.aweme.experiment.ConnectNowAssetConfig;
import com.ss.android.ugc.aweme.nearby.INearbyBleAdvertiser;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes35.dex */
public final class NearbyBleAdvertisingImpl implements INearbyBleAdvertiser {
    public final ParcelUuid LIZ = ParcelUuid.fromString(ConnectNowAssetConfig.LIZ().connectNowUuid.service);
    public final C2217181Bq8 LIZIZ = new AdvertiseCallback() { // from class: X.1Bq8
        @Override // android.bluetooth.le.AdvertiseCallback
        public final void onStartFailure(int i) {
        }

        @Override // android.bluetooth.le.AdvertiseCallback
        public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        }
    };

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleAdvertiser
    public final void LIZ(BluetoothManager bluetoothManager) {
        BluetoothAdapter adapter;
        BluetoothLeAdvertiser bluetoothLeAdvertiser;
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null && (bluetoothLeAdvertiser = adapter.getBluetoothLeAdvertiser()) != null) {
            bluetoothLeAdvertiser.stopAdvertising(this.LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleAdvertiser
    public final void LIZIZ(BluetoothManager bluetoothManager) {
        BluetoothAdapter adapter;
        BluetoothLeAdvertiser bluetoothLeAdvertiser;
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null && (bluetoothLeAdvertiser = adapter.getBluetoothLeAdvertiser()) != null) {
            C1697830uHd c1697830uHd = C1697830uHd.LIZ;
            String strLJ = C1697830uHd.LIZIZ;
            if (strLJ == null) {
                c1697830uHd.getClass();
                strLJ = C1697830uHd.LJ();
            } else {
                c1697830uHd.getClass();
            }
            bluetoothLeAdvertiser.startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(2).setTxPowerLevel(3).setConnectable(true).build(), new AdvertiseData.Builder().addServiceData(this.LIZ, strLJ.getBytes(Charsets.UTF_8)).setIncludeDeviceName(false).setIncludeTxPowerLevel(false).build(), this.LIZIZ);
        }
    }
}
