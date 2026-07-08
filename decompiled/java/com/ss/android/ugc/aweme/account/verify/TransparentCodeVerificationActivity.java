package com.ss.android.ugc.aweme.account.verify;

import X.C0XPY;
import X.C0XQ5;
import X.C1233040iBy;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1390130mHL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1697810uHb;
import X.C299020Bno;
import X.C335910DEv;
import X.C985403tE;
import X.EnumC335920DEw;
import X.InterfaceC586170Myt;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS592S0100000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class TransparentCodeVerificationActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiPyohISHELIOSM1ZxshKSs/OS4hLSs4CiA3LRMpOyY1ISYtPSY8JgQvPSYlITE1";
    public C1390130mHL LL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        C1397580mTM c1397580mTM = new C1397580mTM(this);
        c1397580mTM.LIZ(2131833840);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS592S0100000_13(this, 38));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void LLLLZI() {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        C1233040iBy c1233040iBy = new C1233040iBy(C0XPY.LIZIZ);
        c1233040iBy.LIZJ(getString(2131833850));
        c1233040iBy.LIZLLL();
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
            C1389600mGU.LIZIZ(this);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        overridePendingTransition(0, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.verify.TransparentCodeVerificationActivity.onCreate(android.os.Bundle):void");
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
