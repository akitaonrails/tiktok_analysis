package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.AbstractActivityC1743740vTg;
import X.C01GW;
import X.C034S;
import X.C1005503wT;
import X.C1120604Zw;
import X.C1254880ilC;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1878350yyn;
import X.C19EH;
import X.C1AQS;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.EnumC335920DEw;
import X.InterfaceC1760590vur;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ReviewGalleryActivity extends AbstractActivityC1743740vTg {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpHELIOSZz02PiwpPmE0KSkgLD0qZhcpPyY2PwItJSM2OjwNKjs6Piw4MA==";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 511));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 512));

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1722210uux
    public final String getBtmCode() {
        return "a2270.b0293";
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return Intrinsics.LJFF(this.LLILZIL.getValue(), "sea") ? "review_black_light_page" : "review_photo";
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void finish() {
        super.finish();
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, false, 2);
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        IECommerceHostService iECommerceHostService;
        super.onDestroy();
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isOffline()) {
                C1878350yyn.LIZ(InterfaceC1760590vur.LIZ, this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
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

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onCreate", true);
        super.onCreate(bundle);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_close_pip_widget", "{}");
        setContentView(R.layout.av1);
        C1005503wT.LIZ.getClass();
        View viewFindViewById = findViewById(R.id.tqy);
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(true);
        }
        C1254880ilC.LIZ.getClass();
        C1254880ilC.LIZ(this, true, 2);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIJ(true);
        immersionBarLJIILJJIL.LJIIL();
        if (((Boolean) this.LLILZLL.getValue()).booleanValue()) {
            tuxImmersionBar.LJ(R.attr.e1);
        }
        tuxImmersionBar.LIZLLL();
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        GalleryViewerFragment galleryViewerFragment = new GalleryViewerFragment();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        galleryViewerFragment.setArguments(extras);
        c19ehLJIIJ.LJIJ(R.id.tqy, galleryViewerFragment, null);
        c19ehLJIIJ.LJIIJ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryActivity", "onCreate", false);
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
