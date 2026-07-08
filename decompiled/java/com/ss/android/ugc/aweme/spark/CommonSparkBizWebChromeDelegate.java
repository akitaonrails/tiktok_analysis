package com.ss.android.ugc.aweme.spark;

import X.C1038730d8Z;
import X.C1039050d95;
import X.C1039090d99;
import X.C1039350d9Z;
import X.C1041070dCL;
import X.C1041600dDC;
import X.C1542400qEw;
import X.C19GS;
import X.C1AF0;
import X.C20684815ws;
import X.C20684915wt;
import X.C2093608Ic;
import X.C786410Ut5;
import X.C844470XAv;
import X.C988570bpf;
import X.InterfaceC1039110d9B;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommonSparkBizWebChromeDelegate extends C1542400qEw implements WeakHandler.IHandler {
    public final InterfaceC1039110d9B bulletBusiness;
    public final C1039050d95 container;
    public final WeakHandler mHandler = new WeakHandler(this);
    public static final C1039350d9Z Companion = new Object() { // from class: X.0d9Z
    };
    public static final int $stable = 8;

    @Override // X.C1BVX
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    @Override // X.C1BVX
    public void onGeolocationPermissionsHidePrompt() {
    }

    @Override // X.C1BVX
    public View getVideoLoadingProgressView() {
        Activity activity = this.bulletBusiness.getActivity();
        if (!(activity instanceof C19GS) || activity == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    @Override // X.C1BVX
    public void onHideCustomView() {
        super.onHideCustomView();
        C1039050d95 c1039050d95 = this.container;
        c1039050d95.getClass();
        new C1039090d99(c1039050d95).onHideCustomView();
    }

    public CommonSparkBizWebChromeDelegate(C1039050d95 c1039050d95) {
        this.container = c1039050d95;
        this.bulletBusiness = c1039050d95.LL;
    }

    private final boolean isEnablePopup(String str) {
        Boolean bool;
        if (str == null) {
            return false;
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZJ() != null && (bool = Boolean.FALSE) != null) {
            bool.booleanValue();
            C1041070dCL.LIZJ();
            C1041070dCL.LIZJ();
            if (!this.bulletBusiness.LIZLLL()) {
                return false;
            }
            return true;
        }
        return this.bulletBusiness.LIZLLL();
    }

    private final boolean reportLocalEvent(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (!Intrinsics.LJFF("log_event", uri.getHost())) {
                return false;
            }
            z = true;
            Message messageObtainMessage = this.mHandler.obtainMessage(1);
            messageObtainMessage.obj = uri;
            this.mHandler.sendMessage(messageObtainMessage);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return z;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j;
        JSONObject jSONObject;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (message != null && message.what == 1 && (HandlerHook.getMessageObj(message.obj) instanceof Uri)) {
            try {
                Uri uri = (Uri) HandlerHook.getMessageObj(message.obj);
                if (!Intrinsics.LJFF("log_event", uri.getHost())) {
                    return;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "category");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "tag");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "label");
                long j2 = 0;
                try {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "value");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    j = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                } else {
                    j = 0;
                }
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ext_value");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                        j2 = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(e2);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra");
                if (!C2093608Ic.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) {
                    try {
                        jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        C1AF0.LJ(e3);
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
                C844470XAv.LIZ.getClass();
                try {
                    C20684915wt.LIZJ(C844470XAv.LIZ(), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, j, j2, jSONObject);
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
                C1AF0.LJ(e5);
            }
        }
    }

    @Override // X.C1BVX
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // X.C1BVX
    public void onProgressChanged(WebView webView, int i) {
        AdWebStatBusiness adWebStatBusiness;
        if (webView != null && (adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZIZ(AdWebStatBusiness.class)) != null && i > 10) {
            if (!adWebStatBusiness.LJI.contains(10)) {
                adWebStatBusiness.LJI.add(10);
                adWebStatBusiness.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), adWebStatBusiness.LIZJ(), adWebStatBusiness.LIZLLL(), adWebStatBusiness.LJFF(), adWebStatBusiness.LIZIZ(null, null), 10, adWebStatBusiness.LJI());
            }
            if (i > 30) {
                if (!adWebStatBusiness.LJI.contains(30)) {
                    adWebStatBusiness.LJI.add(30);
                    adWebStatBusiness.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), adWebStatBusiness.LIZJ(), adWebStatBusiness.LIZLLL(), adWebStatBusiness.LJFF(), adWebStatBusiness.LIZIZ(null, null), 30, adWebStatBusiness.LJI());
                }
                if (i > 50) {
                    if (!adWebStatBusiness.LJI.contains(50)) {
                        adWebStatBusiness.LJI.add(50);
                        adWebStatBusiness.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), adWebStatBusiness.LIZJ(), adWebStatBusiness.LIZLLL(), adWebStatBusiness.LJFF(), adWebStatBusiness.LIZIZ(null, null), 50, adWebStatBusiness.LJI());
                    }
                    if (i > 75) {
                        if (!adWebStatBusiness.LJI.contains(75)) {
                            adWebStatBusiness.LJI.add(75);
                            adWebStatBusiness.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), adWebStatBusiness.LIZJ(), adWebStatBusiness.LIZLLL(), adWebStatBusiness.LJFF(), adWebStatBusiness.LIZIZ(null, null), 75, adWebStatBusiness.LJI());
                        }
                        if (i == 100 && !adWebStatBusiness.LJI.contains(100)) {
                            adWebStatBusiness.LJI.add(100);
                            adWebStatBusiness.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), adWebStatBusiness.LIZJ(), adWebStatBusiness.LIZLLL(), adWebStatBusiness.LJFF(), adWebStatBusiness.LIZIZ(null, null), 100, adWebStatBusiness.LJI());
                        }
                    }
                }
            }
        }
        super.onProgressChanged(webView, i);
    }

    @Override // X.C1BVX
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        C1039050d95 c1039050d95 = this.container;
        c1039050d95.getClass();
        new C1039090d99(c1039050d95).onShowCustomView(view, customViewCallback);
    }

    @Override // X.C1BVX
    public void onConsoleMessage(String str, int i, String str2) {
        C1041600dDC c1041600dDC;
        Logger.debug();
        if (str != null && u.LJJIIJZLJL(str, "bytedance://", false)) {
            reportLocalEvent(str);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.bulletBusiness.LIZIZ(AdWebStatBusiness.class);
            if (adWebStatBusiness != null && !TextUtils.isEmpty(str) && u.LJJIIJZLJL(str, "bytedance://log_event_v3", false) && (c1041600dDC = adWebStatBusiness.LIZ.LIZIZ) != null && (c1041600dDC instanceof C1038730d8Z)) {
                try {
                    Uri uri = UriProtector.parse(str);
                    if (Intrinsics.LJFF("log_event_v3", uri.getHost()) && !adWebStatBusiness.LJ) {
                        C20684815ws.LJIJJ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "event"), new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params")));
                        adWebStatBusiness.LJ = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
    }

    @Override // X.C1BVX
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // X.C1BVX
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
            return true;
        }
        return true;
    }

    @Override // X.C1BVX
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.confirm();
            return true;
        }
        return true;
    }

    @Override // X.C1BVX
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
            return true;
        }
        return true;
    }

    @Override // X.C1BVX
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (isEnablePopup(str)) {
            return false;
        }
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
            return true;
        }
        return true;
    }
}
