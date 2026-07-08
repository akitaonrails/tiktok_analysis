package com.bytedance.pumbaa.hybrid.rasp;

import X.C0VZM;
import X.C0WL4;
import X.C0WL8;
import X.C0WLK;
import X.C0WNH;
import X.C0WOF;
import X.C0WON;
import X.C824270WVd;
import Y.ARunnableS0S2120000_13;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSBService;
import com.bytedance.pumbaa.hybrid.api.IHybridHookService;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.api.HybridGovernanceServiceDefaultImpl;
import com.bytedance.pumbaa.hybrid.rasp.api.BridgeConfig;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.bytedance.pumbaa.hybrid.rasp.api.NavigationConfig;
import com.bytedance.pumbaa.hybrid.rasp.jsb.JSBridgeRASPServiceImpl;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.bytedance.pumbaa.ruler.base.models.RuleModel;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes14.dex */
public final class RaspServiceImpl implements IRaspService {
    public C0WL4 LIZ;
    public C0WL8 LIZIZ;
    public C0WLK LIZJ;

    @Override // com.bytedance.pumbaa.hybrid.rasp.api.IRaspService
    public final void LJ() {
        SparkSecurityServiceCenter.INSTANCE.registerService(SparkSecurityJSBService.class, new JSBridgeRASPServiceImpl(this.LIZJ, this.LIZIZ));
        IHybridHookService iHybridHookService = (IHybridHookService) ServiceManager.get().getService(IHybridHookService.class);
        final C0WLK c0wlk = this.LIZJ;
        final C0WL8 c0wl8 = this.LIZIZ;
        iHybridHookService.LIZJ(new C0WON(c0wlk, c0wl8) { // from class: X.0WLJ
            public final C0WLK LIZ;
            public final C0WL8 LIZIZ;

            @Override // X.C0WON
            public final void LIZIZ(C0WLA c0wla) {
            }

            @Override // X.C0WON
            public final void LIZJ(C0WLA c0wla) {
            }

            @Override // X.C0WON
            public final boolean LIZ(C0WLA c0wla) {
                C0WLK c0wlk2 = this.LIZ;
                if (c0wlk2 != null) {
                    NavigationConfig navigationConfig = c0wlk2.LIZIZ;
                    if (navigationConfig != null && !navigationConfig.enableRasp) {
                        return false;
                    }
                    BridgeConfig bridgeConfig = c0wlk2.LIZ;
                    if (bridgeConfig != null && bridgeConfig.raspSecurityEnable) {
                        return false;
                    }
                }
                return ((Boolean) C0WL9.LIZ(this.LIZIZ, c0wla).getFirst()).booleanValue();
            }

            {
                this.LIZ = c0wlk;
                this.LIZIZ = c0wl8;
            }
        });
    }

    @Override // com.bytedance.pumbaa.hybrid.rasp.api.IRaspService
    public final void LIZ() {
        IHybridHookService iHybridHookService = (IHybridHookService) ServiceManager.get().getService(IHybridHookService.class);
        final C0WLK c0wlk = this.LIZJ;
        final IRuleEngineService iRuleEngineService = (IRuleEngineService) ServiceManager.get().getService(IRuleEngineService.class);
        final C0WL8 c0wl8 = this.LIZIZ;
        iHybridHookService.LIZIZ(new C0WOF(c0wlk, iRuleEngineService, c0wl8) { // from class: X.0WLH
            public final C0WLK LIZ;
            public final IRuleEngineService LIZIZ;
            public final C0WL8 LIZJ;

            @Override // X.C0WOF
            public final void LIZ(View view, String str) {
            }

            @Override // X.C0WOF
            public final void LIZJ(Uri uri, View view) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0WOF
            public final WebResourceResponse LIZIZ(View view, WebResourceRequest webResourceRequest) {
                NavigationConfig navigationConfig;
                boolean z;
                String strLJIL;
                String str;
                String str2;
                n nVarLJIILIIL;
                k kVarLJJIIZ;
                String str3;
                WebResourceResponse webResourceResponse = null;
                webResourceResponse = null;
                webResourceResponse = null;
                webResourceResponse = null;
                webResourceResponse = null;
                webResourceResponse = null;
                webResourceResponse = null;
                WebResourceResponse webResourceResponse2 = null;
                webResourceResponse = null;
                webResourceResponse = null;
                if (view == null || webResourceRequest == null) {
                    return null;
                }
                C0WLK c0wlk2 = this.LIZ;
                if (c0wlk2 != null && (navigationConfig = c0wlk2.LIZIZ) != null && navigationConfig.enableRasp) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    C805400Vic c805400VicLIZ = C295401Cm.LIZ(webResourceRequest.getUrl());
                    Object tag = view.getTag(R.id.web_client_seclink_scene);
                    if ((tag instanceof String) && (str3 = (String) tag) != null && str3.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z2 = !z;
                    String str4 = webResourceRequest.getRequestHeaders().get("Referer");
                    if (str4 == null) {
                        str4 = webResourceRequest.getRequestHeaders().get("referer");
                    }
                    if (c805400VicLIZ != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("source", "rasp");
                        linkedHashMap.put("type", "webview");
                        String str5 = c805400VicLIZ.LIZJ;
                        if (str5 != null) {
                            linkedHashMap.put("scheme", str5);
                        }
                        String str6 = c805400VicLIZ.LIZ;
                        if (str6 != null) {
                            linkedHashMap.put("url", str6);
                        }
                        String str7 = c805400VicLIZ.LIZLLL;
                        if (str7 != null) {
                            linkedHashMap.put("host", str7);
                        }
                        String str8 = c805400VicLIZ.LJ;
                        if (str8 != null) {
                            linkedHashMap.put("sl_domain", str8);
                        }
                        String str9 = c805400VicLIZ.LJFF;
                        if (str9 != null) {
                            linkedHashMap.put("path", str9);
                        }
                        Map<String, String> map = c805400VicLIZ.LJI;
                        if (map != null && (!map.isEmpty())) {
                            linkedHashMap.put("querys", map);
                        }
                        String str10 = c805400VicLIZ.LJII;
                        if (str10 != null) {
                            linkedHashMap.put("query_str", str10);
                        }
                        String str11 = webResourceRequest.getRequestHeaders().get("Origin");
                        if ((str11 != null || (str11 = webResourceRequest.getRequestHeaders().get("origin")) != null) && str11.length() != 0) {
                            linkedHashMap.put("origin", str11);
                        }
                        if (str4 != null && str4.length() != 0) {
                            linkedHashMap.put("referer", str4);
                        }
                        String str12 = webResourceRequest.getRequestHeaders().get("User-Agent");
                        String str13 = str12;
                        if (str13 != null && str13.length() != 0 && str12 != null) {
                            linkedHashMap.put("ua", str12);
                        }
                        linkedHashMap.put("seclink_installed", Boolean.valueOf(z2));
                        IRuleEngineService iRuleEngineService2 = this.LIZIZ;
                        if (iRuleEngineService2 != null) {
                            C2097608Jq.LJ();
                            C0WLX c0wlxLIZLLL = iRuleEngineService2.LIZLLL(linkedHashMap);
                            if (c0wlxLIZLLL != null && c0wlxLIZLLL.LIZ == 0 && (!c0wlxLIZLLL.LIZJ.isEmpty()) && (!c0wlxLIZLLL.LJI.isEmpty())) {
                                Iterator<C0WLW> it2 = c0wlxLIZLLL.LJI.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    C0WLW next = it2.next();
                                    RuleModel ruleModel = next.LIZJ;
                                    k kVar = next.LJ;
                                    if (kVar != null && (nVarLJIILIIL = kVar.LJIILIIL()) != null && (kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("action")) != null) {
                                        strLJIL = kVarLJJIIZ.LJIL();
                                    } else {
                                        strLJIL = webResourceResponse2;
                                    }
                                    if (next.LIZ == 0 && ruleModel != null && strLJIL != 0) {
                                        int iHashCode = strLJIL.hashCode();
                                        if (iHashCode != -1069603792) {
                                            if (iHashCode != -934521548) {
                                                if (iHashCode == 93832333 && strLJIL.equals("block")) {
                                                    C0WL8 c0wl82 = this.LIZJ;
                                                    if (c0wl82 != null) {
                                                        c0wl82.LIZ(new AwS592S0100000_13(webResourceRequest, 54));
                                                    }
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("\n                                    <html>\n                                      <head>\n                                        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n                                        <meta name=\"referrer\" content=\"no-referrer\">\n                                        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\">\n                                        <title></title>\n                                        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.tiktok.com/link/static/css/app.css\">\n                                        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://www.tiktok.com/link/static/css/1233.css\">\n                                      </head>\n                    \n                                      <body>\n                                        <div class=\"container malicious\">\n                                          <div class=\"division_img adpator_x_img\">\n                                            <img src=\"https://www.tiktok.com/link/static/img/1233_malicious.png\" alt=\"yiwen\" class=\"image\">\n                                          </div>\n                                          <div class=\"prompt_below_img\">\n                                            <p class=\"word_link\">\n                                              <a class=\"word_link_a\">");
                                                    sbLIZ.append(webResourceRequest.getUrl());
                                                    sbLIZ.append("</a>\n                                            </p>\n                                          </div>\n                                          <div class=\"prompt_detail\">\n                                            <p class=\"prompt_detail_word\" id=\"prompt_detail_word_top\">This link may be unsafe. To protect our community, we restrict certain content on our platform.</p>\n                                          </div>\n                                        </div>\n                                        <script src=\"https://sf16-unpkg-va.ibytedtos.com/bridge/byted-via-tiktok/1.0.0/dist/via.tiktok-1.0.0.min.js\"></script>\n                                      </body>\n                                    </html>\n                                ");
                                                    String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append("hit webview rasp rule: ");
                                                    sbLIZ2.append(ruleModel.title);
                                                    webResourceResponse2 = new WebResourceResponse("text/html", "UTF-8", 403, C2188811AlT.LIZIZ(sbLIZ2), null, new ByteArrayInputStream(strLIZJ.getBytes(Charsets.UTF_8)));
                                                }
                                            } else if (strLJIL.equals("report")) {
                                                RuleModel ruleModel2 = next.LIZJ;
                                                String str14 = webResourceResponse2;
                                                if (ruleModel2 != null) {
                                                    str14 = ruleModel2.title;
                                                }
                                                str = str4;
                                                C823050WQl.LIZIZ().execute(new ARunnableS0S2120000_13(c805400VicLIZ, str14, str, z2, true, 1));
                                            }
                                        } else {
                                            str = str4;
                                            if (strLJIL.equals("report_with_values")) {
                                                RuleModel ruleModel3 = next.LIZJ;
                                                if (ruleModel3 != null) {
                                                    str2 = ruleModel3.title;
                                                } else {
                                                    str2 = null;
                                                }
                                                c805400VicLIZ = c805400VicLIZ;
                                                z2 = z2;
                                                C823050WQl.LIZIZ().execute(new ARunnableS0S2120000_13(c805400VicLIZ, str2, str, z2, false, 1));
                                            }
                                        }
                                        str4 = str;
                                        webResourceResponse2 = null;
                                    }
                                }
                            }
                        }
                    }
                    webResourceResponse = webResourceResponse2;
                    if (!C800430Vab.LIZ(view)) {
                        C800860VbI.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, "webview");
                        webResourceResponse = webResourceResponse2;
                    }
                }
                return webResourceResponse;
            }

            {
                this.LIZ = c0wlk;
                this.LIZIZ = iRuleEngineService;
                this.LIZJ = c0wl8;
            }
        });
        HybridGovernanceServiceDefaultImpl.createIHybridGovernanceServicebyMonsterPlugin(false).addAction(new C0WNH() { // from class: X.0WLM
            @Override // X.C0WNH
            public final List<C0WND> LIZ() {
                return C1697810uHb.LJIIJJI(C0WND.RAW, C0WND.SPARK);
            }

            @Override // X.C0WNH
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.C0WMB
            public final BaseGovernanceModel LIZIZ() {
                return new BaseGovernanceModel(null, false, false, false, false);
            }

            @Override // X.C0WMB
            public final C0WMF LIZLLL() {
                return new C0WMF("RASPWebRouterAction", C0WN8.ROUTER, C0WNE.L1, 5000, 16);
            }

            /* JADX WARN: Removed duplicated region for block: B:82:0x01e0  */
            @Override // X.C0WMB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C0WM1 LJ(X.C0WMD r17) {
                /*
                    Method dump skipped, instruction units count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0WLM.LJ(X.0WMD):X.0WM1");
            }
        });
    }

    @Override // com.bytedance.pumbaa.hybrid.rasp.api.IRaspService
    public final void LIZJ(C824270WVd c824270WVd) {
        C0WL8 c0wl8 = this.LIZIZ;
        if (c0wl8 != null) {
            c0wl8.LIZ.add(c824270WVd);
        }
    }

    @Override // com.bytedance.pumbaa.hybrid.rasp.api.IRaspService
    public final void LIZLLL(final C0WLK c0wlk) {
        this.LIZJ = c0wlk;
        this.LIZIZ = new C0WL8(0);
        this.LIZ = new C0WL4(this.LIZIZ);
        IHybridHookService iHybridHookService = (IHybridHookService) ServiceManager.get().getService(IHybridHookService.class);
        if (iHybridHookService != null) {
            iHybridHookService.LIZLLL(new C0VZM() { // from class: X.0WLI
                @Override // X.C0VZM
                public final boolean LIZ(Intent intent, Throwable th) {
                    NavigationConfig navigationConfig;
                    C0WL4 c0wl4;
                    Uri data = intent.getData();
                    if (data == null || (navigationConfig = c0wlk.LIZIZ) == null || !navigationConfig.enableRasp || (c0wl4 = this.LIZ) == null || !c0wl4.LIZ(data, "common")) {
                        return false;
                    }
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    @Override // com.bytedance.pumbaa.hybrid.rasp.api.IRaspService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LIZIZ(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            if (r5 != 0) goto L5
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L5:
            r3 = 0
            X.0WLK r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L34
            r2 = 1
            if (r0 == 0) goto L14
            com.bytedance.pumbaa.hybrid.rasp.api.NavigationConfig r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L14
            boolean r0 = r0.enableRasp     // Catch: java.lang.Throwable -> L34
            if (r0 != r2) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L2e
            X.0WL4 r1 = r4.LIZ     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L28
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r5)     // Catch: java.lang.Throwable -> L34
            boolean r0 = r1.LIZ(r0, r6)     // Catch: java.lang.Throwable -> L34
            if (r0 != r2) goto L28
            goto L2a
        L28:
            r0 = 0
            goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L34
            return r0
        L34:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 == 0) goto L59
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "error occur. "
            r1.append(r0)
            java.lang.String r0 = X.C2348209Ia.LIZJ(r2, r3)
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L59:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl.LIZIZ(java.lang.String, java.lang.String):java.lang.Boolean");
    }
}
