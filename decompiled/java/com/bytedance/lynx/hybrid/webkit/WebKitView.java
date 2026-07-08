package com.bytedance.lynx.hybrid.webkit;

import X.AbstractC1537870q7d;
import X.AbstractC1539020q9U;
import X.C01GW;
import X.C098200Yq;
import X.C1036960d5i;
import X.C1040730dBn;
import X.C1064860doi;
import X.C1161970gLL;
import X.C1324520kZW;
import X.C13LP;
import X.C1490740otc;
import X.C1520080pew;
import X.C1520360pfO;
import X.C1520970pgN;
import X.C1529870puj;
import X.C1530570pvr;
import X.C1532870pzZ;
import X.C1533710q0v;
import X.C1533950q1J;
import X.C1535630q41;
import X.C1537410q6t;
import X.C1537480q70;
import X.C1537550q77;
import X.C1538050q7v;
import X.C1538110q81;
import X.C1538200q8A;
import X.C1541480qDS;
import X.C1541490qDT;
import X.C1541710qDp;
import X.C1541810qDz;
import X.C1542210qEd;
import X.C1542620qFI;
import X.C1542640qFK;
import X.C1743710vTd;
import X.C189200o6;
import X.C1E6B;
import X.C1E6N;
import X.C1ET2;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2286671Eev;
import X.C443120HZe;
import X.C786410Ut5;
import X.C794280VDu;
import X.C821850WLv;
import X.C828420Wee;
import X.EnumC1490770otf;
import X.EnumC1520910pgH;
import X.EnumC1537220q6a;
import X.EnumC1542040qEM;
import X.EnumC993170bx5;
import X.InterfaceC1038890d8p;
import X.InterfaceC1047700dN2;
import X.InterfaceC1059260dfg;
import X.InterfaceC1105930esx;
import X.InterfaceC1338650kwJ;
import X.InterfaceC1531560pxS;
import X.InterfaceC1536300q56;
import X.InterfaceC1537460q6y;
import X.InterfaceC1538820q9A;
import X.InterfaceC1539090q9b;
import X.InterfaceC1540940qCa;
import X.InterfaceC1541510qDV;
import X.InterfaceC1541560qDa;
import X.InterfaceC1541790qDx;
import X.InterfaceC1541800qDy;
import X.InterfaceC1541990qEH;
import X.InterfaceC1543050qFz;
import X.InterfaceC1544420qIC;
import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebRouterService;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class WebKitView extends C1ET2 implements InterfaceC1541990qEH, InterfaceC1338650kwJ, InterfaceC1544420qIC {
    public C1537480q70 LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public C1541480qDS LLIZLLLIL;
    public IResourceServiceX LLJ;
    public Function0<? extends IResourceServiceX> LLJI;
    public InterfaceC1536300q56 LLJIJIL;
    public AbstractC1537870q7d LLJILJIL;
    public C1537550q77 LLJILJILJ;
    public InterfaceC1538820q9A LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final boolean LLJJIII;
    public final C443120HZe<Boolean, Boolean, Boolean> LLJJIJI;
    public C1538200q8A LLJJIJIIJIL;
    public volatile boolean LLJJIJIL;
    public InterfaceC1541510qDV LLJJJ;
    public final C1324520kZW LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final int LLJL;
    public final long LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public long LLJLLL;
    public InterfaceC1038890d8p LLJZ;
    public InterfaceC1541790qDx LLJZIJLIL;
    public InterfaceC1541560qDa LLL;
    public Integer LLLF;
    public Boolean LLLFF;
    public boolean LLLFFI;

    @Override // X.InterfaceC1541990qEH
    public final void LJIJJLI() {
    }

    public final void LJLLILLLL() {
        InterfaceC1059260dfg interfaceC1059260dfgLJIIIIZZ;
        this.LLJJJJ = true;
        InterfaceC1541510qDV interfaceC1541510qDV = this.LLJJJ;
        if (interfaceC1541510qDV == null || (interfaceC1059260dfgLJIIIIZZ = interfaceC1541510qDV.LJIIIIZZ()) == null) {
            return;
        }
        C1541480qDS c1541480qDS = this.LLIZLLLIL;
        interfaceC1059260dfgLJIIIIZZ.LIZIZ(this, c1541480qDS != null ? c1541480qDS.LJIIIIZZ() : null);
    }

    @Override // X.InterfaceC1541990qEH
    public final void V0(String str) {
    }

    @Override // X.InterfaceC1541990qEH
    public final void a1() {
    }

    @Override // X.InterfaceC1541990qEH
    public final void b1(Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC1541990qEH
    public final void c1(String str, Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC1541990qEH
    public final void d1(String str) {
    }

    @Override // X.InterfaceC1541990qEH
    public final View e1() {
        return this;
    }

    @Override // X.InterfaceC1541990qEH
    public final void f1(SparkSchemaParam sparkSchemaParam) {
    }

    @Override // X.InterfaceC1541990qEH
    public Object getAndRemoveForestResponse() {
        return null;
    }

    @Override // X.InterfaceC1541990qEH
    public final void updateData(Map<String, ? extends Object> map) {
    }

    public final boolean LJLLJ() {
        InterfaceC1541560qDa interfaceC1541560qDa = this.LLL;
        if (interfaceC1541560qDa != null) {
            try {
                return interfaceC1541560qDa.LIZ();
            } catch (C1541810qDz e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLL;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickInTimeInterval:");
        sbLIZ.append(jCurrentTimeMillis);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
        long j = this.LLJLLL;
        if (j <= 0) {
            j = this.LLJLIL;
        }
        return jCurrentTimeMillis < j;
    }

    @Override // X.C1ET2, android.webkit.WebView
    public final boolean canGoBack() {
        if (C794280VDu.LIZ(this, "seclink")) {
            return super.canGoBack();
        }
        if (!super.canGoBack()) {
            return false;
        }
        C1064860doi.LIZ.getClass();
        return C1064860doi.LIZIZ(this);
    }

    @Override // X.InterfaceC1541990qEH
    public Map<String, Object> getGlobalProps() {
        C1541480qDS c1541480qDS = this.LLIZLLLIL;
        if (c1541480qDS != null) {
            return c1541480qDS.LJIIIIZZ();
        }
        return null;
    }

    @Override // X.C1ET2, android.webkit.WebView
    public final void goBack() {
        if (C794280VDu.LIZ(this, "seclink")) {
            WebViewMonitorHelper.getInstance().goBack(this);
            super.goBack();
            return;
        }
        C1064860doi.LIZ.getClass();
        if (C1064860doi.LIZJ(this)) {
            return;
        }
        WebViewMonitorHelper.getInstance().goBack(this);
        super.goBack();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        return c1324520kZW != null ? c1324520kZW.LJ.LJIIIIZZ(0) : super.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        return c1324520kZW != null ? c1324520kZW.LJ.LIZLLL : super.isNestedScrollingEnabled();
    }

    @Override // X.InterfaceC1541990qEH
    public final void load() {
        C1538200q8A c1538200q8A = this.LLJJIJIIJIL;
        if (c1538200q8A != null) {
            c1538200q8A.LJIILIIL = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.WEB_VIEW_LOAD_START}, Long.valueOf(System.currentTimeMillis())));
        }
        if (TextUtils.isEmpty(this.LLILZLL)) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "please set url at WebKitInitParam(url=\"\")", EnumC1490770otf.E, null, 4);
        } else {
            load(this.LLILZLL);
        }
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        if (c1324520kZW != null) {
            c1324520kZW.LJ.LJIIJJI(0);
        } else {
            super.stopNestedScroll();
        }
    }

    @Override // X.C1ET2, X.C1BVV, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WebViewMonitorHelper.getInstance().onAttachedToWindow(this);
        super.onAttachedToWindow();
    }

    @Override // X.InterfaceC1541990qEH
    public final void onHide() {
        C1743710vTd.LIZIZ(getHybridContext());
    }

    @Override // X.InterfaceC1541990qEH
    public final void onShow() {
        C1743710vTd.LIZJ(getHybridContext());
    }

    @Override // X.C1ET2, android.webkit.WebView
    public final void reload() {
        LJLLILLLL();
        AbstractC1537870q7d abstractC1537870q7d = this.LLJILJIL;
        if (abstractC1537870q7d != null) {
            String str = this.LLILZLL;
            if (str == null) {
                str = "";
            }
            abstractC1537870q7d.LJLIIL(this, str);
        }
        getHybridContext().LJJIJ(System.currentTimeMillis());
        WebViewMonitorHelper.getInstance().reload(this);
        super.reload();
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean T0() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean Z0() {
        return this.LLJJIJIL;
    }

    public final InterfaceC1538820q9A getBridgeService$hybrid_web_release() {
        return this.LLJILLL;
    }

    public final boolean getCanTouch() {
        return this.LLJLLIL;
    }

    public final String getCurrentSubTitle() {
        return this.LLJJL;
    }

    public final String getCurrentTitle() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1541990qEH
    public C1537480q70 getHybridContext() {
        return this.LLILZIL;
    }

    public final InterfaceC1541510qDV getHybridRuntime$hybrid_web_release() {
        return this.LLJJJ;
    }

    public final C1541480qDS getInitParams() {
        return this.LLIZLLLIL;
    }

    public final InterfaceC1536300q56 getNavigationServiceProtocol$hybrid_web_release() {
        return this.LLJIJIL;
    }

    public final String getRawUrl() {
        return this.LLIZ;
    }

    public final IResourceServiceX getResource$hybrid_web_release() {
        return this.LLJ;
    }

    public final Function0<IResourceServiceX> getResourceDynamic$hybrid_web_release() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1541990qEH
    public String getSchema() {
        return this.LLIZ;
    }

    public final long getTimeInterval() {
        return this.LLJLLL;
    }

    public final AbstractC1537870q7d getWebKitLifeCycle$hybrid_web_release() {
        return this.LLJILJIL;
    }

    public final String getWebUrl$hybrid_web_release() {
        return this.LLILZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ViewParent LJLLI(View view) {
        ViewParent parent = view.getParent();
        if (parent != 0 && !(parent instanceof FrameLayout) && (parent instanceof View)) {
            return LJLLI((View) parent);
        }
        return parent;
    }

    @Override // X.InterfaceC1544420qIC
    public final boolean LIZJ(WebView webView) {
        WebKitView webKitView;
        C1537480q70 hybridContext;
        InterfaceC1541510qDV interfaceC1541510qDV;
        if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null && (hybridContext = webKitView.getHybridContext()) != null && (interfaceC1541510qDV = (InterfaceC1541510qDV) hybridContext.LJFF(InterfaceC1541510qDV.class)) != null) {
            return interfaceC1541510qDV.LIZJ();
        }
        return false;
    }

    public final boolean LJLJLJ(String str) throws JSONException {
        String strName;
        String strSubstring;
        if (!this.LLJJIJI.getFirst().booleanValue() || getHybridContext().LJIIIIZZ() || !u.LJJIIJZLJL(str, "http", false)) {
            return false;
        }
        int iLJ = getHybridContext().LJ();
        if (!a0.LJJIIZI(str, "tiktok", false)) {
            String str2 = getHybridContext().containerId;
            C1520360pfO c1520360pfO = new C1520360pfO("webview_security_layer_check");
            c1520360pfO.LIZIZ = "hybridkit_default_bid";
            JSONObject jSONObject = new JSONObject();
            int iLJJIZ = a0.LJJIZ(str, '?', 0, false, 6);
            if (iLJJIZ != -1) {
                strSubstring = str.substring(0, iLJJIZ);
            } else {
                strSubstring = str;
            }
            jSONObject.put("url", strSubstring);
            jSONObject.put("dataflowId", iLJ);
            jSONObject.put("uiType", getHybridContext().uiType.name());
            c1520360pfO.LIZLLL = jSONObject;
            c1520360pfO.LJ = new JSONObject();
            c1520360pfO.LJIIJJI = EnumC993170bx5.Slardar;
            C1520080pew.LIZ(str2, c1520360pfO.LIZ());
        }
        if ((getHybridContext().uiType != EnumC1542040qEM.VIEW && !this.LLJJIJI.getThird().booleanValue()) || !this.LLJJIJI.getSecond().booleanValue()) {
            return false;
        }
        SparkSecurityWebRouterService sparkSecurityWebRouterService = (SparkSecurityWebRouterService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelHybridLoad);
        c828420Wee.LJFF.put("URL", str);
        c828420Wee.LJFF.put("dataflowId", Integer.valueOf(iLJ));
        c828420Wee.LJFF.put("container_id", getHybridContext().containerId);
        c828420Wee.LJFF.put("web_runtime", 0);
        Map<String, Object> map = c828420Wee.LJFF;
        InterfaceC1541510qDV interfaceC1541510qDV = (InterfaceC1541510qDV) getHybridContext().LJFF(InterfaceC1541510qDV.class);
        if (interfaceC1541510qDV == null || (strName = interfaceC1541510qDV.name()) == null) {
            strName = "unknown";
        }
        map.put("runtime_name", strName);
        c828420Wee.LJFF.put("web_ui_type", Integer.valueOf(getHybridContext().uiType.ordinal()));
        c828420Wee.LJFF.put("context", new WeakReference(getContext()));
        c828420Wee.LJFF.put("web_params", new LinkedHashMap());
        C821850WLv c821850WLvHandleWillWebRouterWithEvent = sparkSecurityWebRouterService.handleWillWebRouterWithEvent(c828420Wee);
        if (c821850WLvHandleWillWebRouterWithEvent == null) {
            return false;
        }
        return c821850WLvHandleWillWebRouterWithEvent.LIZ;
    }

    public final void LJLJLLL(String str) {
        int optimization;
        C1036960d5i c1036960d5iLJLIL;
        HybridSchemaParam hybridSchemaParamLIZJ;
        String strictUrl;
        if (LJLJLJ(str)) {
            return;
        }
        if (getParent() instanceof InterfaceC1105930esx) {
            optimization = ((InterfaceC1540940qCa) getParent()).getOptimization();
        } else {
            optimization = 0;
        }
        WebViewMonitorHelper.getInstance().addContext(this, "optimization_code", C1542210qEd.LIZJ(Integer.valueOf(optimization)));
        if (u.LJJIIJZLJL(str, "http", false)) {
            InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (strictUrl = hybridSchemaParamLIZJ.getStrictUrl()) != null && C1533950q1J.LJ(strictUrl)) {
                str = strictUrl;
            } else {
                AbstractC1537870q7d abstractC1537870q7d = this.LLJILJIL;
                if (abstractC1537870q7d != null && (c1036960d5iLJLIL = abstractC1537870q7d.LJLIL(this, str)) != null) {
                    str = c1036960d5iLJLIL.LIZ;
                }
            }
        }
        LJLLILLLL();
        WebViewMonitorHelper.getInstance().onLoadUrl(this, str);
        C1538200q8A c1538200q8A = this.LLJJIJIIJIL;
        if (c1538200q8A != null && c1538200q8A.LJIIIIZZ == null && c1538200q8A.LIZJ != null) {
            c1538200q8A.LJIIIIZZ = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.RENDER_START}, Long.valueOf(System.currentTimeMillis())) - c1538200q8A.LIZJ.longValue());
        }
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.PREPARE_ENGINE_LOAD_START}, Long.valueOf(System.currentTimeMillis()));
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_ENGINE_INNER}, null);
        super.loadUrl(str);
    }

    @Override // X.InterfaceC1541990qEH
    public final void LLD(final boolean z) {
        Object next;
        getHybridContext().lifecycleState = Lifecycle.State.DESTROYED;
        C1743710vTd.LIZ(getHybridContext());
        InterfaceC1539090q9b interfaceC1539090q9b = (AbstractC1539020q9U) getHybridContext().LJFF(AbstractC1539020q9U.class);
        Object obj = null;
        if (interfaceC1539090q9b != null) {
            while (true) {
                interfaceC1539090q9b.LIZ(this);
                if ((interfaceC1539090q9b instanceof InterfaceC1537460q6y) && ((next = ((InterfaceC1537460q6y) interfaceC1539090q9b).next()) == null || !(next instanceof InterfaceC1539090q9b) || (interfaceC1539090q9b = (InterfaceC1539090q9b) next) == null)) {
                    break;
                }
            }
        }
        C1541490qDT.LIZLLL.onDestroy(this);
        Object objLIZIZ = C1535630q41.LIZIZ("fix_spark_issues_when_recreate");
        if (objLIZIZ instanceof Boolean) {
            obj = objLIZIZ;
        }
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            if (!z) {
                InterfaceC1538820q9A interfaceC1538820q9A = this.LLJILLL;
                if (interfaceC1538820q9A != null) {
                    interfaceC1538820q9A.onDestroy();
                }
                AbstractC1537870q7d abstractC1537870q7d = this.LLJILJIL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.onDestroy();
                }
                AbstractC1537870q7d abstractC1537870q7d2 = this.LLJILJIL;
                if (abstractC1537870q7d2 != null) {
                    abstractC1537870q7d2.LJJZ(this);
                }
            } else {
                C786410Ut5.LJLIIL(100L, new BPEAHandler(), new Runnable() { // from class: X.0q7a
                    public final void LIZ() {
                        InterfaceC1538820q9A bridgeService$hybrid_web_release = this.LL.getBridgeService$hybrid_web_release();
                        if (bridgeService$hybrid_web_release != null) {
                            bridgeService$hybrid_web_release.onDestroy();
                        }
                        AbstractC1537870q7d webKitLifeCycle$hybrid_web_release = this.LL.getWebKitLifeCycle$hybrid_web_release();
                        if (webKitLifeCycle$hybrid_web_release != null) {
                            webKitLifeCycle$hybrid_web_release.LJJJZ();
                        }
                        AbstractC1537870q7d webKitLifeCycle$hybrid_web_release2 = this.LL.getWebKitLifeCycle$hybrid_web_release();
                        if (webKitLifeCycle$hybrid_web_release2 != null) {
                            webKitLifeCycle$hybrid_web_release2.onDestroy();
                        }
                        AbstractC1537870q7d webKitLifeCycle$hybrid_web_release3 = this.LL.getWebKitLifeCycle$hybrid_web_release();
                        if (webKitLifeCycle$hybrid_web_release3 != null) {
                            webKitLifeCycle$hybrid_web_release3.LJJZ(this.LL);
                        }
                        C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
                        C1538070q7x c1538070q7xLIZ = C1326430kcb.LIZ();
                        c1538070q7xLIZ.LIZIZ.remove(this.LL.getHybridContext().containerId);
                        C1529870puj c1529870puj = C1529870puj.LIZ;
                        String str = this.LL.getHybridContext().containerId;
                        c1529870puj.getClass();
                        C1529870puj.LJI(null, str);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("WebKitView@d279.destroy$2");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("WebKitView@d279.destroy$2");
                    }
                });
            }
        } else {
            C786410Ut5.LJLIIL(100L, new BPEAHandler(), new Runnable() { // from class: X.0q7b
                public final void LIZ() {
                    AbstractC1537870q7d webKitLifeCycle$hybrid_web_release;
                    InterfaceC1538820q9A bridgeService$hybrid_web_release = this.LL.getBridgeService$hybrid_web_release();
                    if (bridgeService$hybrid_web_release != null) {
                        bridgeService$hybrid_web_release.onDestroy();
                    }
                    if (z && (webKitLifeCycle$hybrid_web_release = this.LL.getWebKitLifeCycle$hybrid_web_release()) != null) {
                        webKitLifeCycle$hybrid_web_release.LJJJZ();
                    }
                    AbstractC1537870q7d webKitLifeCycle$hybrid_web_release2 = this.LL.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release2 != null) {
                        webKitLifeCycle$hybrid_web_release2.onDestroy();
                    }
                    AbstractC1537870q7d webKitLifeCycle$hybrid_web_release3 = this.LL.getWebKitLifeCycle$hybrid_web_release();
                    if (webKitLifeCycle$hybrid_web_release3 != null) {
                        webKitLifeCycle$hybrid_web_release3.LJJZ(this.LL);
                    }
                    C01GW<C1538070q7x> c01gw = C1538070q7x.LJ;
                    C1326430kcb.LIZ().LIZIZ.remove(this.LL.getHybridContext().containerId);
                    C1529870puj c1529870puj = C1529870puj.LIZ;
                    String str = this.LL.getHybridContext().containerId;
                    c1529870puj.getClass();
                    C1529870puj.LJI(null, str);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WebKitView@d279.destroy$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WebKitView@d279.destroy$3");
                }
            });
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        C1533710q0v.LJIILIIL(getHybridContext());
        WebViewMonitorHelper.getInstance().destroy(this);
        this.LLJJJJJIL = true;
        destroy();
    }

    @Override // X.InterfaceC1541990qEH
    public final void U0(Map<String, ? extends Object> map) {
        InterfaceC1541510qDV interfaceC1541510qDV;
        InterfaceC1059260dfg interfaceC1059260dfgLJIIIIZZ;
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1541480qDS c1541480qDS = this.LLIZLLLIL;
        if (c1541480qDS != null) {
            c1541480qDS.LIZLLL(map);
        }
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        if ((((interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null || !hybridSchemaParamLIZJ.getEnableGlobalPropsOptimization()) && !Intrinsics.LJFF(C1535630q41.LIZIZ("enable_webview_global_props_optimization"), Boolean.TRUE)) || this.LLJJJJ) && (interfaceC1541510qDV = this.LLJJJ) != null && (interfaceC1059260dfgLJIIIIZZ = interfaceC1541510qDV.LJIIIIZZ()) != null) {
            interfaceC1059260dfgLJIIIIZZ.LIZJ(this, new LinkedHashMap(map));
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void W0(Context context) {
        InterfaceC1538820q9A interfaceC1538820q9A = this.LLJILLL;
        if (interfaceC1538820q9A != null) {
            interfaceC1538820q9A.LJII(context);
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        Integer num;
        if (this.LLLFFI && (num = this.LLLF) != null && num.intValue() == 3 && Intrinsics.LJFF(this.LLLFF, Boolean.TRUE)) {
            return true;
        }
        InterfaceC1541560qDa interfaceC1541560qDa = this.LLL;
        if (interfaceC1541560qDa != null) {
            try {
                return interfaceC1541560qDa.LIZIZ(super.canScrollVertically(i));
            } catch (C1541810qDz e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.canScrollVertically(i);
    }

    @Override // X.C1ET2, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLJJLIIIJLLLLLLLZ && getWidth() > 0 && getHeight() > 0) {
            this.LLJJLIIIJLLLLLLLZ = false;
            C1530570pvr.LIZIZ(getHybridContext(), "first_draw");
        }
        super.dispatchDraw(canvas);
    }

    @Override // X.InterfaceC1541990qEH
    public final void load(String str) {
        boolean zLJFF;
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1541480qDS c1541480qDS;
        Uri uri;
        Uri uri2;
        C1537480q70 hybridContext;
        String strLJIIJJI;
        String strApplyAppendCommonParamsUrl;
        String strApplyGlobalLoadUrl;
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_PAGE_START}, null);
        this.LLIZ = str;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v != null && (strApplyGlobalLoadUrl = c1538050q7v.applyGlobalLoadUrl(str)) != null) {
            str = strApplyGlobalLoadUrl;
        }
        C1541480qDS c1541480qDS2 = this.LLIZLLLIL;
        if (c1541480qDS2 != null) {
            zLJFF = Intrinsics.LJFF(c1541480qDS2.LJIILL, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1538050q7v c1538050q7v2 = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v2 != null && (strApplyAppendCommonParamsUrl = c1538050q7v2.applyAppendCommonParamsUrl(str)) != null) {
                str = strApplyAppendCommonParamsUrl;
            }
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appendCommonParamsDuration = ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1541480qDS c1541480qDS3 = this.LLIZLLLIL;
            if (c1541480qDS3 != null) {
                uri = c1541480qDS3.LIZ;
            } else {
                uri = null;
            }
            linkedHashMap.put("last_web_url", String.valueOf(uri));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C1529870puj.LIZ.getClass();
            for (Map.Entry<String, WeakReference<InterfaceC1541990qEH>> entry : C1529870puj.LIZJ.entrySet()) {
                C1541480qDS c1541480qDS4 = ((WebKitView) entry.getValue().get()).LLIZLLLIL;
                if (c1541480qDS4 != null) {
                    uri2 = c1541480qDS4.LIZ;
                } else {
                    uri2 = null;
                }
                arrayList.add(String.valueOf(uri2));
                InterfaceC1541990qEH interfaceC1541990qEH = entry.getValue().get();
                if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null && (strLJIIJJI = hybridContext.LJIIJJI()) != null) {
                    arrayList2.add(strLJIIJJI);
                }
            }
            linkedHashMap.put("recent_web_url_list", arrayList.toString());
            linkedHashMap.put("web_instance_num", String.valueOf(arrayList.size()));
            String userAgentString = getSettings().getUserAgentString();
            InterfaceC1541510qDV interfaceC1541510qDV = this.LLJJJ;
            if (interfaceC1541510qDV != null && !interfaceC1541510qDV.LIZJ()) {
                C1541490qDT.LJI = userAgentString;
                if (userAgentString != null) {
                    C1532870pzZ.LIZ.getClass();
                    C1532870pzZ.LJ(userAgentString);
                }
            }
            linkedHashMap.put("web_ua", userAgentString);
            Npth.addTags(linkedHashMap);
            C1520970pgN c1520970pgN = C1520970pgN.LIZ;
            String strLJIJI = getHybridContext().LJIJI();
            EnumC1520910pgH enumC1520910pgH = EnumC1520910pgH.WEB;
            c1520970pgN.getClass();
            C1520970pgN.LIZIZ(strLJIJI, enumC1520910pgH, arrayList2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1490740otc.LIZIZ(C1490740otc.LIZ, String.valueOf(th.getMessage()), EnumC1490770otf.E, null, 4);
        }
        AbstractC1537870q7d abstractC1537870q7d = this.LLJILJIL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLIIL(this, str);
        }
        C1541490qDT.LIZLLL.onWebViewLoadUrl(this, str);
        this.LLILZLL = str;
        String str2 = getHybridContext().initData;
        if (str2 != null && (c1541480qDS = this.LLIZLLLIL) != null) {
            c1541480qDS.LIZLLL(C2097908Jt.LIZJ(new Pair("initData", new JSONObject(str2))));
        }
        Object tag = getTag(R.id.jtm);
        if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
            U0(C2097608Jq.LJIIJ(new Pair("usePreCreate", "1")));
        }
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        if ((interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null || !hybridSchemaParamLIZJ.getEnableGlobalPropsOptimization()) && !Intrinsics.LJFF(C1535630q41.LIZIZ("enable_webview_global_props_optimization"), Boolean.TRUE)) {
            LJLLILLLL();
        }
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_ENGINE_INNER}, null);
        C1541480qDS c1541480qDS5 = this.LLIZLLLIL;
        if (c1541480qDS5 != null) {
            InterfaceC1541800qDy interfaceC1541800qDy = (InterfaceC1541800qDy) getHybridContext().LJFF(InterfaceC1541800qDy.class);
            InterfaceC1047700dN2 interfaceC1047700dN2 = c1541480qDS5.LJIIJJI;
            if (interfaceC1047700dN2 != null) {
                C1040730dBn c1040730dBnLIZ = interfaceC1047700dN2.LIZ(new C1040730dBn(str, c1541480qDS5.LJIIJ));
                if (c1040730dBnLIZ != null) {
                    Map<String, String> map = c1040730dBnLIZ.LIZIZ;
                    if (map != null && !map.isEmpty()) {
                        if (interfaceC1541800qDy != null) {
                            LJLJL(c1040730dBnLIZ.LIZ, interfaceC1541800qDy.LIZ(), new C2286671Eev[0]);
                        } else {
                            String str3 = c1040730dBnLIZ.LIZ;
                            Map<String, String> map2 = c1040730dBnLIZ.LIZIZ;
                            C1542640qFK c1542640qFK = C1542620qFI.LIZ;
                            c1542640qFK.get().LIZ.push(new C2286671Eev[0]);
                            loadUrl(str3, map2);
                            c1542640qFK.get().LIZ.pop();
                        }
                    } else if (interfaceC1541800qDy != null) {
                        LJLJL(c1040730dBnLIZ.LIZ, interfaceC1541800qDy.LIZ(), new C2286671Eev[0]);
                    } else {
                        String str4 = c1040730dBnLIZ.LIZ;
                        C1542640qFK c1542640qFK2 = C1542620qFI.LIZ;
                        c1542640qFK2.get().LIZ.push(new C2286671Eev[0]);
                        loadUrl(str4);
                        c1542640qFK2.get().LIZ.pop();
                    }
                }
            } else if (interfaceC1541800qDy != null) {
                LJLJL(str, interfaceC1541800qDy.LIZ(), new C2286671Eev[0]);
            } else {
                loadUrl(str);
            }
        }
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_PAGE_END}, null);
    }

    @Override // X.C1ET2, android.webkit.WebView
    public final void loadUrl(String str) {
        if (C794280VDu.LIZ(this, "seclink")) {
            LJLJLLL(str);
            return;
        }
        String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(this, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        LJLJLLL(str);
    }

    @Override // X.C1ET2, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Boolean boolLIZ;
        Integer num;
        InterfaceC1541560qDa interfaceC1541560qDa = this.LLL;
        if (interfaceC1541560qDa != null) {
            try {
                interfaceC1541560qDa.onTouchEvent(motionEvent);
                return true;
            } catch (C1541810qDz e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (this.LLJLLIL) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && this.LLLFFI && (num = this.LLLF) != null && num.intValue() == 3) {
                        ViewParent viewParentLJLLI = LJLLI(this);
                        this.LLLFF = Boolean.TRUE;
                        if (viewParentLJLLI != null) {
                            viewParentLJLLI.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLILLLLZIIL;
                    C1490740otc c1490740otc = C1490740otc.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clickDuration");
                    sbLIZ.append(jCurrentTimeMillis);
                    C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, null, 6);
                    if (jCurrentTimeMillis < this.LLJL) {
                        this.LLJLL = System.currentTimeMillis();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("lastCickTime:");
                        sbLIZ2.append(this.LLJLL);
                        sbLIZ2.append("TapTimeout():");
                        sbLIZ2.append(ViewConfiguration.getTapTimeout());
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ2), null, null, 6);
                    }
                }
            } else {
                this.LLJLILLLLZIIL = System.currentTimeMillis();
                C1490740otc c1490740otc2 = C1490740otc.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("startClickTime");
                sbLIZ3.append(this.LLJLILLLLZIIL);
                C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ3), null, null, 6);
            }
            try {
                C1324520kZW c1324520kZW = this.LLJJJIL;
                if (c1324520kZW != null && (boolLIZ = c1324520kZW.LIZ(motionEvent)) != null) {
                    return boolLIZ.booleanValue();
                }
                return super.onTouchEvent(motionEvent);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return false;
    }

    public final void setBridgeService$hybrid_web_release(InterfaceC1538820q9A interfaceC1538820q9A) {
        this.LLJILLL = interfaceC1538820q9A;
    }

    public final void setCanTouch(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setCurrentSubTitle(String str) {
        this.LLJJL = str;
    }

    public final void setCurrentTitle(String str) {
        this.LLJJJJLIIL = str;
    }

    public final void setFirstDraw(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public void setHybridContext(C1537480q70 c1537480q70) {
        this.LLILZIL = c1537480q70;
    }

    public final void setHybridRuntime$hybrid_web_release(InterfaceC1541510qDV interfaceC1541510qDV) {
        this.LLJJJ = interfaceC1541510qDV;
    }

    public final void setInitParams(C1541480qDS c1541480qDS) {
        this.LLIZLLLIL = c1541480qDS;
    }

    public final void setJsBridgeOnKitViewProvided(Context context) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        InterfaceC1538820q9A interfaceC1538820q9ALIZIZ;
        InterfaceC1543050qFz interfaceC1543050qFzLJI;
        if (this.LLJILLL == null) {
            InterfaceC1541510qDV interfaceC1541510qDV = this.LLJJJ;
            if (interfaceC1541510qDV != null && (interfaceC1543050qFzLJI = interfaceC1541510qDV.LJI()) != null) {
                interfaceC1538820q9ALIZIZ = interfaceC1543050qFzLJI.LIZIZ(getHybridContext());
            } else {
                interfaceC1538820q9ALIZIZ = null;
            }
            this.LLJILLL = interfaceC1538820q9ALIZIZ;
        }
        if (!this.LLJJI && (interfaceC1538820q9A = this.LLJILLL) != null) {
            this.LLJJI = true;
            interfaceC1538820q9A.LJ();
        }
    }

    public final void setNavigationServiceProtocol$hybrid_web_release(InterfaceC1536300q56 interfaceC1536300q56) {
        this.LLJIJIL = interfaceC1536300q56;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        if (c1324520kZW != null) {
            c1324520kZW.LJ.LJIIIZ(z);
        } else {
            super.setNestedScrollingEnabled(z);
        }
    }

    public final void setRawUrl(String str) {
        this.LLIZ = str;
    }

    public final void setReadyToSendEvent$hybrid_web_release(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setResource$hybrid_web_release(IResourceServiceX iResourceServiceX) {
        this.LLJ = iResourceServiceX;
    }

    public final void setResourceDynamic$hybrid_web_release(Function0<? extends IResourceServiceX> function0) {
        this.LLJI = function0;
    }

    public final void setTimeInterval(long j) {
        this.LLJLLL = j;
    }

    public final void setWebKitLifeCycle$hybrid_web_release(AbstractC1537870q7d abstractC1537870q7d) {
        this.LLJILJIL = abstractC1537870q7d;
    }

    public final void setWebOverScrollByListener(InterfaceC1541790qDx interfaceC1541790qDx) {
        this.LLJZIJLIL = interfaceC1541790qDx;
    }

    public final void setWebScrollListener(InterfaceC1038890d8p interfaceC1038890d8p) {
        this.LLJZ = interfaceC1038890d8p;
    }

    public final void setWebUrl$hybrid_web_release(String str) {
        this.LLILZLL = str;
    }

    public final void setWebViewEventDelegate(InterfaceC1541560qDa interfaceC1541560qDa) {
        this.LLL = interfaceC1541560qDa;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        if (c1324520kZW != null) {
            return c1324520kZW.LJ.LJIIJ(i, 0);
        }
        return super.startNestedScroll(i);
    }

    public WebKitView(Context context, C1537480q70 c1537480q70) {
        Object c098200Yq;
        boolean zBooleanValue;
        Object c098200Yq2;
        HybridSchemaParam hybridSchemaParamLIZJ;
        super(context);
        this.LLILZIL = c1537480q70;
        this.LLJI = new C1541710qDp();
        try {
            Object objLIZIZ = C1535630q41.LIZIZ("disable_send_event_when_pure");
            if (objLIZIZ instanceof Boolean) {
                c098200Yq = (Boolean) objLIZIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLJJIII = zBooleanValue;
        try {
            Object objLIZIZ2 = C1535630q41.LIZIZ("enable_webview_security_layer_check");
            if (objLIZIZ2 instanceof C443120HZe) {
                c098200Yq2 = (C443120HZe) objLIZIZ2;
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C443120HZe<Boolean, Boolean, Boolean> c443120HZe = (C443120HZe) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        if (c443120HZe == null) {
            Boolean bool2 = Boolean.FALSE;
            c443120HZe = new C443120HZe<>(bool2, bool2, bool2);
        }
        this.LLJJIJI = c443120HZe;
        this.LLJJJJLIIL = "";
        this.LLJJL = "";
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = 100;
        this.LLJLIL = 500L;
        this.LLJLLIL = true;
        this.LLJLLL = 500L;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("last_web_url", getHybridContext().LJIJI());
        linkedHashMap.put("last_webview_type", "spark_web");
        Npth.addTags(linkedHashMap);
        C1520970pgN c1520970pgN = C1520970pgN.LIZ;
        String strLJIJI = getHybridContext().LJIJI();
        EnumC1520910pgH enumC1520910pgH = EnumC1520910pgH.WEB;
        c1520970pgN.getClass();
        C1520970pgN.LIZIZ(strLJIJI, enumC1520910pgH, null);
        C1541490qDT.LIZJ = true;
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getEnableScrollWebView()) {
            this.LLJJJIL = new C1324520kZW(this);
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1538110q81.LIZIZ(this, str, jSONObject);
        InterfaceC1541510qDV interfaceC1541510qDV = (InterfaceC1541510qDV) getHybridContext().LJFF(InterfaceC1541510qDV.class);
        if (interfaceC1541510qDV != null && interfaceC1541510qDV.LIZLLL()) {
            InterfaceC1538820q9A interfaceC1538820q9A2 = this.LLJILLL;
            if (interfaceC1538820q9A2 != null) {
                interfaceC1538820q9A2.sendEvent(str, jSONObject);
                return;
            }
            return;
        }
        if ((!this.LLJJIII || interfaceC1541510qDV == null || !interfaceC1541510qDV.LIZJ()) && (interfaceC1538820q9A = this.LLJILLL) != null) {
            interfaceC1538820q9A.sendEvent(str, jSONObject);
        }
    }

    public final void LJLL(String str, Map<String, String> map) {
        int optimization;
        C1036960d5i c1036960d5iLJLIL;
        HybridSchemaParam hybridSchemaParamLIZJ;
        String strictUrl;
        if (LJLJLJ(str)) {
            return;
        }
        if (getParent() instanceof InterfaceC1105930esx) {
            optimization = ((InterfaceC1540940qCa) getParent()).getOptimization();
        } else {
            optimization = 0;
        }
        WebViewMonitorHelper.getInstance().addContext(this, "optimization_code", C1542210qEd.LIZJ(Integer.valueOf(optimization)));
        if (u.LJJIIJZLJL(str, "http", false)) {
            InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (strictUrl = hybridSchemaParamLIZJ.getStrictUrl()) != null && C1533950q1J.LJ(strictUrl)) {
                str = strictUrl;
            } else {
                AbstractC1537870q7d abstractC1537870q7d = this.LLJILJIL;
                if (abstractC1537870q7d != null && (c1036960d5iLJLIL = abstractC1537870q7d.LJLIL(this, str)) != null) {
                    str = c1036960d5iLJLIL.LIZ;
                }
            }
        }
        LJLLILLLL();
        WebViewMonitorHelper.getInstance().onLoadUrl(this, str);
        C1538200q8A c1538200q8A = this.LLJJIJIIJIL;
        if (c1538200q8A != null && c1538200q8A.LJIIIIZZ == null && c1538200q8A.LIZJ != null) {
            c1538200q8A.LJIIIIZZ = Long.valueOf(C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.RENDER_START}, Long.valueOf(System.currentTimeMillis())) - c1538200q8A.LIZJ.longValue());
        }
        C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_LOAD_ENGINE_INNER}, null);
        super.loadUrl(str, map);
    }

    @Override // X.InterfaceC1541990qEH
    public final void X0(String str, List<? extends Object> list) {
        Object objLJJJLL;
        C1538110q81.LIZ(this, str, list);
        JSONObject jSONObject = null;
        if (list != null && (objLJJJLL = C13LP.LJJJLL(list)) != null && (objLJJJLL instanceof JSONObject)) {
            jSONObject = (JSONObject) objLJJJLL;
        }
        LIZ(str, jSONObject);
    }

    @Override // X.InterfaceC1541990qEH
    public final void Y0(String str, Map<String, ? extends Object> map) {
        InterfaceC1538820q9A interfaceC1538820q9A;
        C1538110q81.LIZJ(this, str, map);
        InterfaceC1541510qDV interfaceC1541510qDV = (InterfaceC1541510qDV) getHybridContext().LJFF(InterfaceC1541510qDV.class);
        if (interfaceC1541510qDV != null && interfaceC1541510qDV.LIZLLL()) {
            InterfaceC1538820q9A interfaceC1538820q9A2 = this.LLJILLL;
            if (interfaceC1538820q9A2 != null) {
                interfaceC1538820q9A2.LIZ();
                return;
            }
            return;
        }
        if ((!this.LLJJIII || interfaceC1541510qDV == null || !interfaceC1541510qDV.LIZJ()) && (interfaceC1538820q9A = this.LLJILLL) != null) {
            interfaceC1538820q9A.LIZ();
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        if (c1324520kZW != null) {
            return c1324520kZW.LJ.LIZIZ(f, f2);
        }
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // X.C1ET2, android.webkit.WebView
    public final void loadUrl(String str, Map map) {
        if (C794280VDu.LIZ(this, "seclink")) {
            LJLL(str, map);
            return;
        }
        String strOnLoadUrl = C1064860doi.LIZ.onLoadUrl(this, str);
        if (!TextUtils.isEmpty(strOnLoadUrl)) {
            str = strOnLoadUrl;
        }
        LJLL(str, map);
    }

    @Override // X.C1ET2, android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        int optimization;
        long jLongValue;
        C1036960d5i c1036960d5iLJLIL;
        HybridSchemaParam hybridSchemaParamLIZJ;
        String strictUrl;
        if (LJLJLJ(str)) {
            return;
        }
        if (getParent() instanceof InterfaceC1105930esx) {
            optimization = ((InterfaceC1540940qCa) getParent()).getOptimization();
        } else {
            optimization = 0;
        }
        WebViewMonitorHelper.getInstance().addContext(this, "optimization_code", C1542210qEd.LIZJ(Integer.valueOf(optimization)));
        if (u.LJJIIJZLJL(str, "http", false)) {
            InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
            if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (strictUrl = hybridSchemaParamLIZJ.getStrictUrl()) != null && C1533950q1J.LJ(strictUrl)) {
                str = strictUrl;
            } else {
                AbstractC1537870q7d abstractC1537870q7d = this.LLJILJIL;
                if (abstractC1537870q7d != null && (c1036960d5iLJLIL = abstractC1537870q7d.LJLIL(this, str)) != null) {
                    str = c1036960d5iLJLIL.LIZ;
                }
            }
        }
        LJLLILLLL();
        WebViewMonitorHelper.getInstance().onLoadUrl(this, str);
        C1538200q8A c1538200q8A = this.LLJJIJIIJIL;
        if (c1538200q8A != null && c1538200q8A.LJIIIIZZ == null && c1538200q8A.LIZJ != null) {
            long jLIZJ = C1530570pvr.LIZJ(getHybridContext(), new EnumC1537220q6a[]{EnumC1537220q6a.LOAD_START}, Long.valueOf(System.currentTimeMillis()));
            Long l = c1538200q8A.LIZJ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c1538200q8A.LJIIIIZZ = Long.valueOf(jLIZJ - jLongValue);
        }
        super.postUrl(str, bArr);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        if (c1324520kZW != null) {
            return c1324520kZW.LJ.LIZ(f, f2, z);
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        if (c1324520kZW != null) {
            return c1324520kZW.LJ.LIZJ(i, i2, iArr, iArr2);
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // X.C1ET2, android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1038890d8p interfaceC1038890d8p = this.LLJZ;
        if (interfaceC1038890d8p != null) {
            interfaceC1038890d8p.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        C1324520kZW c1324520kZW = this.LLJJJIL;
        if (c1324520kZW != null) {
            return c1324520kZW.LJ.LJ(i, i2, i3, i4, iArr);
        }
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // X.C1ET2, android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        Integer num;
        if (this.LLLFFI && (num = this.LLLF) != null && num.intValue() == 3 && i2 < 0) {
            ViewParent viewParentLJLLI = LJLLI(this);
            this.LLLFF = Boolean.FALSE;
            if (viewParentLJLLI != null) {
                viewParentLJLLI.requestDisallowInterceptTouchEvent(false);
            }
        }
        InterfaceC1541790qDx interfaceC1541790qDx = this.LLJZIJLIL;
        if (interfaceC1541790qDx != null) {
            interfaceC1541790qDx.LIZ(i, i2, i4, i6);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
