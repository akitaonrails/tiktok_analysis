package com.bytedance.ies.web.jsbridge2;

import X.AbstractC2204751BQr;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1543940qHQ;
import X.C1BMN;
import X.C2188811AlT;
import X.C2203421BLo;
import X.C2204761BQs;
import X.C786410Ut5;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS38S1100000_34;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes35.dex */
public class WebViewBridge extends AbstractC2204751BQr {
    public String LJIIJJI;
    public WebView LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    @Override // X.AbstractC2204751BQr
    public final String LJFF() {
        ViewParent viewParent = this.LJIIL;
        if (viewParent instanceof C1BMN) {
            String strLIZ = ((C1BMN) viewParent).LIZ();
            return TextUtils.isEmpty(strLIZ) ? this.LJIIL.getUrl() : strLIZ;
        }
        boolean z = this.LJIILIIL;
        boolean z2 = this.LJIILJJIL;
        WebView webView = this.LJIIL;
        if (z && z2 && webView != null && !(webView instanceof C1BMN)) {
            HandlerHook.viewPost(webView, new ARunnableS103S0100000_3((Object) webView, 8));
        }
        return this.LJIIL.getUrl();
    }

    @Override // X.AbstractC2204751BQr
    public final void LJIIJ() {
        super.LJIIJ();
        this.LJIIL.removeJavascriptInterface(this.LJIIJJI);
    }

    @Override // X.AbstractC2204751BQr
    public final Context LJ(C2203421BLo c2203421BLo) {
        c2203421BLo.getClass();
        WebView webView = c2203421BLo.LIZ;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // X.AbstractC2204751BQr
    public final void LJII(C2203421BLo c2203421BLo) {
        this.LJIILIIL = c2203421BLo.LJ;
        this.LJIILJJIL = c2203421BLo.LJIILJJIL;
        WebView webView = c2203421BLo.LIZ;
        this.LJIIL = webView;
        String str = c2203421BLo.LIZJ;
        this.LJIIJJI = str;
        c2203421BLo.getClass();
        webView.addJavascriptInterface(this, str);
    }

    @Override // X.AbstractC2204751BQr
    public final void LJIIIIZZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("javascript:");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append("._handleMessageFromToutiao(");
        sbLIZ.append(str);
        sbLIZ.append(")");
        LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC2204751BQr
    public final void LJIIJJI(C2204761BQs c2204761BQs) {
        C1543940qHQ c1543940qHQ = new C1543940qHQ("bridge", "call", c2204761BQs.LIZLLL, 2, "JSBridge2");
        c1543940qHQ.LJJ = Integer.valueOf(c2204761BQs.LIZ);
        c1543940qHQ.LIZIZ();
    }

    public final void LJIIL(String str) {
        if (this.LJFF || TextUtils.isEmpty(str)) {
            return;
        }
        ARunnableS38S1100000_34 aRunnableS38S1100000_34 = new ARunnableS38S1100000_34(this, str, 0);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Received call on sub-thread, posting to main thread: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZLLL.execute(aRunnableS38S1100000_34);
            return;
        }
        aRunnableS38S1100000_34.run();
    }

    @Override // X.AbstractC2204751BQr
    @JavascriptInterface
    public void invokeMethod(String str) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/ies/web/jsbridge2/WebViewBridge", "invokeMethod", this, new Object[]{str}, "void", new C0WZW(false, "(Ljava/lang/String;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Ysm5KrjHjfub2EO8TRKgpiRidqrxjJ4VGSwCd", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            str = (String) obj;
        }
        super.invokeMethod(str);
    }

    @Override // X.AbstractC2204751BQr
    public final void LJIIIZ(String str, C2204761BQs c2204761BQs) {
        if (c2204761BQs != null && !TextUtils.isEmpty(c2204761BQs.LJII)) {
            String str2 = c2204761BQs.LJII;
            LJIIL(C786410Ut5.j4("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", new Object[]{Base64.encodeToString(C786410Ut5.j4("iframe[src=\"%s\"", new Object[]{str2}).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)}));
            return;
        }
        LJIIIIZZ(str);
    }
}
