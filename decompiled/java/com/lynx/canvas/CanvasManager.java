package com.lynx.canvas;

import X.AbstractC1286080jZW;
import X.AbstractC1286160jZe;
import X.AbstractC1289020jeG;
import X.AbstractC1289250jed;
import X.AbstractC1299380juy;
import X.AbstractC1301300jy4;
import X.AbstractC1304280k2s;
import X.C1285890jZD;
import X.C1285920jZG;
import X.C1288990jeD;
import X.C1289430jev;
import X.C1299330jut;
import X.C1339200kxC;
import X.C786410Ut5;
import X.EnumC1310010kC7;
import X.InterfaceC1288380jdE;
import X.InterfaceC1289400jes;
import X.InterfaceC1303920k2I;
import a17.a0;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.KryptonFeatureFlag;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxTrailService;
import com.lynx.tasm.utils.EnvUtils;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import j27.s;
import java.lang.ref.WeakReference;
import t27.a;

/* JADX INFO: loaded from: classes21.dex */
public class CanvasManager extends a {
    public static boolean sIsAudioForceUseAdaptiveSampler;
    public static boolean sIsEventReportEnabled;
    public static boolean sIsSettingsCached;
    public static boolean sSetupCanvasSurfaceEarlier;
    public Context mContext;
    public KryptonApp mKryptonApp;
    public C1299330jut mNapiRuntimeFactoryService;
    public C1288990jeD mServiceLazyLoader;
    public String mTemporaryDirectory;
    public static final EnumC1310010kC7 KEY_SETUP_CANVAS_SURFACE_EARLIER = EnumC1310010kC7.SETUP_CANVAS_SURFACE_EARLIER;
    public static boolean sIsUseAurumAudioEngine = true;

    private native long nativeGetLogFunctionPtr();

    public static native void nativeRegisterTraceFunc();

    @Override // t27.a
    public void onRuntimeMediatorDestroy() {
    }

    private void makeSureSettingsCached() {
        if (sIsSettingsCached || C1285920jZG.LIZJ().LIZ(ILynxTrailService.class) == null) {
            return;
        }
        sIsEventReportEnabled = C1285890jZD.LIZ("krypton_enable_event_report", false);
        sIsUseAurumAudioEngine = C1285890jZD.LIZ("krypton_use_aurum_audio_engine", true);
        sIsAudioForceUseAdaptiveSampler = C1285890jZD.LIZ("krypton_audio_force_use_adaptive_sampler", false);
        sSetupCanvasSurfaceEarlier = LynxEnv.getBooleanFromExternalEnv(KEY_SETUP_CANVAS_SURFACE_EARLIER, false);
        sIsSettingsCached = true;
    }

    @Override // t27.a
    public void deInit() {
        LynxLog.i("KryptonCanvasManager", "Canvas manager deInit ");
    }

    public String getTemporaryDirectory() {
        String str = this.mTemporaryDirectory;
        return (str == null || str.length() <= 0) ? EnvUtils.getCacheDir() : this.mTemporaryDirectory;
    }

    @Override // t27.a
    public boolean isNativeCanvasAppReady() {
        boolean z;
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp == null) {
            return false;
        }
        synchronized (kryptonApp) {
            try {
                z = kryptonApp.LIZJ != 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // t27.a
    public long newNativeCanvasAppWeakPtr() {
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp != null) {
            return kryptonApp.LJFF();
        }
        return 0L;
    }

    @Override // t27.a
    public void onAppEnterBackground() {
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp != null) {
            kryptonApp.LJII();
        }
    }

    @Override // t27.a
    public void onAppEnterForeground() {
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp != null) {
            kryptonApp.LJIIIIZZ();
        }
    }

    @Override // t27.a
    public void onRuntimeDetach() {
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp != null) {
            kryptonApp.LIZIZ();
            this.mKryptonApp = null;
        }
    }

    public CanvasManager() {
        initJavaLoggerForKrypton();
        if (Krypton.LIZIZ().LIZ) {
            return;
        }
        Krypton.LIZIZ().LIZ(LynxEnv.inst().getAppContext());
    }

    private KryptonApp createKryptonApp() {
        makeSureSettingsCached();
        KryptonFeatureFlag.Builder builder = new KryptonFeatureFlag.Builder();
        builder.setEnableSar(true);
        builder.setUseVsyncMonitorFromService(false);
        builder.setEnableEventReport(sIsEventReportEnabled);
        builder.setUseAurumAudioEngine(sIsUseAurumAudioEngine);
        builder.setAudioForceUseAdaptiveSampler(sIsAudioForceUseAdaptiveSampler);
        builder.setSetupGLGraphicsBackendWhenSurfaceCreated(sSetupCanvasSurfaceEarlier);
        return new KryptonApp(builder.build(), this.mContext);
    }

    private void initJavaLoggerForKrypton() {
        Krypton kryptonLIZIZ = Krypton.LIZIZ();
        kryptonLIZIZ.LIZJ.put("Lynx", new InterfaceC1288380jdE() { // from class: X.0jeq
            @Override // X.InterfaceC1288380jdE
            public final void d(String str, String str2) {
                LynxLog.d(str, str2);
            }

            @Override // X.InterfaceC1288380jdE
            public final void e(String str, String str2) {
                LynxLog.e(str, str2);
            }

            @Override // X.InterfaceC1288380jdE
            public final void i(String str, String str2) {
                LynxLog.i(str, str2);
            }

            @Override // X.InterfaceC1288380jdE
            public final void w(String str, String str2) {
                LynxLog.w(str, str2);
            }
        });
    }

    private void registerLogFunc() {
        Krypton.LIZIZ().nativeRegisterLogger("Lynx", nativeGetLogFunctionPtr());
        if (TraceEvent.LIZJ) {
            LynxLog.i("KryptonCanvasManager", "now in lynx debugmode, load trace func");
            nativeRegisterTraceFunc();
        }
    }

    private boolean tryLoadLynxKryptonSo() {
        if (!Krypton.LIZIZ().LIZ) {
            LynxLog.e("KryptonCanvasManager", "Krypton not initialized, Ensure that the host has added the krypton AAR dependency and current device supports OpenGL ES3.0 .");
            return false;
        }
        try {
            if (LynxEnv.inst().getLibraryLoader() != null) {
                LynxEnv.inst().getLibraryLoader().loadLibrary("lynx_krypton");
                LynxLog.i("KryptonCanvasManager", "lynx_krypton.so loaded via library loader");
                return true;
            }
            INVOKESTATIC_com_lynx_canvas_CanvasManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lynx_krypton");
            LynxLog.i("KryptonCanvasManager", "lynx_krypton.so loaded via system loader");
            return true;
        } catch (ExceptionInInitializerError e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("KryptonCanvasManager", "lynx_krypton.so load failed! Ensure that the host has added the krypton-lynx AAR dependency.");
            return false;
        }
    }

    public KryptonApp getKryptonApp() {
        return this.mKryptonApp;
    }

    public static void INVOKESTATIC_com_lynx_canvas_CanvasManager_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0jut, a17.a0] */
    @Override // t27.a
    public boolean init(s sVar) {
        if (!tryLoadLynxKryptonSo()) {
            LynxLog.e("KryptonCanvasManager", "Load lynx_krypton.so failed !");
            return false;
        }
        registerLogFunc();
        this.mContext = C786410Ut5.T3(sVar);
        this.mKryptonApp = createKryptonApp();
        C1288990jeD c1288990jeD = new C1288990jeD(sVar);
        this.mServiceLazyLoader = c1288990jeD;
        KryptonApp kryptonApp = this.mKryptonApp;
        kryptonApp.LJIIJ(AbstractC1301300jy4.class, c1288990jeD);
        kryptonApp.LJIIJ(AbstractC1289020jeG.class, c1288990jeD);
        kryptonApp.LJIIJ(AbstractC1286080jZW.class, c1288990jeD);
        kryptonApp.LJIIJ(AbstractC1304280k2s.class, c1288990jeD);
        kryptonApp.LJIIJ(AbstractC1289250jed.class, c1288990jeD);
        kryptonApp.LJIIJ(AbstractC1286160jZe.class, c1288990jeD);
        ?? r2 = new AbstractC1299380juy() { // from class: X.0jut
            public WeakReference<KryptonApp> LIZ;

            @Override // X.AbstractC1299380juy
            public final LynxBackgroundRuntime LIZ(final C1299400jv0 c1299400jv0) {
                WeakReference<KryptonApp> weakReference = this.LIZ;
                if (weakReference == null) {
                    LynxLog.i("LynxKryptonNapiRuntimeFactoryService", "[worker] create background runtime failed, mAppWeakReference == null");
                    return null;
                }
                KryptonApp kryptonApp2 = weakReference.get();
                if (kryptonApp2 == null) {
                    LynxLog.i("LynxKryptonNapiRuntimeFactoryService", "[worker] create background runtime failed, app = null");
                    return null;
                }
                C1299310jur c1299310jur = new C1299310jur();
                C1299360juw c1299360juw = new C1299360juw();
                c1299360juw.LIZ = "-1";
                c1299360juw.LIZLLL = true;
                c1299360juw.LJ = Boolean.TRUE;
                c1299310jur.LIZJ = new C1299340juu(c1299360juw);
                c1299310jur.LJIIJJI = true;
                LynxLog.i("LynxKryptonNapiRuntimeFactoryService", "[worker] create background runtime ");
                final LynxBackgroundRuntime lynxBackgroundRuntime = new LynxBackgroundRuntime(kryptonApp2.LIZIZ, c1299310jur, false);
                if (LynxEnv.inst().isDevtoolEnabled()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("krypton://worker-");
                    sbLIZ.append(lynxBackgroundRuntime.LIZLLL());
                    sbLIZ.append(".com");
                    lynxBackgroundRuntime.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "");
                }
                InterfaceC1292320jja interfaceC1292320jja = new InterfaceC1292320jja() { // from class: X.0juv
                    @Override // X.InterfaceC1292320jja
                    public final void onRuntimeDetach() {
                        C1299400jv0 c1299400jv02 = (C1299400jv0) c1299400jv0;
                        c1299400jv02.LIZIZ.getClass();
                        C1288370jdD.LIZJ("KryptonNapiRuntimeFactory", "[worker] on napi runtime detach");
                        c1299400jv02.LIZIZ.nativeOnNapiRuntimeDetach(c1299400jv02.LIZ);
                    }

                    @Override // X.InterfaceC1292320jja
                    public final void onRuntimeAttach(long j) {
                        if (lynxBackgroundRuntime.LIZLLL() < 0) {
                            LynxLog.i("LynxKryptonNapiRuntimeFactoryService", "[worker] invalid runtime id ");
                            return;
                        }
                        C1299400jv0 c1299400jv02 = (C1299400jv0) c1299400jv0;
                        c1299400jv02.LIZIZ.getClass();
                        C1288370jdD.LIZJ("KryptonNapiRuntimeFactory", "[worker] on napi runtime attach");
                        c1299400jv02.LIZIZ.nativeOnNapiRuntimeAttach(c1299400jv02.LIZ, j, "globalThis.__lynxNapiLoader.load");
                    }
                };
                if (lynxBackgroundRuntime.LJFF == 0) {
                    LynxLog.w("LynxBackgroundRuntime", "add a null lifecycle listener or runtime has been destroy.");
                    return lynxBackgroundRuntime;
                }
                lynxBackgroundRuntime.LIZJ.LIZ(interfaceC1292320jja);
                return lynxBackgroundRuntime;
            }

            @Override // X.AbstractC1299380juy
            public final void LIZIZ(Object obj) {
                if (!(obj instanceof LynxBackgroundRuntime)) {
                    LynxLog.i("LynxKryptonNapiRuntimeFactoryService", "[worker] !object instanceof LynxBackgroundRuntime ");
                } else {
                    ((LynxBackgroundRuntime) obj).LIZ();
                }
            }

            @Override // a17.a0
            public final void onBootstrap(KryptonApp kryptonApp2) {
                super.onBootstrap(kryptonApp2);
                this.LIZ = new WeakReference<>(kryptonApp2);
            }
        };
        this.mNapiRuntimeFactoryService = r2;
        this.mKryptonApp.LJIIJ(AbstractC1299380juy.class, r2);
        LynxLog.i("KryptonCanvasManager", "Canvas manager init success");
        return true;
    }

    @Override // t27.a
    public void onNapiEnvReady(long j) {
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp != null) {
            kryptonApp.LIZ(j);
        }
    }

    @Override // t27.a
    public void onRuntimeInit(long j) {
        LynxLog.i("KryptonCanvasManager", "CanvasManager runtime init");
    }

    @Override // t27.a
    public void onRuntimeMediatorReady(long j) {
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp == null) {
            return;
        }
        kryptonApp.LJIIJ(b.class, new LynxKryptonFrameService(j));
    }

    @Override // t27.a
    public void onTemplateLoad(String str) {
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp != null) {
            kryptonApp.LJIJI(str);
        }
    }

    @Override // t27.a
    public void registerCanvasBehavior(C1289430jev c1289430jev) {
        c1289430jev.LIZ(new C1339200kxC(48));
        c1289430jev.LIZ(new C1339200kxC(49));
        c1289430jev.LIZ(new C1339200kxC(50));
    }

    @Override // t27.a
    public void setRenderFrameCallback(InterfaceC1289400jes interfaceC1289400jes) {
        this.mKryptonApp.LJIIZILJ(new InterfaceC1303920k2I() { // from class: X.0jer
            @Override // X.InterfaceC1303920k2I
            public final void onFrameRender(String str, long j, long j2) {
                throw null;
            }
        });
    }

    @Override // t27.a
    public void setTaskRunner(long j) {
        this.mKryptonApp.LJIJ(j);
    }

    @Override // t27.a
    public void setTemporaryDirectory(String str) {
        this.mTemporaryDirectory = str;
        C1288990jeD c1288990jeD = this.mServiceLazyLoader;
        if (c1288990jeD != null) {
            c1288990jeD.LIZJ = str;
        } else {
            LynxLog.e("KryptonCanvasManager", "setTemporaryDirectory should be called after init");
        }
    }

    @Override // t27.a
    public void registerService(Class<?> cls, Object obj) {
        if (!(obj instanceof a0)) {
            LynxLog.e("KryptonCanvasManager", "register service class error");
            return;
        }
        KryptonApp kryptonApp = this.mKryptonApp;
        if (kryptonApp == null) {
            LynxLog.e("KryptonCanvasManager", "register service failed : canvas app is null");
        } else {
            kryptonApp.LJIIJ(cls, (a0) obj);
        }
    }
}
