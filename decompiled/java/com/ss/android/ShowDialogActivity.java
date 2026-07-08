package com.ss.android;

import X.C2188811AlT;
import X.C817700W5w;
import X.DialogInterfaceOnClickListenerC854600Xfm;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public class ShowDialogActivity extends Activity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiGiHELIOSc8PwElKCM8LwQvPSYlITE1";

    @Override // android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity
    public final void onResume() {
        String stringExtra;
        String stringExtra2;
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", true);
        super.onResume();
        Intent intent = getIntent();
        String stringExtra3 = null;
        try {
            stringExtra = intent.getStringExtra("event");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (TextUtils.equals(stringExtra, "event_dialog")) {
            try {
                stringExtra2 = intent.getStringExtra("title");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
            try {
                stringExtra3 = intent.getStringExtra("message");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            AlertDialog.Builder title = new AlertDialog.Builder(this).setTitle(stringExtra2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(stringExtra3);
            sbLIZ.append("\nPlease confirm that account sdk is initialized correctly.");
            title.setMessage(C2188811AlT.LIZIZ(sbLIZ)).setPositiveButton("ok", new DialogInterfaceOnClickListenerC854600Xfm(this, 3)).setCancelable(false).show();
        }
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", false);
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
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.kb);
        TTAccountInit.LIZ().getClass();
        finish();
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", false);
    }
}
