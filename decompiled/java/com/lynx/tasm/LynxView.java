package com.lynx.tasm;

import X.AccessibilityManagerAccessibilityStateChangeListenerC1310310kCb;
import X.AccessibilityManagerTouchExplorationStateChangeListenerC1310320kCc;
import X.C0X8D;
import X.C1289620jfE;
import X.C1297450jrr;
import X.C1299170jud;
import X.C1300050jw3;
import X.C1303600k1m;
import X.C1309670kBZ;
import X.C1309720kBe;
import X.C1309760kBi;
import X.C1309780kBk;
import X.C1309800kBm;
import X.C1309920kBy;
import X.C1309950kC1;
import X.C1310070kCD;
import X.C1310110kCH;
import X.C1310170kCN;
import X.C1310200kCQ;
import X.C1310270kCX;
import X.C1310290kCZ;
import X.C1310300kCa;
import X.C1310360kCg;
import X.C1310440kCo;
import X.C1310450kCp;
import X.C1310600kD4;
import X.C1310660kDA;
import X.C1311380kEK;
import X.C1311720kEs;
import X.C1320440kSw;
import X.C1321710kUz;
import X.C20525082h;
import X.C2095108Ir;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C822560WOo;
import X.EnumC1289510jf3;
import X.EnumC1299430jv3;
import X.EnumC1309880kBu;
import X.EnumC665490Q8l;
import X.InterfaceC1292320jja;
import X.InterfaceC1294040jmM;
import X.InterfaceC1300010jvz;
import X.InterfaceC1309710kBd;
import X.InterfaceC1309730kBf;
import X.InterfaceC1310260kCW;
import X.InterfaceC1310500kCu;
import X.InterfaceC1310620kD6;
import X.InterfaceC1314130kIl;
import Y.ACallableS0S0114000_3;
import Y.ACallableS411S0100000_3;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS89S0200000_20;
import Y.ARunnableS96S0000000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.devtoolwrapper.LynxBaseInspectorOwner;
import com.lynx.jsbridge.LynxModuleFactory;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.LynxEngineProxy;
import com.lynx.tasm.core.VSyncMonitor;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import com.lynx.tasm.performance.PerformanceController;
import com.lynx.tasm.utils.CallStackUtil;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler;
import j27.s;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public class LynxView extends C1310660kDA implements C0X8D {
    public static final Looper sMainLooper = Looper.getMainLooper();
    public boolean isInPrePainting;
    public boolean mCanDispatchTouchEvent;
    public boolean mConsumeSlideEvent;
    public int mCurrentHeightMeasureSpec;
    public int mCurrentWidthMeasureSpec;
    public boolean mDestroyed;
    public boolean mDisableDrawChildHook;
    public boolean mDispatchTouchEventToDev;
    public volatile boolean mHasReportedAccessFromNonUiThread;
    public boolean mIsAccessibilityDisabled;
    public boolean mIsPrePaintingStage;
    public C1321710kUz mKeyboardEvent;
    public LynxTemplateRender mLynxTemplateRender;
    public WeakReference<InterfaceC1300010jvz> mLynxViewGroupRef;
    public int mLynxViewId;
    public boolean mOnLoadFired;
    public String mUrl;

    public void com_lynx_tasm_LynxView__onDetachedFromWindow$___twin___() {
        onTraceEventBegin("LynxView.onDetachedFromWindow", null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow:");
        sbLIZ.append(hashCode());
        LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJIJLIJ();
        }
        super.onDetachedFromWindow();
        onTraceEventEnd("LynxView.onDetachedFromWindow");
    }

    public C1310600kD4 forceGetPerf() {
        return null;
    }

    @Override // android.view.View
    public Object getTag() {
        return "lynxview";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_memory_report_LynxViewProfilerLancet_onAttachedToWindow(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_memory_report_LynxViewProfilerLancet_onDetachedFromWindow(this);
    }

    public void renderTemplateUrl(String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(this, str, str2);
    }

    public void renderTemplateUrl(String str, Map map) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(this, str, map);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, templateData, str);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, str, str2);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, Map map, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, map, str);
    }

    public static C1309760kBi builder() {
        return new C1309760kBi();
    }

    public void attachEngineToUIThread() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LIZIZ();
        }
    }

    public void com_lynx_tasm_LynxView__onAttachedToWindow$___twin___() {
        C1309670kBZ c1309670kBZ;
        C1311720kEs c1311720kEs;
        UIBody uIBody;
        LynxEngine lynxEngine;
        onTraceEventBegin("LynxView.onAttachedToWindow", null);
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow:");
        sbLIZ.append(hashCode());
        LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            if (lynxTemplateRender.LJJLIIIJL && (lynxEngine = lynxTemplateRender.LJJLL) != null && lynxTemplateRender.LJIIL == EnumC665490Q8l.MOST_ON_TASM) {
                lynxTemplateRender.LJJLIIIJL = false;
                lynxEngine.LIZIZ();
                lynxTemplateRender.LJJLL = null;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("lynxview onAttachedToWindow ");
            sbLIZ2.append(lynxTemplateRender);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            LynxLog.i("LynxTemplateRender", strLIZIZ);
            lynxTemplateRender.LJJJJI(strLIZIZ);
            lynxTemplateRender.LJJIZ(false);
            InterfaceC1309730kBf interfaceC1309730kBf = lynxTemplateRender.LJJJIL;
            if (interfaceC1309730kBf != null && (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) != null && (uIBody = c1311720kEs.LIZIZ) != null) {
                uIBody.onAttach();
            }
            s sVar = lynxTemplateRender.mLynxContext;
            if (sVar != null && (c1309670kBZ = sVar.LLJJJJLIIL) != null) {
                c1309670kBZ.LJIIIZ();
            }
            LynxTemplateRender.LJJJJIZL(strLIZIZ);
        }
        onTraceEventEnd("LynxView.onAttachedToWindow");
    }

    public void destroy() {
        C1310300kCa c1310300kCa;
        AccessibilityManager accessibilityManager;
        InterfaceC1300010jvz interfaceC1300010jvz;
        if (this.mDestroyed) {
            return;
        }
        this.mDestroyed = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynxview destroy ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        triggerEmbeddedModeLifecycle("onDestroy", true);
        TraceEvent.LIZLLL("DestroyLynxView");
        WeakReference<InterfaceC1300010jvz> weakReference = this.mLynxViewGroupRef;
        if (weakReference != null && (interfaceC1300010jvz = weakReference.get()) != null) {
            interfaceC1300010jvz.LJIIZILJ(this.mLynxViewId);
        }
        C1321710kUz c1321710kUz = this.mKeyboardEvent;
        if (c1321710kUz != null && c1321710kUz.LIZLLL) {
            synchronized (c1321710kUz) {
                if (c1321710kUz.LIZLLL) {
                    if (C1289620jfE.LIZIZ()) {
                        c1321710kUz.LJ();
                    } else {
                        C1289620jfE.LIZJ(new ARunnableS120S0100000_20(c1321710kUz, 219));
                    }
                }
            }
        }
        if (this.mLynxTemplateRender != null) {
            C1310450kCp c1310450kCp = C1310440kCo.LIZ;
            C1310450kCp.LIZ(c1310450kCp.LJFF, this);
            C1310450kCp.LIZ(c1310450kCp.LIZJ, this);
            C1310450kCp.LIZ(c1310450kCp.LIZIZ, this);
            C1310450kCp.LIZ(c1310450kCp.LJ, this);
            C1310450kCp.LIZ(c1310450kCp.LIZLLL, this);
            this.mLynxTemplateRender.LJJIJLIJ();
            this.mLynxTemplateRender.LJIIIIZZ();
            this.mLynxTemplateRender = null;
        }
        C1310360kCg c1310360kCg = this.mA11yWrapper;
        if (c1310360kCg != null && (c1310300kCa = c1310360kCg.LJIIIZ) != null && (accessibilityManager = c1310300kCa.LIZ) != null) {
            AccessibilityManagerAccessibilityStateChangeListenerC1310310kCb accessibilityManagerAccessibilityStateChangeListenerC1310310kCb = c1310300kCa.LIZIZ;
            if (accessibilityManagerAccessibilityStateChangeListenerC1310310kCb != null) {
                accessibilityManager.removeAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC1310310kCb);
            }
            AccessibilityManagerTouchExplorationStateChangeListenerC1310320kCc accessibilityManagerTouchExplorationStateChangeListenerC1310320kCc = c1310300kCa.LIZJ;
            if (accessibilityManagerTouchExplorationStateChangeListenerC1310320kCc != null) {
                c1310300kCa.LIZ.removeTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC1310320kCc);
            }
        }
        TraceEvent.LJII("DestroyLynxView");
    }

    public void detachEngineFromUIThread() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJIIJJI();
        }
    }

    public boolean enableAirStrictMode() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJJJJZ;
        }
        return false;
    }

    public boolean enableJSRuntime() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJJJJLL;
        }
        return true;
    }

    public HashMap<String, Object> getAllTimingInfo() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJIJ();
        }
        return null;
    }

    public InterfaceC1309710kBd getBaseInspectorController() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        return null;
    }

    public LynxBaseInspectorOwner getBaseInspectorOwner() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        return null;
    }

    public long getFirstMeasureTime() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return -1L;
        }
        return lynxTemplateRender.LJJIIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0kCX] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kCn] */
    public C1310270kCX getLynxConfigInfo() {
        final ?? r1 = new Object() { // from class: X.0kCn
        };
        return new Object(r1) { // from class: X.0kCX
        };
    }

    public s getLynxContext() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.mLynxContext;
        }
        return null;
    }

    public UIGroup<C1310660kDA> getLynxUIRoot() {
        InterfaceC1309730kBf interfaceC1309730kBf;
        C1311720kEs c1311720kEs;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (interfaceC1309730kBf = lynxTemplateRender.LJJJIL) == null || (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) == null) {
            return null;
        }
        return c1311720kEs.LIZIZ;
    }

    @Override // X.C1310660kDA
    public C1309760kBi getLynxViewBuilder() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJJI();
        }
        return null;
    }

    public String getPageVersion() {
        s sVar;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (sVar = lynxTemplateRender.mLynxContext) == null) {
            return "";
        }
        C1310290kCZ c1310290kCZ = sVar.LLLIIII;
        if (c1310290kCZ != null) {
            return c1310290kCZ.LIZLLL;
        }
        LynxLog.e("LynxContext", "PageConfig is null.GetPageVersion get default error;");
        return "error";
    }

    public String getRenderPhase() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJJJJIZL;
        }
        return null;
    }

    public TemplateData getTemplateData() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJJLJLI.LJIJ();
        }
        return null;
    }

    public String getTemplateUrl() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        String str = lynxTemplateRender.LJI;
        return str == null ? "" : str;
    }

    public EnumC665490Q8l getThreadStrategyForRendering() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJIIL;
    }

    public InterfaceC1309730kBf lynxUIRenderer() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJJIJIIJI();
        }
        return null;
    }

    public void onEnterBackground() {
        checkAccessFromNonUiThread("onEnterBackground");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterBackground");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJIL(true);
        }
        lynxUIRenderer();
    }

    public void onEnterForeground() {
        checkAccessFromNonUiThread("onEnterForeground");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEnterForeground ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJIZ(true);
        }
        lynxUIRenderer();
    }

    public void pauseRootLayoutAnimation() {
        InterfaceC1309730kBf interfaceC1309730kBf;
        C1311720kEs c1311720kEs;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (interfaceC1309730kBf = lynxTemplateRender.LJJJIL) == null || (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) == null) {
            return;
        }
        c1311720kEs.LJIIJJI = false;
    }

    public void processRender() {
        checkAccessFromNonUiThread("processRender");
        if (this.mLynxTemplateRender == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxView call processRender in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mLynxTemplateRender.LJJJJLL();
    }

    public void resumeRootLayoutAnimation() {
        InterfaceC1309730kBf interfaceC1309730kBf;
        C1311720kEs c1311720kEs;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (interfaceC1309730kBf = lynxTemplateRender.LJJJIL) == null || (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) == null) {
            return;
        }
        c1311720kEs.LJIIJJI = true;
    }

    public void startLynxRuntime() {
        checkAccessFromNonUiThread("startLynxRuntime");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJLJJLL();
    }

    public void syncFlush() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJLJLJ();
        }
    }

    @Override // X.C1310660kDA
    public List<C1310110kCH> getMeaningfulPaintingAreas() {
        if (getLynxContext() == null || !getLynxContext().LJIJI()) {
            return null;
        }
        UIGroup<C1310660kDA> lynxUIRoot = getLynxUIRoot();
        return lynxUIRoot instanceof UIBody ? ((UIBody) lynxUIRoot).LJJIJ() : super.getMeaningfulPaintingAreas();
    }

    public C1299170jud getTheme() {
        s lynxContext = getLynxContext();
        if (lynxContext != null) {
            LynxFeatureCounter.LIZ(85, lynxContext.LLJLILLLLZIIL);
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJJIIJ;
    }

    public void reloadAndInit() {
        lynxUIRenderer();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
    }

    public int getCurrentHeightMeasureSpec() {
        return this.mCurrentHeightMeasureSpec;
    }

    public int getCurrentWidthMeasureSpec() {
        return this.mCurrentWidthMeasureSpec;
    }

    public C1321710kUz getKeyboardEvent() {
        return this.mKeyboardEvent;
    }

    public int getLynxViewId() {
        return this.mLynxViewId;
    }

    @Override // X.C1310660kDA
    public boolean isAccessibilityDisabled() {
        return this.mIsAccessibilityDisabled;
    }

    public LynxView(Context context) {
        super(context);
        this.mDispatchTouchEventToDev = true;
        this.mCurrentWidthMeasureSpec = -1;
        this.mCurrentHeightMeasureSpec = -1;
        if (LynxProfiler.isOpen()) {
            String name = getClass().getName();
            LynxProfiler.onCreate(this, C2095108Ir.LIZ(this), name, Log.getStackTraceString(new RuntimeException(name)));
        } else {
            if (!C20525082h.LIZ) {
                return;
            }
            C20525082h.LIZIZ.put(Integer.valueOf(System.identityHashCode(this)), new RuntimeException(getClass().getName()));
        }
    }

    public static C1309760kBi builder(Context context) {
        return new C1309760kBi();
    }

    private void checkAccessFromNonUiThread(String str) {
        int iId;
        s lynxContext = getLynxContext();
        if (lynxContext != null && lynxContext.LIZLLL() && LynxEnv.inst().enableCheckAccessFromNonUIThread() && !this.mHasReportedAccessFromNonUiThread && sMainLooper != Looper.myLooper() && !TextUtils.isEmpty(this.mUrl)) {
            this.mHasReportedAccessFromNonUiThread = true;
            HashMap map = new HashMap();
            map.put("url", this.mUrl);
            if (getThreadStrategyForRendering() != null) {
                iId = getThreadStrategyForRendering().id();
            } else {
                iId = -1;
            }
            map.put("thread_mode", Integer.valueOf(iId));
            map.put("lynx_sdk_version", LynxEnv.inst().getLynxVersion());
            map.put("method", str);
            LynxEventReporter.onEvent("lynxsdk_access_lynxview_from_non_ui_thread", map, -1);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_memory_report_LynxViewProfilerLancet_onAttachedToWindow(LynxView lynxView) {
        lynxView.com_lynx_tasm_LynxView__onAttachedToWindow$___twin___();
        if (LynxProfiler.isOpen()) {
            LynxProfiler.onAttached(C2095108Ir.LIZ(lynxView));
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_aweme_memory_report_LynxViewProfilerLancet_onDetachedFromWindow(LynxView lynxView) {
        lynxView.com_lynx_tasm_LynxView__onDetachedFromWindow$___twin___();
        if (LynxProfiler.isOpen()) {
            LynxProfiler.onDetached(C2095108Ir.LIZ(lynxView));
        }
    }

    private void onTraceEventEnd(String str) {
        if (!TraceController.isTracingStarted()) {
            return;
        }
        TraceEvent.LJII(str);
    }

    public void addLynxViewClient(LynxViewClient lynxViewClient) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        if (lynxViewClient == null) {
            lynxTemplateRender.getClass();
        } else {
            lynxTemplateRender.LJIILIIL.LJJIJ(lynxViewClient);
        }
    }

    public void addLynxViewClientV2(C1310070kCD c1310070kCD) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            C1309950kC1 c1309950kC1 = lynxTemplateRender.LJIILJJIL;
            if (c1310070kCD != null) {
                if (!c1309950kC1.LIZ.contains(c1310070kCD)) {
                    c1309950kC1.LIZ.add(c1310070kCD);
                    return;
                }
                return;
            }
            c1309950kC1.getClass();
        }
    }

    public void addRuntimeLifecycleListener(InterfaceC1292320jja interfaceC1292320jja) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            if (interfaceC1292320jja != null) {
                JSProxy jSProxy = lynxTemplateRender.LJJJJZI;
                if (jSProxy != null) {
                    jSProxy.LIZ(interfaceC1292320jja);
                    return;
                }
            } else {
                lynxTemplateRender.getClass();
            }
            LynxLog.w("LynxTemplateRender", "add a null lifecycle listener or js proxy is null.");
        }
    }

    @Override // X.C1310660kDA, X.InterfaceC1314720kJi
    public void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        if (this.mDisableDrawChildHook) {
            return;
        }
        super.bindDrawChildHook(interfaceC1314130kIl);
    }

    @Override // X.C1310660kDA, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        onTraceEventBegin("LynxView.onDraw", new ACallableS411S0100000_3(this, 9));
        super.dispatchDraw(canvas);
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJJIL();
        }
        if (!this.mOnLoadFired && !this.mIsPrePaintingStage) {
            this.mOnLoadFired = true;
            triggerEmbeddedModeLifecycle("onLoad", true);
        }
        onTraceEventEnd("LynxView.onDraw");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (lynxUIRenderer() != null) {
            lynxUIRenderer().getClass();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action;
        boolean zLJIILIIL;
        try {
            action = motionEvent.getAction();
            if (action == 0 || action == 1 || action == 3) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxView dispatchTouchEvent, this: ");
                sbLIZ.append(hashCode());
                sbLIZ.append(", touch: ");
                sbLIZ.append(motionEvent.getActionMasked());
                sbLIZ.append(" x: ");
                sbLIZ.append(motionEvent.getX());
                sbLIZ.append(" y: ");
                sbLIZ.append(motionEvent.getY());
                LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.mLynxTemplateRender != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("An exception occurred during dispatchTouchEvent(): ");
                sbLIZ2.append(th.getMessage());
                LynxError lynxError = new LynxError(109900, C2188811AlT.LIZIZ(sbLIZ2), "This error is caught by native, please ask Lynx for help", "error");
                lynxError.LJII(CallStackUtil.LIZ(th));
                this.mLynxTemplateRender.onErrorOccurred(lynxError);
            }
        }
        if (this.mLynxTemplateRender == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        lynxUIRenderer();
        if (this.mIsChildLynxPageUI) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (action == 0) {
            if (LynxEnv.inst().isHighlightTouchEnabled()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("LynxView: dispatch touch for lynx ");
                sbLIZ3.append(hashCode());
                sbLIZ3.append(", touch: ");
                sbLIZ3.append(action);
                sbLIZ3.append(" x: ");
                sbLIZ3.append(motionEvent.getX());
                sbLIZ3.append(" y: ");
                sbLIZ3.append(motionEvent.getY());
                showMessageOnConsole(C2188811AlT.LIZIZ(sbLIZ3), EnumC1289510jf3.Info.ordinal());
            }
            this.mCanDispatchTouchEvent = true;
            this.mConsumeSlideEvent = false;
        }
        if (this.mCanDispatchTouchEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            zLJIILIIL = this.mLynxTemplateRender.LJIILIIL(motionEvent);
            motionEvent.setLocation(x, y);
            if (zLJIILIIL && this.mLynxTemplateRender.LIZLLL(motionEvent) && getParent() != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("LynxView dispatchTouchEvent blockNativeEvent true for lynx ");
                sbLIZ4.append(hashCode());
                LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ4));
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else {
            zLJIILIIL = false;
        }
        if (action == 1 || action == 3) {
            if (LynxEnv.inst().isHighlightTouchEnabled()) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("LynxView: dispatch touch for lynx ");
                sbLIZ5.append(hashCode());
                sbLIZ5.append(", touch: ");
                sbLIZ5.append(action);
                sbLIZ5.append(" x: ");
                sbLIZ5.append(motionEvent.getX());
                sbLIZ5.append(" y: ");
                sbLIZ5.append(motionEvent.getY());
                showMessageOnConsole(C2188811AlT.LIZIZ(sbLIZ5), EnumC1289510jf3.Info.ordinal());
            }
            this.mCanDispatchTouchEvent = false;
        }
        if (zLJIILIIL) {
            if (this.mDispatchTouchEventToDev) {
                this.mLynxTemplateRender.getClass();
            }
            if (!this.mConsumeSlideEvent) {
                this.mConsumeSlideEvent = this.mLynxTemplateRender.LJI(motionEvent);
            }
            if (this.mConsumeSlideEvent) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("LynxView dispatchTouchEvent consumeSlideEvent true for lynx ");
                sbLIZ6.append(hashCode());
                LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ6));
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public LynxBaseUI findUIByIdSelector(String str) {
        InterfaceC1309730kBf interfaceC1309730kBf;
        C1311720kEs c1311720kEs;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (interfaceC1309730kBf = lynxTemplateRender.LJJJIL) == null || (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) == null) {
            return null;
        }
        return c1311720kEs.LJIIL(str);
    }

    public LynxBaseUI findUIByIndex(int i) {
        InterfaceC1309730kBf interfaceC1309730kBf;
        C1311720kEs c1311720kEs;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (interfaceC1309730kBf = lynxTemplateRender.LJJJIL) == null || (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) == null) {
            return null;
        }
        return c1311720kEs.LJI.get(Integer.valueOf(i));
    }

    public LynxBaseUI findUIByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJIILLIIL(str);
    }

    public View findViewByIdSelector(String str) {
        LynxBaseUI lynxBaseUILJIIL;
        C1311720kEs c1311720kEs;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        InterfaceC1309730kBf interfaceC1309730kBf = lynxTemplateRender.LJJJIL;
        if (interfaceC1309730kBf != null && (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) != null) {
            lynxBaseUILJIIL = c1311720kEs.LJIIL(str);
        } else {
            lynxBaseUILJIIL = null;
        }
        if (!(lynxBaseUILJIIL instanceof LynxUI)) {
            return null;
        }
        return ((LynxUI) lynxBaseUILJIIL).mView;
    }

    public View findViewByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        LynxBaseUI lynxBaseUILJIILLIIL = lynxTemplateRender.LJIILLIIL(str);
        if (!(lynxBaseUILJIILLIIL instanceof LynxUI)) {
            return null;
        }
        return ((LynxUI) lynxBaseUILJIILLIIL).mView;
    }

    public void getCurrentData(InterfaceC1310260kCW interfaceC1310260kCW) {
        checkAccessFromNonUiThread("getCurrentData");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJIJJ(interfaceC1310260kCW);
    }

    public C1309720kBe getJSModule(String str) {
        s sVar;
        WeakReference<JSProxy> weakReference;
        JSProxy jSProxy;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (sVar = lynxTemplateRender.mLynxContext) == null || (weakReference = sVar.LLJI) == null || (jSProxy = weakReference.get()) == null) {
            return null;
        }
        return new C1309720kBe(str, jSProxy);
    }

    public Map<String, Object> getPageDataByKey(String[] strArr) {
        checkAccessFromNonUiThread("getPageDataByKey");
        if (strArr != null && strArr.length != 0) {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender == null) {
                return null;
            }
            return lynxTemplateRender.LJJIFFI(strArr);
        }
        LynxLog.i("LynxView", "getPageDataByKey called with empty keys.");
        return null;
    }

    public void initWithLynxViewBuilder(C1309760kBi c1309760kBi) {
        c1309760kBi.LJIL().getClass();
        LynxUIRenderer lynxUIRenderer = new LynxUIRenderer();
        EnumC665490Q8l enumC665490Q8lLJJIJL = c1309760kBi.LJJIJL();
        if (enumC665490Q8lLJJIJL != null) {
            c1309760kBi.LJIJI = enumC665490Q8lLJJIJL;
        }
        this.mLynxUIRender = lynxUIRenderer;
        if (c1309760kBi.LJJIJIIJI != null) {
            initLynxViewWithRuntime(getContext(), c1309760kBi);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new lynxview detail ");
        sbLIZ.append(this);
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1309730kBf interfaceC1309730kBf = this.mLynxUIRender;
        getContext();
        c1309760kBi.LJJIIJZLJL();
        interfaceC1309730kBf.getClass();
        initialize(getContext(), c1309760kBi);
        InterfaceC1300010jvz interfaceC1300010jvz = c1309760kBi.LJJIJIIJIL;
        if (interfaceC1300010jvz != null) {
            int iLJJIIZI = interfaceC1300010jvz.LJJIIZI();
            this.mLynxViewId = iLJJIIZI;
            c1309760kBi.LJJIJIIJIL.LJII(this, iLJJIIZI);
            this.mLynxViewGroupRef = new WeakReference<>(c1309760kBi.LJJIJIIJIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[PHI: r1
      0x0049: PHI (r1v7 int) = (r1v4 int), (r1v8 int) binds: [B:34:0x0071, B:26:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074 A[PHI: r1
      0x0074: PHI (r1v5 int) = (r1v4 int), (r1v7 int) binds: [B:34:0x0071, B:28:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadTemplate(X.C1309930kBz r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            X.0kC4 r2 = X.EnumC1309980kC4.PRE_PAINTING
            r1 = 1
            if (r2 == 0) goto Lc
            X.0kC4 r0 = X.EnumC1309980kC4.PRE_PAINTING_DRAW
            if (r0 != 0) goto Le
        Lc:
            r5.mIsPrePaintingStage = r1
        Le:
            boolean r0 = r5.isLayoutRequested()
            if (r0 == 0) goto L52
            if (r2 != 0) goto L52
            r5.isInPrePainting = r1
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L25
            r0 = 0
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r5, r0)
            r5.removeAllViewsInLayout()
        L25:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            r3 = 0
            if (r4 == 0) goto L78
            int r0 = r4.width
            if (r0 < 0) goto L78
        L30:
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            if (r4 == 0) goto L76
            int r0 = r4.height
            if (r0 < 0) goto L76
        L3c:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r5.measure(r1, r0)
            if (r4 == 0) goto L70
            int r1 = r4.width
            if (r1 < 0) goto L70
        L49:
            int r0 = r4.height
            if (r0 < 0) goto L74
        L4d:
            r5.layout(r3, r3, r1, r0)
            r5.isInPrePainting = r3
        L52:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loadTemplate with LynxLoadMeta in "
            r1.append(r0)
            java.lang.String r0 = r5.toString()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LynxView"
            com.lynx.base.log.LynxLog.i(r0, r1)
            com.lynx.tasm.LynxTemplateRender r0 = r5.mLynxTemplateRender
            if (r0 != 0) goto L7a
            return
        L70:
            r1 = 0
            if (r4 == 0) goto L74
            goto L49
        L74:
            r0 = 0
            goto L4d
        L76:
            r0 = 0
            goto L3c
        L78:
            r0 = 0
            goto L30
        L7a:
            com.lynx.tasm.LynxTemplateRender r0 = r5.mLynxTemplateRender
            r0.LJJIIZI(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxView.loadTemplate(X.0kBz):void");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC1309730kBf interfaceC1309730kBf;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxView onInterceptTouchEvent, this: ");
            sbLIZ.append(hashCode());
            LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ));
            if (this.mIsChildLynxPageUI) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null && this.mCanDispatchTouchEvent && (interfaceC1309730kBf = lynxTemplateRender.LJJJIL) != null) {
                LynxUIRenderer lynxUIRenderer = (LynxUIRenderer) interfaceC1309730kBf;
                lynxUIRenderer.LIZ();
                C1311380kEK c1311380kEK = lynxUIRenderer.LIZJ;
                if (c1311380kEK != null && c1311380kEK.LJJ && c1311380kEK.LJJIJIIJI) {
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.mLynxTemplateRender != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("An exception occurred during onInterceptTouchEvent(): ");
                sbLIZ2.append(th.getMessage());
                LynxError lynxError = new LynxError(109900, C2188811AlT.LIZIZ(sbLIZ2), "This error is caught by native, please ask Lynx for help", "error");
                lynxError.LJII(CallStackUtil.LIZ(th));
                this.mLynxTemplateRender.onErrorOccurred(lynxError);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxView onTouchEvent, this: ");
            sbLIZ.append(hashCode());
            LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ));
            if (this.mIsChildLynxPageUI) {
                return super.onTouchEvent(motionEvent);
            }
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null) {
                if (this.mCanDispatchTouchEvent) {
                    lynxTemplateRender.getClass();
                }
                if (!this.mLynxTemplateRender.LIZLLL(motionEvent) || getParent() == null) {
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.mLynxTemplateRender != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("An exception occurred during onTouchEvent(): ");
                sbLIZ2.append(th.getMessage());
                LynxError lynxError = new LynxError(109900, C2188811AlT.LIZIZ(sbLIZ2), "This error is caught by native, please ask Lynx for help", "error");
                lynxError.LJII(CallStackUtil.LIZ(th));
                this.mLynxTemplateRender.onErrorOccurred(lynxError);
                return false;
            }
            return false;
        }
    }

    public void preloadDynamicComponents(String[] strArr) {
        checkAccessFromNonUiThread("preloadDynamicComponents");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload lazy bundles: ");
        sbLIZ.append(TextUtils.join(", ", strArr));
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && strArr != null && strArr.length != 0) {
            lynxTemplateRender.LJJJJJL(strArr);
        }
    }

    public void putParamsForReportingEvents(Map<String, Object> map) {
        LynxTemplateRender lynxTemplateRender;
        if (map != null && (lynxTemplateRender = this.mLynxTemplateRender) != null) {
            lynxTemplateRender.LJJJJI("LynxTemplateRender.putExtraParamsForReportEvents");
            s sVar = lynxTemplateRender.mLynxContext;
            if (sVar != null && sVar.LIZLLL()) {
                LynxEventReporter.putExtraParams(map, lynxTemplateRender.mLynxContext.LLJLILLLLZIIL);
            }
            LynxTemplateRender.LJJJJIZL("LynxTemplateRender.putExtraParamsForReportEvents");
        }
    }

    public void putPendingPipelineIdsToMap(Map<String, String> map) {
        PerformanceController performanceController;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (performanceController = lynxTemplateRender.LJJJJI) != null) {
            JavaOnlyArray javaOnlyArray = performanceController.LJI;
            StringBuilder sb = new StringBuilder();
            for (Object obj : javaOnlyArray) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(String.valueOf(obj));
            }
            map.put("pipeline_ids", sb.toString());
        }
    }

    public void reloadTemplate(TemplateData templateData) {
        reloadTemplate(templateData, null);
    }

    public void removeLynxViewClient(LynxViewClient lynxViewClient) {
        C1309780kBk c1309780kBk;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && lynxViewClient != null && (c1309780kBk = lynxTemplateRender.LJIILIIL) != null) {
            c1309780kBk.LL.remove(lynxViewClient);
        }
    }

    public void removeLynxViewClientV2(C1310070kCD c1310070kCD) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJIILJJIL.LIZ.remove(c1310070kCD);
        }
    }

    public void resetData(TemplateData templateData) {
        checkAccessFromNonUiThread("resetData");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resetData with json in ");
        sbLIZ.append(templateData.toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        this.mLynxTemplateRender.LJJLIIIJLJLI(templateData);
        if (this.mIsPrePaintingStage) {
            this.mIsPrePaintingStage = false;
        } else {
            triggerEmbeddedModeLifecycle("onDataChanged", true);
        }
    }

    @Override // X.C1310660kDA
    public void runOnTasmThread(Runnable runnable) {
        checkAccessFromNonUiThread("runOnTasmThread");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        LynxEngineProxy lynxEngineProxy = lynxTemplateRender.LJJJLL;
        if (lynxEngineProxy == null) {
            LynxLog.i("LynxTemplateRender", "runOnTasmThread failed, engine proxy is null.");
        } else {
            C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(lynxEngineProxy, runnable, 78));
        }
    }

    public void setAsyncImageInterceptor(InterfaceC1294040jmM interfaceC1294040jmM) {
        s sVar;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (sVar = lynxTemplateRender.mLynxContext) != null) {
            sVar.LLILZ = interfaceC1294040jmM;
        }
    }

    @Override // X.C1310660kDA
    public void setAttachLynxPageUICallback(InterfaceC1310500kCu interfaceC1310500kCu) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJLL(interfaceC1310500kCu);
        }
    }

    public void setEnableUIFlush(boolean z) {
        checkAccessFromNonUiThread("setEnableUIFlush");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJZZI(z);
    }

    public void setExtraTiming(Map<String, Long> map) {
        if (map != null && this.mLynxTemplateRender != null) {
            C1310170kCN c1310170kCN = new C1310170kCN();
            if (map.containsKey("open_time")) {
                c1310170kCN.LIZ = map.get("open_time").longValue();
            }
            if (map.containsKey("container_init_start")) {
                c1310170kCN.LIZIZ = map.get("container_init_start").longValue();
            }
            if (map.containsKey("container_init_end")) {
                c1310170kCN.LIZJ = map.get("container_init_end").longValue();
            }
            if (map.containsKey("prepare_template_start")) {
                c1310170kCN.LIZLLL = map.get("prepare_template_start").longValue();
            }
            if (map.containsKey("prepare_template_end")) {
                c1310170kCN.LJ = map.get("prepare_template_end").longValue();
            }
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            lynxTemplateRender.LJJJJI("LynxTemplateRender.setExtraTiming");
            PerformanceController performanceController = lynxTemplateRender.LJJJJI;
            if (!performanceController.LJ) {
                performanceController.LJIILJJIL(new ARunnableS89S0200000_20(c1310170kCN, performanceController, 207));
            }
            LynxTemplateRender.LJJJJIZL("LynxTemplateRender.setExtraTiming");
        }
    }

    public void setFluencyTracerEnabled(EnumC1299430jv3 enumC1299430jv3) {
        s sVar;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (sVar = lynxTemplateRender.mLynxContext) != null) {
            C1320440kSw c1320440kSwLJIIIZ = sVar.LJIIIZ();
            if (c1320440kSwLJIIIZ.LJFF != enumC1299430jv3) {
                c1320440kSwLJIIIZ.LJFF = enumC1299430jv3;
                c1320440kSwLJIIIZ.LIZLLL();
            }
        }
    }

    public void setGlobalProps(Map<String, Object> map) {
        checkAccessFromNonUiThread("setGlobalProps");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJZ(TemplateData.LJII(map));
    }

    public void setImageInterceptor(InterfaceC1294040jmM interfaceC1294040jmM) {
        s sVar;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (sVar = lynxTemplateRender.mLynxContext) != null) {
            sVar.LLILLL = interfaceC1294040jmM;
        }
    }

    public void setLongTaskMonitorEnabled(EnumC1299430jv3 enumC1299430jv3) {
        this.mLynxTemplateRender.LJJZZIII(enumC1299430jv3);
        s lynxContext = getLynxContext();
        if (lynxContext != null) {
            lynxContext.LLJJLIIIJLLLLLLLZ = enumC1299430jv3;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setFocusableInTouchMode(z);
        super.setOnClickListener(onClickListener);
    }

    public void setTheme(C1299170jud c1299170jud) {
        s lynxContext = getLynxContext();
        if (lynxContext != null) {
            LynxFeatureCounter.LIZ(84, lynxContext.LLJLILLLLZIIL);
        }
        checkAccessFromNonUiThread("setTheme");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && c1299170jud != null) {
            C1299170jud c1299170jud2 = lynxTemplateRender.LJJIIJ;
            if (c1299170jud2 == null) {
                lynxTemplateRender.LJJIIJ = c1299170jud;
            } else {
                c1299170jud2.LIZ = c1299170jud.LIZ;
            }
            if (lynxTemplateRender.LJJI && lynxTemplateRender.LJJLIIIJ != 0) {
                lynxTemplateRender.LJLIL(c1299170jud);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisibility:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" ");
        sbLIZ.append(i);
        LynxLog.i("Lynx", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void updateData(TemplateData templateData) {
        checkAccessFromNonUiThread("updateData");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData with data in ");
        sbLIZ.append(templateData.toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        this.mLynxTemplateRender.LJLLLL(templateData, false);
        if (this.mIsPrePaintingStage) {
            this.mIsPrePaintingStage = false;
        } else {
            triggerEmbeddedModeLifecycle("onDataChanged", true);
        }
    }

    public void updateFontScacle(float f) {
        int i;
        s sVar;
        checkAccessFromNonUiThread("updateFontScale");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (sVar = lynxTemplateRender.mLynxContext) != null) {
            i = sVar.LLJLILLLLZIIL;
        } else {
            i = -1;
        }
        LynxFeatureCounter.LIZ(79, i);
        LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
        if (lynxTemplateRender2 == null) {
            return;
        }
        lynxTemplateRender2.LJLLLLLL(f);
    }

    public void updateFontScale(float f) {
        int i;
        s sVar;
        checkAccessFromNonUiThread("updateFontScale");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (sVar = lynxTemplateRender.mLynxContext) != null) {
            i = sVar.LLJLILLLLZIIL;
        } else {
            i = -1;
        }
        LynxFeatureCounter.LIZ(79, i);
        LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
        if (lynxTemplateRender2 == null) {
            return;
        }
        lynxTemplateRender2.LJLLLLLL(f);
    }

    public void updateGlobalProps(TemplateData templateData) {
        checkAccessFromNonUiThread("updateGlobalProps");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJZ(templateData);
    }

    public void updateMetaData(C1300050jw3 c1300050jw3) {
        checkAccessFromNonUiThread("updateMetaData");
        if (this.mLynxTemplateRender != null && c1300050jw3 != null) {
            this.mLynxTemplateRender.LJZL(c1300050jw3);
            if (this.mIsPrePaintingStage) {
                this.mIsPrePaintingStage = false;
            } else {
                triggerEmbeddedModeLifecycle("onDataChanged", true);
            }
        }
    }

    public void setExtraTiming(C1310170kCN c1310170kCN) {
        LynxTemplateRender lynxTemplateRender;
        if (c1310170kCN != null && (lynxTemplateRender = this.mLynxTemplateRender) != null) {
            lynxTemplateRender.LJJJJI("LynxTemplateRender.setExtraTiming");
            PerformanceController performanceController = lynxTemplateRender.LJJJJI;
            if (!performanceController.LJ) {
                performanceController.LJIILJJIL(new ARunnableS89S0200000_20(c1310170kCN, performanceController, 207));
            }
            LynxTemplateRender.LJJJJIZL("LynxTemplateRender.setExtraTiming");
        }
    }

    public void setGlobalProps(TemplateData templateData) {
        checkAccessFromNonUiThread("setGlobalProps");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJZ(templateData);
    }

    public void setTheme(ByteBuffer byteBuffer) {
        s lynxContext = getLynxContext();
        if (lynxContext != null) {
            LynxFeatureCounter.LIZ(84, lynxContext.LLJLILLLLZIIL);
        }
        checkAccessFromNonUiThread("setTheme");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && byteBuffer != null) {
            lynxTemplateRender.LJLIIL(byteBuffer);
        }
    }

    public void updateData(String str) {
        updateData(str, (String) null);
    }

    public void updateGlobalProps(Map<String, Object> map) {
        updateGlobalProps(TemplateData.LJII(map));
    }

    public void updateData(Map<String, Object> map) {
        updateData(map, (String) null);
    }

    public LynxView(Context context, InterfaceC1310620kD6 interfaceC1310620kD6) {
        super(context);
        this.mDispatchTouchEventToDev = true;
        this.mCurrentWidthMeasureSpec = -1;
        this.mCurrentHeightMeasureSpec = -1;
        this.mLynxTemplateRender = (LynxTemplateRender) interfaceC1310620kD6;
        initialize(context, null);
        if (LynxProfiler.isOpen()) {
            String name = getClass().getName();
            LynxProfiler.onCreate(this, C2095108Ir.LIZ(this), name, Log.getStackTraceString(new RuntimeException(name)));
        } else {
            if (!C20525082h.LIZ) {
                return;
            }
            C20525082h.LIZIZ.put(Integer.valueOf(System.identityHashCode(this)), new RuntimeException(getClass().getName()));
        }
    }

    private void initLynxTemplateRender(Context context, C1309760kBi c1309760kBi) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LIZJ(this);
            return;
        }
        this.mLynxUIRender.getClass();
        this.mIsAccessibilityDisabled = false;
        this.mLynxTemplateRender = new LynxTemplateRender(context, this, c1309760kBi);
    }

    private void initLynxViewWithRuntime(Context context, C1309760kBi c1309760kBi) {
        LynxBackgroundRuntime lynxBackgroundRuntime = c1309760kBi.LJJIJIIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init LynxView with runtime, ");
        sbLIZ.append(lynxBackgroundRuntime);
        LynxLog.w("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (lynxBackgroundRuntime.LJIIIIZZ) {
            try {
                if (lynxBackgroundRuntime.LJII != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("build LynxView using an invalid LynxBackgroundRuntime, state: ");
                    sbLIZ2.append(lynxBackgroundRuntime.LJII);
                    sbLIZ2.append(", runtime: ");
                    sbLIZ2.append(lynxBackgroundRuntime);
                    LynxLog.e("LynxBackgroundRuntime", C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Build LynxView using an used LynxBackgroundRuntime: ");
                    sbLIZ3.append(lynxBackgroundRuntime);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                }
                lynxBackgroundRuntime.LJII = 4;
                LynxModuleFactory lynxModuleFactory = lynxBackgroundRuntime.LIZIZ;
                List<C1297450jrr> list = c1309760kBi.LJJIIJZLJL().LIZLLL;
                lynxModuleFactory.getClass();
                if (list != null) {
                    ArrayList<C1297450jrr> arrayList = (ArrayList) list;
                    if (!arrayList.isEmpty()) {
                        for (C1297450jrr c1297450jrr : arrayList) {
                            String str = c1297450jrr.LIZ;
                            if (lynxModuleFactory.LIZ.containsKey(str)) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("Duplicated LynxModule For Name: ");
                                sbLIZ4.append(str);
                                sbLIZ4.append(", will be ignored");
                                LynxLog.w("LynxModuleFactory", C2188811AlT.LIZIZ(sbLIZ4));
                            }
                            lynxModuleFactory.LIZ.putIfAbsent(str, c1297450jrr);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("method addModuleParamWrapperIfAbsent , registered module with name: ");
                            sbLIZ5.append(str);
                            sbLIZ5.append(" class");
                            sbLIZ5.append(c1297450jrr);
                            LynxLog.v("LynxModuleFactory", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                }
                c1309760kBi.LJJIIJZLJL().LIZIZ(lynxBackgroundRuntime.LIZ);
                initialize(context, c1309760kBi);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void initialize(Context context, C1309760kBi c1309760kBi) {
        setFocusableInTouchMode(true);
        if (!LynxEnv.inst().enableFreshRateOpt()) {
            VSyncMonitor.LIZ = new WeakReference<>(C786410Ut5.H2(context, "window"));
            VSyncMonitor.LIZLLL = false;
        }
        if (VSyncMonitor.LIZJ == null) {
            C1289620jfE.LIZLLL(new ARunnableS96S0000000_20(3));
        }
        initLynxTemplateRender(context, c1309760kBi);
        this.mKeyboardEvent = new C1321710kUz(getLynxContext());
        this.mLynxUIRender.getClass();
        this.mDisableDrawChildHook = false;
    }

    private void onTraceEventBegin(String str, Callable<HashMap<String, String>> callable) {
        String strValueOf;
        if (!TraceController.isTracingStarted()) {
            return;
        }
        HashMap map = new HashMap();
        if (getLynxContext() != null) {
            strValueOf = String.valueOf(getLynxContext().LLJLILLLLZIIL);
        } else {
            strValueOf = "null";
        }
        map.put("instance_id", strValueOf);
        map.put("lynx_view", toString());
        if (callable != null) {
            try {
                map.putAll(callable.call());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                map.put("exception", e.toString());
            }
        }
        TraceEvent.LIZJ(str, map);
    }

    private void showMessageOnConsole(String str, int i) {
        getBaseInspectorController();
    }

    private void triggerEmbeddedModeLifecycle(String str, boolean z) {
        s sVar;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (sVar = lynxTemplateRender.mLynxContext) != null && sVar.LJIJI()) {
            C1289620jfE.LIZJ(new ARunnableS5S1110000_20(this, str, z, 3));
        }
    }

    public void com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplateUrl ");
        sbLIZ.append(str);
        sbLIZ.append("with jsonData in");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.getClass();
        lynxTemplateRender.LJJLIIIJJI(str, new C1309800kBm(lynxTemplateRender, str, str2));
    }

    public void getSessionStorageItem(String str, PlatformCallBack platformCallBack) {
        checkAccessFromNonUiThread("getSessionStorageItem");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJII(str, platformCallBack);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(final int i, final int i2) {
        boolean z = false;
        if (this.mDestroyed) {
            setMeasuredDimension(0, 0);
            return;
        }
        onTraceEventBegin("LynxView.onMeasure", new Callable<HashMap<String, String>>() { // from class: X.0jfb
            @Override // java.util.concurrent.Callable
            public final HashMap<String, String> call() {
                C1C7U.LIZ("LynxView@80d.onMeasure$1");
                HashMap<String, String> map = new HashMap<>();
                map.put("widthMeasureSpec", String.valueOf(i));
                map.put("heightMeasureSpec", String.valueOf(i2));
                this.LLILLL.putPendingPipelineIdsToMap(map);
                C1C7U.LIZIZ("LynxView@80d.onMeasure$1");
                return map;
            }
        });
        this.mCurrentWidthMeasureSpec = i;
        this.mCurrentHeightMeasureSpec = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMeasure:");
        sbLIZ.append(hashCode());
        sbLIZ.append(", width");
        sbLIZ.append(View.MeasureSpec.toString(i));
        sbLIZ.append(", height");
        sbLIZ.append(View.MeasureSpec.toString(i2));
        LynxLog.d("Lynx", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && !this.isInPrePainting) {
            PerformanceController performanceController = lynxTemplateRender.LJJJJI;
            if (performanceController != null) {
                performanceController.LIZ("measureStart");
            }
            if (lynxUIRenderer() != null) {
                if (getLynxContext() != null && getLynxContext().LJIJJ()) {
                    z = true;
                }
                if (this.mLynxTemplateRender.LJJLIIIJL) {
                    UIGroup<C1310660kDA> lynxUIRoot = getLynxUIRoot();
                    if (lynxUIRoot instanceof UIBody) {
                        ((UIBody) lynxUIRoot).LJJIJIIJI();
                    }
                }
                this.mLynxTemplateRender.LJJJI(i, i2);
                if (z) {
                    super.onMeasure(i, i2);
                }
            } else {
                onMeasureWhenDetach(i, i2);
            }
            PerformanceController performanceController2 = this.mLynxTemplateRender.LJJJJI;
            if (performanceController2 != null) {
                performanceController2.LIZ("measureEnd");
            }
            onTraceEventEnd("LynxView.onMeasure");
            return;
        }
        super.onMeasure(i, i2);
        onTraceEventEnd("LynxView.onMeasure");
    }

    public void processLayout(String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processLayout ");
        sbLIZ.append(str);
        sbLIZ.append("with templateData in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJZZI(false);
        lynxTemplateRender.LJJLIIIJJI(str, new C1309800kBm(lynxTemplateRender, str, templateData));
    }

    public void processLayoutWithSSRUrl(String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processLayoutWithSSRUrl in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJZZI(false);
        lynxTemplateRender.LJJLIIIJ(str, new C1303600k1m(lynxTemplateRender, str, templateData));
    }

    public boolean registerDynamicComponent(String str, TemplateBundle templateBundle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register lazy bundle with TemplateBundle: ");
        sbLIZ.append(str);
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return false;
        }
        return lynxTemplateRender.LJJJLL(str, templateBundle);
    }

    public void reloadTemplate(TemplateData templateData, TemplateData templateData2) {
        checkAccessFromNonUiThread("reloadTemplate");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reloadTemplate with data: ");
        sbLIZ.append(String.valueOf(templateData));
        sbLIZ.append(", with globalProps:");
        sbLIZ.append(String.valueOf(templateData2));
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        this.mLynxTemplateRender.LJJJZ(templateData, templateData2);
    }

    public void renderSSRUrl(String str, Map<String, Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderSSRUrl ");
        sbLIZ.append(str);
        LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.getClass();
        lynxTemplateRender.LJJLIIIJ(str, new C1303600k1m(lynxTemplateRender, str, TemplateData.LJII(map)));
    }

    public void renderTemplate(byte[] bArr, Map<String, Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplate with init data in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.getClass();
        C1309920kBy c1309920kBy = new C1309920kBy();
        c1309920kBy.LIZIZ = bArr;
        TemplateData templateDataLJII = TemplateData.LJII(map);
        templateDataLJII.LJ = true;
        c1309920kBy.LIZLLL = templateDataLJII;
        lynxTemplateRender.LJJIIZI(c1309920kBy.LIZ());
    }

    public void renderTemplateUrl(String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplateUrl ");
        sbLIZ.append(str);
        sbLIZ.append("with templateData in");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJLIIIJJI(str, new C1309800kBm(lynxTemplateRender, str, templateData));
    }

    @Override // X.C1310660kDA
    public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
        if (LynxEnv.inst().isHighlightTouchEnabled()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxView: send global event ");
            sbLIZ.append(str);
            sbLIZ.append(" for lynx ");
            sbLIZ.append(hashCode());
            showMessageOnConsole(C2188811AlT.LIZIZ(sbLIZ), EnumC1289510jf3.Info.ordinal());
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("LynxView sendGlobalEvent ");
        sbLIZ2.append(str);
        sbLIZ2.append(" with this: ");
        sbLIZ2.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.mLynxTemplateRender == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("LynxVew sendGlobalEvent failed since mLynxTemplateRender is null with this: ");
            sbLIZ3.append(toString());
            LynxLog.e("LynxView", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (!enableAirStrictMode() && !this.mLynxTemplateRender.LJLJJL()) {
            this.mLynxTemplateRender.LJJLJ(str, javaOnlyArray);
        } else {
            triggerEventBus(str, javaOnlyArray);
        }
    }

    public void sendGlobalEventToLepus(String str, List<Object> list) {
        if (LynxEnv.inst().isHighlightTouchEnabled()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LynxView: send global event ");
            sbLIZ.append(str);
            sbLIZ.append(" to lepus for lynx ");
            sbLIZ.append(hashCode());
            showMessageOnConsole(C2188811AlT.LIZIZ(sbLIZ), EnumC1289510jf3.Info.ordinal());
        }
        checkAccessFromNonUiThread("sendGlobalEventToLepus");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJLJLI(str, list);
    }

    public void setEnableUserBytecode(boolean z, String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJJZ(str, z);
        }
    }

    public void setEnableUserCodeCache(boolean z, String str) {
        setEnableUserBytecode(z, str);
    }

    public void setSessionStorageItem(String str, TemplateData templateData) {
        LynxTemplateRender lynxTemplateRender;
        checkAccessFromNonUiThread("setSessionStorageItem");
        if (templateData != null && (lynxTemplateRender = this.mLynxTemplateRender) != null) {
            lynxTemplateRender.LJLIIIL(str, templateData);
        }
    }

    public void ssrHydrateUrl(String str, Map<String, Object> map) {
        if (map != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ssrHydrateUrl  ");
            sbLIZ.append(str);
            sbLIZ.append(" with data in ");
            sbLIZ.append(map.toString());
            LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ssrHydrateUrl  ");
            sbLIZ2.append(str);
            LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ2));
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        C1310200kCQ c1310200kCQ = lynxTemplateRender.LJIIIIZZ;
        if (c1310200kCQ != null && c1310200kCQ.LIZ == EnumC1309880kBu.PENDING) {
            c1310200kCQ.getClass();
            c1310200kCQ.LIZ = EnumC1309880kBu.STARTED;
        }
        lynxTemplateRender.LJJLIIIJJI(str, new C1309800kBm(lynxTemplateRender, str, map));
    }

    public double subscribeSessionStorage(String str, PlatformCallBack platformCallBack) {
        checkAccessFromNonUiThread("subscribeSessionStorage");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJLJL(str, platformCallBack);
        }
        return -1.0d;
    }

    public void triggerEventBus(String str, List<Object> list) {
        checkAccessFromNonUiThread("triggerEventBus");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJLL(str, list);
    }

    public void unsubscribeSessionStorage(String str, double d) {
        checkAccessFromNonUiThread("removeGlobalSharedDataListener");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJLLJ(str, d);
        }
    }

    public void updateData(String str, String str2) {
        checkAccessFromNonUiThread("updateData");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData with json in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.getClass();
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
        templateDataLJIIIIZZ.LIZJ = str2;
        templateDataLJIIIIZZ.LJ = true;
        lynxTemplateRender.LJLLLL(templateDataLJIIIIZZ, false);
        if (this.mIsPrePaintingStage) {
            this.mIsPrePaintingStage = false;
        } else {
            triggerEmbeddedModeLifecycle("onDataChanged", true);
        }
    }

    public void updateScreenMetrics(int i, int i2) {
        checkAccessFromNonUiThread("updateScreenMetrics");
        if (this.mLynxTemplateRender == null) {
            return;
        }
        synchronized (DisplayMetricsHolder.class) {
            try {
                DisplayMetricsHolder.LJFF = true;
                DisplayMetrics displayMetrics = DisplayMetricsHolder.LIZ;
                if (displayMetrics != null) {
                    displayMetrics.widthPixels = i;
                    displayMetrics.heightPixels = i2;
                }
                DisplayMetrics displayMetrics2 = DisplayMetricsHolder.LIZIZ;
                if (displayMetrics2 != null) {
                    displayMetrics2.widthPixels = i;
                    displayMetrics2.heightPixels = i2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.mLynxTemplateRender.LL(i, i2);
    }

    public void updateViewport(int i, int i2) {
        checkAccessFromNonUiThread("updateViewport");
        updateViewport(i, i2, true);
    }

    public LynxView(Context context, C1309760kBi c1309760kBi) {
        super(context);
        this.mDispatchTouchEventToDev = true;
        this.mCurrentWidthMeasureSpec = -1;
        this.mCurrentHeightMeasureSpec = -1;
        initWithLynxViewBuilder(c1309760kBi);
        if (LynxProfiler.isOpen()) {
            String name = getClass().getName();
            LynxProfiler.onCreate(this, C2095108Ir.LIZ(this), name, Log.getStackTraceString(new RuntimeException(name)));
        } else {
            if (!C20525082h.LIZ) {
                return;
            }
            C20525082h.LIZIZ.put(Integer.valueOf(System.identityHashCode(this)), new RuntimeException(getClass().getName()));
        }
    }

    public void com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(String str, Map<String, Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplateUrl ");
        sbLIZ.append(str);
        sbLIZ.append("with Map in");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJLIIIJJI(str, new C1309800kBm(lynxTemplateRender, str, map));
    }

    public void renderSSRUrl(String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderSSRUrl ");
        sbLIZ.append(str);
        LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJLIIIJ(str, new C1303600k1m(lynxTemplateRender, str, templateData));
    }

    public void renderTemplate(byte[] bArr, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplate with templateData in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.getClass();
        C1309920kBy c1309920kBy = new C1309920kBy();
        c1309920kBy.LIZIZ = bArr;
        c1309920kBy.LIZLLL = templateData;
        lynxTemplateRender.LJJIIZI(c1309920kBy.LIZ());
    }

    public void ssrHydrateUrl(String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ssrHydrateUrl  ");
        sbLIZ.append(str);
        sbLIZ.append(" with data in ");
        sbLIZ.append(templateData.toString());
        LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        C1310200kCQ c1310200kCQ = lynxTemplateRender.LJIIIIZZ;
        if (c1310200kCQ != null && c1310200kCQ.LIZ == EnumC1309880kBu.PENDING) {
            c1310200kCQ.getClass();
            c1310200kCQ.LIZ = EnumC1309880kBu.STARTED;
        }
        lynxTemplateRender.LJJLIIIJJI(str, new C1309800kBm(lynxTemplateRender, str, templateData));
    }

    public void updateData(Map<String, Object> map, String str) {
        checkAccessFromNonUiThread("updateData");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateData with map in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        this.mLynxTemplateRender.updateData(map, str);
    }

    public LynxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDispatchTouchEventToDev = true;
        this.mCurrentWidthMeasureSpec = -1;
        this.mCurrentHeightMeasureSpec = -1;
        if (LynxProfiler.isOpen()) {
            String name = getClass().getName();
            LynxProfiler.onCreate(this, C2095108Ir.LIZ(this), name, Log.getStackTraceString(new RuntimeException(name)));
        } else {
            if (!C20525082h.LIZ) {
                return;
            }
            C20525082h.LIZIZ.put(Integer.valueOf(System.identityHashCode(this)), new RuntimeException(getClass().getName()));
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(LynxView lynxView, String str, String str2) {
        if (((Boolean) C822560WOo.LIZ.LIZ(lynxView, str).getSecond()).booleanValue()) {
            lynxView.com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(str, str2);
        }
    }

    public void com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplateWithBaseUrl ");
        sbLIZ.append(str2);
        sbLIZ.append("with string data in");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str2;
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.getClass();
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
        templateDataLJIIIIZZ.LJ = true;
        lynxTemplateRender.LJLILLLLZI(str2);
        lynxTemplateRender.LJJLIIIJJIZ(bArr, templateDataLJIIIIZZ, str2);
        LynxLog.i("LynxTemplateRender", lynxTemplateRender.LJIIZILJ("renderTemplate"));
    }

    public void processLayoutWithTemplateBundle(TemplateBundle templateBundle, TemplateData templateData, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processLayoutWithTemplateBundle in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.LJJZZI(false);
        lynxTemplateRender.LJJLIIIJILLIZJL(templateBundle, templateData, str);
    }

    public void renderSSR(byte[] bArr, String str, Map<String, Object> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderSSR ");
        sbLIZ.append(str);
        LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.getClass();
        TemplateData templateDataLJII = TemplateData.LJII(map);
        templateDataLJII.LJ = true;
        lynxTemplateRender.LJJLIIIIJ(bArr, str, templateDataLJII);
    }

    public void renderTemplateBundle(TemplateBundle templateBundle, TemplateData templateData, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplateBundle with templateData in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        this.mLynxTemplateRender.LJJLIIIJILLIZJL(templateBundle, templateData, str);
    }

    public void ssrHydrate(byte[] bArr, String str, Map<String, Object> map) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ssrHydrate ");
        sbLIZ.append(str);
        if (map == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" with data in ");
            sbLIZ2.append(map.toString());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        C1310200kCQ c1310200kCQ = lynxTemplateRender.LJIIIIZZ;
        if (c1310200kCQ != null && c1310200kCQ.LIZ == EnumC1309880kBu.PENDING) {
            c1310200kCQ.getClass();
            c1310200kCQ.LIZ = EnumC1309880kBu.STARTED;
        }
        TemplateData templateDataLJII = TemplateData.LJII(map);
        templateDataLJII.LJ = true;
        lynxTemplateRender.LJJLIIIJJIZ(bArr, templateDataLJII, str);
        LynxLog.i("LynxTemplateRender", lynxTemplateRender.LJIIZILJ("renderTemplate"));
    }

    public void updateViewport(final int i, final int i2, final boolean z) {
        onTraceEventBegin("LynxView.updateViewport", new Callable<HashMap<String, String>>() { // from class: X.0jfa
            @Override // java.util.concurrent.Callable
            public final HashMap<String, String> call() {
                C1C7U.LIZ("LynxView@80d.updateViewport$1");
                HashMap<String, String> map = new HashMap<>();
                map.put("widthMeasureSpec", String.valueOf(i));
                map.put("heightMeasureSpec", String.valueOf(i2));
                map.put("needLayout", String.valueOf(z));
                C1C7U.LIZIZ("LynxView@80d.updateViewport$1");
                return map;
            }
        });
        this.mCurrentWidthMeasureSpec = i;
        this.mCurrentHeightMeasureSpec = i2;
        checkAccessFromNonUiThread("updateViewport");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LLD(i, i2, z);
        onTraceEventEnd("LynxView.updateViewport");
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(LynxView lynxView, String str, Map map) {
        if (((Boolean) C822560WOo.LIZ.LIZ(lynxView, str).getSecond()).booleanValue()) {
            lynxView.com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(str, (Map<String, Object>) map);
        }
    }

    public void com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, Map<String, Object> map, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplateWithBaseUrl ");
        sbLIZ.append(str);
        sbLIZ.append("with map in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str;
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.getClass();
        TemplateData templateDataLJII = TemplateData.LJII(map);
        templateDataLJII.LJ = true;
        lynxTemplateRender.LJJLIIIJJIZ(bArr, templateDataLJII, str);
        LynxLog.i("LynxTemplateRender", lynxTemplateRender.LJIIZILJ("renderTemplate"));
    }

    public void renderSSR(byte[] bArr, String str, TemplateData templateData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderSSR ");
        sbLIZ.append(str);
        LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        this.mLynxTemplateRender.LJJLIIIIJ(bArr, str, templateData);
    }

    public void ssrHydrate(byte[] bArr, String str, TemplateData templateData) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ssrHydrate ");
        sbLIZ.append(str);
        if (templateData == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" with data in ");
            sbLIZ2.append(templateData.toString());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        LynxLog.d("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mLynxTemplateRender == null) {
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        C1310200kCQ c1310200kCQ = lynxTemplateRender.LJIIIIZZ;
        if (c1310200kCQ != null && c1310200kCQ.LIZ == EnumC1309880kBu.PENDING) {
            c1310200kCQ.getClass();
            c1310200kCQ.LIZ = EnumC1309880kBu.STARTED;
        }
        lynxTemplateRender.LJJLIIIJJIZ(bArr, templateData, str);
    }

    public void com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, TemplateData templateData, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderTemplateWithBaseUrl ");
        sbLIZ.append(str);
        sbLIZ.append("with templateData in ");
        sbLIZ.append(toString());
        LynxLog.i("LynxView", C2188811AlT.LIZIZ(sbLIZ));
        this.mUrl = str;
        if (this.mLynxTemplateRender == null) {
            return;
        }
        this.mLynxTemplateRender.LJJLIIIJJIZ(bArr, templateData, str);
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(LynxView lynxView, byte[] bArr, TemplateData templateData, String str) {
        if (((Boolean) C822560WOo.LIZ.LIZ(lynxView, str).getSecond()).booleanValue()) {
            lynxView.com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(bArr, templateData, str);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(LynxView lynxView, byte[] bArr, String str, String str2) {
        if (((Boolean) C822560WOo.LIZ.LIZ(lynxView, str2).getSecond()).booleanValue()) {
            lynxView.com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(bArr, str, str2);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(LynxView lynxView, byte[] bArr, Map map, String str) {
        if (((Boolean) C822560WOo.LIZ.LIZ(lynxView, str).getSecond()).booleanValue()) {
            lynxView.com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(bArr, (Map<String, Object>) map, str);
        }
    }

    @Override // X.C1310660kDA, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1310290kCZ c1310290kCZ;
        onTraceEventBegin("LynxView.onLayout", new ACallableS0S0114000_3(this, z, i, i2, i3, i4, 0));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && !this.isInPrePainting) {
            PerformanceController performanceController = lynxTemplateRender.LJJJJI;
            if (performanceController != null) {
                performanceController.LIZ("layoutStart");
            }
            if (lynxUIRenderer() != null) {
                if (getLynxContext() != null && getLynxContext().LJIJJ()) {
                    super.onLayout(z, i, i2, i3, i4);
                }
                this.mLynxTemplateRender.LJJJ();
            } else {
                onLayoutWhenDetach();
            }
            if (z && getLynxContext() != null && (c1310290kCZ = getLynxContext().LLLIIII) != null && c1310290kCZ.LJJ) {
                C1321710kUz c1321710kUz = this.mKeyboardEvent;
                if (c1321710kUz.LIZLLL) {
                    c1321710kUz.LIZ();
                }
            }
            PerformanceController performanceController2 = this.mLynxTemplateRender.LJJJJI;
            if (performanceController2 != null) {
                performanceController2.LIZ("layoutEnd");
            }
            onTraceEventEnd("LynxView.onLayout");
            return;
        }
        onTraceEventEnd("LynxView.onLayout");
    }
}
