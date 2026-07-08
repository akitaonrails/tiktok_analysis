package com.ss.android.ugc.tiktok.security.csrf;

import X.C098200Yq;
import X.C09AZ;
import X.C0V2X;
import X.C123100dR;
import X.C1493400oxu;
import X.C189200o6;
import X.C2188811AlT;
import X.C2202461BHw;
import X.C290100BYq;
import X.C822530WOl;
import X.C822540WOm;
import X.C844470XAv;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.text.Charsets;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class CSRFClientExt extends C2202461BHw {
    public final ExecutorService LLJ;

    @Override // X.C2202461BHw, X.InterfaceC1548170qOF
    public final String LIZ() {
        return "CSRFClientExt";
    }

    public CSRFClientExt(ExecutorService executorService) {
        super(7);
        this.LLJ = executorService;
    }

    public static C822540WOm LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n                <html>\n                <body>\n                <font size=\"10\" face=\"arial\" color=\"red\">");
        sbLIZ.append(str);
        sbLIZ.append("</font>\n                </body>\n                <html>\n        ");
        return new C822540WOm(new ByteArrayInputStream(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)).getBytes(Charsets.UTF_8)), str);
    }

    public static boolean LJFF(String str) {
        Object next;
        if (str == null) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        Iterator it2 = ((ArrayList) C1493400oxu.LJIIJ(C844470XAv.LIZ()).LJIIJJI()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (u.LJIIZILJ(str, (String) next, false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return C123100dR.LIZ((String) next);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (LJFF(r0) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(X.C822530WOl r9) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.security.csrf.CSRFClientExt.LIZLLL(X.0WOl):boolean");
    }

    public static boolean LJII(String str, List list) {
        Object next;
        if (str == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (u.LJJIIJZLJL(str, (String) next, false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return C123100dR.LIZ((String) next);
    }

    public static boolean LJIIIIZZ(String str, List list) {
        if (str == null) {
            return false;
        }
        for (Object obj : list) {
            BlockRuleBean blockRuleBean = (BlockRuleBean) obj;
            if (u.LJJIIJZLJL(str, blockRuleBean.prefix, false) && u.LJIIZILJ(str, blockRuleBean.suffix, false)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        Object c098200Yq;
        Objects.toString(webView);
        String string = null;
        if (webResourceRequest != null) {
            url = webResourceRequest.getUrl();
        } else {
            url = null;
        }
        Objects.toString(url);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (webView != null && webResourceRequest != null) {
            String method = webResourceRequest.getMethod();
            Uri url2 = webResourceRequest.getUrl();
            if (url2 != null) {
                string = url2.toString();
            }
            if (LIZLLL(new C822530WOl(0, method, string, webResourceRequest.getRequestHeaders()))) {
                C822540WOm c822540WOmLJ = LJ("found crossite request, cause it may reveal cookie, so block it! ".concat(""));
                return new WebResourceResponse("text/html", "UTF-8", 403, c822540WOmLJ.LIZ, null, c822540WOmLJ.LIZIZ);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                thM5exceptionOrNullimpl.toString();
                C0V2X.LIZ(thM5exceptionOrNullimpl);
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public static boolean LJI(String str, String str2, String str3) {
        Object c098200Yq;
        String host;
        String host2;
        if (str == null || !LJIIIIZZ(str, C290100BYq.LIZ().postApiBlockList)) {
            return false;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (str2 != null) {
            Uri uri = UriProtector.parse(str2);
            if (LJFF(uri.getHost()) || (host2 = uri.getHost()) == null || u.LJIIZILJ(str, host2, false)) {
                return false;
            }
            return true;
        }
        if (str3 != null) {
            Uri uri2 = UriProtector.parse(str2);
            if (LJFF(uri2.getHost()) || (host = uri2.getHost()) == null || u.LJIIZILJ(str, host, false)) {
                return false;
            }
            return true;
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isCrossSiteRequest: ");
            sbLIZ.append(C0V2X.LIZ(thM5exceptionOrNullimpl));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    @Override // X.C2202461BHw, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageStarted(android.webkit.WebView r4, java.lang.String r5, android.graphics.Bitmap r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L1e
            r1 = 2131400645(0x7f0a97c5, float:1.842215E38)
            java.lang.Object r2 = r4.getTag(r1)     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r2 instanceof X.C800440Vac     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1e
            X.0Vac r2 = (X.C800440Vac) r2     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L1e
            X.0Vad r1 = r2.LIZ     // Catch: java.lang.Throwable -> L3f
            X.0Vad r0 = X.EnumC800450Vad.THIRD     // Catch: java.lang.Throwable -> L3f
            if (r1 != r0) goto L1b
            X.C822490WOh.LIZ()     // Catch: java.lang.Throwable -> L3f
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L3f
            goto L3b
        L1e:
            if (r5 == 0) goto L3b
            X.0X55 r0 = X.C0X55.LIZ     // Catch: java.lang.Throwable -> L3f
            r0.getClass()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = X.C0X55.LIZ(r5)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L39
            X.C822490WOh.LIZ()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L39
            X.0Xfk r1 = new X.0Xfk     // Catch: java.lang.Throwable -> L3f
            r0 = 0
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L3f
            r4.addOnAttachStateChangeListener(r1)     // Catch: java.lang.Throwable -> L3f
        L39:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L3f
        L3b:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L3f
            goto L4b
        L3f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L4b:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r2 == 0) goto L6c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onPageStarted: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", stack: "
            r1.append(r0)
            java.lang.String r0 = X.C0V2X.LIZ(r2)
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L6c:
            super.onPageStarted(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.security.csrf.CSRFClientExt.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
    }
}
