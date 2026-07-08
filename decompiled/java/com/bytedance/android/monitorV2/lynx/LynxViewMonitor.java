package com.bytedance.android.monitorV2.lynx;

import X.C01GW;
import X.C098200Yq;
import X.C1064310dnp;
import X.C1310070kCD;
import X.C1322300kVw;
import X.C1491690ov9;
import X.C1491800ovK;
import X.C1514790pWP;
import X.C1514840pWU;
import X.C1514850pWV;
import X.C1520160pf4;
import X.C1520180pf6;
import X.C1520190pf7;
import X.C1520220pfA;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520490pfb;
import X.C1520510pfd;
import X.C1520560pfi;
import X.C1520730pfz;
import X.C1520960pgM;
import X.C1521150pgf;
import X.C1521400ph4;
import X.C1521410ph5;
import X.C1521460phA;
import X.C1521470phB;
import X.C1521530phH;
import X.C1521730phb;
import X.C1521800phi;
import X.C1521840phm;
import X.C1522110piD;
import X.C189200o6;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C824310WVh;
import X.EnumC1520250pfD;
import X.EnumC1520910pgH;
import X.EnumC1520990pgP;
import X.EnumC1521120pgc;
import X.EnumC1521240pgo;
import X.InterfaceC1182204js;
import X.InterfaceC1294060jmO;
import X.InterfaceC1520090pex;
import X.InterfaceC1521770phf;
import X.InterfaceC1521910pht;
import X.ViewOnAttachStateChangeListenerC1521210pgl;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS56S0300000_23;
import Y.ARunnableS92S0200000_23;
import Y.ARunnableS98S0000000_23;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class LynxViewMonitor implements InterfaceC1520090pex<ViewOnAttachStateChangeListenerC1521210pgl> {
    public static final C1521840phm Companion = new Object() { // from class: X.0phm
    };
    public static final LynxViewMonitor INSTANCE;
    public static final String INSTANCE_UUID_KEY;
    public static final long JVM_DIFF;
    public static final String LYNX_MONITOR_OID_KEY;
    public static final String LYNX_MONITOR_SESSION_ID_KEY;
    public static boolean isInitialized;
    public final WeakHashMap<View, ViewOnAttachStateChangeListenerC1521210pgl> viewVisits = new WeakHashMap<>();
    public final C01GW props$delegate = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(37));
    public String globalLynxLastUrl = "unknown";
    public boolean globalLynxFirstLoad = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0phm] */
    static {
        LynxViewMonitor lynxViewMonitor = C1521800phi.LIZ;
        INSTANCE = C1521800phi.LIZ;
        INSTANCE_UUID_KEY = "lynx_view_unique_id";
        LYNX_MONITOR_SESSION_ID_KEY = "navigation_id";
        LYNX_MONITOR_OID_KEY = "oid";
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        JVM_DIFF = ((jCurrentTimeMillis * j) * j) - SystemClock.elapsedRealtimeNanos();
    }

    public static final long getSystemBootTimeNS() {
        Companion.getClass();
        return SystemClock.elapsedRealtimeNanos();
    }

    private final void initIfNecessary() {
        if (isInitialized) {
            return;
        }
        C1514790pWP.LIZ.put(EnumC1520910pgH.LYNX, this);
        try {
            C1322300kVw.LIZ(InterfaceC1521770phf.class, "com.bytedance.android.monitorV2.lynx.impl.blank.LynxBlankDetectorDefault");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (EnumC1520990pgP.LynxEventReporter.isEnabled()) {
            LynxEventReporter.addObserver(new InterfaceC1182204js() { // from class: X.0pgx
                @Override // X.InterfaceC1182204js
                public final void onReportEvent(String str, int i, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) throws JSONException {
                    ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pglFindById;
                    if (str.hashCode() == 637655052 && str.equals("lynxsdk_jsb_timing") && map2 != null) {
                        LynxViewMonitor.Companion.getClass();
                        Object obj = map2.get(LynxViewMonitor.INSTANCE_UUID_KEY);
                        if (obj != null && (obj instanceof Integer) && (viewOnAttachStateChangeListenerC1521210pglFindById = this.LIZ.findById((Integer) obj)) != null) {
                            C1521150pgf c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pglFindById.LLJIJIL;
                            if (c1521150pgf != null) {
                                c1521150pgf.LJIJ(map);
                            }
                            C1521150pgf c1521150pgf2 = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pglFindById.LLJIJIL;
                            if (c1521150pgf2 != null) {
                                c1521150pgf2.LJIILLIIL(map);
                            }
                        }
                    }
                }
            });
        }
        isInitialized = true;
    }

    public final C1491690ov9 getProps() {
        return (C1491690ov9) this.props$delegate.getValue();
    }

    public LynxViewMonitor() {
        initIfNecessary();
    }

    public final boolean getGlobalLynxFirstLoad() {
        return this.globalLynxFirstLoad;
    }

    public final String getGlobalLynxLastUrl() {
        return this.globalLynxLastUrl;
    }

    public EnumC1520910pgH getViewType() {
        return EnumC1520910pgH.LYNX;
    }

    public final ViewOnAttachStateChangeListenerC1521210pgl findById(Integer num) {
        if (num == null) {
            return null;
        }
        num.intValue();
        for (Object obj : this.viewVisits.keySet()) {
            if (System.identityHashCode(obj) == num.intValue()) {
                if (obj == null) {
                    return null;
                }
                return this.viewVisits.get(obj);
            }
        }
        return null;
    }

    public final HashMap<String, Object> getExtraInfo(LynxView lynxView) {
        String str;
        C1521410ph5 c1521410ph5LJII;
        Pair[] pairArr = new Pair[1];
        ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
        if (viewSession != null && (c1521410ph5LJII = viewSession.LJII()) != null) {
            str = c1521410ph5LJII.LIZIZ;
        } else {
            str = null;
        }
        pairArr[0] = new Pair("navigation_id", str);
        return C2097608Jq.LJI(pairArr);
    }

    public final C1521530phH getLynxViewConfig(LynxView lynxView) {
        C1521530phH c1521530phH;
        ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
        if (viewSession == null || (c1521530phH = viewSession.LLJILLL) == null) {
            return new C1521530phH("");
        }
        return c1521530phH;
    }

    public String getMonitorBid(View view) {
        ViewOnAttachStateChangeListenerC1521210pgl viewSession;
        T t;
        String strLJ;
        if (!(view instanceof LynxView) || (viewSession = getViewSession(view)) == null || (t = viewSession.LLJIJIL) == 0 || (strLJ = t.LJ()) == null) {
            return "";
        }
        return strLJ;
    }

    @Override // X.InterfaceC1520090pex
    public ViewOnAttachStateChangeListenerC1521210pgl getViewSession(View view) {
        ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.viewVisits.get(view);
        if (viewOnAttachStateChangeListenerC1521210pgl == null) {
            synchronized (this) {
                try {
                    viewOnAttachStateChangeListenerC1521210pgl = new ViewOnAttachStateChangeListenerC1521210pgl(view);
                    if (viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ()) {
                        T t = viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                        if (t != 0) {
                            ((C1521150pgf) t).LJIIZILJ();
                        }
                        viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL = new C1521150pgf(viewOnAttachStateChangeListenerC1521210pgl);
                        viewOnAttachStateChangeListenerC1521210pgl.LJ();
                        View view2 = viewOnAttachStateChangeListenerC1521210pgl.LL.get();
                        if (view2 != null) {
                            view2.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1521210pgl);
                        }
                    }
                    C1491690ov9 c1491690ov9LIZIZ = viewOnAttachStateChangeListenerC1521210pgl.LIZIZ();
                    if (c1491690ov9LIZIZ != null) {
                        c1491690ov9LIZIZ.LIZ(getProps().LIZ);
                    }
                    this.viewVisits.put(view, viewOnAttachStateChangeListenerC1521210pgl);
                    C1514850pWV.LIZ();
                    C1514850pWV.LIZ.add(new C1514840pWU(view));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1514850pWV.LIZ();
        return viewOnAttachStateChangeListenerC1521210pgl;
    }

    public final void handleBlankDetect(LynxView lynxView) {
        handleBlankDetect(lynxView, null);
    }

    @InterfaceC1294060jmO
    public final void isEnableBlankCheckTool(boolean z) {
        int i = C2187451AjH.LIZ;
        C1521730phb.LJI("LynxViewMonitor", "isEnableBlankCheckTool is deprecated");
    }

    public final boolean isEnableMonitor(LynxView lynxView) {
        C1521530phH c1521530phH;
        ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
        if (viewSession == null || (c1521530phH = viewSession.LLJILLL) == null || !c1521530phH.LIZIZ || !EnumC1521240pgo.monitor.isEnabled() || !EnumC1521240pgo.lynxMonitor.isEnabled()) {
            return false;
        }
        return true;
    }

    public void onHybridContextDestroyed(View view) {
        if (view instanceof LynxView) {
            remove((LynxView) view);
        }
    }

    public final void remove(LynxView lynxView) {
        this.viewVisits.remove(lynxView);
    }

    public final void setGlobalLynxFirstLoad(boolean z) {
        getProps().LIZLLL(EnumC1521120pgc.LYNX_IS_FIRST_LOAD.getKey(), Boolean.valueOf(z));
    }

    public final void setGlobalLynxLastUrl(String str) {
        getProps().LIZLLL(EnumC1521120pgc.LYNX_LAST_URL.getKey(), str);
    }

    public final void unregisterLynxViewMonitor(LynxView lynxView) {
        LynxViewClient lynxViewClient;
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("LynxViewMonitor", "unregisterLynxViewMonitor");
        ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
        if (viewSession != null && viewSession.LLJJ != null) {
            WeakReference<LynxViewClient> weakReference = viewSession.LLJJ;
            if (weakReference != null) {
                lynxViewClient = weakReference.get();
            } else {
                lynxViewClient = null;
            }
            lynxView.removeLynxViewClient(lynxViewClient);
            viewSession.LLJJ = null;
        }
    }

    public final void addTemplateState(LynxView lynxView, int i) {
        ViewOnAttachStateChangeListenerC1521210pgl viewSession;
        C1521410ph5 c1521410ph5LJII;
        if (isEnableMonitor(lynxView) && (viewSession = getViewSession((View) lynxView)) != null && (c1521410ph5LJII = viewSession.LJII()) != null) {
            c1521410ph5LJII.LJIIL = i;
        }
    }

    public final void handleBlankDetect(LynxView lynxView, InterfaceC1521910pht interfaceC1521910pht) {
        try {
            ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
            if (viewSession != null) {
                T t = viewSession.LLJIJIL;
                if (t == 0) {
                    if (viewSession.LL.get() != null && interfaceC1521910pht != null) {
                        interfaceC1521910pht.LIZIZ();
                        interfaceC1521910pht.LIZ();
                        return;
                    }
                    return;
                }
                ((C1521150pgf) t).LJIJI();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1520090pex
    public void onHybridContextAttached(String str, View view) {
        ViewOnAttachStateChangeListenerC1521210pgl viewSession;
        if ((view instanceof LynxView) && (viewSession = getViewSession(view)) != null) {
            viewSession.LIZLLL(view, str);
        }
    }

    @Override // X.InterfaceC1520090pex
    public void onReceivedCustomEvent(View view, C1520350pfN c1520350pfN) {
        if (view instanceof LynxView) {
            reportCustom((LynxView) view, c1520350pfN);
        } else {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("LynxViewMonitor", "customReport: view not match LynxView");
        }
    }

    public final void postEvent(View view, C1520560pfi c1520560pfi) {
        C1521150pgf c1521150pgf;
        ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession(view);
        if (viewSession != null && (c1521150pgf = (C1521150pgf) viewSession.LLJIJIL) != null) {
            c1521150pgf.onEventPost(c1520560pfi);
        } else {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZJ("LynxViewMonitor", "Failed to get current navigation!", new Throwable());
        }
    }

    public final void registerLynxViewMonitor(final LynxView lynxView, C1521530phH c1521530phH) {
        if (EnumC1520990pgP.LynxEventReporter.isEnabled()) {
            lynxView.putParamsForReportingEvents(C2097908Jt.LIZJ(new Pair(INSTANCE_UUID_KEY, Integer.valueOf(System.identityHashCode(lynxView)))));
        }
        initIfNecessary();
        ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
        if (viewSession != null) {
            viewSession.LLJILLL = c1521530phH;
            C1491690ov9 c1491690ov9LIZIZ = viewSession.LIZIZ();
            if (c1491690ov9LIZIZ != null) {
                c1491690ov9LIZIZ.LIZLLL(EnumC1521120pgc.VAID.getKey(), c1521530phH.LIZLLL);
            }
        }
        LynxViewClient lynxViewClient = new LynxViewClient(lynxView) { // from class: X.0pgg
            public final ViewOnAttachStateChangeListenerC1521210pgl LL;

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIIIZZ() {
                String str;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl == null || !viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ()) {
                    return;
                }
                C1315600kL8.LIZ(viewOnAttachStateChangeListenerC1521210pgl);
                C1521150pgf c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                if (c1521150pgf != null) {
                    c1521150pgf.LJIIZILJ();
                }
                View view = viewOnAttachStateChangeListenerC1521210pgl.LL.get();
                if (view != null) {
                    view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1521210pgl);
                }
                viewOnAttachStateChangeListenerC1521210pgl.LIZIZ().LIZIZ(EnumC1521260pgq.LYNX_ON_VIEW_DESTROYED, null);
                C1491690ov9 c1491690ov9LIZIZ2 = viewOnAttachStateChangeListenerC1521210pgl.LIZIZ();
                c1491690ov9LIZIZ2.getClass();
                C1491570oux c1491570oux = C1491570oux.LIZ;
                String str2 = c1491690ov9LIZIZ2.LIZ;
                c1491570oux.getClass();
                C1491570oux.LJIIZILJ(str2);
                Map<String, InterfaceC1521900phs> map = C1521590phN.LIZ.get(viewOnAttachStateChangeListenerC1521210pgl);
                if (map != null) {
                    map.clear();
                }
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
                lynxViewMonitor.setGlobalLynxFirstLoad(false);
                T t = viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                if (t == 0 || (str = t.LLILZ) == null) {
                    str = "";
                }
                lynxViewMonitor.setGlobalLynxLastUrl(str);
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIJ() {
                C1521150pgf c1521150pgf;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl == null || !viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() || (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) == null) {
                    return;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFirstScreen: ");
                sbLIZ.append(c1521150pgf.LLJJJ);
                sbLIZ.append(", view: ");
                sbLIZ.append(c1521150pgf.LJIILJJIL());
                C1521730phb.LJFF("LynxViewMonitor", C2188811AlT.LIZIZ(sbLIZ));
                c1521150pgf.LLJJJJ = true;
                c1521150pgf.LIZLLL().LIZLLL(EnumC1521260pgq.LYNX_FIRST_SCREEN_CALLED.getKey(), Boolean.TRUE);
                c1521150pgf.LLJJIJI.LJ = c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_FIRST_SCREEN, null);
                c1521150pgf.LJIL();
                c1521150pgf.LJIJJLI();
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIILJJIL() {
                String pageVersion;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl == null || !viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ()) {
                    return;
                }
                C1315600kL8.LIZ(viewOnAttachStateChangeListenerC1521210pgl);
                C1521410ph5 c1521410ph5LJII = viewOnAttachStateChangeListenerC1521210pgl.LJII();
                View view = viewOnAttachStateChangeListenerC1521210pgl.LL.get();
                if (view == null || !(view instanceof LynxView)) {
                    int i = C2187451AjH.LIZ;
                    C1521730phb.LIZIZ("MonitorViewSession", "view is null or not lynxview");
                    view = null;
                }
                LynxView lynxView2 = (LynxView) view;
                if (lynxView2 == null || (pageVersion = lynxView2.getPageVersion()) == null) {
                    pageVersion = "";
                }
                c1521410ph5LJII.LJIILIIL = pageVersion;
                C1521150pgf c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                if (c1521150pgf != null) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLoadSuccess: ");
                    sbLIZ.append(c1521150pgf.LLJJJ);
                    sbLIZ.append(", view: ");
                    sbLIZ.append(c1521150pgf.LJIILJJIL());
                    C1521730phb.LJFF("LynxViewMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    c1521150pgf.LLJJIJI.LIZIZ = c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_LOAD_SUCCESS, null);
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJJIFFI() {
                C1521150pgf c1521150pgf;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl == null || !viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() || (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) == null) {
                    return;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRuntimeReady: ");
                sbLIZ.append(c1521150pgf.LLJJJ);
                sbLIZ.append(", view: ");
                sbLIZ.append(c1521150pgf.LJIILJJIL());
                C1521730phb.LJFF("LynxViewMonitor", C2188811AlT.LIZIZ(sbLIZ));
                c1521150pgf.LLJJJIL = true;
                c1521150pgf.LIZLLL().LIZLLL(EnumC1521260pgq.LYNX_RUNTIME_READY_CALLED.getKey(), Boolean.TRUE);
                c1521150pgf.LLJJIJI.LJFF = c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_RUNTIME_READY, null);
                c1521150pgf.LJIL();
                c1521150pgf.LJIJJLI();
            }

            {
                LynxViewMonitor.Companion.getClass();
                this.LL = LynxViewMonitor.INSTANCE.getViewSession((View) lynxView);
            }

            @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
            public final void LJFF(LynxError lynxError) {
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl;
                if (lynxError != null && (viewOnAttachStateChangeListenerC1521210pgl = this.LL) != null) {
                    C1521460phA c1521460phA = new C1521460phA();
                    c1521460phA.LJI = "lynx_error";
                    c1521460phA.LJII = lynxError.LIZIZ();
                    c1521460phA.LJIIIIZZ = lynxError.LIZJ();
                    String str = viewOnAttachStateChangeListenerC1521210pgl.LJII().LIZ;
                    if (str == null || str.length() == 0) {
                        viewOnAttachStateChangeListenerC1521210pgl.LJII().LIZ = C1520640pfq.LJIIJ("url", C1520640pfq.LJIILL(c1521460phA.LJIIIIZZ));
                    }
                    View view = viewOnAttachStateChangeListenerC1521210pgl.LL.get();
                    if (view != null && (view instanceof LynxView)) {
                        LynxViewMonitor.Companion.getClass();
                        LynxViewMonitor.INSTANCE.reportError((LynxView) view, c1521460phA, C1520510pfd.LIZ("nativeError", c1521460phA));
                    }
                    int i = c1521460phA.LJII;
                    if (i == 100 || i == 103) {
                        if (viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL == 0) {
                            viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL = new C1521150pgf(viewOnAttachStateChangeListenerC1521210pgl);
                        }
                        C1521150pgf c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                        if (c1521150pgf != null) {
                            C1521490phD c1521490phD = c1521150pgf.LLJJIJIIJIL.LJI;
                            if (c1521490phD != null) {
                                c1521490phD.LIZLLL = c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_RECEIVED_ERROR, null);
                            }
                            c1521150pgf.LLJJIJIIJIL.LIZJ(1);
                            C1521220pgm c1521220pgm = c1521150pgf.LLJJIJIIJIL;
                            C1521490phD c1521490phD2 = c1521150pgf.LLJJIJI;
                            c1521220pgm.LJI = c1521490phD2;
                            if (c1521490phD2 != null) {
                                c1521490phD2.LJI = 2;
                            }
                            c1521150pgf.LIZIZ("nativeError", c1521460phA.LIZIZ());
                            c1521150pgf.LIZJ().LIZIZ();
                            c1521150pgf.LJIL();
                            c1521150pgf.LJIJJ();
                        }
                    }
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJI(Map<String, ? extends Object> map) throws JSONException {
                C1521150pgf c1521150pgf;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl != null && viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() && (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) != null) {
                    c1521150pgf.LJIILLIIL(map);
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIL(JavaOnlyMap javaOnlyMap) {
                C1521150pgf c1521150pgf;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl != null && viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() && (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) != null) {
                    c1521150pgf.LJIJ(javaOnlyMap);
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIIZILJ(String str) throws JSONException {
                boolean z;
                String str2;
                Object c098200Yq;
                String name;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl != null && viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() && str != null) {
                    boolean z2 = true;
                    viewOnAttachStateChangeListenerC1521210pgl.LLIZ = true;
                    viewOnAttachStateChangeListenerC1521210pgl.LIZIZ().LIZLLL(EnumC1521120pgc.VIEW_IS_PAGE_STARTED.getKey(), Boolean.TRUE);
                    viewOnAttachStateChangeListenerC1521210pgl.LJFF();
                    C1521590phN.LIZ(viewOnAttachStateChangeListenerC1521210pgl);
                    C1521410ph5 c1521410ph5LJII = viewOnAttachStateChangeListenerC1521210pgl.LJII();
                    if (viewOnAttachStateChangeListenerC1521210pgl.LLJJI != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1521410ph5LJII.LJIIJ = z;
                    viewOnAttachStateChangeListenerC1521210pgl.LJII().LIZ = str;
                    viewOnAttachStateChangeListenerC1521210pgl.LJII().LJ = C1196780hFU.LIZ();
                    viewOnAttachStateChangeListenerC1521210pgl.LLJJI = str;
                    if (viewOnAttachStateChangeListenerC1521210pgl.LLIZLLLIL || viewOnAttachStateChangeListenerC1521210pgl.LJII().LJIIJ) {
                        T t = viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                        if (t != 0) {
                            ((C1521150pgf) t).LJIIZILJ();
                        }
                        viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL = new C1521150pgf(viewOnAttachStateChangeListenerC1521210pgl);
                        C1521410ph5 c1521410ph5LJII2 = viewOnAttachStateChangeListenerC1521210pgl.LJII();
                        T t2 = viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                        if (t2 != 0) {
                            str2 = (String) t2.LLILLJJLI.getValue();
                        } else {
                            str2 = null;
                        }
                        c1521410ph5LJII2.LIZIZ = str2;
                    }
                    T t3 = viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                    if (t3 != 0) {
                        t3.LJIIJJI(viewOnAttachStateChangeListenerC1521210pgl.LJII().LJIIJ);
                    }
                    final C1521150pgf c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                    if (c1521150pgf != null) {
                        c1521150pgf.LJII();
                        long jLIZIZ = c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_SHOW_START, null);
                        LynxView lynxViewLJIILJJIL = c1521150pgf.LJIILJJIL();
                        if (lynxViewLJIILJJIL != null) {
                            c1521150pgf.LJIIIZ(c1521150pgf.LLJJI.LLJILLL.LIZ);
                            c1521150pgf.LJIIL(str);
                            LynxView lynxViewLJIILJJIL2 = c1521150pgf.LJIILJJIL();
                            if (lynxViewLJIILJJIL2 != null) {
                                LynxViewMonitor.Companion.getClass();
                                lynxViewLJIILJJIL2.putParamsForReportingEvents(C2097908Jt.LIZJ(new Pair(LynxViewMonitor.LYNX_MONITOR_SESSION_ID_KEY, c1521150pgf.LJIILL())));
                            }
                            c1521150pgf.LLJJIJIIJIL.LJI = c1521150pgf.LLJJIJI;
                            String templateUrl = lynxViewLJIILJJIL.getTemplateUrl();
                            c1521150pgf.LLJJJ = templateUrl;
                            c1521150pgf.LIZLLL().LIZLLL(EnumC1521260pgq.LYNX_TEMPLATE_URL.getKey(), templateUrl);
                            C1521490phD c1521490phD = c1521150pgf.LLJJIJI;
                            c1521490phD.LIZ = jLIZIZ;
                            c1521490phD.LIZJ = jLIZIZ;
                            c1521490phD.LJI = 1;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                C12868051u.LJI(jSONObject, "invoke_ts", Long.valueOf(System.currentTimeMillis()));
                                View view = c1521150pgf.LLJJI.LL.get();
                                if (view != null) {
                                    name = view.getClass().getName();
                                } else {
                                    int i = C2187451AjH.LIZ;
                                    C1521730phb.LIZIZ("MonitorViewSession", "view is null or not lynxview");
                                    name = null;
                                }
                                C12868051u.LJI(jSONObject, "native_view", name);
                                C1522170piJ<C1520560pfi> c1522170piJLIZJ = c1521150pgf.LIZJ();
                                C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("navigationStart", new C1520160pf4("navigationStart", jSONObject));
                                C1521090pgZ c1521090pgZ = c1520220pfALIZ.LJFF;
                                c1521090pgZ.LIZ = str;
                                c1521090pgZ.LIZJ = "lynx";
                                c1522170piJLIZJ.LIZ(c1520220pfALIZ);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1520960pgM.LIZIZ(th);
                            }
                            C1521410ph5 c1521410ph5LJII3 = c1521150pgf.LLJJI.LJII();
                            C2119208Ry.LIZ(c1521150pgf.LJIILL(), "engine_type", c1521410ph5LJII3.LIZJ);
                            C2119208Ry.LIZ(c1521150pgf.LJIILL(), "lynx_version", c1521410ph5LJII3.LJIILJJIL);
                            String strLJIILL = c1521150pgf.LJIILL();
                            String str3 = c1521410ph5LJII3.LIZ;
                            Object obj = "";
                            if (str3 == null) {
                                str3 = "";
                            }
                            C2119208Ry.LIZ(strLJIILL, "url", str3);
                            String strLJIILL2 = c1521150pgf.LJIILL();
                            try {
                                C1491690ov9 c1491690ov9LIZLLL = c1521150pgf.LIZLLL();
                                String key = EnumC1521110pgb.CONTAINER_NAME.getKey();
                                InterfaceC1491630ov3 interfaceC1491630ov3 = new InterfaceC1491630ov3() { // from class: X.0phV
                                    @Override // X.InterfaceC1491630ov3
                                    public final void onReceiveValue(Object obj2) {
                                        String str4;
                                        AbstractC1521100pga abstractC1521100pga = c1521150pgf;
                                        if (!(obj2 instanceof String) || (str4 = (String) obj2) == null) {
                                            str4 = "";
                                        }
                                        abstractC1521100pga.LLILZIL = str4;
                                    }
                                };
                                c1491690ov9LIZLLL.getClass();
                                C1491570oux c1491570oux = C1491570oux.LIZ;
                                String str4 = c1491690ov9LIZLLL.LIZ;
                                String strLJFF = c1491690ov9LIZLLL.LJFF(key);
                                c1491570oux.getClass();
                                C1491570oux.LJIIJ(str4, strLJFF, true, interfaceC1491630ov3);
                                c098200Yq = c1521150pgf.LLILZIL;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                obj = c098200Yq;
                            }
                            C2119208Ry.LIZ(strLJIILL2, "container_name", (String) obj);
                            C2119208Ry.LIZIZ(c1521150pgf.LJIILL(), "url_load", null, null);
                            C2119208Ry.LIZIZ(c1521150pgf.LJIILL(), "page_start", null, null);
                        }
                    }
                    View view2 = viewOnAttachStateChangeListenerC1521210pgl.LL.get();
                    if (view2 != null) {
                        boolean zIsAttachedToWindow = view2.isAttachedToWindow();
                        viewOnAttachStateChangeListenerC1521210pgl.LLJ = zIsAttachedToWindow;
                        viewOnAttachStateChangeListenerC1521210pgl.LIZIZ().LIZLLL(EnumC1521120pgc.VIEW_IS_ATTACHED_ON_PAGE_STARTED.getKey(), Boolean.valueOf(zIsAttachedToWindow));
                        if (view2.getVisibility() != 0) {
                            z2 = false;
                        }
                        viewOnAttachStateChangeListenerC1521210pgl.LLJI = z2;
                        viewOnAttachStateChangeListenerC1521210pgl.LIZIZ().LIZLLL(EnumC1521120pgc.VIEW_IS_VISIBLE_ON_PAGE_STARTED.getKey(), Boolean.valueOf(z2));
                        C1315600kL8.LIZ(viewOnAttachStateChangeListenerC1521210pgl);
                        C824310WVh.LIZ(new ARunnableS123S0100000_23(view2, 228));
                    }
                    viewOnAttachStateChangeListenerC1521210pgl.LLJILJIL = viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL;
                    viewOnAttachStateChangeListenerC1521210pgl.LJ();
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJJI(Set<String> set) {
                C1521150pgf c1521150pgf;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl != null && viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() && (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) != null && c1521150pgf.LLJJI.LLJILLL.LJ == C00BV.DEFAULT) {
                    if (c1521150pgf.LLJJLIIIJLLLLLLLZ) {
                        int i = C2187451AjH.LIZ;
                        C1521730phb.LJI("LynxViewMonitor", "Blank detection is started");
                    } else {
                        C2119208Ry.LIZIZ(c1521150pgf.LJIILL(), "blank_check", null, null);
                        c1521150pgf.LLJJLIIIJLLLLLLLZ = true;
                        c1521150pgf.LIZLLL().LIZLLL(EnumC1521260pgq.LYNX_BLANK_DETECTION_STARTED.getKey(), Boolean.TRUE);
                        c1521150pgf.LJIJI();
                    }
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void onTimingSetup(Map<String, Object> map) {
                C1521150pgf c1521150pgf;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl != null && viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() && (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) != null) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onTimingSetup: ");
                    sbLIZ.append(c1521150pgf.LLJJJ);
                    sbLIZ.append(", view: ");
                    sbLIZ.append(c1521150pgf.LJIILJJIL());
                    C1521730phb.LJFF("LynxViewMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    c1521150pgf.LLJJJJJIL = true;
                    C1491690ov9 c1491690ov9LIZLLL = c1521150pgf.LIZLLL();
                    String key = EnumC1521260pgq.LYNX_TIMING_SETUP_CALLED.getKey();
                    Boolean bool = Boolean.TRUE;
                    c1491690ov9LIZLLL.LIZLLL(key, bool);
                    C1315600kL8.LIZ(c1521150pgf.LLJJI);
                    C1521220pgm c1521220pgm = c1521150pgf.LLJJIJIIJIL;
                    c1521220pgm.LJIIIZ = map;
                    C1521490phD c1521490phD = c1521220pgm.LJI;
                    if (c1521490phD != null) {
                        c1521490phD.LJI = 3;
                    }
                    c1521220pgm.LIZJ(0);
                    c1521150pgf.LLJJL = true;
                    c1521150pgf.LIZLLL().LIZLLL(EnumC1521260pgq.LYNX_PERF_EVENT_LYNX_STATE_SET.getKey(), bool);
                    C1521130pgd.LIZIZ(c1521150pgf);
                    c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_SETUP, null);
                    c1521150pgf.LJIL();
                    c1521150pgf.LJIJJLI();
                    C824310WVh.LIZ(new ARunnableS92S0200000_23(c1521150pgf, map, 156));
                    EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.ENABLE_LYNX_BLANK_DOM_SCORE_DETECT;
                    if (enumC1520990pgP.isEnabled() && enumC1520990pgP.getOptions().optBoolean("detect_on_fcp", false)) {
                        C786410Ut5.LJLIIL(Math.min(Math.max(enumC1520990pgP.getOptions().optLong("detect_on_fcp_delay", 2000L), 0L), Mp4ScreenVideoLoadTimeout.CONTROL), C824310WVh.LIZ, new C0W89(new ARunnableS123S0100000_23(c1521150pgf, 227)));
                    }
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJJIIZ(String str, Map map, Map map2) {
                C1521150pgf c1521150pgf;
                Map map3;
                Object obj;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LL;
                if (viewOnAttachStateChangeListenerC1521210pgl != null && viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() && (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) != null) {
                    c1521150pgf.LLJJIJIIJIL.LJIIIZ = map;
                    c1521150pgf.LIZLLL().LIZIZ(EnumC1521260pgq.LYNX_PAGE_UPDATE, null);
                    c1521150pgf.LJIL();
                    Object obj2 = null;
                    if (map != null) {
                        obj2 = map.get("update_timings");
                    }
                    if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null && (obj = map3.get("__lynx_timing_actual_fmp")) != null) {
                        if (Intrinsics.LJFF(c1521150pgf.LLJJI.LLJILLL.LJFF, "perf_ready")) {
                            c1521150pgf.LJIJJ();
                            c1521150pgf.LIZJ().LIZIZ();
                        }
                        c1521150pgf.LIZLLL().LIZLLL("user_fmp", obj);
                    }
                    C824310WVh.LIZ(new ARunnableS92S0200000_23(c1521150pgf, map, 157));
                }
            }
        };
        lynxView.addLynxViewClient(lynxViewClient);
        lynxView.addLynxViewClientV2(new C1310070kCD(lynxView) { // from class: X.0pge
            public final ViewOnAttachStateChangeListenerC1521210pgl LIZ;

            {
                LynxViewMonitor.Companion.getClass();
                this.LIZ = LynxViewMonitor.INSTANCE.getViewSession((View) lynxView);
            }

            @Override // X.C1310070kCD, X.InterfaceC1310470kCr
            public final void onPerformanceEvent(C1310800kDO c1310800kDO) {
                C1521150pgf c1521150pgf;
                C1310840kDS c1310840kDS;
                Long lValueOf;
                ViewOnAttachStateChangeListenerC1521210pgl viewOnAttachStateChangeListenerC1521210pgl = this.LIZ;
                if (viewOnAttachStateChangeListenerC1521210pgl != null && viewOnAttachStateChangeListenerC1521210pgl.LJIIIIZZ() && (c1521150pgf = (C1521150pgf) viewOnAttachStateChangeListenerC1521210pgl.LLJIJIL) != null) {
                    if (c1310800kDO instanceof C1310710kDF) {
                        C824310WVh.LIZ(new ARunnableS92S0200000_23(c1521150pgf, c1310800kDO, 155));
                    }
                    if ((c1310800kDO instanceof C1310840kDS) && (c1310840kDS = (C1310840kDS) c1310800kDO) != null) {
                        long j = c1310840kDS.LJ;
                        if (j != 0) {
                            double dOptDouble = EnumC1520990pgP.NATIVE_PERF_MONITOR.getOptions().optDouble("lynx_memory_ewma_alpha", 0.1d);
                            if (c1521150pgf.LLJILLL != null) {
                                lValueOf = Long.valueOf((long) (((((double) 1) - dOptDouble) * r0.longValue()) + (dOptDouble * j)));
                            } else {
                                lValueOf = Long.valueOf(j);
                            }
                            c1521150pgf.LLJILLL = lValueOf;
                        }
                    }
                }
            }
        });
        if (viewSession != null) {
            viewSession.LLJJ = new WeakReference<>(lynxViewClient);
        }
    }

    public final void reportCustom(LynxView lynxView, C1520350pfN c1520350pfN) {
        C824310WVh.LIZ(new ARunnableS56S0300000_23(c1520350pfN, lynxView, this, 5));
    }

    public final void reportError(LynxView lynxView, C1521460phA c1521460phA) {
        reportError(lynxView, c1521460phA, null);
    }

    public final void reportFallbackPage(LynxView lynxView, C1522110piD c1522110piD) {
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("LynxViewMonitor", "reportFallbackPage");
        C824310WVh.LIZ(new ARunnableS98S0000000_23(lynxView, this, 7));
    }

    public final void reportJsbError(LynxView lynxView, C1521400ph4 c1521400ph4) {
        Unit unit;
        C1521150pgf c1521150pgf;
        try {
            C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("jsbError", c1521400ph4);
            boolean zNot = EnumC1521240pgo.lynxJsb.not();
            c1520220pfALIZ.LJI(zNot, EnumC1520250pfD.SWITCH_OFF);
            if (zNot) {
                return;
            }
            c1520220pfALIZ.LJFF(c1521400ph4.LJIIIZ, "jsb_error_extra");
            C824310WVh.LIZLLL(new ARunnableS56S0300000_23(this, lynxView, c1520220pfALIZ, 6));
            ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
            if (viewSession != null && (c1521150pgf = (C1521150pgf) viewSession.LLJIJIL) != null) {
                c1521150pgf.LIZIZ("jsbError", c1521400ph4.LIZIZ());
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void reportJsbFetchError(LynxView lynxView, C1064310dnp c1064310dnp) {
        T t;
        C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("fetchError", c1064310dnp);
        boolean zNot = EnumC1521240pgo.lynxFetch.not();
        c1520220pfALIZ.LJI(zNot, EnumC1520250pfD.SWITCH_OFF);
        if (zNot) {
            return;
        }
        postEvent(lynxView, c1520220pfALIZ);
        ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
        if (viewSession != null && (t = viewSession.LLJIJIL) != 0) {
            t.LIZIZ("fetchError", c1064310dnp.LIZIZ());
        }
    }

    public final void reportJsbInfo(LynxView lynxView, C1521470phB c1521470phB) {
        C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("jsbPerf", c1521470phB);
        boolean zNot = EnumC1521240pgo.lynxJsb.not();
        c1520220pfALIZ.LJI(zNot, EnumC1520250pfD.SWITCH_OFF);
        if (zNot) {
            return;
        }
        postEvent(lynxView, c1520220pfALIZ);
    }

    public final void addContext(LynxView lynxView, String str, String str2) {
        C1521410ph5 c1521410ph5LJII;
        if (isEnableMonitor(lynxView)) {
            ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession((View) lynxView);
            if (viewSession != null && (c1521410ph5LJII = viewSession.LJII()) != null) {
                c1521410ph5LJII.LIZJ(str2, str);
            }
            C1491690ov9 props = getProps();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynx_context_");
            sbLIZ.append(str);
            props.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
    }

    public final void handleNativeInfo(LynxView lynxView, String str, JSONObject jSONObject) {
        postEvent(lynxView, C1520510pfd.LIZ(str, new C1520160pf4(str, jSONObject)));
    }

    @Override // X.InterfaceC1520090pex
    public void onReceivedHybridEvent(View view, String str, JSONObject jSONObject) {
        if (view instanceof LynxView) {
            handleNativeInfo((LynxView) view, str, jSONObject);
        } else {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("LynxViewMonitor", "handleNativeInfo: view not match LynxView");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reportError(com.lynx.tasm.LynxView r7, X.C1521460phA r8, X.C1520220pfA r9) {
        /*
            r6 = this;
            java.lang.String r5 = "nativeError"
            if (r9 != 0) goto L8
            X.0pfA r9 = X.C1520510pfd.LIZ(r5, r8)
        L8:
            com.lynx.tasm.LynxEnv r0 = com.lynx.tasm.LynxEnv.inst()
            java.lang.String r2 = r0.getLynxVersion()
            r1 = 0
            java.lang.String r0 = "2"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r2, r0, r1)
            r0 = r0 ^ 1
            r4 = 301(0x12d, float:4.22E-43)
            r3 = 201(0xc9, float:2.82E-43)
            if (r0 == 0) goto L52
            int r2 = r8.LJII
            int r1 = r2 / 100
            r0 = 2
            if (r1 == r0) goto L59
            r0 = 3
            if (r1 == r0) goto L31
            r0 = 11
            if (r1 == r0) goto L59
            if (r2 == r3) goto L59
            if (r2 != r4) goto L33
        L31:
            java.lang.String r5 = "static"
        L33:
            r8.LIZ = r5
            r9.LIZ = r5
            r9.LJIILIIL = r8
            if (r7 == 0) goto L5c
            r6.postEvent(r7, r9)
            X.0pgl r0 = r6.getViewSession(r7)
            if (r0 == 0) goto L51
            T extends X.0pga r2 = r0.LLJIJIL
            if (r2 == 0) goto L51
            java.lang.String r1 = r9.LIZ
            org.json.JSONObject r0 = r8.LIZIZ()
            r2.LIZIZ(r1, r0)
        L51:
            return
        L52:
            int r0 = r8.LJII
            if (r0 == r3) goto L59
            if (r0 != r4) goto L33
            goto L31
        L59:
            java.lang.String r5 = "js_exception"
            goto L33
        L5c:
            r0 = 0
            X.C1520730pfz.LIZJ(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.lynx.LynxViewMonitor.reportError(com.lynx.tasm.LynxView, X.0phA, X.0pfA):void");
    }

    public final void reportTemplateInfo(LynxView lynxView, String str, String str2) {
        reportGeckoInfo(lynxView, str, "template", lynxView.getTemplateUrl(), str2);
    }

    @InterfaceC1294060jmO
    public final void addContext(LynxView lynxView, String str, Object obj) {
        addContext(lynxView, str, obj.toString());
    }

    @Override // X.InterfaceC1520090pex
    public void onReceivedContainerError(View view, String str, C1491800ovK c1491800ovK, C1520180pf6 c1520180pf6) {
        Object c098200Yq;
        C1520220pfA c1520220pfALIZ = C1520510pfd.LIZ("containerError", new C1520190pf7());
        c1520220pfALIZ.LJII = c1491800ovK;
        c1520220pfALIZ.LJIILJJIL = c1520180pf6.LIZ();
        try {
            if (view == null) {
                C1521410ph5 c1521410ph5 = new C1521410ph5();
                c1521410ph5.LJFF = c1520180pf6.LIZJ;
                c1521410ph5.LJIIL = 999;
                c1520220pfALIZ.LJFF = c1521410ph5;
                C1520730pfz.LIZJ(c1520220pfALIZ, null);
            } else {
                ViewOnAttachStateChangeListenerC1521210pgl viewSession = getViewSession(view);
                if (viewSession != null) {
                    c1520220pfALIZ.LJFF = viewSession.LJII();
                    c1520220pfALIZ.LJII = viewSession.LIZ();
                }
                postEvent(view, c1520220pfALIZ);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c1520220pfALIZ.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
        }
    }

    @InterfaceC1294060jmO
    public final void reportCustom(C1521530phH c1521530phH, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i) {
        C1520360pfO c1520360pfO = new C1520360pfO("performance_test");
        c1520360pfO.LIZIZ = c1521530phH.LIZ;
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJ = jSONObject2;
        c1520360pfO.LJFF = jSONObject3;
        c1520360pfO.LIZIZ(i);
        C1520730pfz.LIZJ(C1520490pfb.LIZ(c1520360pfO.LIZ()), null);
    }

    public final void reportGeckoInfo(final LynxView lynxView, final String str, final String str2, final String str3, final String str4) {
        int i = C2187451AjH.LIZ;
        C1521730phb.LJFF("LynxViewMonitor", "reportGeckoInfo");
        C824310WVh.LIZ(new Runnable() { // from class: X.0pgv
            public final void LIZ() {
                if (lynxView == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                C1520640pfq.LJIILIIL("res_status", str, jSONObject);
                C1520640pfq.LJIILIIL("res_type", str2, jSONObject);
                C1520640pfq.LJIILIIL("res_url", str3, jSONObject);
                C1520640pfq.LJIILIIL("container", "lynx", jSONObject);
                C1520640pfq.LJIILIIL("res_version", str4, jSONObject);
                LynxViewMonitor lynxViewMonitor = this;
                LynxView lynxView2 = lynxView;
                lynxViewMonitor.reportCustom(lynxView2, "bd_monitor_get_resource", lynxView2.getTemplateUrl(), jSONObject, null, null, null, 0);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LynxViewMonitor@efbe.reportGeckoInfo$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LynxViewMonitor@efbe.reportGeckoInfo$1");
            }
        });
    }

    public final void reportCustom(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        reportCustom(lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, null, jSONObject4, 0);
    }

    public final void reportCustom(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        reportCustom(lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, null, jSONObject4, i);
    }

    public final void reportCustom(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, int i) {
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        c1520360pfO.LIZ = str2;
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJ = jSONObject2;
        c1520360pfO.LJFF = jSONObject3;
        c1520360pfO.LJI = jSONObject4;
        c1520360pfO.LJII = jSONObject5;
        c1520360pfO.LIZIZ(i);
        reportCustom(lynxView, c1520360pfO.LIZ());
    }
}
