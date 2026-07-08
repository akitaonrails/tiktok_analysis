package com.bytedance.touchpoint.core;

import X.C01GW;
import X.C01U6;
import X.C1895930zR9;
import X.C1899200zWQ;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.interfaces.IConfigService;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS64S0010000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class ConfigServiceImp implements IConfigService {
    @Override // com.bytedance.touchpoint.api.interfaces.IConfigService
    public final void LJ() {
        C1895930zR9.LJ = false;
        long jLIZ = C1899200zWQ.LIZ(C1899200zWQ.LIZ);
        C01GW c01gw = C1895930zR9.LIZ;
        C1895930zR9.LIZJ = (jLIZ > ((Keva) c01gw.getValue()).getLong("last_record_date", 0L) ? 1 : (jLIZ == ((Keva) c01gw.getValue()).getLong("last_record_date", 0L) ? 0 : -1)) == 0 ? 1 + ((Keva) c01gw.getValue()).getInt("cold_boot_times", 0) : 1;
        Keva keva = (Keva) c01gw.getValue();
        keva.storeLong("last_record_date", jLIZ);
        keva.storeInt("cold_boot_times", C1895930zR9.LIZJ);
    }

    @Override // com.bytedance.touchpoint.api.interfaces.IConfigService
    public final void LIZ() {
        C01U6.LIZ(0L, AFwS217S0000000_28.get$arr$(55));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    @Override // com.bytedance.touchpoint.api.interfaces.IConfigService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r6 = this;
            java.lang.String r1 = "connectivity"
            X.0sFe r0 = X.C1619720sFe.LIZ     // Catch: java.lang.Throwable -> L5b
            r5 = 0
            X.0z0O r0 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> L5b
            X.0zRP r0 = (X.AbstractC1896090zRP) r0     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L5f
            android.content.Context r4 = r0.LJIIJJI()     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L5f
            java.lang.Object r3 = X.C786410Ut5.H2(r4, r1)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r3 instanceof android.net.ConnectivityManager     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L5f
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5f
            r2 = 1
            java.lang.Object r0 = X.C786410Ut5.H2(r4, r1)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L5b
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L5b
            android.net.NetworkInfo r0 = X.C786410Ut5.LJIJ(r0)     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L5b
            if (r0 == 0) goto L38
            boolean r0 = r0.isConnected()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L5b
            if (r0 == 0) goto L38
            r0 = 1
            goto L39
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5b
        L38:
            r0 = 0
        L39:
            X.C1895970zRD.LIZ = r0     // Catch: java.lang.Throwable -> L5b
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            r0 = 12
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)     // Catch: java.lang.Throwable -> L5b
            android.net.NetworkRequest$Builder r0 = r0.addTransportType(r2)     // Catch: java.lang.Throwable -> L5b
            android.net.NetworkRequest$Builder r0 = r0.addTransportType(r5)     // Catch: java.lang.Throwable -> L5b
            android.net.NetworkRequest r1 = r0.build()     // Catch: java.lang.Throwable -> L5b
            X.0zRB r0 = new X.0zRB     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            r3.registerNetworkCallback(r1, r0)     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.ConfigServiceImp.LIZIZ():void");
    }

    @Override // com.bytedance.touchpoint.api.interfaces.IConfigService
    public final void LIZJ() {
        C01U6.LIZIZ(new AwS64S0010000_28(2));
    }

    @Override // com.bytedance.touchpoint.api.interfaces.IConfigService
    public final void LIZLLL() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(54));
    }
}
