package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling;

import X.C0H9H;
import X.C0OM1;
import X.C1018703yb;
import X.C1251150ifB;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C2097908Jt;
import X.C299020Bno;
import X.C335910DEv;
import X.C384050F3z;
import X.C908803gs;
import X.C989403ts;
import X.EnumC335920DEw;
import X.InterfaceC1164530gPT;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentFinishPollingActivity extends BaseActivity implements InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGs8HELIOSKDY+LSs4Zz88JCklJyh9GCQ1JCo9PAMlJyYgIBUjJSM6JiINKjs6Piw4MA==";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r13 = this;
            java.lang.String r2 = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity"
            java.lang.String r1 = "onResume"
            r7 = 1
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r2, r1, r7)
            super.onResume()
            boolean r3 = X.C034S.LIZ()
            r11 = 0
            r0 = 0
            if (r3 == 0) goto Lae
            X.04Zw r3 = X.C1120604Zw.LIZ
            r3.LIZ()
            long r5 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r3 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.Object r4 = r4.getService(r3)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r4 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r4
            if (r4 == 0) goto Lab
            r10 = 1
        L2b:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r3 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.String r8 = r3.getName()
            if (r4 == 0) goto La9
            java.lang.Class r3 = r4.getClass()
            java.lang.String r9 = r3.getName()
        L3b:
            X.C1AQS.LIZJ(r5, r7, r8, r9, r10)
        L3e:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService r4 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r4
            boolean r3 = r4.isDebug()
            if (r3 != 0) goto L86
            boolean r3 = X.C034S.LIZ()
            if (r3 == 0) goto L99
            X.04Zw r3 = X.C1120604Zw.LIZ
            r3.LIZ()
            long r7 = android.os.SystemClock.elapsedRealtime()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r3 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.Object r3 = r4.getService(r3)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r3
            if (r3 == 0) goto L97
            r12 = 1
        L64:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r4 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.String r10 = r4.getName()
            r9 = 1
            if (r3 == 0) goto L75
            java.lang.Class r4 = r3.getClass()
            java.lang.String r11 = r4.getName()
        L75:
            X.C1AQS.LIZJ(r7, r9, r10, r11, r12)
        L78:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r3
            java.lang.String r4 = r3.getChannel()
            java.lang.String r3 = "local_test"
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r3)
            if (r3 == 0) goto L93
        L86:
            android.widget.Toast r4 = new android.widget.Toast
            r4.<init>(r13)
            java.lang.String r3 = "Native Polling Page"
            r4.setText(r3)
            X.C786410Ut5.re(r4)
        L93:
            com.bytedance.apm.agent.v2.instrumentation.ActivityAgent.onTrace(r2, r1, r0)
            return
        L97:
            r12 = 0
            goto L64
        L99:
            X.04Zw r3 = X.C1120604Zw.LIZ
            r3.LIZ()
            X.04aq r4 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r3 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            X.0317 r3 = r4.LIZLLL(r3)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r3
            goto L78
        La9:
            r9 = r11
            goto L3b
        Lab:
            r10 = 0
            goto L2b
        Lae:
            X.04Zw r3 = X.C1120604Zw.LIZ
            r3.LIZ()
            X.04aq r4 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r3 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            X.0317 r4 = r4.LIZLLL(r3)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r4 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r4
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity.onResume():void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_pay_result_polling_done", this);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_pay_result_polling_done", this);
        }
        C908803gs.LIZ.getClass();
        C908803gs.LIZIZ = null;
        C908803gs.LIZJ.clear();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity", "onCreate", true);
        activityConfiguration(AFwS228S0000000_1.get$arr$(242));
        super.onCreate(bundle);
        C1018703yb.LIZIZ("tiktokec_enter_page", C2097908Jt.LIZJ(new Pair("page_name", "native_polling_page")));
        setContentView(R.layout.aqh);
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823350);
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1202));
        c0om1.LJ(c1251150ifB);
        tuxNavBar.setNavActions(c0om1);
        View viewFindViewById = findViewById(R.id.ng3);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.uj, viewFindViewById.getContext());
        c384050F3z.LIZJ = Float.valueOf(C0H9H.LIZIZ(12));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.nty);
        c1295960jpS.setAnimationFromUrl(C989403ts.LIZ());
        c1295960jpS.playAnimation();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.base.osp.payment.polling.PaymentFinishPollingActivity", "onCreate", false);
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

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_pay_result_polling_done") && !isFinishing()) {
            finish();
        }
    }
}
