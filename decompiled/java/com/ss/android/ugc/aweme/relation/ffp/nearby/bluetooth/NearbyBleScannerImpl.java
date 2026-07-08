package com.ss.android.ugc.aweme.relation.ffp.nearby.bluetooth;

import X.C11RK;
import X.C13BV;
import X.C1689710u4X;
import X.C1910890zpH;
import X.C19475711Hn;
import X.C2217161Bq6;
import X.EnumC1910860zpE;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import com.ss.android.ugc.aweme.experiment.ConnectNowAssetConfig;
import com.ss.android.ugc.aweme.nearby.INearbyBleScanner;
import com.ss.android.ugc.aweme.relation.ffp.nearby.bluetooth.NearbyBleScannerImpl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes35.dex */
public final class NearbyBleScannerImpl implements INearbyBleScanner {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final ParcelUuid LIZIZ = ParcelUuid.fromString(ConnectNowAssetConfig.LIZ().connectNowUuid.service);
    public final Regex LIZJ = new Regex("^[A-Z]{6}$");
    public final C2217161Bq6 LIZLLL = new ScanCallback() { // from class: X.1Bq6
        @Override // android.bluetooth.le.ScanCallback
        public final void onScanFailed(int i) {
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanResult(int i, ScanResult scanResult) {
            boolean zContainsKey;
            String deviceName;
            BluetoothDevice device;
            String deviceName2;
            Map<ParcelUuid, byte[]> serviceData;
            byte[] bArr;
            ScanRecord scanRecord;
            ScanRecord scanRecord2;
            Map<ParcelUuid, byte[]> serviceData2;
            if (scanResult != null && (scanRecord2 = scanResult.getScanRecord()) != null && (serviceData2 = scanRecord2.getServiceData()) != null) {
                zContainsKey = serviceData2.containsKey(this.LIZ.LIZIZ);
            } else {
                zContainsKey = false;
            }
            String str = "";
            if (scanResult == null || (scanRecord = scanResult.getScanRecord()) == null || (deviceName = scanRecord.getDeviceName()) == null) {
                deviceName = "";
            }
            if ((zContainsKey || this.LIZ.LIZJ.matches(deviceName)) && scanResult != null && (device = scanResult.getDevice()) != null) {
                NearbyBleScannerImpl nearbyBleScannerImpl = this.LIZ;
                ScanRecord scanRecord3 = scanResult.getScanRecord();
                if (scanRecord3 != null && (serviceData = scanRecord3.getServiceData()) != null && (bArr = serviceData.get(nearbyBleScannerImpl.LIZIZ)) != null) {
                    str = new String(bArr, Charsets.UTF_8);
                } else {
                    ScanRecord scanRecord4 = scanResult.getScanRecord();
                    if (scanRecord4 != null && (deviceName2 = scanRecord4.getDeviceName()) != null) {
                        str = deviceName2;
                    }
                }
                nearbyBleScannerImpl.LJ.onNext(new C1689710u4X(str, device, scanResult.getRssi()));
            }
        }
    };
    public final C11RK<C1689710u4X> LJ = new C11RK<>();

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleScanner
    public final boolean LIZ() {
        return this.LIZ.get();
    }

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleScanner
    public final C19475711Hn LIZLLL() {
        C11RK<C1689710u4X> c11rk = this.LJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleScanner
    public final void LIZIZ(BluetoothManager bluetoothManager) {
        BluetoothAdapter adapter;
        BluetoothLeScanner bluetoothLeScanner;
        this.LIZ.set(false);
        if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null && (bluetoothLeScanner = adapter.getBluetoothLeScanner()) != null) {
            bluetoothLeScanner.stopScan(this.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleScanner
    public final boolean LIZJ(BluetoothManager bluetoothManager) {
        BluetoothLeScanner bluetoothLeScanner;
        if (this.LIZ.get()) {
            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZIZ("NearbyBle_Scanner", "Nearby Scan start failed: already started");
            return false;
        }
        if (bluetoothManager == null) {
            return false;
        }
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        if (adapter != null && (bluetoothLeScanner = adapter.getBluetoothLeScanner()) != null) {
            bluetoothLeScanner.startScan(C13BV.INSTANCE, new ScanSettings.Builder().setScanMode(2).build(), this.LIZLLL);
        }
        this.LIZ.set(true);
        return true;
    }
}
