package com.bytedance.otis.attribution.collector;

import X.C146T;
import X.C1C7U;
import X.C786410Ut5;
import X.InterfaceC21152717q9;
import Y.ARunnableS132S0100000_32;
import com.bytedance.otis.attribution.utils.SoLoad;

/* JADX INFO: loaded from: classes33.dex */
public final class ThreadMonitor {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public InterfaceC21152717q9 LIZLLL;
    public final ARunnableS132S0100000_32 LJ;
    public final ARunnableS132S0100000_32 LJFF;

    private final native void nStartMonitor(String str);

    private final native String nStopMonitor(String str);

    public final native void nRefresh(String str);

    public ThreadMonitor(String str) {
        this.LIZ = str;
        SoLoad.LIZ.init();
        this.LJ = new ARunnableS132S0100000_32(this, 16);
        this.LJFF = new ARunnableS132S0100000_32(this, 17);
    }

    public static void LIZ(ThreadMonitor threadMonitor) {
        C1C7U.LIZ("ThreadMonitor@1d49.start$1L");
        threadMonitor.nStartMonitor(threadMonitor.LIZ);
        C1C7U.LIZIZ("ThreadMonitor@1d49.start$1L");
    }

    public static void LIZIZ(ThreadMonitor threadMonitor) {
        C1C7U.LIZ("ThreadMonitor@1d49.stop$1L");
        String strNStopMonitor = threadMonitor.nStopMonitor(threadMonitor.LIZ);
        InterfaceC21152717q9 interfaceC21152717q9 = threadMonitor.LIZLLL;
        if (interfaceC21152717q9 != null) {
            interfaceC21152717q9.LIZ(strNStopMonitor);
        }
        threadMonitor.LIZIZ = false;
        C1C7U.LIZIZ("ThreadMonitor@1d49.stop$1L");
    }

    public final void LIZJ(boolean z) {
        if (!z) {
            C146T.LIZ.LIZ().removeCallbacks(this.LJFF);
        }
        if (this.LIZIZ) {
            C786410Ut5.LJL(C146T.LIZ.LIZ(), new ARunnableS132S0100000_32(this, 94));
        }
        this.LIZJ = false;
    }
}
