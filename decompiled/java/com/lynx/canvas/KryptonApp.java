package com.lynx.canvas;

import X.AbstractC1289010jeF;
import X.AbstractC1303850k2B;
import X.AbstractC1303870k2D;
import X.AbstractC1303880k2E;
import X.C1288370jdD;
import X.C1303790k25;
import X.C1303820k28;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1303920k2I;
import X.InterfaceC1303940k2K;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import a17.a0;
import a17.l;
import a17.u;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.callback.FirstOnScreenCanvasFrameCallback;
import com.lynx.canvas.callback.RenderFrameCallbackWrapper;
import com.lynx.canvas.callback.TimeToInteractiveCallback;
import com.lynx.canvas.loader.CanvasResourceLoader;
import com.lynx.canvas.worker.KryptonNapiRuntimeFactory;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class KryptonApp {
    public final KryptonFeatureFlag LIZ;
    public final Context LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public Runnable LJII;
    public BPEAHandler LJIIIZ;
    public boolean LJIIJ;
    public final float LJIIJJI;
    public InterfaceC1303940k2K LJIIL;
    public final Map<Class, a0> LJ = new ConcurrentHashMap();
    public final Map<Class, AbstractC1289010jeF> LJFF = new ConcurrentHashMap();
    public final Map<Class, u> LJI = new ConcurrentHashMap();
    public long LJIIIIZZ = 0;

    private native void nativeBootstrap(long j, long j2);

    private native long nativeCreateInstance(KryptonFeatureFlag kryptonFeatureFlag, CanvasResourceLoader canvasResourceLoader, KryptonVSyncMonitor kryptonVSyncMonitor, KryptonNapiRuntimeFactory kryptonNapiRuntimeFactory);

    private native long nativeCreateWeakPtr(long j);

    private native void nativeDestroyInstance(long j);

    private native String nativeGetAndResetPerformanceStatistics(long j);

    private native String nativeGetDrawCallStatistics(long j);

    private native int[] nativeGetSizeFromTheOnlyOneOnScreenCanvas(long j);

    private native void nativeOnHide(long j);

    private native void nativeOnShow(long j);

    private native void nativePause(long j, long j2);

    private native boolean nativeReadPixelsFromTheOnlyOneOnScreenCanvas(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeResume(long j, long j2);

    private native void nativeSetDevicePixelRatio(long j, float f);

    private native void nativeSetEnableDrawCallStatistics(long j, boolean z);

    private native void nativeSetEnablePerformanceStatistics(long j, boolean z);

    private native void nativeSetFirstOnScreenCanvasFrameCallback(long j, FirstOnScreenCanvasFrameCallback firstOnScreenCanvasFrameCallback);

    private native void nativeSetRenderFrameCallback(long j, RenderFrameCallbackWrapper renderFrameCallbackWrapper);

    private native void nativeSetRuntimeTaskRunner(long j, long j2);

    private native void nativeSetScenarioTag(long j, String str);

    private native void nativeSetTimeToInteractiveCallback(long j, TimeToInteractiveCallback timeToInteractiveCallback);

    private native void nativeSetUncaughtExceptionHandler(long j, long j2);

    public final long LJFF() {
        long jNativeCreateWeakPtr;
        synchronized (this) {
            try {
                long j = this.LIZJ;
                jNativeCreateWeakPtr = j != 0 ? nativeCreateWeakPtr(j) : 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jNativeCreateWeakPtr;
    }

    public final void LJI() {
        this.LJIIJ = true;
        Iterator it2 = ((ConcurrentHashMap) this.LJI).values().iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).onBootstrap(this);
        }
        Iterator it3 = ((ConcurrentHashMap) this.LJ).values().iterator();
        while (it3.hasNext()) {
            ((a0) it3.next()).onBootstrap(this);
        }
    }

    public final C1303820k28 LJIILIIL() {
        if (!this.LIZ.isFirstOnScreenCanvasIsTheOnlyOnScreen()) {
            throw new IllegalStateException("Only supported when KryptonFeatureFlag isFirstOnScreenCanvasIsTheOnlyOnScreen is true.");
        }
        long j = this.LIZJ;
        if (j == 0) {
            C1288370jdD.LIZIZ("KryptonApp", "screenshot error without native handler");
            return null;
        }
        int[] iArrNativeGetSizeFromTheOnlyOneOnScreenCanvas = nativeGetSizeFromTheOnlyOneOnScreenCanvas(j);
        if (iArrNativeGetSizeFromTheOnlyOneOnScreenCanvas == null || iArrNativeGetSizeFromTheOnlyOneOnScreenCanvas.length < 2) {
            C1288370jdD.LIZLLL("KryptonApp", "screenshot get canvas size error");
            return null;
        }
        int i = iArrNativeGetSizeFromTheOnlyOneOnScreenCanvas[0];
        int i2 = iArrNativeGetSizeFromTheOnlyOneOnScreenCanvas[1];
        if (i <= 0 || i2 <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("screenshot get canvas size result error: width = ");
            sbLIZ.append(i);
            sbLIZ.append(" height = ");
            sbLIZ.append(i2);
            C1288370jdD.LIZLLL("KryptonApp", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
        if (!nativeReadPixelsFromTheOnlyOneOnScreenCanvas(this.LIZJ, byteBufferAllocateDirect, i, i2)) {
            C1288370jdD.LIZLLL("KryptonApp", "screenshot read pixels error");
            return null;
        }
        C1303820k28 c1303820k28 = new C1303820k28();
        c1303820k28.LIZ = i;
        c1303820k28.LIZIZ = i2;
        c1303820k28.LIZJ = byteBufferAllocateDirect;
        return c1303820k28;
    }

    public final void LIZIZ() {
        if (this.LIZLLL) {
            return;
        }
        C1288370jdD.LIZJ("KryptonApp", "destroy");
        this.LIZLLL = true;
        Iterator it2 = ((ConcurrentHashMap) this.LJ).values().iterator();
        while (it2.hasNext()) {
            ((a0) it2.next()).onDestroy();
        }
        ((ConcurrentHashMap) this.LJ).clear();
        Iterator it3 = ((ConcurrentHashMap) this.LJI).values().iterator();
        while (it3.hasNext()) {
            ((u) it3.next()).onDestroy();
        }
        ((ConcurrentHashMap) this.LJI).clear();
        long j = this.LIZJ;
        if (j != 0) {
            synchronized (this) {
                try {
                    this.LIZJ = 0L;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            nativeDestroyInstance(j);
        }
        this.LJIIIIZZ = 0L;
    }

    public final String LIZJ() {
        if (!this.LIZ.enablePerformanceStatisticsRelatedInterface()) {
            throw new IllegalStateException("Only supported when KryptonFeatureFlag enablePerformanceStatisticsRelatedInterface is true.");
        }
        if (!this.LIZ.isFirstOnScreenCanvasIsTheOnlyOnScreen()) {
            throw new IllegalStateException("Only supported when KryptonFeatureFlag isFirstOnScreenCanvasIsTheOnlyOnScreen is true.");
        }
        long j = this.LIZJ;
        if (j != 0) {
            return nativeGetAndResetPerformanceStatistics(j);
        }
        C1288370jdD.LIZLLL("KryptonApp", "native handler null");
        return null;
    }

    public final void LJII() {
        if (this.LIZLLL) {
            return;
        }
        C1288370jdD.LIZJ("KryptonApp", "onHide");
        long j = this.LIZJ;
        if (j != 0) {
            nativeOnHide(j);
        }
        Iterator it2 = ((ConcurrentHashMap) this.LJ).values().iterator();
        while (it2.hasNext()) {
            ((a0) it2.next()).onHide();
        }
        Iterator it3 = ((ConcurrentHashMap) this.LJI).values().iterator();
        while (it3.hasNext()) {
            ((u) it3.next()).onHide();
        }
    }

    public final void LJIIIIZZ() {
        if (this.LIZLLL) {
            return;
        }
        C1288370jdD.LIZJ("KryptonApp", "onShow");
        long j = this.LIZJ;
        if (j != 0) {
            nativeOnShow(j);
        }
        Iterator it2 = ((ConcurrentHashMap) this.LJI).values().iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).onShow();
        }
        Iterator it3 = ((ConcurrentHashMap) this.LJ).values().iterator();
        while (it3.hasNext()) {
            ((a0) it3.next()).onShow();
        }
    }

    public final void LJIIIZ() {
        if (this.LIZLLL) {
            return;
        }
        C1288370jdD.LIZJ("KryptonApp", "pause");
        long j = this.LIZJ;
        if (j != 0) {
            nativePause(j, this.LJIIIIZZ);
        }
        Iterator it2 = ((ConcurrentHashMap) this.LJ).values().iterator();
        while (it2.hasNext()) {
            ((a0) it2.next()).onPause();
        }
        Iterator it3 = ((ConcurrentHashMap) this.LJI).values().iterator();
        while (it3.hasNext()) {
            ((u) it3.next()).onPause();
        }
    }

    public final void LJIIL() {
        if (this.LIZLLL) {
            return;
        }
        C1288370jdD.LIZJ("KryptonApp", "resume");
        long j = this.LIZJ;
        if (j != 0) {
            nativeResume(j, this.LJIIIIZZ);
        }
        Iterator it2 = ((ConcurrentHashMap) this.LJI).values().iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).onResume();
        }
        Iterator it3 = ((ConcurrentHashMap) this.LJ).values().iterator();
        while (it3.hasNext()) {
            ((a0) it3.next()).onResume();
        }
    }

    public final void finalize() {
        if (this.LIZLLL) {
            return;
        }
        C1288370jdD.LIZIZ("KryptonApp", "Destroy function must be called to prevent native object leakage");
    }

    public static CanvasVSyncMonitor createCanvasVSyncMonitor(KryptonApp kryptonApp) {
        CanvasVSyncMonitor canvasVSyncMonitor = new CanvasVSyncMonitor();
        canvasVSyncMonitor.LIZ = (b) kryptonApp.LJ(b.class);
        return canvasVSyncMonitor;
    }

    private void onUncaughtException(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUncaughtException msg: ");
        sbLIZ.append(str);
        C1288370jdD.LIZIZ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void setPreferredFramesPerSecond(int i) {
        b bVar = (b) LJ(b.class);
        if (bVar != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPreferredFramesPerSecond ");
            sbLIZ.append(i);
            C1288370jdD.LIZJ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ));
            bVar.LIZJ(i);
        }
    }

    public final void LIZ(long j) {
        if (this.LJIIJ) {
            C1288370jdD.LIZIZ("KryptonApp", "already bootstrapped.");
            return;
        }
        if (this.LIZLLL) {
            return;
        }
        this.LJIIIIZZ = j;
        C1288370jdD.LIZJ("KryptonApp", "bootstrap.");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.LJIIIZ = new BPEAHandler(looperMyLooper);
            long j2 = this.LIZJ;
            if (j2 != 0) {
                nativeBootstrap(j2, j);
            }
            LJI();
            return;
        }
        throw new IllegalStateException("Looper.myLooper() null on bootstrap");
    }

    public final <T extends u> T LIZLLL(Class<T> cls) {
        AbstractC1303870k2D abstractC1303870k2DNewInstance;
        String str;
        T t = null;
        if (this.LIZLLL) {
            return null;
        }
        T t2 = (T) ((ConcurrentHashMap) this.LJI).get(cls);
        if (t2 != null) {
            return t2;
        }
        C1303790k25 c1303790k25LIZIZ = C1303790k25.LIZIZ();
        c1303790k25LIZIZ.getClass();
        boolean z = true;
        if (l.class.isAssignableFrom(cls)) {
            boolean useAurumAudioEngine = this.LIZ.getUseAurumAudioEngine();
            if (c1303790k25LIZIZ.LJI == null && !c1303790k25LIZIZ.LJII) {
                if (useAurumAudioEngine) {
                    str = "KryptonAurumAudioModule";
                } else {
                    str = "KryptonAudioModuleImpl";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("com.lynx.canvas.audio.");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                try {
                    Class cls2 = Class.forName(strLIZIZ);
                    if (l.class.isAssignableFrom(cls2)) {
                        c1303790k25LIZIZ.LJI = cls2;
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("reflect find ");
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(" instance type error");
                        C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("can not cast to KryptonAudioModule: ");
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(e.getMessage());
                    C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ3));
                } catch (ClassNotFoundException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("find module class not found: ");
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append(", maybe audio module is not used.");
                    C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ4));
                }
                if (c1303790k25LIZIZ.LJI != null) {
                    z = false;
                }
                c1303790k25LIZIZ.LJII = z;
            }
            Class<l> cls3 = c1303790k25LIZIZ.LJI;
            if (cls3 != null) {
                try {
                    abstractC1303870k2DNewInstance = cls3.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    t = abstractC1303870k2DNewInstance;
                } catch (ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("create mAudioModuleClass instance error ");
                    sbLIZ5.append(e3.getMessage());
                    C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
        } else if (AbstractC1303880k2E.class.isAssignableFrom(cls)) {
            if (c1303790k25LIZIZ.LJ == null && !c1303790k25LIZIZ.LJFF) {
                try {
                    Object objInvoke = Class.forName("com.lynx.canvas.rtc.KryptonDefaultRTCModule").getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                    if (AbstractC1303880k2E.class.isInstance(objInvoke)) {
                        c1303790k25LIZIZ.LJ = (AbstractC1303880k2E) objInvoke;
                    } else {
                        C1288370jdD.LIZIZ("KryptonReflectLoader", "reflect find module for com.lynx.canvas.rtc.KryptonDefaultRTCModule instance type error");
                    }
                } catch (ClassNotFoundException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C1288370jdD.LIZLLL("KryptonReflectLoader", "find module class not found: com.lynx.canvas.rtc.KryptonDefaultRTCModule, maybe Krypton/RTC is not used.");
                } catch (IllegalAccessException e5) {
                    e = e5;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("invoke method inst in class: com.lynx.canvas.rtc.KryptonDefaultRTCModule failed ");
                    sbLIZ6.append(e.getMessage());
                    C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ6));
                } catch (NoSuchMethodException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("find module inst method not found in class: com.lynx.canvas.rtc.KryptonDefaultRTCModule");
                    sbLIZ7.append(e6.getMessage());
                    C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ7));
                } catch (InvocationTargetException e7) {
                    e = e7;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ62 = C2188811AlT.LIZ();
                    sbLIZ62.append("invoke method inst in class: com.lynx.canvas.rtc.KryptonDefaultRTCModule failed ");
                    sbLIZ62.append(e.getMessage());
                    C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ62));
                }
                if (c1303790k25LIZIZ.LJ != null) {
                    z = false;
                }
                c1303790k25LIZIZ.LJFF = z;
            }
            t = c1303790k25LIZIZ.LJ;
        } else if (AbstractC1303870k2D.class.isAssignableFrom(cls)) {
            if (c1303790k25LIZIZ.LJIIIIZZ == null && !c1303790k25LIZIZ.LJIIIZ) {
                try {
                    Class cls4 = Class.forName("com.lynx.canvas.live.KryptonDefaultLiveModule");
                    if (AbstractC1303870k2D.class.isAssignableFrom(cls4)) {
                        c1303790k25LIZIZ.LJIIIIZZ = cls4;
                    } else {
                        C1288370jdD.LIZIZ("KryptonReflectLoader", "reflect find default KryptonLiveModule instance type error");
                    }
                } catch (ClassCastException e8) {
                    TryCatchGuardChecker.doCheck(e8);
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("can not cast to KryptonLiveModule: com.lynx.canvas.live.KryptonDefaultLiveModule");
                    sbLIZ8.append(e8.getMessage());
                    C1288370jdD.LIZIZ("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ8));
                } catch (ClassNotFoundException e9) {
                    TryCatchGuardChecker.doCheck(e9);
                    C1288370jdD.LIZLLL("KryptonReflectLoader", "find module class not found: com.lynx.canvas.live.KryptonDefaultLiveModule, maybe Krypton/Live is not used.");
                }
                if (c1303790k25LIZIZ.LJIIIIZZ != null) {
                    z = false;
                }
                c1303790k25LIZIZ.LJIIIZ = z;
            }
            Class<AbstractC1303870k2D> cls5 = c1303790k25LIZIZ.LJIIIIZZ;
            if (cls5 != null) {
                try {
                    abstractC1303870k2DNewInstance = cls5.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    t = abstractC1303870k2DNewInstance;
                } catch (ExceptionInInitializerError | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                    TryCatchGuardChecker.doCheck(e10);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("create mKryptonDefaultLiveModuleClass instance error");
                    sbLIZ9.append(e10.getMessage());
                    C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ9));
                }
            }
        } else if (AbstractC1303850k2B.class.isAssignableFrom(cls)) {
            if (c1303790k25LIZIZ.LJIIJ == null && !c1303790k25LIZIZ.LJIIJJI) {
                try {
                    Object objInvoke2 = Class.forName("com.lynx.canvas.vecamera.KryptonDefaultVECameraModule").getMethod("inst", new Class[0]).invoke(null, new Object[0]);
                    if (AbstractC1303850k2B.class.isInstance(objInvoke2)) {
                        c1303790k25LIZIZ.LJIIJ = (AbstractC1303850k2B) objInvoke2;
                    } else {
                        C1288370jdD.LIZLLL("KryptonReflectLoader", "reflect find module for com.lynx.canvas.vecamera.KryptonDefaultVECameraModule instance type error");
                    }
                } catch (ClassNotFoundException e11) {
                    TryCatchGuardChecker.doCheck(e11);
                    C1288370jdD.LIZLLL("KryptonReflectLoader", "find module class not found: com.lynx.canvas.vecamera.KryptonDefaultVECameraModule, maybe Krypton/VECamera is not used.");
                } catch (IllegalAccessException e12) {
                    e = e12;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("invoke method inst in class: com.lynx.canvas.vecamera.KryptonDefaultVECameraModule failed ");
                    sbLIZ10.append(e.getMessage());
                    C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ10));
                } catch (NoSuchMethodException e13) {
                    TryCatchGuardChecker.doCheck(e13);
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("find module inst method not found in class: com.lynx.canvas.vecamera.KryptonDefaultVECameraModule");
                    sbLIZ11.append(e13.getMessage());
                    C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ11));
                } catch (InvocationTargetException e14) {
                    e = e14;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ102 = C2188811AlT.LIZ();
                    sbLIZ102.append("invoke method inst in class: com.lynx.canvas.vecamera.KryptonDefaultVECameraModule failed ");
                    sbLIZ102.append(e.getMessage());
                    C1288370jdD.LIZLLL("KryptonReflectLoader", C2188811AlT.LIZIZ(sbLIZ102));
                }
                if (c1303790k25LIZIZ.LJIIJ != null) {
                    z = false;
                }
                c1303790k25LIZIZ.LJIIJJI = z;
            }
            t = c1303790k25LIZIZ.LJIIJ;
        }
        if (t != null) {
            if (!this.LIZLLL) {
                if (!cls.isAssignableFrom(t.getClass())) {
                    C1288370jdD.LIZLLL("KryptonApp", "module class type error");
                } else {
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("register module: ");
                    sbLIZ12.append(cls.getName());
                    C1288370jdD.LIZJ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ12));
                    ((ConcurrentHashMap) this.LJI).put(cls, t);
                    if (this.LJIIIZ != null && this.LJIIIIZZ != 0) {
                        Looper looperMyLooper = Looper.myLooper();
                        if (looperMyLooper != null && looperMyLooper.equals(this.LJIIIZ.getLooper())) {
                            if (!this.LIZLLL) {
                                C1288370jdD.LIZJ("KryptonApp", "run onBootstrap on register module after KryptonApp's bootstrap");
                                t.onBootstrap(this);
                            }
                        } else {
                            C786410Ut5.LJJZZIII(this.LJIIIZ, new ARunnableS89S0200000_20(this, t, 0));
                        }
                    }
                }
            }
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("get default instance for module ");
            sbLIZ13.append(cls.getName());
            sbLIZ13.append(" success, auto registered.");
            C1288370jdD.LIZJ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ13));
            return t;
        }
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("get module ");
        sbLIZ14.append(cls.getName());
        sbLIZ14.append(" failed");
        C1288370jdD.LIZLLL("KryptonApp", C2188811AlT.LIZIZ(sbLIZ14));
        return t;
    }

    public final <T extends a0> T LJ(Class<T> cls) {
        if (this.LIZLLL) {
            return null;
        }
        T t = (T) ((ConcurrentHashMap) this.LJ).get(cls);
        if (t != null) {
            return t;
        }
        AbstractC1289010jeF abstractC1289010jeF = (AbstractC1289010jeF) ((ConcurrentHashMap) this.LJFF).get(cls);
        if (abstractC1289010jeF == null) {
            return null;
        }
        ((ConcurrentHashMap) this.LJFF).remove(cls);
        T t2 = (T) abstractC1289010jeF.LIZ(cls);
        if (t2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lazy load service for ");
            sbLIZ.append(cls.getName());
            sbLIZ.append(" failed");
            C1288370jdD.LIZIZ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        LJIIJJI(cls, t2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lazy load service for ");
        sbLIZ2.append(cls.getName());
        sbLIZ2.append(" success");
        C1288370jdD.LIZJ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ2));
        return t2;
    }

    public final void LJIILJJIL(float f) {
        long j = this.LIZJ;
        if (j != 0) {
            nativeSetDevicePixelRatio(j, f);
        }
    }

    public final void LJIILL(Boolean bool) {
        if (this.LIZ.enablePerformanceStatisticsRelatedInterface()) {
            if (this.LIZ.isFirstOnScreenCanvasIsTheOnlyOnScreen()) {
                long j = this.LIZJ;
                if (j != 0) {
                    nativeSetEnablePerformanceStatistics(j, bool.booleanValue());
                    return;
                } else {
                    C1288370jdD.LIZLLL("KryptonApp", "native handler null");
                    return;
                }
            }
            throw new IllegalStateException("Only supported when KryptonFeatureFlag isFirstOnScreenCanvasIsTheOnlyOnScreen is true.");
        }
        throw new IllegalStateException("Only supported when KryptonFeatureFlag enablePerformanceStatisticsRelatedInterface is true.");
    }

    public final void LJIILLIIL(ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
        if (!this.LIZ.isFirstOnScreenCanvasIsTheOnlyOnScreen() && !this.LIZ.enableFirstFrameCallback()) {
            throw new IllegalStateException("KryptonFeatureFlag isFirstCanvasIsTheOnlyOnScreen and enableFirstFrameCallback is false");
        }
        if (this.LIZJ == 0) {
            C1288370jdD.LIZIZ("KryptonApp", "setFirstOnScreenCanvasFrameCallback but no native handler");
            return;
        }
        this.LJII = aRunnableS120S0100000_20;
        nativeSetFirstOnScreenCanvasFrameCallback(this.LIZJ, new FirstOnScreenCanvasFrameCallback() { // from class: X.0k29
            @Override // com.lynx.canvas.callback.FirstOnScreenCanvasFrameCallback
            public final void onFirstFrame() {
                this.LIZ.LJII.run();
            }
        });
    }

    public final void LJIIZILJ(InterfaceC1303920k2I interfaceC1303920k2I) {
        long j = this.LIZJ;
        if (j == 0) {
            C1288370jdD.LIZIZ("KryptonApp", "setRenderFrameCallback but no native handler");
        } else {
            nativeSetRenderFrameCallback(j, new RenderFrameCallbackWrapper(interfaceC1303920k2I));
        }
    }

    public final void LJIJ(long j) {
        long j2 = this.LIZJ;
        if (j2 != 0) {
            nativeSetRuntimeTaskRunner(j2, j);
        } else {
            C1288370jdD.LIZIZ("KryptonApp", "setRuntimeTaskRunner should be called after init");
        }
    }

    public final void LJIJI(String str) {
        if (!this.LIZLLL) {
            long j = this.LIZJ;
            if (j != 0) {
                nativeSetScenarioTag(j, str);
            }
        }
    }

    public KryptonApp(KryptonFeatureFlag kryptonFeatureFlag, Context context) {
        this.LJIIJJI = 1.0f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("construct with ");
        sbLIZ.append(kryptonFeatureFlag);
        C1288370jdD.LIZJ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = kryptonFeatureFlag;
        this.LIZIZ = context;
        new CanvasPermissionManager();
        CanvasResourceLoader canvasResourceLoader = new CanvasResourceLoader(this);
        KryptonVSyncMonitor kryptonVSyncMonitor = new KryptonVSyncMonitor(this);
        KryptonNapiRuntimeFactory kryptonNapiRuntimeFactory = new KryptonNapiRuntimeFactory(this);
        float f = context.getResources().getDisplayMetrics().density;
        this.LJIIJJI = f;
        long jNativeCreateInstance = nativeCreateInstance(kryptonFeatureFlag, canvasResourceLoader, kryptonVSyncMonitor, kryptonNapiRuntimeFactory);
        this.LIZJ = jNativeCreateInstance;
        if (jNativeCreateInstance != 0) {
            nativeSetDevicePixelRatio(jNativeCreateInstance, f);
        } else {
            C1288370jdD.LIZIZ("KryptonApp", "construct error! nativeCreateInstance result null");
        }
    }

    public final <T extends a0> void LJIIJ(Class cls, T t) {
        if (this.LIZLLL) {
            return;
        }
        if (t != null && cls != null) {
            if (cls.isAssignableFrom(t.getClass())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register ");
                sbLIZ.append(cls.getName());
                C1288370jdD.LIZJ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ));
                ((ConcurrentHashMap) this.LJFF).remove(cls);
                LJIIJJI(cls, t);
                return;
            }
            if (AbstractC1289010jeF.class.isAssignableFrom(t.getClass())) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("register ");
                sbLIZ2.append(cls.getName());
                sbLIZ2.append(" lazy loader");
                C1288370jdD.LIZJ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ2));
                ((ConcurrentHashMap) this.LJ).remove(cls);
                ((ConcurrentHashMap) this.LJFF).put(cls, t);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("register ");
            sbLIZ3.append(cls.getName());
            sbLIZ3.append(" failed: service class type error");
            C1288370jdD.LIZIZ("KryptonApp", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        C1288370jdD.LIZIZ("KryptonApp", "register service failed: empty interface class or service");
    }

    public final void LJIIJJI(Class cls, a0 a0Var) {
        ((ConcurrentHashMap) this.LJ).put(cls, a0Var);
        if (this.LJIIIZ != null && this.LJIIIIZZ != 0) {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper.equals(this.LJIIIZ.getLooper())) {
                if (!this.LIZLLL) {
                    C1288370jdD.LIZJ("KryptonApp", "run onBootstrap on register service after KryptonApp's bootstrap");
                    a0Var.onBootstrap(this);
                    return;
                }
                return;
            }
            C786410Ut5.LJJZZIII(this.LJIIIZ, new ARunnableS89S0200000_20(this, a0Var, 31));
        }
    }
}
