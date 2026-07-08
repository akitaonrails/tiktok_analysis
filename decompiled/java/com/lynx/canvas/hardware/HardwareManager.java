package com.lynx.canvas.hardware;

import X.AbstractC1289250jed;
import X.C1288370jdD;
import X.InterfaceC1289270jef;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class HardwareManager implements InterfaceC1289270jef {
    public static final ArrayList<Integer> LIZLLL;
    public final AbstractC1289250jed LIZ;
    public final long LIZIZ;
    public boolean LIZJ;

    public static native void nativeNotifyGyroscopeData(long j, float f, float f2, float f3, long j2);

    public static native void nativeNotifyOrientationData(long j, float f, float f2, float f3, long j2);

    static {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(new Integer(4));
        arrayList.add(new Integer(15));
        LIZLLL = arrayList;
    }

    private void stopMonitorGyroscope() {
        AbstractC1289250jed abstractC1289250jed = this.LIZ;
        if (abstractC1289250jed != null) {
            abstractC1289250jed.LIZJ();
        }
    }

    private void release() {
        stopMonitorGyroscope();
        synchronized (this) {
            try {
                this.LIZJ = true;
                AbstractC1289250jed abstractC1289250jed = this.LIZ;
                if (abstractC1289250jed != null) {
                    abstractC1289250jed.LIZ(null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void startMonitorGyroscope(int i) {
        AbstractC1289250jed abstractC1289250jed = this.LIZ;
        if (abstractC1289250jed == null) {
            C1288370jdD.LIZIZ("KryptonHardwareManager", "startMonitorGyroscope error: no sensor service");
        } else {
            abstractC1289250jed.LIZIZ(i, LIZLLL);
        }
    }

    public HardwareManager(long j, KryptonApp kryptonApp) {
        this.LIZIZ = j;
        AbstractC1289250jed abstractC1289250jed = (AbstractC1289250jed) kryptonApp.LJ(AbstractC1289250jed.class);
        this.LIZ = abstractC1289250jed;
        if (abstractC1289250jed != null) {
            abstractC1289250jed.LIZ(this);
        } else {
            C1288370jdD.LIZIZ("KryptonHardwareManager", "no sensor service found");
        }
    }

    public static HardwareManager createInstance(long j, KryptonApp kryptonApp) {
        return new HardwareManager(j, kryptonApp);
    }

    public final void LIZ(float f, float f2, float f3, long j) {
        synchronized (this) {
            try {
                if (!this.LIZJ) {
                    nativeNotifyGyroscopeData(this.LIZIZ, f, f2, f3, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(float f, float f2, float f3, long j) {
        synchronized (this) {
            try {
                if (!this.LIZJ) {
                    nativeNotifyOrientationData(this.LIZIZ, f, f2, f3, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
