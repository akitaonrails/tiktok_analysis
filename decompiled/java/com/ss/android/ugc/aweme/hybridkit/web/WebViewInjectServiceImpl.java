package com.ss.android.ugc.aweme.hybridkit.web;

import X.C098200Yq;
import X.C189200o6;
import X.C1BVM;
import X.C2079208Co;
import X.C2202461BHw;
import X.C2515009tM;
import X.C828090We7;
import android.webkit.WebView;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hybridkit.web.hooks.WebMonitorExt;
import com.ss.android.ugc.aweme.hybridkit.web.hooks.WebViewInlineJSInjectExt;
import com.ss.android.ugc.aweme.webview.IWebViewInjectService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewInjectServiceImpl implements IWebViewInjectService {
    @Override // com.ss.android.ugc.aweme.webview.IWebViewInjectService
    public final void LIZ() {
        List<String> list = C2079208Co.LIZ;
        WebViewHooker.LJ(new C1BVM() { // from class: com.ss.android.ugc.aweme.hybridkit.web.hooks.CrashExtraMessageHook$registerHooks$1
            @Override // X.C1BVM
            public final void LJIIJJI(String str) {
                super.LJIIJJI(str);
                List<String> list2 = C2079208Co.LIZ;
                if (str == null) {
                    str = "";
                }
                C2079208Co.LIZ(str);
            }

            @Override // X.C1BVM
            public final void LJIIJ(Map map, boolean z) {
                if (C2515009tM.LIZ) {
                    try {
                        Reflect.on(Reflect.on("android.webkit.WebViewFactory").call("getUpdateService").get()).call("waitForAndGetProvider").get();
                    } catch (Exception e) {
                        try {
                            TryCatchGuardChecker.doCheck(e);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
                super.LJIIJ(map, z);
            }

            @Override // X.C1BVM
            public final void LJIIL(String str, Map<String, String> map) {
                super.LJIIL(str, map);
                List<String> list2 = C2079208Co.LIZ;
                if (str == null) {
                    str = "";
                }
                C2079208Co.LIZ(str);
            }
        });
        WebViewHooker.LIZLLL(new C2202461BHw() { // from class: com.ss.android.ugc.aweme.hybridkit.web.hooks.CrashExtraMessageHook$registerHooks$2
            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                C2079208Co.LIZ(str);
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        try {
            WebViewHooker.LJ(new C1BVM() { // from class: com.ss.android.ugc.aweme.hybridkit.web.hooks.RestrictiveRuleReport$registerHooks$1$1
                @Override // X.C1BVM
                public final void LJIIJJI(String str) {
                    WebView webView = this.LLILZIL;
                    webView.addJavascriptInterface(new RestrictiveRuleReporter(webView), "WebReport");
                    super.LJIIJJI(str);
                }

                @Override // X.C1BVM
                public final void LJIIL(String str, Map<String, String> map) {
                    WebView webView = this.LLILZIL;
                    webView.addJavascriptInterface(new RestrictiveRuleReporter(webView), "WebReport");
                    super.LJIIL(str, map);
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        WebViewHooker.LIZLLL(new WebViewInlineJSInjectExt());
        AtomicBoolean atomicBoolean = WebMonitorExt.LLJ;
        C828090We7.LIZ();
    }
}
