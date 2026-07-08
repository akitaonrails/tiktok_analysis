package com.bytedance.pumbaa.hybrid.monitor.jsinjection;

import X.C098200Yq;
import X.C189200o6;
import X.C2202461BHw;
import X.EnumC800530Val;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class WebStatusClientExt extends C2202461BHw {
    public WebStatusClientExt() {
        super(3);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Unit unit;
        if (webView == null) {
            unit = null;
        } else {
            try {
                webView.setTag(R.id.web_client_view_status, EnumC800530Val.PAGE_LOADING);
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        super.onLoadResource(webView, str);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Unit unit;
        if (webView == null) {
            unit = null;
        } else {
            try {
                webView.setTag(R.id.web_client_view_status, EnumC800530Val.PAGE_FINISHED);
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        super.onPageFinished(webView, str);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Unit unit;
        if (webView == null) {
            unit = null;
        } else {
            try {
                webView.setTag(R.id.web_client_view_status, EnumC800530Val.PAGE_REDIRECT);
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Unit unit;
        if (webView == null) {
            unit = null;
        } else {
            try {
                webView.setTag(R.id.web_client_view_status, EnumC800530Val.PAGE_REDIRECT);
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        return super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // X.C2202461BHw, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Unit unit;
        if (webView == null) {
            unit = null;
        } else {
            try {
                webView.setTag(R.id.web_client_view_status, EnumC800530Val.PAGE_START);
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        super.onPageStarted(webView, str, bitmap);
    }
}
