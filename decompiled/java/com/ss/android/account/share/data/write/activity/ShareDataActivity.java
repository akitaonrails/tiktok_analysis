package com.ss.android.account.share.data.write.activity;

import X.C0WI2;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C810670Vr7;
import X.C817700W5w;
import X.C820130WFf;
import X.C820820WHw;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class ShareDataActivity extends Activity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiKCwwJzAiPWEgICQ+LGE3KTEtHELIOSZzghITEpZy4wPCw6IDsqZhYkKD02DCQ4KA4wPCw6IDsq";

    @Override // android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onResume", false);
    }

    @Override // android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public ShareDataActivity() {
        new LinkedHashMap();
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
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = new Intent();
        try {
            C820820WHw c820820WHw = C820820WHw.LIZ;
            String callingPackage = getCallingPackage();
            c820820WHw.getClass();
            if (!C820820WHw.LIZ(callingPackage)) {
                intent.putExtra("EXTRA_IS_SUCCESS", 0);
                C2204961BRm.LLLLZLLLI(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKZylIDzO5MvA7/D1DaU//QncYdlp6oA48VCNVII1eJp8MoU3bMToRnLBGA8kby1A0/iD7", null));
            } else {
                intent.putExtra("EXTRA_IS_SUCCESS", 1);
                try {
                    stringExtra = getIntent().getStringExtra("EXTRA_KEY");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                intent.putExtra("EXTRA_VALUE", C810670Vr7.LIZJ(C820130WFf.LIZ(this).LIZ, 0, "account_sec_share_data").getString(stringExtra, ""));
                C2204961BRm.LLLLZLLLI(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKZylIDzO5MvA7/D1DaU//QncYdlp6oA48VCNVII1eJp8MoU3bMToRnLBGA8kby1A0/iD7", null));
            }
            finish();
            ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", false);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0WI2 c0wi2 = new C0WI2();
            c0wi2.LIZIZ("share_sdk_activity_read_local_data_failed");
            c0wi2.LIZ(e2.getMessage(), "err_msg");
            c0wi2.LIZ(Log.getStackTraceString(e2), "err_msg_stack");
            c0wi2.LIZJ();
            intent.putExtra("EXTRA_IS_SUCCESS", 0);
            intent.removeExtra("EXTRA_VALUE");
            C2204961BRm.LLLLZLLLI(this, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKZylIDzO5MvA7/D1DaU//QncYdlp6oA48VCNVII1eJp8MoU3bMToRnLBGA8kby1A0/iD7", null));
            finish();
            ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", false);
        }
    }
}
