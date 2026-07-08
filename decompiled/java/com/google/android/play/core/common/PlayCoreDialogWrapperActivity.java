package com.google.android.play.core.common;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C817700W5w;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes8.dex */
public class PlayCoreDialogWrapperActivity extends Activity {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZjUgKDZ9Kyo+LGEwJyghHELIOSJiF9GCktMAw8OiAIIC4/JyIbOy4jOCA+CCwnITMlPTY=";
    public ResultReceiver LL;

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
        Intent intent;
        Bundle extras;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        PendingIntent pendingIntent = null;
        obj = null;
        Object obj = null;
        pendingIntent = null;
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.LL = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                extras = getIntent().getExtras();
                if (extras != null) {
                    try {
                        obj = extras.get("confirmation_intent");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    pendingIntent = (PendingIntent) obj;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                extras = null;
            }
            if (extras != null && pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                    return;
                } catch (IntentSender.SendIntentException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    ResultReceiver resultReceiver = this.LL;
                    if (resultReceiver != null) {
                        resultReceiver.send(3, new Bundle());
                    }
                    finish();
                    return;
                }
            }
            ResultReceiver resultReceiver2 = this.LL;
            if (resultReceiver2 != null) {
                resultReceiver2.send(3, new Bundle());
            }
            finish();
            return;
        }
        this.LL = (ResultReceiver) bundle.getParcelable("result_receiver");
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C786410Ut5.LJJIJL(bundle, "result_receiver", this.LL);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.LL) != null) {
            if (i2 == -1) {
                resultReceiver.send(1, new Bundle());
            } else if (i2 == 0) {
                resultReceiver.send(2, new Bundle());
            }
        }
        finish();
    }
}
