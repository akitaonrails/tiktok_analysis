package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity;

import X.AbstractActivityC1744810vVP;
import X.C1308910kAL;
import X.C15XM;
import X.C1697810uHb;
import X.C19EH;
import X.C204683157h;
import X.C299020Bno;
import X.C335910DEv;
import X.C960203pA;
import X.EnumC335920DEw;
import Y.AObjectS125S0000000_26;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.TimeUnlockFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes27.dex */
public class TimeUnlockActivity extends AbstractActivityC1744810vVP {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODcjPSowPCHELIOSwjJ2EnISgpJSAwI2s5IGEyKzElPyYnMWsYICI2HSsgJiw4CSY4IDk6PDw=";

    @Override // X.AbstractActivityC1744810vVP
    public final int LLLLLZL() {
        return R.layout.bc6;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi(PnSDigitalWellbeingSDKService.class);
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LJI(false);
        }
        super.onDestroy();
    }

    @Override // X.AbstractActivityC1744810vVP
    public final void init() {
        Bundle extras;
        View viewFindViewById = findViewById(R.id.iiv);
        viewFindViewById.setBackgroundColor(C960203pA.LIZ(R.attr.bx, viewFindViewById.getContext()));
        TimeUnlockFragment timeUnlockFragment = new TimeUnlockFragment();
        this.LL = timeUnlockFragment;
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        timeUnlockFragment.setArguments(extras);
        C204683157h<Boolean> c204683157hLIZ = C15XM.LIZ();
        if (c204683157hLIZ != null) {
            c204683157hLIZ.LIZIZ(this.LL);
        }
        TimeUnlockFragment timeUnlockFragment2 = this.LL;
        if (getSupportFragmentManager().LJJLIIIJL() == null) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.iiv, timeUnlockFragment2);
            c19ehLJIIJ.LJIIJ();
        } else {
            C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ2.LJIJJLI(R.anim.fv, R.anim.g0, R.anim.ft, R.anim.g2);
            c19ehLJIIJ2.LJIJ(R.id.iiv, timeUnlockFragment2, null);
            c19ehLJIIJ2.LJII(null);
            c19ehLJIIJ2.LJIIJ();
        }
    }

    @Override // X.AbstractActivityC1744810vVP, X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (C15XM.LIZ() != null) {
            super.onBackPressed();
        }
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

    @Override // X.AbstractActivityC1744810vVP, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity", "onCreate", true);
        activityConfiguration(new AObjectS125S0000000_26(0));
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi(PnSDigitalWellbeingSDKService.class);
        if (pnSDigitalWellbeingSDKService != null) {
            pnSDigitalWellbeingSDKService.LJI(true);
        }
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity", "onCreate", false);
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
