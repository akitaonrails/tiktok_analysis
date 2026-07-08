package com.bytedance.push.notification;

import X.C2188811AlT;
import X.C817700W5w;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class PushActivity extends Activity {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8PDw7ZisjPSHELIOSY1ISYtPSY8JmscPDw7CSY4IDk6PDw=";

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

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c A[Catch: JSONException -> 0x015b, TryCatch #5 {JSONException -> 0x015b, blocks: (B:69:0x012e, B:71:0x013c, B:72:0x0143, B:74:0x0149), top: B:85:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149 A[Catch: JSONException -> 0x015b, TRY_LEAVE, TryCatch #5 {JSONException -> 0x015b, blocks: (B:69:0x012e, B:71:0x013c, B:72:0x0143, B:74:0x0149), top: B:85:0x012e }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.PushActivity.onCreate(android.os.Bundle):void");
    }
}
