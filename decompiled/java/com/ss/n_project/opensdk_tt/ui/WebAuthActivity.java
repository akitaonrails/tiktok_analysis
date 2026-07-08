package com.ss.n_project.opensdk_tt.ui;

import X.C01GW;
import X.C19GS;
import X.C452501pT;
import X.C817460W4y;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class WebAuthActivity extends C19GS {
    public static final String _pnsPageId = "KyohZzwgZisTOT08IiAvPWE8OCAiOis4HELIOSFzE4Zzo6ZhIpKw4mPC0NKjs6Piw4MA==";
    public final C01GW LL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(198));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(197));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 134));

    @Override // X.C19GS, X.C19EG, android.app.Activity
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C817460W4y.LIZ(intent);
        finish();
    }
}
