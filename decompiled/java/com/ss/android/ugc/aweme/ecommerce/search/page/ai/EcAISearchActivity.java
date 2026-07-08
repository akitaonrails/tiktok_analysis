package com.ss.android.ugc.aweme.ecommerce.search.page.ai;

import X.AbstractActivityC1743740vTg;
import X.C0Q8J;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C799520VXy;
import X.EnumC335920DEw;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcAISearchActivity extends AbstractActivityC1743740vTg {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgLSQ+Kid9OCQrLGEyIWsJKg4aGyAtOyw7CSY4IDk6PDw=";
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZLLIL() {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        Intent intent = getIntent();
        String stringExtra4 = null;
        try {
            stringExtra = intent.getStringExtra("requestParams");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        try {
            stringExtra2 = intent.getStringExtra("trackParams");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        try {
            stringExtra3 = intent.getStringExtra("featureParams");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            stringExtra3 = null;
        }
        try {
            stringExtra4 = intent.getStringExtra("source_btm_token");
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        boolean z = intent.getIntExtra("disableNativePreRequest", 0) == 1;
        long j = this.LLILZLL;
        long j2 = this.LLILZIL;
        long j3 = this.LLIZ;
        EcAISearchFragment ecAISearchFragment = new EcAISearchFragment();
        ecAISearchFragment.setArguments(C799520VXy.LIZ(new Pair("requestParams", stringExtra), new Pair("trackParams", stringExtra2), new Pair("featureParams", stringExtra3), new Pair("source_btm_token", stringExtra4), new Pair("disableNativePreRequest", Boolean.valueOf(z)), new Pair("ec_ai_search_perf_base_system_ms", Long.valueOf(j)), new Pair("ec_ai_search_perf_base_elapsed_ms", Long.valueOf(j2)), new Pair("ec_ai_search_perf_activity_set_content_view_end_elapsed_ms", Long.valueOf(j3))));
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.iiv, ecAISearchFragment, "ec_ai_container");
        c19ehLJIIJ.LJIIJ();
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onCreate", true);
        this.LLILZLL = System.currentTimeMillis();
        this.LLILZIL = SystemClock.elapsedRealtime();
        activityConfiguration(new AwS589S0100000_10(this, 47));
        super.onCreate(bundle);
        activityConfiguration(AFwS241S0000000_10.get$arr$(52));
        try {
            setContentView(C0Q8J.INSTANCE.getView(this, R.layout.iu, null));
            this.LLIZ = SystemClock.elapsedRealtime();
            if (bundle != null) {
                finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onCreate", false);
            } else {
                LLLLZLLIL();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onCreate", false);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.e("ec ai search", e);
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchActivity", "onCreate", false);
        }
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        LLLLZLLIL();
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
