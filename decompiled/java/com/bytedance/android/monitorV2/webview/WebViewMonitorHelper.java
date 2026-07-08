package com.bytedance.android.monitorV2.webview;

import X.AbstractC1039540d9s;
import X.AbstractC1514820pWS;
import X.AbstractC1522120piE;
import X.C00IT;
import X.C089E;
import X.C1064300dno;
import X.C1322300kVw;
import X.C1491800ovK;
import X.C1514790pWP;
import X.C1520180pf6;
import X.C1520190pf7;
import X.C1520220pfA;
import X.C1520290pfH;
import X.C1520340pfM;
import X.C1520350pfN;
import X.C1520360pfO;
import X.C1520490pfb;
import X.C1520640pfq;
import X.C1520730pfz;
import X.C1520960pgM;
import X.C1521180pgi;
import X.C1521190pgj;
import X.C1521200pgk;
import X.C1521250pgp;
import X.C1521360ph0;
import X.C1521390ph3;
import X.C1521480phC;
import X.C1521520phG;
import X.C1521730phb;
import X.C1521810phj;
import X.C1521950phx;
import X.C1522110piD;
import X.C19719512Dh;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C824310WVh;
import X.EnumC1520250pfD;
import X.EnumC1520910pgH;
import X.EnumC1521120pgc;
import X.EnumC1521240pgo;
import X.EnumC1521270pgr;
import X.InterfaceC1041930dDj;
import X.InterfaceC1520090pex;
import X.InterfaceC1521760phe;
import Y.ARunnableS56S0300000_23;
import Y.ARunnableS9S1400000_23;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class WebViewMonitorHelper implements InterfaceC1041930dDj, InterfaceC1520090pex {
    public static final WebViewMonitorHelper helper = new WebViewMonitorHelper();
    public final C1521190pgj impl = C1521190pgj.LIZ;
    public final C1521950phx webViewMonitorContext = new C1521950phx();
    public boolean isMonitorEnableOldTmp = false;
    public boolean isMonitorEnable = true;
    public boolean isInitialized = false;

    public void handleFetchSuccess(WebView webView) {
    }

    public void reloadInner(WebView webView) {
    }

    @Override // X.InterfaceC1041930dDj
    public void report(WebView webView) {
    }

    public static void initialize() {
        helper.initIfNecessary();
    }

    @Override // X.InterfaceC1036480d4w
    public C1521250pgp buildConfig() {
        return new C1521250pgp();
    }

    public void initIfNecessary() {
        if (this.isInitialized) {
            return;
        }
        try {
            C1514790pWP.LIZ.put(EnumC1520910pgH.WEB, this);
            this.webViewMonitorContext.getClass();
            C1322300kVw.LIZ(InterfaceC1521760phe.class, "com.bytedance.android.monitorV2.webview.blank.WebBlankDetectorDefault");
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.isInitialized = true;
    }

    public boolean isEnable() {
        boolean z = this.isMonitorEnable && EnumC1521240pgo.monitor.isEnabled() && EnumC1521240pgo.webMonitor.isEnabled();
        if (this.isMonitorEnableOldTmp != z) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("monitor enabled: ");
            sbLIZ.append(z);
            C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
            this.isMonitorEnableOldTmp = z;
        }
        return z;
    }

    public boolean isTTWebEnable() {
        this.webViewMonitorContext.getClass();
        return this.webViewMonitorContext.LIZ && EnumC1521240pgo.webTTWebDelegate.isEnabled();
    }

    public WebViewMonitorHelper() {
        initIfNecessary();
    }

    public static InterfaceC1041930dDj getInstance() {
        return helper;
    }

    @Override // X.InterfaceC1041930dDj
    public C1521950phx getMonitorContext() {
        return this.webViewMonitorContext;
    }

    public EnumC1520910pgH getViewType() {
        return EnumC1520910pgH.WEB;
    }

    private void handleWebviewDestroy(WebView webView) {
        try {
            this.impl.getClass();
            C1521190pgj.LJIIJJI(webView);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    private boolean isIcoNativeError(WebResourceRequest webResourceRequest) {
        Uri url;
        String path;
        if (webResourceRequest != null && !webResourceRequest.isForMainFrame() && (url = webResourceRequest.getUrl()) != null && (path = url.getPath()) != null) {
            return path.endsWith("favicon.ico");
        }
        return false;
    }

    private void onAttachedToWindowInner(WebView webView) {
        try {
            if (!isEnable() || webView == null) {
                return;
            }
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView)) {
                return;
            }
            this.impl.getClass();
            C1521200pgk c1521200pgkLIZJ = C1521190pgj.LIZJ(webView);
            if (c1521200pgkLIZJ.LLJJJJ == null) {
                int i = C2187451AjH.LIZ;
                C1521730phb.LIZIZ(c1521200pgkLIZJ.LLJJIII, "handleViewCreated not work, onAttachedToWindow invoked");
                c1521200pgkLIZJ.LJIIZILJ();
                if (!c1521200pgkLIZJ.LLJJI) {
                    c1521200pgkLIZJ.LLJJI = true;
                    c1521200pgkLIZJ.LJIILL(EnumC1521270pgr.ATTACHED, c1521200pgkLIZJ.LIZIZ());
                }
            }
            c1521200pgkLIZJ.LIZIZ().LIZLLL(EnumC1521120pgc.VIEW_IS_ATTACHED_TO_WINDOW.getKey(), Boolean.TRUE);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1036480d4w
    public void addConfig(C1521250pgp c1521250pgp) {
        this.impl.getClass();
        if (c1521250pgp != null) {
            try {
                C1521250pgp c1521250pgpLIZ = C1521190pgj.LIZ(c1521250pgp);
                String[] strArr = c1521250pgpLIZ.LIZIZ;
                if (strArr != null && strArr.length != 0) {
                    C089E c089e = new C089E(strArr);
                    while (c089e.hasNext()) {
                        C1521190pgj.LIZJ.put((String) c089e.next(), c1521250pgpLIZ);
                    }
                }
                String[] strArr2 = c1521250pgpLIZ.LIZ;
                if (strArr2 != null && strArr2.length != 0) {
                    C089E c089e2 = new C089E(strArr2);
                    while (c089e2.hasNext()) {
                        C1521190pgj.LIZIZ.put((String) c089e2.next(), c1521250pgpLIZ);
                    }
                }
                C1521190pgj.LIZLLL.clear();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1520960pgM.LIZIZ(e);
            }
        }
    }

    @Override // X.InterfaceC1536290q55
    public void destroy(WebView webView) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy: ");
        sbLIZ.append(C1521730phb.LJ(webView));
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (isTTWebViewOk(webView)) {
            return;
        }
        destroyInner(webView);
    }

    public void destroyInner(WebView webView) {
        try {
            if (!isEnable()) {
                return;
            }
            handleWebviewDestroy(webView);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1041930dDj
    public HashMap<String, Object> getExtraInfo(WebView webView) {
        String str;
        C1521360ph0 c1521360ph0;
        if (webView == null) {
            return new HashMap<>();
        }
        Pair[] pairArr = new Pair[1];
        this.impl.getClass();
        C1521180pgi c1521180pgi = (C1521180pgi) C1521190pgj.LIZJ(webView).LLJIJIL;
        if (c1521180pgi != null && (c1521360ph0 = c1521180pgi.LLJJIJIL) != null) {
            str = c1521360ph0.LIZIZ;
        } else {
            str = null;
        }
        pairArr[0] = new Pair("navigation_id", str);
        return C2097608Jq.LJI(pairArr);
    }

    public String getMonitorBid(View view) {
        T t;
        String strLJ;
        this.impl.getClass();
        if (!(view instanceof WebView) || (t = C1521190pgj.LIZJ((WebView) view).LLJIJIL) == 0 || (strLJ = t.LJ()) == null) {
            return "";
        }
        return strLJ;
    }

    @Override // X.InterfaceC1520090pex
    public AbstractC1514820pWS<?> getViewSession(View view) {
        this.impl.getClass();
        if (view instanceof WebView) {
            return C1521190pgj.LIZJ((WebView) view);
        }
        return null;
    }

    @Override // X.InterfaceC1536290q55
    public void goBack(WebView webView) {
        if (isTTWebViewOk(webView)) {
            return;
        }
        goBackInner(webView);
    }

    public void goBackInner(WebView webView) {
        try {
            if (!isEnable()) {
                return;
            }
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView)) {
                return;
            }
            this.impl.getClass();
            C1521200pgk c1521200pgkLIZJ = C1521190pgj.LIZJ(webView);
            c1521200pgkLIZJ.LJIILIIL();
            c1521200pgkLIZJ.LJIILLIIL(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void handleViewCreate(WebView webView) {
        if (isTTWebViewOk(webView)) {
            return;
        }
        handleViewCreateInner(webView);
    }

    public void handleViewCreateInner(WebView webView) {
        try {
            if (!isEnable() || webView == null) {
                return;
            }
            this.impl.getClass();
            C1521190pgj.LJIIJ(webView);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    public boolean isTTWebViewOk(WebView webView) {
        this.webViewMonitorContext.getClass();
        return false;
    }

    @Override // X.InterfaceC1536290q55
    public void onAttachedToWindow(WebView webView) {
        if (isTTWebViewOk(webView)) {
            return;
        }
        onAttachedToWindowInner(webView);
    }

    public void onHybridContextDestroyed(View view) {
        this.impl.getClass();
    }

    @Override // X.InterfaceC1536290q55
    public void reload(WebView webView) {
        if (isTTWebViewOk(webView)) {
            return;
        }
        reloadInner(webView);
    }

    public void removeConfig(String... strArr) {
        this.impl.getClass();
        for (String str : strArr) {
            C19719512Dh.LIZJ(C1521190pgj.LIZIZ).remove(str);
        }
    }

    public void setEnable(boolean z) {
        this.isMonitorEnable = z;
    }

    public void setGeckoClient(AbstractC1522120piE abstractC1522120piE) {
        this.impl.getClass();
        C786410Ut5.LJLIIL(C1521190pgj.LJ, C1521190pgj.LJFF, new Runnable() { // from class: X.0phJ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("WebViewMonitor@dd75.setGeckoClient$1");
                try {
                    C1521190pgj c1521190pgj = C1521190pgj.LIZ;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("WebViewMonitor@dd75.setGeckoClient$1");
            }
        });
    }

    @Override // X.InterfaceC1041930dDj
    public void setTTWebDelegateEnable(boolean z) {
        this.webViewMonitorContext.getClass();
    }

    private void handlePageFinished(WebView webView, String str) {
        try {
            this.impl.getClass();
            C1521190pgj.LJII(webView);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    private void handlePageStart(WebView webView, C1520220pfA c1520220pfA) {
        try {
            this.impl.getClass();
            C1521190pgj.LJIIIIZZ(webView, c1520220pfA);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    private void handleProgressChanged(WebView webView, int i) {
        if (webView == null) {
            return;
        }
        try {
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView)) {
                return;
            }
            this.impl.getClass();
            C1521190pgj.LJIIIZ(webView, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1039590d9x
    public void addExtensionContext(WebView webView, AbstractC1039540d9s abstractC1039540d9s) {
        if (webView != null && isEnable()) {
            this.impl.getClass();
            if (C1521190pgj.LJFF(webView)) {
                this.impl.getClass();
                C1521200pgk c1521200pgkLIZJ = C1521190pgj.LIZJ(webView);
                if (abstractC1039540d9s.LIZ == C00IT.Navi) {
                    for (Map.Entry<String, Object> entry : abstractC1039540d9s.LIZ().entrySet()) {
                        c1521200pgkLIZJ.LJII(entry.getKey(), entry.getValue().toString());
                    }
                    return;
                }
                ((ArrayList) c1521200pgkLIZJ.LLJZ).add(abstractC1039540d9s);
            }
        }
    }

    @Override // X.InterfaceC824360WVm
    public void customReport(WebView webView, C1520350pfN c1520350pfN) {
        C1520340pfM c1520340pfMLIZ = C1520490pfb.LIZ(c1520350pfN);
        if (!isEnable()) {
            c1520340pfMLIZ.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
            return;
        }
        if (webView == null) {
            C1520730pfz.LIZJ(c1520340pfMLIZ, null);
            return;
        }
        this.impl.getClass();
        if (!C1521190pgj.LJFF(webView)) {
            c1520340pfMLIZ.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
        } else {
            this.impl.getClass();
            C1521190pgj.LIZJ(webView).LJIIIZ(c1520340pfMLIZ);
        }
    }

    public void forceReport(WebView webView, String str) {
        try {
            if (isEnable() && webView != null) {
                this.impl.getClass();
                if (C1521190pgj.LJFF(webView)) {
                    this.impl.getClass();
                    C1521200pgk c1521200pgkLIZJ = C1521190pgj.LIZJ(webView);
                    if (Intrinsics.LJFF("report_blank_detect", str)) {
                        c1521200pgkLIZJ.LJIILIIL();
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void handleFetchError(WebView webView, C1064300dno c1064300dno) {
        C1520220pfA c1520220pfA = new C1520220pfA("fetchError");
        c1520220pfA.LIZJ();
        try {
            if (!isEnable()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            if (webView == null) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
                return;
            }
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView)) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            if (!EnumC1521240pgo.webFetch.isEnabled()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            c1064300dno.LIZ(jSONObject);
            this.impl.getClass();
            C1521190pgj.LIZLLL(webView, c1520220pfA, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1521560phK
    public void handleJSBError(WebView webView, C1521520phG c1521520phG) {
        C824310WVh.LIZJ(new ARunnableS56S0300000_23(this, webView, c1521520phG, 7));
    }

    @Override // X.InterfaceC1521560phK
    public void handleJSBInfo(WebView webView, C1521480phC c1521480phC) {
        C824310WVh.LIZJ(new ARunnableS56S0300000_23(this, webView, c1521480phC, 8));
    }

    @Override // X.InterfaceC1521560phK
    public void handleJSBInfoV2(WebView webView, Map<String, Object> map) {
        C824310WVh.LIZJ(new ARunnableS56S0300000_23(this, webView, map, 9));
    }

    @Override // X.InterfaceC1521560phK
    public void handleJSBPvV2(WebView webView, Map<String, Object> map) {
        C824310WVh.LIZJ(new ARunnableS56S0300000_23(this, webView, map, 10));
    }

    @Override // X.InterfaceC1520090pex
    public void onHybridContextAttached(String str, View view) {
        if (view == null) {
            return;
        }
        this.impl.getClass();
        if (view instanceof WebView) {
            C1521190pgj.LIZJ((WebView) view).LIZLLL(view, str);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void onLoadUrl(WebView webView, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadUrl: ");
        sbLIZ.append(str);
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (isTTWebViewOk(webView)) {
            return;
        }
        onLoadUrlInner(webView, str);
    }

    public void onLoadUrlInner(WebView webView, String str) {
        try {
            if (!isEnable()) {
                return;
            }
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView) || str.contains("javascript:")) {
                return;
            }
            this.impl.getClass();
            C1521190pgj.LJI(webView, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void onPageFinished(WebView webView, String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageFinished: ");
        sbLIZ.append(str);
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (isTTWebViewOk(webView)) {
            return;
        }
        onPageFinishedInner(webView, str);
    }

    public void onPageFinishedInner(WebView webView, String str) {
        try {
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView)) {
                return;
            }
            handlePageFinished(webView, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    public void onPageStarted(WebView webView, String str) {
        if (isTTWebViewOk(webView)) {
            return;
        }
        onPageStartedInner(webView, str);
    }

    public void onPageStartedInner(WebView webView, String str) {
        C1520220pfA c1520220pfA = new C1520220pfA("navigationStart");
        try {
            c1520220pfA.LIZJ();
            if (webView == null) {
                return;
            }
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView)) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
            } else {
                c1520220pfA.LJFF.LIZ = str;
                handlePageStart(webView, c1520220pfA);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void onProgressChanged(WebView webView, int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgressChanged: ");
        sbLIZ.append(C1521730phb.LJ(webView));
        sbLIZ.append(", newProgress: ");
        sbLIZ.append(i);
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (isTTWebViewOk(webView)) {
            return;
        }
        onProgressChangedInner(webView, i);
    }

    public void onProgressChangedInner(WebView webView, int i) {
        try {
            if (!isEnable()) {
                return;
            }
            handleProgressChanged(webView, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1520090pex
    public void onReceivedCustomEvent(View view, C1520350pfN c1520350pfN) {
        if (view instanceof WebView) {
            customReport((WebView) view, c1520350pfN);
        } else {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("WebViewMonitorHelper", "customReport: view not match WebView");
        }
    }

    public void reportFallbackPage(WebView webView, C1522110piD c1522110piD) {
        try {
            isEnable();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1039590d9x
    public void addContext(WebView webView, String str, String str2) {
        if (isEnable()) {
            this.impl.getClass();
            if (C1521190pgj.LJFF(webView)) {
                this.impl.getClass();
                C1521190pgj.LIZJ(webView).LJII(str, str2);
            }
        }
    }

    @Override // X.InterfaceC1521560phK
    public void handleNativeInfo(WebView webView, String str, JSONObject jSONObject) {
        C1520220pfA c1520220pfA = new C1520220pfA(str);
        c1520220pfA.LIZJ();
        try {
            if (!isEnable()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            if (webView == null) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
                return;
            }
            this.impl.getClass();
            if (!C1521190pgj.LJFF(webView)) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
            } else {
                this.impl.getClass();
                C1521190pgj.LIZLLL(webView, c1520220pfA, jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void handleRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, C1521810phj c1521810phj) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRenderProcessGone: ");
        sbLIZ.append(C1521730phb.LJ(webView));
        sbLIZ.append(", detail: ");
        sbLIZ.append(renderProcessGoneDetail);
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (isTTWebViewOk(webView)) {
            return;
        }
        handleRenderProcessGoneInner(webView, renderProcessGoneDetail, c1521810phj);
    }

    public void handleRenderProcessGoneInner(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, C1521810phj c1521810phj) {
        C1520220pfA c1520220pfA = new C1520220pfA("nativeError");
        c1520220pfA.LIZJ();
        try {
            if (!isEnable()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            if (webView != null && renderProcessGoneDetail != null && !TextUtils.isEmpty(webView.getUrl())) {
                this.impl.getClass();
                if (!C1521190pgj.LJFF(webView)) {
                    c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                    return;
                }
                this.impl.getClass();
                C1521190pgj.LJ(webView, renderProcessGoneDetail, c1521810phj);
                String strLIZIZ = "";
                if (Build.VERSION.SDK_INT >= 26) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("");
                    sbLIZ.append("cause by ");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    if (renderProcessGoneDetail.didCrash()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ2);
                        sbLIZ2.append("crash");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ2);
                        sbLIZ3.append("system");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }
                JSONObject jSONObjectLIZJ = C1521390ph3.LIZJ(webView.getUrl(), strLIZIZ, -10000, null, null);
                this.impl.getClass();
                C1521190pgj.LIZLLL(webView, c1520220pfA, jSONObjectLIZJ);
                return;
            }
            c1520220pfA.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void handleRequestError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (isTTWebViewOk(webView)) {
            return;
        }
        handleRequestErrorInner(webView, webResourceRequest, webResourceError);
    }

    public void handleRequestErrorInner(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C1520220pfA c1520220pfA = new C1520220pfA("nativeError");
        c1520220pfA.LIZJ();
        try {
            if (!isEnable()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            if (webView != null && webResourceRequest != null && webResourceError != null) {
                if (isIcoNativeError(webResourceRequest)) {
                    c1520220pfA.onEventTerminated(EnumC1520250pfD.INVALID_CASE);
                    return;
                }
                this.impl.getClass();
                if (!C1521190pgj.LJFF(webView)) {
                    c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                    return;
                }
                String string = webResourceRequest.getUrl().toString();
                Boolean boolValueOf = Boolean.valueOf(webResourceRequest.isForMainFrame());
                JSONObject jSONObjectLIZJ = C1521390ph3.LIZJ(string, webResourceError.getDescription().toString(), Integer.valueOf(webResourceError.getErrorCode()), 0, boolValueOf);
                this.impl.getClass();
                C1521190pgj.LIZLLL(webView, c1520220pfA, jSONObjectLIZJ);
                return;
            }
            c1520220pfA.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void handleRequestHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRequestHttpError: ");
        sbLIZ.append(C1521730phb.LJ(webView));
        sbLIZ.append(", request: ");
        sbLIZ.append(webResourceRequest);
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (isTTWebViewOk(webView)) {
            return;
        }
        handleRequestHttpErrorInner(webView, webResourceRequest, webResourceResponse);
    }

    public void handleRequestHttpErrorInner(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        C1520220pfA c1520220pfA = new C1520220pfA("nativeError");
        c1520220pfA.LIZJ();
        try {
            if (!isEnable()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            if (webView != null && webResourceRequest != null && webResourceResponse != null) {
                if (isIcoNativeError(webResourceRequest)) {
                    c1520220pfA.onEventTerminated(EnumC1520250pfD.INVALID_CASE);
                    return;
                }
                this.impl.getClass();
                if (!C1521190pgj.LJFF(webView)) {
                    c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                    return;
                }
                JSONObject jSONObjectLIZJ = C1521390ph3.LIZJ(webResourceRequest.getUrl().toString(), webResourceResponse.getReasonPhrase(), 0, Integer.valueOf(webResourceResponse.getStatusCode()), Boolean.valueOf(webResourceRequest.isForMainFrame()));
                this.impl.getClass();
                C1521190pgj.LIZLLL(webView, c1520220pfA, jSONObjectLIZJ);
                return;
            }
            c1520220pfA.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1536290q55
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        onPageStarted(webView, str);
    }

    @Override // X.InterfaceC1520090pex
    public void onReceivedHybridEvent(View view, String str, JSONObject jSONObject) {
        if (view instanceof WebView) {
            handleNativeInfo((WebView) view, str, jSONObject);
        } else {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("WebViewMonitorHelper", "handleNativeInfo: view not match WebView");
        }
    }

    public void reportEvent(WebView webView, String str, int i) {
        try {
            if (isEnable() && webView != null) {
                this.impl.getClass();
                if (C1521190pgj.LJFF(webView)) {
                    this.impl.getClass();
                    C1521200pgk c1521200pgkLIZJ = C1521190pgj.LIZJ(webView);
                    if (str != null) {
                        c1521200pgkLIZJ.LLJJJJJIL.put(str, Integer.valueOf(i));
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    public void addContext(WebView webView, String str, Object obj) {
        addContext(webView, str, String.valueOf(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    @Override // X.InterfaceC1521560phK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handlePiaInfo(android.webkit.WebView r6, java.lang.String r7, org.json.JSONObject r8, org.json.JSONObject r9) {
        /*
            r5 = this;
            X.0pfO r4 = new X.0pfO     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "pia_"
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            r1.append(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L61
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L61
            r4.LIZLLL = r8     // Catch: java.lang.Throwable -> L61
            r4.LJ = r9     // Catch: java.lang.Throwable -> L61
            r3 = 0
            r4.LJFF = r3     // Catch: java.lang.Throwable -> L61
            r4.LJII = r3     // Catch: java.lang.Throwable -> L61
            r2 = 0
            r4.LIZIZ(r2)     // Catch: java.lang.Throwable -> L61
            X.0bx5 r0 = X.EnumC993170bx5.Tea     // Catch: java.lang.Throwable -> L61
            r4.LJIIJJI = r0     // Catch: java.lang.Throwable -> L61
            X.0pfN r0 = r4.LIZ()     // Catch: java.lang.Throwable -> L61
            X.0pfM r1 = new X.0pfM     // Catch: java.lang.Throwable -> L61
            r1.<init>()     // Catch: java.lang.Throwable -> L61
            r1.LJIILIIL = r0     // Catch: java.lang.Throwable -> L61
            r1.LIZJ()     // Catch: java.lang.Throwable -> L61
            boolean r0 = r5.isEnable()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L45
            X.0pgj r0 = r5.impl     // Catch: java.lang.Throwable -> L61
            r0.getClass()     // Catch: java.lang.Throwable -> L61
            boolean r0 = X.C1521190pgj.LJFF(r6)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L46
        L45:
            r2 = 1
        L46:
            X.0pfD r0 = X.EnumC1520250pfD.SWITCH_OFF     // Catch: java.lang.Throwable -> L61
            r1.LJI(r2, r0)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L4e
            return
        L4e:
            if (r6 != 0) goto L54
            X.C1520730pfz.LIZJ(r1, r3)     // Catch: java.lang.Throwable -> L61
            return
        L54:
            X.0pgj r0 = r5.impl     // Catch: java.lang.Throwable -> L61
            r0.getClass()     // Catch: java.lang.Throwable -> L61
            X.0pgk r0 = X.C1521190pgj.LIZJ(r6)     // Catch: java.lang.Throwable -> L61
            r0.LJIIIZ(r1)     // Catch: java.lang.Throwable -> L61
            return
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1520960pgM.LIZIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.WebViewMonitorHelper.handlePiaInfo(android.webkit.WebView, java.lang.String, org.json.JSONObject, org.json.JSONObject):void");
    }

    public void handleRequestError(WebView webView, int i, String str, String str2) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRequestError: ");
        sbLIZ.append(C1521730phb.LJ(webView));
        sbLIZ.append(", errorCode: ");
        sbLIZ.append(i);
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (isTTWebViewOk(webView)) {
            return;
        }
        handleRequestErrorInner(webView, i, str, str2);
    }

    public void handleRequestErrorInner(WebView webView, int i, String str, String str2) {
        C1520220pfA c1520220pfA = new C1520220pfA("nativeError");
        c1520220pfA.LIZJ();
        try {
            if (!isEnable()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
            } else {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.PARAM_EXCEPTION);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1520090pex
    public void onReceivedContainerError(View view, String str, C1491800ovK c1491800ovK, C1520180pf6 c1520180pf6) {
        C1520220pfA c1520220pfA = new C1520220pfA("containerError");
        c1520220pfA.LIZJ();
        try {
            if (!isEnable()) {
                c1520220pfA.onEventTerminated(EnumC1520250pfD.SWITCH_OFF);
                return;
            }
            if (view != null) {
                if (view instanceof WebView) {
                    c1520220pfA.LJIILJJIL = c1520180pf6.LIZ();
                    this.impl.getClass();
                    C1521190pgj.LIZLLL((WebView) view, c1520220pfA, null);
                    return;
                }
                return;
            }
            c1520220pfA.LJII = c1491800ovK;
            c1520220pfA.LJIILJJIL = c1520180pf6.LIZ();
            C1521360ph0 c1521360ph0 = new C1521360ph0();
            c1521360ph0.LJFF = c1520180pf6.LIZJ;
            c1521360ph0.LIZJ = "web";
            C1520290pfH.LIZ(null, c1521360ph0);
            c1520220pfA.LJFF = c1521360ph0;
            c1520220pfA.LJIILIIL = new C1520190pf7();
            C1520730pfz.LIZJ(c1520220pfA, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1520220pfA.onEventTerminated(EnumC1520250pfD.CATCH_EXCEPTION);
            C1520960pgM.LIZIZ(th);
        }
    }

    public void reportGeckoInfo(WebView webView, String str, String str2, String str3) {
        reportGeckoInfo(webView, str, str2, str3, CardStruct.IStatusCode.DEFAULT);
    }

    public void updateJsbInfo(WebView webView, String str, Integer num, Map<String, Object> map) {
        C824310WVh.LIZJ(new ARunnableS9S1400000_23(this, str, webView, num, map, 0));
    }

    public void customReport(WebView webView, String str, String str2, String str3, String str4) {
        customReport(webView, null, null, str, str2, str3, str4);
    }

    public void reportGeckoInfo(WebView webView, String str, String str2, String str3, String str4) {
        try {
            if (isEnable() && webView != null && !TextUtils.isEmpty(str3)) {
                this.impl.getClass();
                if (!C1521190pgj.LJFF(webView)) {
                    return;
                }
                this.impl.getClass();
                C1521190pgj.LJIIL(webView, str, str2, str3, str4);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC824360WVm
    public void customReport(WebView webView, String str, String str2, String str3, String str4, String str5, String str6) {
        customReport(webView, str, str2, C1520640pfq.LJIILL(str3), C1520640pfq.LJIILL(str4), C1520640pfq.LJIILL(str5), (JSONObject) null, 0);
    }

    public void customReport(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        customReportFinal(webView, "", str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, i);
    }

    public void customReport(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        customReportFinal(null, str, str2, str3, jSONObject, jSONObject2, jSONObject3, jSONObject4, i);
    }

    private void customReportFinal(WebView webView, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("custom final: bid: ");
        sbLIZ.append(str);
        sbLIZ.append(", url: ");
        sbLIZ.append(str2);
        sbLIZ.append(", eventName: ");
        sbLIZ.append(str3);
        C1521730phb.LJFF("WebViewMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        if (i < 0 || i > 8) {
            i = 8;
        }
        C1520360pfO c1520360pfO = new C1520360pfO(str3);
        c1520360pfO.LIZIZ = str;
        c1520360pfO.LIZ = str2;
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJ = jSONObject2;
        c1520360pfO.LJFF = jSONObject3;
        c1520360pfO.LJII = jSONObject4;
        c1520360pfO.LIZIZ(i);
        customReport(webView, c1520360pfO.LIZ());
    }
}
