package com.bytedance.pia.core.plugins;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1287700jc8;
import X.C1BO6;
import X.C20190913zP;
import X.C2204041BNy;
import X.InterfaceC1542530qF9;
import X.InterfaceC2204171BOl;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.plugins.PiaPropsPlugin;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes35.dex */
public class PiaPropsPlugin extends C1BO6 {
    public final n LIZJ;

    public static class JSInterface implements InterfaceC1542530qF9 {
        public final InterfaceC2204171BOl LIZIZ;
        public final WeakReference<WebView> LIZJ;

        @JavascriptInterface
        public String getManifest() throws Throwable {
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getManifest", this, new Object[0], "java.lang.String", new C0WZW(false, "()Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyUb+fKyhgISWMxIQNQxRH1CMAABAlny94Li/7d4Owa", null)));
            return c0wsuLIZIZ.LIZ ? (String) c0wsuLIZIZ.LIZIZ : LIZ("getManifest");
        }

        @JavascriptInterface
        public String getPageConfig() throws Throwable {
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getPageConfig", this, new Object[0], "java.lang.String", new C0WZW(false, "()Ljava/lang/String;", new C0WZX("dzBzEgAjS8/YVFkiQFyUb+fKyhgISWMxIQNQxRH1CMAABAlny94Li/7d4Owa", null)));
            return c0wsuLIZIZ.LIZ ? (String) c0wsuLIZIZ.LIZIZ : LIZ("getPageConfig");
        }

        @Override // X.InterfaceC1542530qF9
        public final void release() {
            C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BOi
                @Override // java.lang.Runnable
                public final void run() {
                    WebView webView = this.LL.LIZJ.get();
                    if (webView != null) {
                        webView.removeJavascriptInterface("pia_props");
                    }
                }
            });
        }

        public final String LIZ(String str) {
            C2204041BNy c2204041BNy;
            k kVarLJJIIZ;
            Object obj = this.LIZIZ.get("ctx-pia-runtime");
            if (!(obj instanceof C2204041BNy) || (c2204041BNy = (C2204041BNy) obj) == null) {
                return null;
            }
            C1BO6 c1bo6LJFF = c2204041BNy.LJFF("pia_props");
            if (!(c1bo6LJFF instanceof PiaPropsPlugin) || (kVarLJJIIZ = ((PiaPropsPlugin) c1bo6LJFF).LIZJ.LJJIIZ(str)) == null) {
                return null;
            }
            return kVarLJJIIZ.LJIL();
        }

        public JSInterface(InterfaceC2204171BOl interfaceC2204171BOl, final WebView webView) {
            this.LIZIZ = interfaceC2204171BOl;
            this.LIZJ = new WeakReference<>(webView);
            C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BOj
                @Override // java.lang.Runnable
                public final void run() {
                    PiaPropsPlugin.JSInterface jSInterface = this.LL;
                    WebView webView2 = webView;
                    jSInterface.getClass();
                    C1C7U.LIZ("PiaPropsPlugin$JSInterface@cb4b.<init>$1L");
                    webView2.addJavascriptInterface(jSInterface, "pia_props");
                    C1C7U.LIZIZ("PiaPropsPlugin$JSInterface@cb4b.<init>$1L");
                }
            });
        }
    }

    @Override // X.C1BO6
    public final String LIZ() {
        return "pia_props";
    }

    @Override // X.C1BO6
    public final void LJFF() {
        View viewLJI = this.LIZIZ.LJI();
        if (viewLJI instanceof WebView) {
            StringBuilder sb = new StringBuilder("(function(n){var r={},o=JSON.parse(n);for(var i in o)r[i]=function(n){return function(){return o[n]}}(i);window.pia_props=r})");
            C20190913zP.LIZ(this.LIZJ.toString(), sb);
            C20190913zP.LIZIZ((WebView) viewLJI, sb.toString(), null);
        }
    }

    @Override // X.C1BO6
    public final void LIZIZ() {
        this.LIZJ.LJJIFFI("getPageConfig", new q(GsonProtectorUtils.toJson(GsonUtils.LIZ(), this.LIZIZ.LIZLLL)));
        this.LIZJ.LJJIFFI("getManifest", new q("{}"));
    }

    public PiaPropsPlugin(C2204041BNy c2204041BNy) {
        super(c2204041BNy);
        this.LIZJ = new n();
    }

    @Override // X.C1BO6
    public final void LIZLLL(View view) {
        if (!(view instanceof WebView)) {
            return;
        }
        WebView webView = (WebView) view;
        InterfaceC2204171BOl interfaceC2204171BOl = this.LIZIZ.LJJIII;
        if (interfaceC2204171BOl == null || (interfaceC2204171BOl.get("ctx-pia-props-jsi") instanceof JSInterface)) {
            return;
        }
        interfaceC2204171BOl.LIZ(new JSInterface(interfaceC2204171BOl, webView), "ctx-pia-props-jsi");
    }
}
