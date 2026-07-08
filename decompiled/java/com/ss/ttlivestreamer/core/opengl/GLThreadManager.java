package com.ss.ttlivestreamer.core.opengl;

import X.C1269350j8X;
import X.C1274040jG6;
import X.C1274080jGA;
import X.C1283100jUi;
import X.C143900gn;
import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1268500j7A;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS4S0201100_20;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes21.dex */
public class GLThreadManager {
    public static boolean dynamicGLVersionEnable = false;
    public static boolean enableGlobalGlContextMutex = true;
    public static boolean forceUseRealGLVersion = false;
    public static WeakReference<InterfaceC1268500j7A> glAllocFailListenerRef = null;
    public static boolean glAllocFailMock = false;
    public static boolean glAllocFailNoException = false;
    public static long glAllocFailNoRetryInterval = 100;
    public static int glAllocFailRetryCount = 0;
    public static boolean mEnalbeAttachThreadToOpenGlResultCheck = false;
    public static int queriedDynamicVersion = -1;
    public static int realGlVersion = 0;
    public static float sDetailedGLVersion = 0.0f;
    public static boolean sFencClientSync = false;
    public static boolean sForceFence = false;
    public static boolean sForceFinish = true;
    public static GLThreadManager sGLThreadManager = null;
    public static int sGLVersion = 2;
    public static String sGPUGLVersion = "";
    public static String sGPURender = "";
    public static String sGPUVendor = "";
    public static boolean sNeedFinish;
    public static boolean upgradeGLESVersion;
    public EGLContext mEGLContext;
    public ArrayList<String> mGlFinishDeviceList;
    public Handler mHandler;
    public int[] mEGLVersion = {0, 0};
    public int dynamicGLVersion = -1;
    public AtomicInteger mInteger = new AtomicInteger(1);

    public static GLThreadManager get() {
        return get(null, getConfigGLVersion());
    }

    public static int getConfigGLVersion() {
        return getConfigGLVersion(false);
    }

    public static native void nativeConfig(boolean z, boolean z2, boolean z3, boolean z4);

    public static native boolean nativeIsEnableGlobalGlContextMutex();

    public static native void nativeLockGlShareContext();

    public static native void nativeSetEnableGlobalGlContextMutex(boolean z);

    public static native void nativeSetForceFence(boolean z, boolean z2);

    public static native void nativeSetForceFinish(boolean z);

    public static native void nativeSetupOpenGlRecycler();

    public static native void nativeUnLockGlShareContext();

    public class MainGlThread extends a {
        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            C1C7U.LIZ("GLThreadManager$MainGlThread@bcee.run");
            com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("GLThreadManager$MainGlThread@bcee.run");
        }

        public void com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread__run$___twin___() {
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
            GLTracer.removeTraceStack();
        }

        public Handler getHandler() {
            Looper looper = getLooper();
            GLThreadManager gLThreadManager = GLThreadManager.this;
            if (gLThreadManager.mHandler == null && looper != null) {
                gLThreadManager.mHandler = new BPEAHandler(looper);
            }
            return GLThreadManager.this.mHandler;
        }

        public static void com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(MainGlThread mainGlThread) {
            try {
                mainGlThread.com_ss_ttlivestreamer_core_opengl_GLThreadManager$MainGlThread__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public MainGlThread(GLThreadManager gLThreadManager, String str) {
            this(str, 0);
        }

        public MainGlThread(String str, int i) {
            super(str, i);
            GLTracer.traceStack(this);
        }
    }

    public static synchronized void dispose() {
        AVLog.iow("GLThreadManager", "GLThreadManager dispose");
        GLThreadManager gLThreadManager = sGLThreadManager;
        if (gLThreadManager != null) {
            gLThreadManager.decrementRef();
        }
    }

    public static float getDetailedGLVersion() {
        int i = queriedDynamicVersion;
        if (i == -1) {
            return 2.0f;
        }
        if (i == 3) {
            float f = sDetailedGLVersion;
            if (f >= 3.0d) {
                return f;
            }
        }
        return i;
    }

    private void initNeedGlFinishDeviceList() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.mGlFinishDeviceList = arrayList;
        arrayList.add("Adreno (TM) 506");
        this.mGlFinishDeviceList.add("Mali-T860");
    }

    public static boolean isNeedFinish() {
        return sForceFinish || sNeedFinish;
    }

    public void addRef() {
        int iIncrementAndGet = this.mInteger.incrementAndGet();
        if (iIncrementAndGet < 2) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
            C1274080jGA.LIZ.LIZ("GLThreadManager.addRef", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addRef ");
        sbLIZ.append(iIncrementAndGet);
        AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void decrementRef() {
        Looper looper;
        int iDecrementAndGet = this.mInteger.decrementAndGet();
        if (iDecrementAndGet < 0) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
            C1274080jGA.LIZ.LIZ("GLThreadManager.decrementRef", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        if (iDecrementAndGet < 1) {
            AVLog.iow("GLThreadManager", "Release GLManager ...");
            Handler handler = this.mHandler;
            if (handler != null && (looper = handler.getLooper()) != null) {
                sGLThreadManager = null;
                looper.quitSafely();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decrementRef ");
        sbLIZ.append(iDecrementAndGet);
        AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void fillGPUDescription() {
        C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS120S0100000_20(this, 110));
    }

    public static EGLContext getEGLContext() {
        if (get().mEGLContext == null) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Not found shared EGLContext.");
            C1274080jGA.LIZ.LIZ("GLThreadManager.getEGLContext", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        return get().mEGLContext;
    }

    public static int[] getEGLVersion() {
        return get().mEGLVersion;
    }

    public static int getEGLVersionInt() {
        return get().mEGLVersion[0];
    }

    public static Handler getMainGlHandle() {
        return get().mHandler;
    }

    public static long getNativeEGLContext() {
        return toNativeEGLContext(getEGLContext());
    }

    public static boolean isGLES3Context() {
        return getEGLVersion()[0] == 3;
    }

    public static String getGPUGLVersoin() {
        return sGPUGLVersion;
    }

    public static String getGPURender() {
        return sGPURender;
    }

    public static String getGPUVendor() {
        return sGPUVendor;
    }

    public static WeakReference<InterfaceC1268500j7A> getGlAllocFailListenerRef() {
        return glAllocFailListenerRef;
    }

    public static long getGlAllocFailNoRetryInterval() {
        return glAllocFailNoRetryInterval;
    }

    public static int getGlAllocFailRetryCount() {
        return glAllocFailRetryCount;
    }

    public static boolean isDynamicGLVersionEnable() {
        return dynamicGLVersionEnable;
    }

    public static boolean isEnableForceGLFence() {
        return sForceFence;
    }

    public static boolean isEnableForceGLFinish() {
        return sForceFinish;
    }

    public static boolean isEnableGlobalGlContextMutex() {
        return enableGlobalGlContextMutex;
    }

    public static boolean isGlAllocFailMock() {
        return glAllocFailMock;
    }

    public static boolean isGlAllocFailNoException() {
        return glAllocFailNoException;
    }

    public static void lockSharedGLContext() {
        nativeLockGlShareContext();
    }

    public static void unlockSharedGLContext() {
        nativeUnLockGlShareContext();
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public static synchronized void addRefWithEnableAutoGlRecycler(boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BUG!, enableAutoGlRecycler: ");
            sbLIZ.append(z);
            sbLIZ.append(" sGLThreadManager: ");
            sbLIZ.append(sGLThreadManager);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C1274080jGA.LIZ.LIZ("GLThreadManager.addRefWithEnableAutoGlRecycler", androidRuntimeException);
            if (C1274040jG6.LIZ()) {
                throw androidRuntimeException;
            }
        }
        AVLog.iow("GLThreadManager", "GLThreadManager start by livecoreImpl initialization");
        GLThreadManager gLThreadManager = sGLThreadManager;
        if (gLThreadManager != null) {
            gLThreadManager.addRef();
        }
    }

    public static void enableForceGLFinish(boolean z) {
        sForceFinish = z;
        nativeSetForceFinish(z);
    }

    public static void enableGlobalGlContextMutex(boolean z) {
        enableGlobalGlContextMutex = z;
        nativeSetEnableGlobalGlContextMutex(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Using global mutex ");
        sbLIZ.append(isEnableGlobalGlContextMutex());
        AVLog.iod("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int getConfigGLVersion(boolean z) {
        int i;
        if (dynamicGLVersionEnable && (i = queriedDynamicVersion) != -1) {
            return i;
        }
        if (forceUseRealGLVersion) {
            if (z && (C786410Ut5.u3() instanceof GLThread)) {
                get().refreshGlVersion(EGL14.eglGetCurrentContext());
            }
            int i2 = realGlVersion;
            if (i2 != 0 && sGLVersion == 2) {
                return i2;
            }
        }
        return sGLVersion;
    }

    public static void initConfig(C1269350j8X c1269350j8X) {
        boolean z = c1269350j8X.LIZ;
        sForceFinish = z;
        sForceFence = false;
        sFencClientSync = false;
        enableGlobalGlContextMutex = false;
        nativeConfig(z, false, false, false);
    }

    public static void setEnableUpGradeGLESVersion(boolean z) {
        upgradeGLESVersion = z;
    }

    public static void setEnalbeAttachThreadToOpenGlResultCheck(boolean z) {
        mEnalbeAttachThreadToOpenGlResultCheck = z;
    }

    public static void setGLAllocFailListener(InterfaceC1268500j7A interfaceC1268500j7A) {
        glAllocFailListenerRef = new WeakReference<>(interfaceC1268500j7A);
    }

    public static void setGLAllocFailNoException(boolean z) {
        glAllocFailNoException = z;
    }

    public static void setGLVersion(int i) {
        sGLVersion = i;
    }

    public static void setGlAllocFailMock(boolean z) {
        glAllocFailMock = z;
    }

    public static void setGlAllocFailNoRetryInterval(long j) {
        glAllocFailNoRetryInterval = j;
    }

    public static void setGlAllocFailRetryCount(int i) {
        glAllocFailRetryCount = i;
    }

    public static long toNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext != null) {
            return eGLContext.getNativeHandle();
        }
        return 0L;
    }

    public boolean isContainVendoOnBlackList(String str) {
        ArrayList<String> arrayList = this.mGlFinishDeviceList;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it2 = this.mGlFinishDeviceList.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void refreshGlVersion(EGLContext eGLContext) {
        int[] iArr = {0, 0};
        if (eGLContext != null) {
            EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), eGLContext, 12440, iArr, 0);
            this.mEGLVersion = iArr;
            if (this.dynamicGLVersion != -1) {
                queriedDynamicVersion = iArr[0];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("use dynamic glVersion:");
                sbLIZ.append(queriedDynamicVersion);
                AVLog.logKibana(4, "GLThreadManager", C2188811AlT.LIZIZ(sbLIZ), null);
                return;
            }
            if (!forceUseRealGLVersion) {
                return;
            }
            realGlVersion = iArr[0];
        }
    }

    public GLThreadManager(EGLContext eGLContext, int i) {
        MediaEngineFactory.loadLibrary();
        initNeedGlFinishDeviceList();
        setupSharedOpenGlContext(eGLContext, i);
    }

    public static void enableForceGLFence(boolean z, boolean z2) {
        sForceFence = z;
        sFencClientSync = z2;
        nativeSetForceFence(z, z2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableForceGLFence:");
        sbLIZ.append(z);
        sbLIZ.append(" , with clientsync:");
        sbLIZ.append(z2);
        AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static GLThreadManager get(EGLContext eGLContext, int i) {
        if (sGLThreadManager == null) {
            synchronized (GLThreadManager.class) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (sGLThreadManager == null) {
                        sGLThreadManager = new GLThreadManager(eGLContext, i);
                    } else if (eGLContext != null) {
                        AVLog.iow("GLThreadManager", "OpenGl env already init and ignore shared context");
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Create GLThreadManager cost time ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append(" ms");
                    AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sGLThreadManager;
    }

    public static void setForceUseRealGLVersion(boolean z, boolean z2) {
        if (z2) {
            dynamicGLVersionEnable = true;
            forceUseRealGLVersion = false;
        } else {
            forceUseRealGLVersion = z;
        }
    }

    private void setupSharedOpenGlContext(EGLContext eGLContext, int i) {
        int[] iArr = {0};
        MainGlThread mainGlThread = new MainGlThread("OpenGlMgrThread", C143900gn.LIZ(0, "OpenGlMgrThread"));
        mainGlThread.start();
        Handler handler = mainGlThread.getHandler();
        this.mHandler = handler;
        if (handler != null) {
            C1283100jUi.LIZIZ(this.mHandler, new ARunnableS4S0201100_20(iArr, toNativeEGLContext(eGLContext), i, this, 1));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mEGLVersion[0]);
            sbLIZ.append(e3.d);
            sbLIZ.append(this.mEGLVersion[1]);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("EGLClient version ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" result:");
            sbLIZ2.append(iArr[0]);
            AVLog.ioi("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! not found handler");
        AVLog.ioe("GLThreadManager", androidRuntimeException.getMessage(), androidRuntimeException);
        throw androidRuntimeException;
    }
}
