package com.ss.android.ugc.aweme.general;

import X.C0N7K;
import X.C11WF;
import X.C11WH;
import X.C1308910kAL;
import X.C1440005kM;
import X.C1697810uHb;
import X.C1799610wvn;
import X.C20684815ws;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS98S0200000_29;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorGeneralType;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorGeneralHybridActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiIpJyohHELIOSKSliCCEwICo+Dio9LTctJQcqKjclLQ4wPCw6IDsq";
    public final String LL = "general_anchor_hybrid_activity";
    public View LLILLJJLI;
    public View LLILLL;
    public TuxNavBar LLILZ;
    public ViewGroup LLILZIL;
    public SparkContext LLILZLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZ;
    public C11WF LLIZLLLIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.general.AnchorGeneralHybridActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.general.AnchorGeneralHybridActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.general.AnchorGeneralHybridActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.general.AnchorGeneralHybridActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.general.AnchorGeneralHybridActivity", "onWindowFocusChanged", true);
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

    public final void onAddButtonClick(View view) {
        C11WH c11wh;
        C11WF c11wf = this.LLIZLLLIL;
        if (c11wf != null && c11wf.LJI && (c11wf instanceof C11WH) && (c11wh = (C11WH) c11wf) != null) {
            String str = c11wh.LJIIJJI;
            int i = c11wh.LIZLLL;
            String str2 = c11wh.LJIIL;
            if (str2 == null) {
                str2 = "";
            }
            C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(i, str2, str, "", 1, "", null, true, c11wh.LJIIJ, "", Long.MAX_VALUE, "", c11wh.LJ, true, null, null, null, null, AnchorGeneralType.E2E_GENERAL_TYPE.getType(), -1, C0N7K.COMMON_ADD_BTN.getStr(), null)));
            finish();
            C20684815ws.LJFF().submit(new ARunnableS98S0200000_29(this, c11wh, 10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[PHI: r8
      0x00f3: PHI (r8v5 java.lang.String) = (r8v4 java.lang.String), (r8v6 java.lang.String) binds: [B:38:0x00cc, B:40:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.11WQ] */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.general.AnchorGeneralHybridActivity.onCreate(android.os.Bundle):void");
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
