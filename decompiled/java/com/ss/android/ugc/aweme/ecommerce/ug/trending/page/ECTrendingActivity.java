package com.ss.android.ugc.aweme.ecommerce.ug.trending.page;

import X.AbstractActivityC1743740vTg;
import X.C0PEM;
import X.C1308910kAL;
import X.C13LP;
import X.C1484920okE;
import X.C1697810uHb;
import X.C1742420vRY;
import X.C1742740vS4;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C19EH;
import X.C2157708cp;
import X.C299020Bno;
import X.C335910DEv;
import X.C948503nH;
import X.EnumC335920DEw;
import X.InterfaceC1740760vOs;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.settings.EcomTrendingHostWhiteListModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class ECTrendingActivity extends AbstractActivityC1743740vTg implements InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEmHELIOSL2s4Oyo9LCwiLmEjKSIpZwoQHDcpJys6JiINKjs6Piw4MA==";

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b90718";
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "trends";
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        String stringExtra = null;
        try {
            stringExtra = getIntent().getStringExtra("back_deeplink");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (stringExtra == null || !(!a0.LJJJIL(stringExtra))) {
            try {
                if (getIntent().getStringExtra("is_back_mall") == null || !(!a0.LJJJIL(r0))) {
                    return;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://ec/mall?diversion_params=%7B%22diversion_params_for_popup%22%3Afalse%7D");
                smartRouteBuildRoute.withParam("check_activity_finish", true);
                smartRouteBuildRoute.open();
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return;
            }
        }
        EcomTrendingHostWhiteListModel ecomTrendingHostWhiteListModel = C1742420vRY.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomTrendingHostWhiteListModel ecomTrendingHostWhiteListModel2 = C1742420vRY.LIZ;
        EcomTrendingHostWhiteListModel ecomTrendingHostWhiteListModel3 = (EcomTrendingHostWhiteListModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_trending_host_white_list", EcomTrendingHostWhiteListModel.class, ecomTrendingHostWhiteListModel2);
        if (ecomTrendingHostWhiteListModel3 != null) {
            ecomTrendingHostWhiteListModel2 = ecomTrendingHostWhiteListModel3;
        }
        Uri uri = UriProtector.parse(stringExtra);
        if (C13LP.LJJJJ(uri.getHost(), ecomTrendingHostWhiteListModel2.getWhiteHostList())) {
            if (C13LP.LJJJJ(uri.getPath(), ecomTrendingHostWhiteListModel2.getWhitePathList())) {
                SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this, stringExtra);
                smartRouteBuildRoute2.withParam("check_activity_finish", true);
                smartRouteBuildRoute2.open();
            }
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

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", AFwS268S0000000_26.get$arr$(308));
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity", "onCreate", true);
        activityConfiguration(AFwS268S0000000_26.get$arr$(309));
        setTheme(R.style.y0);
        super.onCreate(bundle);
        if (C1742740vS4.LIZJ == 0) {
            C1742740vS4.LIZJ = System.currentTimeMillis() - C1742740vS4.LIZ;
        }
        setContentView(R.layout.bss);
        C1484920okE.LIZ();
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        ECTrendingFragment eCTrendingFragment = new ECTrendingFragment();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        eCTrendingFragment.setArguments(extras);
        c19ehLJIIJ.LJIJ(R.id.yk4, eCTrendingFragment, "trending_fragment");
        c19ehLJIIJ.LJIIJ();
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        tuxImmersionBar.LIZJ(false, false);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LJFF(-16777216);
        immersionBarLJIILJJIL.LJII(false);
        tuxImmersionBar.LIZLLL();
        C948503nH.LJ(this, C0PEM.LIZJ, new C2157708cp(this, null));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingActivity", "onCreate", false);
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
