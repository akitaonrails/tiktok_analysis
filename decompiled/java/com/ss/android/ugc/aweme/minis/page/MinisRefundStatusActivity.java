package com.ss.android.ugc.aweme.minis.page;

import X.C0HTI;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C1697810uHb;
import X.C19EH;
import X.C2196681AyA;
import X.C299020Bno;
import X.C335910DEv;
import X.C345890DhD;
import X.C770750ULh;
import X.C786410Ut5;
import X.EnumC335920DEw;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MinisRefundStatusActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjHELIOSUtLip9BSwiIDwBLSM5JysAPCQ4PDwSKzElPyYnMQ==";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisRefundStatusActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisRefundStatusActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisRefundStatusActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisRefundStatusActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisRefundStatusActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = C1389600mGU.LIZIZ(this) ? 0 : R.anim.je;
        overridePendingTransition(0, i);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJI(this);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisRefundStatusActivity", "onCreate", true);
        activityConfiguration(AFwS232S0000000_4.get$arr$(46));
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        View viewSd = C786410Ut5.Sd(R.layout.jh, C786410Ut5.ne(this), null);
        setContentView(viewSd);
        TuxNavBar tuxNavBar = (TuxNavBar) viewSd.findViewById(R.id.aeb);
        if (tuxNavBar != null) {
            tuxNavBar.LJIIZILJ(false);
        }
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.rm;
        c770750ULh.LIZ = c0hti.LIZ(this);
        c770750ULh.LJ = getString(2131822246);
        c770750ULh.LIZLLL(C1697810uHb.LJIIJJI(new C345890DhD(getString(2131822244), true), new C345890DhD(getString(2131822245), true)));
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJI(getString(2131822243), new AwS583S0100000_4(this, 85));
        TuxIntroFragment tuxIntroFragmentLIZ = c770750ULh.LIZ();
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.iiv, tuxIntroFragmentLIZ);
        c19ehLJIIJ.LJIIIZ();
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!C1389600mGU.LIZIZ(this)) {
            i = R.anim.jf;
        } else {
            i = 0;
        }
        overridePendingTransition(i, 0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisRefundStatusActivity", "onCreate", false);
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
