package com.ss.android.ugc.aweme.ecommerce.base.pdp.ui;

import X.AbstractActivityC1743740vTg;
import X.AnonymousClass0317;
import X.C034S;
import X.C036A;
import X.C098200Yq;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C1254880ilC;
import X.C128Y;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1755530vmh;
import X.C189200o6;
import X.C1AQS;
import X.C299020Bno;
import X.C335910DEv;
import X.C740070T1h;
import X.C786410Ut5;
import X.EnumC1740810vOx;
import X.EnumC1755520vmg;
import X.EnumC335920DEw;
import X.InterfaceC1738660vLU;
import X.InterfaceC1740760vOs;
import X.InterfaceC924903jT;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs, InterfaceC924903jT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+HELIOSLTcvLGExKTYpZz83OGs5IGEDLDUNKjs6Piw4MA==";
    public SmartImageView LLILZIL;
    public FrameLayout LLILZLL;
    public long LLIZ = -1;
    public String LLIZLLLIL;
    public boolean LLJ;

    @Override // X.AbstractActivityC1743740vTg
    public final void LLLLZIL() {
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "product_detail";
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onResume", true);
        super.onResume();
        this.LLIZ = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final FrameLayout LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.iiv);
            this.LLILZLL = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final SmartImageView LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q7s);
            this.LLILZIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.PDP_PAGE.getPageCode();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        try {
            SmartImageView smartImageViewLLLLZLLLI = LLLLZLLLI();
            if (smartImageViewLLLLZLLLI != null) {
                C786410Ut5.LJLLLLLL(8, smartImageViewLLLLZLLLI);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.finish();
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, false, 0);
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        try {
            SmartImageView smartImageViewLLLLZLLLI = LLLLZLLLI();
            if (smartImageViewLLLLZLLLI != null) {
                C786410Ut5.LJLLLLLL(0, smartImageViewLLLLZLLLI);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.finishAfterTransition();
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int iLJJLIIIIJ = getSupportFragmentManager().LJJLIIIIJ();
        if (iLJJLIIIIJ <= 0) {
            this.LLJ = true;
            C1054004Ag c1054004AgLIZ = C740070T1h.LIZ(this);
            if (c1054004AgLIZ != null) {
                c1054004AgLIZ.LJJIII = "return";
                c1054004AgLIZ.LJJIII(EnumC1755520vmg.RETURN);
            }
            String str = this.LLIZLLLIL;
            C1755530vmh c1755530vmh = new C1755530vmh(str != null ? str : "");
            c1755530vmh.LIZLLL(EnumC1755520vmg.RETURN);
            c1755530vmh.LIZJ(SystemClock.elapsedRealtime() - this.LLILLJJLI);
            c1755530vmh.LIZIZ();
            if (getIntent().getBooleanExtra("has_enter_anim", false)) {
                finishAfterTransition();
                return;
            } else {
                finish();
                return;
            }
        }
        C128Y c128yLJJJJZI = getSupportFragmentManager().LJJJJZI(getSupportFragmentManager().LJJLI(iLJJLIIIIJ - 1).getName());
        if ((c128yLJJJJZI instanceof InterfaceC1738660vLU) && ((InterfaceC1738660vLU) c128yLJJJJZI).onBackPressed()) {
            return;
        }
        if (iLJJLIIIIJ == 1) {
            this.LLJ = true;
            C1054004Ag c1054004AgLIZ2 = C740070T1h.LIZ(this);
            if (c1054004AgLIZ2 != null) {
                c1054004AgLIZ2.LJJIII = "return";
            }
            String str2 = this.LLIZLLLIL;
            C1755530vmh c1755530vmh2 = new C1755530vmh(str2 != null ? str2 : "");
            c1755530vmh2.LIZLLL(EnumC1755520vmg.RETURN);
            c1755530vmh2.LIZJ(SystemClock.elapsedRealtime() - this.LLILLJJLI);
            c1755530vmh2.LIZIZ();
        }
        if (getIntent().getBooleanExtra("has_enter_anim", false)) {
            finishAfterTransition();
        } else {
            finish();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        super.onPause();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveDependencyService.class.getName(), anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        ((ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin).addLiveDuration(SystemClock.elapsedRealtime() - this.LLIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        C1054004Ag c1054004AgLIZ;
        super.onStop();
        if (!this.LLJ && !C036A.LIZIZ() && (c1054004AgLIZ = C740070T1h.LIZ(this)) != null) {
            c1054004AgLIZ.LJJIII(EnumC1755520vmg.NEXT);
        }
        this.LLJ = false;
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0168 A[PHI: r7
      0x0168: PHI (r7v4 kotlin.Pair<java.lang.Integer, java.lang.Integer>) = (r7v3 kotlin.Pair<java.lang.Integer, java.lang.Integer>), (r7v10 kotlin.Pair<java.lang.Integer, java.lang.Integer>) binds: [B:33:0x015c, B:37:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpActivity.onCreate(android.os.Bundle):void");
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
