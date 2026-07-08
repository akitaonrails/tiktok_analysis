package com.bytedance.pia.core.plugins;

import X.C1287700jc8;
import X.C1BO6;
import X.C1BP6;
import X.C1BPD;
import X.C1BPP;
import X.C2204041BNy;
import X.RunnableC2204351BPd;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes35.dex */
public class BridgePlugin extends C1BO6 {
    @Override // X.C1BO6
    public final String LIZ() {
        return "pia_bridge";
    }

    @Override // X.C1BO6
    public final void LJFF() {
        WebView webView;
        WebViewPort.JSInterface jSInterface;
        C1BPD<String> andSet;
        View viewLJI = this.LIZIZ.LJI();
        if ((viewLJI instanceof WebView) && (webView = (WebView) viewLJI) != null && (jSInterface = WebViewPort.JSInterface.LIZJ.get(webView)) != null) {
            AtomicReference<C1BPD<String>> atomicReference = jSInterface.LIZ;
            C1BPD<String> c1bpd = new C1BPD<>();
            while (true) {
                if (atomicReference.compareAndSet(null, c1bpd)) {
                    andSet = jSInterface.LIZ.get();
                    break;
                } else if (atomicReference.get() != null) {
                    andSet = jSInterface.LIZ.getAndSet(null);
                    break;
                }
            }
            if (andSet != null) {
                final WebViewPort webViewPort = new WebViewPort(webView, andSet);
                C1BP6 c1bp6 = this.LIZIZ.LJIJJ;
                c1bp6.getClass();
                C1287700jc8.LIZJ(new RunnableC2204351BPd(c1bp6, webViewPort));
                final Uri uri = this.LIZIZ.LJ;
                C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BPL
                    @Override // java.lang.Runnable
                    public final void run() {
                        final WebViewPort webViewPort2 = webViewPort;
                        Uri uri2 = uri;
                        WebView webView2 = webViewPort2.LIZLLL.get();
                        if (webView2 == null || C20190913zP.LIZJ(webView2) < 66) {
                            return;
                        }
                        final WebMessagePort[] webMessagePortArrCreateWebMessageChannel = webView2.createWebMessageChannel();
                        webMessagePortArrCreateWebMessageChannel[0].setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: X.1BPM
                            @Override // android.webkit.WebMessagePort.WebMessageCallback
                            public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                                String data = webMessage.getData();
                                if (TextUtils.isEmpty(data)) {
                                    return;
                                }
                                if ("__port_init__".equals(data)) {
                                    WebViewPort webViewPort3 = webViewPort2;
                                    webViewPort3.LIZ.LIZJ(new C2204441BPm(webViewPort3, Boolean.FALSE));
                                } else if ("__port_init_next__".equals(data)) {
                                    WebViewPort webViewPort4 = webViewPort2;
                                    webViewPort4.LIZ.LIZJ(new C2204441BPm(webViewPort4, Boolean.TRUE));
                                } else if ("__channel_ack__".equals(data)) {
                                    webViewPort2.LIZJ = webMessagePortArrCreateWebMessageChannel[0];
                                } else {
                                    webViewPort2.LIZIZ.LIZ(data);
                                }
                            }
                        }, C1287700jc8.LIZ());
                        C20190913zP.LIZIZ(webView2, "(function(e){var i=function(a){if(\"__channel_init__\"===a.data&&a.ports&&a.ports[0]){var s=a.ports[0];s.postMessage(\"__channel_ack__\"),s.onmessage=function(i){i&&i.data&&\"string\"==typeof i.data&&e(i.data)};var n=function(e){s.postMessage(e)};window.pia_bridge&&window.pia_bridge.onmessage?window.pia_bridge.postMessage=n:window.pia_bridge={postMessage:n},window.removeEventListener(\"message\",i)}};window.addEventListener(\"message\",i)})(function(n){var i=window.pia_bridge,o=i&&i.onmessage;o&&\"function\"==typeof o&&o(n)})", null);
                        webView2.postWebMessage(new WebMessage("__channel_init__", new WebMessagePort[]{webMessagePortArrCreateWebMessageChannel[1]}), uri2);
                    }
                });
                C1BPP.LJ("[Bridge] start render bridge success.");
                return;
            }
        }
        C1BPP.LIZ("[Bridge] start render bridge failed!");
    }

    public BridgePlugin(C2204041BNy c2204041BNy) {
        super(c2204041BNy);
    }

    @Override // X.C1BO6
    public final void LIZLLL(View view) {
        if (view instanceof WebView) {
            final WebView webView = (WebView) view;
            C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BOk
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewPort.JSInterface.LIZ(webView);
                }
            });
        }
    }
}
