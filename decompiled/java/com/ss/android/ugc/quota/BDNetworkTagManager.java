package com.ss.android.ugc.quota;

import X.InterfaceC1489690orv;
import X.InterfaceC1489700orw;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes24.dex */
public class BDNetworkTagManager {
    public static volatile BDNetworkTagManager LIZJ;
    public InterfaceC1489690orv LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(true);

    public static BDNetworkTagManager LIZIZ() {
        if (LIZJ == null) {
            synchronized (BDNetworkTagManager.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new BDNetworkTagManager();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final String LIZ(InterfaceC1489700orw interfaceC1489700orw) {
        if (!this.LIZIZ.get()) {
            StringBuilder sb = new StringBuilder("t=0;n=");
            interfaceC1489700orw.triggerType();
            sb.append(this.LIZ.LIZJ() ? 1 : 0);
            sb.append(";s=");
            sb.append(this.LIZ.LIZIZ());
            interfaceC1489700orw.LIZ();
            return sb.toString();
        }
        return "";
    }
}
