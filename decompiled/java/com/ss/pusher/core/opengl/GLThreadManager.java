package com.ss.pusher.core.opengl;

import X.C1273710jFZ;
import X.C1283060jUe;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import Y.ARunnableS4S0201100_20;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.engine.MediaEngineFactory;
import com.ss.pusher.core.utils.AVLog;
import java.util.concurrent.atomic.AtomicInteger;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class GLThreadManager {
    public static GLThreadManager LJ = null;
    public static int LJFF = 2;
    public static EGLContext LJI;
    public Handler LIZ;
    public EGLContext LIZIZ;
    public int[] LIZJ = {0, 0};
    public final AtomicInteger LIZLLL = new AtomicInteger(1);

    public static native boolean nativeIsEnableGlobalGlContextMutex();

    public static native void nativeLockGlShareContext();

    public static native void nativeSetEnableGlobalGlContextMutex(boolean z);

    public static native void nativeSetupOpenGlRecycler();

    public static native void nativeUnLockGlShareContext();

    public class MainGlThread extends a {
        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("GLThreadManager$MainGlThread@5133.run");
            com_ss_pusher_core_opengl_GLThreadManager$MainGlThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("GLThreadManager$MainGlThread@5133.run");
        }

        public void com_ss_pusher_core_opengl_GLThreadManager$MainGlThread__run$___twin___() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("thread ");
            sbLIZ.append(getName());
            sbLIZ.append(" is runing...");
            AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
            super.run();
            GlUtil.nativeDetachThreadToOpenGl();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("thread ");
            sbLIZ2.append(getName());
            sbLIZ2.append(" is exit.");
            AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ2));
            C1273710jFZ.LIZJ();
        }

        public Handler getHandler() {
            Looper looper = getLooper();
            GLThreadManager gLThreadManager = GLThreadManager.this;
            if (gLThreadManager.LIZ == null && looper != null) {
                gLThreadManager.LIZ = new BPEAHandler(looper);
            }
            return GLThreadManager.this.LIZ;
        }

        public static void com_ss_pusher_core_opengl_GLThreadManager$MainGlThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MainGlThread mainGlThread) {
            try {
                mainGlThread.com_ss_pusher_core_opengl_GLThreadManager$MainGlThread__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public MainGlThread(String str) {
            super(str);
            C1273710jFZ.LJ(this);
        }
    }

    public static synchronized void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GLThreadManager start by LiveCore, current instance is ");
        sbLIZ.append(LJ);
        AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
        GLThreadManager gLThreadManager = LJ;
        if (gLThreadManager != null) {
            int iIncrementAndGet = gLThreadManager.LIZLLL.incrementAndGet();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addRef ");
            sbLIZ2.append(iIncrementAndGet);
            AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static synchronized void LIZJ() {
        AVLog.iow("GLThreadManager", "GLThreadManager dispose");
        GLThreadManager gLThreadManager = LJ;
        if (gLThreadManager != null) {
            gLThreadManager.LIZIZ();
        }
    }

    public static GLThreadManager LJ() {
        EGLContext eGLContext = LJI;
        int i = LJFF;
        if (LJ == null) {
            synchronized (GLThreadManager.class) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (LJ == null) {
                        LJ = new GLThreadManager(eGLContext, i);
                    } else if (eGLContext != null) {
                        AVLog.iow("GLThreadManager", "OpenGl env already init and ignore shared context");
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Create GLThreadManager with context ");
                    sbLIZ.append(eGLContext);
                    sbLIZ.append(", cost time ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append(" ms. call stack: \n");
                    sbLIZ.append(Log.getStackTraceString(new Throwable()));
                    AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        GLThreadManager gLThreadManager = LJ;
        LJI = null;
        return gLThreadManager;
    }

    public final void LIZIZ() {
        Looper looper;
        int iDecrementAndGet = this.LIZLLL.decrementAndGet();
        if (iDecrementAndGet < 1) {
            AVLog.iow("GLThreadManager", "Release GLManager ...");
            Handler handler = this.LIZ;
            if (handler != null && (looper = handler.getLooper()) != null) {
                LJ = null;
                looper.quitSafely();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decrementRef ");
        sbLIZ.append(iDecrementAndGet);
        AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EGLContext LJFF() {
        return LJ().LIZIZ;
    }

    public static int[] LJI() {
        return LJ().LIZJ;
    }

    public final void finalize() throws Throwable {
        super.finalize();
    }

    public static void LIZLLL(boolean z) {
        nativeSetEnableGlobalGlContextMutex(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Using global mutex ");
        sbLIZ.append(nativeIsEnableGlobalGlContextMutex());
        AVLog.iod("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public GLThreadManager(EGLContext eGLContext, int i) {
        long nativeHandle;
        MediaEngineFactory.LIZJ();
        int[] iArr = {0};
        MainGlThread mainGlThread = new MainGlThread("OpenGlMgrThread");
        mainGlThread.start();
        Handler handler = mainGlThread.getHandler();
        this.LIZ = handler;
        if (handler != null) {
            if (eGLContext != null) {
                nativeHandle = eGLContext.getNativeHandle();
            } else {
                nativeHandle = 0;
            }
            C1283060jUe.LIZIZ(this.LIZ, new ARunnableS4S0201100_20(iArr, nativeHandle, i, this, 0));
            int[] iArr2 = this.LIZJ;
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i2);
            sbLIZ.append(e3.d);
            sbLIZ.append(i3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("EGLClient version ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" result:");
            sbLIZ2.append(iArr[0]);
            AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ2));
            if (i2 < 2) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("got low EGL version: ");
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" in ");
                sbLIZ3.append(Build.MODEL);
                AVLog.logKibana(5, "GLThreadManager", C2188811AlT.LIZIZ(sbLIZ3), null);
                return;
            }
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! not found handler");
        AVLog.ioe("GLThreadManager", androidRuntimeException.getMessage(), androidRuntimeException);
        throw androidRuntimeException;
    }
}
