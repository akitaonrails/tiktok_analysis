package com.bytedance.ies.powerpermissions;

import X.C0DIJ;
import X.C1389600mGU;
import X.C19EG;
import X.C19GS;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class FakeActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9OCo7LD0jHELIOSLTchIDwgISoiOmEVKS4pCCwnITMlPTY=";

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

    @Override // X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null && (string = extras.getString("power_permission_request_key", null)) != null && !a0.LJJJIL(string)) {
                Function1<C19EG, Unit> function1Remove = C0DIJ.LIZ.remove(string);
                if (function1Remove == null) {
                    finish();
                    return;
                } else {
                    function1Remove.invoke(this);
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        finish();
    }
}
