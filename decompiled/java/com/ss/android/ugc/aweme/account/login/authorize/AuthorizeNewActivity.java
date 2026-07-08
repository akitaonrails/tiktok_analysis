package com.ss.android.ugc.aweme.account.login.authorize;

import X.C0CQH;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EG;
import X.C2204931BRj;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC19305410fs;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class AuthorizeNewActivity extends BaseActivity implements InterfaceC19305410fs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSHELIOSA0IStiKDonICo+IDU2ZgQ5PSc8Oiw2LAE2PwQvPSYlITE1";
    public final C2204931BRj LL = new C2204931BRj();

    @Override // X.InterfaceC19305410fs
    public final C19EG getFragmentActivity() {
        return this;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC19305410fs
    public final boolean LJLJI() {
        return isFinishing() || isDestroyed();
    }

    @Override // X.InterfaceC19305410fs
    public final int LLLLLJIL() {
        return getTaskId();
    }

    @Override // X.InterfaceC19305410fs
    public final Intent getParameter() {
        return getIntent();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() throws Throwable {
        String stringExtra;
        try {
            stringExtra = getIntent().getStringExtra("platform");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (Intrinsics.LJFF(stringExtra, "passkey") || Intrinsics.LJFF(stringExtra, "google_onetap")) {
            LLILII(new Intent(), 0);
        } else {
            super.onBackPressed();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity", "onCreate", true);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.zz);
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        this.LL.LJIIJJI(this);
        C0CQH.LIZ.getClass();
        C0CQH.LIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity", "onCreate", false);
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

    @Override // X.InterfaceC19305410fs
    public final void LLILII(Intent intent, Integer num) throws Throwable {
        Activity activity;
        Intent intent2;
        if (num != null) {
            int iIntValue = num.intValue();
            C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owskw7ZzjpAkGL23W6ZUpSsOMbBq/SWFCPVXgZooazy3", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = {Integer.valueOf(iIntValue), intent};
            C0WZW c0wzw = new C0WZW(false, "(ILandroid/content/Intent;)V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11071, "com/ss/android/ugc/aweme/account/login/authorize/AuthorizeNewActivity", "setResult", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/authorize/AuthorizeNewActivity", "setResult", null, objArr, this, c0wzw, false);
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
                    Object obj3 = c0wsuLIZIZ.LIZJ[2];
                    if (obj3 != null) {
                        intent2 = (Intent) obj3;
                    } else {
                        intent2 = intent;
                    }
                } else {
                    activity = this;
                    intent2 = intent;
                }
                activity.setResult(iIntValue, intent2);
                c0wst.LIZ(11071, "com/ss/android/ugc/aweme/account/login/authorize/AuthorizeNewActivity", "setResult", null, objArr, activity, c0wzw, true);
            }
        }
        finish();
    }
}
