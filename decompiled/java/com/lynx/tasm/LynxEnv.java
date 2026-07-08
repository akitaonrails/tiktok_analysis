package com.lynx.tasm;

import X.AbstractC1300020jw0;
import X.AbstractC1310390kCj;
import X.AbstractC1310570kD1;
import X.C0VEK;
import X.C0WZX;
import X.C0X8C;
import X.C1285920jZG;
import X.C1289620jfE;
import X.C1299180jue;
import X.C1301010jxb;
import X.C1309780kBk;
import X.C1310020kC8;
import X.C1310050kCB;
import X.C1310210kCR;
import X.C1310410kCl;
import X.C1310440kCo;
import X.C1310450kCp;
import X.C1310590kD3;
import X.C1311670kEn;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C810670Vr7;
import X.EnumC1310010kC7;
import X.EnumC1310030kC9;
import X.InterfaceC1289280jeg;
import X.InterfaceC1289480jf0;
import X.InterfaceC1310130kCJ;
import X.InterfaceC1310400kCk;
import X.InterfaceC1310550kCz;
import X.InterfaceC1310580kD2;
import X.InterfaceC1311150kDx;
import X.InterfaceC1962507mR;
import X.InterfaceC846710XJl;
import Y.ARunnableS120S0100000_20;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.lynx.base.IBaseNativeLibraryLoader;
import com.lynx.base.LynxBaseEnv;
import com.lynx.base.log.LynxLog;
import com.lynx.base.memory.MemoryPressureCallback;
import com.lynx.devtoolwrapper.DevToolLifecycle;
import com.lynx.jsbridge.LynxBytecodeCallback;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleFactory;
import com.lynx.jsbridge.WebAssemblyBridge;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LynxNativeMemoryTracer;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.utils.PropsHolderAutoRegister;
import com.lynx.tasm.core.VSyncMonitor;
import com.lynx.tasm.fluency.FluencySample;
import com.lynx.tasm.icu.ICURegister;
import com.lynx.tasm.service.ILynxDevToolService;
import com.lynx.tasm.service.ILynxImageService;
import com.lynx.tasm.service.ILynxImageServiceExtension;
import com.lynx.tasm.service.ILynxTrailService;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class LynxEnv {
    public static ILynxDevToolService devtoolService;
    public static final ConcurrentHashMap<String, String> sExperimentSettingsMap = new ConcurrentHashMap<>();
    public static final C1310050kCB sGlobalRefQueue;
    public static InterfaceC1289480jf0 sInitializer;
    public static volatile LynxEnv sInstance;
    public Application mContext;
    public LynxModuleFactory mModuleFactory;
    public AbstractC1310570kD1 mNetworkingModuleProvider;
    public InterfaceC846710XJl mResProvider;
    public SharedPreferences mSharedPreferences;
    public AbstractC1310390kCj mTemplateProvider;
    public InterfaceC1310580kD2 mThemeResourceProvider;
    public InterfaceC1962507mR mViewManagerBundle;
    public final AtomicBoolean hasInit = new AtomicBoolean(false);
    public boolean mDebugModeEnabled = false;
    public boolean mLayoutOnlyEnabled = true;
    public boolean mRecordEnable = false;
    public boolean mCreateViewAsync = true;
    public boolean mVsyncAlignedFlushGlobalSwitch = true;
    public boolean mEnableJSDebug = true;
    public boolean mDebug = false;
    public volatile boolean mIsNativeLibraryLoaded = false;
    public boolean mIsDevLibraryLoaded = false;
    public boolean mIsNativeUIThreadInited = false;
    public final Map<String, C1311670kEn> mBehaviorMap = new HashMap();
    public final C1309780kBk mClient = new C1309780kBk();
    public InterfaceC1311150kDx mBgImageLoader = null;
    public InputMethodManager mInputMethodManager = null;
    public boolean mIsCheckPropsSetter = true;
    public volatile boolean hasCalledInitializer = false;
    public C0X8C mLibraryLoader = null;
    public Map<String, AbstractC1300020jw0> mGlobalResourceProvider = new HashMap();
    public String mLocale = null;
    public String mLastUrl = null;
    public boolean mDisableImagePostProcessor = false;
    public boolean mEnableLoadImageFromService = false;
    public boolean mEnableImageAsyncRedirect = false;
    public boolean mEnableImageAsyncRedirectOnCreate = false;
    public boolean mEnableImageAsyncRequest = false;
    public boolean mEnableImageRequestOptimize = false;
    public boolean mEnableFlattenImageFlickerFix = false;
    public boolean mDisableBigImageHelper = false;
    public boolean mEnableDataListFix = false;
    public boolean mEnableImageEventReport = false;
    public boolean mEnableImageAsyncLayout = false;
    public boolean mEnableImageMemoryReport = false;
    public boolean mEnableComponentStatisticReport = false;
    public boolean mEnableTransformForPositionCalculation = false;
    public boolean mEnableSVGAsync = false;
    public boolean mEnableGenericResourceFetcher = false;
    public boolean mEnableTextBoringLayout = true;
    public boolean mEnableRefreshRateOpt = true;
    public boolean mEnableCheckAccessFromNonUIThread = false;
    public final Object mLazyInitLock = new Object();
    public Boolean mHasV8BridgeLoadSuccess = Boolean.FALSE;
    public boolean mForceDisableQuickJsCache = false;
    public boolean mEnableLazyInitA11y = true;
    public boolean mEnableTextLayoutCache = true;
    public boolean mEnableFSP = false;
    public HashMap<String, String> mFSPConfig = null;
    public boolean mEnableInitDisplayMetricsInEnv = true;

    public static native void nativeClearBytecode(String str, boolean z);

    public static native void nativeInitUIThread();

    public static native void nativeOnMemoryPressure(int i);

    public static native void nativePrepareLynxGlobalPool();

    public static native void nativeRunJavaTaskOnConcurrentLoop(long j, int i);

    public static native void nativeSetGlobalBytecodeGenerateCallback(LynxBytecodeCallback lynxBytecodeCallback);

    public static void setLazyInitializer(InterfaceC1289480jf0 interfaceC1289480jf0) {
    }

    public void enableRadonCompatible(boolean z) {
    }

    public void forceDisableQuickJsCache() {
        this.mForceDisableQuickJsCache = true;
        setBooleanLocalEnv(EnumC1310010kC7.FORCE_DISABLE_QUICKJS_CACHE, true);
    }

    public synchronized String getLastUrl() {
        return this.mLastUrl;
    }

    public String getLynxVersion() {
        return "3.9.1-rc.25";
    }

    public boolean isRadonCompatibleEnabled() {
        return true;
    }

    public native void nativeCleanExternalCache();

    public native String nativeGetDebugEnvDescription();

    public native String nativeGetSSRApiVersion();

    public native void nativeSetGroupedEnv(String str, boolean z, String str2);

    public native void nativeSetGroupedEnvWithGroupSet(String str, Set<String> set);

    public native void nativeSetLocalEnv(String str, String str2);

    public void warmClass() {
    }

    static {
        if (!C1310590kD3.LIZ) {
            C1310590kD3.LIZ = true;
        }
        devtoolService = null;
        sGlobalRefQueue = new C1310050kCB();
    }

    public static ILynxDevToolService getDevtoolService() {
        if (devtoolService == null) {
            devtoolService = (ILynxDevToolService) C1285920jZG.LIZJ().LIZ(ILynxDevToolService.class);
        }
        return devtoolService;
    }

    private void initDisplayMetrics() {
        boolean booleanFromExternalEnv = getBooleanFromExternalEnv(EnumC1310010kC7.INIT_DISPLAY_METRICS_IN_ENV, true);
        this.mEnableInitDisplayMetricsInEnv = booleanFromExternalEnv;
        if (booleanFromExternalEnv) {
            DisplayMetricsHolder.LIZLLL(this.mContext, null);
        }
    }

    private void initEnableDataListFix() {
        this.mEnableDataListFix = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_DATA_LIST_FIX, false);
    }

    private void initFSPConfig() {
        String stringFromExternalEnv;
        boolean booleanFromExternalEnv = getBooleanFromExternalEnv(EnumC1310010kC7.FSP_ENABLE, false);
        this.mEnableFSP = booleanFromExternalEnv;
        if (!booleanFromExternalEnv || (stringFromExternalEnv = getStringFromExternalEnv(EnumC1310010kC7.FSP_CONFIG_JSON_STRING)) == null) {
            return;
        }
        try {
            this.mFSPConfig = (HashMap) new Gson().LJII(stringFromExternalEnv, HashMap.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static LynxEnv inst() {
        if (sInstance == null) {
            synchronized (LynxEnv.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LynxEnv();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void registerNativeMemoryPressureCallback() {
        C1310210kCR c1310210kCR = C1310210kCR.LIZIZ;
        c1310210kCR.LIZ.addIfAbsent(new MemoryPressureCallback() { // from class: X.0kCS
            @Override // com.lynx.base.memory.MemoryPressureCallback
            public final void onPressure(int i) {
                LynxEnv.nativeOnMemoryPressure(i);
            }
        });
    }

    public HashMap<String, String> GetPlatformEnvDebugDescription() {
        String stringFromExternalEnv;
        HashMap<String, String> map = new HashMap<>();
        for (EnumC1310010kC7 enumC1310010kC7 : EnumC1310010kC7.values()) {
            String description = enumC1310010kC7.getDescription();
            if (description != null && (stringFromExternalEnv = getStringFromExternalEnv(enumC1310010kC7)) != null) {
                map.put(description, stringFromExternalEnv);
            }
        }
        return map;
    }

    public boolean enableFallbackNewEngineRebuild() {
        return getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_FALLBACK_NEW_ENGINE_REBUILD, true);
    }

    public boolean enableSkipUpdateViewportOnInitWhenMeasureSpecEmpty() {
        return getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_SKIP_UPDATE_VIEWPORT_ON_INIT_WHEN_MEASURE_SPEC_EMPTY, false);
    }

    public boolean enableVSyncAlignedMessageLoopGlobal() {
        return getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_VSYNC_ALIGNED_MESSAGE_LOOP_GLOBAL, false);
    }

    public Map<String, C1311670kEn> getBehaviorMap() {
        HashMap map;
        synchronized (this.mBehaviorMap) {
            try {
                map = new HashMap(this.mBehaviorMap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return map;
    }

    public List<C1311670kEn> getBehaviors() {
        ArrayList arrayList;
        synchronized (this.mBehaviorMap) {
            try {
                arrayList = new ArrayList(this.mBehaviorMap.values());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public Boolean getEnableMemoryMonitor() {
        return Boolean.valueOf(getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_MEMORY_MONITOR, false));
    }

    public int getGlobalMemoryReportThresholdMB() {
        return getIntFromExternalEnv(EnumC1310010kC7.GLOBAL_MEMORY_REPORT_THRESHOLD_MB, 30);
    }

    public InputMethodManager getInputMethodManager() {
        if (this.mInputMethodManager == null) {
            this.mInputMethodManager = (InputMethodManager) C786410Ut5.G2(this.mContext, "input_method");
        }
        return this.mInputMethodManager;
    }

    public String getLocale() {
        if (this.mLocale == null) {
            InterfaceC1289280jeg interfaceC1289280jeg = (InterfaceC1289280jeg) C1285920jZG.LIZJ().LIZ(InterfaceC1289280jeg.class);
            if (interfaceC1289280jeg != null) {
                this.mLocale = interfaceC1289280jeg.getLocale();
            } else {
                this.mLocale = C786410Ut5.t2(Locale.getDefault()) + "-" + C2204961BRm.g0(Locale.getDefault(), new C0WZX("dzBzEg4jUdKSQVYySFyof7dL0bSJ", null));
            }
        }
        return this.mLocale;
    }

    public String getMemoryAcquisitionDelaySec() {
        return getStringFromExternalEnv(EnumC1310010kC7.MEMORY_ACQUISITION_DELAY_SEC);
    }

    public long getMemoryReportIntervalSec() {
        String stringFromExternalEnv = getStringFromExternalEnv(EnumC1310010kC7.MEMORY_REPORT_INTERVAL_SEC);
        if (stringFromExternalEnv == null || stringFromExternalEnv.isEmpty()) {
            return 1200L;
        }
        try {
            return CastLongProtector.parseLong(stringFromExternalEnv);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 1200L;
        }
    }

    public LynxModuleFactory getModuleFactory() {
        if (this.mModuleFactory == null) {
            this.mModuleFactory = new LynxModuleFactory();
        }
        return this.mModuleFactory;
    }

    public String getSSRApiVersion() {
        if (this.mIsNativeLibraryLoaded) {
            return nativeGetSSRApiVersion();
        }
        LynxLog.e("LynxEnv", "The local library is not loaded, getting the ssr api version failed.");
        return "";
    }

    public boolean hasInited() {
        return this.hasInit.get();
    }

    public void initBehaviors() {
        synchronized (this.mBehaviorMap) {
            try {
                Iterator it2 = ((ArrayList) new InterfaceC1962507mR() { // from class: X.0jwF
                    @Override // X.InterfaceC1962507mR
                    public final List<C1311670kEn> create() {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C1339200kxC(79));
                        arrayList.add(new C1339200kxC(80));
                        arrayList.add(new C1339200kxC(81));
                        arrayList.add(new C1339200kxC(82));
                        arrayList.add(new C1339200kxC(83));
                        arrayList.add(new C1339200kxC(84));
                        arrayList.add(new C1339200kxC(85));
                        arrayList.add(new C1339200kxC(86));
                        arrayList.add(new C1339200kxC(87));
                        arrayList.add(new C1339200kxC(76));
                        arrayList.add(new C1339200kxC(77));
                        arrayList.add(new C1339200kxC(78));
                        return arrayList;
                    }
                }.create()).iterator();
                while (it2.hasNext()) {
                    addBehaviorInner((C1311670kEn) it2.next());
                }
                if (getBehaviorBundle() != null) {
                    List<C1311670kEn> listCreate = getBehaviorBundle().create();
                    if (listCreate == null) {
                        return;
                    }
                    Iterator<C1311670kEn> it3 = listCreate.iterator();
                    while (it3.hasNext()) {
                        addBehaviorInner(it3.next());
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void initDevtoolEnv() {
        if (!isLynxDebugEnabled() || this.mContext == null) {
            return;
        }
        try {
            if (getDevtoolService() != null) {
                getDevtoolService().devtoolEnvInit(this.mContext);
            } else {
                LynxLog.w("LynxEnv", "DevtoolService not yet registered when initDevtoolEnv");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initDevtoolEnv failed: ");
            sbLIZ.append(th.toString());
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void initEnableCheckAccessFromNonUiThread() {
        this.mEnableCheckAccessFromNonUIThread = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_CHECK_ACCESS_FROM_NON_UI_THREAD, false);
    }

    public void initEnableComponentStatisticReport() {
        this.mEnableComponentStatisticReport = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_COMPONENT_STATISTIC_REPORT, false);
    }

    public void initEnableGenericResourceFetcher() {
        this.mEnableGenericResourceFetcher = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_GENERIC_RESOURCE_FETCHER, false);
    }

    public void initEnableLazyInitA11y() {
        this.mEnableLazyInitA11y = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_LAZY_INIT_A11Y, true);
    }

    public void initEnableRefreshRateOpt() {
        this.mEnableRefreshRateOpt = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_REFRESH_RATE_OPT, true);
    }

    public void initEnableSvgAsync() {
        this.mEnableSVGAsync = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_SVG_ASYNC, false);
    }

    public void initEnableTextBoringLayout() {
        this.mEnableTextBoringLayout = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_TEXT_BORING_LAYOUT, true);
    }

    public void initEnableTextLayoutCache() {
        this.mEnableTextLayoutCache = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_TEXT_LAYOUT_CACHE, true);
    }

    public void initEnableTransformForPositionCalculation() {
        this.mEnableTransformForPositionCalculation = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_TRANSFORM_FOR_POSITION_CALCULATION, false);
    }

    public void initImageExperimentSettings() {
        this.mDisableImagePostProcessor = getBooleanFromExternalEnv(EnumC1310010kC7.DISABLE_POST_PROCESSOR, false);
        this.mEnableLoadImageFromService = getBooleanFromExternalEnv(EnumC1310010kC7.USE_NEW_IMAGE, false);
        this.mEnableImageAsyncRedirect = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_IMAGE_ASYNC_REDIRECT, false);
        this.mEnableImageAsyncRedirectOnCreate = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_IMAGE_ASYNC_REDIRECT_ON_CREATE, false);
        this.mEnableImageAsyncRequest = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_IMAGE_ASYNC_REQUEST, false);
        this.mEnableImageEventReport = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_IMAGE_EVENT_REPORT, false);
        this.mEnableImageAsyncLayout = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_IMAGE_ASYNC_LAYOUT, false);
        this.mEnableImageRequestOptimize = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_IMAGE_REQUEST_OPTIMIZE, false);
        this.mEnableFlattenImageFlickerFix = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_FLATTEN_IMAGE_FLICKER_FIX, true);
        this.mDisableBigImageHelper = getBooleanFromExternalEnv(EnumC1310010kC7.DISABLE_BIG_IMAGE_HELPER, false);
    }

    public void initMemoryReportExperimentSettings() {
        this.mEnableImageMemoryReport = getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_IMAGE_MEMORY_REPORT, false);
    }

    public void initNativeGlobalPool() {
        if (this.mIsNativeLibraryLoaded) {
            nativePrepareLynxGlobalPool();
        }
    }

    public void initNativeUIThread() {
        if (this.mIsNativeUIThreadInited) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 50));
    }

    public boolean isSettingsEnableNewImage() {
        return getBooleanFromExternalEnv(EnumC1310010kC7.USE_NEW_IMAGE, true);
    }

    public void lazyInitIfNeeded() {
        synchronized (this.mLazyInitLock) {
            try {
                if (this.hasInit.get() || this.hasCalledInitializer) {
                    return;
                }
                InterfaceC1310400kCk interfaceC1310400kCk = C1310410kCl.LIZ;
                this.hasCalledInitializer = interfaceC1310400kCk != null;
                if (interfaceC1310400kCk != null) {
                    interfaceC1310400kCk.init();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void onLowMemory() {
        C1301010jxb.LIZ.LIZ.evictAll();
    }

    public void postUpdateSettings() {
        if (this.mIsNativeLibraryLoaded) {
            nativeCleanExternalCache();
            FluencySample.LIZ();
        }
    }

    public boolean shouldForceLayoutOnBackgroundThread() {
        return getBooleanFromExternalEnv(EnumC1310010kC7.FORCE_LAYOUT_ON_BACKGROUND_THREAD, false);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0jje] */
    private void initVsyncMonitor() {
        DisplayManager displayManager;
        if (!enableFreshRateOpt() || (displayManager = (DisplayManager) C786410Ut5.G2(this.mContext, "display")) == null) {
            return;
        }
        VSyncMonitor.LIZIZ = displayManager;
        VSyncMonitor.LIZIZ();
        if (VSyncMonitor.LJ == null) {
            VSyncMonitor.LJ = new DisplayManager.DisplayListener() { // from class: X.0jje
                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayAdded(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayRemoved(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public final void onDisplayChanged(int i) {
                    if (i == 0 && VSyncMonitor.LIZIZ != null) {
                        VSyncMonitor.LIZIZ();
                    }
                }
            };
        }
        displayManager.registerDisplayListener(VSyncMonitor.LJ, new BPEAHandler(Looper.getMainLooper()));
        VSyncMonitor.LIZLLL = true;
    }

    public HashMap<String, String> GetNativeEnvDebugDescription() {
        try {
            return (HashMap) GsonProtectorUtils.fromJson(new Gson(), nativeGetDebugEnvDescription(), HashMap.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Convert native env json string failed. e: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public void initDevtool() {
        initDevtoolComponentAttachSwitch();
        initDevtoolEnv();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:54:0x007f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public void initDevtoolComponentAttachSwitch() {
        /*
            r4 = this;
            com.lynx.tasm.service.ILynxDevToolService r0 = getDevtoolService()
            if (r0 != 0) goto Le
            java.lang.String r1 = "LynxEnv"
            java.lang.String r0 = "attachDevToolComponent: DevTool service is null."
            com.lynx.base.log.LynxLog.i(r1, r0)
            return
        Le:
            com.lynx.tasm.service.ILynxDevToolService r0 = getDevtoolService()
            boolean r0 = r0.isDevtoolAttached()
            if (r0 != 0) goto L20
            java.lang.String r1 = "LynxEnv"
            java.lang.String r0 = "attachDevToolComponent: we are asked not to."
            com.lynx.base.log.LynxLog.i(r1, r0)
            return
        L20:
            com.lynx.devtoolwrapper.DevToolLifecycle r3 = com.lynx.devtoolwrapper.DevToolLifecycle.LIZ()
            monitor-enter(r3)
            X.0kC9 r1 = r3.LIZ     // Catch: java.lang.Throwable -> L87
            X.0kC9 r0 = X.EnumC1310030kC9.UNAVAILABLE     // Catch: java.lang.Throwable -> L85
            if (r1 != r0) goto L44
            java.lang.String r1 = "DevToolLifecycle"
            java.lang.String r0 = "DevTool attached. Transitioning to ATTACHED."
            com.lynx.base.log.LynxLog.i(r1, r0)     // Catch: java.lang.Throwable -> L3e
            X.0kC9 r0 = X.EnumC1310030kC9.ATTACHED     // Catch: java.lang.Throwable -> L3c
            r3.LIZ = r0     // Catch: java.lang.Throwable -> L89
            r3.LIZLLL()     // Catch: java.lang.Throwable -> L3a
            goto L5b
        L3a:
            r0 = move-exception
            goto L8a
        L3c:
            r0 = move-exception
            goto L8a
        L3e:
            r0 = move-exception
            goto L8a
        L40:
            r0 = move-exception
            goto L8a
        L42:
            r0 = move-exception
            goto L8a
        L44:
            java.lang.String r2 = "DevToolLifecycle"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "onAttached() called but state is "
            r1.append(r0)     // Catch: java.lang.Throwable -> L7d
            X.0kC9 r0 = r3.LIZ     // Catch: java.lang.Throwable -> L7b
            r1.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L77
            com.lynx.base.log.LynxLog.w(r2, r0)     // Catch: java.lang.Throwable -> L75
        L5b:
            monitor-exit(r3)
            java.lang.String r1 = "LynxEnv"
            java.lang.String r0 = "attachDevToolComponent: done."
            com.lynx.base.log.LynxLog.i(r1, r0)
            com.lynx.tasm.service.ILynxDevToolService r0 = getDevtoolService()
            boolean r0 = r0.getLynxDebugPresetValue()
            if (r0 == 0) goto L74
            com.lynx.devtoolwrapper.DevToolLifecycle r0 = com.lynx.devtoolwrapper.DevToolLifecycle.LIZ()
            r0.LIZJ()
        L74:
            return
        L75:
            r0 = move-exception
            goto L8a
        L77:
            r0 = move-exception
            goto L8a
        L79:
            r0 = move-exception
            goto L8a
        L7b:
            r0 = move-exception
            goto L8a
        L7d:
            r0 = move-exception
            goto L8a
        L7f:
            r0 = move-exception
            goto L8a
        L81:
            r0 = move-exception
            goto L8a
        L83:
            r0 = move-exception
            goto L8a
        L85:
            r0 = move-exception
            goto L8a
        L87:
            r0 = move-exception
            goto L8a
        L89:
            r0 = move-exception
        L8a:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxEnv.initDevtoolComponentAttachSwitch():void");
    }

    public boolean isDevtoolEnabled() {
        if (isLynxDebugEnabled()) {
            return C1310020kC8.LIZIZ().LIZ(EnumC1310010kC7.SP_KEY_ENABLE_DEVTOOL, false);
        }
        return false;
    }

    public boolean isEnableDevtoolDebug() {
        return isDevtoolEnabled();
    }

    public boolean isEnableLogBox() {
        return isLogBoxEnabled();
    }

    public boolean isFspScreenshotEnabled() {
        if (isLynxDebugEnabled()) {
            return C1310020kC8.LIZIZ().LIZ(EnumC1310010kC7.SP_KEY_ENABLE_FSP_SCREENSHOT, false);
        }
        return false;
    }

    public boolean isHighlightTouchEnabled() {
        return C1310020kC8.LIZIZ().LIZIZ && isLynxDebugEnabled();
    }

    public boolean isLaunchRecordEnabled() {
        if (DevToolLifecycle.LIZ().LIZIZ()) {
            return C1310020kC8.LIZIZ().LIZ(EnumC1310010kC7.SP_KEY_ENABLE_LAUNCH_RECORD, false);
        }
        return false;
    }

    public boolean isLogBoxEnabled() {
        return isLynxDebugEnabled() && C1310020kC8.LIZIZ().LIZ(EnumC1310010kC7.SP_KEY_ENABLE_LOGBOX, true) && getDevtoolService() != null && getDevtoolService().getLogBoxPresetValue();
    }

    public boolean isLynxDebugEnabled() {
        return DevToolLifecycle.LIZ().LIZIZ();
    }

    public boolean isNativeLibraryLoaded() {
        lazyInitIfNeeded();
        return this.mIsNativeLibraryLoaded;
    }

    public boolean isPixelCopyEnabled() {
        if (DevToolLifecycle.LIZ().LIZIZ()) {
            return C1310020kC8.LIZIZ().LIZ(EnumC1310010kC7.SP_KEY_ENABLE_PIXEL_COPY, true);
        }
        return true;
    }

    public boolean isRedBoxEnabled() {
        return isLogBoxEnabled();
    }

    public void setAppTracingAllowed() {
        if (TraceEvent.LJFF()) {
            try {
                LynxLog.d("LynxEnv", "turn on systrace for app");
                Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    public boolean disableBigImageHelper() {
        return this.mDisableBigImageHelper;
    }

    public boolean disableImagePostProcessor() {
        return this.mDisableImagePostProcessor;
    }

    public boolean enableCheckAccessFromNonUIThread() {
        return this.mEnableCheckAccessFromNonUIThread;
    }

    public boolean enableComponentStatisticReport() {
        return this.mEnableComponentStatisticReport;
    }

    public boolean enableDataListFix() {
        return this.mEnableDataListFix;
    }

    public boolean enableFSP() {
        return this.mEnableFSP;
    }

    public boolean enableFlattenImageFlickerFix() {
        return this.mEnableFlattenImageFlickerFix;
    }

    public boolean enableFreshRateOpt() {
        return this.mEnableRefreshRateOpt;
    }

    public boolean enableGenericResourceFetcher() {
        return this.mEnableGenericResourceFetcher;
    }

    public boolean enableImageAsyncLayout() {
        return this.mEnableImageAsyncLayout;
    }

    public boolean enableImageAsyncRedirect() {
        return this.mEnableImageAsyncRedirect;
    }

    public boolean enableImageAsyncRedirectOnCreate() {
        return this.mEnableImageAsyncRedirectOnCreate;
    }

    public boolean enableImageAsyncRequest() {
        return this.mEnableImageAsyncRequest;
    }

    public boolean enableImageEventReport() {
        return this.mEnableImageEventReport;
    }

    public boolean enableImageMemoryReport() {
        return this.mEnableImageMemoryReport;
    }

    public boolean enableImageRequestOptimize() {
        return this.mEnableImageRequestOptimize;
    }

    public boolean enableLazyInitA11y() {
        return this.mEnableLazyInitA11y;
    }

    public boolean enableLoadImageFromService() {
        return this.mEnableLoadImageFromService;
    }

    public boolean enableSvgAsync() {
        return this.mEnableSVGAsync;
    }

    public boolean enableTextBoringLayout() {
        return this.mEnableTextBoringLayout;
    }

    public boolean enableTextLayoutCache() {
        return this.mEnableTextLayoutCache;
    }

    public boolean enableTransformForPositionCalculation() {
        return this.mEnableTransformForPositionCalculation;
    }

    public Context getAppContext() {
        return this.mContext;
    }

    public InterfaceC1311150kDx getBackgroundImageLoader() {
        return this.mBgImageLoader;
    }

    public InterfaceC1962507mR getBehaviorBundle() {
        return this.mViewManagerBundle;
    }

    public boolean getCreateViewAsync() {
        return this.mCreateViewAsync;
    }

    public HashMap<String, String> getFSPConfig() {
        return this.mFSPConfig;
    }

    public C1310450kCp getHeroTransitionManager() {
        return C1310440kCo.LIZ;
    }

    public C0X8C getLibraryLoader() {
        return this.mLibraryLoader;
    }

    public C1309780kBk getLynxViewClient() {
        return this.mClient;
    }

    public AbstractC1310570kD1 getNetworkingModuleProvider() {
        return this.mNetworkingModuleProvider;
    }

    public boolean getRecordEnable() {
        return this.mRecordEnable;
    }

    public InterfaceC846710XJl getResProvider() {
        return this.mResProvider;
    }

    public Map<String, AbstractC1300020jw0> getResourceProvider() {
        return this.mGlobalResourceProvider;
    }

    public AbstractC1310390kCj getTemplateProvider() {
        return this.mTemplateProvider;
    }

    public InterfaceC1310580kD2 getThemeResourceProviderProvider() {
        return this.mThemeResourceProvider;
    }

    public boolean getVsyncAlignedFlushGlobalSwitch() {
        return this.mVsyncAlignedFlushGlobalSwitch;
    }

    public boolean isCheckPropsSetter() {
        return this.mIsCheckPropsSetter;
    }

    public boolean isDebugModeEnabled() {
        return this.mDebugModeEnabled;
    }

    public boolean isDevLibraryLoaded() {
        return this.mIsDevLibraryLoaded;
    }

    public boolean isEnableJSDebug() {
        return this.mEnableJSDebug;
    }

    public boolean isLayoutOnlyEnabled() {
        return this.mLayoutOnlyEnabled;
    }

    public static void INVOKESTATIC_com_lynx_tasm_LynxEnv_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    private void addBehaviorInner(C1311670kEn c1311670kEn) {
        String str;
        if (c1311670kEn == null || (str = c1311670kEn.LIZ) == null) {
            return;
        }
        if (this.mBehaviorMap.containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Duplicated Behavior For Name ");
            sbLIZ.append(str);
            sbLIZ.append(" was added, oldBehavior will be override");
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.mBehaviorMap.put(str, c1311670kEn);
    }

    public static String getStringFromExternalEnv(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = sExperimentSettingsMap;
        String strStringValueForTrailKey = concurrentHashMap.get(str);
        if (strStringValueForTrailKey == null) {
            ILynxTrailService iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class);
            if (iLynxTrailService == null || (strStringValueForTrailKey = iLynxTrailService.stringValueForTrailKey(str)) == null) {
                strStringValueForTrailKey = "";
            }
            concurrentHashMap.put(str, strStringValueForTrailKey);
        }
        return strStringValueForTrailKey;
    }

    private void initBase(final C0X8C c0x8c) {
        IBaseNativeLibraryLoader iBaseNativeLibraryLoader;
        if (c0x8c != null) {
            iBaseNativeLibraryLoader = new IBaseNativeLibraryLoader() { // from class: X.0kCL
                @Override // com.lynx.base.IBaseNativeLibraryLoader
                public final void loadLibrary(String str) {
                    c0x8c.loadLibrary(str);
                }
            };
        } else {
            iBaseNativeLibraryLoader = null;
        }
        LynxBaseEnv.inst().init(iBaseNativeLibraryLoader, isDevtoolEnabled());
    }

    public static void setGlobalBytecodeGenerateCallback(LynxBytecodeCallback lynxBytecodeCallback) {
        if (inst().isNativeLibraryLoaded()) {
            nativeSetGlobalBytecodeGenerateCallback(lynxBytecodeCallback);
        }
    }

    public void addBehavior(C1311670kEn c1311670kEn) {
        synchronized (this.mBehaviorMap) {
            try {
                addBehaviorInner(c1311670kEn);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addBehaviors(List<C1311670kEn> list) {
        synchronized (this.mBehaviorMap) {
            try {
                Iterator<C1311670kEn> it2 = list.iterator();
                while (it2.hasNext()) {
                    addBehaviorInner(it2.next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void addLynxViewClient(LynxViewClient lynxViewClient) {
        if (lynxViewClient == null) {
            return;
        }
        this.mClient.LJJIJ(lynxViewClient);
    }

    public void enableDebugMode(boolean z) {
        String str;
        if (z) {
            str = "Turn on DebugMode";
        } else {
            str = "Turn off DebugMode";
        }
        LynxLog.i("LynxEnv", str);
        this.mDebugModeEnabled = z;
        TraceEvent.LIZJ = z;
        C1310020kC8.LIZIZ().LIZJ(EnumC1310010kC7.SP_KEY_ENABLE_DEBUG_MODE, z);
    }

    public void enableDevtool(boolean z) {
        String str;
        if (!DevToolLifecycle.LIZ().LIZIZ()) {
            return;
        }
        if (z) {
            str = "Turn on devtool";
        } else {
            str = "Turn off devtool";
        }
        LynxLog.i("LynxEnv", str);
        if (z) {
            LynxLog.setMinimumLoggingLevel(0);
        } else {
            LynxLog.setMinimumLoggingLevel(2);
        }
        C1310020kC8.LIZIZ().LIZJ(EnumC1310010kC7.SP_KEY_ENABLE_DEVTOOL, z);
        C1310020kC8.LIZLLL(EnumC1310010kC7.SP_KEY_ENABLE_DEVTOOL, z);
    }

    public void enableFspScreenshot(boolean z) {
        if (!DevToolLifecycle.LIZ().LIZIZ()) {
            return;
        }
        C1310020kC8.LIZIZ().LIZJ(EnumC1310010kC7.SP_KEY_ENABLE_FSP_SCREENSHOT, z);
    }

    public void enableHighlightTouch(boolean z) {
        String str;
        if (!DevToolLifecycle.LIZ().LIZIZ()) {
            return;
        }
        if (z) {
            str = "Turn on highlighttouch";
        } else {
            str = "Turn off highlighttouch";
        }
        LynxLog.i("LynxEnv", str);
        C1310020kC8.LIZIZ().LIZIZ = z;
    }

    public void enableLaunchRecord(boolean z) {
        String str;
        if (!DevToolLifecycle.LIZ().LIZIZ()) {
            return;
        }
        if (z) {
            str = "Turn on launch record";
        } else {
            str = "Turn off launch record";
        }
        LynxLog.i("LynxEnv", str);
        C1310020kC8.LIZIZ().LIZJ(EnumC1310010kC7.SP_KEY_ENABLE_LAUNCH_RECORD, z);
    }

    public void enableLayoutOnly(boolean z) {
        String str;
        if (z) {
            str = "Turn on LayoutOnly";
        } else {
            str = "Turn off LayoutOnly";
        }
        LynxLog.i("LynxEnv", str);
        this.mLayoutOnlyEnabled = z;
    }

    public void enableLogBox(boolean z) {
        String str;
        if (!DevToolLifecycle.LIZ().LIZIZ()) {
            return;
        }
        if (z) {
            str = "Turn on logbox";
        } else {
            str = "Turn off logbox";
        }
        LynxLog.i("LynxEnv", str);
        C1310020kC8.LIZIZ().LIZJ(EnumC1310010kC7.SP_KEY_ENABLE_LOGBOX, z);
        C1310020kC8.LIZLLL(EnumC1310010kC7.SP_KEY_ENABLE_LOGBOX, z);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void enableLynxDebug(boolean z) throws Throwable {
        String str;
        if (z) {
            str = "enable lynx debug";
        } else {
            str = "disable lynx debug";
        }
        LynxLog.i("LynxEnv", str);
        int iOrdinal = DevToolLifecycle.LIZ().LIZ.ordinal();
        EnumC1310030kC9 enumC1310030kC9 = EnumC1310030kC9.ATTACHED;
        if (iOrdinal >= enumC1310030kC9.ordinal()) {
            if (z) {
                DevToolLifecycle.LIZ().LIZJ();
                initDevtoolEnv();
                return;
            }
            DevToolLifecycle devToolLifecycleLIZ = DevToolLifecycle.LIZ();
            synchronized (devToolLifecycleLIZ) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (devToolLifecycleLIZ.LIZ != EnumC1310030kC9.ENABLED) {
                                        try {
                                            try {
                                                if (devToolLifecycleLIZ.LIZ != EnumC1310030kC9.INITIALIZED) {
                                                    try {
                                                        try {
                                                            if (devToolLifecycleLIZ.LIZ == EnumC1310030kC9.CONNECTED) {
                                                            }
                                                            return;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                    devToolLifecycleLIZ.LIZLLL();
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    throw th;
                                }
                                devToolLifecycleLIZ.LIZ = enumC1310030kC9;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            LynxLog.i("DevToolLifecycle", "DevTool disabled. Transitioning to ATTACHED.");
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
            }
        } else if (getDevtoolService() != null) {
            getDevtoolService().setLynxDebugPresetValue(z);
        }
    }

    public void enablePixelCopy(boolean z) {
        if (!DevToolLifecycle.LIZ().LIZIZ()) {
            return;
        }
        C1310020kC8.LIZIZ().LIZJ(EnumC1310010kC7.SP_KEY_ENABLE_PIXEL_COPY, z);
    }

    public void enableRedBox(boolean z) {
        enableLogBox(z);
    }

    public void initLibraryLoader(C0X8C c0x8c) {
        if (c0x8c != null) {
            this.mLibraryLoader = c0x8c;
        } else {
            if (this.mLibraryLoader != null) {
                return;
            }
            this.mLibraryLoader = new C0X8C() { // from class: X.0kCT
                @Override // X.C0X8C
                public final void loadLibrary(String str) {
                    LynxEnv.INVOKESTATIC_com_lynx_tasm_LynxEnv_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
                }
            };
        }
    }

    public synchronized boolean initNativeLibraries(C0X8C c0x8c) {
        if (this.mIsNativeLibraryLoaded) {
            return true;
        }
        initLibraryLoader(c0x8c);
        try {
            if (!C1299180jue.LIZ.booleanValue()) {
                this.mLibraryLoader.loadLibrary("quick");
            }
            if (!LynxBaseEnv.inst().isNativeLibraryLoaded()) {
                initBase(this.mLibraryLoader);
            }
            this.mLibraryLoader.loadLibrary("lynx");
            if (!C0VEK.LIZ().LIZ) {
                this.mLibraryLoader.loadLibrary("lynxtrace");
                C0VEK.LIZ().LIZ = true;
                TraceEvent.LIZIZ = true;
            }
            this.mIsNativeLibraryLoaded = true;
            LynxLog.i("LynxEnv", "Loading native libraries succeeded");
            return true;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e.getMessage());
            sbLIZ.append(". Loader used was: ");
            sbLIZ.append(this.mLibraryLoader);
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public void initTrace(Context context) {
        if (this.mIsNativeLibraryLoaded && TraceEvent.LIZJ) {
            try {
                TraceController.getInstance().init(context);
                TraceController.getInstance().startStartupTracingIfNeeded();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("LynxEnv", "trace controller init failed");
            }
        }
    }

    public void loadNativeLynxLibrary(C0X8C c0x8c) {
        initNativeLibraries(c0x8c);
    }

    public void onPiperInvoked(Map<String, Object> map) {
        this.mClient.LJIJI(map);
    }

    public void removeLynxViewClient(LynxViewClient lynxViewClient) {
        if (lynxViewClient == null) {
            return;
        }
        this.mClient.LL.remove(lynxViewClient);
    }

    public void reportModuleCustomError(String str) {
        this.mClient.LJFF(new LynxError(str, 99800));
    }

    public void setBackgroundImageLoader(InterfaceC1311150kDx interfaceC1311150kDx) {
        this.mBgImageLoader = interfaceC1311150kDx;
    }

    public void setCheckPropsSetter(boolean z) {
        this.mIsCheckPropsSetter = z;
    }

    public void setCreateViewAsync(boolean z) {
        String str;
        this.mCreateViewAsync = z;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        LynxLog.i("LynxEnv_mCreateViewAsync:", str);
    }

    public void setDebug(boolean z) {
        this.mDebug = z;
    }

    public void setDebugMode(Context context) {
        boolean zLIZ = C1310020kC8.LIZIZ().LIZ(EnumC1310010kC7.SP_KEY_ENABLE_DEBUG_MODE, false);
        this.mDebugModeEnabled = zLIZ;
        TraceEvent.LIZJ = zLIZ;
    }

    public void setDevLibraryLoaded(boolean z) {
        this.mIsDevLibraryLoaded = z;
    }

    public void setEnableDevtoolDebug(boolean z) {
        enableDevtool(z);
    }

    public void setEnableJSDebug(boolean z) {
        this.mEnableJSDebug = z;
    }

    public void setEnableLogBox(boolean z) {
        enableLogBox(z);
    }

    public void setLastUrl(String str) {
        this.mLastUrl = str;
    }

    public void setLocale(String str) {
        this.mLocale = str;
    }

    public void setNativeLibraryLoaded(boolean z) {
        this.mIsNativeLibraryLoaded = z;
    }

    public void setNetworkingModuleProvider(AbstractC1310570kD1 abstractC1310570kD1) {
        this.mNetworkingModuleProvider = abstractC1310570kD1;
    }

    public void setPiperMonitorState(boolean z) {
        setBooleanLocalEnv(EnumC1310010kC7.ENABLE_PIPER_MONITOR, z);
    }

    public void setRecordEnable(boolean z) {
        this.mRecordEnable = z;
    }

    public void setResProvider(InterfaceC846710XJl interfaceC846710XJl) {
        this.mResProvider = interfaceC846710XJl;
    }

    public void setSettings(HashMap<String, Object> map) {
        sExperimentSettingsMap.clear();
        postUpdateSettings();
    }

    public void setThemeResourceProvider(InterfaceC1310580kD2 interfaceC1310580kD2) {
        this.mThemeResourceProvider = interfaceC1310580kD2;
    }

    public void setUpNativeMemoryTracer(Context context) {
        LynxNativeMemoryTracer.LIZ(context);
    }

    public void setVsyncAlignedFlushGlobalSwitch(boolean z) {
        this.mVsyncAlignedFlushGlobalSwitch = z;
        setBooleanLocalEnv(EnumC1310010kC7.ENABLE_VSYNC_ALIGNED_FLUSH, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mVsyncAlignedFlushGlobalSwitch: ");
        sbLIZ.append(this.mVsyncAlignedFlushGlobalSwitch);
        LynxLog.i("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setupAutolinkGlobal(Context context) {
        setupAutolinkGlobal(context, "com.lynx.tasm.library.LynxAutolinkGenerated");
    }

    public void trimMemory(int i) {
        TraceEvent.LIZIZ("LynxEnv.trimMemory");
        Iterator<MemoryPressureCallback> it2 = C1310210kCR.LIZIZ.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onPressure(i);
        }
        TraceEvent.LJII("LynxEnv.trimMemory");
    }

    public boolean tryToLoadV8Bridge(boolean z) {
        synchronized (this) {
            try {
                if (this.mHasV8BridgeLoadSuccess.booleanValue()) {
                    return true;
                }
                try {
                    C0X8C c0x8c = this.mLibraryLoader;
                    if (c0x8c != null) {
                        c0x8c.loadLibrary("lynx_v8_bridge");
                    } else {
                        INVOKESTATIC_com_lynx_tasm_LynxEnv_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lynx_v8_bridge");
                    }
                    this.mHasV8BridgeLoadSuccess = Boolean.TRUE;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("try to load library lynx_v8_bridge error");
                    sbLIZ.append(th.toString());
                    LynxLog.w("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
                    this.mHasV8BridgeLoadSuccess = Boolean.FALSE;
                }
                return this.mHasV8BridgeLoadSuccess.booleanValue();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static String getStringFromExternalEnv(EnumC1310010kC7 enumC1310010kC7) {
        return getStringFromExternalEnv(enumC1310010kC7.getDescription());
    }

    public static void clearBytecode(String str, boolean z) {
        if (inst().isNativeLibraryLoaded()) {
            nativeClearBytecode(str, z);
        }
    }

    private Class<?> findAutolinkGeneratedClass(Context context, String str) throws ClassNotFoundException {
        ClassLoader classLoader = context.getClassLoader();
        try {
            return Class.forName(str, true, classLoader);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            ClassLoader contextClassLoader = C786410Ut5.u3().getContextClassLoader();
            if (contextClassLoader != null && contextClassLoader != classLoader) {
                return Class.forName(str, true, contextClassLoader);
            }
            throw e;
        }
    }

    public static boolean getBooleanFromExternalEnv(EnumC1310010kC7 enumC1310010kC7, boolean z) {
        String stringFromExternalEnv = getStringFromExternalEnv(enumC1310010kC7.getDescription());
        if (stringFromExternalEnv != null && !stringFromExternalEnv.isEmpty()) {
            if (!"1".equals(stringFromExternalEnv) && !"true".equalsIgnoreCase(stringFromExternalEnv)) {
                return false;
            }
            return true;
        }
        return z;
    }

    public static int getIntFromExternalEnv(EnumC1310010kC7 enumC1310010kC7, int i) {
        String stringFromExternalEnv = getStringFromExternalEnv(enumC1310010kC7.getDescription());
        if (stringFromExternalEnv != null && !stringFromExternalEnv.isEmpty()) {
            try {
                return CastIntegerProtector.parseInt(stringFromExternalEnv);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return i;
    }

    public static void onJavaTaskOnConcurrentLoop(long j, int i) {
        Object objRemove;
        C1310050kCB c1310050kCB = sGlobalRefQueue;
        if (j < 0) {
            c1310050kCB.getClass();
            objRemove = null;
        } else {
            objRemove = c1310050kCB.LIZ.remove(Long.valueOf(j));
        }
        Runnable runnable = (Runnable) objRemove;
        if (runnable == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to get java task for id ");
            sbLIZ.append(j);
            sbLIZ.append(" type ");
            sbLIZ.append(i);
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        runnable.run();
    }

    public static boolean runJavaTaskOnConcurrentLoop(Runnable runnable, int i) {
        C1310050kCB c1310050kCB = sGlobalRefQueue;
        if (runnable == null) {
            c1310050kCB.getClass();
        } else {
            long jIncrementAndGet = c1310050kCB.LIZIZ.incrementAndGet();
            c1310050kCB.LIZ.put(Long.valueOf(jIncrementAndGet), runnable);
            if (jIncrementAndGet >= 0) {
                nativeRunJavaTaskOnConcurrentLoop(jIncrementAndGet, i);
                return true;
            }
        }
        LynxLog.e("LynxEnv", "Failed to get free slot for java task");
        return false;
    }

    public void addResourceProvider(String str, AbstractC1300020jw0 abstractC1300020jw0) {
        if (!TextUtils.isEmpty(str)) {
            this.mGlobalResourceProvider.put(str, abstractC1300020jw0);
        }
    }

    public void registerModule(String str, Class<? extends LynxModule> cls) {
        registerModule(str, cls, null);
    }

    public void setBooleanLocalEnv(EnumC1310010kC7 enumC1310010kC7, boolean z) {
        String str;
        String description = enumC1310010kC7.getDescription();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        nativeSetLocalEnv(description, str);
    }

    public void setStringLocalEnv(EnumC1310010kC7 enumC1310010kC7, String str) {
        nativeSetLocalEnv(enumC1310010kC7.getDescription(), str);
    }

    public void setUpNativeMemoryTracer(Context context, int i) {
        if (i > 0) {
            LynxNativeMemoryTracer.LIZ = i;
            LynxNativeMemoryTracer.LIZ(context);
            return;
        }
        throw new IllegalArgumentException("min watched size should be greater than 0");
    }

    public boolean setupAutolinkGlobal(Context context, String str) {
        String string;
        try {
            Method declaredMethod = findAutolinkGeneratedClass(context, str).getDeclaredMethod("setupGlobal", Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, context);
            return true;
        } catch (ClassNotFoundException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Lynx autolink generated entry is unavailable: ");
            sbLIZ.append(str);
            LynxLog.d("LynxEnv", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to access Lynx autolink generated entry: ");
            sbLIZ2.append(e2.getMessage());
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ2));
            return true;
        } catch (NoSuchMethodException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Lynx autolink generated entry is unavailable: ");
            sbLIZ3.append(str);
            LynxLog.d("LynxEnv", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            Throwable targetException = e4.getTargetException();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Failed to setup Lynx autolink generated entry: ");
            if (targetException != null) {
                string = targetException.toString();
            } else {
                string = e4.toString();
            }
            sbLIZ4.append(string);
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ4));
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Failed to load Lynx autolink generated entry: ");
            sbLIZ5.append(th);
            LynxLog.e("LynxEnv", C2188811AlT.LIZIZ(sbLIZ5));
            return true;
        }
    }

    public void registerModule(String str, Class<? extends LynxModule> cls, Object obj) {
        getModuleFactory().LIZJ(str, cls, obj);
    }

    public static void reportPiperInvoked(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("module-name", str);
        map.put("method-name", str2);
        map.put("url", str4);
        if (!str3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str3);
            map.put("params", arrayList);
        }
        inst().onPiperInvoked(map);
    }

    public synchronized void init(Application application, C0X8C c0x8c, AbstractC1310390kCj abstractC1310390kCj, InterfaceC1962507mR interfaceC1962507mR) {
        init(application, c0x8c, abstractC1310390kCj, interfaceC1962507mR, null);
    }

    public synchronized void init(Application application, C0X8C c0x8c, AbstractC1310390kCj abstractC1310390kCj, InterfaceC1962507mR interfaceC1962507mR, InterfaceC1310550kCz interfaceC1310550kCz) {
        C1285920jZG.LIZJ().LIZIZ(application);
        initBase(c0x8c);
        initDevtoolComponentAttachSwitch();
        if (this.hasInit.get()) {
            LynxLog.w("LynxEnv", "LynxEnv is already initialized");
            return;
        }
        this.hasInit.set(true);
        LynxLog.i("LynxEnv", "LynxEnv start init");
        setAppTracingAllowed();
        if (!PropsHolderAutoRegister.LIZ) {
            PropsHolderAutoRegister.LIZ = true;
        }
        this.mContext = application;
        this.mViewManagerBundle = interfaceC1962507mR;
        this.mTemplateProvider = abstractC1310390kCj;
        this.mLibraryLoader = c0x8c;
        initBehaviors();
        setupAutolinkGlobal(application);
        C1310020kC8 c1310020kC8LIZIZ = C1310020kC8.LIZIZ();
        Application application2 = this.mContext;
        c1310020kC8LIZIZ.getClass();
        if (application2 == null) {
            LynxLog.e("DevToolSettings", "init with null context");
        } else {
            c1310020kC8LIZIZ.LIZ = C810670Vr7.LIZJ(application2, 0, "lynx_env_config");
        }
        setDebugMode(this.mContext);
        initDevtoolEnv();
        if (!initNativeLibraries(c0x8c)) {
            return;
        }
        initTrace(this.mContext);
        postUpdateSettings();
        WebAssemblyBridge.LIZ();
        initNativeUIThread();
        initDisplayMetrics();
        initNativeGlobalPool();
        initImageExperimentSettings();
        initMemoryReportExperimentSettings();
        initEnableComponentStatisticReport();
        initEnableTransformForPositionCalculation();
        initEnableSvgAsync();
        initEnableGenericResourceFetcher();
        initEnableTextBoringLayout();
        initEnableRefreshRateOpt();
        initEnableCheckAccessFromNonUiThread();
        initEnableLazyInitA11y();
        initEnableTextLayoutCache();
        initEnableDataListFix();
        initFSPConfig();
        ICURegister.LIZ(this.mLibraryLoader);
        InterfaceC1310130kCJ interfaceC1310130kCJ = (InterfaceC1310130kCJ) C1285920jZG.LIZJ().LIZ(InterfaceC1310130kCJ.class);
        if (interfaceC1310130kCJ != null) {
            interfaceC1310130kCJ.onLynxEnvSetup();
        } else {
            LynxLog.w("LynxEnv", "LynxEnv failed to get LynxExtensionService");
        }
        ILynxImageService iLynxImageService = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        if (iLynxImageService instanceof ILynxImageServiceExtension) {
            ((ILynxImageServiceExtension) iLynxImageService).onLynxEnvSetup();
        } else {
            LynxLog.w("LynxEnv", "LynxEnv failed to get ILynxImageServiceExtension");
        }
        initVsyncMonitor();
        registerNativeMemoryPressureCallback();
    }
}
