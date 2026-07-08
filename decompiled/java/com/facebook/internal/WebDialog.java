package com.facebook.internal;

import X.C0W7K;
import X.C0W7Q;
import X.C0WP3;
import X.C0WV9;
import X.C0WVB;
import X.C0WZX;
import X.C1064820doe;
import X.C1602160rnK;
import X.C19EG;
import X.C1BIN;
import X.C1BJO;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C785410UrT;
import X.C786410Ut5;
import X.C824950WXt;
import X.DialogC19728412Gs;
import X.DialogInterfaceOnCancelListenerC2249031D0z;
import X.EnumC824980WXw;
import X.InterfaceC2202491BHz;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS168S0100000_34;
import Y.ATListenerS168S0000000_33;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.WebDialog;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes35.dex */
public class WebDialog extends DialogC19728412Gs {
    public static volatile int LLJILJILJ;
    public String LL;
    public String LLILLJJLI;
    public InterfaceC2202491BHz LLILLL;
    public C1064820doe LLILZ;
    public ProgressDialog LLILZIL;
    public ImageView LLILZLL;
    public FrameLayout LLIZ;
    public final C0WV9 LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public WindowManager.LayoutParams LLJILJIL;

    @Override // X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        AutofillManager autofillManager;
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.LLJI = false;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.LLJILJIL) != null) {
            if (layoutParams.token == null) {
                Activity ownerActivity = getOwnerActivity();
                layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                WindowManager.LayoutParams layoutParams2 = this.LLJILJIL;
                Intrinsics.LJIIJJI(layoutParams2 != null ? layoutParams2.token : null, "Set token on onAttachedToWindow(): ");
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LLJI = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.LLILLL == null || this.LLJ) {
            return;
        }
        LJJLJLI(new C1BIN());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        C1064820doe c1064820doe = this.LLILZ;
        if (c1064820doe != null) {
            c1064820doe.stopLoading();
        }
        if (!this.LLJI && (progressDialog = this.LLILZIL) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            C785410UrT.LIZ(progressDialog);
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C0WV9 c0wv9 = this.LLIZLLLIL;
        if (c0wv9 != null) {
            c0wv9.cancel(true);
            ProgressDialog progressDialog = this.LLILZIL;
            if (progressDialog != null) {
                progressDialog.dismiss();
                C785410UrT.LIZ(progressDialog);
            }
        }
        super.onStop();
    }

    public final void LJJLJ() throws Throwable {
        Object objH2 = C786410Ut5.H2(getContext(), "window");
        if (objH2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) objH2, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloSc70WvLXeEwg==", new String[]{"019e5"}));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayLLILZIL.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i >= i2) {
            i2 = i;
        }
        int i4 = (int) (i3 / displayMetrics.density);
        int iMin = Math.min((int) (((double) i3) * (i4 <= 480 ? 1.0d : i4 >= 800 ? 0.5d : ((((double) (800 - i4)) / ((double) 320)) * 0.5d) + 0.5d)), i);
        int i5 = (int) (i2 / displayMetrics.density);
        int iMin2 = Math.min((int) (((double) i2) * (i5 > 800 ? i5 >= 1280 ? 0.5d : ((((double) (1280 - i5)) / ((double) 480)) * 0.5d) + 0.5d : 1.0d)), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() throws Throwable {
        super.onStart();
        C0WV9 c0wv9 = this.LLIZLLLIL;
        if (c0wv9 == null || c0wv9.getStatus() != AsyncTask.Status.PENDING) {
            LJJLJ();
            return;
        }
        C0WV9 c0wv92 = this.LLIZLLLIL;
        if (c0wv92 != null) {
            C0WP3.LIZIZ(c0wv92, new Void[0]);
        }
        ProgressDialog progressDialog = this.LLILZIL;
        if (progressDialog != null) {
            C786410Ut5.C4(progressDialog);
        }
    }

    public static final void LJJLIIIJLLLLLLLZ(Context context) {
        try {
            ApplicationInfo applicationInfoV3 = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128);
            if (applicationInfoV3 != null && applicationInfoV3.metaData != null && LLJILJILJ == 0) {
                int i = applicationInfoV3.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i == 0) {
                    i = R.style.aa6;
                }
                LLJILJILJ = i;
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public Bundle LJJLIIJ(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleLJIJ = C0W7Q.LJIJ(uri.getQuery());
        C786410Ut5.LJJIIJZLJL(bundleLJIJ, C0W7Q.LJIJ(uri.getFragment()));
        return bundleLJIJ;
    }

    public final void LJJLJLI(Throwable th) {
        C1BJO c1bjo;
        if (this.LLILLL != null && !this.LLJ) {
            this.LLJ = true;
            if (th instanceof C1BJO) {
                c1bjo = (C1BJO) th;
            } else {
                c1bjo = new C1BJO(th);
            }
            InterfaceC2202491BHz interfaceC2202491BHz = this.LLILLL;
            if (interfaceC2202491BHz != null) {
                interfaceC2202491BHz.LIZ(null, c1bjo);
            }
            dismiss();
            C785410UrT.LIZ(this);
        }
    }

    public final void LJJLL(int i) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        C1064820doe c1064820doe = new C1064820doe(getContext());
        this.LLILZ = c1064820doe;
        c1064820doe.setVerticalScrollBarEnabled(false);
        C1064820doe c1064820doe2 = this.LLILZ;
        if (c1064820doe2 != null) {
            c1064820doe2.setHorizontalScrollBarEnabled(false);
        }
        C1064820doe c1064820doe3 = this.LLILZ;
        if (c1064820doe3 != null) {
            C786410Ut5.te(c1064820doe3, new WebViewClient() { // from class: X.1BHy
                public final boolean LIZ(String str) {
                    boolean z;
                    int i2;
                    Intrinsics.LJIIJJI(str, "Redirect URL: ");
                    Uri uri = Uri.parse(str);
                    if (uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (u.LJJIIJZLJL(str, this.LIZ.LLILLJJLI, false)) {
                        Bundle bundleLJJLIIJ = this.LIZ.LJJLIIJ(str);
                        String string = bundleLJJLIIJ.getString("error");
                        if (string == null) {
                            string = bundleLJJLIIJ.getString("error_type");
                        }
                        String string2 = bundleLJJLIIJ.getString("error_msg");
                        if (string2 == null && (string2 = bundleLJJLIIJ.getString("error_message")) == null) {
                            string2 = bundleLJJLIIJ.getString("error_description");
                        }
                        String string3 = bundleLJJLIIJ.getString("error_code");
                        if (string3 != null && !C0W7Q.LJIILL(string3)) {
                            try {
                                i2 = Integer.parseInt(string3);
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                                i2 = -1;
                            }
                        } else {
                            i2 = -1;
                        }
                        if (C0W7Q.LJIILL(string) && C0W7Q.LJIILL(string2) && i2 == -1) {
                            WebDialog webDialog = this.LIZ;
                            InterfaceC2202491BHz interfaceC2202491BHz = webDialog.LLILLL;
                            if (interfaceC2202491BHz != null && !webDialog.LLJ) {
                                webDialog.LLJ = true;
                                interfaceC2202491BHz.LIZ(bundleLJJLIIJ, null);
                                webDialog.dismiss();
                                C785410UrT.LIZ(webDialog);
                            }
                            return true;
                        }
                        if (string != null && (Intrinsics.LJFF(string, "access_denied") || Intrinsics.LJFF(string, "OAuthAccessDeniedException"))) {
                            this.LIZ.cancel();
                            return true;
                        }
                        if (i2 == 4201) {
                            this.LIZ.cancel();
                            return true;
                        }
                        this.LIZ.LJJLJLI(new C0WVE(new FacebookRequestError(i2, string, string2), string2));
                        return true;
                    }
                    if (u.LJJIIJZLJL(str, "fbconnect://cancel", false)) {
                        this.LIZ.cancel();
                        return true;
                    }
                    if (z || a0.LJJIIZI(str, "touch", false)) {
                        return false;
                    }
                    try {
                        Context context = this.LIZ.getContext();
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, context);
                        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloSc70WvLXeEwg==", new String[]{"019e5"}));
                        return true;
                    } catch (ActivityNotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return false;
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    ProgressDialog progressDialog;
                    super.onPageFinished(webView, str);
                    WebDialog webDialog = this.LIZ;
                    if (!webDialog.LLJI && (progressDialog = webDialog.LLILZIL) != null) {
                        progressDialog.dismiss();
                        C785410UrT.LIZ(progressDialog);
                    }
                    FrameLayout frameLayout = this.LIZ.LLIZ;
                    if (frameLayout != null) {
                        frameLayout.setBackgroundColor(0);
                    }
                    C1064820doe c1064820doe4 = this.LIZ.LLILZ;
                    if (c1064820doe4 != null) {
                        int visibility = c1064820doe4.getVisibility();
                        c1064820doe4.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, c1064820doe4);
                    }
                    ImageView imageView = this.LIZ.LLILZLL;
                    if (imageView != null) {
                        C786410Ut5.LJZI(0, imageView);
                    }
                    this.LIZ.LLJIJIL = true;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (C794280VDu.LIZ(webView, "seclink")) {
                        return LIZ(str);
                    }
                    C1064860doi.LIZ.getClass();
                    if (C1064860doi.LIZLLL(webView, str)) {
                        return true;
                    }
                    return LIZ(str);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    ProgressDialog progressDialog;
                    Intrinsics.LJIIJJI(str, "Webview loading URL: ");
                    super.onPageStarted(webView, str, bitmap);
                    WebDialog webDialog = this.LIZ;
                    if (!webDialog.LLJI && (progressDialog = webDialog.LLILZIL) != null) {
                        C786410Ut5.C4(progressDialog);
                    }
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    sslErrorHandler.cancel();
                    this.LIZ.LJJLJLI(new C141R(null, -11, null));
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i2, String str, String str2) {
                    super.onReceivedError(webView, i2, str, str2);
                    this.LIZ.LJJLJLI(new C141R(str, i2, str2));
                }
            });
        }
        C1064820doe c1064820doe4 = this.LLILZ;
        WebSettings settings3 = null;
        if (c1064820doe4 != null) {
            settings3 = c1064820doe4.getSettings();
        }
        if (settings3 != null) {
            settings3.setJavaScriptEnabled(true);
        }
        C1064820doe c1064820doe5 = this.LLILZ;
        if (c1064820doe5 != null) {
            String str = this.LL;
            if (str != null) {
                C786410Ut5.ue(c1064820doe5, str);
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        C1064820doe c1064820doe6 = this.LLILZ;
        if (c1064820doe6 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1064820doe6);
            c1064820doe6.setLayoutParams(layoutParams);
        }
        C1064820doe c1064820doe7 = this.LLILZ;
        if (c1064820doe7 != null) {
            int visibility = c1064820doe7.getVisibility();
            c1064820doe7.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c1064820doe7);
        }
        C1064820doe c1064820doe8 = this.LLILZ;
        if (c1064820doe8 != null && (settings2 = c1064820doe8.getSettings()) != null) {
            settings2.setSavePassword(false);
        }
        C1064820doe c1064820doe9 = this.LLILZ;
        if (c1064820doe9 != null && (settings = c1064820doe9.getSettings()) != null) {
            settings.setSaveFormData(false);
        }
        C1064820doe c1064820doe10 = this.LLILZ;
        if (c1064820doe10 != null) {
            c1064820doe10.setFocusable(true);
        }
        C1064820doe c1064820doe11 = this.LLILZ;
        if (c1064820doe11 != null) {
            c1064820doe11.setFocusableInTouchMode(true);
        }
        C1064820doe c1064820doe12 = this.LLILZ;
        if (c1064820doe12 != null) {
            c1064820doe12.setOnTouchListener(new ATListenerS168S0000000_33(1));
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.LLILZ);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.LLILZIL = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.LLILZIL;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(2131828977));
        }
        ProgressDialog progressDialog3 = this.LLILZIL;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.LLILZIL;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterfaceOnCancelListenerC2249031D0z(this, 1));
        }
        requestWindowFeature(1);
        this.LLIZ = new FrameLayout(getContext());
        LJJLJ();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.LLILZLL = imageView;
        C786410Ut5.Q7(imageView, new ACListenerS168S0100000_34(this, 38));
        Drawable drawable = getContext().getResources().getDrawable(2130970453);
        ImageView imageView2 = this.LLILZLL;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.LLILZLL;
        if (imageView3 != null) {
            C786410Ut5.LJZI(4, imageView3);
        }
        if (this.LL != null) {
            ImageView imageView4 = this.LLILZLL;
            if (imageView4 != null) {
                LJJLL((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            frameLayout.addView(this.LLILZLL, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.LLIZ;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.LLJILJIL = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WebDialog(C19EG c19eg, String str) {
        C0W7K.LJFF();
        int i = LLJILJILJ;
        if (i == 0) {
            C0W7K.LJFF();
            i = LLJILJILJ;
        }
        super(c19eg, i);
        this.LLILLJJLI = "fbconnect://success";
        this.LL = str;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C1064820doe c1064820doe = this.LLILZ;
            if (c1064820doe != null && Intrinsics.LJFF(Boolean.valueOf(c1064820doe.canGoBack()), Boolean.TRUE)) {
                C1064820doe c1064820doe2 = this.LLILZ;
                if (c1064820doe2 != null) {
                    c1064820doe2.goBack();
                    return true;
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebDialog(Context context, String str, Bundle bundle, EnumC824980WXw enumC824980WXw, InterfaceC2202491BHz interfaceC2202491BHz) {
        Uri uriLIZ;
        super(context, LLJILJILJ);
        C0W7K.LJFF();
        this.LLILLJJLI = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = C0W7Q.LJIILIIL(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.LLILLJJLI = str2;
        C786410Ut5.LJJJI("redirect_uri", str2, bundle);
        C786410Ut5.LJJJI("display", "touch", bundle);
        C786410Ut5.LJJJI("client_id", FacebookSdk.LIZLLL(), bundle);
        Locale locale = Locale.ROOT;
        C786410Ut5.E2();
        C786410Ut5.LJJJI("sdk", C786410Ut5.k4(locale, "android-%s", Arrays.copyOf(new Object[]{"17.0.0"}, 1)), bundle);
        this.LLILLL = interfaceC2202491BHz;
        if (Intrinsics.LJFF(str, "share") && bundle.containsKey("media")) {
            this.LLIZLLLIL = new C0WV9(this, str, bundle);
            return;
        }
        if (C824950WXt.LIZ[enumC824980WXw.ordinal()] == 1) {
            uriLIZ = C0W7Q.LIZ(C0WVB.LIZIZ(), "oauth/authorize", bundle);
        } else {
            String strLIZ = C0WVB.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.D2());
            sbLIZ.append("/dialog/");
            sbLIZ.append((Object) str);
            uriLIZ = C0W7Q.LIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ), bundle);
        }
        this.LL = uriLIZ.toString();
    }
}
