package com.ss.android.ugc.aweme.relation.ffp.nearby.bluetooth;

import X.AbstractC19484711Kz;
import X.C11S5;
import X.C1689710u4X;
import X.C1910890zpH;
import X.C1D1A;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1910860zpE;
import Y.ARunnableS134S0100000_34;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.nearby.INearbyBleConnector;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes35.dex */
public final class NearbyBleConnectorImpl implements INearbyBleConnector {
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final Queue<Runnable> LIZIZ = new LinkedBlockingQueue();
    public boolean LIZJ;
    public int LIZLLL;
    public BluetoothGatt LJ;

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleConnector
    public final void disconnect() {
        BluetoothGatt bluetoothGatt = this.LJ;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
    }

    public final void LIZIZ(BluetoothGatt bluetoothGatt) {
        if (this.LIZJ) {
            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("NearbyBle_Connector", "nextCommand, commandBusy true");
            return;
        }
        if (bluetoothGatt == null) {
            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("NearbyBle_Connector", "Error nextCommand, gatt is null, clearing queue");
            ((LinkedBlockingQueue) this.LIZIZ).clear();
            this.LIZJ = false;
        } else {
            if (((LinkedBlockingQueue) this.LIZIZ).size() > 0) {
                Runnable runnable = (Runnable) ((LinkedBlockingQueue) this.LIZIZ).peek();
                this.LIZJ = true;
                C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("NearbyBle_Connector", "set commandBusy to true, post delay 400ms");
                C786410Ut5.LJLIIL(200L, this.LIZ, new ARunnableS134S0100000_34(runnable, 32));
                return;
            }
            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("NearbyBle_Connector", "command queue empty, disconnect");
            bluetoothGatt.disconnect();
        }
    }

    public final void LIZJ(BluetoothGatt bluetoothGatt) {
        this.LIZLLL++;
        this.LIZJ = false;
        if (((LinkedBlockingQueue) this.LIZIZ).peek() != null) {
            if (this.LIZLLL >= 5) {
                C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZIZ("NearbyBle_Connector", "Error max retry reached");
                this.LIZJ = false;
                ((LinkedBlockingQueue) this.LIZIZ).poll();
                this.LIZLLL = 0;
                LIZIZ(bluetoothGatt);
                return;
            }
            C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retrying: time ");
            sbLIZ.append(this.LIZLLL);
            c1910890zpHLIZ.LIZIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ(bluetoothGatt);
        }
    }

    @Override // com.ss.android.ugc.aweme.nearby.INearbyBleConnector
    public final AbstractC19484711Kz<Pair<C1689710u4X, String>> LIZ(Context context, C1689710u4X c1689710u4X, BluetoothManager bluetoothManager) {
        if (bluetoothManager == null) {
            return AbstractC19484711Kz.LJIILLIIL(new IllegalStateException("bluetooth manager is null"));
        }
        return AbstractC19484711Kz.LJII(new C1D1A(c1689710u4X, context, this, 1)).LJJIJIIJI(C11S5.LIZ()).LJJIJIIJIL(12000L, TimeUnit.MILLISECONDS).LJJIII(3L);
    }
}
