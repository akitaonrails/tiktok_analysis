package com.ss.android.ugc.aweme.account.ui;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1238480iKk;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.verify.EmailConsentPageFragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class EmailConsentPageActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmHELIOSJjFiPCZ9DSgtICMQJys/LCEnGCQrLA4wPCw6IDsq";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) getSupportFragmentManager().LJJJJZ(R.id.gys);
        if (baseAccountFlowFragment == null || !baseAccountFlowFragment.onBackPressed()) {
            if (getSupportFragmentManager().LJJLIIIIJ() == 1) {
                finish();
            } else if (isActive()) {
                getSupportFragmentManager().LJLLILLLL();
            }
        }
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
        final String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.iw);
        try {
            stringExtra = getIntent().getStringExtra("enter_from");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        EmailConsentPageFragment emailConsentPageFragment = new EmailConsentPageFragment();
        emailConsentPageFragment.LLJLIL = new InterfaceC1238480iKk() { // from class: X.0iKq
            @Override // X.InterfaceC1238480iKk
            public final void LJIJ() {
                C1238470iKj.LIZ(stringExtra, "back");
                this.finish();
            }

            @Override // X.InterfaceC1238480iKk
            public final void LJJJJ() {
                ComplianceServiceProvider.LJIJ().LIZIZ(EnumC1238710iL7.GRANTED);
                C1238470iKj.LIZ(stringExtra, "get_updates");
                C707370Rot.LIZ.LIZIZ("email_consent_status").postValue(new C745430TLx(true));
                this.finish();
            }

            @Override // X.InterfaceC1238480iKk
            public final void onCancel() {
                ComplianceServiceProvider.LJIJ().LIZIZ(EnumC1238710iL7.REJECTED);
                C1238470iKj.LIZ(stringExtra, "no_thanks");
                this.finish();
            }
        };
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("enter_from", stringExtra, bundle2);
        emailConsentPageFragment.setArguments(bundle2);
        c19ehLJIIJ.LIZIZ(R.id.gys, emailConsentPageFragment);
        c19ehLJIIJ.LJIIIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.EmailConsentPageActivity", "onCreate", false);
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
