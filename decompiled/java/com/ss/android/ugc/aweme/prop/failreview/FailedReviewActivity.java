package com.ss.android.ugc.aweme.prop.failreview;

import X.AbstractC2238408pq;
import X.C0CYT;
import X.C0CZ9;
import X.C0PEM;
import X.C1308910kAL;
import X.C1389600mGU;
import X.C13LE;
import X.C13LP;
import X.C1669670tYD;
import X.C1697810uHb;
import X.C1737910vKH;
import X.C19719212De;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C299020Bno;
import X.C315800CZm;
import X.C318430Ce1;
import X.C318450Ce3;
import X.C318470Ce5;
import X.C318490Ce7;
import X.C318510Ce9;
import X.C318790Ceb;
import X.C335900DEu;
import X.C335910DEv;
import X.C817503Hh;
import X.EnumC335920DEw;
import X.InterfaceC1294060jmO;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class FailedReviewActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99LiHELIOSQlJT02PiwpPmEVKSwgLCsBLTMlLDgSKzElPyYnMQ==";
    public final ViewModelLazy LL = new ViewModelLazy(C13LE.LIZ(FailedReviewViewModel.class), new AwS548S0100000_4((ComponentActivity) this, 195), new C335900DEu(this), new AwS405S0200000_4((Function0) null, this, 22));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        String str;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity", "onResume", true);
        super.onResume();
        FailedReviewPageInitData failedReviewPageInitData = LLLLLZL().LL;
        if (failedReviewPageInitData != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("prop_id", failedReviewPageInitData.effectId);
            FailedReviewPageInitData.Content content = (FailedReviewPageInitData.Content) C13LP.LJJJLL(failedReviewPageInitData.contentList);
            if (content == null || (str = content.content) == null) {
                str = "";
            }
            linkedHashMap.put("failed_reason", str);
            C1737910vKH.LIZ("show_prop_failed_review", linkedHashMap);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final FailedReviewViewModel LLLLLZL() {
        return (FailedReviewViewModel) this.LL.getValue();
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
        int i2;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C1389600mGU.LIZIZ(this)) {
            i = 0;
            i2 = 0;
        } else {
            i = R.anim.fv;
            i2 = R.anim.g0;
        }
        overridePendingTransition(i, i2);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C23250099c.LIZLLL(lifecycleScope, abstractC2238408pq, null, new C318450Ce3(this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq, null, new C318430Ce1(this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq, null, new C318470Ce5(this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq, null, new C318490Ce7(this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq, null, new C318510Ce9(this, null), 2);
        C1669670tYD.LJFF(this, new C19719212De(-1716273920, new AwS618S0100000_4(this, 71), true));
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.prop.failreview.FailedReviewActivity", "onCreate", false);
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
    @InterfaceC1294060jmO
    public final void onActivityResult(int i, int i2, Intent intent) {
        final String stringExtra;
        final String stringExtra2;
        String str;
        int i3;
        super.onActivityResult(i, i2, intent);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onActivityResult ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(i2);
        sbLIZ.append(", ");
        sbLIZ.append(intent);
        sbLIZ.append('.');
        C318790Ceb.LIZ("FailedReviewActivity", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 10088 && i2 == -1 && intent != null) {
            FailedReviewViewModel failedReviewViewModelLLLLLZL = LLLLLZL();
            try {
                stringExtra = intent.getStringExtra("request_code_publish_effect_result");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            try {
                stringExtra2 = intent.getStringExtra("request_code_save_draft_result");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                stringExtra2 = null;
            }
            Object obj = new Object(stringExtra, stringExtra2) { // from class: X.0DEy
            };
            failedReviewViewModelLLLLLZL.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onActivityResultData, ");
            sbLIZ2.append(obj);
            C318790Ceb.LIZ("FailedReviewViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            if (stringExtra == null || stringExtra.length() == 0) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                C318790Ceb.LIZ("FailedReviewViewModel", "onActivityResultPublished");
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(failedReviewViewModelLLLLLZL), null, null, new C0CYT(failedReviewViewModelLLLLLZL, null), 3);
                return;
            }
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                return;
            }
            C318790Ceb.LIZ("FailedReviewViewModel", "onActivityResultDraftSaved");
            FailedReviewPageInitData failedReviewPageInitData = failedReviewViewModelLLLLLZL.LL;
            if (failedReviewPageInitData != null && (str = failedReviewPageInitData.effectId) != null) {
                if (((Boolean) failedReviewViewModelLLLLLZL.LLILLL.getValue()).booleanValue()) {
                    i3 = failedReviewViewModelLLLLLZL.LL.effectSource;
                } else {
                    i3 = 102;
                }
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0CZ9(i3, str, null), 2);
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(failedReviewViewModelLLLLLZL), null, null, new C315800CZm(failedReviewViewModelLLLLLZL, null), 3);
        }
    }
}
