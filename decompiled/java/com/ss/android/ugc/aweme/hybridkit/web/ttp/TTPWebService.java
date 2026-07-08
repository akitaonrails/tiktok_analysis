package com.ss.android.ugc.aweme.hybridkit.web.ttp;

import X.C01GW;
import X.C04TD;
import X.C0X67;
import X.C0X6G;
import X.C0X6P;
import X.C0X6U;
import X.C843000X5e;
import X.C843070X5l;
import X.C843290X6h;
import X.InterfaceC843270X6f;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.bpea.net3rd.api.I3rdNetworkIdentifier;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.ttp.model.TTPContentTypeSettingBean;
import com.bytedance.lynx.hybrid.ttp.model.TTPExemptionSettingBean;
import com.bytedance.lynx.hybrid.ttp.model.TTPSettingBean;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import com.ss.android.ugc.aweme.webview.ITikTokWebService;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AwS592S0100000_13;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPWebService implements ITikTokWebService {
    public static ITikTokWebService LIZJ() {
        Object objLIZ = C04TD.LIZ(ITikTokWebService.class, false);
        if (objLIZ != null) {
            return (ITikTokWebService) objLIZ;
        }
        if (C04TD.P0 == null) {
            synchronized (ITikTokWebService.class) {
                if (C04TD.P0 == null) {
                    C04TD.P0 = new TTPWebService();
                }
            }
        }
        return C04TD.P0;
    }

    @Override // com.ss.android.ugc.aweme.webview.ITikTokWebService
    public final void LIZ() {
        C0X6U.LIZ.getClass();
        AtomicBoolean atomicBoolean = C0X6U.LIZIZ;
        if (atomicBoolean.get()) {
            return;
        }
        InterfaceC843270X6f interfaceC843270X6f = new InterfaceC843270X6f() { // from class: X.0X6E
            @Override // X.InterfaceC843270X6f
            public final void LIZ() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0X6e] */
            @Override // X.InterfaceC843270X6f
            public final C843260X6e LIZIZ() {
                return new InterfaceC843250X6d() { // from class: X.0X6e
                    @Override // X.InterfaceC843250X6d
                    public final Object LIZ(String str, Class cls) {
                        I3rdNetworkIdentifier i3rdNetworkIdentifier;
                        C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(str);
                        c1499850p8J.LIZJ = true;
                        int i = 0;
                        if (((Boolean) C0AJ4.LIZ.getValue()).booleanValue() && (i3rdNetworkIdentifier = (I3rdNetworkIdentifier) PluggableExtentionKt.pluggableSpi$default(I3rdNetworkIdentifier.class, false, false, false, 14, null)) != null && i3rdNetworkIdentifier.LIZ(str)) {
                            i = 2;
                        }
                        c1499850p8J.LJIIIIZZ(i);
                        Object objLIZ = c1499850p8J.build().retrofit.LIZ(cls);
                        if (objLIZ != null) {
                            return objLIZ;
                        }
                        throw new IllegalStateException("Failed to create service");
                    }
                };
            }

            @Override // X.InterfaceC843270X6f
            public final n LJI() {
                SparkHostApiImpl sparkHostApiImplLLIIIJ;
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi == null || (sparkHostApiImplLLIIIJ = iSparkHostApi.LLIIIJ()) == null) {
                    return null;
                }
                return sparkHostApiImplLLIIIJ.LLLI();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0X6a] */
            @Override // X.InterfaceC843270X6f
            public final C843220X6a LJIIIZ() {
                return new InterfaceC843200X5y() { // from class: X.0X6a
                    @Override // X.InterfaceC843200X5y
                    public final int LIZ() {
                        return C341940Daq.LIZ(7.0d);
                    }
                };
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0X75] */
            @Override // X.InterfaceC843270X6f
            public final C0X75 LJIIJ() {
                return new InterfaceC843110X5p() { // from class: X.0X75
                    @Override // X.InterfaceC843110X5p
                    public final JSONObject LIZJ() throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        InterfaceC1541390qDJ ttWebViewRuntimeService = TTWebViewHelper.INSTANCE.getTtWebViewRuntimeService();
                        if (ttWebViewRuntimeService != null) {
                            jSONObject.put("ttnet_native_init_code", ttWebViewRuntimeService.getTTNetNativeInitError());
                        }
                        return jSONObject;
                    }

                    @Override // X.InterfaceC843110X5p
                    public final boolean LIZIZ(WebView webView) {
                        if (C1541490qDT.LIZLLL.isTTWebViewTTNetResLoadEnable() && C1541490qDT.LIZLLL.isTTWebView(webView)) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC843110X5p
                    public final boolean isTTWebView(WebView webView) {
                        return C1541490qDT.LIZLLL.isTTWebView(webView);
                    }

                    @Override // X.InterfaceC843110X5p
                    public final void LIZ(WebView webView, C843130X5r c843130X5r) {
                        C1541490qDT.LIZLLL.addResourceEventListener(webView, new AwS592S0100000_13(c843130X5r, 102));
                    }
                };
            }

            @Override // X.InterfaceC843270X6f
            public final C843150X5t LJIIJJI() {
                C1535740q4C c1535740q4CLLILII;
                C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                String.valueOf(c2213981Bky.getAppId());
                c2213981Bky.getAppName();
                c2213981Bky.getVersionName();
                DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                C0X6U.LIZ.getClass();
                boolean zBooleanValue = ((Boolean) C0X6U.LIZJ.getValue()).booleanValue();
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                return new C843150X5t(zBooleanValue, (iSparkHostApi == null || (c1535740q4CLLILII = iSparkHostApi.LLILII()) == null || c1535740q4CLLILII.LIZIZ == null) ? false : true);
            }

            @Override // X.InterfaceC843270X6f
            public final Executor LIZJ() {
                return C823050WQl.LIZLLL();
            }

            @Override // X.InterfaceC843270X6f
            public final TTPContentTypeSettingBean LIZLLL() {
                Object c098200Yq;
                try {
                    Object objLJIIJJI = C0C59.LJ().LJIIJJI("web_response_content_type_modefify", true);
                    c098200Yq = (TTPContentTypeSettingBean) C7740030o.LIZ().getGson().LJII(objLJIIJJI instanceof String ? (String) objLJIIJJI : null, TTPContentTypeSettingBean.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                TTPContentTypeSettingBean tTPContentTypeSettingBean = new TTPContentTypeSettingBean(false, null, 3, null);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = tTPContentTypeSettingBean;
                }
                TTPContentTypeSettingBean tTPContentTypeSettingBean2 = (TTPContentTypeSettingBean) c098200Yq;
                return tTPContentTypeSettingBean2 == null ? new TTPContentTypeSettingBean(false, null, 3, null) : tTPContentTypeSettingBean2;
            }

            @Override // X.InterfaceC843270X6f
            public final TTPExemptionSettingBean LJ() {
                Object c098200Yq;
                try {
                    Object objLJIIJJI = C0C59.LJ().LJIIJJI("ttp_webview_resource_exemption", true);
                    c098200Yq = (TTPExemptionSettingBean) C7740030o.LIZ().getGson().LJII(objLJIIJJI instanceof String ? (String) objLJIIJJI : null, TTPExemptionSettingBean.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                TTPExemptionSettingBean tTPExemptionSettingBean = new TTPExemptionSettingBean(false, null, null, 7, null);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = tTPExemptionSettingBean;
                }
                TTPExemptionSettingBean tTPExemptionSettingBean2 = (TTPExemptionSettingBean) c098200Yq;
                return tTPExemptionSettingBean2 == null ? new TTPExemptionSettingBean(false, null, null, 7, null) : tTPExemptionSettingBean2;
            }

            @Override // X.InterfaceC843270X6f
            public final boolean LJII() {
                return C2268741Dr6.LIZ();
            }

            @Override // X.InterfaceC843270X6f
            public final TTPSettingBean LJIIIIZZ() {
                Object c098200Yq;
                try {
                    Object objLJIIJJI = C0C59.LJ().LJIIJJI("ttp_webview_ttnet", true);
                    c098200Yq = (TTPSettingBean) C7740030o.LIZ().getGson().LJII(objLJIIJJI instanceof String ? (String) objLJIIJJI : null, TTPSettingBean.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                TTPSettingBean tTPSettingBean = new TTPSettingBean(false, false, null, 7, null);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = tTPSettingBean;
                }
                TTPSettingBean tTPSettingBean2 = (TTPSettingBean) c098200Yq;
                return tTPSettingBean2 == null ? new TTPSettingBean(false, false, null, 7, null) : tTPSettingBean2;
            }

            @Override // X.InterfaceC843270X6f
            public final WebViewClient LJFF(WebView webView) {
                return WebViewHooker.LIZ(webView);
            }
        };
        if (C843290X6h.LJIIL.compareAndSet(false, true)) {
            C843290X6h.LIZIZ = interfaceC843270X6f;
            C843070X5l.LIZJ(6, "setTTPConfig", null, null);
        }
        C843000X5e c843000X5e = new C843000X5e();
        WebViewHooker.LIZLLL(new TTPWebViewClientExt(c843000X5e));
        WebViewHooker.LJ(new TTPWebViewProviderExt(c843000X5e));
        C0X67 c0x67 = new C0X67() { // from class: X.0X63
            @Override // X.C0X67
            public final String LIZIZ() {
                return "Spark_TTP";
            }

            @Override // X.C0X67
            public final void LIZJ() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0X67
            public final void LIZ(WebView webView, C0X6M c0x6m) {
                InterfaceC1541990qEH interfaceC1541990qEH;
                boolean z;
                int iLJ;
                String str;
                C1537480q70 hybridContext;
                if (webView instanceof InterfaceC1541990qEH) {
                    interfaceC1541990qEH = (InterfaceC1541990qEH) webView;
                } else {
                    interfaceC1541990qEH = null;
                }
                if (interfaceC1541990qEH != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
                    iLJ = hybridContext.LJ();
                    InterfaceC1541510qDV interfaceC1541510qDV = (InterfaceC1541510qDV) hybridContext.LJFF(InterfaceC1541510qDV.class);
                    if (interfaceC1541510qDV != null && interfaceC1541510qDV.LIZJ()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                    iLJ = 0;
                }
                c0x6m.LIZJ.put("x-metasec-webview-dataflow-id", String.valueOf(iLJ));
                c0x6m.LIZJ.put("x-metasec-redirect-location-enabled", "1");
                c0x6m.LIZJ.put("is_isolate", String.valueOf(z));
                if (!c0x6m.LIZJ.containsKey("x-tt-dataflow-id")) {
                    c0x6m.LIZJ.put("x-tt-dataflow-id", "671088650");
                }
                int i = C0X62.LIZ[c0x6m.LIZLLL.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        str = "unknown";
                    } else {
                        str = "ajax";
                    }
                } else {
                    str = "resourceIntercept";
                }
                String strLIZLLL = C843010X5f.LIZLLL(webView);
                SecureRandom secureRandom = C828590Wev.LIZ;
                String str2 = c0x6m.LIZ;
                c0x6m.LIZ = C828590Wev.LIZJ(str2, C828590Wev.LIZIZ(Boolean.TRUE, str2, str, "com.bytedance.hybrid.spark.security.impl.SparkTTPIntercept#interceptRequest", C2097608Jq.LJIIIIZZ(new Pair("origin_url", strLIZLLL), new Pair("x-metasec-webview-dataflow-id", String.valueOf(iLJ)))));
            }
        };
        C01GW<CopyOnWriteArrayList<C0X67>> c01gw = C0X6G.LIZJ;
        c01gw.getValue().add(c0x67);
        c01gw.getValue().add(new C0X67() { // from class: X.0X6D
            @Override // X.C0X67
            public final String LIZIZ() {
                return "legacy";
            }

            @Override // X.C0X67
            public final void LIZJ() {
            }

            @Override // X.C0X67
            public final void LIZ(WebView webView, C0X6M c0x6m) {
                SparkHostApiImpl sparkHostApiImplLJJIL;
                Map<String, String> map = c0x6m.LIZJ;
                String upperCase = c0x6m.LIZIZ.toUpperCase(Locale.US);
                int iHashCode = upperCase.hashCode();
                if (iHashCode == 79599 ? upperCase.equals("PUT") : iHashCode == 2461856 ? upperCase.equals("POST") : iHashCode == 75900968 && upperCase.equals("PATCH")) {
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null && (sparkHostApiImplLJJIL = iSparkHostApi.LJJIL()) != null && sparkHostApiImplLJJIL.LLJLLIL(1, c0x6m.LIZIZ, c0x6m.LIZ, map)) {
                        c0x6m.LJ.LIZ = true;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TTPLegacyInterceptor done. url:");
                sbLIZ.append(c0x6m.LIZ);
                C843070X5l.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ), null, null);
            }
        });
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            SparkHostApiImpl sparkHostApiImplLLIIIJ = iSparkHostApi.LLIIIJ();
            iSparkHostApi.LJJIJL(sparkHostApiImplLLIIIJ != null ? sparkHostApiImplLLIIIJ.LLLII() : 0L, new C0X6P());
        }
        atomicBoolean.set(true);
    }

    @Override // com.ss.android.ugc.aweme.webview.ITikTokWebService
    public final boolean LIZIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ttp_mode_switch", true);
    }
}
