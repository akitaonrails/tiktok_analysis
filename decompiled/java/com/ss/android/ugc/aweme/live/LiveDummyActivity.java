package com.ss.android.ugc.aweme.live;

import X.C011Z;
import X.C1041800dDW;
import X.C1161920gLG;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C1365870leD;
import X.C1389600mGU;
import X.C14EU;
import X.C1697810uHb;
import X.C19EH;
import X.C1AKK;
import X.C299020Bno;
import X.C335910DEv;
import X.C444960Hcc;
import X.C960203pA;
import X.EnumC335920DEw;
import Y.AObjectS122S0000000_21;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class LiveDummyActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZiklPyp9BCw6LAsmJSg1CCwnITMlPTY=";
    public View LL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", true);
        super.onResume();
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.setCurrentPage(2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        int i;
        int i2;
        super.finish();
        if (C444960Hcc.LIZJ(this)) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (C1389600mGU.LIZIZ(this)) {
                i = 0;
                i2 = 0;
            } else {
                i = R.anim.dv;
                i2 = R.anim.dx;
            }
            overridePendingTransition(i, i2);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.setCurrentPage(-1);
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

    static {
        Live.getService();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", true);
        activityConfiguration(new AObjectS122S0000000_21(1));
        super.onCreate(bundle);
        getTheme().applyStyle(C011Z.LIZ.LJIILJJIL(this), false);
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, true, 0);
        setContentView(R.layout.dji);
        this.LL = findViewById(R.id.iiv);
        getWindow().getDecorView().setBackgroundColor(C960203pA.LIZ(R.attr.bx, this));
        getWindow().setSoftInputMode(18);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("intent_type", 0);
        Bundle extras = null;
        if (intExtra == 2) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1AKK liteService = Live.getLiteService();
            if (liteService != null) {
                Fragment fragmentLLIIII = liteService.LLIIII(this, extras);
                fragmentLLIIII.setArguments(extras);
                C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.iiv, fragmentLLIIII);
                c19ehLJIIJ.LJIIIZ();
            }
        } else if (intExtra == 3) {
            try {
                extras = intent.getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1AKK liteService2 = Live.getLiteService();
            if (liteService2 != null) {
                Fragment fragmentLLILZ = liteService2.LLILZ(this, extras);
                C19EH c19ehLJIIJ2 = getSupportFragmentManager().LJIIJ();
                c19ehLJIIJ2.LIZIZ(R.id.iiv, fragmentLLILZ);
                c19ehLJIIJ2.LJIIIZ();
            }
        } else {
            finish();
        }
        if (C444960Hcc.LIZJ(this)) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (C1389600mGU.LIZIZ(this)) {
                i = 0;
                i2 = 0;
            } else {
                i = R.anim.du;
                i2 = R.anim.dw;
            }
            overridePendingTransition(i, i2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", false);
    }

    @C14EU
    public void onEvent(C1365870leD c1365870leD) {
        if (!isDestroyed() && TextUtils.equals("live_event", c1365870leD.LIZLLL)) {
            C1041800dDW.LIZ().getShareService().LJIL(this, this.LL, c1365870leD);
        }
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
