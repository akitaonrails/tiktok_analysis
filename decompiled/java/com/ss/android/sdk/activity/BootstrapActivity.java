package com.ss.android.sdk.activity;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1701330uNH;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C817700W5w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes8.dex */
public class BootstrapActivity extends Activity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiOis4ZiQvPSHELIOSYlITE1Zw08JzE/PT0yOAQvPSYlITE1";

    @Override // android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onResume", false);
    }

    @Override // android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
    public final void onCreate(Bundle bundle) throws Throwable {
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            Intent intentLIZIZ = C2162308dZ.LIZIZ(this, getPackageName());
            finish();
            if (intentLIZIZ != null) {
                LIZ(this, intentLIZIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ActivityAgent.onTrace("com.ss.android.sdk.activity.BootstrapActivity", "onCreate", false);
    }

    public static void LIZ(BootstrapActivity bootstrapActivity, Intent intent) throws Throwable {
        Intent intent2 = intent;
        Activity activity = bootstrapActivity;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKdVxsewc0FotKzREVMjNW0nrlipDyYLiOeCThe6C+", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/ss/android/sdk/activity/BootstrapActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/ss/android/sdk/activity/BootstrapActivity", "startActivity", null, objArr, activity, c0wzw, false);
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
        c0wst.LIZ(11098, "com/ss/android/sdk/activity/BootstrapActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }
}
