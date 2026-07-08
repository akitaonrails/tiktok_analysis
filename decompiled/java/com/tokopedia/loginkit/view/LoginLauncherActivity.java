package com.tokopedia.loginkit.view;

import X.AbstractC823950WTx;
import X.C0WST;
import X.C0WSU;
import X.C0WU0;
import X.C0WZW;
import X.C0WZX;
import X.C13LQ;
import X.C1701330uNH;
import X.C19GS;
import X.C1A6V;
import X.C2409809cO;
import X.C786410Ut5;
import X.C810670Vr7;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tokopedia.loginkit.view.LoginLauncherActivity;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class LoginLauncherActivity extends C19GS {
    public static final String _pnsPageId = "KyohZzs8Iyo8LCs6KWsgJig6Ji4lPWElISHELIOSA7ZwM8LywiBS4mJiYkLD0SKzElPyYnMQ==";
    public WebView LL;
    public String LLILLJJLI = "";
    public boolean LLILLL;

    public final boolean LLLLZLL() {
        try {
            C786410Ut5.Y3(getPackageManager(), "com.tokopedia.tkpd", 0);
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            PackageManager packageManager = applicationContext.getPackageManager();
            int i = Build.VERSION.SDK_INT;
            String strLLLLZI = i >= 28 ? LLLLZI(C786410Ut5.Y3(packageManager, "com.tokopedia.tkpd", 134217728).signingInfo.getSigningCertificateHistory()) : LLLLZI(C786410Ut5.Y3(packageManager, "com.tokopedia.tkpd", 64).signatures);
            if (strLLLLZI.length() <= 0 || !Intrinsics.LJFF(strLLLLZI, "7456F3BE6944332817E43ECE6A053F9744466C95F536C4503F25330237DD81BE")) {
                return false;
            }
            Context applicationContext2 = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext2 == null) {
                applicationContext2 = C2409809cO.LIZ;
            }
            if ((i >= 28 ? C786410Ut5.Y3(applicationContext2.getPackageManager(), "com.tokopedia.tkpd", 0).getLongVersionCode() : r0.versionCode) < 320326700) {
                return false;
            }
            try {
                return getIntent().getExtras() != null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public final void LLLLZLLIL() {
        WebSettings settings;
        String stringExtra = null;
        try {
            stringExtra = getIntent().getStringExtra("client_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        try {
            String stringExtra2 = getIntent().getStringExtra("code_challenge");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        boolean booleanExtra = getIntent().getBooleanExtra("keep_cache", false);
        WebView webView = this.LL;
        if (webView != null && (settings = webView.getSettings()) != null) {
            settings.setJavaScriptEnabled(true);
            settings.setCacheMode(2);
            settings.setDomStorageEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
        }
        WebView webView2 = this.LL;
        if (webView2 != null) {
            C786410Ut5.te(webView2, new WebViewClient() { // from class: X.0W4a
                public static void LIZ(LoginLauncherActivity loginLauncherActivity, Intent intent) throws Throwable {
                    Intent intent2 = intent;
                    Activity activity = loginLauncherActivity;
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent2, activity);
                    C0WZX c0wzx = new C0WZX("dzBzEhY1VMXMUFMoRFyIaQ9kkGgQ3RYrWQtuevEKIsWtLR4VNAMRZX4DQaNU8mXjiQ==", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = {intent2};
                    C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/tokopedia/loginkit/view/LoginLauncherActivity", "startActivity", activity, objArr, "void", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        c0wst.LIZ(11098, "com/tokopedia/loginkit/view/LoginLauncherActivity", "startActivity", null, objArr, activity, c0wzw, false);
                        return;
                    }
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            activity = (Activity) obj;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            intent2 = (Intent) obj2;
                        }
                    }
                    activity.startActivity(intent2);
                    c0wst.LIZ(11098, "com/tokopedia/loginkit/view/LoginLauncherActivity", "startActivity", null, objArr, activity, c0wzw, true);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) throws Throwable {
                    String string;
                    String string2;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    if (webResourceRequest != null) {
                        Uri url = webResourceRequest.getUrl();
                        if (url != null && (string2 = url.toString()) != null && u.LJJIIJZLJL(string2, this.LIZ.LLILLJJLI, false)) {
                            Uri url2 = webResourceRequest.getUrl();
                            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = null;
                            if (url2 != null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(url2, "error");
                            }
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                            }
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() == 0) {
                                Uri url3 = webResourceRequest.getUrl();
                                if (url3 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(url3, "code")) == null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                                }
                                C0WU0.LIZIZ.getValue().LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "", "");
                            } else {
                                Uri url4 = webResourceRequest.getUrl();
                                if (url4 == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(url4, "error_code")) == null) {
                                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                                }
                                C0WU0.LIZIZ.getValue().LIZ("", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            }
                            this.LIZ.finish();
                            return true;
                        }
                        Uri url5 = webResourceRequest.getUrl();
                        if (url5 != null && (string = url5.toString()) != null && u.LJJIIJZLJL(string, "https://tokopedia.link/get-the-app", false)) {
                            try {
                                LIZ(this.LIZ, new Intent("android.intent.action.VIEW", UriProtector.parse("market://details?id=com.tokopedia.tkpd")));
                                return true;
                            } catch (ActivityNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                LIZ(this.LIZ, new Intent("android.intent.action.VIEW", UriProtector.parse("https://play.google.com/store/apps/details?id=com.tokopedia.tkpd")));
                                return true;
                            }
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView3, webResourceRequest);
                }
            });
        }
        int i = C810670Vr7.LIZJ(this, 0, "ENV_PREF").getInt("LOCAL_ENV", 1);
        Object obj = (i == 1 || i != 2) ? new AbstractC823950WTx() { // from class: X.0WTy
        } : new AbstractC823950WTx() { // from class: X.0WTw
        };
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(Intrinsics.LJFF(obj, new AbstractC823950WTx() { // from class: X.0WTw
        }) ? "https://accounts.tokopedia.com/oauth/sso" : "https://accounts-staging.tokopedia.com/oauth/sso").buildUpon().appendQueryParameter("client_id", stringExtra).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", this.LLILLJJLI).appendQueryParameter("code_challenge", str);
        if (!booleanExtra) {
            builderAppendQueryParameter.appendQueryParameter("force_logout", "true");
        }
        WebView webView3 = this.LL;
        if (webView3 != null) {
            C786410Ut5.ue(webView3, builderAppendQueryParameter.build().toString());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (LLLLZLL()) {
            super.onBackPressed();
            return;
        }
        WebView webView = this.LL;
        if (webView == null || !webView.canGoBack()) {
            C0WU0.LIZIZ.getValue().LIZ("", "User click on back button", "client_error");
            super.onBackPressed();
        } else {
            WebView webView2 = this.LL;
            if (webView2 != null) {
                webView2.goBack();
            }
        }
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static String LLLLZI(Signature[] signatureArr) throws NoSuchAlgorithmException {
        new ArrayList(signatureArr.length);
        if (signatureArr.length > 0) {
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(signature.toByteArray());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append("0123456789ABCDEF".charAt((b >>> 4) & 15));
                sb.append("0123456789ABCDEF".charAt(b & 15));
            }
            return sb.toString();
        }
        return "";
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        String stringExtra;
        ActivityInfo[] activityInfoArr;
        super.onCreate(bundle);
        setContentView(R.layout.j6);
        Bundle extras = null;
        try {
            stringExtra = getIntent().getStringExtra("redirect_uri");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLILLJJLI = stringExtra;
        this.LL = (WebView) findViewById(R.id.webView);
        if (LLLLZLL()) {
            try {
                extras = getIntent().getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LLILLL = false;
            try {
                activityInfoArr = C786410Ut5.Y3(getPackageManager(), "com.tokopedia.tkpd", 1).activities;
            } catch (PackageManager.NameNotFoundException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (Intrinsics.LJFF(activityInfo.name, "com.tokopedia.loginregister.login_sdk.LoginSdkActivity")) {
                        Intent intent = new Intent();
                        try {
                            intent.setComponent(new ComponentName("com.tokopedia.tkpd", "com.tokopedia.loginregister.login_sdk.LoginSdkActivity"));
                            C786410Ut5.LJJJI("sign_cert", LLLLZIL(this, getPackageName()), extras);
                            C786410Ut5.LJJJI("package_name", getPackageName(), extras);
                            C786410Ut5.LJJJI("result_via_uri", getPackageName(), extras);
                            intent.putExtras(extras);
                            LLLLLZL(this, intent);
                            break;
                        } catch (ActivityNotFoundException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            this.LLILLL = true;
                            LLLLZLLIL();
                        }
                    }
                }
                LLLLZLLIL();
            } else {
                LLLLZLLIL();
            }
        } else {
            LLLLZLLIL();
        }
        C1A6V c1a6v = new C1A6V(getWindow(), getWindow().getDecorView());
        c1a6v.LIZJ(true);
        c1a6v.LIZIZ(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    public static void LLLLLZL(LoginLauncherActivity loginLauncherActivity, Intent intent) throws Throwable {
        Intent intent2;
        ComponentActivity componentActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(loginLauncherActivity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, loginLauncherActivity);
        C0WZX c0wzx = new C0WZX("dzBzEhY1VMXMUFMoRFyIaQ9kkGgQ3RYrWQtuevEKIsWtLR4VNAMRZX4DQaNU8mXjiQ==", null);
        C0WST c0wst = new C0WST();
        int iIntValue = 100;
        Object[] objArr = {intent, 100};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11094, "com/tokopedia/loginkit/view/LoginLauncherActivity", "startActivityForResult", loginLauncherActivity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11094, "com/tokopedia/loginkit/view/LoginLauncherActivity", "startActivityForResult", null, objArr, loginLauncherActivity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                componentActivity = (ComponentActivity) obj;
            } else {
                componentActivity = loginLauncherActivity;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                iIntValue = ((Integer) obj3).intValue();
            }
        } else {
            intent2 = intent;
            componentActivity = loginLauncherActivity;
        }
        componentActivity.startActivityForResult(intent2, iIntValue);
        c0wst.LIZ(11094, "com/tokopedia/loginkit/view/LoginLauncherActivity", "startActivityForResult", null, objArr, componentActivity, c0wzw, true);
    }

    public static String LLLLZIL(Context context, String str) {
        try {
            return C13LQ.LJJIJIL(MessageDigest.getInstance("SHA-256").digest(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(((Signature) C13LQ.LJIL(C786410Ut5.Y3(context.getPackageManager(), str, 64).signatures)).toByteArray()))).getEncoded()), ":", AFwS231S0000000_3.get$arr$(114));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && !this.LLILLL) {
            C0WU0 value = C0WU0.LIZIZ.getValue();
            value.getClass();
            String stringExtra2 = null;
            if (intent != null) {
                try {
                    stringExtra2 = intent.getStringExtra("auth_code");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String str = "";
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            if (intent == null) {
                stringExtra = "";
            } else {
                try {
                    stringExtra = intent.getStringExtra("error");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
            }
            if (intent != null) {
                try {
                    String stringExtra3 = intent.getStringExtra("error_code");
                    if (stringExtra3 != null) {
                        str = stringExtra3;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            value.LIZ(stringExtra2, stringExtra, str);
            finish();
        }
    }
}
