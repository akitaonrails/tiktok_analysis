package com.ss.android.ugc.aweme.deeplink;

import X.C0CQC;
import X.C0XQS;
import X.C0XQT;
import X.C1389600mGU;
import X.C2188811AlT;
import X.C817700W5w;
import X.C854720Xfy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public final class RequireLoginActivity extends Activity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEpHELIOSLD8/ISsnZx02OTAlOyofJyIlJw4wPCw6IDsq";
    public String LL;
    public Intent LLILLJJLI;
    public boolean LLILLL;
    public final C854720Xfy LLILZ = new C854720Xfy(this, 3);

    @Override // android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onResume", false);
    }

    @Override // android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
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

    public final void LIZ(Intent intent) {
        Intent intent2;
        String stringExtra = null;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LL = stringExtra;
        boolean booleanExtra = false;
        if (intent != null) {
            booleanExtra = intent.getBooleanExtra("is_new_procedure", false);
        }
        this.LLILLL = booleanExtra;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("deep_link_intent")) != null) {
            this.LLILLJJLI = intent2;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ILoginService iLoginServiceLIZJ;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        LIZ(getIntent());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_fullscreen_dialog", true);
        bundle2.putBoolean("is_skippable_dialog", false);
        bundle2.putBoolean("need_callback", true);
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZIZ = "deeplink";
        c0xqs.LIZ = this;
        c0xqs.LJ = this.LLILZ;
        c0xqs.LIZLLL = bundle2;
        C0CQC.LIZ(C0CQC.LIZ);
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (iLoginServiceLIZJ = iAccountService.LIZJ()) != null) {
            iLoginServiceLIZJ.showLoginAndRegisterView(new C0XQT(c0xqs));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", false);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LIZ(intent);
    }
}
