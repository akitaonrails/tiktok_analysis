package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: classes4.dex */
public interface WebViewRendererClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    void onRendererResponsive(WebView webView, InvocationHandler invocationHandler);

    void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler);
}
