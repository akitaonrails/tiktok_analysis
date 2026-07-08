package com.ss.android.ugc.aweme.account.ui;

import X.C0TVI;
import X.C0XGR;
import X.C1235590iG5;
import X.C1235600iG6;
import X.C1308910kAL;
import X.C14K9;
import X.C1697810uHb;
import X.C19EH;
import X.C20684815ws;
import X.C2187451AjH;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1235570iG3;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.verify.SmsConsentPageFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class SmsConsentPageActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmHELIOSJjFiPCZ9Gyg/CiA9OyAiPR8yLyANKjs6Piw4MA==";
    public String LL = "";
    public String LLILLJJLI = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        int i = C2187451AjH.LIZ;
        C1235600iG6.LIZ(this.LL, "1", "back_pressed", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.kc);
        View viewFindViewById = findViewById(R.id.vn7);
        String stringExtra = null;
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LL = stringExtra;
        try {
            String stringExtra2 = getIntent().getStringExtra("phone_number");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLILLJJLI = str;
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        SmsConsentPageFragment smsConsentPageFragment = new SmsConsentPageFragment();
        smsConsentPageFragment.LLJJLIIIJLLLLLLLZ = new InterfaceC1235570iG3() { // from class: X.0iG7
            @Override // X.InterfaceC1235570iG3
            public final void LJJJJ() throws Throwable {
                int i = C2187451AjH.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1235630iG9(this, null), 3);
                Activity activity = this;
                if (activity != null) {
                    C2204961BRm.LJIIL(12, activity, this.getIntent(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEEPc8mQh54axplZo4BZezUZGmt3Ei6sXEaw==", null));
                }
                this.finish();
            }

            @Override // X.InterfaceC1235570iG3
            public final void onCancel() {
                int i = C2187451AjH.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1235620iG8(this, null), 3);
                this.finish();
            }
        };
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("enter_from", this.LL, bundle2);
        C786410Ut5.LJJJI("phone_number", this.LLILLJJLI, bundle2);
        smsConsentPageFragment.setArguments(bundle2);
        c19ehLJIIJ.LIZIZ(R.id.vn6, smsConsentPageFragment);
        c19ehLJIIJ.LJIIIZ();
        String str2 = this.LL;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("page_name", "user_setting");
        c0xgr.LIZLLL("trigger", str2);
        c0xgr.LIZLLL("show_type", "fullpage");
        c0xgr.LIZLLL("mobile", "1");
        C20684815ws.LJIILLIIL("tiktok_sms_popup_show", c0xgr.LIZ);
        Keva keva = C1235590iG5.LIZ;
        keva.storeInt("sms_consent_show_times", keva.getInt("sms_consent_show_times", 0) + 1);
        keva.storeLong("sms_consent_last_show_time", System.currentTimeMillis());
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0iG4
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view.setPadding(c20244914JjLIZ.LIZ, c20244914JjLIZ.LIZIZ, c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity", "onCreate", false);
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
}
