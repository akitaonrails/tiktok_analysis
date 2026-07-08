package com.lynx.tasm;

import X.AbstractC1299950jvt;
import X.AbstractC1300020jw0;
import X.AbstractC1310390kCj;
import X.C0N2X;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X80;
import X.C0X87;
import X.C1285920jZG;
import X.C1289620jfE;
import X.C1289810jfX;
import X.C1297430jrp;
import X.C1297470jrt;
import X.C1298340jtI;
import X.C1298530jtb;
import X.C1298720jtu;
import X.C1298840ju6;
import X.C1299170jud;
import X.C1299220jui;
import X.C1299280juo;
import X.C1299310jur;
import X.C1299320jus;
import X.C1299340juu;
import X.C1299860jvk;
import X.C1299870jvl;
import X.C1299920jvq;
import X.C1299930jvr;
import X.C1300050jw3;
import X.C1301600jyY;
import X.C1303600k1m;
import X.C1309670kBZ;
import X.C1309750kBh;
import X.C1309760kBi;
import X.C1309770kBj;
import X.C1309780kBk;
import X.C1309800kBm;
import X.C1309850kBr;
import X.C1309870kBt;
import X.C1309900kBw;
import X.C1309920kBy;
import X.C1309930kBz;
import X.C1309950kC1;
import X.C1310000kC6;
import X.C1310080kCE;
import X.C1310090kCF;
import X.C1310200kCQ;
import X.C1310250kCV;
import X.C1310290kCZ;
import X.C1310330kCd;
import X.C1310490kCt;
import X.C1310660kDA;
import X.C1311380kEK;
import X.C1311390kEL;
import X.C1311400kEM;
import X.C1311720kEs;
import X.C1311860kF6;
import X.C2188811AlT;
import X.EnumC1299430jv3;
import X.EnumC1299880jvm;
import X.EnumC1300260jwO;
import X.EnumC1309880kBu;
import X.EnumC1309890kBv;
import X.EnumC1309960kC2;
import X.EnumC1309970kC3;
import X.EnumC1309980kC4;
import X.EnumC1310010kC7;
import X.EnumC1980107pH;
import X.EnumC665490Q8l;
import X.InterfaceC1289180jeW;
import X.InterfaceC1290540jgi;
import X.InterfaceC1297320jre;
import X.InterfaceC1297440jrq;
import X.InterfaceC1298780ju0;
import X.InterfaceC1299290jup;
import X.InterfaceC1299780jvc;
import X.InterfaceC1299820jvg;
import X.InterfaceC1299990jvx;
import X.InterfaceC1300010jvz;
import X.InterfaceC1303630k1p;
import X.InterfaceC1309730kBf;
import X.InterfaceC1310130kCJ;
import X.InterfaceC1310260kCW;
import X.InterfaceC1310280kCY;
import X.InterfaceC1310380kCi;
import X.InterfaceC1310460kCq;
import X.InterfaceC1310470kCr;
import X.InterfaceC1310500kCu;
import X.InterfaceC1310560kD0;
import X.InterfaceC1310620kD6;
import X.InterfaceC1311410kEN;
import X.InterfaceC1311590kEf;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS16S1300000_20;
import Y.ARunnableS1S2100100_20;
import Y.ARunnableS89S0200000_20;
import android.app.Activity;
import android.content.Context;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.devtoolwrapper.LynxDevtool;
import com.lynx.jsbridge.LynxAccessibilityModule;
import com.lynx.jsbridge.LynxExposureModule;
import com.lynx.jsbridge.LynxFetchModule;
import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleFactory;
import com.lynx.jsbridge.LynxResourceModule;
import com.lynx.jsbridge.LynxSetModule;
import com.lynx.jsbridge.LynxTextInfoModule;
import com.lynx.jsbridge.LynxUIMethodModule;
import com.lynx.jsbridge.h;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.NativeFacade;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.CleanupReference;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.LynxEngineProxy;
import com.lynx.tasm.core.LynxLayoutProxy;
import com.lynx.tasm.core.resource.LynxResourceLoader;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.lynx.tasm.performance.PerformanceController;
import com.lynx.tasm.performance.longtasktiming.LynxLongTaskMonitor;
import com.lynx.tasm.service.ILynxDevToolService;
import com.lynx.tasm.service.ILynxTrailService;
import com.lynx.tasm.service.ILynxTrailServiceExtension;
import com.lynx.tasm.service.security.ILynxSecurityService;
import com.lynx.tasm.utils.CallStackUtil;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import j27.s;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class LynxTemplateRender implements InterfaceC1310620kD6, InterfaceC1299820jvg, InterfaceC1298780ju0 {
    public static final boolean LJJZZI = LynxEnv.getBooleanFromExternalEnv(EnumC1310010kC7.VSYNC_ALIGNED_FLUSH_EXP_KEY, false);
    public C1310250kCV LIZ;
    public C1310080kCE LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public LynxBackgroundRuntime LJ;
    public Map<String, String> LJFF;
    public String LJI;
    public volatile boolean LJII;
    public C1310200kCQ LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public EnumC665490Q8l LJIIL;
    public C1309760kBi LJIILL;
    public TemplateBundle LJIILLIIL;
    public C1309760kBi LJIIZILJ;
    public InterfaceC1300010jvz LJIJ;
    public InterfaceC1299990jvx LJIJI;
    public InterfaceC1299290jup LJIJJ;
    public C1299310jur LJIJJLI;
    public LynxModuleFactory LJIL;
    public C1298340jtI LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public C1310660kDA LJJII;
    public boolean LJJIII;
    public C1299170jud LJJIIJ;
    public TemplateData LJJIIJZLJL;
    public long LJJIJ;
    public long LJJIJIIJI;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public float LJJIL;
    public EnumC1299430jv3 LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public InterfaceC1309730kBf LJJJIL;
    public final C1289810jfX LJJJJ;
    public final PerformanceController LJJJJI;
    public volatile String LJJJJIZL;
    public AbstractC1310390kCj LJJJJJ;
    public boolean LJJJJJL;
    public final boolean LJJJJL;
    public final boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public JSProxy LJJJJZI;
    public C1299340juu LJJJLIIL;
    public LynxEngineProxy LJJJLL;
    public LynxLayoutProxy LJJJLZIJ;
    public final Map<Double, PlatformCallBack> LJJJZ;
    public final AtomicBoolean LJJL;
    public long LJJLI;
    public volatile NativeFacade LJJLIIIIJ;
    public long LJJLIIIJ;
    public final AtomicInteger LJJLIIIJILLIZJL;
    public final SparseArray<InterfaceC1310260kCW> LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public boolean LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public boolean LJJLIIJ;
    public WeakReference<TasmPlatformInvoker> LJJLIL;
    public final AtomicInteger LJJLJ;
    public final TemplateData LJJLJLI;
    public LynxEngine LJJLL;
    public LynxModuleFactory LJJZ;
    public Context mContext;
    public LynxDevtool mDevTool;
    public LynxResourceLoader mLoader;
    public s mLynxContext;
    public LynxResourceLoader mResourceLoader;
    public final C1309780kBk LJIILIIL = new C1309780kBk();
    public final C1309950kC1 LJIILJJIL = new C1309950kC1();
    public long LJJIIZ = -1;
    public final List<TemplateData> LJJIIZI = new CopyOnWriteArrayList();
    public volatile boolean LJJIJIIJIL = false;
    public boolean LJJIJLIJ = true;

    private native void nativeAttachEngineToUIThread(long j, long j2);

    public static native void nativeAttachRuntime(long j, long j2, long j3);

    public static native long nativeCreate(long j, Object obj, Object obj2, Object obj3, int i, boolean z, boolean z2, int i2, int i3, float f, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, Object obj4, long j2, long j3, boolean z9, boolean z10, boolean z11, boolean z12, int i4, boolean z13, boolean z14, long j4, Object obj5);

    public static native void nativeDestroy(long j);

    private native void nativeDetachEngineFromUIThread(long j, long j2);

    public static native void nativeDispatchMessageEvent(long j, long j2, ReadableMap readableMap);

    public static native void nativeEnforceRelayoutOnCurrentThreadWithUpdatedViewport(long j, long j2, int i, int i2, int i3, int i4);

    public static native void nativeFlush(long j, long j2);

    public static native JavaOnlyMap nativeGetAllJsSource(long j, long j2);

    private native JavaOnlyMap nativeGetAllTimingInfo(long j, long j2);

    private native void nativeGetDataAsync(long j, long j2, int i);

    public static native int nativeGetInstanceId(long j, long j2);

    public static native long nativeGetListEngineProxy(long j, long j2);

    public static native JavaOnlyMap nativeGetListPlatformInfo(long j, long j2, int i);

    public static native Object nativeGetPageDataByKey(long j, long j2, String[] strArr);

    private native void nativeGetSessionStorageItem(long j, long j2, String str, PlatformCallBack platformCallBack);

    public static native void nativeInitRuntime(long j, LynxResourceLoader lynxResourceLoader, LynxModuleFactory lynxModuleFactory, String str, String[] strArr, String str2, int i, long j2);

    public static native long nativeLifecycleCreate();

    public static native void nativeLifecycleDestroy(long j);

    public static native boolean nativeLifecycleTryTerminate(long j);

    public static native void nativeLoadSSRDataByPreParsedData(long j, long j2, byte[] bArr, long j3, boolean z, String str, TemplateData templateData);

    public static native void nativeLoadTemplateBufferByPreParsedData(long j, long j2, String str, ByteBuffer byteBuffer, boolean z, boolean z2, long j3, boolean z3, String str2, TemplateData templateData, int i, ReadableMap readableMap);

    public static native void nativeLoadTemplateBundleByPreParsedData(long j, long j2, String str, long j3, boolean z, long j4, boolean z2, String str2, TemplateData templateData, int i, ReadableMap readableMap);

    public static native void nativeLoadTemplateByPreParsedData(long j, long j2, String str, byte[] bArr, boolean z, boolean z2, long j3, boolean z3, String str2, TemplateData templateData, int i, ReadableMap readableMap);

    public static native void nativeMarkDirty(long j, long j2);

    public static native int nativeObtainChild(long j, long j2, int i, int i2, long j3, boolean z);

    public static native void nativeObtainChildAsync(long j, long j2, int i, int i2, long j3);

    public static native void nativeOnEnterBackground(long j, long j2);

    public static native void nativeOnEnterForeground(long j, long j2);

    public static native void nativeOnLynxEngineCreated(long j, long j2);

    public static native void nativePreloadLazyBundles(long j, long j2, String[] strArr);

    public static native void nativeProcessRender(long j, long j2);

    public static native void nativeRebuildLynxEngine(long j, long j2, long j3, Object obj, Object obj2);

    public static native void nativeRecycleChild(long j, long j2, int i, int i2);

    public static native void nativeRecycleChildAsync(long j, long j2, int i, int i2);

    public static native boolean nativeRegisterLazyBundle(long j, long j2, String str, long j3);

    public static native void nativeReloadTemplate(long j, long j2, long j3, long j4, String str, boolean z, Object obj, TemplateData templateData, ReadableMap readableMap);

    public static native void nativeRemoveChild(long j, long j2, int i, int i2);

    public static native void nativeRenderChild(long j, long j2, int i, int i2, long j3);

    public static native void nativeResetDataByPreParsedData(long j, long j2, long j3, String str, boolean z, TemplateData templateData);

    private native void nativeScrollByListContainer(long j, long j2, int i, float f, float f2, float f3, float f4);

    private native void nativeScrollStopped(long j, long j2, int i);

    private native void nativeScrollToPosition(long j, long j2, int i, int i2, float f, int i3, boolean z);

    public static native void nativeSendGlobalEventToLepus(long j, long j2, String str, ByteBuffer byteBuffer, int i);

    public static native void nativeSendSsrGlobalEvent(long j, long j2, String str, ByteBuffer byteBuffer, int i);

    private native void nativeSetContextHasAttached(long j, long j2);

    public static native void nativeSetEnableBytecode(long j, long j2, boolean z, String str);

    public static native void nativeSetEnableUIFlush(long j, long j2, boolean z);

    private native void nativeSetExtensionDelegate(long j, long j2, long j3);

    public static native void nativeSetFontScale(long j, long j2, float f);

    private native void nativeSetLongTaskMonitorDisabled(long j, long j2, boolean z);

    public static native void nativeSetPlatformConfig(long j, long j2, String str);

    private native void nativeSetSSRTimingData(long j, long j2, String str, long j3);

    private native void nativeSetSessionStorageItem(long j, long j2, String str, long j3, boolean z);

    public static native boolean nativeShouldSendEventToMainThread(long j, long j2);

    public static native void nativeStartRuntime(long j, long j2);

    private native double nativeSubscribeSessionStorage(long j, long j2, String str, PlatformCallBack platformCallBack);

    public static native void nativeSyncFetchLayoutResult(long j, long j2);

    public static native void nativeSyncPackageExternalPath(long j, String str);

    public static native void nativeTriggerEventBus(long j, long j2, String str, ByteBuffer byteBuffer, int i);

    private native void nativeUnsubscribeSessionStorage(long j, long j2, String str, double d);

    public static native void nativeUpdateChild(long j, long j2, int i, int i2, int i3, long j3);

    public static native void nativeUpdateConfig(long j, long j2, ByteBuffer byteBuffer, int i);

    public static native void nativeUpdateDataByPreParsedData(long j, long j2, long j3, String str, boolean z, TemplateData templateData, boolean z2);

    public static native void nativeUpdateFontScale(long j, long j2, float f);

    public static native void nativeUpdateGlobalProps(long j, long j2, long j3);

    public static native void nativeUpdateI18nResource(long j, long j2, String str, String str2, int i);

    public static native void nativeUpdateMetaData(long j, long j2, long j3, String str, boolean z, TemplateData templateData, long j4);

    public static native void nativeUpdateScreenMetrics(long j, long j2, int i, int i2, float f, long j3);

    public static native void nativeUpdateViewport(long j, long j2, int i, int i2, int i3, int i4, float f, long j3, boolean z);

    @Override // X.InterfaceC1298780ju0
    public final void LIZ() {
        LJFF(false);
    }

    public final void LJIIIZ() {
        LynxEngine lynxEngine;
        NativeFacade nativeFacade;
        LynxModuleFactory lynxModuleFactory;
        if (this.LJJL.compareAndSet(false, true)) {
            InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
            if (interfaceC1309730kBf != null) {
                ((LynxUIRenderer) interfaceC1309730kBf).LJFF();
            }
            if (this.LJJLIIIIJ != null && (lynxModuleFactory = (nativeFacade = this.LJJLIIIIJ).LJIIIIZZ) != null) {
                if (nativeFacade.LJI) {
                    lynxModuleFactory.LIZLLL();
                } else {
                    lynxModuleFactory.destroy();
                }
                nativeFacade.LJIIIIZZ = null;
            }
            final long j = this.LJJLIIIJ;
            final long j2 = this.LJJLI;
            final NativeFacade nativeFacade2 = this.LJJLIIIIJ;
            C1289620jfE.LIZLLL(new Runnable(j, j2, this, nativeFacade2) { // from class: X.0juj
                public long LL;
                public long LLILLJJLI;
                public volatile NativeFacade LLILLL;
                public LynxTemplateRender LLILZ;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LynxTemplateRender$DestroyTask@72cf.run");
                    try {
                        long j3 = this.LLILLJJLI;
                        if (j3 != 0 && this.LL != 0) {
                            if (LynxTemplateRender.nativeLifecycleTryTerminate(j3)) {
                                LynxTemplateRender.nativeDestroy(this.LL);
                                this.LL = 0L;
                                this.LLILLJJLI = 0L;
                            } else {
                                C786410Ut5.LJLIIL(1L, C1289620jfE.LIZ(), this);
                            }
                        }
                        if (this.LLILLL != null) {
                            NativeFacade nativeFacade3 = this.LLILLL;
                            C1309780kBk c1309780kBk = nativeFacade3.LIZIZ;
                            if (c1309780kBk != null) {
                                c1309780kBk.LJIIIIZZ();
                                nativeFacade3.LIZIZ = null;
                            }
                            this.LLILLL = null;
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LynxTemplateRender$DestroyTask@72cf.run");
                }

                {
                    this.LL = j;
                    this.LLILLJJLI = j2;
                    this.LLILZ = (j2 == 0 || j == 0) ? null : this;
                    this.LLILLL = nativeFacade2;
                }
            });
            if (this.LJJLIIIJLJLI) {
                LynxEngine lynxEngine2 = this.LJJLL;
                if (lynxEngine2 != null && lynxEngine2.LIZLLL()) {
                    this.LJIJI.LJIILJJIL(this.LJJLL);
                    this.LJJLL.LIZJ();
                }
            } else if (this.LJJLIIIJL && (lynxEngine = this.LJJLL) != null && (lynxEngine.LJ() || !this.LJJLL.LIZLLL())) {
                C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 51));
            }
            Map<Double, PlatformCallBack> map = this.LJJJZ;
            if (map != null) {
                ((HashMap) map).clear();
            }
            JSProxy jSProxy = this.LJJJJZI;
            if (jSProxy != null) {
                jSProxy.LJFF();
                this.LJJJJZI = null;
            }
            LynxEngineProxy lynxEngineProxy = this.LJJJLL;
            if (lynxEngineProxy != null) {
                lynxEngineProxy.getClass();
                C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(lynxEngineProxy, 146));
            }
            LynxLayoutProxy lynxLayoutProxy = this.LJJJLZIJ;
            if (lynxLayoutProxy != null) {
                lynxLayoutProxy.LIZ();
            }
            this.LJJLIL = null;
            this.LJJLIIIIJ = null;
            this.LJJLI = 0L;
            this.LJJLIIIJ = 0L;
        }
    }

    public final void LJIIJ() {
        this.LJIIJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyNative url ");
        String str = this.LJI;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append(" in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mDevTool != null) {
            this.mDevTool = null;
        }
        if (this.LJJLIIIJ != 0) {
            s sVar = this.mLynxContext;
            if (sVar != null && sVar.LIZLLL()) {
                LynxEventReporter.clearCache(this.mLynxContext.LLJLILLLLZIIL);
            }
            LJIIIZ();
        }
        this.LJIIIZ = true;
        this.LJIIJ = false;
    }

    public final synchronized void LJJJLZIJ() {
        C1309670kBZ c1309670kBZ;
        if (this.LJIIIZ) {
            return;
        }
        if (this.LJII) {
            LJJJJI("TemplateRender.reloadAndInit");
            this.LJIIJJI = false;
            this.LJIIIIZZ = null;
            this.LJJJJIZL = "setup";
            s sVar = this.mLynxContext;
            if (sVar != null && (c1309670kBZ = sVar.LLJJJJLIIL) != null) {
                C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1309670kBZ, 61));
            }
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 62));
            TemplateData templateData = this.LJJIIJZLJL;
            if (templateData != null) {
                this.LJJIIJZLJL = templateData.LJ();
            }
            int i = -1;
            if (this.LJJLIIIJ != 0) {
                s sVar2 = this.mLynxContext;
                if (sVar2 != null && sVar2.LIZLLL()) {
                    i = this.mLynxContext.LLJLILLLLZIIL;
                    LynxEventReporter.removeGenericInfo(i);
                }
                LJIIIZ();
            }
            int i2 = this.LIZJ;
            int i3 = this.LIZLLL;
            this.LIZJ = 0;
            this.LIZLLL = 0;
            InterfaceC1309730kBf interfaceC1309730kBfLJJIJIIJI = LJJIJIIJI();
            if (interfaceC1309730kBfLJJIJIIJI != null) {
                ((LynxUIRenderer) interfaceC1309730kBfLJJIJIIJI).LJII();
            }
            s sVar3 = this.mLynxContext;
            if (sVar3 != null) {
                sVar3.LJJII();
            }
            LJII(i);
            LLD(i2, i3, true);
            LJLI(this.LJJIJ, "createLynxStart");
            LJLI(this.LJJIJIIJI, "createLynxEnd");
            LJJJJIZL("TemplateRender.reloadAndInit");
        } else {
            this.LJII = true;
        }
    }

    public native void nativeClearPipelineTimingInfo(long j, long j2);

    public native void nativeDetachLynxEngineWrapper(long j, long j2);

    public native void nativeReattachLynxEngineWrapper(long j, long j2, long j3, long j4);

    public final void LIZIZ() {
        LynxEngine lynxEngine;
        LynxEngine lynxEngine2;
        if (this.LJJLIIIJ != 0) {
            if (!C1289620jfE.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("attachEngineToUIThread should be called on ui thread, url: ");
                sbLIZ.append(this.LJI);
                LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (LJFF(false)) {
                LJJJJ();
                return;
            }
            int i = C1299920jvq.LIZIZ[this.LJIIL.ordinal()];
            if (i == 1) {
                EnumC665490Q8l enumC665490Q8l = EnumC665490Q8l.ALL_ON_UI;
                this.LJIIL = enumC665490Q8l;
                if (this.LJJLIIIJL && (lynxEngine = this.LJJLL) != null) {
                    if (lynxEngine.LJ()) {
                        this.LJJLIIJ = true;
                    }
                    this.LJJLL.LJ = enumC665490Q8l;
                }
            } else if (i != 2) {
                return;
            } else {
                this.LJIIL = EnumC665490Q8l.PART_ON_LAYOUT;
            }
            nativeAttachEngineToUIThread(this.LJJLIIIJ, this.LJJLI);
            LJJJJ();
            if (this.LJJLIIIJL && (lynxEngine2 = this.LJJLL) != null && this.LJJLIIJ) {
                this.LJJLIIJ = false;
                lynxEngine2.LJFF(EnumC1309960kC2.READY_BE_REUSED);
            }
        }
    }

    public final String LJ() {
        String str = !TextUtils.isEmpty(this.LJI) ? this.LJI : "";
        s sVar = this.mLynxContext;
        String strValueOf = sVar != null ? String.valueOf(sVar.LLJLILLLLZIIL) : "null";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("instanceId:");
        sbLIZ.append(strValueOf);
        sbLIZ.append(" url:");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIIIZZ() {
        C1311720kEs c1311720kEs;
        WeakReference<C1298340jtI> weakReference;
        C1298340jtI c1298340jtI;
        LynxBaseUI value;
        C1299220jui c1299220jui;
        C1309670kBZ c1309670kBZ;
        LJJJJI("LynxTemplateRender.destroy");
        s sVar = this.mLynxContext;
        if (sVar != null && (c1309670kBZ = sVar.LLJJJJLIIL) != null) {
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1309670kBZ, 61));
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LJJIIZI).iterator();
        while (it2.hasNext()) {
            ((TemplateData) it2.next()).LJIILL();
        }
        ((CopyOnWriteArrayList) this.LJJIIZI).clear();
        synchronized (this) {
            TemplateData templateData = this.LJJIIJZLJL;
            if (templateData != null) {
                templateData.LJIILL();
                this.LJJIIJZLJL = null;
            }
        }
        LJIIJ();
        LJJJJI("Client.onReportComponentInfo");
        this.LJIILIIL.LJJI(new HashSet());
        LJJJJIZL("Client.onReportComponentInfo");
        InterfaceC1310130kCJ interfaceC1310130kCJ = (InterfaceC1310130kCJ) C1285920jZG.LIZJ().LIZ(InterfaceC1310130kCJ.class);
        if (interfaceC1310130kCJ != null) {
            interfaceC1310130kCJ.onLynxViewDestroy(this.mLynxContext);
        }
        s sVar2 = this.mLynxContext;
        if (sVar2 != null && (c1299220jui = sVar2.LLJJJIL) != null) {
            ((HashMap) c1299220jui.LIZ).clear();
        }
        this.mLynxContext = null;
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
        if (interfaceC1309730kBf != null && (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) != null) {
            TraceEvent.LIZLLL("UIOwner.destroy");
            for (Map.Entry<Integer, LynxBaseUI> entry : c1311720kEs.LJI.entrySet()) {
                if ((entry.getValue() instanceof LynxBaseUI) && (value = entry.getValue()) != null) {
                    value.destroy();
                }
            }
            s sVar3 = c1311720kEs.LIZJ;
            if (sVar3 != null) {
                C1309670kBZ c1309670kBZ2 = sVar3.LLJJJJLIIL;
                if (c1309670kBZ2 != null) {
                    C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1309670kBZ2, 61));
                }
                C1310290kCZ c1310290kCZ = sVar3.LLLIIII;
                if (c1310290kCZ != null && c1310290kCZ.LJJIJ && (weakReference = sVar3.LLJJI) != null && (c1298340jtI = weakReference.get()) != null) {
                    C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1298340jtI, 211));
                }
            }
            C1311400kEM c1311400kEM = c1311720kEs.LJIILJJIL;
            if (c1311400kEM != null) {
                Map<Integer, WeakReference<InterfaceC1311590kEf>> map = c1311400kEM.LIZ;
                if (map != null) {
                    ((HashMap) map).clear();
                }
                LinkedList<InterfaceC1311590kEf> linkedList = c1311400kEM.LIZIZ;
                if (linkedList != null) {
                    linkedList.clear();
                }
                LinkedList<InterfaceC1311590kEf> linkedList2 = c1311400kEM.LIZJ;
                if (linkedList2 != null) {
                    linkedList2.clear();
                }
                C1310330kCd c1310330kCd = c1311400kEM.LJ;
                if (c1310330kCd != null) {
                    ((HashMap) c1310330kCd.LIZ).clear();
                }
                C1311390kEL c1311390kEL = c1311400kEM.LJII;
                if (c1311390kEL != null) {
                    VelocityTracker velocityTracker = c1311390kEL.LJFF;
                    if (velocityTracker != null) {
                        try {
                            velocityTracker.recycle();
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            LynxLog.e("GestureHandlerTrigger", e.toString());
                        }
                        c1311390kEL.LJFF = null;
                    }
                    c1311390kEL.LIZIZ = null;
                    HashSet<InterfaceC1311590kEf> hashSet = c1311390kEL.LJI;
                    if (hashSet != null) {
                        hashSet.clear();
                    }
                }
            }
            c1311720kEs.LJIILLIIL.clear();
            TraceEvent.LJII("UIOwner.destroy");
        }
        LynxLog.i("LynxTemplateRender", LJIIZILJ("destroy"));
        LJJJJIZL("LynxTemplateRender.destroy");
    }

    public final void LJIIJJI() {
        if (this.LJJLIIIJ != 0) {
            if (!C1289620jfE.LIZIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("detachEngineFromUIThread should be called on ui thread, url: ");
                sbLIZ.append(this.LJI);
                LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (LJFF(true)) {
                LJJJJ();
                return;
            }
            int i = C1299920jvq.LIZIZ[this.LJIIL.ordinal()];
            if (i == 3) {
                this.LJIIL = EnumC665490Q8l.MOST_ON_TASM;
                this.LJJLIIIJL = false;
                LynxEngine lynxEngine = this.LJJLL;
                if (lynxEngine != null) {
                    lynxEngine.LIZIZ();
                    this.LJJLL = null;
                }
            } else if (i != 4) {
                return;
            } else {
                this.LJIIL = EnumC665490Q8l.MULTI_THREADS;
            }
            nativeDetachEngineFromUIThread(this.LJJLIIIJ, this.LJJLI);
            LJJJJ();
        }
    }

    public final void LJIILJJIL() {
        if (this.LJJLL != null) {
            LJLJJI();
            return;
        }
        this.LJJLL = new LynxEngine(this.LJIILLIIL, this);
        InterfaceC1309730kBf interfaceC1309730kBfLJJIJIIJI = LJJIJIIJI();
        this.LJJJIL = interfaceC1309730kBfLJJIJIIJI;
        LynxEngine lynxEngine = this.LJJLL;
        lynxEngine.LJFF = interfaceC1309730kBfLJJIJIIJI;
        lynxEngine.getClass();
        lynxEngine.LIZ = new WeakReference<>(this);
    }

    public final JavaOnlyMap LJIJ() {
        long j = this.LJJLIIIJ;
        if (j != 0) {
            return nativeGetAllTimingInfo(j, this.LJJLI);
        }
        return null;
    }

    public final boolean LJIJI() {
        s sVar = this.mLynxContext;
        if (sVar == null || !sVar.LLLII) {
            return false;
        }
        C1310290kCZ c1310290kCZ = sVar.LLLIIII;
        if (c1310290kCZ == null) {
            LynxLog.e("LynxContext", "PageConfig is null.GetAutoExpose get default true!");
        } else if (!c1310290kCZ.LIZ) {
            return false;
        }
        return true;
    }

    public final long LJIJJLI() {
        return nativeGetListEngineProxy(this.LJJLIIIJ, this.LJJLI);
    }

    public final LynxView LJJ() {
        C1310660kDA c1310660kDA = this.LJJII;
        if (c1310660kDA instanceof LynxView) {
            return (LynxView) c1310660kDA;
        }
        if (c1310660kDA instanceof C1309770kBj) {
            return ((C1309770kBj) c1310660kDA).getRootView();
        }
        return null;
    }

    public final C1309760kBi LJJI() {
        C1309760kBi c1309760kBi = new C1309760kBi();
        C1309760kBi c1309760kBi2 = this.LJIILL;
        c1309760kBi.LJJIJIIJIL = c1309760kBi2.LJJIJIIJIL;
        c1309760kBi.LJIL = c1309760kBi2.LJIL();
        C1309760kBi c1309760kBi3 = this.LJIILL;
        c1309760kBi.LJJIIJZLJL = c1309760kBi3.LJJIIJZLJL;
        c1309760kBi3.getClass();
        c1309760kBi.LJIILLIIL = this.LJIILL.LJJ();
        c1309760kBi.LJIIZILJ = true;
        c1309760kBi.LJIJ = true;
        c1309760kBi.LIZ = this.LJIILL.LJJIJIL();
        c1309760kBi.LIZLLL.LIZJ = this.LJIILL.LIZIZ();
        C1309760kBi c1309760kBi4 = this.LJIILL;
        c1309760kBi.LJJIIJ = c1309760kBi4.LJJIIJ;
        c1309760kBi.LJI = c1309760kBi4.LJFF();
        c1309760kBi.LIZLLL.LJIIJ = this.LJIILL.LJJIIJZLJL().LJIIJ;
        C1299310jur c1299310jurLJJIIJZLJL = this.LJIILL.LJJIIJZLJL();
        C1299310jur c1299310jurLJJIIJZLJL2 = c1309760kBi.LJJIIJZLJL();
        if (c1299310jurLJJIIJZLJL2 != null) {
            c1299310jurLJJIIJZLJL2.LIZIZ(c1299310jurLJJIIJZLJL);
        }
        int screenWidth = this.LJIILL.getScreenWidth();
        int screenHeight = this.LJIILL.getScreenHeight();
        c1309760kBi.LJIJJ = screenWidth;
        c1309760kBi.LJIJJLI = screenHeight;
        EnumC665490Q8l enumC665490Q8lLJJIJL = this.LJIILL.LJJIJL();
        if (enumC665490Q8lLJJIJL != null) {
            c1309760kBi.LJIJI = enumC665490Q8lLJJIJL;
        }
        c1309760kBi.LIZJ = this.LJIILL.LJ();
        Float density = this.LJIILL.getDensity();
        if (density != null) {
            c1309760kBi.LIZIZ = Float.valueOf(density.floatValue());
        }
        return c1309760kBi;
    }

    public final void LJJIII() {
        this.LJJJLL = new LynxEngineProxy(this.LJJLIIIJ);
        NativeFacade nativeFacade = this.LJJLIIIIJ;
        LynxEngineProxy lynxEngineProxy = this.LJJJLL;
        nativeFacade.getClass();
        nativeFacade.LJ = new WeakReference<>(lynxEngineProxy);
        if (this.mLynxContext == null) {
            LynxLog.e("LynxTemplateRender", "mLynxContext is null, can not set LayoutProxy");
            return;
        }
        this.LJJJLZIJ = new LynxLayoutProxy(this.LJJLIIIJ);
        s sVar = this.mLynxContext;
        LynxLayoutProxy lynxLayoutProxy = this.LJJJLZIJ;
        sVar.getClass();
        sVar.LLJILJIL = new WeakReference<>(lynxLayoutProxy);
    }

    public final InterfaceC1309730kBf LJJIJIIJI() {
        if (this.LJJJIL == null) {
            C1310660kDA c1310660kDA = this.LJJII;
            if (c1310660kDA != null) {
                this.LJJJIL = c1310660kDA.getLynxUIRendererInternal();
            } else {
                this.LJIIZILJ.LJIL().getClass();
                this.LJJJIL = new LynxUIRenderer();
            }
        }
        return this.LJJJIL;
    }

    public final void LJJJ() {
        InterfaceC1309730kBf interfaceC1309730kBf;
        s sVar;
        if ((this.LJJLIIIJL && this.LJJLL == null) || (interfaceC1309730kBf = this.LJJJIL) == null) {
            return;
        }
        LynxUIRenderer lynxUIRenderer = (LynxUIRenderer) interfaceC1309730kBf;
        if (lynxUIRenderer.LIZIZ == null) {
            LynxLog.e("LynxUIRenderer", "onLayout failed, mLynxUIOwner is null");
            return;
        }
        WeakReference<s> weakReference = lynxUIRenderer.LIZ;
        if (weakReference == null || (sVar = weakReference.get()) == null) {
            lynxUIRenderer.LIZIZ.LJJIII();
            return;
        }
        if (!sVar.LJIJJ() || sVar.LJIILL() == null) {
            boolean zLIZIZ = LynxLongTaskMonitor.LIZIZ("LynxTemplateRender.Layout", sVar.LLJLILLLLZIIL, lynxUIRenderer.LJI);
            lynxUIRenderer.LIZIZ.LJJIII();
            if (zLIZIZ) {
                LynxLongTaskMonitor.LIZ();
            }
        }
    }

    public final void LJJJIL() {
        WeakReference<C1298340jtI> weakReference;
        C1298340jtI c1298340jtI;
        s sVar = this.mLynxContext;
        if (sVar != null) {
            C1309670kBZ c1309670kBZ = sVar.LLJJJJLIIL;
            if (c1309670kBZ != null) {
                C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1309670kBZ, 215));
            }
            C1310290kCZ c1310290kCZ = sVar.LLLIIII;
            if (c1310290kCZ == null || !c1310290kCZ.LJJIJ || (weakReference = sVar.LLJJI) == null || (c1298340jtI = weakReference.get()) == null) {
                return;
            }
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1298340jtI, 215));
        }
    }

    public final void LJJJJ() {
        EnumC665490Q8l enumC665490Q8l = this.LJIIL;
        this.LJJIII = enumC665490Q8l == EnumC665490Q8l.MULTI_THREADS || enumC665490Q8l == EnumC665490Q8l.MOST_ON_TASM;
        s sVar = this.mLynxContext;
        if (sVar != null) {
            if (sVar.LIZLLL()) {
                LynxEventReporter.updateGenericInfo("thread_mode", Integer.valueOf(this.LJIIL.id()), this.mLynxContext.LLJLILLLLZIIL);
            }
            EnumC665490Q8l enumC665490Q8l2 = this.LJIIL;
            if (enumC665490Q8l2 == EnumC665490Q8l.MOST_ON_TASM || enumC665490Q8l2 == EnumC665490Q8l.ALL_ON_UI) {
                this.mLynxContext.LLLIIL = true;
            }
        }
    }

    public final void LJJJJL() throws Throwable {
        if (!this.LJJI) {
            onErrorOccurred(new LynxError(10202, "LynxEnv has not been prepared successfully!", null, "error"));
            return;
        }
        C1310200kCQ c1310200kCQ = this.LJIIIIZZ;
        if (c1310200kCQ != null && c1310200kCQ.LIZ == EnumC1309880kBu.STARTED) {
            this.LJII = false;
            C1310200kCQ c1310200kCQ2 = this.LJIIIIZZ;
            c1310200kCQ2.getClass();
            c1310200kCQ2.LIZ = EnumC1309880kBu.EXECUTING;
        }
        this.LJJIFFI = true;
        long j = this.LJJLIIIJ;
        if (j != 0) {
            nativeMarkDirty(j, this.LJJLI);
        }
        LJJJLZIJ();
        LJLZ(this.LJI);
        if (this.LJJLIIIIJ != null) {
            this.LJJLIIIIJ.LIZIZ = this.LJIILIIL;
            LJIIL(this.LJI);
        }
    }

    public final void LJJJJLL() {
        LJJJJI("TemplateRender.processRender");
        if (this.LJJLIIIJ != 0 && !this.LJJJ) {
            LJJZZI(true);
            nativeProcessRender(this.LJJLIIIJ, this.LJJLI);
        }
        LJJJJIZL("TemplateRender.processRender");
    }

    public final void LJLJI() {
        LynxEngine lynxEngine;
        WeakReference<TasmPlatformInvoker> weakReference;
        if (this.LJJLIIIJL && (lynxEngine = this.LJJLL) != null) {
            if (lynxEngine.LIZLLL()) {
                TemplateBundle templateBundle = this.LJIILLIIL;
                C1310290kCZ.LIZ(templateBundle != null ? templateBundle.LLIZ : this.LJJLL.LJII, this.mLynxContext, this.LJJJIL);
            }
            if (this.LJJLL.LIZLLL() || (weakReference = this.LJJLIL) == null) {
                return;
            }
            this.LJJLL.LJI = weakReference.get();
        }
    }

    public final void LJLJJI() {
        this.LJJLL.LJFF(EnumC1309960kC2.ON_REUSING);
        this.LJJLL.LIZJ();
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJLL.LJFF;
        this.LJJJIL = interfaceC1309730kBf;
        ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ(this.LJJII, this.mLynxContext, this.mContext);
        LynxEngine lynxEngine = this.LJJLL;
        lynxEngine.getClass();
        lynxEngine.LIZ = new WeakReference<>(this);
        WeakReference<TasmPlatformInvoker> weakReference = new WeakReference<>(this.LJJLL.LJI);
        this.LJJLIL = weakReference;
        if (weakReference.get() != null) {
            TasmPlatformInvoker tasmPlatformInvoker = this.LJJLIL.get();
            NativeFacade nativeFacade = this.LJJLIIIIJ;
            tasmPlatformInvoker.getClass();
            tasmPlatformInvoker.LIZ = new WeakReference<>(nativeFacade);
        }
        LJLJI();
    }

    public final boolean LJLJJL() {
        if (!this.LJJI) {
            return false;
        }
        long j = this.LJJLIIIJ;
        return j != 0 && nativeShouldSendEventToMainThread(j, this.LJJLI);
    }

    public final void LJLJJLL() {
        long j = this.LJJLIIIJ;
        if (j != 0) {
            this.LJJIJIL = false;
            nativeStartRuntime(j, this.LJJLI);
        }
    }

    public final void LJLJLJ() {
        LJJJJI("LynxTemplateRender.syncFlush");
        if (!C1289620jfE.LIZIZ()) {
            throw new AssertionError("Expected to run on UI thread!");
        }
        if (this.LJJIII && !this.LJJL.get()) {
            LynxLog.i("LynxTemplateRender", "syncFlush wait layout finish");
            long j = this.LJJLIIIJ;
            if (j != 0) {
                nativeFlush(j, this.LJJLI);
            }
        }
        LJJJJIZL("LynxTemplateRender.syncFlush");
    }

    public final TasmPlatformInvoker LJLJLLL() {
        WeakReference<TasmPlatformInvoker> weakReference = this.LJJLIL;
        if (weakReference == null || weakReference.get() == null) {
            TasmPlatformInvoker tasmPlatformInvoker = new TasmPlatformInvoker(this.LJJLIIIIJ);
            this.LJJLIL = new WeakReference<>(tasmPlatformInvoker);
            return tasmPlatformInvoker;
        }
        TasmPlatformInvoker tasmPlatformInvoker2 = this.LJJLIL.get();
        NativeFacade nativeFacade = this.LJJLIIIIJ;
        tasmPlatformInvoker2.getClass();
        tasmPlatformInvoker2.LIZ = new WeakReference<>(nativeFacade);
        return tasmPlatformInvoker2;
    }

    public final void LJLLILLLL() {
        LynxEngine lynxEngine;
        if (this.LJIIL == EnumC665490Q8l.MOST_ON_TASM) {
            return;
        }
        LJJJJI("TemplateRender.tryReuseLynxEngineFromPool");
        C1299860jvk c1299860jvk = C1299870jvl.LIZ;
        TemplateBundle templateBundle = this.LJIILLIIL;
        EnumC665490Q8l enumC665490Q8l = this.LJIIL;
        LinkedList<LynxEngine> linkedListLIZ = c1299860jvk.LIZ(templateBundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pollEngine EngineQueue Cache: ");
        sbLIZ.append(linkedListLIZ);
        sbLIZ.append(", bundle:");
        sbLIZ.append(templateBundle);
        LynxLog.i("LynxEnginePool", C2188811AlT.LIZIZ(sbLIZ));
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("engineQueue", linkedListLIZ.toString());
            map.put("templateBundle", String.valueOf(templateBundle));
            TraceEvent.LIZJ("LynxEnginePool.pollEngineFromPool", map);
        }
        synchronized (c1299860jvk) {
            LynxEngine lynxEngine2 = null;
            int i = 0;
            lynxEngine = null;
            while (true) {
                try {
                    if (i >= linkedListLIZ.size()) {
                        if (lynxEngine == null || !lynxEngine.LJ()) {
                            break;
                        }
                    } else {
                        LynxEngine lynxEngine3 = linkedListLIZ.get(i);
                        if (enumC665490Q8l == lynxEngine3.LJ && lynxEngine3.LJ()) {
                            linkedListLIZ.remove(i);
                            TraceEvent.LJII("pollEngineFromPool");
                            lynxEngine2 = lynxEngine3;
                            break;
                        } else {
                            if (lynxEngine3.LIZ()) {
                                lynxEngine = lynxEngine3;
                            }
                            i++;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            lynxEngine = lynxEngine2;
        }
        TraceEvent.LJII("LynxEnginePool.pollEngineFromPool");
        this.LJJLL = lynxEngine;
        if (lynxEngine != null) {
            LJLJJI();
            this.LJJLIIIJLLLLLLLZ = true;
        }
        LJJJJIZL("TemplateRender.tryReuseLynxEngineFromPool");
    }

    public final void LJJIJLIJ() {
        UIBody uIBody;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxview onDetachedFromWindow ");
        sbLIZ.append(toString());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LynxLog.i("LynxTemplateRender", strLIZIZ);
        LJJJJI(strLIZIZ);
        if (this.LJJJIL != null) {
            TraceEvent.LIZLLL("Client.onReportComponentInfo");
            this.LJIILIIL.LJJI(new HashSet());
            TraceEvent.LJII("Client.onReportComponentInfo");
            C1311720kEs c1311720kEs = ((LynxUIRenderer) this.LJJJIL).LIZIZ;
            if (c1311720kEs != null && (uIBody = c1311720kEs.LIZIZ) != null) {
                uIBody.onDetach();
            }
        }
        LJJIL(false);
        LJJJJIZL(strLIZIZ);
    }

    public final void finalize() throws Throwable {
        super.finalize();
        LJIIJ();
    }

    public static void LJJJJIZL(String str) {
        if (!TraceController.isTracingStarted()) {
            return;
        }
        TraceEvent.LJI(1L, str);
    }

    public static String[] LJJJJZ(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("=|&");
        String str2 = "";
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 < strArrSplit.length) {
                if (!strArrSplit[i].equalsIgnoreCase("compile_path") && !strArrSplit[i].equalsIgnoreCase("compilePath")) {
                    if (strArrSplit[i].equalsIgnoreCase("post_url") || strArrSplit[i].equalsIgnoreCase("postUrl")) {
                        str2 = strArrSplit[i2];
                    }
                } else {
                    str = strArrSplit[i2];
                }
                i += 2;
            } else {
                arrayList.add(str);
                arrayList.add(str2);
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
    }

    public static void LJL(LynxModuleFactory lynxModuleFactory) {
        lynxModuleFactory.LIZJ("IntersectionObserverModule", LynxIntersectionObserverModule.class, null);
        lynxModuleFactory.LIZJ("LynxUIMethodModule", LynxUIMethodModule.class, null);
        lynxModuleFactory.LIZJ("LynxTextInfoModule", LynxTextInfoModule.class, null);
        lynxModuleFactory.LIZJ("LynxAccessibilityModule", LynxAccessibilityModule.class, null);
        lynxModuleFactory.LIZJ("LynxSetModule", LynxSetModule.class, null);
        lynxModuleFactory.LIZJ("LynxResourceModule", LynxResourceModule.class, null);
        lynxModuleFactory.LIZJ("LynxExposureModule", LynxExposureModule.class, null);
    }

    public static Object decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C1298840ju6.LIZ.getClass();
            return C1298840ju6.LIZ(byteBuffer);
        }
        return null;
    }

    public final void LIZJ(LynxView lynxView) {
        InterfaceC1310380kCi interfaceC1310380kCi;
        String string;
        if (this.LJJII != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("already attached ");
            sbLIZ.append(lynxView);
            LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Context context = lynxView.getContext();
        this.mContext = context;
        Activity activityLIZ = C1298530jtb.LIZ(context);
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            if (activityLIZ != null) {
                string = activityLIZ.toString();
            } else {
                string = "";
            }
            map.put("curActivity", string);
            TraceEvent.LIZJ("TemplateRender.attachLynxView", map);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LynxTemplateRender(");
        sbLIZ2.append(this);
        sbLIZ2.append(") is attached on lynxView:");
        sbLIZ2.append(lynxView);
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC1309730kBf interfaceC1309730kBfLJJIJIIJI = LJJIJIIJI();
        this.LJJII = lynxView;
        lynxView.setLynxUIRendererInternal(interfaceC1309730kBfLJJIJIIJI);
        LynxDevtool lynxDevtool = this.mDevTool;
        if (lynxDevtool != null && (interfaceC1310380kCi = lynxDevtool.LIZ) != null) {
            interfaceC1310380kCi.LIZ();
        }
        C1310080kCE c1310080kCE = this.LIZIZ;
        if (c1310080kCE != null) {
            c1310080kCE.LIZ = this.LJJII;
        }
        this.LJJII.setTimingCollector(this.LJJJJI);
        LynxUIRenderer lynxUIRenderer = (LynxUIRenderer) interfaceC1309730kBfLJJIJIIJI;
        lynxUIRenderer.LIZIZ(lynxView, this.mLynxContext, this.mContext);
        if (activityLIZ != null) {
            C1311720kEs c1311720kEs = lynxUIRenderer.LIZIZ;
            if (c1311720kEs != null) {
                c1311720kEs.LJIIL = false;
            }
            nativeSetContextHasAttached(this.LJJLIIIJ, this.LJJLI);
        }
        if (this.mDevTool != null) {
            new WeakReference(lynxView);
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII("TemplateRender.attachLynxView");
        }
    }

    public final boolean LIZLLL(MotionEvent motionEvent) {
        C1311380kEK c1311380kEK;
        InterfaceC1311410kEN interfaceC1311410kENParent;
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
        if (interfaceC1309730kBf != null && (c1311380kEK = ((LynxUIRenderer) interfaceC1309730kBf).LIZJ) != null && (interfaceC1311410kENParent = c1311380kEK.LIZJ) != null) {
            while (interfaceC1311410kENParent.parent() != interfaceC1311410kENParent) {
                if (interfaceC1311410kENParent.blockNativeEvent(motionEvent)) {
                    return true;
                }
                interfaceC1311410kENParent = interfaceC1311410kENParent.parent();
                if (interfaceC1311410kENParent == null) {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean LJFF(boolean z) {
        if (this.LJJLIIIJL && this.LJJLL == null) {
            LJIILL(z);
            C1309920kBy c1309920kBy = new C1309920kBy();
            EnumC1309970kC3 enumC1309970kC3 = EnumC1309970kC3.RENDER_FOR_RECREATE_ENGINE;
            c1309920kBy.LJFF = enumC1309970kC3.id() | c1309920kBy.LJFF;
            c1309920kBy.LIZLLL = this.LJJLJLI;
            c1309920kBy.LIZ = this.LJI;
            c1309920kBy.LIZJ = this.LJIILLIIL;
            LJJIIZI(c1309920kBy.LIZ());
            ((LynxUIRenderer) this.LJJJIL).LIZIZ.LIZIZ.measureChildren();
            ((LynxUIRenderer) this.LJJJIL).LIZIZ.LJJIII();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(android.view.MotionEvent r10) {
        /*
            r9 = this;
            X.0kBf r0 = r9.LJJJIL
            r5 = 0
            if (r0 == 0) goto L49
            com.lynx.tasm.behavior.LynxUIRenderer r0 = (com.lynx.tasm.behavior.LynxUIRenderer) r0
            X.0kEK r4 = r0.LIZJ
            r7 = 1
            if (r4 == 0) goto L49
            int r1 = r10.getAction()
            if (r1 == 0) goto L8f
            r0 = 2
            if (r1 != r0) goto L79
            boolean r0 = r4.LJIIL
            if (r0 == 0) goto L49
            float r6 = r10.getX()
            android.graphics.PointF r0 = r4.LJIILIIL
            float r0 = r0.x
            float r6 = r6 - r0
            float r8 = r10.getY()
            android.graphics.PointF r0 = r4.LJIILIIL
            float r0 = r0.y
            float r8 = r8 - r0
            float r1 = java.lang.Math.abs(r6)
            r3 = 1092616192(0x41200000, float:10.0)
            r2 = 0
            float r0 = X.C1311130kDv.LIZIZ(r3, r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4a
            float r1 = java.lang.Math.abs(r8)
            float r0 = X.C1311130kDv.LIZIZ(r3, r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L4a
            r4.LJIL(r7)
        L49:
            return r5
        L4a:
            X.0kEl r1 = r4.LJIIJJI
            X.0kEl r0 = X.EnumC1311650kEl.Undefined
            if (r1 != r0) goto L79
            X.0kEl r0 = X.EnumC1311650kEl.Disable
            r4.LJIIJJI = r0
            double r2 = (double) r8
            double r0 = (double) r6
            double r2 = java.lang.Math.atan2(r2, r0)
            r0 = 1127481344(0x43340000, float:180.0)
            double r0 = (double) r0
            double r2 = r2 * r0
            r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r2 = r2 / r0
            X.0kEN r1 = r4.LIZJ
        L66:
            if (r1 == 0) goto L79
            X.0kEN r0 = r1.parent()
            if (r0 == r1) goto L79
            float r0 = (float) r2
            boolean r0 = r1.consumeSlideEvent(r0)
            if (r0 == 0) goto L8a
            X.0kEl r0 = X.EnumC1311650kEl.Enable
            r4.LJIIJJI = r0
        L79:
            X.0kEl r1 = r4.LJIIJJI
            X.0kEl r0 = X.EnumC1311650kEl.Enable
            if (r1 != r0) goto L88
            r0 = 1
        L80:
            boolean r0 = r4.LJIL(r0)
            if (r0 == 0) goto L49
            r5 = 1
            return r5
        L88:
            r0 = 0
            goto L80
        L8a:
            X.0kEN r1 = r1.parent()
            goto L66
        L8f:
            X.0kEl r0 = X.EnumC1311650kEl.Undefined
            r4.LJIIJJI = r0
            r4.LJIIL = r5
            X.0kEN r1 = r4.LIZJ
            if (r1 == 0) goto Lae
        L99:
            X.0kEN r0 = r1.parent()
            if (r0 == r1) goto Lae
            boolean r0 = r1.hasConsumeSlideEventAngles()
            if (r0 == 0) goto La7
            r4.LJIIL = r7
        La7:
            X.0kEN r1 = r1.parent()
            if (r1 == 0) goto Lae
            goto L99
        Lae:
            boolean r0 = r4.LJIIL
            if (r0 == 0) goto L49
            r4.LJIL(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxTemplateRender.LJI(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.0jre, X.0jru] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJII(int i) {
        InterfaceC1310560kD0 c1310090kCF;
        long j;
        LynxWhiteBoard lynxWhiteBoard;
        long j2;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        long j3;
        String str2;
        String[] strArr;
        Object obj;
        InterfaceC1297320jre interfaceC1297320jreLIZ;
        if (!this.LJJI || !this.LJJL.compareAndSet(true, false)) {
            return;
        }
        TraceEvent.LIZLLL("TemplateRender.createLynxEngine");
        if (this.LJIIL == EnumC665490Q8l.ALL_ON_UI) {
            C1310080kCE c1310080kCE = new C1310080kCE(this.LJJII);
            this.LIZIZ = c1310080kCE;
            c1310090kCF = c1310080kCE;
        } else {
            c1310090kCF = new C1310090kCF(this.mLynxContext);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mEnableGenericResourceFetcher: ");
        sbLIZ.append(this.LJJIJL);
        sbLIZ.append(" render: ");
        sbLIZ.append(this);
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJIJL) {
            this.mLynxContext.LLL = this.LJIIZILJ.LIZJ();
            this.mLynxContext.LLLF = this.LJIIZILJ.LJJIZ();
            this.mLynxContext.LLLFF = this.LJIIZILJ.LJJIJIIJIL();
        }
        this.LIZ = new C1310250kCV(this);
        this.LJJJLIIL = this.LJIILL.LIZIZ();
        InterfaceC1299780jvc interfaceC1299780jvc = this.LJIILL.LJJIIJ;
        s sVar = this.mLynxContext;
        this.mLoader = new LynxResourceLoader(null, interfaceC1299780jvc, this, sVar.LLLFF, sVar.LLL);
        this.mLynxContext.LLLII = this.LJIIZILJ.LJJIL();
        this.LJJLIIIIJ = new NativeFacade(this.LJIILL.LJIILLIIL());
        this.LJJLIIIIJ.LIZ = new C1309750kBh(this);
        DisplayMetrics displayMetrics = this.mLynxContext.LLJJJ;
        LynxBackgroundRuntime lynxBackgroundRuntime = this.LJ;
        if (lynxBackgroundRuntime == null) {
            j = 0;
        } else {
            j = lynxBackgroundRuntime.LJFF;
        }
        C1299340juu c1299340juu = this.LJJJLIIL;
        if (c1299340juu != null && (lynxWhiteBoard = c1299340juu.LJFF) != null) {
            j2 = lynxWhiteBoard.LIZ;
        } else {
            j2 = 0;
        }
        LynxUIRenderer lynxUIRenderer = (LynxUIRenderer) LJJIJIIJI();
        lynxUIRenderer.LJ(this.mLynxContext, this.LJIIL, this.LJIIZILJ.LJ(), c1310090kCF);
        TasmPlatformInvoker tasmPlatformInvokerLJLJLLL = LJLJLLL();
        if (!this.LJIIZILJ.LJIJI() && !LynxEnv.inst().enableVSyncAlignedMessageLoopGlobal()) {
            z = false;
        } else {
            z = true;
        }
        if (this.LJIILL.LJJIIZ()) {
            this.LJJZ = new LynxModuleFactory();
            this.LJJZ.LIZJ = new C1297430jrp(new InterfaceC1297320jre() { // from class: X.0jrv
                public final WeakReference<Context> LIZ;

                @Override // X.InterfaceC1297320jre
                public final void LIZIZ(String str3, WeakReference<Context> weakReference) {
                }

                {
                    this.LIZ = new WeakReference<>(this.LIZIZ.mLynxContext);
                }

                @Override // X.InterfaceC1297320jre
                public final WeakReference<Context> LIZ(String str3) {
                    return this.LIZ;
                }
            });
            LJL(this.LJJZ);
            LynxModuleFactory lynxModuleFactory = this.LJJZ;
            lynxModuleFactory.LIZLLL = this.LJIILL.LJJIII;
            lynxModuleFactory.LIZ(this.LJIJJLI.LIZLLL);
        }
        NativeFacade nativeFacade = this.LJJLIIIIJ;
        PerformanceController performanceController = this.LJJJJI;
        if (performanceController.LJ) {
            performanceController = null;
        }
        LynxResourceLoader lynxResourceLoader = this.mLoader;
        int iId = this.LJIIL.id();
        boolean zLJIIIIZZ = this.LJIIZILJ.LJIIIIZZ();
        boolean z5 = this.LJIILL.LJJIIZ;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        String locale = LynxEnv.inst().getLocale();
        boolean zLJIILLIIL = this.LJIILL.LJIILLIIL();
        boolean zLJJIJIL = this.LJIIZILJ.LJJIJIL();
        boolean zLJJJIL = this.LJIIZILJ.LJJJIL();
        boolean zLJI = this.LJIIZILJ.LJI();
        C1299340juu c1299340juu2 = this.LJJJLIIL;
        if (c1299340juu2 != null && c1299340juu2.LJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = "";
        if (c1299340juu2 == null || !c1299340juu2.LJ) {
            str = "";
        } else {
            str = c1299340juu2.LIZJ;
        }
        long jLIZLLL = lynxUIRenderer.LIZLLL();
        if (this.LJJIZ == EnumC1299430jv3.FALSE) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = this.LJJJJL;
        boolean zLJFF = this.LJIIZILJ.LJFF();
        int i4 = this.LJJLIIIJJIZ;
        if (this.LJIJJ != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean zIsDebuggable = this.LJIILL.isDebuggable();
        LynxEngine lynxEngine = this.LJJLL;
        if (lynxEngine == null) {
            j3 = 0;
        } else {
            j3 = lynxEngine.LIZIZ;
        }
        LynxModuleFactory lynxModuleFactory2 = this.LJJZ;
        if (lynxModuleFactory2 == null) {
            lynxModuleFactory2 = null;
        }
        this.LJJLIIIJ = nativeCreate(j, nativeFacade, performanceController, lynxResourceLoader, iId, zLJIIIIZZ, z5, i2, i3, f, locale, zLJIILLIIL, zLJJIJIL, zLJJJIL, z, zLJI, z2, str, tasmPlatformInvokerLJLJLLL, j2, jLIZLLL, false, z3, z6, zLJFF, i4, z4, zIsDebuggable, j3, lynxModuleFactory2);
        NativeFacade nativeFacade2 = this.LJJLIIIIJ;
        C1311720kEs c1311720kEs = lynxUIRenderer.LIZIZ;
        if (c1311720kEs != null) {
            c1311720kEs.LJIILIIL = new WeakReference<>(nativeFacade2);
        }
        long j4 = this.LJJLIIIJ;
        InterfaceC1310280kCY interfaceC1310280kCY = lynxUIRenderer.LJ;
        if (interfaceC1310280kCY != null) {
            interfaceC1310280kCY.LIZIZ(j4);
        }
        this.LJJLI = nativeLifecycleCreate();
        final long j5 = this.LJJLI;
        new CleanupReference(this, new Runnable(j5) { // from class: X.0buF
            public long LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LynxTemplateRender$CleanupOnUiThread@d6f7.run");
                try {
                    long j6 = this.LL;
                    if (j6 != 0) {
                        LynxTemplateRender.nativeLifecycleDestroy(j6);
                        this.LL = 0L;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LynxTemplateRender$CleanupOnUiThread@d6f7.run");
            }

            {
                this.LL = j5;
            }
        });
        s sVar2 = this.mLynxContext;
        sVar2.LLJ = new C1311860kF6(this);
        sVar2.LLLI = z;
        C1299220jui c1299220jui = new C1299220jui();
        for (Map.Entry<String, AbstractC1300020jw0> entry : LynxEnv.inst().getResourceProvider().entrySet()) {
            String key = entry.getKey();
            AbstractC1300020jw0 value = entry.getValue();
            if (!TextUtils.isEmpty(key)) {
                ((HashMap) c1299220jui.LIZ).put(key, value);
            }
        }
        for (Map.Entry entry2 : ((HashMap) this.LJIJJLI.LJ).entrySet()) {
            String str4 = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (!TextUtils.isEmpty(str4)) {
                ((HashMap) c1299220jui.LIZ).put(str4, value2);
            }
        }
        s sVar3 = this.mLynxContext;
        sVar3.LLJJJIL = c1299220jui;
        C1309760kBi c1309760kBi = this.LJIILL;
        sVar3.LLJJJJ = c1309760kBi.LJJIIJZLJL;
        sVar3.LLJLLL = c1309760kBi.LJJIII;
        NativeFacade nativeFacade3 = this.LJJLIIIIJ;
        s sVar4 = this.mLynxContext;
        nativeFacade3.getClass();
        nativeFacade3.LJFF = new WeakReference<>(sVar4);
        int iNativeGetInstanceId = nativeGetInstanceId(this.LJJLIIIJ, this.LJJLI);
        if (iNativeGetInstanceId >= 0) {
            this.mLynxContext.LLJLILLLLZIIL = iNativeGetInstanceId;
            this.LJJJJI.LJII = iNativeGetInstanceId;
        }
        C1310660kDA c1310660kDA = this.LJJII;
        if (c1310660kDA != null) {
            c1310660kDA.setInstanceId(this.mLynxContext.LLJLILLLLZIIL);
            this.LJIILIIL.getClass();
            this.LJIILJJIL.getClass();
        }
        s sVar5 = this.mLynxContext;
        if (sVar5 != null && sVar5.LIZLLL()) {
            LynxEventReporter.updateGenericInfo("thread_mode", Integer.valueOf(this.LJIIL.id()), this.mLynxContext.LLJLILLLLZIIL);
            LynxEventReporter.moveExtraParams(i, this.mLynxContext.LLJLILLLLZIIL);
        }
        if (this.mLynxContext != null && this.LJIJJ == null) {
            InterfaceC1300010jvz interfaceC1300010jvz = this.LJIJ;
            if (interfaceC1300010jvz != null && interfaceC1300010jvz.LJJJ() != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("NativeModule:LynxTemplateRender setUpBackgroundThreadModuleFactory mLynxViewGroup: ");
                sbLIZ2.append(this.LJIJ);
                LynxLog.v("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ2));
                LynxModuleFactory lynxModuleFactoryLJJJ = this.LJIJ.LJJJ();
                this.LJIL = lynxModuleFactoryLJJJ;
                InterfaceC1297440jrq interfaceC1297440jrq = lynxModuleFactoryLJJJ.LIZJ;
                if (interfaceC1297440jrq == null) {
                    interfaceC1297320jreLIZ = null;
                } else {
                    interfaceC1297320jreLIZ = interfaceC1297440jrq.LIZ();
                }
                interfaceC1297320jreLIZ.LIZIZ(String.valueOf(this.mLynxContext.LLJLILLLLZIIL), new WeakReference<>(this.mLynxContext));
            } else {
                LynxBackgroundRuntime lynxBackgroundRuntime2 = this.LJ;
                if (lynxBackgroundRuntime2 != null) {
                    this.LJIL = lynxBackgroundRuntime2.LIZIZ;
                } else {
                    this.LJIL = new LynxModuleFactory();
                    this.LJIJJLI.getClass();
                }
                this.LJIL.LJFF = new C1297470jrt(this, new ARunnableS89S0200000_20(this, this.mLynxContext.LLJJIJI, 44));
                ?? r5 = new InterfaceC1297320jre() { // from class: X.0jru
                    public final WeakReference<Context> LIZ;

                    @Override // X.InterfaceC1297320jre
                    public final void LIZIZ(String str5, WeakReference<Context> weakReference) {
                    }

                    {
                        this.LIZ = new WeakReference<>(this.LIZIZ.mLynxContext);
                    }

                    @Override // X.InterfaceC1297320jre
                    public final WeakReference<Context> LIZ(String str5) {
                        return this.LIZ;
                    }
                };
                if (this.LJ != null) {
                    InterfaceC1297440jrq interfaceC1297440jrq2 = this.LJIL.LIZJ;
                    if (interfaceC1297440jrq2 != 0) {
                        interfaceC1297440jrq2.LIZIZ(r5);
                    }
                } else {
                    this.LJIL.LIZJ = new C1297430jrp(r5);
                }
                LynxModuleFactory lynxModuleFactory3 = this.LJIL;
                lynxModuleFactory3.LIZLLL = this.LJIILL.LJJIII;
                lynxModuleFactory3.LIZ(this.LJIJJLI.LIZLLL);
                LJL(this.LJIL);
                C1299320jus c1299320jus = new C1299320jus();
                c1299320jus.LIZ = new WeakReference<>(this.mLynxContext);
                this.LJIL.LIZJ("LynxFetchModule", LynxFetchModule.class, c1299320jus);
            }
            C1299310jur c1299310jur = this.LJIJJLI;
            InterfaceC1299780jvc interfaceC1299780jvc2 = this.LJIILL.LJJIIJ;
            s sVar6 = this.mLynxContext;
            this.mResourceLoader = new LynxResourceLoader(c1299310jur, interfaceC1299780jvc2, this, sVar6.LLLFF, sVar6.LLL);
            LynxBackgroundRuntime lynxBackgroundRuntime3 = this.LJ;
            if (lynxBackgroundRuntime3 != null) {
                this.LJJLIIIIJ.LJIIIIZZ = this.LJIL;
                nativeAttachRuntime(this.LJJLIIIJ, this.LJJLI, lynxBackgroundRuntime3.LJFF);
                C1299340juu c1299340juu3 = this.LJJJLIIL;
                if (c1299340juu3 != null && c1299340juu3.LJ) {
                    str3 = c1299340juu3.LIZJ;
                }
                WeakReference<s> weakReference = this.LJJLIIIIJ.LJFF;
                this.LJJJJZI = new JSProxy(this.LJJLIIIJ, weakReference, str3);
                NativeFacade nativeFacade4 = this.LJJLIIIIJ;
                JSProxy jSProxy = this.LJJJJZI;
                nativeFacade4.getClass();
                new WeakReference(jSProxy);
                if (weakReference.get() != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("set JSGroupThreadName to lynx context: ");
                    sbLIZ3.append(str3);
                    LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LJ = null;
            } else {
                TraceEvent.LIZLLL("TemplateRender.initPiper");
                this.LJJLIIIIJ.LJIIIIZZ = this.LJIL;
                C1299340juu c1299340juu4 = this.LJIJJLI.LIZJ;
                if (c1299340juu4 != null && c1299340juu4.LIZ) {
                    LynxLog.i("LynxTemplateRender", "useQuickJSEngine is false");
                } else {
                    LynxLog.i("LynxTemplateRender", "force use quick js engine");
                }
                long j6 = this.LJJLIIIJ;
                LynxResourceLoader lynxResourceLoader2 = this.mResourceLoader;
                LynxModuleFactory lynxModuleFactory4 = this.LJIL;
                C1299340juu c1299340juu5 = this.LJJJLIIL;
                if (c1299340juu5 != null) {
                    str2 = c1299340juu5.LIZJ;
                } else {
                    str2 = "-1";
                }
                if (c1299340juu5 != null) {
                    strArr = c1299340juu5.LIZLLL;
                } else {
                    strArr = null;
                }
                C1299310jur c1299310jur2 = this.LJIJJLI;
                nativeInitRuntime(j6, lynxResourceLoader2, lynxModuleFactory4, str2, strArr, c1299310jur2.LIZIZ, c1299310jur2.LIZ(this.LJJIJIL), ((LynxUIRenderer) LJJIJIIJI()).LIZLLL());
                C1299340juu c1299340juu6 = this.LJJJLIIL;
                if (c1299340juu6 != null && c1299340juu6.LJ) {
                    str3 = c1299340juu6.LIZJ;
                }
                WeakReference<s> weakReference2 = this.LJJLIIIIJ.LJFF;
                if (this.LJJLIIIIJ.LJI) {
                    this.LJJJJZI = new JSProxy(this.LJJLIIIJ, weakReference2, str3);
                }
                NativeFacade nativeFacade5 = this.LJJLIIIIJ;
                JSProxy jSProxy2 = this.LJJJJZI;
                nativeFacade5.getClass();
                new WeakReference(jSProxy2);
                if (weakReference2.get() != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("set JSGroupThreadName to lynx context: ");
                    sbLIZ4.append(str3);
                    LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ4));
                    weakReference2.get().getClass();
                }
                TraceEvent.LJII("TemplateRender.initPiper");
            }
            if (!this.LJIILL.LJIILLIIL()) {
                LynxLog.e("LynxTemplateRender", "setUpExtensionModules failed, isEnableJSRuntime is false");
            } else {
                HashMap map = (HashMap) this.mLynxContext.LLLFFI;
                Iterator it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    h hVar = (h) map.get(it2.next());
                    long jLIZIZ = hVar.LIZIZ();
                    if (jLIZIZ == 0) {
                        LynxLog.e("LynxTemplateRender", "Fail to get extension delegate");
                    } else {
                        nativeSetExtensionDelegate(this.LJJLIIIJ, this.LJJLI, jLIZIZ);
                        hVar.LIZLLL();
                    }
                }
            }
            if (this.mDevTool != null) {
                LynxModuleFactory lynxModuleFactory5 = this.LJIL;
                if (LynxEnv.inst().isLynxDebugEnabled()) {
                    ILynxDevToolService iLynxDevToolService = LynxDevtool.LIZJ;
                    if (iLynxDevToolService == null) {
                        LynxLog.e("LynxDevtool", "sDevToolService is null");
                    } else {
                        Class<? extends LynxModule> devToolSetModuleClass = iLynxDevToolService.getDevToolSetModuleClass();
                        if (devToolSetModuleClass != null) {
                            obj = null;
                            lynxModuleFactory5.LIZJ(devToolSetModuleClass.getSimpleName(), devToolSetModuleClass, null);
                            LynxLog.i("LynxDevtool", "register LynxDevToolSetModule!");
                        } else {
                            obj = null;
                        }
                        Class<? extends LynxModule> lynxWebSocketModuleClass = LynxDevtool.LIZJ.getLynxWebSocketModuleClass();
                        if (lynxWebSocketModuleClass != null) {
                            lynxModuleFactory5.LIZJ(lynxWebSocketModuleClass.getSimpleName(), lynxWebSocketModuleClass, obj);
                            LynxLog.i("LynxDevtool", "register LynxWebSocketModule!");
                        }
                        Class<? extends LynxModule> lynxTrailModule = LynxDevtool.LIZJ.getLynxTrailModule();
                        if (lynxTrailModule != null) {
                            lynxModuleFactory5.LIZJ(lynxTrailModule.getSimpleName(), lynxTrailModule, obj);
                            LynxLog.i("LynxDevtool", "register LynxTrailModule!");
                        }
                    }
                }
            }
            s sVar7 = this.mLynxContext;
            JSProxy jSProxy3 = this.LJJJJZI;
            sVar7.getClass();
            sVar7.LLJI = new WeakReference<>(jSProxy3);
        }
        this.LJJ = new C1298340jtI(this.mLynxContext, this.LJJJJZI);
        s sVar8 = this.mLynxContext;
        C1298340jtI c1298340jtI = this.LJJ;
        sVar8.getClass();
        sVar8.LLJJI = new WeakReference<>(c1298340jtI);
        LJJIII();
        C1298720jtu c1298720jtu = new C1298720jtu(this.LJJJLL);
        C1298340jtI c1298340jtI2 = this.LJJ;
        if (!c1298720jtu.LJFF.contains(c1298340jtI2)) {
            c1298720jtu.LJFF.add(c1298340jtI2);
        }
        c1298720jtu.LIZJ = new WeakReference<>(this.LJJLIIIIJ);
        c1298720jtu.LIZLLL = new WeakReference<>(this);
        this.mLynxContext.LLIZ = c1298720jtu;
        LJLIL(this.LJJIIJ);
        LJZI(this.LJJIIJZLJL);
        float f2 = this.LJJIL;
        if (f2 != 1.0f) {
            nativeSetFontScale(this.LJJLIIIJ, this.LJJLI, f2);
        }
        nativeOnLynxEngineCreated(this.LJJLIIIJ, ((LynxUIRenderer) LJJIJIIJI()).LIZLLL());
        TraceEvent.LJII("TemplateRender.createLynxEngine");
    }

    public final void LJIIL(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300004, "com/lynx/tasm/LynxTemplateRender", "dispatchOnPageStart", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEg4jUdKSQVYySFyof7dLwL+S+dDH4fIojCZt8lk=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        LynxLog.i("LynxTemplateRender", "dispatchOnPageStart url " + str + " in " + toString());
        if (!this.LJIIJJI && this.LJIILIIL != null) {
            this.LJIIJJI = true;
            s sVar = this.mLynxContext;
            if (sVar != null && sVar.LIZLLL()) {
                LynxEventReporter.onEvent("lynxsdk_open_page", (Map<String, Object>) null, this.mLynxContext.LLJLILLLLZIIL);
            }
            TraceEvent.LJIIJ(1L, "StartLoad");
            LJJJJI("Client.onPageStart");
            this.LJIILIIL.LJIIZILJ(str);
            this.LJIILJJIL.LIZ(LJJ(), new C0N2X());
            LJJJJIZL("Client.onPageStart");
        }
    }

    public final boolean LJIILIIL(MotionEvent motionEvent) {
        InterfaceC1310280kCY interfaceC1310280kCY;
        C1309900kBw c1309900kBw;
        LJFF(false);
        PerformanceController performanceController = this.LJJJJI;
        if (performanceController != null && LynxEnv.inst().enableFSP() && (c1309900kBw = performanceController.LJIIIIZZ) != null && c1309900kBw.LIZ.LIZ && c1309900kBw.LIZIZ.get()) {
            EnumC1309890kBv enumC1309890kBv = EnumC1309890kBv.CANCEL_BY_USER_INTERACTION;
            c1309900kBw.LIZIZ.set(false);
            long jLJIIIZ = PerformanceController.LJIIIZ();
            if (jLJIIIZ > 0) {
                c1309900kBw.LIZ(enumC1309890kBv, c1309900kBw.LIZJ, jLJIIIZ);
            }
        }
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
        if (interfaceC1309730kBf == null) {
            return false;
        }
        LynxUIRenderer lynxUIRenderer = (LynxUIRenderer) interfaceC1309730kBf;
        s sVar = lynxUIRenderer.LIZ.get();
        if (sVar != null && sVar.LJIJJ() && (interfaceC1310280kCY = lynxUIRenderer.LJ) != null) {
            if (!interfaceC1310280kCY.LIZJ(motionEvent)) {
                return false;
            }
        } else {
            lynxUIRenderer.LIZ();
            C1311380kEK c1311380kEK = lynxUIRenderer.LIZJ;
            if (c1311380kEK == null || !c1311380kEK.LJIJJ(motionEvent, null)) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void LJIILL(boolean z) {
        EnumC665490Q8l enumC665490Q8l;
        InterfaceC1310560kD0 c1310090kCF;
        C1309670kBZ c1309670kBZ;
        if (!C1289620jfE.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fallbackNewEngine should be called on ui thread, url: ");
            sbLIZ.append(this.LJI);
            LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LJIIIZ) {
            return;
        }
        LJJJJI("TemplateRender.fallbackNewEngine");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("call fallbackNewEngine enable_async:");
        sbLIZ2.append(z);
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJJLIIIJL = false;
        this.LJII = false;
        this.LJIIJJI = false;
        this.LJIIIIZZ = null;
        this.LJJJJIZL = "setup";
        s sVar = this.mLynxContext;
        if (sVar != null && (c1309670kBZ = sVar.LLJJJJLIIL) != null) {
            C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1309670kBZ, 61));
        }
        TemplateData templateData = this.LJJIIJZLJL;
        if (templateData != null) {
            this.LJJIIJZLJL = templateData.LJ();
        }
        if (this.LJJLIIIJ != 0 && !LynxEnv.inst().enableFallbackNewEngineRebuild()) {
            LJIIIZ();
        }
        int i = this.LIZJ;
        int i2 = this.LIZLLL;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJJLL = null;
        this.LJJLIIIJLLLLLLLZ = false;
        ((C1310490kCt) this.LJIIZILJ.LJIL()).getClass();
        LynxUIRenderer lynxUIRenderer = new LynxUIRenderer();
        this.LJJJIL = lynxUIRenderer;
        this.LJJII.setLynxUIRendererInternal(lynxUIRenderer);
        s sVar2 = this.mLynxContext;
        if (sVar2 != null) {
            sVar2.LJJII();
        }
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
        if (interfaceC1309730kBf != null) {
            ((LynxUIRenderer) interfaceC1309730kBf).LJI(this.mLynxContext, this.LJIIZILJ.LJ(), this.LJJII, this.LJJIZ);
            if (this.mDevTool != null) {
            }
        }
        if (z) {
            enumC665490Q8l = EnumC665490Q8l.MOST_ON_TASM;
        } else {
            enumC665490Q8l = EnumC665490Q8l.ALL_ON_UI;
        }
        this.LJIIL = enumC665490Q8l;
        if (this.LJJLIIIJ != 0 && LynxEnv.inst().enableFallbackNewEngineRebuild()) {
            TasmPlatformInvoker tasmPlatformInvokerLJLJLLL = LJLJLLL();
            EnumC665490Q8l enumC665490Q8l2 = this.LJIIL;
            if (enumC665490Q8l2 == EnumC665490Q8l.ALL_ON_UI) {
                C1310080kCE c1310080kCE = new C1310080kCE(this.LJJII);
                this.LIZIZ = c1310080kCE;
                c1310090kCF = c1310080kCE;
            } else {
                c1310090kCF = new C1310090kCF(this.mLynxContext);
            }
            ((LynxUIRenderer) this.LJJJIL).LJ(this.mLynxContext, enumC665490Q8l2, this.LJIIZILJ.LJ(), c1310090kCF);
            long j = this.LJJLIIIJ;
            long j2 = this.LJJLI;
            long jLIZLLL = ((LynxUIRenderer) this.LJJJIL).LIZLLL();
            LynxModuleFactory lynxModuleFactory = this.LJJZ;
            if (lynxModuleFactory == null) {
                lynxModuleFactory = null;
            }
            nativeRebuildLynxEngine(j, j2, jLIZLLL, tasmPlatformInvokerLJLJLLL, lynxModuleFactory);
            InterfaceC1309730kBf interfaceC1309730kBf2 = this.LJJJIL;
            NativeFacade nativeFacade = this.LJJLIIIIJ;
            C1311720kEs c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf2).LIZIZ;
            if (c1311720kEs != null) {
                c1311720kEs.LJIILIIL = new WeakReference<>(nativeFacade);
            }
            InterfaceC1309730kBf interfaceC1309730kBf3 = this.LJJJIL;
            long j3 = this.LJJLIIIJ;
            InterfaceC1310280kCY interfaceC1310280kCY = ((LynxUIRenderer) interfaceC1309730kBf3).LJ;
            if (interfaceC1310280kCY != null) {
                interfaceC1310280kCY.LIZIZ(j3);
            }
            LJJIII();
            C1298720jtu c1298720jtu = new C1298720jtu(this.LJJJLL);
            C1298340jtI c1298340jtI = this.LJJ;
            if (!c1298720jtu.LJFF.contains(c1298340jtI)) {
                c1298720jtu.LJFF.add(c1298340jtI);
            }
            c1298720jtu.LIZJ = new WeakReference<>(this.LJJLIIIIJ);
            c1298720jtu.LIZLLL = new WeakReference<>(this);
            this.mLynxContext.LLIZ = c1298720jtu;
            nativeOnLynxEngineCreated(this.LJJLIIIJ, ((LynxUIRenderer) LJJIJIIJI()).LIZLLL());
        } else {
            LJII(-1);
        }
        LLD(i, i2, true);
        this.mLynxContext.LJIL(true);
        LJJJJIZL("TemplateRender.fallbackNewEngine");
    }

    public final LynxBaseUI LJIILLIIL(String str) {
        C1311720kEs c1311720kEs;
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
        if (interfaceC1309730kBf != null && (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) != null) {
            for (LynxBaseUI lynxBaseUI : c1311720kEs.LJI.values()) {
                if (lynxBaseUI != null && str.equals(lynxBaseUI.mName)) {
                    return lynxBaseUI;
                }
            }
        }
        return null;
    }

    public final String LJIIZILJ(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(jCurrentTimeMillis));
        sb.append(" ");
        sb.append(str);
        sb.append(" LynxView ");
        if (this.mLynxContext != null && !TextUtils.isEmpty("")) {
            this.mLynxContext.getClass();
            sb.append(" ");
        }
        String str2 = this.LJI;
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public final void LJIJJ(InterfaceC1310260kCW interfaceC1310260kCW) {
        if (this.LJJI && this.LJJLIIIJ != 0) {
            int iIncrementAndGet = this.LJJLIIIJILLIZJL.incrementAndGet();
            this.LJJLIIIJJI.put(iIncrementAndGet, interfaceC1310260kCW);
            nativeGetDataAsync(this.LJJLIIIJ, this.LJJLI, iIncrementAndGet);
            return;
        }
        interfaceC1310260kCW.onFail();
    }

    public final JavaOnlyMap LJIL(int i) {
        return nativeGetListPlatformInfo(this.LJJLIIIJ, this.LJJLI, i);
    }

    public final Map<String, Object> LJJIFFI(String[] strArr) {
        if (this.LJJI) {
            long j = this.LJJLIIIJ;
            if (j != 0) {
                Object objNativeGetPageDataByKey = nativeGetPageDataByKey(j, this.LJJLI, strArr);
                HashMap map = new HashMap();
                if (objNativeGetPageDataByKey instanceof Map) {
                    map.putAll((Map) objNativeGetPageDataByKey);
                }
                return map;
            }
            return null;
        }
        return null;
    }

    public final void LJJIIJ(C1309930kBz c1309930kBz) {
        String str;
        if (this.LJJLIIIJ != 0) {
            if ((c1309930kBz.LJI & EnumC1309970kC3.PROCESS_LAYOUT_WITHOUT_UI_FLUSH.id()) != 0) {
                LJJZZI(false);
            }
            Map<String, String> map = c1309930kBz.LJII;
            if (((map != null && !map.isEmpty()) || (map = this.LJFF) != null) && (str = map.get(EnumC1980107pH.PLATFORM_CONFIG.getKey())) != null) {
                nativeSetPlatformConfig(this.LJJLIIIJ, this.LJJLI, str);
            }
            InterfaceC1300010jvz interfaceC1300010jvz = this.LJIJ;
            if (interfaceC1300010jvz != null) {
                LJZ(interfaceC1300010jvz.getGlobalProps());
            }
            TemplateData templateData = c1309930kBz.LJFF;
            if (templateData != null) {
                LJZ(templateData);
            }
        }
    }

    public final synchronized void LJJIIJZLJL(TemplateData templateData) {
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = TemplateData.LJII(new HashMap());
        }
        this.LJJIIJZLJL.LJIJJLI(templateData);
        LynxDevtool lynxDevtool = this.mDevTool;
        if (lynxDevtool != null) {
            TemplateData templateData2 = this.LJJIIJZLJL;
            C1309850kBr c1309850kBr = lynxDevtool.LIZIZ;
            if (c1309850kBr != null) {
                c1309850kBr.LJ = templateData2;
            }
        }
    }

    public final void LJJIIZI(C1309930kBz c1309930kBz) {
        if (this.LJIIIZ) {
            return;
        }
        LJJJJI("LynxTemplateRender.loadTemplateWithMeta");
        if ((!this.LJJIII || this.LJII) && !C1289620jfE.LIZIZ()) {
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(this, c1309930kBz, 37));
            LJJJJIZL("LynxTemplateRender.loadTemplateWithMeta");
            return;
        }
        c1309930kBz.getClass();
        if (EnumC1309980kC4.PRE_PAINTING == null) {
            C1310660kDA c1310660kDA = this.LJJII;
            if (c1310660kDA != null) {
                c1310660kDA.setShouldInterceptRequestLayout(true);
            }
            s sVar = this.mLynxContext;
            sVar.LLJLIL = true;
            C1298720jtu c1298720jtu = sVar.LLIZ;
            if (c1298720jtu != null) {
                c1298720jtu.LIZIZ = true;
            }
        }
        if (EnumC1309980kC4.RENDER_SSR == null) {
            byte[] bArr = c1309930kBz.LIZIZ;
            if (bArr != null && bArr.length > 0) {
                LJJLIIIIJ(c1309930kBz.LIZIZ, c1309930kBz.LIZ, c1309930kBz.LJ);
            } else if (!c1309930kBz.LIZ.isEmpty()) {
                String str = c1309930kBz.LIZ;
                LJJLIIIJ(str, new C1303600k1m(this, str, c1309930kBz.LJ));
            } else {
                LynxLog.e("LynxTemplateRender", "SSR rendering failed: Binary data is invalid or URL is empty.");
            }
            LJJJJIZL("LynxTemplateRender.loadTemplateWithMeta");
            return;
        }
        C1310200kCQ c1310200kCQ = this.LJIIIIZZ;
        if (c1310200kCQ != null && c1310200kCQ.LIZ == EnumC1309880kBu.PENDING && EnumC1309980kC4.HYDRATE_SSR == null) {
            c1310200kCQ.getClass();
            c1310200kCQ.LIZ = EnumC1309880kBu.STARTED;
        }
        C1309870kBt c1309870kBtLIZ = C1309870kBt.LIZ("loadBundle", "loadBundleStart", this.LJJJJI.LJ);
        PerformanceController performanceController = this.LJJJJI;
        if (performanceController.LJ) {
            performanceController.LJIILIIL("loadBundleStart", null);
        }
        LJLILLLLZI(c1309930kBz.LIZ);
        LJJLIIIJL(c1309930kBz, c1309870kBtLIZ);
        LynxLog.i("LynxTemplateRender", LJIIZILJ("renderTemplate"));
        if (c1309930kBz.LJ != null) {
            LJJJJJ(c1309930kBz.LJ);
        }
        LJJJJIZL("LynxTemplateRender.loadTemplateWithMeta");
    }

    public final void LJJIL(boolean z) {
        C1311720kEs c1311720kEs;
        List<InterfaceC1310460kCq> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterBackground. force: ");
        sbLIZ.append(z);
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        LynxDevtool lynxDevtool = this.mDevTool;
        if (lynxDevtool != null) {
            lynxDevtool.getClass();
        }
        if (this.LJJLIIIJ != 0 && (z || LJIJI())) {
            nativeOnEnterBackground(this.LJJLIIIJ, this.LJJLI);
        }
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
        if (interfaceC1309730kBf != null && (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) != null && (list = c1311720kEs.LJFF) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1310460kCq) it2.next()).LJIILLIIL();
            }
        }
    }

    public final void LJJIZ(boolean z) {
        C1311720kEs c1311720kEs;
        List<InterfaceC1310460kCq> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterForeground. force: ");
        sbLIZ.append(z);
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        LynxDevtool lynxDevtool = this.mDevTool;
        if (lynxDevtool != null) {
            lynxDevtool.getClass();
        }
        if (this.LJJLIIIJ != 0 && (z || LJIJI())) {
            nativeOnEnterForeground(this.LJJLIIIJ, this.LJJLI);
        }
        InterfaceC1309730kBf interfaceC1309730kBf = this.LJJJIL;
        if (interfaceC1309730kBf != null && (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) != null && (list = c1311720kEs.LJFF) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1310460kCq) it2.next()).LJIIIIZZ();
            }
        }
    }

    public final void LJJJJI(String str) {
        String string;
        if (!TraceController.isTracingStarted()) {
            return;
        }
        HashMap map = new HashMap();
        s sVar = this.mLynxContext;
        if (sVar != null) {
            map.put("instance_id", String.valueOf(sVar.LLJLILLLLZIIL));
            if (this.mLynxContext.LJIILJJIL() != null) {
                string = this.mLynxContext.LJIILJJIL().toString();
            } else {
                string = "null";
            }
            map.put("lynx_view", string);
        }
        TraceEvent.LIZ(1L, str, map);
    }

    public final void LJJJJJ(TemplateData templateData) {
        if (templateData != null) {
            if (LynxEnv.inst().enableDataListFix()) {
                templateData.LJIIIIZZ = new WeakReference<>(this.mLynxContext);
            }
            ((CopyOnWriteArrayList) this.LJJIIZI).add(templateData);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("retain TemplateData for lifecycle, url=");
            String str = this.LJI;
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append(", data=");
            sbLIZ.append(templateData);
            sbLIZ.append(", listSize=");
            sbLIZ.append(((CopyOnWriteArrayList) this.LJJIIZI).size());
            sbLIZ.append(", bindContextEnabled=");
            sbLIZ.append(LynxEnv.inst().enableDataListFix());
            LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJJJJJL(String[] strArr) {
        nativePreloadLazyBundles(this.LJJLIIIJ, this.LJJLI, strArr);
    }

    public final boolean LJJJJLI(TemplateData templateData) {
        if (!this.LJJI || this.LJJLIIIJ == 0) {
            return false;
        }
        if (templateData == null) {
            LynxLog.e("LynxTemplateRender", "updateData with null TemplateData");
            return false;
        }
        templateData.LJI();
        if (templateData.LIZ == 0) {
            LynxLog.e("LynxTemplateRender", "updateData with TemplateData after flush is nullptr");
            return false;
        }
        this.LJJIFFI = true;
        long j = this.LJJLIIIJ;
        if (j != 0) {
            nativeMarkDirty(j, this.LJJLI);
        }
        return true;
    }

    public final void LJJLIIIJLJLI(TemplateData templateData) {
        LynxDevtool lynxDevtool;
        C1309850kBr c1309850kBr;
        LJJJJI("LynxTemplateRender.resetData");
        if (LJJJJLI(templateData)) {
            if (templateData != null && (lynxDevtool = this.mDevTool) != null && (c1309850kBr = lynxDevtool.LIZIZ) != null) {
                c1309850kBr.LIZLLL = templateData;
            }
            nativeResetDataByPreParsedData(this.LJJLIIIJ, this.LJJLI, templateData.LIZ, templateData.LIZJ, templateData.LJ, templateData);
        }
        LJJJJJ(templateData);
        LynxLog.i("LynxTemplateRender", LJIIZILJ("reset"));
        LJJJJIZL("LynxTemplateRender.resetData");
    }

    public final void LJJLIIJ(int i) {
        nativeScrollStopped(this.LJJLIIIJ, this.LJJLI, i);
    }

    public final void LJJLL(InterfaceC1310500kCu interfaceC1310500kCu) {
        s sVar = this.mLynxContext;
        if (sVar != null && sVar.LJIILIIL() != null) {
            this.mLynxContext.LJIILIIL().LJIJ = interfaceC1310500kCu;
        }
    }

    public final void LJJZZI(boolean z) {
        long j = this.LJJLIIIJ;
        if (j != 0 && this.LJJJ != z) {
            this.LJJJ = z;
            nativeSetEnableUIFlush(j, this.LJJLI, z);
        }
    }

    public final void LJJZZIII(EnumC1299430jv3 enumC1299430jv3) {
        boolean z;
        if (C1289620jfE.LIZIZ()) {
            this.LJJIZ = enumC1299430jv3;
            long j = this.LJJLIIIJ;
            if (j != 0) {
                long j2 = this.LJJLI;
                if (enumC1299430jv3 == EnumC1299430jv3.FALSE) {
                    z = true;
                } else {
                    z = false;
                }
                nativeSetLongTaskMonitorDisabled(j, j2, z);
                return;
            }
            return;
        }
        throw new AssertionError("Expected to run on UI thread!");
    }

    public final void LJLIIL(ByteBuffer byteBuffer) {
        if (this.LJJI) {
            long j = this.LJJLIIIJ;
            if (j != 0) {
                nativeUpdateConfig(j, this.LJJLI, byteBuffer, byteBuffer.position());
            }
        }
    }

    public final void LJLIL(C1299170jud c1299170jud) {
        if (c1299170jud == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("theme", c1299170jud.LIZ);
        C1298840ju6.LIZ.getClass();
        ByteBuffer byteBufferLIZIZ = C1298840ju6.LIZIZ(map);
        if (byteBufferLIZIZ != null) {
            nativeUpdateConfig(this.LJJLIIIJ, this.LJJLI, byteBufferLIZIZ, byteBufferLIZIZ.position());
        }
    }

    public final void LJLILLLLZI(String str) {
        this.LJI = str;
        LynxEnv.inst().setLastUrl(this.LJI);
        s sVar = this.mLynxContext;
        if (sVar != null) {
            sVar.LLJJIII = this.LJI;
        }
        if (!this.LJIILL.LJIILLIIL()) {
            LynxLog.e("LynxTemplateRender", "notifyExtensionModulesTemplateLoad failed, isEnableJSRuntime is false");
            return;
        }
        HashMap map = (HashMap) this.mLynxContext.LLLFFI;
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            ((h) map.get(it2.next())).LIZJ(str);
        }
    }

    public final boolean LJLLI(TemplateData templateData) throws Throwable {
        long j;
        LJJJJI("LynxTemplateRender.tryRenderByReuseLynxRender");
        LynxEngine lynxEngine = this.LJJLL;
        if (lynxEngine == null) {
            LJLLILLLL();
            if (this.LJJLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("call nativeReattachLynxEngineWrapper.");
                sbLIZ.append(this);
                LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
                long j2 = this.LJJLIIIJ;
                long j3 = this.LJJLI;
                long j4 = this.LJJLL.LIZIZ;
                LynxEngineProxy lynxEngineProxy = this.LJJJLL;
                if (lynxEngineProxy != null) {
                    j = lynxEngineProxy.LIZ;
                } else {
                    j = 0;
                }
                nativeReattachLynxEngineWrapper(j2, j3, j4, j);
                EnumC665490Q8l enumC665490Q8l = this.LJIIL;
                if (enumC665490Q8l == EnumC665490Q8l.ALL_ON_UI && enumC665490Q8l != this.LJJLL.LJ) {
                    LIZIZ();
                }
                if ((this.LJJII instanceof LynxView) && LJJ() != null && LJJ().getCurrentWidthMeasureSpec() >= 0 && LJJ().getCurrentHeightMeasureSpec() >= 0) {
                    LLD(LJJ().getCurrentWidthMeasureSpec(), LJJ().getCurrentHeightMeasureSpec(), false);
                }
                LJIIL(this.LJI);
                LJLLLL(templateData, true);
                LJJJJIZL("LynxTemplateRender.tryRenderByReuseLynxRender");
                return true;
            }
            LJIILL(false);
        } else if (lynxEngine.LIZLLL()) {
            if ((this.LJJII instanceof LynxView) && LJJ() != null && LJJ().getCurrentWidthMeasureSpec() >= 0 && LJJ().getCurrentHeightMeasureSpec() >= 0) {
                LLD(LJJ().getCurrentWidthMeasureSpec(), LJJ().getCurrentHeightMeasureSpec(), false);
            }
            LJIIL(this.LJI);
            LJLLLL(templateData, true);
            LJJJJIZL("LynxTemplateRender.tryRenderByReuseLynxRender");
            return true;
        }
        LJJJJIZL("LynxTemplateRender.tryRenderByReuseLynxRender");
        return false;
    }

    public final void LJLLLLLL(float f) {
        if (this.LJJI) {
            long j = this.LJJLIIIJ;
            if (j != 0) {
                nativeUpdateFontScale(j, this.LJJLI, f);
            }
        }
    }

    public final void LJLZ(String str) {
        s sVar = this.mLynxContext;
        if (sVar != null && sVar.LIZLLL() && str != null) {
            int i = this.mLynxContext.LLJLILLLLZIIL;
            HashMap map = new HashMap();
            map.put("url", str);
            map.put("relative_path", str);
            LynxEventReporter.updateGenericInfo(map, i);
            C1289810jfX c1289810jfX = this.LJJJJ;
            if (c1289810jfX != null) {
                c1289810jfX.LIZ("last_lynx_url", str);
            }
        }
    }

    public final void LJZ(TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGlobalProps with url: ");
        String str = this.LJI;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJI("TemplateRender.setGlobalProps");
        if (this.LJJI && this.LJJLIIIJ != 0 && templateData != null) {
            LJJIIJZLJL(templateData);
            LJZI(this.LJJIIJZLJL);
        }
        LJJJJIZL("TemplateRender.setGlobalProps");
    }

    public final synchronized void LJZI(TemplateData templateData) {
        if (templateData == null) {
            return;
        }
        templateData.LJI();
        long j = templateData.LIZ;
        if (j == 0) {
            LynxLog.e("LynxTemplateRender", "updateGlobalProps with zero templateData");
        } else {
            nativeUpdateGlobalProps(this.LJJLIIIJ, this.LJJLI, j);
        }
    }

    public final void LJZL(C1300050jw3 c1300050jw3) {
        TemplateData templateData;
        long j;
        boolean z;
        long j2;
        long j3;
        LynxDevtool lynxDevtool;
        C1309850kBr c1309850kBr;
        s sVar = this.mLynxContext;
        if (sVar == null) {
            return;
        }
        LJJJJI("LynxTemplateRender.updateMetaData");
        if (sVar.LJIJI()) {
            this.LJJJJI.LJIILIIL("updateDataStart", "");
        }
        TemplateData templateData2 = c1300050jw3.LIZ;
        if (this.mLynxContext != null && this.LJIJJ != null) {
            if (templateData2 != null) {
                templateData2.LJI = false;
                this.LJJLJLI.LJIJJLI(templateData2);
                lynxDevtool = this.mDevTool;
                if (lynxDevtool != null) {
                    c1309850kBr.LIZIZ(templateData2);
                }
            }
        } else if (templateData2 != null) {
            lynxDevtool = this.mDevTool;
            if (lynxDevtool != null && (c1309850kBr = lynxDevtool.LIZIZ) != null) {
                c1309850kBr.LIZIZ(templateData2);
            }
        }
        if (this.LJJLIIIJL) {
            if (this.LJJLL == null) {
                LJLLILLLL();
                if (this.LJJLL == null) {
                    LJIILL(false);
                    LJJLIIIJILLIZJL(this.LJIILLIIL, this.LJJLJLI, this.LJI);
                    LJJJJIZL("LynxTemplateRender.updateMetaData");
                    return;
                }
                LynxLog.i("LynxTemplateRender", "call nativeReattachLynxEngineWrapper");
                long j4 = this.LJJLIIIJ;
                long j5 = this.LJJLI;
                long j6 = this.LJJLL.LIZIZ;
                LynxEngineProxy lynxEngineProxy = this.LJJJLL;
                if (lynxEngineProxy != null) {
                    j3 = lynxEngineProxy.LIZ;
                } else {
                    j3 = 0;
                }
                nativeReattachLynxEngineWrapper(j4, j5, j6, j3);
                EnumC665490Q8l enumC665490Q8l = this.LJIIL;
                if (enumC665490Q8l == EnumC665490Q8l.ALL_ON_UI && enumC665490Q8l != this.LJJLL.LJ) {
                    LIZIZ();
                }
            }
            this.LJJLJ.incrementAndGet();
        }
        if (sVar.LLJLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateData after pre load, url:");
            sbLIZ.append(this.LJI);
            LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            C1310660kDA c1310660kDA = this.LJJII;
            if (c1310660kDA != null) {
                c1310660kDA.setShouldInterceptRequestLayout(false);
            }
            sVar.LLJLIL = false;
            C1298720jtu c1298720jtu = sVar.LLIZ;
            if (c1298720jtu != null) {
                c1298720jtu.LIZIZ = false;
            }
        }
        TemplateData templateData3 = c1300050jw3.LIZIZ;
        String str = null;
        if (templateData3 != null) {
            LJJIIJZLJL(templateData3);
            templateData = this.LJJIIJZLJL;
        } else {
            templateData = null;
        }
        if (this.LJJLIIIJ != 0) {
            if (templateData2 == null) {
                if (templateData == null) {
                    LynxLog.e("LynxTemplateRender", "updateMetaData with null data and null globalProps.");
                } else {
                    z = false;
                    j = 0;
                }
            } else {
                templateData2.LJI();
                j = templateData2.LIZ;
                str = templateData2.LIZJ;
                z = templateData2.LJ;
            }
            if (templateData != null) {
                templateData.LJI();
                j2 = templateData.LIZ;
            } else {
                j2 = 0;
            }
            nativeUpdateMetaData(this.LJJLIIIJ, this.LJJLI, j, str, z, templateData2, j2);
        }
        LJJJJJ(templateData2);
        LJJJJJ(templateData);
        LJJJJIZL("LynxTemplateRender.updateMetaData");
    }

    @Override // X.InterfaceC1299820jvg
    public final void onErrorOccurred(final LynxError lynxError) {
        int i;
        InterfaceC1310380kCi interfaceC1310380kCi;
        String str;
        if (lynxError != null && (!TextUtils.isEmpty(lynxError.LIZLLL) || !TextUtils.isEmpty(lynxError.LJII))) {
            String str2 = this.LJI;
            lynxError.LJI = null;
            lynxError.LJIIIIZZ = str2;
            s sVar = this.mLynxContext;
            if (sVar != null) {
                C1310290kCZ c1310290kCZ = sVar.LLLIIII;
                if (c1310290kCZ == null) {
                    LynxLog.e("LynxContext", "PageConfig is null.GetPageVersion get default error;");
                    str = "error";
                } else {
                    str = c1310290kCZ.LIZLLL;
                }
                lynxError.LJI = null;
                lynxError.LJIIJ = str;
            }
            LynxDevtool lynxDevtool = this.mDevTool;
            if (lynxDevtool != null && (interfaceC1310380kCi = lynxDevtool.LIZ) != null) {
                interfaceC1310380kCi.LIZIZ();
            }
            C1310200kCQ c1310200kCQ = this.LJIIIIZZ;
            if (c1310200kCQ != null && lynxError.LIZIZ() == 102) {
                c1310200kCQ.LIZ = EnumC1309880kBu.FAILED;
            }
            if (!lynxError.LIZ) {
                s sVar2 = this.mLynxContext;
                if (sVar2 != null && sVar2.LIZLLL()) {
                    s sVar3 = this.mLynxContext;
                    if (sVar3 == null) {
                        i = -1;
                    } else {
                        i = sVar3.LLJLILLLLZIIL;
                    }
                    LynxEventReporter.onEvent("lynxsdk_error_event", i, new InterfaceC1289180jeW() { // from class: X.0jw4
                        @Override // X.InterfaceC1289180jeW
                        public final Map<String, Object> build() {
                            HashMap map = new HashMap();
                            map.put("code", Integer.valueOf(lynxError.LIZIZ()));
                            String str3 = lynxError.LJIIIZ;
                            if (str3 == null) {
                                str3 = "";
                            }
                            map.put("level", str3);
                            map.put("summary_message", lynxError.LJ());
                            return map;
                        }
                    });
                }
                int i2 = lynxError.LJFF;
                LJJJJI("TemplateRender.dispatchError");
                int iLIZIZ = lynxError.LIZIZ();
                if (iLIZIZ == 102) {
                    this.LJIILIIL.LJIILIIL(lynxError.LIZJ());
                } else {
                    this.LJIILIIL.LJIJJ(lynxError.LIZJ());
                }
                this.LJIILIIL.LJFF(lynxError);
                if (iLIZIZ == 201) {
                    this.LJIILIIL.LJIJJLI(lynxError);
                } else if (i2 == -1) {
                    this.LJIILIIL.LJJ(lynxError);
                } else {
                    this.LJIILIIL.LJIL(lynxError);
                }
                LJJJJIZL("TemplateRender.dispatchError");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxTemplateRender ");
            sbLIZ.append(toString());
            sbLIZ.append(": onErrorOccurred type ");
            sbLIZ.append(lynxError.LJFF);
            sbLIZ.append(",errCode:");
            sbLIZ.append(lynxError.LIZIZ());
            sbLIZ.append(",detail:");
            sbLIZ.append(lynxError.LIZJ());
            LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LynxLog.e("LynxTemplateRender", "receive invalid error");
    }

    private void getDataBack(ByteBuffer byteBuffer, int i) {
        InterfaceC1310260kCW interfaceC1310260kCW = this.LJJLIIIJJI.get(i);
        C1298840ju6.LIZ.getClass();
        Object objLIZ = C1298840ju6.LIZ(byteBuffer);
        if (objLIZ instanceof Map) {
            interfaceC1310260kCW.LIZ(JavaOnlyMap.from((Map) objLIZ));
        } else {
            interfaceC1310260kCW.onFail();
        }
    }

    public final void LJJII(String str, PlatformCallBack platformCallBack) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSessionStorageItem with key: ");
        sbLIZ.append(str);
        LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str)) {
            long j = this.LJJLIIIJ;
            if (j != 0) {
                nativeGetSessionStorageItem(j, this.LJJLI, str, platformCallBack);
            }
        }
    }

    public final void LJJIIZ(InterfaceC1303630k1p interfaceC1303630k1p, String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            LJIIL(this.LJI);
            this.LJJJJI.LJIILIIL("prepareTemplateStart", null);
            this.LJJJJJ.LIZ(interfaceC1303630k1p, this.LJI);
            return;
        }
        throw new IllegalArgumentException("LynxTemplateRender template url is null or TemplateProvider is not init");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJI(int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxTemplateRender.LJJJI(int, int):void");
    }

    public final void LJJJJZI(int i, int i2) {
        nativeRecycleChild(this.LJJLIIIJ, this.LJJLI, i, i2);
    }

    public final void LJJJLIIL(int i, int i2) {
        nativeRecycleChildAsync(this.LJJLIIIJ, this.LJJLI, i, i2);
    }

    public final boolean LJJJLL(String str, TemplateBundle templateBundle) {
        String str2;
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            str2 = "url is empty";
        } else if (templateBundle == null) {
            str2 = "bundle is null";
        } else if (!templateBundle.LJFF()) {
            str3 = templateBundle.LLILZ;
            str2 = "bundle is invalid";
        } else if (!nativeRegisterLazyBundle(this.LJJLIIIJ, this.LJJLI, str, templateBundle.LLILLJJLI)) {
            str2 = "input bundle is not from a valid template bundle.";
        } else {
            return true;
        }
        LynxError lynxError = new LynxError(160104, str2);
        lynxError.LJIIIIZZ(str3);
        lynxError.LIZ("component_url", str);
        if (this.LJJLIIIIJ != null) {
            this.LJJLIIIIJ.reportError(lynxError);
            return false;
        }
        return false;
    }

    public final void LJJJZ(TemplateData templateData, TemplateData templateData2) {
        long j;
        C1310290kCZ c1310290kCZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reloadTemplate with url: ");
        String str = this.LJI;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        LJJJJI("LynxTemplateRender.reloadTemplate");
        C1309870kBt c1309870kBtLIZ = C1309870kBt.LIZ("reloadBundleFromNative", "reloadBundleStart", this.LJJJJI.LJ);
        if (LJJJJLI(templateData)) {
            if (templateData2 != null) {
                this.LJJIIJZLJL = templateData2;
            }
            this.LJIILJJIL.LIZ(LJJ(), new C0N2X());
            if (templateData2 != null) {
                templateData2.LJI();
                j = templateData2.LIZ;
            } else {
                j = 0;
            }
            s sVar = this.mLynxContext;
            if (sVar != null && (c1310290kCZ = sVar.LLLIIII) != null && c1310290kCZ.LJJIIJ) {
                if (sVar.LLJJJJLIIL != null) {
                    C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(sVar, (Object) null, 135));
                }
                s sVar2 = this.mLynxContext;
                if (sVar2.LLJJJJLIIL != null) {
                    C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(sVar2, 220));
                }
            }
            c1309870kBtLIZ.LIZIZ("ffiStart");
            nativeReloadTemplate(this.LJJLIIIJ, this.LJJLI, templateData.LIZ, j, templateData.LIZJ, templateData.LJ, templateData2, templateData, c1309870kBtLIZ.LIZJ());
        }
        LJJJJJ(templateData);
        LynxLog.i("LynxTemplateRender", LJIIZILJ("reload"));
        LJJJJIZL("LynxTemplateRender.reloadTemplate");
    }

    public final void LJJL(int i, int i2) {
        nativeRemoveChild(this.LJJLIIIJ, this.LJJLI, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0jvs] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJJLIIIJ(String str, final C1303600k1m c1303600k1m) {
        if (!this.LJJI) {
            onErrorOccurred(new LynxError(10202, "LynxEnv has not been prepared successfully!", null, "error"));
            return;
        }
        LJJJJI("LynxTemplateRender.renderSSRUrlInternal");
        String[] strArrLJJJJZ = LJJJJZ(str);
        LJLILLLLZI(strArrLJJJJZ[0]);
        LJLZ(strArrLJJJJZ[0]);
        LynxLog.i("LynxTemplateRender", LJIIZILJ("renderTemplate"));
        AbstractC1299950jvt abstractC1299950jvt = this.mLynxContext.LLLFF;
        if (abstractC1299950jvt != 0) {
            abstractC1299950jvt.LIZ(new C1301600jyY(str, EnumC1299880jvm.LynxResourceTypeTemplate), new InterfaceC1290540jgi<byte[]>() { // from class: X.0jvs
                @Override // X.InterfaceC1290540jgi
                public final void LIZ(C1289590jfB<byte[]> c1289590jfB) {
                    int i = C1299920jvq.LIZ[c1289590jfB.LIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            c1303600k1m.onFailed(c1289590jfB.LIZJ.getMessage());
                            return;
                        }
                        return;
                    }
                    c1303600k1m.LIZ(c1289590jfB.LIZIZ);
                }
            });
        } else {
            LJJIIZ(c1303600k1m, str);
        }
        LJJJJIZL("LynxTemplateRender.renderSSRUrlInternal");
    }

    public final void LJJLIIIJJI(String str, final C1309800kBm c1309800kBm) {
        TemplateData templateData;
        if (!this.LJJI) {
            onErrorOccurred(new LynxError(10202, "LynxEnv has not been prepared successfully!", null, "error"));
            return;
        }
        LJJJJI("LynxTemplateRender.renderTemplate");
        if (str != null) {
            String[] strArrLJJJJZ = LJJJJZ(str);
            LJLILLLLZI(strArrLJJJJZ[0]);
            LynxDevtool lynxDevtool = this.mDevTool;
            if (lynxDevtool != null) {
                C1309930kBz c1309930kBz = c1309800kBm.LJ;
                if (c1309930kBz != null) {
                    templateData = c1309930kBz.LJ;
                } else {
                    templateData = c1309800kBm.LIZ;
                }
                lynxDevtool.LIZLLL(strArrLJJJJZ[0], templateData, c1309800kBm.LIZLLL, c1309800kBm.LIZIZ);
            }
        }
        s sVar = this.mLynxContext;
        if (sVar == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderTemplate error, can't get LynxContext in ");
            sbLIZ.append(toString());
            LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC1300010jvz interfaceC1300010jvz = this.LJIJ;
        if (interfaceC1300010jvz != null) {
            interfaceC1300010jvz.LJJIJ(new C1299930jvr(c1309800kBm));
        } else {
            AbstractC1299950jvt abstractC1299950jvt = sVar.LLLFF;
            if (abstractC1299950jvt != null) {
                abstractC1299950jvt.LIZIZ(new C1301600jyY(str, EnumC1299880jvm.LynxResourceTypeTemplate), new InterfaceC1290540jgi() { // from class: X.0kBl
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC1290540jgi
                    public final void LIZ(C1289590jfB c1289590jfB) {
                        C1309800kBm c1309800kBm2 = c1309800kBm;
                        boolean z = LynxTemplateRender.LJJZZI;
                        int i = C1299920jvq.LIZ[c1289590jfB.LIZ.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                c1309800kBm2.onFailed(c1289590jfB.LIZJ.getMessage());
                                return;
                            }
                            return;
                        }
                        TemplateBundle templateBundle = ((C1299660jvQ) c1289590jfB.LIZIZ).LIZJ;
                        if (templateBundle != null && templateBundle.LJFF()) {
                            c1309800kBm2.LIZIZ(templateBundle);
                            return;
                        }
                        C1299660jvQ c1299660jvQ = (C1299660jvQ) c1289590jfB.LIZIZ;
                        ByteBuffer byteBuffer = c1299660jvQ.LIZIZ;
                        if (byteBuffer != null) {
                            c1309800kBm2.getClass();
                            if (byteBuffer.limit() == 0) {
                                c1309800kBm2.onFailed("ByteBuffer is null!");
                                return;
                            }
                            c1309800kBm2.LJFF.LJJJJI.LJIILIIL("prepareTemplateEnd", null);
                            C1309930kBz c1309930kBzLIZ = c1309800kBm2.LJ;
                            if (c1309930kBzLIZ == null) {
                                TemplateData templateDataLJIIIIZZ = c1309800kBm2.LIZ;
                                if (templateDataLJIIIIZZ == null) {
                                    Map<String, Object> map = c1309800kBm2.LIZLLL;
                                    if (map != null) {
                                        templateDataLJIIIIZZ = TemplateData.LJII(map);
                                    } else {
                                        String str2 = c1309800kBm2.LIZIZ;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str2);
                                    }
                                }
                                c1309930kBzLIZ = new C1309920kBy().LIZ();
                                c1309930kBzLIZ.LJ = templateDataLJIIIIZZ;
                            }
                            C1309870kBt c1309870kBtLIZ = C1309870kBt.LIZ("loadBundle", "loadBundleStart", c1309800kBm2.LJFF.LJJJJI.LJ);
                            PerformanceController performanceController = c1309800kBm2.LJFF.LJJJJI;
                            if (performanceController.LJ) {
                                performanceController.LJIILIIL("loadBundleStart", null);
                            }
                            c1309930kBzLIZ.LIZJ = byteBuffer;
                            c1309800kBm2.LJFF.LJJLIIIJL(c1309930kBzLIZ, c1309870kBtLIZ);
                            return;
                        }
                        c1309800kBm2.LIZ(c1299660jvQ.LIZ);
                    }
                });
            } else {
                LJJIIZ(c1309800kBm, str);
            }
        }
        LynxLog.i("LynxTemplateRender", LJIIZILJ("renderTemplate"));
        LJJJJIZL("LynxTemplateRender.renderTemplate");
    }

    public final void LJJLIIIJL(C1309930kBz c1309930kBz, C1309870kBt c1309870kBt) {
        boolean z;
        boolean z2;
        TemplateBundle templateBundle;
        boolean z3;
        TemplateBundle templateBundle2;
        boolean z4;
        boolean z5;
        boolean z6;
        TemplateData templateData;
        c1309930kBz.getClass();
        boolean z7 = true;
        if (EnumC1309980kC4.PRE_PAINTING != null && EnumC1309980kC4.PRE_PAINTING_DRAW != null) {
            z = false;
        } else {
            z = true;
        }
        if (this.mLynxContext == null) {
            LynxLog.e("LynxTemplateRender", "renderWithLoadMeta with null LynxContext");
            return;
        }
        if (this.LJIJJ != null && (templateData = c1309930kBz.LJ) != null) {
            templateData.LJI = false;
            this.LJJLJLI.LJIJJLI(c1309930kBz.LJ);
        }
        if ((this.LJJLIIIJL || this.LJJLIIIJLJLI) && LJLLI(c1309930kBz.LJ)) {
            return;
        }
        if (this.mLynxContext.LJIJI() && LJJ() != null && (this.LJJII instanceof LynxView) && LJJ().getCurrentWidthMeasureSpec() >= 0 && LJJ().getCurrentHeightMeasureSpec() >= 0) {
            LLD(LJJ().getCurrentWidthMeasureSpec(), LJJ().getCurrentHeightMeasureSpec(), false);
        }
        TemplateBundle templateBundle3 = c1309930kBz.LIZLLL;
        if (templateBundle3 != null && templateBundle3.LJFF()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || ((templateBundle2 = this.LJIILLIIL) != null && templateBundle2.LJFF())) {
            if (this.LJJLIIIJL) {
                this.LJJLJ.incrementAndGet();
            }
            TemplateBundle templateBundle4 = c1309930kBz.LIZLLL;
            if (templateBundle4 != null && templateBundle4.LJFF()) {
                templateBundle = c1309930kBz.LIZLLL;
            } else {
                templateBundle = this.LJIILLIIL;
            }
            LynxDevtool lynxDevtool = this.mDevTool;
            if (lynxDevtool != null) {
                lynxDevtool.LIZIZ(templateBundle, c1309930kBz.LJ, c1309930kBz.LIZ);
            }
            LJJJJL();
            LJJIIJ(c1309930kBz);
            if ((c1309930kBz.LJI & EnumC1309970kC3.DUMP_ELEMENT.id()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LoadMeta with bundle, pre-painting: ");
            sbLIZ.append(z);
            sbLIZ.append(" ,pre-painting with draw:");
            if (EnumC1309980kC4.PRE_PAINTING_DRAW != null) {
                z7 = false;
            }
            sbLIZ.append(z7);
            sbLIZ.append(" enableDumpElementTree: ");
            sbLIZ.append(z3);
            LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            LJJIJ(templateBundle, c1309930kBz.LIZ, c1309930kBz.LJ, z, c1309930kBz.LJI, new C1309750kBh(this), c1309870kBt);
            return;
        }
        if (c1309930kBz.LIZJ != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.LJJLIIIJL) {
                this.LJJLJ.incrementAndGet();
            }
            LJJJJL();
            LJJIIJ(c1309930kBz);
            if ((c1309930kBz.LJI & EnumC1309970kC3.RECYCLE_TEMPLATE_BUNDLE.id()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LoadMeta with ByteBuffer, pre-painting: ");
            sbLIZ2.append(z);
            sbLIZ2.append(" ,pre-painting with draw:");
            if (EnumC1309980kC4.PRE_PAINTING_DRAW != null) {
                z7 = false;
            }
            sbLIZ2.append(z7);
            sbLIZ2.append(" enableRecycleTemplateBundle: ");
            sbLIZ2.append(z6);
            LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ2));
            ByteBuffer byteBuffer = c1309930kBz.LIZJ;
            TemplateData templateData2 = c1309930kBz.LJ;
            String str = c1309930kBz.LIZ;
            int i = c1309930kBz.LJI;
            C1309750kBh c1309750kBh = new C1309750kBh(this);
            if (byteBuffer == null) {
                LynxLog.e("LynxTemplateRender", "Load Template with null template");
                return;
            } else {
                LJJIJIIJIL(str, null, byteBuffer, z, z6, templateData2, i, c1309870kBt, c1309750kBh);
                return;
            }
        }
        byte[] bArr = c1309930kBz.LIZIZ;
        if (bArr != null && bArr.length > 0) {
            if (this.LJJLIIIJL) {
                this.LJJLJ.incrementAndGet();
            }
            LynxDevtool lynxDevtool2 = this.mDevTool;
            if (lynxDevtool2 != null) {
                lynxDevtool2.LIZJ(c1309930kBz.LJ, c1309930kBz.LIZ);
            }
            LJJJJL();
            LJJIIJ(c1309930kBz);
            if ((c1309930kBz.LJI & EnumC1309970kC3.RECYCLE_TEMPLATE_BUNDLE.id()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LoadMeta with binary, pre-painting: ");
            sbLIZ3.append(z);
            sbLIZ3.append(" ,pre-painting with draw:");
            if (EnumC1309980kC4.PRE_PAINTING_DRAW != null) {
                z7 = false;
            }
            sbLIZ3.append(z7);
            sbLIZ3.append(" enableRecycleTemplateBundle: ");
            sbLIZ3.append(z5);
            LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ3));
            byte[] bArr2 = c1309930kBz.LIZIZ;
            TemplateData templateData3 = c1309930kBz.LJ;
            String str2 = c1309930kBz.LIZ;
            C1309750kBh c1309750kBh2 = new C1309750kBh(this);
            if (bArr2 == null) {
                LynxLog.e("LynxTemplateRender", "Load Template with null template");
                return;
            } else {
                LJJIJIIJIL(str2, bArr2, null, z, z5, templateData3, 0, c1309870kBt, c1309750kBh2);
                return;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("LoadMeta with url, pre-painting: ");
        sbLIZ4.append(z);
        sbLIZ4.append(" ,pre-painting with draw:");
        if (EnumC1309980kC4.PRE_PAINTING_DRAW != null) {
            z7 = false;
        }
        sbLIZ4.append(z7);
        sbLIZ4.append(" url: ");
        sbLIZ4.append(c1309930kBz.LIZ);
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ4));
        String str3 = c1309930kBz.LIZ;
        LJJLIIIJJI(str3, new C1309800kBm(this, str3, c1309930kBz));
    }

    public final void LJJLJ(String str, JavaOnlyArray javaOnlyArray) {
        s sVar;
        C1310200kCQ c1310200kCQ = this.LJIIIIZZ;
        if (c1310200kCQ != null) {
            EnumC1309880kBu enumC1309880kBu = c1310200kCQ.LIZ;
            int iPosition = 0;
            if (enumC1309880kBu == EnumC1309880kBu.PENDING || enumC1309880kBu == EnumC1309880kBu.STARTED || enumC1309880kBu == EnumC1309880kBu.EXECUTING || enumC1309880kBu == EnumC1309880kBu.FAILED) {
                if (this.LJJI && this.LJJLIIIJ != 0) {
                    C1298840ju6.LIZ.getClass();
                    ByteBuffer byteBufferLIZIZ = C1298840ju6.LIZIZ(javaOnlyArray);
                    long j = this.LJJLIIIJ;
                    long j2 = this.LJJLI;
                    if (byteBufferLIZIZ != null) {
                        iPosition = byteBufferLIZIZ.position();
                    }
                    nativeSendSsrGlobalEvent(j, j2, str, byteBufferLIZIZ, iPosition);
                }
                this.LJIIIIZZ.getClass();
                if (javaOnlyArray == null) {
                    javaOnlyArray = new JavaOnlyArray();
                }
                javaOnlyArray.pushString("from_ssr_cache");
            }
        }
        if (this.LJJI && (sVar = this.mLynxContext) != null) {
            sVar.LJJIII(str, javaOnlyArray);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendGlobalEvent error, can't get GlobalEventEmitter in ");
            sbLIZ.append(toString());
            LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        }
        s sVar2 = this.mLynxContext;
        if (sVar2 != null && sVar2.LJIJI()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString("method", "sendGlobalEvent");
            javaOnlyMap.putString("name", str);
            javaOnlyMap.putArray("params", javaOnlyArray);
            InterfaceC1299290jup interfaceC1299290jup = this.LJIJJ;
            if (interfaceC1299290jup != null) {
                ((C1299280juo) interfaceC1299290jup).LIZ(LJJ(), javaOnlyMap);
            }
        }
    }

    public final void LJJLJLI(String str, List<Object> list) {
        int iPosition;
        if (this.LJJI && this.LJJLIIIJ != 0) {
            C1298840ju6.LIZ.getClass();
            ByteBuffer byteBufferLIZIZ = C1298840ju6.LIZIZ(list);
            long j = this.LJJLIIIJ;
            long j2 = this.LJJLI;
            if (byteBufferLIZIZ == null) {
                iPosition = 0;
            } else {
                iPosition = byteBufferLIZIZ.position();
            }
            nativeSendGlobalEventToLepus(j, j2, str, byteBufferLIZIZ, iPosition);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendGlobalEventToLepus error, Env not prepared in ");
        sbLIZ.append(toString());
        LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJJZ(String str, boolean z) {
        C1299310jur c1299310jur = this.LJIJJLI;
        if (c1299310jur.LIZ == z && Objects.equals(c1299310jur.LIZIZ, str)) {
            return;
        }
        C1299310jur c1299310jur2 = this.LJIJJLI;
        c1299310jur2.LIZ = z;
        c1299310jur2.LIZIZ = str;
        long j = this.LJJLIIIJ;
        if (j != 0) {
            nativeSetEnableBytecode(j, this.LJJLI, z, str);
        }
    }

    public final void LJLI(long j, String str) {
        PerformanceController performanceController = this.LJJJJI;
        if (!performanceController.LJ) {
            performanceController.LJIILJJIL(new ARunnableS1S2100100_20(performanceController, str, j, 1));
        }
    }

    public final void LJLIIIL(String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSessionStorageItem with key: ");
        sbLIZ.append(str);
        LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJLIIIJ != 0 && templateData != null && !TextUtils.isEmpty(str)) {
            templateData.LJI();
            if (templateData.LIZ == 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setSessionStorageItem with zero data! key: ");
                sbLIZ2.append(str);
                LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            nativeSetSessionStorageItem(this.LJJLIIIJ, this.LJJLI, str, templateData.LIZ, templateData.LJ);
        }
    }

    public final double LJLJL(String str, PlatformCallBack platformCallBack) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("subscribeSessionStorage with key: ");
        sbLIZ.append(str);
        LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str)) {
            long j = this.LJJLIIIJ;
            if (j != 0) {
                double dNativeSubscribeSessionStorage = nativeSubscribeSessionStorage(j, this.LJJLI, str, platformCallBack);
                ((HashMap) this.LJJJZ).put(Double.valueOf(dNativeSubscribeSessionStorage), platformCallBack);
                return dNativeSubscribeSessionStorage;
            }
            return -1.0d;
        }
        return -1.0d;
    }

    public final void LJLL(String str, List<Object> list) {
        int iPosition;
        if (this.LJJI && this.LJJLIIIJ != 0) {
            C1298840ju6.LIZ.getClass();
            ByteBuffer byteBufferLIZIZ = C1298840ju6.LIZIZ(list);
            long j = this.LJJLIIIJ;
            long j2 = this.LJJLI;
            if (byteBufferLIZIZ == null) {
                iPosition = 0;
            } else {
                iPosition = byteBufferLIZIZ.position();
            }
            nativeTriggerEventBus(j, j2, str, byteBufferLIZIZ, iPosition);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerEventBus error, Env not prepared in ");
        sbLIZ.append(toString());
        LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJLLJ(String str, double d) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsubscribeSessionStorage with key: ");
        sbLIZ.append(str);
        LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str)) {
            long j = this.LJJLIIIJ;
            if (j != 0 && -1.0d != d) {
                nativeUnsubscribeSessionStorage(j, this.LJJLI, str, d);
                ((HashMap) this.LJJJZ).remove(Double.valueOf(d));
            }
        }
    }

    public final void LJLLLL(TemplateData templateData, boolean z) {
        LynxDevtool lynxDevtool;
        C1309850kBr c1309850kBr;
        LJJJJI("LynxTemplateRender.updateData");
        if (templateData != null && (lynxDevtool = this.mDevTool) != null && (c1309850kBr = lynxDevtool.LIZIZ) != null) {
            c1309850kBr.LIZIZ(templateData);
        }
        if (this.LJJLIIIJL) {
            this.LJJLJ.incrementAndGet();
        }
        s sVar = this.mLynxContext;
        if (sVar == null) {
            return;
        }
        if (sVar.LLJLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateData after pre load, url:");
            sbLIZ.append(this.LJI);
            LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            C1310660kDA c1310660kDA = this.LJJII;
            if (c1310660kDA != null) {
                c1310660kDA.setShouldInterceptRequestLayout(false);
            }
            sVar.LLJLIL = false;
            C1298720jtu c1298720jtu = sVar.LLIZ;
            if (c1298720jtu != null) {
                c1298720jtu.LIZIZ = false;
            }
        }
        if (LJJJJLI(templateData)) {
            templateData.LJII.set(true);
            nativeUpdateDataByPreParsedData(this.LJJLIIIJ, this.LJJLI, templateData.LIZ, templateData.LIZJ, templateData.LJ, templateData, z);
        }
        LJJJJJ(templateData);
        LJJJJIZL("LynxTemplateRender.updateData");
    }

    public final void LL(int i, int i2) {
        s sVar = this.mLynxContext;
        if (this.LJJLIIIJ != 0 && sVar != null) {
            DisplayMetrics displayMetrics = sVar.LLJJJ;
            if (i != displayMetrics.widthPixels || i2 != displayMetrics.heightPixels) {
                this.LJJIJLIJ = true;
                displayMetrics.widthPixels = i;
                displayMetrics.heightPixels = i2;
                C1309670kBZ c1309670kBZ = sVar.LLJJJJLIIL;
                if (c1309670kBZ != null) {
                    c1309670kBZ.LJIIJJI(sVar);
                }
                nativeUpdateScreenMetrics(this.LJJLIIIJ, this.LJJLI, i, i2, sVar.LLJJJ.density, ((LynxUIRenderer) this.LJJJIL).LIZLLL());
                LynxDevtool lynxDevtool = this.mDevTool;
                if (lynxDevtool != null) {
                    lynxDevtool.getClass();
                }
            }
        }
    }

    public void updateData(Map<String, Object> map, String str) {
        TemplateData templateDataLJII = TemplateData.LJII(map);
        templateDataLJII.LIZJ = str;
        templateDataLJII.LJ = true;
        LJLLLL(templateDataLJII, false);
        LynxLog.i("LynxTemplateRender", LJIIZILJ("update"));
    }

    public LynxTemplateRender(Context context, C1310660kDA c1310660kDA, C1309760kBi c1309760kBi) {
        boolean z;
        boolean z2;
        boolean zEnableGenericResourceFetcher;
        boolean z3;
        boolean z4;
        final Context appContext;
        boolean z5;
        EnumC665490Q8l enumC665490Q8l;
        this.LJII = false;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LJJIJIL = false;
        this.LJJIJL = false;
        this.LJJIL = 1.0f;
        EnumC1299430jv3 enumC1299430jv3 = EnumC1299430jv3.UNSET;
        this.LJJIZ = enumC1299430jv3;
        this.LJJJ = true;
        this.LJJJI = true;
        this.LJJJJ = new C1289810jfX();
        PerformanceController performanceController = new PerformanceController();
        this.LJJJJI = performanceController;
        this.LJJJJIZL = "setup";
        boolean zShouldForceLayoutOnBackgroundThread = LynxEnv.inst().shouldForceLayoutOnBackgroundThread();
        this.LJJJJL = zShouldForceLayoutOnBackgroundThread;
        this.LJJJJLI = LynxEnv.inst().enableSkipUpdateViewportOnInitWhenMeasureSpecEmpty();
        this.LJJJZ = new HashMap();
        this.LJJL = new AtomicBoolean(true);
        this.LJJLIIIJ = 0L;
        this.LJJLIIIJILLIZJL = new AtomicInteger(0);
        this.LJJLIIIJJI = new SparseArray<>();
        this.LJJLJ = new AtomicInteger(0);
        TemplateData templateDataLJII = TemplateData.LJII(new HashMap());
        this.LJJLJLI = templateDataLJII;
        TraceEvent.LIZLLL("TemplateRender.init");
        ILynxTrailService iLynxTrailService = (ILynxTrailService) C1285920jZG.LIZJ().LIZ(ILynxTrailService.class);
        if (iLynxTrailService instanceof ILynxTrailServiceExtension) {
            ((ILynxTrailServiceExtension) iLynxTrailService).parseLynxViewBuilder(c1309760kBi);
        }
        this.LJJIJ = System.currentTimeMillis();
        this.mContext = context;
        this.LJJII = c1310660kDA;
        this.LJIIZILJ = c1309760kBi;
        this.LJIJJ = c1309760kBi.LJJII();
        InterfaceC1300010jvz interfaceC1300010jvz = c1309760kBi.LJJIJIIJIL;
        this.LJIJ = interfaceC1300010jvz;
        if (interfaceC1300010jvz instanceof InterfaceC1299990jvx) {
            this.LJIJI = (InterfaceC1299990jvx) interfaceC1300010jvz;
        }
        this.LJIILL = c1309760kBi;
        if (interfaceC1300010jvz != null && interfaceC1300010jvz.LJJI()) {
            this.LJIILLIIL = this.LJIJ.LJJIII();
        }
        int iLJIJJLI = this.LJIIZILJ.LJIJJLI();
        this.LJJLIIIJJIZ = iLJIJJLI;
        if ((iLJIJJLI & 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        performanceController.LJ = z;
        WeakReference<InterfaceC1310470kCr> weakReference = new WeakReference<>(this.LJIILJJIL);
        performanceController.LIZJ = weakReference;
        C1310000kC6 c1310000kC6 = performanceController.LIZ;
        if (c1310000kC6 != null) {
            c1310000kC6.LJ = weakReference;
        }
        int i = this.LJJLIIIJJIZ;
        if ((i & 2) > 0 && (i & 1) > 0 && this.LJIILLIIL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJJLIIIJL = z2;
        this.LJIIL = this.LJIIZILJ.LJJIJL();
        InterfaceC1299990jvx interfaceC1299990jvx = this.LJIJI;
        if (interfaceC1299990jvx != null && interfaceC1299990jvx.LJIILL()) {
            this.LJJLL = this.LJIJI.LJIJ();
            LJIILJJIL();
            this.LJJLIIIJLJLI = true;
        } else if (this.LJJLIIIJL) {
            LJLLILLLL();
            if (this.LJJLL == null) {
                LJIILJJIL();
                this.LJJLIIIJLLLLLLLZ = false;
            }
            templateDataLJII.LJI = false;
        } else {
            this.LJJJIL = LJJIJIIJI();
        }
        this.LJ = c1309760kBi.LJJIJIIJI;
        this.LJJJJJ = c1309760kBi.LJJII;
        this.LJJJJJL = this.LJIIZILJ.LJIILIIL();
        this.LJJJJLL = this.LJIIZILJ.LJIILLIIL();
        EnumC1299430jv3 enumC1299430jv3LJJIJLIJ = this.LJIIZILJ.LJJIJLIJ();
        if (enumC1299430jv3LJJIJLIJ == enumC1299430jv3) {
            zEnableGenericResourceFetcher = LynxEnv.inst().enableGenericResourceFetcher();
        } else if (enumC1299430jv3LJJIJLIJ == EnumC1299430jv3.TRUE) {
            zEnableGenericResourceFetcher = true;
        } else {
            zEnableGenericResourceFetcher = false;
        }
        this.LJJIJL = zEnableGenericResourceFetcher;
        this.LJJJJZ = this.LJIIZILJ.LJIJJ();
        c1309760kBi.LJJIJIIJI = null;
        if (this.LJJII != null) {
            this.LJJII.setTimingCollector(this.LJJJJI);
        }
        this.LJIJJLI = new C1299310jur(this.LJIIZILJ.LJJIIJZLJL());
        EnumC665490Q8l enumC665490Q8l2 = this.LJIIL;
        EnumC665490Q8l enumC665490Q8l3 = EnumC665490Q8l.MULTI_THREADS;
        if (enumC665490Q8l2 != enumC665490Q8l3 && enumC665490Q8l2 != EnumC665490Q8l.MOST_ON_TASM) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.LJJIII = z3;
        if (zShouldForceLayoutOnBackgroundThread) {
            this.LJIIL = z3 ? enumC665490Q8l3 : EnumC665490Q8l.PART_ON_LAYOUT;
        }
        this.LJJI = LynxEnv.inst().isNativeLibraryLoaded();
        if (LJJZZI && LynxEnv.inst().getVsyncAlignedFlushGlobalSwitch() && ((enumC665490Q8l = this.LJIIL) == EnumC665490Q8l.ALL_ON_UI || enumC665490Q8l == EnumC665490Q8l.PART_ON_LAYOUT)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LJJJI = z4;
        this.LJJIL = this.LJIIZILJ.LJJ();
        this.LJFF = c1309760kBi.LJJIJ;
        this.LJJIJIL = this.LJIIZILJ.LJJIIJ();
        DisplayMetricsHolder.LIZLLL(context, this.LJIIZILJ.getDensity());
        final DisplayMetrics displayMetricsLIZIZ = DisplayMetricsHolder.LIZIZ();
        if (this.LJIIZILJ.getScreenWidth() != -1 && this.LJIIZILJ.getScreenHeight() != -1) {
            displayMetricsLIZIZ.widthPixels = this.LJIIZILJ.getScreenWidth();
            displayMetricsLIZIZ.heightPixels = this.LJIIZILJ.getScreenHeight();
        }
        if (context != null) {
            appContext = context;
        } else {
            appContext = LynxEnv.inst().getAppContext();
        }
        s sVar = new s(appContext, displayMetricsLIZIZ) { // from class: X.0k0n
            @Override // j27.s
            public final void LJIILLIIL(LynxError lynxError) {
                this.LLLILZLLLI.onErrorOccurred(lynxError);
            }

            @Override // android.content.ContextWrapper
            public final void attachBaseContext(Context context2) {
                if (NxRewordManager.LJIILIIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attachBaseContextWrapper: ");
                    sbLIZ.append(Log.getStackTraceString(new Throwable(context2.toString())));
                    C2188811AlT.LIZIZ(sbLIZ);
                    context2 = new C817700W5w(context2, false);
                }
                super.attachBaseContext(context2);
            }

            @Override // j27.s, X.InterfaceC1298330jtH
            public final void handleException(Exception exc) {
                LynxTemplateRender lynxTemplateRender = this.LLLILZLLLI;
                lynxTemplateRender.getClass();
                if (exc == null) {
                    LynxLog.e("LynxTemplateRender", "receive null exception");
                    return;
                }
                String strLIZ = CallStackUtil.LIZ(exc);
                LynxError lynxError = new LynxError(990100, -3, exc.getMessage(), null, "error");
                lynxError.LJII(strLIZ);
                lynxError.LJI = null;
                lynxError.LJ = null;
                lynxTemplateRender.onErrorOccurred(lynxError);
            }
        };
        this.mLynxContext = sVar;
        sVar.LLJJL = this.LJIJI;
        new WeakReference(this.mLynxContext);
        s sVar2 = this.mLynxContext;
        sVar2.LLLIIIIL = this.LJJLIIIJJIZ;
        if (!this.LJJLIIIJL && !this.LJJLIIIJLJLI) {
            z5 = false;
        } else {
            z5 = true;
        }
        sVar2.LLLIILIL = z5;
        PerformanceController performanceController2 = this.LJJJJI;
        if (performanceController2 != null) {
            sVar2.LLJIJIL = new WeakReference<>(performanceController2);
        }
        this.mLynxContext.LLLIL = c1309760kBi.LJIIIZ();
        this.mLynxContext.LJJIIJ(this.LJJII);
        s sVar3 = this.mLynxContext;
        boolean zLJIIL = this.LJIIZILJ.LJIIL();
        sVar3.LLJLL = zLJIIL;
        if (zLJIIL && Build.VERSION.SDK_INT >= 29 && s.LLLILZJ && LynxFlattenUI.sSetUsageHint == null) {
            try {
                LynxFlattenUI.sSetUsageHint = RenderNode.class.getMethod("setUsageHint", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                s.LLLILZJ = false;
                LynxLog.e("LynxContext", "NoSuchMethodException: setUsageHint");
            }
        }
        this.mLynxContext.LLJL = this.LJIIZILJ.LJIIJJI();
        Map<String, String> map = this.LJIILL.LJJIIZI;
        if (map != null) {
            this.mLynxContext.LLJLLIL = map;
        }
        InterfaceC1310130kCJ interfaceC1310130kCJ = (InterfaceC1310130kCJ) C1285920jZG.LIZJ().LIZ(InterfaceC1310130kCJ.class);
        if (interfaceC1310130kCJ != null) {
            interfaceC1310130kCJ.onLynxViewSetup(this.mLynxContext, this.LJIJJLI.LIZJ, this.LJIIZILJ.LJ());
        }
        LynxEnv.inst().initNativeUIThread();
        TraceEvent.LIZLLL("TemplateRender.initWithContext");
        this.LJII = false;
        this.LJIIJJI = false;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        s sVar4 = this.mLynxContext;
        C1309780kBk c1309780kBk = this.LJIILIIL;
        sVar4.LLILLL = c1309780kBk;
        sVar4.LLJJIJI = c1309780kBk;
        new WeakReference(this.LJIILJJIL);
        LynxUIRenderer lynxUIRenderer = (LynxUIRenderer) LJJIJIIJI();
        lynxUIRenderer.LJI(this.mLynxContext, this.LJIIZILJ.LJ(), this.LJJII, this.LJJIZ);
        if (LynxEnv.inst().isLynxDebugEnabled()) {
            LynxBackgroundRuntime lynxBackgroundRuntime = this.LJ;
            if (lynxBackgroundRuntime != null) {
                LynxDevtool lynxDevtool = lynxBackgroundRuntime.LJ;
                this.mDevTool = lynxDevtool;
                LynxView lynxViewLJJ = LJJ();
                lynxDevtool.getClass();
                new WeakReference(lynxViewLJJ);
                new WeakReference(this);
                if (lynxDevtool.LIZIZ != null) {
                    new WeakReference(lynxViewLJJ);
                }
            } else {
                this.mDevTool = new LynxDevtool(LJJ(), this, this.LJIIZILJ.isDebuggable());
            }
            this.mDevTool.getClass();
            new WeakReference(this);
        }
        LJII(-1);
        if (context == null) {
            C1311720kEs c1311720kEs = lynxUIRenderer.LIZIZ;
            if (c1311720kEs != null) {
                c1311720kEs.LJIIL = true;
            }
            LJJZZI(false);
        }
        TraceEvent.LJII("TemplateRender.initWithContext");
        int iLIZ = this.LJIIZILJ.LIZ();
        int iLIZLLL = this.LJIIZILJ.LIZLLL();
        if (this.LJJJJL && iLIZ == 0 && iLIZLLL == 0) {
            iLIZ = View.MeasureSpec.makeMeasureSpec(this.mLynxContext.getResources().getDisplayMetrics().widthPixels, 1073741824);
        }
        if ((!this.LJJLIIIJL || !this.LJJLIIIJLLLLLLLZ) && ((this.LJJLIIIJJIZ & 4) <= 0 ? !this.LJJJJLI || iLIZ != 0 || iLIZLLL != 0 : this.LJIIZILJ.LJIIJJI)) {
            LLD(iLIZ, iLIZLLL, true);
        }
        this.LJIILIIL.LJJIJ(LynxEnv.inst().getLynxViewClient());
        this.LJIILIIL.LJJIJ(new LynxViewClient() { // from class: X.0kC0
            public long LL;

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJII() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDataUpdated time:");
                sbLIZ.append(System.currentTimeMillis() - this.LL);
                LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIJ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFirstScreen time: ");
                sbLIZ.append(System.currentTimeMillis() - this.LL);
                LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIILJJIL() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLoadSuccess time: ");
                sbLIZ.append(System.currentTimeMillis() - this.LL);
                LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIJ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPageUpdate time:");
                sbLIZ.append(System.currentTimeMillis() - this.LL);
                LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIZILJ(String str) {
                this.LL = System.currentTimeMillis();
            }
        });
        LJLJI();
        this.LJJIJIIJI = System.currentTimeMillis();
        LJLI(this.LJJIJ, "createLynxStart");
        LJLI(this.LJJIJIIJI, "createLynxEnd");
        LynxLog.i("LynxTemplateRender", LJIIZILJ("create"));
        TraceEvent.LJII("TemplateRender.init");
    }

    public final void LJJIJL(int i, int i2, long j) {
        nativeObtainChildAsync(this.LJJLIIIJ, this.LJJLI, i, i2, j);
    }

    public final void LJJLI(int i, int i2, long j) {
        nativeRenderChild(this.LJJLIIIJ, this.LJJLI, i, i2, j);
    }

    public final void LJJLIIIIJ(byte[] bArr, String str, TemplateData templateData) {
        boolean z;
        long j;
        if (this.LJIIIZ) {
            return;
        }
        LynxDevtool lynxDevtool = this.mDevTool;
        if (lynxDevtool != null) {
            lynxDevtool.LIZJ(templateData, str);
        }
        if ((!this.LJJIII || this.LJII) && !C1289620jfE.LIZIZ()) {
            C1289620jfE.LIZJ(new ARunnableS16S1300000_20(this, bArr, templateData, str, 1));
            return;
        }
        LJLILLLLZI(str);
        LJLZ(str);
        LynxLog.i("LynxTemplateRender", LJIIZILJ("renderTemplate"));
        String str2 = null;
        if (!this.LJJI) {
            onErrorOccurred(new LynxError(140201, "LynxEnv has not been prepared successfully!", null, "error"));
        } else {
            this.LJJIFFI = true;
            long j2 = this.LJJLIIIJ;
            if (j2 != 0) {
                nativeMarkDirty(j2, this.LJJLI);
            }
            LJJJLZIJ();
            C1310200kCQ c1310200kCQ = new C1310200kCQ();
            this.LJIIIIZZ = c1310200kCQ;
            c1310200kCQ.LIZ = EnumC1309880kBu.PENDING;
            s sVar = this.mLynxContext;
            if (sVar != null && sVar.LIZLLL()) {
                LynxEventReporter.updateGenericInfo("enable_ssr", Boolean.TRUE, this.mLynxContext.LLJLILLLLZIIL);
            }
            long j3 = this.LJJLIIIJ;
            if (j3 != 0) {
                nativeSetSSRTimingData(j3, this.LJJLI, str, bArr.length);
            }
        }
        if (this.LJJLIIIJ != 0) {
            C1309750kBh c1309750kBh = new C1309750kBh(this);
            NativeFacade nativeFacade = this.LJJLIIIIJ;
            long j4 = this.LJJLIIIJ;
            long j5 = this.LJJLI;
            if (nativeFacade != null && j4 != 0 && j5 != 0) {
                if (bArr == null) {
                    LynxLog.e("LynxTemplateRender", "Load ssr data  with null template");
                } else {
                    if (templateData != null) {
                        templateData.LJI();
                        j = templateData.LIZ;
                        str2 = templateData.LIZJ;
                        z = templateData.LJ;
                    } else {
                        z = false;
                        j = 0;
                    }
                    nativeFacade.LIZ = c1309750kBh;
                    nativeLoadSSRDataByPreParsedData(j4, j5, bArr, j, z, str2, templateData);
                }
            } else {
                LynxLog.e("LynxTemplateRender", "Load ssr data before inited");
            }
        }
        LJJJJJ(templateData);
    }

    public final void LJJLIIIJILLIZJL(TemplateBundle templateBundle, TemplateData templateData, String str) {
        if (this.LJIIIZ) {
            return;
        }
        LynxDevtool lynxDevtool = this.mDevTool;
        if (lynxDevtool != null) {
            lynxDevtool.LIZIZ(templateBundle, templateData, str);
        }
        if ((!this.LJJIII || this.LJII) && !C1289620jfE.LIZIZ()) {
            C1289620jfE.LIZJ(new ARunnableS16S1300000_20(this, templateBundle, templateData, str, 0));
            return;
        }
        if (this.LJJLIIIJL) {
            if (LJLLI(templateData)) {
                return;
            } else {
                this.LJJLJ.incrementAndGet();
            }
        }
        LJJJJI("TemplateRender.renderTemplateBundle");
        C1309870kBt c1309870kBtLIZ = C1309870kBt.LIZ("loadBundle", "loadBundleStart", this.LJJJJI.LJ);
        PerformanceController performanceController = this.LJJJJI;
        if (performanceController.LJ) {
            performanceController.LJIILIIL("loadBundleStart", null);
        }
        LJLILLLLZI(str);
        LJJJJL();
        LynxLog.i("LynxTemplateRender", LJIIZILJ("renderTemplate"));
        if (this.LJJLIIIJ != 0) {
            LJJIJ(templateBundle, str, templateData, false, 0, new C1309750kBh(this), c1309870kBtLIZ);
        }
        LJJJJJ(templateData);
        LJJJJIZL("TemplateRender.renderTemplateBundle");
    }

    public final void LJJLIIIJJIZ(byte[] bArr, TemplateData templateData, String str) {
        C1309920kBy c1309920kBy = new C1309920kBy();
        c1309920kBy.LIZIZ = bArr;
        c1309920kBy.LIZLLL = templateData;
        c1309920kBy.LIZ = str;
        LJJIIZI(c1309920kBy.LIZ());
        LynxLog.i("LynxTemplateRender", LJIIZILJ("renderTemplate"));
    }

    public final void LLD(int i, int i2, boolean z) {
        if (this.LJJI && this.LJJLIIIJ != 0) {
            if (this.LIZJ == i && this.LIZLLL == i2 && !this.LJJIJLIJ) {
                LynxLog.i("LynxTemplateRender", "updateViewport is unnecessary, because the size of the cache are the same as the size to be set.");
                return;
            }
            if (this.LJJIJLIJ) {
                this.LJJIJLIJ = false;
            }
            int iFromMeasureSpec = EnumC1300260jwO.fromMeasureSpec(i);
            int size = View.MeasureSpec.getSize(i);
            int iFromMeasureSpec2 = EnumC1300260jwO.fromMeasureSpec(i2);
            nativeUpdateViewport(this.LJJLIIIJ, this.LJJLI, size, iFromMeasureSpec, View.MeasureSpec.getSize(i2), iFromMeasureSpec2, this.mLynxContext.LLJJJ.density, ((LynxUIRenderer) this.LJJJIL).LIZLLL(), z);
            this.LIZJ = i;
            this.LIZLLL = i2;
        }
    }

    public final int LJJIJIL(int i, int i2, long j, boolean z) {
        return nativeObtainChild(this.LJJLIIIJ, this.LJJLI, i, i2, j, z);
    }

    public final void LJLLL(int i, int i2, int i3, long j) {
        nativeUpdateChild(this.LJJLIIIJ, this.LJJLI, i, i2, i3, j);
    }

    public final void LJJLIIIJLLLLLLLZ(float f, float f2, float f3, float f4, int i) {
        nativeScrollByListContainer(this.LJJLIIIJ, this.LJJLI, i, f, f2, f3, f4);
    }

    public final void LJJLIL(boolean z, float f, int i, int i2, int i3) {
        nativeScrollToPosition(this.LJJLIIIJ, this.LJJLI, i, i2, f, i3, z);
    }

    public final void LJJIJ(TemplateBundle templateBundle, String str, TemplateData templateData, boolean z, int i, C1309750kBh c1309750kBh, C1309870kBt c1309870kBt) {
        String str2;
        String str3;
        boolean z2;
        long j;
        NativeFacade nativeFacade = this.LJJLIIIIJ;
        long j2 = this.LJJLIIIJ;
        long j3 = this.LJJLI;
        if (nativeFacade != null && j2 != 0 && j3 != 0) {
            if (templateBundle != null && templateBundle.LJFF()) {
                if (templateData != null) {
                    templateData.LJI();
                    j = templateData.LIZ;
                    str3 = templateData.LIZJ;
                    z2 = templateData.LJ;
                    templateData.LJII.set(true);
                    if (j == 0) {
                    }
                    nativeFacade.LIZJ = str;
                    nativeFacade.LIZ = c1309750kBh;
                    nativeFacade.LIZLLL = templateBundle.LLILZIL;
                    C1310290kCZ.LIZ(templateBundle.LLIZ, this.mLynxContext, this.LJJJIL);
                    c1309870kBt.LIZIZ("ffiStart");
                    long j4 = j;
                    boolean z3 = z2;
                    nativeLoadTemplateBundleByPreParsedData(j2, j3, str, templateBundle.LLILLJJLI, z, j4, z3, str3, templateData, i, c1309870kBt.LIZJ());
                    return;
                }
                str3 = null;
                z2 = false;
                j = 0;
                LynxLog.e("LynxTemplateRender", "LoadTemplateBundle with zero templateData");
                nativeFacade.LIZJ = str;
                nativeFacade.LIZ = c1309750kBh;
                nativeFacade.LIZLLL = templateBundle.LLILZIL;
                C1310290kCZ.LIZ(templateBundle.LLIZ, this.mLynxContext, this.LJJJIL);
                c1309870kBt.LIZIZ("ffiStart");
                long j42 = j;
                boolean z32 = z2;
                nativeLoadTemplateBundleByPreParsedData(j2, j3, str, templateBundle.LLILLJJLI, z, j42, z32, str3, templateData, i, c1309870kBt.LIZJ());
                return;
            }
            LynxLog.e("LynxTemplateRender", "LoadTemplateBundle with null bundle or invalid bundle");
            LynxError lynxError = new LynxError(10205, "LoadTemplateBundle with null bundle or invalid bundle");
            if (templateBundle == null) {
                str2 = "bundle is null";
            } else {
                str2 = templateBundle.LLILZ;
            }
            lynxError.LJIIIIZZ(str2);
            nativeFacade.reportError(lynxError);
            return;
        }
        LynxLog.e("LynxTemplateRender", "LoadTemplateBundle before inited");
    }

    public final void LJJIJIIJIL(String str, byte[] bArr, ByteBuffer byteBuffer, boolean z, boolean z2, TemplateData templateData, int i, C1309870kBt c1309870kBt, C1309750kBh c1309750kBh) {
        String str2;
        boolean z3;
        NativeFacade nativeFacade = this.LJJLIIIIJ;
        long j = this.LJJLIIIJ;
        long j2 = this.LJJLI;
        if (nativeFacade != null) {
            long j3 = 0;
            if (j != 0 && j2 != 0) {
                ILynxSecurityService iLynxSecurityService = (ILynxSecurityService) C1285920jZG.LIZJ().LIZ(ILynxSecurityService.class);
                if (iLynxSecurityService != null) {
                    c1309870kBt.LIZIZ("verifyTasmStart");
                    C0X80 c0x80VerifyTASM = iLynxSecurityService.verifyTASM(LJJ(), bArr, byteBuffer, str, C0X87.TYPE_TEMPLATE);
                    c1309870kBt.LIZIZ("verifyTasmEnd");
                    if (!c0x80VerifyTASM.LIZ) {
                        nativeFacade.reportError(new LynxError(10701, c0x80VerifyTASM.LIZIZ));
                        return;
                    }
                }
                nativeFacade.LIZJ = str;
                nativeFacade.LIZ = c1309750kBh;
                if (templateData != null) {
                    templateData.LJI();
                    j3 = templateData.LIZ;
                    str2 = templateData.LIZJ;
                    z3 = templateData.LJ;
                    templateData.LJII.set(true);
                } else {
                    str2 = null;
                    z3 = false;
                }
                c1309870kBt.LIZIZ("ffiStart");
                if (byteBuffer != null) {
                    nativeFacade.LIZLLL = byteBuffer.position();
                    long j4 = j3;
                    nativeLoadTemplateBufferByPreParsedData(j, j2, str, byteBuffer, z, z2, j4, z3, str2, templateData, i, c1309870kBt.LIZJ());
                    return;
                }
                if (bArr != null) {
                    nativeFacade.LIZLLL = bArr.length;
                    nativeLoadTemplateByPreParsedData(j, j2, str, bArr, z, z2, j3, z3, str2, templateData, i, c1309870kBt.LIZJ());
                    return;
                }
                LynxLog.e("LynxTemplateRender", "loadTemplate with empty template or buffer.");
                return;
            }
        }
        LynxLog.e("LynxTemplateRender", "Load Template before inited");
    }
}
