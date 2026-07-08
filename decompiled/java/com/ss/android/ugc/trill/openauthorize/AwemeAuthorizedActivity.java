package com.ss.android.ugc.trill.openauthorize;

import X.C1308910kAL;
import X.C1697810uHb;
import X.C1B3N;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeAuthorizedActivity extends C1B3N {
    public static final int $stable = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/Zio8LCEyPTHELIOSEkJj06MiBiCDg2JSANPDs7JzclMyo3CSY4IDk6PDw=";

    public void com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity__onStop$___twin___() {
        super.onStop();
    }

    public void com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity__setTheme$___twin___(int i) {
        super.setTheme(i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStop() {
        com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(this, i);
    }

    public static void com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(AwemeAuthorizedActivity awemeAuthorizedActivity) {
        awemeAuthorizedActivity.com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                awemeAuthorizedActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(AwemeAuthorizedActivity awemeAuthorizedActivity) {
        com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(awemeAuthorizedActivity);
        try {
            awemeAuthorizedActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_tux_business_lancet_ThemeLancet_setTheme(AwemeAuthorizedActivity awemeAuthorizedActivity, int i) {
        boolean z;
        awemeAuthorizedActivity.com_ss_android_ugc_trill_openauthorize_AwemeAuthorizedActivity__setTheme$___twin___(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, awemeAuthorizedActivity);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, awemeAuthorizedActivity);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    awemeAuthorizedActivity.getTheme().applyStyle(R.style.a9u, true);
                } else {
                    awemeAuthorizedActivity.getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    awemeAuthorizedActivity.getTheme().applyStyle(R.style.a9v, true);
                } else {
                    awemeAuthorizedActivity.getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            awemeAuthorizedActivity.getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            awemeAuthorizedActivity.getTheme().applyStyle(R.style.a9y, true);
        }
    }
}
