package com.ss.android.ugc.aweme.relation.ffp.nearby.bluetooth;

import X.C01GW;
import X.C11NJ;
import X.C2217171Bq7;
import X.C452501pT;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.ConnectNowAssetConfig;
import com.ss.android.ugc.aweme.nearby.INearbyBleGattServer;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes35.dex */
public final class NearbyBleGattServiceImpl implements INearbyBleGattServer {
    public BluetoothGattServer LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(122));
    public final C2217171Bq7 LIZJ = new BluetoothGattServerCallback() { // from class: X.1Bq7
        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
            C11RK c11rk = (C11RK) this.LIZ.LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Conx State Change, status ");
            sbLIZ.append(i);
            sbLIZ.append(", newState ");
            sbLIZ.append(i2);
            c11rk.onNext(C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.bluetooth.BluetoothGattServerCallback
        public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            this.LIZ.getClass();
            byte[] bytes = C0XQ7.LJFF().getCurSecUserId().getBytes(Charsets.UTF_8);
            int length = bytes.length;
            C1691430u7J.LIZ(length, bytes.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bytes, i2, length);
            BluetoothGattServer bluetoothGattServer = this.LIZ.LIZ;
            if (bluetoothGattServer != null) {
                bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, i2, bArrCopyOfRange);
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleGattServer
    public final void LIZIZ() {
        BluetoothGattServer bluetoothGattServer = this.LIZ;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
        }
    }

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleGattServer
    public final C11NJ LIZ(Context context, BluetoothManager bluetoothManager) {
        if (bluetoothManager != null) {
            this.LIZ = bluetoothManager.openGattServer(context, this.LIZJ);
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = new BluetoothGattCharacteristic(UUID.fromString(ConnectNowAssetConfig.LIZ().connectNowUuid.characteristic), 3, 1);
        BluetoothGattServer bluetoothGattServer = this.LIZ;
        if (bluetoothGattServer != null) {
            BluetoothGattService bluetoothGattService = new BluetoothGattService(UUID.fromString(ConnectNowAssetConfig.LIZ().connectNowUuid.service), 0);
            bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
            bluetoothGattServer.addService(bluetoothGattService);
        }
        return new C11NJ();
    }
}
