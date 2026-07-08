package com.ss.android.ugc.aweme.hybridkit.spark;

import X.AbstractC1539070q9Z;
import X.C1041990dDp;
import X.C1308910kAL;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1697810uHb;
import X.C1766570w4V;
import X.C1896207bk;
import X.C299020Bno;
import X.C335910DEv;
import X.C522040Kde;
import X.C905703gN;
import X.EnumC335920DEw;
import X.InterfaceC1387820mDc;
import X.InterfaceC1432560nNm;
import X.InterfaceC20190413zK;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class TranslucentActivity extends BaseActivity implements InterfaceC1432560nNm {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi01Kz06HELIOSLC4lPWEgOCQ+ImEHOiQiOiMmKyAiPQ4wPCw6IDsq";
    public InterfaceC1387820mDc LL;
    public SparkContext LLILLJJLI;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        String stringExtra;
        super.finish();
        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
        try {
            stringExtra = getIntent().getStringExtra("SparkContextContainerId");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        c1041990dDp.getClass();
        C1041990dDp.LIZIZ(stringExtra);
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

    @Override // X.InterfaceC1432560nNm
    public final void KF(InterfaceC1387820mDc interfaceC1387820mDc) {
        this.LL = interfaceC1387820mDc;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onCreate", true);
        super.onCreate(bundle);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LIZLLL();
        C905703gN.LIZ.getClass();
        C1041990dDp c1041990dDp = C1041990dDp.LIZ;
        try {
            stringExtra = getIntent().getStringExtra("SparkContextContainerId");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        c1041990dDp.getClass();
        this.LLILLJJLI = C1041990dDp.LIZ(stringExtra);
        SparkContext sparkContext = this.LLILLJJLI;
        if (sparkContext != null) {
            sparkContext.LJJJJZI(new C522040Kde(this, 0));
            C1541950qED.LIZJ.getClass();
            C1537900q7g.LJIIIZ(this, sparkContext);
        }
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896207bk c1896207bk = new C1896207bk(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896207bk);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.hybridkit.spark.TranslucentActivity", "onCreate", false);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC1539070q9Z abstractC1539070q9Z;
        InterfaceC20190413zK interfaceC20190413zK;
        InterfaceC1387820mDc interfaceC1387820mDc = this.LL;
        if (interfaceC1387820mDc != null) {
            interfaceC1387820mDc.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext = this.LLILLJJLI;
        if (sparkContext != null && (interfaceC20190413zK = (InterfaceC20190413zK) sparkContext.LJFF(InterfaceC20190413zK.class)) != null) {
            interfaceC20190413zK.onActivityResult(i, i2, intent);
        }
        SparkContext sparkContext2 = this.LLILLJJLI;
        if (sparkContext2 != null && (abstractC1539070q9Z = (AbstractC1539070q9Z) sparkContext2.LJFF(AbstractC1539070q9Z.class)) != null) {
            do {
                abstractC1539070q9Z.onActivityResult(i, i2, intent);
                AbstractC1539070q9Z next = abstractC1539070q9Z.next();
                if (next == null || !(next instanceof AbstractC1539070q9Z)) {
                    break;
                } else {
                    abstractC1539070q9Z = next;
                }
            } while (abstractC1539070q9Z != null);
        }
        super.onActivityResult(i, i2, intent);
    }
}
