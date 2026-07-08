package com.ss.android.ugc.aweme.ad.preload.network;

import X.C09JN;
import X.C1906580ziK;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import com.ss.android.ugc.aweme.ad.preload.network.SingletonWebView;

/* JADX INFO: loaded from: classes17.dex */
public final class SingletonWebView {
    public static WebView webview;
    public static final SingletonWebView INSTANCE = new SingletonWebView();
    public static final int $stable = 8;

    private final void registerContextOb() {
        C1906580ziK.LIZJ().LJIIJ().LJJLJLI(new C09JN() { // from class: X.0dFc
            @Override // X.C09JN
            public final void accept(Object obj) {
                Activity activityLIZIZ;
                C1C7U.LIZ("SingletonWebView@ae46.registerContextOb$1");
                AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
                if (abstractC1387200mCc != null && (activityLIZIZ = abstractC1387200mCc.LIZIZ()) != null) {
                    SingletonWebView.INSTANCE.updateWebViewContext(activityLIZIZ);
                }
                C1C7U.LIZIZ("SingletonWebView@ae46.registerContextOb$1");
            }
        });
        C1906580ziK.LIZJ().LJIIIIZZ().LJJLJLI(new C09JN() { // from class: X.0dFd
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SingletonWebView@ae46.registerContextOb$2");
                Context context = (Context) obj;
                if (context != null) {
                    SingletonWebView.INSTANCE.updateWebViewContext(context);
                }
                C1C7U.LIZIZ("SingletonWebView@ae46.registerContextOb$2");
            }
        });
    }

    public final void initWebivew() {
        Context contextLJFF = C2214201BlK.LJFF();
        if (contextLJFF == null) {
            C844470XAv.LIZ.getClass();
            contextLJFF = C844470XAv.LIZ();
        }
        C786410Ut5.A2();
        webview = new WebView(new MutableContextWrapper(contextLJFF));
        registerContextOb();
    }

    public final WebView getWebview() {
        return webview;
    }

    public final void setWebView(WebView webView) {
        if (!AdLandPageResourceOptimizeExperiment.LIZ().usePrewarmSingletonWebView) {
            return;
        }
        registerContextOb();
        webview = webView;
    }

    public final void updateWebViewContext(Context context) {
        MutableContextWrapper mutableContextWrapper;
        WebView webView = webview;
        Context context2 = null;
        if (webView != null) {
            context2 = webView.getContext();
        }
        if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
            mutableContextWrapper.setBaseContext(context);
        }
    }
}
