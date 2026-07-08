package com.google.android.gms.measurement;

import X.AbstractC19836612jM;
import X.C19804712eD;
import X.C19806212eS;
import X.C19836712jN;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import X.InterfaceC19836912jP;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public final class AppMeasurementReceiver extends AbstractC19836612jM implements InterfaceC19836912jP {
    public C19836712jN LIZJ;

    public final void LIZ(Context context, Intent intent) {
        if (this.LIZJ == null) {
            this.LIZJ = new C19836712jN(this);
        }
        C19836712jN c19836712jN = this.LIZJ;
        c19836712jN.getClass();
        C19806212eS c19806212eSLJIILJJIL = C19804712eD.LIZIZ(context, null, null).LJIILJJIL();
        if (intent == null) {
            c19806212eSLJIILJJIL.LJIIIIZZ.LIZJ("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c19806212eSLJIILJJIL.LJIILIIL.LIZ(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c19806212eSLJIILJJIL.LJIILIIL.LIZJ("Starting wakeful intent.");
            c19836712jN.LIZ.getClass();
            SparseArray<PowerManager.WakeLock> sparseArray = AbstractC19836612jM.LIZ;
            synchronized (sparseArray) {
                try {
                    int i = AbstractC19836612jM.LIZIZ;
                    int i2 = i + 1;
                    AbstractC19836612jM.LIZIZ = i2;
                    if (i2 <= 0) {
                        AbstractC19836612jM.LIZIZ = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i);
                    ComponentName componentNameS3 = C786410Ut5.s3(context, className);
                    if (componentNameS3 == null) {
                        return;
                    }
                    PowerManager powerManager = (PowerManager) C786410Ut5.H2(context, "power");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("androidx.core:wake:");
                    sbLIZ.append(componentNameS3.flattenToShortString());
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, C2188811AlT.LIZIZ(sbLIZ));
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    wakeLockNewWakeLock.acquire(60000L);
                    sparseArray.put(i, wakeLockNewWakeLock);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
            return;
        }
        c19806212eSLJIILJJIL.LJIIIIZZ.LIZJ("Install Referrer Broadcasts are deprecated");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
