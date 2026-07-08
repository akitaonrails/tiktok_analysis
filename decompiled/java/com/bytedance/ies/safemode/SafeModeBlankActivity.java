package com.bytedance.ies.safemode;

import X.C1BMY;
import X.C2188811AlT;
import X.C817700W5w;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public final class SafeModeBlankActivity extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OyQqLCI8HELIOSLCBiGi41LQgjLSoRJCQiIg4wPCw6IDsq";

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
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        C1BMY c1bmyLIZIZ = C1BMY.LIZIZ();
        ExceptionManager.ExceptionRecord exceptionRecord = c1bmyLIZIZ.LIZJ;
        if (exceptionRecord != null) {
            c1bmyLIZIZ.LJ(exceptionRecord, c1bmyLIZIZ.LIZLLL);
        }
    }
}
