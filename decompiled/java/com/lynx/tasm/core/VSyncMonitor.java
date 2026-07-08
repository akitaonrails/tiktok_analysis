package com.lynx.tasm.core;

import X.C0WZX;
import X.C1289620jfE;
import X.C1292360jje;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import Y.ARunnableS14S0000100_20;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.core.VSyncMonitor;
import com.lynx.tasm.utils.CallStackUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class VSyncMonitor {
    public static WeakReference<WindowManager> LIZ = null;
    public static DisplayManager LIZIZ = null;
    public static Choreographer LIZJ = null;
    public static boolean LIZLLL = false;
    public static C1292360jje LJ = null;
    public static long LJFF = -1;

    public static native void nativeOnVSync(long j, long j2, long j3);

    public static void LIZIZ() {
        try {
            LJFF = (long) (1.0E9f / LIZIZ.getDisplay(0).getRefreshRate());
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDisplayChanged failed: ");
            sbLIZ.append(CallStackUtil.LIZ(e));
            LynxLog.e("VSyncMonitor", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void request(final long j) {
        C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0jjc
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                VSyncMonitor.LIZ(j, j2);
            }
        });
    }

    public static void requestOnUIThread(final long j) {
        Choreographer choreographer = LIZJ;
        if (choreographer == null) {
            C1289620jfE.LIZLLL(new ARunnableS14S0000100_20(j, 0));
        } else {
            choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0jjd
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j2) {
                    VSyncMonitor.LIZ(j, j2);
                }
            });
        }
    }

    public static void LIZ(long j, long j2) {
        if (!LIZLLL) {
            try {
                LJFF = 16666666L;
                WindowManager windowManager = LIZ.get();
                if (windowManager != null) {
                    LJFF = (long) (1.0E9d / ((double) C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEg4jUdKSQVYySFyHaY1utf5s8pA34dky7clwXA==", null)).getRefreshRate()));
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("VSyncMonitor", "getRefreshRate failed: " + e.getMessage());
            }
        }
        nativeOnVSync(j, j2, j2 + LJFF);
    }
}
