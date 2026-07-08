package com.ss.android.ugc.aweme.account.passwordless;

import X.C0BTL;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C723850SaN;
import X.EnumC335920DEw;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class GoPasswordlessActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiOSHELIOS4gOzIjOys/LTY/Zwg8GCQ/Ojg8OiEgLDwgCSY4IDk6PDw=";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessActivity", "onWindowFocusChanged", true);
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
    public final void onCreate(Bundle bundle) throws Throwable {
        Activity activity;
        int iIntValue;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessActivity", "onCreate", true);
        activityConfiguration(AFwS236S0000000_6.get$arr$(36));
        super.onCreate(bundle);
        if (((Number) C0BTL.LIZ.getValue()).intValue() != 2) {
            finish();
        }
        setContentView(R.layout.yl);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibEFf9huRJl0Kdrg4wlX4C9sImXak/mSRH4e/UHcN5kisomwTY=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {0};
        C0WZW c0wzw = new C0WZW(false, "(I)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/passwordless/GoPasswordlessActivity", "setResult", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/passwordless/GoPasswordlessActivity", "setResult", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    activity = (Activity) obj;
                } else {
                    activity = this;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    iIntValue = ((Integer) obj2).intValue();
                }
                activity.setResult(iIntValue);
                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/passwordless/GoPasswordlessActivity", "setResult", null, objArr, activity, c0wzw, true);
            } else {
                activity = this;
            }
            iIntValue = 0;
            activity.setResult(iIntValue);
            c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/passwordless/GoPasswordlessActivity", "setResult", null, objArr, activity, c0wzw, true);
        }
        C723850SaN.LIZIZ(this, new AwS585S0100000_6(this, 35));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.GoPasswordlessActivity", "onCreate", false);
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
