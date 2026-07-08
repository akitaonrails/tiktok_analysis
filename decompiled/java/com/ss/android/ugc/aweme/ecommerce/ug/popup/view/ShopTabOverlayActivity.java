package com.ss.android.ugc.aweme.ecommerce.ug.popup.view;

import X.C034S;
import X.C1120604Zw;
import X.C1308910kAL;
import X.C13BV;
import X.C1697810uHb;
import X.C1740300vO8;
import X.C1740370vOF;
import X.C1740420vOK;
import X.C1748770vbn;
import X.C1766570w4V;
import X.C1896207bk;
import X.C1AQS;
import X.C2097608Jq;
import X.C23271099x;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C948503nH;
import X.EnumC335920DEw;
import X.InterfaceC1740440vOM;
import X.InterfaceC1748810vbr;
import X.InterfaceC1748820vbs;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.libra.EcUgMallLandingDeeplinkFallbackModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ShopTabOverlayActivity extends BaseActivity implements InterfaceC1748820vbs {
    public static InterfaceC1740440vOM LLILLJJLI = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEmHELIOSL2s8Jj8mOGs6ICokZhYkJj8HKScDPyohJCQ1CCwnITMlPTY=";
    public FrameLayout LL;

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return null;
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "shop_tab_overlay";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C2097608Jq.LJ();
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

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IECommerceHostService iECommerceHostService;
        String stringExtra;
        boolean z;
        String name;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity", "onCreate", true);
        activityConfiguration(AFwS268S0000000_26.get$arr$(303));
        super.onCreate(bundle);
        setContentView(R.layout.bsr);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIJ(false);
        immersionBarLJIILJJIL.LJIIL();
        tuxImmersionBar.LIZLLL();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        IApplicationDependencyService iApplicationDependencyService = (IApplicationDependencyService) iECommerceHostService;
        if (iApplicationDependencyService.isOffline() || iApplicationDependencyService.isRegressionTest()) {
            KeyEvent.Callback callbackFindViewById = this.LL;
            if (callbackFindViewById == null) {
                callbackFindViewById = findViewById(R.id.mek);
                this.LL = (FrameLayout) callbackFindViewById;
            }
            ViewGroup viewGroup = (ViewGroup) callbackFindViewById;
            TuxTextView tuxTextView = new TuxTextView(this, null, 6, 0);
            tuxTextView.setText("ShopTabOverlayActivity");
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ob, tuxTextView.getContext());
            if (numLIZJ != null) {
                tuxTextView.setBackgroundColor(numLIZJ.intValue());
            }
            viewGroup.addView(tuxTextView, new ViewGroup.LayoutParams(-2, -2));
        }
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.mek);
            this.LL = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 20), viewFindViewById);
        try {
            stringExtra = getIntent().getStringExtra("extra_landing_deeplink");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.LJ(null, stringExtra);
        }
        EcUgMallLandingDeeplinkFallbackModel ecUgMallLandingDeeplinkFallbackModelLIZ = C1740370vOF.LIZ();
        boolean booleanExtra = getIntent().getBooleanExtra("shop_lynx_first_screen_done", false);
        if (ecUgMallLandingDeeplinkFallbackModelLIZ.enableMonitorLifecycleCallback) {
            C948503nH.LJ(this, C23271099x.INSTANCE, new C1740420vOK(ecUgMallLandingDeeplinkFallbackModelLIZ, this, stringExtra, booleanExtra, null));
        } else {
            C1740300vO8.LIZ.getClass();
            if (!C1740300vO8.LJFF(this, stringExtra, true, true, booleanExtra)) {
                finish();
            }
        }
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896207bk c1896207bk = new C1896207bk(this);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896207bk);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        if (bundle2 != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        bundle.remove("android:fragments");
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
