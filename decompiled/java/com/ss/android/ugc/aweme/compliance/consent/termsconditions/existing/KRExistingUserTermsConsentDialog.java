package com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing;

import X.C01GW;
import X.C0HZQ;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1766570w4V;
import X.C1848410yCV;
import X.C1896207bk;
import X.C197039127h;
import X.C19W7;
import X.C20307214d4;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.C786760Ute;
import X.EnumC335920DEw;
import Y.ACListenerS162S0100000_28;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class KRExistingUserTermsConsentDialog extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KyoiOio9PGs4LD0+OyYjHELIOSJys6PCwjJzx9LT0lOjs6JiJiAh0WMCw/PSY9LxA/LD0HLTchOgw8JjYpJzsXISQgJig=";
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C197039127h LLILZLL;
    public C0HZQ LLIZ;
    public C0HZQ LLIZLLLIL;
    public C0HZQ LLJ;
    public WebView LLJI;
    public WebView LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(123));

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C197039127h LLLLLZL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cvq);
            this.LLILZLL = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    public final TermsConsentInfo LLLLZI() {
        return (TermsConsentInfo) this.LLJILJILJ.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String str;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bcl);
        C19W7 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.LJFF();
        }
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_terms_pp_title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        TextView textView = (TextView) callbackFindViewById;
        TermsConsentInfo termsConsentInfoLLLLZI = LLLLZI();
        String str2 = null;
        if (termsConsentInfoLLLLZI != null) {
            string = termsConsentInfoLLLLZI.title;
        } else {
            string = null;
        }
        if (string == null || string.length() == 0) {
            string = getString(2131829372);
        }
        textView.setText(string);
        KeyEvent.Callback callbackFindViewById2 = this.LLILLJJLI;
        if (callbackFindViewById2 == null) {
            callbackFindViewById2 = findViewById(R.id.tv_terms_pp_desc);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById2;
        }
        TextView textView2 = (TextView) callbackFindViewById2;
        TermsConsentInfo termsConsentInfoLLLLZI2 = LLLLZI();
        if (termsConsentInfoLLLLZI2 == null || (string2 = termsConsentInfoLLLLZI2.description) == null || string2.length() == 0) {
            string2 = getString(2131836372);
        }
        textView2.setText(string2);
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.tv_terms_pp_desc);
            this.LLILLJJLI = (TuxTextView) viewFindViewById;
        }
        viewFindViewById.setBackground(new ColorDrawable(-1));
        KeyEvent.Callback callbackFindViewById3 = this.LLILLL;
        if (callbackFindViewById3 == null) {
            callbackFindViewById3 = findViewById(R.id.tv_terms_pp_checkbox_all);
            this.LLILLL = (TuxTextView) callbackFindViewById3;
        }
        TextView textView3 = (TextView) callbackFindViewById3;
        TermsConsentInfo termsConsentInfoLLLLZI3 = LLLLZI();
        if (termsConsentInfoLLLLZI3 == null || (string3 = termsConsentInfoLLLLZI3.checkboxAll) == null || string3.length() == 0) {
            string3 = getString(2131829367);
        }
        textView3.setText(string3);
        KeyEvent.Callback callbackFindViewById4 = this.LLILZ;
        if (callbackFindViewById4 == null) {
            callbackFindViewById4 = findViewById(R.id.tv_terms_pp_checkbox_terms);
            this.LLILZ = (TuxTextView) callbackFindViewById4;
        }
        TextView textView4 = (TextView) callbackFindViewById4;
        TermsConsentInfo termsConsentInfoLLLLZI4 = LLLLZI();
        if (termsConsentInfoLLLLZI4 == null || (string4 = termsConsentInfoLLLLZI4.checkboxTerms) == null || string4.length() == 0) {
            string4 = getString(2131829451);
        }
        textView4.setText(string4);
        KeyEvent.Callback callbackFindViewById5 = this.LLILZIL;
        if (callbackFindViewById5 == null) {
            callbackFindViewById5 = findViewById(R.id.tv_terms_pp_checkbox_pp);
            this.LLILZIL = (TuxTextView) callbackFindViewById5;
        }
        TextView textView5 = (TextView) callbackFindViewById5;
        TermsConsentInfo termsConsentInfoLLLLZI5 = LLLLZI();
        if (termsConsentInfoLLLLZI5 == null || (string5 = termsConsentInfoLLLLZI5.checkboxPP) == null || string5.length() == 0) {
            string5 = getString(2131829450);
        }
        textView5.setText(string5);
        LLLLLZL().setText(getString(2131836373));
        LLLLLZL().setSupportClickWhenDisable(true);
        KeyEvent.Callback callbackFindViewById6 = this.LLIZ;
        if (callbackFindViewById6 == null) {
            callbackFindViewById6 = findViewById(R.id.dju);
            this.LLIZ = (C0HZQ) callbackFindViewById6;
        }
        C0HZQ c0hzq = (C0HZQ) callbackFindViewById6;
        KeyEvent.Callback callbackFindViewById7 = this.LLIZLLLIL;
        if (callbackFindViewById7 == null) {
            callbackFindViewById7 = findViewById(R.id.djw);
            this.LLIZLLLIL = (C0HZQ) callbackFindViewById7;
        }
        C0HZQ c0hzq2 = (C0HZQ) callbackFindViewById7;
        KeyEvent.Callback callbackFindViewById8 = this.LLJ;
        if (callbackFindViewById8 == null) {
            callbackFindViewById8 = findViewById(R.id.djv);
            this.LLJ = (C0HZQ) callbackFindViewById8;
        }
        C0HZQ c0hzq3 = (C0HZQ) callbackFindViewById8;
        CompoundButton.OnCheckedChangeListener c20307214d4 = new C20307214d4(c0hzq2, c0hzq3, this, c0hzq, 2);
        if (C1848410yCV.LIZ) {
            c20307214d4 = new C786760Ute(c20307214d4);
        }
        c0hzq.setOnCheckedChangeListener(c20307214d4);
        CompoundButton.OnCheckedChangeListener c20307214d42 = new C20307214d4(c0hzq3, c0hzq, this, c0hzq2, 3);
        if (C1848410yCV.LIZ) {
            c20307214d42 = new C786760Ute(c20307214d42);
        }
        c0hzq2.setOnCheckedChangeListener(c20307214d42);
        CompoundButton.OnCheckedChangeListener c20307214d43 = new C20307214d4(c0hzq2, c0hzq, this, c0hzq3, 4);
        if (C1848410yCV.LIZ) {
            c20307214d43 = new C786760Ute(c20307214d43);
        }
        c0hzq3.setOnCheckedChangeListener(c20307214d43);
        TermsConsentInfo termsConsentInfoLLLLZI6 = LLLLZI();
        if (termsConsentInfoLLLLZI6 != null) {
            str = termsConsentInfoLLLLZI6.termsOfUseUrl;
        } else {
            str = null;
        }
        TermsConsentInfo termsConsentInfoLLLLZI7 = LLLLZI();
        if (termsConsentInfoLLLLZI7 != null) {
            str2 = termsConsentInfoLLLLZI7.privacyPolicyUrl;
        }
        if (str != null && str.length() != 0) {
            KeyEvent.Callback callbackFindViewById9 = this.LLJI;
            if (callbackFindViewById9 == null) {
                callbackFindViewById9 = findViewById(R.id.wv_terms);
                this.LLJI = (WebView) callbackFindViewById9;
            }
            LLLLZIL((WebView) callbackFindViewById9, str);
        }
        if (str2 != null && str2.length() != 0) {
            KeyEvent.Callback callbackFindViewById10 = this.LLJIJIL;
            if (callbackFindViewById10 == null) {
                callbackFindViewById10 = findViewById(R.id.wv_pp);
                this.LLJIJIL = (WebView) callbackFindViewById10;
            }
            LLLLZIL((WebView) callbackFindViewById10, str2);
        }
        C786410Ut5.U8(LLLLLZL(), new ACListenerS162S0100000_28(this, 101));
        C20684815ws.LJIILLIIL("qa_kr_terms_dialog_show", new C2344009Gk().LIZ);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896207bk c1896207bk = new C1896207bk(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896207bk);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.consent.termsconditions.existing.KRExistingUserTermsConsentDialog", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public final void LLLLZIL(WebView webView, String str) {
        C786410Ut5.te(webView, new WebViewClient(this) { // from class: X.0dof
            public final Activity LIZ;

            {
                this.LIZ = this;
            }

            public final boolean LIZIZ(String str2) {
                if (str2 == null) {
                    return false;
                }
                if (!u.LJJIIJZLJL(str2, "http://", false) && !u.LJJIIJZLJL(str2, "https://", false)) {
                    if (!u.LJJIIJZLJL(str2, "mailto:", false)) {
                        return false;
                    }
                    Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(str2));
                    try {
                        try {
                            Activity activity = this.LIZ;
                            if (activity != null) {
                                LIZ(activity, intent);
                            }
                            return true;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return true;
                    }
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "//webview");
                smartRouteBuildRoute.withParam(UriProtector.parse(str2));
                smartRouteBuildRoute.withParam("use_webview_title", true);
                smartRouteBuildRoute.open();
                return true;
            }

            public static void LIZ(Activity activity, Intent intent) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4j09XS7lLRAjKOTNRccxEMHBn67QOWGJcvMwskDjxsLo/UBuyfCBiczcrbuEHjy5CAzk/xBhDJMsaw==", null));
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str2) {
                if (C794280VDu.LIZ(webView2, "seclink")) {
                    return LIZIZ(str2);
                }
                C1064860doi.LIZ.getClass();
                if (C1064860doi.LIZLLL(webView2, str2)) {
                    return true;
                }
                return LIZIZ(str2);
            }
        });
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        C786410Ut5.ue(webView, str);
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: X.14LG
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ((ViewGroup) view).requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }
}
