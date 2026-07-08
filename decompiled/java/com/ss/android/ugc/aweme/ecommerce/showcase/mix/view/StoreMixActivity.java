package com.ss.android.ugc.aweme.ecommerce.showcase.mix.view;

import X.ActivityC1169970gYF;
import X.C0DRA;
import X.C1161850gL9;
import X.C1166240gSE;
import X.C1209040hZG;
import X.C1308910kAL;
import X.C14K9;
import X.C1697810uHb;
import X.C1739050vM7;
import X.C19EH;
import X.C21146717pB;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC1161690gKt;
import X.EnumC335920DEw;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreMixActivity extends ActivityC1169970gYF<C1166240gSE> {
    public static int LLILZLL = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgICo7Ki4gLWshIDd9PiwpPmEAPCo+LAI6MAQvPSYlITE1";
    public boolean LLILZIL;

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity", "onWindowFocusChanged", true);
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

    @Override // X.ActivityC1169970gYF, X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity", "onCreate", true);
        Bundle extras = null;
        try {
            stringExtra = getIntent().getStringExtra("container_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C1161850gL9.LIZ(stringExtra, EnumC1161690gKt.PAGE_CREATE_START, null, null);
        activityConfiguration(AFwS256S0000000_18.get$arr$(72));
        super.onCreate(bundle);
        if (C1739050vM7.LIZIZ) {
            setContentView(C21146717pB.LIZ(this, R.layout.bpe, null));
        } else {
            setContentView(R.layout.bpe);
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_showcase_activity_config", true)) {
            C0DRA.LIZ(getWindow(), false);
            C14K9.LJIJJ(findViewById(android.R.id.content), new C1209040hZG(this, 0));
        }
        if (getSupportFragmentManager().LJJJJZI("StoreMixFragment") == null) {
            StoreMixFragment storeMixFragment = new StoreMixFragment();
            try {
                extras = getIntent().getExtras();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            storeMixFragment.setArguments(extras);
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.i4n, storeMixFragment, "StoreMixFragment");
            c19ehLJIIJ.LJIIJ();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixActivity", "onCreate", false);
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
