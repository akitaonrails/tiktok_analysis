package com.bytedance.ies.bullet.service.base.web;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1BVR;
import X.C1BVS;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public class WebChromeClientDispatcher extends WebChromeClient {
    public final CopyOnWriteArrayList<C1BVR> LIZ = new CopyOnWriteArrayList<>();

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getDefaultVideoPoster();
                throw null;
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.getDefaultVideoPoster();
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getVideoLoadingProgressView();
                throw null;
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.getVideoLoadingProgressView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onGeolocationPermissionsHidePrompt();
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        super.onHideCustomView();
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onHideCustomView();
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) throws Throwable {
        Object obj;
        PermissionRequest permissionRequest2 = permissionRequest;
        C0WST c0wst = new C0WST();
        Object[] objArr = {permissionRequest2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/webkit/PermissionRequest;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yp35E7D7kMuf6Bv4fFeOOl/KkfhSKBViBiQ/+rp2IlFCgiif/268hI4g2fnc+KL9KPw==", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onPermissionRequest", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onPermissionRequest", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            permissionRequest2 = (PermissionRequest) obj;
        }
        super.onPermissionRequest(permissionRequest2);
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onPermissionRequest(permissionRequest2);
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c0wst.LIZ(102604, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onPermissionRequest", null, objArr, this, c0wzw, true);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getClass();
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) throws Throwable {
        GeolocationPermissions.Callback callback2 = callback;
        String str2 = str;
        C0WST c0wst = new C0WST();
        Object[] objArr = {str2, callback2};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yp35E7D7kMuf6Bv4fFeOOl/KkfhSKBViBiQ/+rp2IlFCgiif/268hI4g2fnc+KL9KPw==", null));
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100003, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onGeolocationPermissionsShowPrompt", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(100003, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                str2 = (String) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                callback2 = (GeolocationPermissions.Callback) obj2;
            }
        }
        super.onGeolocationPermissionsShowPrompt(str2, callback2);
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onGeolocationPermissionsShowPrompt(str2, callback2);
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c0wst.LIZ(100003, "com/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher", "onGeolocationPermissionsShowPrompt", null, objArr, this, c0wzw, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onProgressChanged(webView, i);
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onReceivedTitle(webView, str);
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onShowCustomView(view, customViewCallback);
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getClass();
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onConsoleMessage(str, i, str2);
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onShowCustomView(view, i, customViewCallback);
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
                throw null;
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().getClass();
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onJsAlert(webView, str, str2, jsResult);
                throw null;
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onJsBeforeUnload(webView, str, str2, jsResult);
                throw null;
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onJsConfirm(webView, str, str2, jsResult);
                throw null;
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<C1BVR> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
                throw null;
            } catch (C1BVS e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
