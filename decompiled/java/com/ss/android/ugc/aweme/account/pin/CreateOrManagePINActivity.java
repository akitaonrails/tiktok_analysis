package com.ss.android.ugc.aweme.account.pin;

import X.C1308910kAL;
import X.C1389890mGx;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.DialogC1389620mGW;
import X.EnumC335920DEw;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class CreateOrManagePINActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiOSY9ZgY+LC4nLQo+BC49KSIpGQYdCSY4IDk6PDw=";
    public DialogC1389620mGW LL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLLZL() {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(getString(2131822154));
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        finish();
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

    public final void LLLLZI(BasePINFragment basePINFragment) {
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, basePINFragment, null);
        c19ehLJIIJ.LJIIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r4 = "com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity"
            java.lang.String r3 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r4, r3, r2)
            super.onCreate(r6)
            X.0mGW r0 = new X.0mGW
            r0.<init>(r5)
            r5.LL = r0
            r0 = 66
            kotlin.jvm.internal.AFwS257S0000000_19 r0 = kotlin.jvm.internal.AFwS257S0000000_19.get$arr$(r0)
            r5.activityConfiguration(r0)
            com.bytedance.immersionbar.ImmersionBar r0 = com.bytedance.immersionbar.ImmersionBar.LJIILJJIL(r5)
            com.bytedance.tux.system.TuxImmersionBar r1 = new com.bytedance.tux.system.TuxImmersionBar
            r1.<init>(r5, r0)
            r0 = 2131099676(0x7f06001c, float:1.7811712E38)
            r1.LJ(r0)
            r1.LJIIIIZZ(r0)
            r1.LIZ(r2)
            r1.LIZLLL()
            r0 = 2131559056(0x7f0d0290, float:1.8743445E38)
            r5.setContentView(r0)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "step"
            java.lang.String r2 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L46
            if (r2 == 0) goto L4a
            goto L4e
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            r5.LLLLLZL()
            goto L71
        L4e:
            int r1 = r2.hashCode()
            r0 = -1352294148(0xffffffffaf65a0fc, float:-2.0884622E-10)
            if (r1 == r0) goto L94
            r0 = -1081434779(0xffffffffbf8a9d65, float:-1.0829283)
            if (r1 == r0) goto L76
            r0 = 197723344(0xbc904d0, float:7.7429625E-32)
            if (r1 != r0) goto L4a
            java.lang.String r0 = "force_create"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.account.pin.PINForceCreateIntroFragment r0 = new com.ss.android.ugc.aweme.account.pin.PINForceCreateIntroFragment
            r0.<init>()
            r5.LLLLZI(r0)
        L71:
            r0 = 0
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r4, r3, r0)
            return
        L76:
            java.lang.String r0 = "manage"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4a
            X.0mGW r0 = r5.LL
            if (r0 == 0) goto L85
            X.C0FNV.LIZJ(r0)
        L85:
            X.0XIH r2 = X.C0XIH.LIZIZ()
            X.0ilh r1 = new X.0ilh
            r1.<init>()
            java.lang.String r0 = "normal"
            r2.LIZ(r0, r1)
            goto L71
        L94:
            java.lang.String r0 = "create"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.account.pin.CreateOrResetPINFragment r0 = new com.ss.android.ugc.aweme.account.pin.CreateOrResetPINFragment
            r0.<init>()
            r5.LLLLZI(r0)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.pin.CreateOrManagePINActivity.onCreate(android.os.Bundle):void");
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
