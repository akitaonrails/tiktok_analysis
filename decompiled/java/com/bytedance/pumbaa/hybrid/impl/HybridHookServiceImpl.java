package com.bytedance.pumbaa.hybrid.impl;

import X.C098200Yq;
import X.C0VZM;
import X.C0VZN;
import X.C0WOC;
import X.C0WOF;
import X.C0WOG;
import X.C0WON;
import X.C189200o6;
import X.C2188811AlT;
import X.C2202461BHw;
import X.C2348209Ia;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.hybrid.api.IHybridHookService;
import com.bytedance.pumbaa.hybrid.impl.jsb.BridgeHookDispatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridHookServiceImpl implements IHybridHookService {
    @Override // com.bytedance.pumbaa.hybrid.api.IHybridHookService
    public final void LIZ(C0WOC c0woc) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) C0WOG.LIZIZ).addAll(arrayList);
        C0WOG.LIZ = c0woc;
        WebViewHooker.LIZLLL(new C2202461BHw() { // from class: com.bytedance.pumbaa.hybrid.impl.navigation.NavigationHookDispatcher$init$1
            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                List<C0WOF> list;
                try {
                    C0WOC c0woc2 = C0WOG.LIZ;
                    boolean z = false;
                    if (c0woc2 != null && c0woc2.LIZ) {
                        z = true;
                    }
                    if (z && (list = C0WOG.LIZIZ) != null) {
                        Iterator<C0WOF> it2 = list.iterator();
                        while (it2.hasNext()) {
                            WebResourceResponse webResourceResponseLIZIZ = it2.next().LIZIZ(webView, webResourceRequest);
                            if (webResourceResponseLIZIZ != null) {
                                return webResourceResponseLIZIZ;
                            }
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                Object c098200Yq;
                List<C0WOF> list;
                Uri url;
                try {
                    C0WOC c0woc2 = C0WOG.LIZ;
                    if (c0woc2 != null && c0woc2.LIZ && (list = C0WOG.LIZIZ) != null) {
                        for (C0WOF c0wof : (ArrayList) list) {
                            if (webResourceRequest != null) {
                                url = webResourceRequest.getUrl();
                            } else {
                                url = null;
                            }
                            c0wof.LIZJ(url, webView);
                        }
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
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("shouldOverrideUrlLoading -> error occur. ");
                    sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }

            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Object c098200Yq;
                Uri uri;
                List<C0WOF> list;
                try {
                    C0WOC c0woc2 = C0WOG.LIZ;
                    if (c0woc2 != null && c0woc2.LIZ && (uri = UriProtector.parse(str)) != null && (list = C0WOG.LIZIZ) != null) {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (it2.hasNext()) {
                            ((C0WOF) it2.next()).LIZJ(uri, webView);
                        }
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
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("error occur while parse url. ");
                    sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // X.C2202461BHw, android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Object c098200Yq;
                try {
                    C0WOC c0woc2 = C0WOG.LIZ;
                    if (c0woc2 != null && c0woc2.LIZ) {
                        if (webView != null) {
                            webView.setTag(R.id.web_client_navigation_url, str);
                        }
                        List<C0WOF> list = C0WOG.LIZIZ;
                        if (list != null) {
                            for (C0WOF c0wof : (ArrayList) list) {
                                if (c0wof != null) {
                                    c0wof.LIZ(webView, str);
                                }
                            }
                        }
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
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPageStarted -> error occur. ");
                    sbLIZ.append(C2348209Ia.LIZJ(thM5exceptionOrNullimpl, false));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                super.onPageStarted(webView, str, bitmap);
            }
        });
        BridgeHookDispatcher.INSTANCE.init(arrayList2, c0woc);
    }

    @Override // com.bytedance.pumbaa.hybrid.api.IHybridHookService
    public final void LIZIZ(C0WOF c0wof) {
        ((ArrayList) C0WOG.LIZIZ).add(c0wof);
    }

    @Override // com.bytedance.pumbaa.hybrid.api.IHybridHookService
    public final void LIZJ(C0WON c0won) {
        BridgeHookDispatcher.INSTANCE.registerBridgeInterceptor(c0won);
    }

    @Override // com.bytedance.pumbaa.hybrid.api.IHybridHookService
    public final void LIZLLL(C0VZM c0vzm) {
        ((ArrayList) C0VZN.LIZ).add(c0vzm);
    }
}
