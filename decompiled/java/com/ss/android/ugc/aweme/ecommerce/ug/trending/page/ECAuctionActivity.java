package com.ss.android.ugc.aweme.ecommerce.ug.trending.page;

import X.AbstractActivityC1743740vTg;
import X.C1308910kAL;
import X.C1484920okE;
import X.C1697810uHb;
import X.C1742740vS4;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C19EH;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.EnumC335920DEw;
import X.InterfaceC1740760vOs;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ECAuctionActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEmL2s4Oyo9LCwiLmEjKSIpZwoQCTAvPSY8JgQvPSYlITE1";

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b17128";
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "auction";
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECAuctionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECAuctionActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECAuctionActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECAuctionActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECAuctionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS268S0000000_26.get$arr$(306));
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECAuctionActivity", "onCreate", true);
        activityConfiguration(AFwS268S0000000_26.get$arr$(307));
        setTheme(R.style.y0);
        super.onCreate(bundle);
        if (C1742740vS4.LIZJ == 0) {
            C1742740vS4.LIZJ = System.currentTimeMillis() - C1742740vS4.LIZ;
        }
        setContentView(R.layout.bss);
        C1484920okE.LIZ();
        Bundle bundle2 = new Bundle();
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                C786410Ut5.LJJIIJZLJL(bundle2, extras);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C786410Ut5.LJJJI("page_name", "auction", bundle2);
        C786410Ut5.LJJJI("page_btm", "b17128", bundle2);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        ECTrendingFragment eCTrendingFragment = new ECTrendingFragment();
        eCTrendingFragment.setArguments(bundle2);
        c19ehLJIIJ.LJIJ(R.id.yk4, eCTrendingFragment, "auction_fragment");
        c19ehLJIIJ.LJIIJ();
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        tuxImmersionBar.LIZJ(false, false);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LJFF(-16777216);
        immersionBarLJIILJJIL.LJII(false);
        tuxImmersionBar.LIZLLL();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECAuctionActivity", "onCreate", false);
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
