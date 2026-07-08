package com.ss.android.account.share.data.read;

import X.C0WI0;
import X.C0WI1;
import X.C0WI2;
import X.C1389600mGU;
import X.C2188811AlT;
import X.C817700W5w;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class ReadTempActivity extends Activity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiKCwwJzAiPWEgICQ+LGHELIOSE3KTEtZz02KSFiGyoyLBEpJD8SKzElPyYnMQ==";
    public final int LL;
    public String LLILLJJLI;
    public String LLILLL;

    @Override // android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onResume", false);
    }

    @Override // android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onStart", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public ReadTempActivity() {
        new LinkedHashMap();
        this.LL = 17;
        this.LLILLJJLI = "";
        this.LLILLL = "";
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            stringExtra = getIntent().getStringExtra("READ_PKG");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.LLILLJJLI = stringExtra;
        try {
            String stringExtra2 = getIntent().getStringExtra("EXTRA_KEY");
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LLILLL = str;
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            finish();
        }
        try {
            C0WI0 c0wi0 = C0WI0.LIZ;
            String str2 = this.LLILLJJLI;
            c0wi0.getClass();
            new Intent().setComponent(new ComponentName(str2, "com.ss.android.account.share.data.write.activity.ShareDataActivity"));
            throw null;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C0WI1 c0wi1 = new C0WI1(3, this.LLILLJJLI, String.valueOf(e3.getMessage()), false);
            C0WI0.LIZ.getClass();
            C0WI0.LIZIZ(c0wi1);
            C0WI2 c0wi2 = new C0WI2();
            c0wi2.LIZIZ("share_sdk_read_start_share_activity_failed");
            c0wi2.LIZ(e3.getMessage(), "err_msg");
            c0wi2.LIZ(Log.getStackTraceString(e3), "err_msg_stack");
            c0wi2.LIZJ();
            ActivityAgent.onTrace("com.ss.android.account.share.data.read.ReadTempActivity", "onCreate", false);
        }
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isFinishing()) {
            finish();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == this.LL && intent != null) {
            if (i2 == -1) {
                if (1 == intent.getIntExtra("EXTRA_IS_SUCCESS", -1)) {
                    z = true;
                } else {
                    z = false;
                }
                String str = "";
                if (z) {
                    try {
                        String stringExtra = intent.getStringExtra("EXTRA_VALUE");
                        if (stringExtra != null) {
                            str = stringExtra;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C0WI1 c0wi1 = new C0WI1(this.LLILLJJLI, (String) null, true, 12);
                    c0wi1.LJ = this.LLILLL;
                    c0wi1.LIZLLL = 3;
                    c0wi1.LJFF = str;
                    C0WI0.LIZ.getClass();
                    C0WI0.LIZIZ(c0wi1);
                } else {
                    try {
                        String stringExtra2 = intent.getStringExtra("ERROR_MSG");
                        if (stringExtra2 != null) {
                            str = stringExtra2;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    C0WI1 c0wi12 = new C0WI1(3, this.LLILLJJLI, str, false);
                    C0WI0.LIZ.getClass();
                    C0WI0.LIZIZ(c0wi12);
                }
            } else {
                C0WI1 c0wi13 = new C0WI1(3, this.LLILLJJLI, "resultCode not ok", false);
                C0WI0.LIZ.getClass();
                C0WI0.LIZIZ(c0wi13);
            }
        }
        finish();
    }
}
