package com.bytedance.ies.xbridge.base.activity;

import X.C0WZX;
import X.C1389600mGU;
import X.C19334910kd;
import X.C19514711Wn;
import X.C19GS;
import X.C2204961BRm;
import android.os.Bundle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: loaded from: classes29.dex */
public final class GetPermissionActivity extends C19GS {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWslLDx9MCc+ICs0LWsuKDw2ZiHELIOSQvPSYlITE1Zwg2PBUpOyI6OzYlJiESKzElPyYnMQ==";

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
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("permissions");
        if (stringArrayExtra != null) {
            C2204961BRm.LLJJIJI(this, stringArrayExtra, 36, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvWla6T/3ebr9FfsTWOdOPNwKHA4BbOj9pGJ4A/Ivk1bR77uk86/k6bmzkA==", null));
        }
        String[] stringArrayExtra2 = getIntent().getStringArrayExtra("permissions");
        if (stringArrayExtra2 != null) {
            C19514711Wn.LIZIZ.LIZIZ(this, TokenCert.Companion.with("bpea-x_bridge_base_get_permission_activity_calendar_permission")).LIZIZ((String[]) Arrays.copyOf(stringArrayExtra2, stringArrayExtra2.length)).LIZJ(new C19334910kd(this, 0));
        }
    }
}
