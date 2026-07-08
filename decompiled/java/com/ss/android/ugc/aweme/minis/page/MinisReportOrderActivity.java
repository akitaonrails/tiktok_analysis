package com.ss.android.ugc.aweme.minis.page;

import X.C0OM1;
import X.C1235670iGD;
import X.C1237360iIw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1697810uHb;
import X.C197039127h;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2196681AyA;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC335920DEw;
import Y.ACListenerS122S0200000_19;
import Y.ARunnableS7S1400000_19;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisReportOrderActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgHELIOSZjUtLip9BSwiIDwBLTUjOzscOiEpOw4wPCw6IDsq";
    public C197039127h LLILLJJLI;
    public C1235670iGD LLILLL;
    public View LLILZ;
    public final int LL = 200;
    public final String LLILZIL = C20642515q3.LJI(2131822212);

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        SmartRouter.buildRoute(C1388190mED.LIZ(this), "//minis_internal/report_page").open();
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJI(this);
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
        TuxTextView tuxTextView;
        int length;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity", "onCreate", true);
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJI(this);
        TextView textView = null;
        View viewSd = C786410Ut5.Sd(R.layout.k1, C786410Ut5.ne(this), null);
        TuxNavBar tuxNavBar = (TuxNavBar) viewSd.findViewById(R.id.t90);
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(this);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        immersionBarLJIILJJIL.LJIIJJI();
        tuxImmersionBar.LJIIJJI();
        tuxImmersionBar.LIZ(false);
        immersionBarLJIILJJIL.LJIIJ(!C960203pA.LIZIZ(this));
        tuxImmersionBar.LIZLLL();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3315));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C20642515q3.LJI(2131822227);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.t8z);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this), R.layout.k2, viewGroup, false);
        this.LLILZ = C786410Ut5.Sd(R.layout.dnk, C786410Ut5.ne(this), null);
        C1235670iGD c1235670iGD = (C1235670iGD) viewTd.findViewById(R.id.xop).findViewById(R.id.xmi);
        c1235670iGD.setPlaceholder(this.LLILZIL);
        c1235670iGD.setMessageMaxLength(this.LL);
        c1235670iGD.LLILLJJLI.setHasScrollBar(true);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(137));
        if (iLIZIZ2 >= iLIZIZ) {
            C1237360iIw c1237360iIw = c1235670iGD.LLILLJJLI;
            c1237360iIw.LLILZLL = true;
            c1237360iIw.LLJILLL = iLIZIZ;
            c1237360iIw.LLJJ = iLIZIZ2;
            c1237360iIw.LIZIZ();
        }
        c1235670iGD.setApproveExceed(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zq, this);
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        c1235670iGD.setAreaBoxCustomContainer(gradientDrawable);
        c1235670iGD.setAreaBoxTrailingView(this.LLILZ);
        View view = this.LLILZ;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.yhd);
        } else {
            tuxTextView = null;
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.yhc);
        }
        if (tuxTextView != null) {
            CharSequence message = c1235670iGD.getMessage();
            if (message != null) {
                length = message.length();
            } else {
                length = 0;
            }
            tuxTextView.setText(String.valueOf(length));
        }
        if (textView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(this.LL);
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS7S1400000_19(c1235670iGD, tuxTextView, this, bPEAHandler, 0));
        this.LLILLL = c1235670iGD;
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.whh);
        C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(this, c197039127h, 87));
        c197039127h.setEnabled(false);
        this.LLILLJJLI = c197039127h;
        viewGroup.addView(viewTd);
        setContentView(viewSd);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportOrderActivity", "onCreate", false);
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
