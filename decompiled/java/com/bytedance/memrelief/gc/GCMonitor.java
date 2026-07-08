package com.bytedance.memrelief.gc;

import X.C08PC;
import X.C2188731AlL;
import X.C2367709Pn;
import X.InterfaceC2188771AlP;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class GCMonitor {
    public volatile boolean LIZ;
    public volatile InterfaceC2188771AlP LIZIZ;

    private native void native_init();

    private native void native_setEnableMonitorMemoryLevelLow(double d, double d2);

    public final synchronized void LIZ() {
        if (this.LIZ) {
            return;
        }
        try {
            C08PC.LIZ();
            native_init();
            this.LIZ = true;
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (UnsatisfiedLinkError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    private double getDalvikUsedRate() {
        return C2367709Pn.LIZJ();
    }

    public final void LIZIZ(double d, double d2) {
        if (!this.LIZ) {
            return;
        }
        native_setEnableMonitorMemoryLevelLow(d, d2);
    }

    private void onLowMemory(int i, int i2, int i3, int i4) {
        if (this.LIZIZ != null) {
            ((C2188731AlL) this.LIZIZ).LIZ.LJFF(i4, false);
        }
    }
}
