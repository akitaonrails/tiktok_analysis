package com.ss.android.ugc.aweme.account.login.twostep;

import X.C01GW;
import X.C1233650iCx;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C723850SaN;
import X.EnumC1233700iD2;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepVerificationManagementActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0IStiPTg8HELIOSOzEpOWEHPyofPSojHiA+ICk6KyQ4ICA9BSQiKCg2JSAiPQ4wPCw6IDsq";
    public C1233650iCx LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS557S0100000_13(this, 41));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity", "onCreate", true);
        C1233650iCx c1233650iCx = null;
        try {
            bundle2 = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        String string = bundle2.getString("enter_from", "");
        if (!string.equals(EnumC1233700iD2.MANDATORY_GPPPA_2SV_FULLSHEET.getValue()) && !string.equals(EnumC1233700iD2.NONMANDATORY_GPPPA_2SV_FULLSHEET.getValue())) {
            if (Intrinsics.LJFF(string, EnumC1233700iD2.NONMANDATORY_GPPPA_2SV_PROFILE_POPUP.getValue())) {
                c1233650iCx = new C1233650iCx(true, true, true, 575);
            }
        } else {
            bundle2.getString("title_string", "");
            String string2 = bundle2.getString("description_string", "");
            int i = bundle2.getInt("icon", 0);
            c1233650iCx = new C1233650iCx(string2, Integer.valueOf(i), getString(2131857407), true, true, bundle2.getBoolean("is_skippable", true), true, Integer.valueOf(bundle2.getInt("popup_freq", 0)));
        }
        this.LL = c1233650iCx;
        activityConfiguration(AFwS257S0000000_19.get$arr$(52));
        super.onCreate(bundle);
        setTheme(R.style.my);
        setContentView(R.layout.a05);
        C723850SaN.LIZIZ(this, new AwS598S0100000_19(this, 77));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManagementActivity", "onCreate", false);
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
