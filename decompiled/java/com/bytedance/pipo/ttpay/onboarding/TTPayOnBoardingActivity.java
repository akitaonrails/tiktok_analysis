package com.bytedance.pipo.ttpay.onboarding;

import X.ActivityC337590DLh;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import Y.ARunnableS104S0100000_4;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.text.u;

/* JADX INFO: loaded from: classes5.dex */
public final class TTPayOnBoardingActivity extends ActivityC337590DLh {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs8ID88ZjE4OS4qZioiKyAyHELIOSOiElJyh9HBEcKDYcJgcjKD03ISsrCCwnITMlPTY=";

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

    @Override // X.ActivityC337590DLh, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        if (bundle != null) {
            finish();
            return;
        }
        activityConfiguration(AFwS232S0000000_4.get$arr$(10));
        super.onCreate(bundle);
        C786410Ut5.y3(getWindow().getDecorView().getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0DLg
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                this.LL.getWindow().setNavigationBarColor(0);
                this.LL.getWindow().setStatusBarColor(0);
                return true;
            }
        });
        setContentView(R.layout.i31);
        Window window = getWindow();
        if (u.LJIJI(Build.MANUFACTURER, "xiaomi", true)) {
            window.addFlags(512);
        }
        TTPayOnboardingFragment tTPayOnboardingFragment = new TTPayOnboardingFragment();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        tTPayOnboardingFragment.setArguments(extras);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.ywv, tTPayOnboardingFragment);
        c19ehLJIIJ.LJIIIZ();
        C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS104S0100000_4((Object) this, 7));
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
