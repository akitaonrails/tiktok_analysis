package com.ss.android.ugc.aweme.hybridkit.web.ttp;

import X.C1BVM;
import X.C2188811AlT;
import X.C843000X5e;
import X.C843070X5l;
import X.C843130X5r;
import X.C843290X6h;
import X.InterfaceC843110X5p;
import android.webkit.WebView;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class TTPWebViewProviderExt extends C1BVM {
    public final C843000X5e LLJ;

    @Override // X.C1BVM, X.InterfaceC1548170qOF
    public final String LIZ() {
        return "TTPWebViewProviderExt";
    }

    @Override // X.C1BVM
    public final void LJ() {
        super.LJ();
        C843000X5e c843000X5e = this.LLJ;
        c843000X5e.LIZ.getClass();
        c843000X5e.LIZIZ.getClass();
        c843000X5e.LIZJ.getClass();
    }

    public TTPWebViewProviderExt(C843000X5e c843000X5e) {
        super(7);
        this.LLJ = c843000X5e;
    }

    @Override // X.C1BVM
    public final void LJIIJJI(String str) {
        this.LLJ.LIZ(this.LLILZIL, str);
        super.LJIIJJI(str);
    }

    @Override // X.C1BVM
    public final void LJIIJ(Map<String, Object> map, boolean z) {
        super.LJIIJ(map, z);
        C843000X5e c843000X5e = this.LLJ;
        WebView webView = this.LLILZIL;
        c843000X5e.LIZ.getClass();
        InterfaceC843110X5p interfaceC843110X5p = (InterfaceC843110X5p) C843290X6h.LJIIJ.getValue();
        if (interfaceC843110X5p != null && interfaceC843110X5p.isTTWebView(webView) && interfaceC843110X5p.LIZIZ(webView)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerTTWebResListener on onCreateView, webView: ");
            sbLIZ.append(webView);
            C843070X5l.LIZJ(6, C2188811AlT.LIZIZ(sbLIZ), null, null);
            interfaceC843110X5p.LIZ(webView, new C843130X5r(webView));
        }
        c843000X5e.LIZIZ.getClass();
        c843000X5e.LIZJ.getClass();
    }

    @Override // X.C1BVM
    public final void LJIIL(String str, Map<String, String> map) {
        this.LLJ.LIZ(this.LLILZIL, str);
        super.LJIIL(str, map);
    }
}
