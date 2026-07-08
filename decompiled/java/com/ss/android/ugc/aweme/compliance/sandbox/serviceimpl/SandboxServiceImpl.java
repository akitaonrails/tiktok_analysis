package com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl;

import X.C05XM;
import X.C075S;
import X.C080U;
import X.C08MQ;
import X.C0X52;
import X.C0X58;
import X.C0X59;
import X.C0X5A;
import X.C0X5B;
import X.C0X5C;
import X.C0X5E;
import X.C0X5G;
import X.C0X5T;
import X.C0X5V;
import X.C0X5W;
import X.C0X6I;
import X.C0XMB;
import X.C1239204t4;
import X.C1276204z2;
import X.C13KM;
import X.C13LZ;
import X.C1494590ozp;
import X.C1832607Fs;
import X.C1BVM;
import X.C2097608Jq;
import X.C2113808Pw;
import X.C2188811AlT;
import X.C2202461BHw;
import X.C2241008qG;
import X.C623640Od8;
import X.C786410Ut5;
import X.C794420VEi;
import X.C799890VZj;
import X.C799900VZk;
import X.C800470Vaf;
import X.C823050WQl;
import X.C843680X7u;
import X.C844470XAv;
import X.C846900XKe;
import X.EnumC847160XLe;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import X.RunnableC586800Mzu;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.skynet.base.BaseIniter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.orbu.core.init.TTKNativeNetworkManager;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService;
import com.ss.android.ugc.aweme.compliance.sandbox.network.OrbuSandboxTTNetInterceptor;
import com.ss.android.ugc.aweme.compliance.sandbox.network.TTKOrbuSettingsTask;
import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewAjaxHooker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class SandboxServiceImpl implements ISandboxService {
    public static final AtomicReference<C1276204z2> LIZ = new AtomicReference<>(null);

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final boolean needInterceptBySandbox(Intent intent, int i) {
        return false;
    }

    public static boolean LJI() {
        int iLJ = C13LZ.LJ(((Number) C0X5W.LIZ.getValue()).intValue(), 0, 10000);
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null || strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() == 0 || i <= 0) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(':');
        sbLIZ.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        AtomicReference<C1276204z2> atomicReference = LIZ;
        C1276204z2 c1276204z2 = atomicReference.get();
        if (c1276204z2 != null && c1276204z2.LIZ == iLJ && Intrinsics.LJFF(c1276204z2.LIZIZ, strLIZIZ)) {
            return c1276204z2.LIZJ;
        }
        boolean z = !C13KM.LIZ(iLJ, strLIZIZ);
        atomicReference.set(new C1276204z2(iLJ, strLIZIZ, z));
        return z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void LIZLLL() {
        C0X6I.LIZ.getClass();
        String str = WebViewAjaxHooker.LLJ;
        long jLongValue = ((Number) C1832607Fs.LIZ.getValue()).longValue();
        if (jLongValue == -1) {
            C843680X7u.LIZ();
        } else if (((Boolean) C075S.LIZIZ.getValue()).booleanValue()) {
            RunnableC586800Mzu runnableC586800Mzu = new Runnable() { // from class: X.0Mzu
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WebViewAjaxHooker$Companion@8c2c.hook$1");
                    try {
                        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Mzv
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ2;
                                C1C7U.LIZ("WebViewAjaxHooker$Companion@8c2c.hook$1$1");
                                try {
                                    String str2 = WebViewAjaxHooker.LLJ;
                                    C843680X7u.LIZ();
                                } finally {
                                    if (!zLIZ2) {
                                    }
                                }
                                C1C7U.LIZIZ("WebViewAjaxHooker$Companion@8c2c.hook$1$1");
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WebViewAjaxHooker$Companion@8c2c.hook$1");
                }
            };
            C1239204t4.LIZ(runnableC586800Mzu, "fist_feed_show", true);
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C2113808Pw.LIZIZ.LL, new C05XM(runnableC586800Mzu));
        } else {
            C823050WQl.LJ().schedule(new Runnable() { // from class: X.0Mzw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WebViewAjaxHooker$Companion@8c2c.hook$2");
                    try {
                        String str2 = WebViewAjaxHooker.LLJ;
                        C843680X7u.LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WebViewAjaxHooker$Companion@8c2c.hook$2");
                }
            }, jLongValue, TimeUnit.MILLISECONDS);
        }
        WebViewHooker.LIZLLL(new WebViewAjaxHooker());
        WebViewHooker.LJ(new C1BVM() { // from class: com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewTTnetHook$hookWebView$1
            @Override // X.C1BVM, X.InterfaceC1548170qOF
            public final String LIZ() {
                return "WebViewTTnetHook";
            }

            @Override // X.C1BVM
            public final void LJ() {
                super.LJ();
                C623640Od8.LIZ(this.LLILZIL, R.id.nkw, C0X5G.ON_DESTROY);
            }

            @Override // X.C1BVM
            public final void LJIILIIL() {
                super.LJIILIIL();
                C623640Od8.LIZ(this.LLILZIL, R.id.nkw, C0X5G.ON_LOAD_URL);
            }

            @Override // X.C1BVM
            public final void LJIILJJIL() {
                super.LJIILJJIL();
                C623640Od8.LIZ(this.LLILZIL, R.id.nkw, C0X5G.ON_STOP_LOADING);
            }

            @Override // X.C1BVM
            public final void LJIIJJI(String str2) {
                C0X6I.LIZ.getClass();
                if (C0X6I.LIZJ(str2)) {
                    WebView webView = this.LLILZIL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C0X5C.LIZLLL(webView, str2);
                    str2 = C0X5C.LIZ(this.LLILZIL);
                    C623640Od8.LIZ(this.LLILZIL, R.id.nkw, C0X5G.ON_LOAD_URL);
                }
                super.LJIIJJI(str2);
            }

            @Override // X.C1BVM
            public final void LJIIL(String str2, Map<String, String> map) {
                C0X6I.LIZ.getClass();
                if (C0X6I.LIZJ(str2)) {
                    WebView webView = this.LLILZIL;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C0X5C.LIZLLL(webView, str2);
                    str2 = C0X5C.LIZ(this.LLILZIL);
                    C623640Od8.LIZ(this.LLILZIL, R.id.nkw, C0X5G.ON_LOAD_URL);
                }
                super.LJIIL(str2, map);
            }
        });
        WebViewHooker.LIZLLL(new C2202461BHw() { // from class: com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewTTnetHook$hookWebView$2
            @Override // X.C2202461BHw, X.InterfaceC1548170qOF
            public final String LIZ() {
                return "WebViewTTnetHook";
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:102:0x017b A[Catch: Exception -> 0x01a6, all -> 0x01bc, TryCatch #0 {Exception -> 0x01a6, blocks: (B:56:0x00c6, B:61:0x00d5, B:63:0x00db, B:65:0x00e3, B:66:0x00e7, B:68:0x00ec, B:102:0x017b, B:105:0x0186, B:107:0x018c, B:108:0x0190, B:71:0x00f6, B:74:0x0100, B:87:0x012a, B:89:0x0130, B:91:0x013e, B:92:0x0147, B:95:0x0152, B:97:0x0158, B:98:0x015c, B:77:0x010a, B:80:0x0114, B:83:0x011e, B:99:0x0172), top: B:125:0x00c6, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0128  */
            @Override // X.C2202461BHw, android.webkit.WebViewClient
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r21, android.webkit.WebResourceRequest r22) {
                /*
                    Method dump skipped, instruction units count: 496
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewTTnetHook$hookWebView$2.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
            }

            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                String string;
                Uri url;
                boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
                if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                    string = url.toString();
                } else {
                    string = null;
                }
                if (webView != null && string != null) {
                    C0X6I.LIZ.getClass();
                    if (C0X6I.LIZJ(string)) {
                        C0X5C.LJFF(webView, string, "over_load");
                        if (C0X5C.LJ(webView)) {
                            C0X58.LIZ.getClass();
                            if (((Boolean) C0X58.LJIIL.getValue()).booleanValue() && !zShouldOverrideUrlLoading) {
                                C786410Ut5.ue(webView, string);
                                return true;
                            }
                        }
                    }
                }
                return zShouldOverrideUrlLoading;
            }

            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                C0X5E c0x5eLIZ = C0X59.LIZ(webView, str2, true);
                if (c0x5eLIZ != null) {
                    c0x5eLIZ.LJ = System.currentTimeMillis();
                }
                if (c0x5eLIZ != null) {
                    c0x5eLIZ.LJI = false;
                    c0x5eLIZ.LJII = false;
                }
                try {
                    WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, str2);
                    if (webResourceResponseShouldInterceptRequest == null && webView != null && str2 != null) {
                        Uri uri = null;
                        if (C0X5C.LIZIZ(webView) == C0X5B.PLANB) {
                            C2241008qG c2241008qG = new C2241008qG();
                            c2241008qG.LIZ.put("request_url", str2);
                            String strLIZ = C0X5C.LIZ(webView);
                            if (strLIZ == null) {
                                strLIZ = "";
                            }
                            c2241008qG.LIZ.put("web_url", strLIZ);
                            C794420VEi.LIZIZ("web_ttnet_planB", "", c2241008qG.LJ());
                            if (c0x5eLIZ != null) {
                                c0x5eLIZ.LJFF = System.currentTimeMillis();
                            }
                            return null;
                        }
                        C0X5A.LIZ.getClass();
                        boolean zLIZIZ = C0X5A.LIZIZ(str2);
                        boolean zLJ = C0X5C.LJ(webView);
                        if (!zLJ && zLIZIZ) {
                            C2241008qG c2241008qG2 = new C2241008qG();
                            c2241008qG2.LIZ.put("type", str2);
                            String strLIZ2 = C0X5C.LIZ(webView);
                            if (strLIZ2 == null) {
                                strLIZ2 = "";
                            }
                            c2241008qG2.LIZ.put("error_message", strLIZ2);
                            C794420VEi.LIZIZ("ttnet_transfer_not_injected", "", c2241008qG2.LJ());
                        }
                        if (zLJ) {
                            C0X6I.LIZ.getClass();
                            if (C0X6I.LIZJ(str2)) {
                                try {
                                    uri = Uri.parse(str2);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (uri == null) {
                                    if (c0x5eLIZ != null) {
                                        c0x5eLIZ.LJFF = System.currentTimeMillis();
                                    }
                                    return webResourceResponseShouldInterceptRequest;
                                }
                                C0X6I c0x6i = C0X6I.LIZ;
                                Map mapLJ = C2097608Jq.LJ();
                                C0X5T c0x5t = C0X5T.RESOURCE_INTERCEPT;
                                c0x6i.getClass();
                                WebResourceResponse webResourceResponseLIZ = C0X6I.LJ(webView, false, "GET", uri, mapLJ, null, false, c0x5t).LIZ(C0X5C.LIZ(webView));
                                if (c0x5eLIZ != null) {
                                    c0x5eLIZ.LJFF = System.currentTimeMillis();
                                }
                                return webResourceResponseLIZ;
                            }
                        }
                        if (c0x5eLIZ != null) {
                            c0x5eLIZ.LJFF = System.currentTimeMillis();
                        }
                        return webResourceResponseShouldInterceptRequest;
                    }
                    if (c0x5eLIZ != null) {
                        c0x5eLIZ.LJFF = System.currentTimeMillis();
                    }
                    return webResourceResponseShouldInterceptRequest;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (c0x5eLIZ != null) {
                        c0x5eLIZ.LJFF = System.currentTimeMillis();
                    }
                    throw th;
                }
            }

            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str2);
                if (webView != null && str2 != null) {
                    C0X6I.LIZ.getClass();
                    if (C0X6I.LIZJ(str2)) {
                        C0X5C.LJFF(webView, str2, "over_load");
                        if (C0X5C.LJ(webView)) {
                            C0X58.LIZ.getClass();
                            if (((Boolean) C0X58.LJIIL.getValue()).booleanValue() && !zShouldOverrideUrlLoading) {
                                C786410Ut5.ue(webView, str2);
                                return true;
                            }
                        }
                    }
                }
                return zShouldOverrideUrlLoading;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final boolean LJ() {
        return TTKNativeNetworkManager.isActive();
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final InterfaceC1904907d9 LIZJ() {
        return OrbuSandboxTTNetInterceptor.LL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void LIZ(Context context) {
        if (((Number) C0X5V.LIZ.getValue()).intValue() == 1) {
            if (context == null) {
                C844470XAv.LIZ.getClass();
                context = C844470XAv.LIZ();
            }
            BaseIniter.init(context, new C08MQ() { // from class: X.0X5U
                @Override // X.C08MQ
                public final void onEvent(String str) {
                    try {
                        this.LIZ.getClass();
                        if (!SandboxServiceImpl.LJI()) {
                            AppLogNewUtils.LJFF("pns_socket_event", new JSONObject(str));
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void LIZIZ(EnumC847160XLe enumC847160XLe) {
        C846900XKe.LIZ(enumC847160XLe, "init&login");
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void LJFF(n nVar) {
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new TTKOrbuSettingsTask(nVar));
        c799890VZj.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final InterfaceC1904907d9 dataFlowIDInterceptor(final String str) {
        return new InterfaceC1904907d9() { // from class: com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl.dataFlowIDInterceptor.1
            @Override // X.InterfaceC1904907d9
            public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
                C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
                Request request = c1494590ozp.LIZJ;
                ArrayList arrayList = new ArrayList(request.getHeaders());
                arrayList.add(new C080U("x-tt-dataflow-id", str));
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ = arrayList;
                return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void appendDataFlowId(WebView webView, String str) {
        if (webView != null) {
            C800470Vaf c800470Vaf = new C800470Vaf(str);
            webView.setTag(R.id.web_client_dataflowId_flag, c800470Vaf);
            webView.setTag(R.id.web_client_dataflowId_monitor, c800470Vaf);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final Bundle appendDataFlowId(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("dataflowId", str, bundle);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void appendDataFlowId(HashMap<String, String> map, String str) {
        ISandboxService.DefaultImpls.appendDataFlowId(this, map, str);
        map.put("x-tt-dataflow-id", str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void appendDataFlowId(Intent intent, int i) {
        intent.putExtra("pns.sandbox.dataflow_id", i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService
    public final void appendDataFlowId(Intent intent, String str) {
        intent.putExtra("dataflowId", str);
    }
}
