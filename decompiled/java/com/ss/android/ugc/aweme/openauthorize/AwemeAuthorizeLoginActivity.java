package com.ss.android.ugc.aweme.openauthorize;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public final class AwemeAuthorizeLoginActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zio8LCEyPTEkHELIOSJj06MiBiCDg2JSANPDs7JzclMyofJyIlJw4wPCw6IDsq";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[PHI: r2
      0x005b: PHI (r2v3 android.os.Bundle) = (r2v2 android.os.Bundle), (r2v8 android.os.Bundle), (r2v8 android.os.Bundle) binds: [B:17:0x0058, B:14:0x0054, B:23:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r3
      0x0060: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:19:0x005d, B:25:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[PHI: r2 r3
      0x006e: PHI (r2v6 android.os.Bundle) = (r2v3 android.os.Bundle), (r2v8 android.os.Bundle) binds: [B:19:0x005d, B:23:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x006e: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:19:0x005d, B:23:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r3 = "auth_from_app"
            java.lang.String r5 = "com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity"
            java.lang.String r4 = "onCreate"
            r6 = 1
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r6)
            r0 = 307(0x133, float:4.3E-43)
            kotlin.jvm.internal.AFwS252S0000000_16 r0 = kotlin.jvm.internal.AFwS252S0000000_16.get$arr$(r0)
            r7.activityConfiguration(r0)
            super.onCreate(r8)
            X.0Oin r2 = new X.0Oin
            r2.<init>()
            android.os.Bundle r1 = r2.LIZ
            java.lang.String r0 = "only_login"
            r1.putBoolean(r0, r6)
            android.os.Bundle r6 = r2.LIZ
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r1 = "authorize_hide_platforms"
            java.util.ArrayList r0 = r0.getStringArrayListExtra(r1)
            if (r0 == 0) goto L33
            X.C786410Ut5.LJJJIL(r6, r1, r0)
        L33:
            android.content.Intent r0 = r7.getIntent()
            r2 = 0
            java.lang.String r1 = r0.getStringExtra(r3)     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L4c
            goto L44
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L4c
        L44:
            X.C786410Ut5.LJJJI(r3, r1, r6)
            java.lang.String r0 = "channel"
            X.C786410Ut5.LJJJI(r0, r1, r6)
        L4c:
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r2 = r0.getExtras()     // Catch: java.lang.Exception -> L57
            if (r2 == 0) goto L5b
            goto L63
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5b:
            java.lang.String r3 = "authorize_screen"
            if (r2 == 0) goto L60
            goto L6e
        L60:
            java.lang.String r2 = "auth_init"
            goto L76
        L63:
            X.C786410Ut5.LJJIIJZLJL(r6, r2)
            java.lang.String r0 = "enter_from"
            java.lang.String r3 = r2.getString(r0)
            if (r3 == 0) goto L5b
        L6e:
            java.lang.String r0 = "enter_method"
            java.lang.String r2 = r2.getString(r0)
            if (r2 == 0) goto L60
        L76:
            X.0e95 r1 = new X.0e95
            r0 = 0
            r1.<init>(r7, r0)
            X.C0XPD.LIZIZ(r7, r3, r2, r6, r1)
            r0 = 0
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
