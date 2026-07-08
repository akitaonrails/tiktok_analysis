package com.ss.android.ugc.aweme.app;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import android.os.Looper;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public class PushLoginActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZiQ8OWEDPTYkBSA0ISsNKjs6Piw4MA==";
    public final BPEAHandler LL = new BPEAHandler(Looper.myLooper());

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.LL.removeCallbacksAndMessages(null);
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            java.lang.String r5 = "com.ss.android.ugc.aweme.app.PushLoginActivity"
            java.lang.String r4 = "onCreate"
            r1 = 1
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r1)
            Y.AObjectS116S0000000_13 r2 = new Y.AObjectS116S0000000_13
            r0 = 0
            r2.<init>(r0)
            r9 = r17
            r9.activityConfiguration(r2)
            r0 = r18
            super.onCreate(r0)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r0 = "next_step"
            android.os.Parcelable r14 = r2.getParcelableExtra(r0)
            android.content.Intent r14 = (android.content.Intent) r14
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r0 = "next_steps"
            java.util.ArrayList r15 = r2.getParcelableArrayListExtra(r0)
            android.content.Intent r2 = r9.getIntent()
            r11 = 0
            if (r2 == 0) goto L48
            java.lang.String r0 = "multi_account"
            android.os.Bundle r10 = X.C786410Ut5.g3(r2, r0)
            if (r10 == 0) goto L49
            java.lang.String r0 = "push_intent"
            android.os.Parcelable r12 = r10.getParcelable(r0)
            android.content.Intent r12 = (android.content.Intent) r12
        L45:
            java.lang.String r0 = "multi_account_push_uid"
            goto L4d
        L48:
            r10 = r11
        L49:
            r12 = r11
            if (r2 == 0) goto L56
            goto L45
        L4d:
            java.lang.String r11 = r2.getStringExtra(r0)     // Catch: java.lang.Exception -> L52
            goto L56
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L56:
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r0 = "EXTRA_AV_RECORD_CONFIG"
            java.io.Serializable r6 = r2.getSerializableExtra(r0)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig r6 = (com.ss.android.ugc.aweme.services.external.ui.RecordConfig) r6
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r0 = "IS_LANDING_SUB_ONLY_LIVE"
            r3 = 0
            boolean r2 = r2.getBooleanExtra(r0, r3)
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            java.lang.String r0 = "com.ss.android.ugc.aweme.main.MainActivity"
            r13.setClassName(r9, r0)
            X.0XQC r8 = new X.0XQC
            r16 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L92
            java.lang.String r0 = "force_use_default_login_method"
            r7.putBoolean(r0, r1)
        L92:
            java.lang.String r6 = "push"
            if (r2 == 0) goto Lc3
            java.lang.String r0 = "sub_auto_email"
        L99:
            com.ss.android.ugc.aweme.ILoginService r2 = X.C0XQ7.LIZJ()
            X.0XQS r1 = new X.0XQS
            r1.<init>()
            r1.LIZ = r9
            r1.LIZIZ = r0
            r1.LIZJ = r6
            r1.LIZLLL = r7
            X.10Si r0 = new X.10Si
            r0.<init>()
            r1.LJFF = r0
            X.0XTq r0 = new X.0XTq
            r0.<init>(r8)
            r1.LJ = r0
            X.0XQT r0 = r1.LIZ()
            r2.showLoginAndRegisterView(r0)
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r5, r4, r3)
            return
        Lc3:
            r0 = r6
            goto L99
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.PushLoginActivity.onCreate(android.os.Bundle):void");
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
