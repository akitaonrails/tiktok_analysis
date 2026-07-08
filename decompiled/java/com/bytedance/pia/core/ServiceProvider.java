package com.bytedance.pia.core;

import X.C1BOL;
import X.C1BOM;
import X.C1BOO;
import X.C1BOQ;
import X.C1BOZ;
import X.C1BQP;
import X.C2203991BNt;
import X.InterfaceC1533190q05;
import X.InterfaceC1542670qFN;
import X.InterfaceC1545380qJk;
import X.InterfaceC1549430qQH;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class ServiceProvider {
    public final Map<Class<?>, Object> services = new HashMap();

    public ServiceProvider() {
        put(C1BQP.class, C1BOQ.LIZ);
        put(InterfaceC1542670qFN.class, C1BOL.LIZ);
        put(InterfaceC1533190q05.class, C2203991BNt.LIZ);
        put(InterfaceC1549430qQH.class, C1BOM.LIZ);
        put(InterfaceC1545380qJk.class, new InterfaceC1545380qJk() { // from class: X.0qJq
            @Override // X.InterfaceC1545380qJk
            public final void LIZ(C1545400qJm c1545400qJm) {
                C1545410qJn.LIZ.getClass();
                if (C1545410qJn.LIZIZ == null) {
                    C1545410qJn.LIZJ = c1545400qJm;
                    C1545410qJn.LIZLLL = "libra-va.tiktokv.com";
                    C1545410qJn.LIZIZ = Keva.getRepo("pia_settings");
                    C1545400qJm c1545400qJm2 = C1545410qJn.LIZJ;
                    if (c1545400qJm2 == null) {
                        c1545400qJm2 = null;
                    }
                    c1545400qJm2.getClass();
                    C1545410qJn.LIZLLL();
                }
            }
        });
        put(C1BOZ.class, C1BOO.LIZ);
    }

    public <T> T get(Class<T> cls) {
        try {
            return (T) this.services.get(cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    private <T> void put(Class<T> cls, T t) {
        this.services.put(cls, t);
    }
}
