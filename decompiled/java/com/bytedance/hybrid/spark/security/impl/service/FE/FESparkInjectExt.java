package com.bytedance.hybrid.spark.security.impl.service.FE;

import X.C098200Yq;
import X.C0X7M;
import X.C0X7P;
import X.C1537480q70;
import X.C1544770qIl;
import X.C189200o6;
import X.C2202461BHw;
import X.InterfaceC1541510qDV;
import X.InterfaceC1541990qEH;
import android.graphics.Bitmap;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class FESparkInjectExt extends C2202461BHw {
    public static Boolean LLJ;

    public FESparkInjectExt() {
        super(7);
    }

    @Override // X.C2202461BHw, X.InterfaceC1548170qOF
    public final String LIZ() {
        return "FESparkInjectExt";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Object c098200Yq;
        boolean zBooleanValue;
        WebKitView webKitView;
        C1537480q70 hybridContext;
        InterfaceC1541510qDV interfaceC1541510qDV;
        C1537480q70 hybridContext2;
        InterfaceC1541990qEH interfaceC1541990qEH;
        super.onPageStarted(webView, str, bitmap);
        Boolean bool = LLJ;
        final Integer numValueOf = null;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            try {
                JSONObject config = HybridSettings.INSTANCE.getConfig("spark_fe_inject_config");
                if (config != null) {
                    c098200Yq = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Boolean bool2 = (Boolean) c098200Yq;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                return;
            }
        }
        if (zBooleanValue && str != null) {
            if ((u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) && webView != 0) {
                if ((webView instanceof WebKitView) && (webKitView = (WebKitView) webView) != null && (hybridContext = webKitView.getHybridContext()) != null && (interfaceC1541510qDV = (InterfaceC1541510qDV) hybridContext.LJFF(InterfaceC1541510qDV.class)) != null && interfaceC1541510qDV.LIZJ()) {
                    if ((webView instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) webView) != null) {
                        hybridContext2 = interfaceC1541990qEH.getHybridContext();
                    } else {
                        hybridContext2 = null;
                    }
                    if ((hybridContext2 instanceof SparkContext) && hybridContext2 != null) {
                        numValueOf = Integer.valueOf(hybridContext2.LJ());
                    }
                    C1544770qIl.LIZ(webView, new C0X7P() { // from class: X.0X7q
                        @Override // X.AbstractC1544900qIy
                        public final void LJIIJJI(Object obj) {
                        }

                        /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
                        /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
                        @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.String LJFF(android.net.Uri r8, android.webkit.WebView r9) throws org.json.JSONException {
                            /*
                                r7 = this;
                                org.json.JSONObject r4 = new org.json.JSONObject
                                r4.<init>()
                                android.content.Context r2 = r9.getContext()
                                java.lang.Integer r6 = r1
                                int r1 = android.os.Build.VERSION.SDK_INT
                                r0 = 31
                                r3 = 1
                                if (r1 < r0) goto L24
                                com.bytedance.i18n.location.api.LocationClient r1 = X.C1798550wu5.LIZIZ
                                boolean r0 = r1.isInitialized()
                                if (r0 == 0) goto L24
                                int r0 = r1.LJIIIZ(r2)
                                if (r0 == 0) goto L24
                                r0 = 1
                            L21:
                                if (r0 == 0) goto L38
                                goto L26
                            L24:
                                r0 = 0
                                goto L21
                            L26:
                                X.0C64 r5 = X.C0C64.LJIILLIIL()     // Catch: java.lang.Exception -> L3a
                                java.lang.String r2 = "webview_fe_gps_control"
                                java.lang.Class<com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp$WebviewFeGpsControlModel> r1 = com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp.WebviewFeGpsControlModel.class
                                com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp$WebviewFeGpsControlModel r0 = com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp.LIZ     // Catch: java.lang.Exception -> L3a
                                java.lang.Object r1 = r5.LJJII(r1, r0, r2, r3)     // Catch: java.lang.Exception -> L3a
                                com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp$WebviewFeGpsControlModel r1 = (com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp.WebviewFeGpsControlModel) r1     // Catch: java.lang.Exception -> L3a
                                goto L40
                            L38:
                                r3 = 0
                                goto L5e
                            L3a:
                                r0 = move-exception
                                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp$WebviewFeGpsControlModel r1 = com.bytedance.hybrid.spark.security.impl.service.location.WebviewFeGpsControlExp.LIZ
                            L40:
                                if (r1 == 0) goto L6a
                                boolean r0 = r1.enable
                                if (r0 == 0) goto L6a
                                java.util.List<java.lang.Integer> r0 = r1.enableDfids
                                if (r0 == 0) goto L68
                                boolean r0 = r0.isEmpty()
                                if (r0 != 0) goto L68
                                r0 = 0
                            L51:
                                if (r0 != 0) goto L5b
                                java.util.List<java.lang.Integer> r0 = r1.enableDfids
                                boolean r0 = X.C13LP.LJJJJ(r6, r0)
                                if (r0 == 0) goto L6a
                            L5b:
                                r0 = 1
                            L5c:
                                if (r0 == 0) goto L38
                            L5e:
                                java.lang.String r0 = "allowLocation"
                                r4.put(r0, r3)
                                java.lang.String r0 = X.C786410Ut5.J3(r4)
                                return r0
                            L68:
                                r0 = 1
                                goto L51
                            L6a:
                                r0 = 0
                                goto L5c
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C843640X7q.LJFF(android.net.Uri, android.webkit.WebView):java.lang.String");
                        }
                    });
                    return;
                }
                C1544770qIl.LIZ(webView, new C0X7M() { // from class: X.0X7L
                    @Override // X.AbstractC1544900qIy
                    public final void LJIIJJI(Object obj) {
                    }
                });
            }
        }
    }
}
