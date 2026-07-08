package com.bytedance.i18n.region;

import X.C080U;
import X.C0X52;
import X.C0XLD;
import X.C1494590ozp;
import X.C847070XKv;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class StoreRegionSource extends C0XLD {
    public static final StoreRegionSource LIZ = new StoreRegionSource();
    public static C847070XKv LIZIZ = C847070XKv.LIZJ;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final InterfaceC1904907d9 LJ = new InterfaceC1904907d9() { // from class: com.bytedance.i18n.region.StoreRegionSource$cdnInterceptor$1
        @Override // X.InterfaceC1904907d9
        public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
            C080U c080uLIZ;
            String str;
            try {
                C0X52 c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(((C1494590ozp) interfaceC841770X0l).LIZJ);
                boolean zLIZ = StoreRegionSource.LIZIZ.LIZ();
                AtomicBoolean atomicBoolean = StoreRegionSource.LIZJ;
                if (!atomicBoolean.get() && !zLIZ && (c080uLIZ = c0x52LIZ.LIZ.LIZ("x-tt-app-cdn-region")) != null && (str = c080uLIZ.LIZIZ) != null && str.length() != 0) {
                    atomicBoolean.set(true);
                    StoreRegionSource.LIZIZ = new C847070XKv(str, "cdn");
                    StoreRegionSource.LIZ.LIZJ();
                }
                return c0x52LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    };

    @Override // X.C0XLD
    public final String LIZIZ() {
        return "store_region";
    }

    @Override // X.C0XLD
    public final C847070XKv LIZ() {
        return LIZIZ;
    }
}
