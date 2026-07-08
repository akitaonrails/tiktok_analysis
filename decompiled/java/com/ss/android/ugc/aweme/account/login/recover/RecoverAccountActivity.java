package com.ss.android.ugc.aweme.account.login.recover;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C19314110hH;
import X.C2188811AlT;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RecoverAccountActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSHELIOSA0IStiOyowJzMpO2EBLSYjPyohCSYvJjo9PAQvPSYlITE1";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onWindowFocusChanged", true);
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
        boolean z;
        String strLJII;
        Bundle bundle2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", true);
        activityConfiguration(AFwS257S0000000_19.get$arr$(44));
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService != null && iAccountLoginMethodsService.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            if (iAccountLoginMethodsService.LJIIIZ()) {
                strLJII = iAccountLoginMethodsService.LJII();
            } else {
                finish();
                strLJII = "";
            }
        } else {
            C19314110hH.LIZ.getClass();
            strLJII = C19314110hH.LIZ().recoverAccountUrl;
            if (strLJII == null) {
                strLJII = "";
            }
            if (strLJII.length() == 0) {
                strLJII = "sslocal://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Faccount_lookup_tool%3Fscene%3D4%26use_spark%3D1%26keyboard_adjust%3D2%26hide_nav_bar%3D1%26append_common_params%3D1%26disable_ttnet_proxy%3D0";
            }
        }
        try {
            String stringExtra = getIntent().getStringExtra("enter_from");
            if (stringExtra != null) {
                str = stringExtra;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJII);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&enter_from=");
        sbLIZ2.append(str);
        sbLIZ.append(URLEncoder.encode(C2188811AlT.LIZIZ(sbLIZ2), "UTF-8"));
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, C2188811AlT.LIZIZ(sbLIZ));
        try {
            bundle2 = getIntent().getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        smartRouteBuildRoute.withParam(bundle2);
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.withAnimation(R.anim.fv, R.anim.aa);
        smartRouteBuildRoute.open();
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", false);
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
