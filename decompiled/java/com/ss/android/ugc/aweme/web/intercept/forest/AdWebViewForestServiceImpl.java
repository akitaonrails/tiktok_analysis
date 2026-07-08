package com.ss.android.ugc.aweme.web.intercept.forest;

import X.AbstractC1041200dCY;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebViewForestServiceImpl implements IAdWebViewForestService {
    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewForestService
    public final AbstractC1041200dCY LIZ(boolean z, final boolean z2) {
        if (z) {
            return new AbstractC1041200dCY() { // from class: X.0dCX
                public C1041250dCd LJIIJ;

                @Override // X.AbstractC1041200dCY, X.InterfaceC1039910dAT
                public final void onDestroy() {
                    super.onDestroy();
                    C1041250dCd c1041250dCd = this.LJIIJ;
                    if (c1041250dCd != null) {
                        c1041250dCd.LJI.clear();
                    }
                }

                @Override // X.AbstractC1041200dCY
                public final void LJIIIIZZ(C1035880d3y c1035880d3y) {
                    InterfaceC1040510dBR interfaceC1040510dBR;
                    InterfaceC1042230dED interfaceC1042230dEDZK1;
                    C1041250dCd c1041250dCd;
                    AdLandPageResourceOptimizeExperiment.LIZ.getClass();
                    if (AdLandPageResourceOptimizeExperiment.LIZ().enableConsumePrefetch && (interfaceC1040510dBR = (InterfaceC1040510dBR) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1040510dBR.class)) != null && interfaceC1040510dBR.vN(c1035880d3y)) {
                        if (c1035880d3y.getLoadUrl() != null) {
                            this.LJIIJ = new C1041250dCd(c1035880d3y.getPreloadAdChannel(), this.LJI, c1035880d3y);
                        }
                        InterfaceC1040510dBR interfaceC1040510dBR2 = (InterfaceC1040510dBR) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1040510dBR.class);
                        if (interfaceC1040510dBR2 != null && (interfaceC1042230dEDZK1 = interfaceC1040510dBR2.ZK1(c1035880d3y)) != null && (c1041250dCd = this.LJIIJ) != null) {
                            c1041250dCd.LJI.add(interfaceC1042230dEDZK1);
                            return;
                        }
                        return;
                    }
                    if (!C1040020dAe.LIZ().enablePrefetchHtml || c1035880d3y.getLoadUrl() == null) {
                        return;
                    }
                    this.LJIIJ = new C1041250dCd(c1035880d3y.getPreloadAdChannel(), this.LJI, c1035880d3y);
                }

                @Override // X.InterfaceC1039910dAT
                public final WebResourceResponse LIZ(WebView webView, WebResourceRequest webResourceRequest) {
                    C1041250dCd c1041250dCd;
                    if (webResourceRequest == null || (c1041250dCd = this.LJIIJ) == null) {
                        return null;
                    }
                    return c1041250dCd.LJI(webView, webResourceRequest);
                }

                @Override // X.InterfaceC1039910dAT
                public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webResourceRequest != null) {
                        String string = webResourceRequest.getUrl().toString();
                        WebResourceResponse webResourceResponseLIZ = this.LIZIZ.LIZ(string);
                        LJII(webView, string, webResourceResponseLIZ);
                        LJFF(webResourceRequest, webResourceResponseLIZ);
                        return webResourceResponseLIZ;
                    }
                    return null;
                }
            };
        }
        return new AbstractC1041200dCY(z2) { // from class: X.0dCZ
            public final boolean LJIIJ;
            public C1041250dCd LJIIJJI;

            {
                this.LJIIJ = z2;
            }

            @Override // X.AbstractC1041200dCY, X.InterfaceC1039910dAT
            public final void LIZJ(C1035880d3y c1035880d3y) {
                super.LIZJ(c1035880d3y);
                if (this.LJIIJ) {
                    C1553670qX7 c1553670qX7 = C1553670qX7.LIZ;
                    List<Pattern> listLIZJ = C1553670qX7.LIZJ();
                    String strLIZ = C1014230cV3.LIZ("feed_lp_pia");
                    c1553670qX7.getClass();
                    C0VSJ c0vsj = new C0VSJ(C1553670qX7.LIZLLL().getPath(), strLIZ);
                    C2354709Kn.LJI(c0vsj);
                    C19866712oD c19866712oD = new C19866712oD(c0vsj.getPath());
                    C19866812oE c19866812oE = c19866712oD.LIZ;
                    if (c19866812oE != null) {
                        c19866812oE.LIZIZ = true;
                    }
                    c19866712oD.LIZIZ(listLIZJ);
                    this.LIZLLL = c19866712oD;
                }
            }

            @Override // X.AbstractC1041200dCY
            public final void LJIIIIZZ(C1035880d3y c1035880d3y) {
                if (C1040020dAe.LIZ().enablePrefetchHtml && c1035880d3y.getLoadUrl() != null) {
                    this.LJIIJJI = new C1041250dCd(c1035880d3y.getPreloadAdChannel(), this.LJI, c1035880d3y);
                }
            }

            @Override // X.InterfaceC1039910dAT
            public final WebResourceResponse LIZ(WebView webView, WebResourceRequest webResourceRequest) {
                C1041250dCd c1041250dCd;
                if (webResourceRequest == null || !webResourceRequest.isForMainFrame() || (c1041250dCd = this.LJIIJJI) == null) {
                    return null;
                }
                return c1041250dCd.LJI(webView, webResourceRequest);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[PHI: r4
              0x0039: PHI (r4v4 android.webkit.WebResourceResponse) = 
              (r4v1 android.webkit.WebResourceResponse)
              (r4v2 android.webkit.WebResourceResponse)
              (r4v5 android.webkit.WebResourceResponse)
             binds: [B:17:0x0037, B:13:0x002d, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1039910dAT
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r7, android.webkit.WebResourceRequest r8) throws org.json.JSONException {
                /*
                    r6 = this;
                    r1 = 0
                    if (r8 == 0) goto L73
                    android.net.Uri r0 = r8.getUrl()
                    java.lang.String r5 = r0.toString()
                    boolean r0 = r6.LJIIJ
                    if (r0 == 0) goto L19
                    X.12oD r0 = r6.LIZLLL
                    if (r0 == 0) goto L19
                    android.webkit.WebResourceResponse r4 = r0.LIZJ(r7, r5)
                    if (r4 != 0) goto L39
                L19:
                    X.01GW r0 = X.C0A6X.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L2f
                    X.0dCa r0 = r6.LIZIZ
                    android.webkit.WebResourceResponse r4 = r0.LIZ(r5)
                    if (r4 != 0) goto L39
                L2f:
                    X.12oD r0 = r6.LIZJ
                    if (r0 == 0) goto L71
                    android.webkit.WebResourceResponse r4 = r0.LIZJ(r7, r5)
                    if (r4 == 0) goto L6a
                L39:
                    boolean r1 = r8.isForMainFrame()
                    r0 = 1
                    if (r1 != r0) goto L6a
                    boolean r0 = r7 instanceof com.bytedance.lynx.hybrid.webkit.WebKitView
                    if (r0 == 0) goto L6a
                    r3 = r7
                    com.bytedance.lynx.hybrid.webkit.WebKitView r3 = (com.bytedance.lynx.hybrid.webkit.WebKitView) r3
                    if (r3 == 0) goto L6a
                    X.0q70 r0 = r3.getHybridContext()
                    org.json.JSONObject r2 = r0.templateResData
                    java.lang.String r1 = "res_from"
                    java.lang.String r0 = "gecko"
                    r2.put(r1, r0)
                    kotlin.Pair r2 = new kotlin.Pair
                    X.0q70 r0 = r3.getHybridContext()
                    org.json.JSONObject r1 = r0.templateResData
                    java.lang.String r0 = "templateResData"
                    r2.<init>(r0, r1)
                    java.util.Map r0 = X.C2097908Jt.LIZJ(r2)
                    r3.U0(r0)
                L6a:
                    r6.LJII(r7, r5, r4)
                    r6.LJFF(r8, r4)
                    return r4
                L71:
                    r4 = r1
                    goto L6a
                L73:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1041210dCZ.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
            }
        };
    }
}
