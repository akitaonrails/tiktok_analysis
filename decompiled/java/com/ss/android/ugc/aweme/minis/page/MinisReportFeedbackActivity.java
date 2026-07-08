package com.ss.android.ugc.aweme.minis.page;

import X.C0OM1;
import X.C1235670iGD;
import X.C1237360iIw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1378990lzN;
import X.C1388190mED;
import X.C1697810uHb;
import X.C1841350y17;
import X.C1943007jI;
import X.C197039127h;
import X.C20642515q3;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2196681AyA;
import X.C2196701AyC;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC335920DEw;
import X.ViewTreeObserverOnGlobalLayoutListenerC1265980j36;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS7S1400000_19;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisReportFeedbackActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjHELIOSUtLip9BSwiIDwBLTUjOzsVLSAoKy4wIwQvPSYlITE1";
    public int LL;
    public C1841350y17 LLILLL;
    public C1841350y17 LLILZ;
    public C1841350y17 LLILZIL;
    public C1841350y17 LLILZLL;
    public C1841350y17 LLIZ;
    public C1841350y17 LLIZLLLIL;
    public LinearLayout LLJ;
    public LinearLayout LLJI;
    public LinearLayout LLJIJIL;
    public LinearLayout LLJILJIL;
    public LinearLayout LLJILJILJ;
    public LinearLayout LLJILLL;
    public C197039127h LLJJ;
    public C1235670iGD LLJJI;
    public View LLJJIII;
    public boolean LLJJIJIIJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC1265980j36 LLJJIJIL;
    public View LLJJJ;
    public long LLJJJIL;
    public final int LLILLJJLI = 200;
    public final String LLJJIJI = C20642515q3.LJI(2131822212);

    public static String LLLLLZL(int i) {
        switch (i) {
            case 1:
                return "cannot_open";
            case 2:
                return "lag";
            case 3:
                return "screen_blanked_out";
            case 4:
                return "app_unresponsive";
            case 5:
                return "slow_loading";
            case 6:
                return "other";
            default:
                return "";
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        String stringExtra;
        ViewTreeObserver viewTreeObserver;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity", "onResume", true);
        super.onResume();
        this.LLJJJIL = System.currentTimeMillis();
        try {
            stringExtra = getIntent().getStringExtra("url");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1943007jI.LIZJ(stringExtra));
        sbLIZ.append("/minis-ReportFeedbackActivity");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJI(strLIZIZ);
        View view = this.LLJJJ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1265980j36 viewTreeObserverOnGlobalLayoutListenerC1265980j36 = this.LLJJIJIL;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1265980j36);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1265980j36, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity", "onResume", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        SmartRouter.buildRoute(C1388190mED.LIZ(this), "//minis_internal/report_page").open();
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        View view = this.LLJJJ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1265980j36 viewTreeObserverOnGlobalLayoutListenerC1265980j36 = this.LLJJIJIL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1265980j36);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1265980j36, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJI(this);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJIL;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = 0;
        }
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJJ(jCurrentTimeMillis, "1");
        this.LLJJJIL = System.currentTimeMillis();
        View view = this.LLJJJ;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1265980j36 viewTreeObserverOnGlobalLayoutListenerC1265980j36 = this.LLJJIJIL;
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1265980j36);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1265980j36, ViewTreeObserver.OnGlobalLayoutListener.class);
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

    /* JADX WARN: Removed duplicated region for block: B:49:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZI(int r5) {
        /*
            r4 = this;
            r4.LL = r5
            X.0y17 r1 = r4.LLILLL
            r3 = 1
            if (r1 == 0) goto Ld
            if (r5 != r3) goto L72
            r0 = 1
        La:
            r1.setChecked(r0)
        Ld:
            X.0y17 r1 = r4.LLILZ
            if (r1 == 0) goto L18
            r0 = 2
            if (r5 != r0) goto L70
            r0 = 1
        L15:
            r1.setChecked(r0)
        L18:
            X.0y17 r1 = r4.LLILZIL
            if (r1 == 0) goto L23
            r0 = 3
            if (r5 != r0) goto L6e
            r0 = 1
        L20:
            r1.setChecked(r0)
        L23:
            X.0y17 r1 = r4.LLILZLL
            if (r1 == 0) goto L2e
            r0 = 4
            if (r5 != r0) goto L6c
            r0 = 1
        L2b:
            r1.setChecked(r0)
        L2e:
            X.0y17 r1 = r4.LLIZ
            if (r1 == 0) goto L39
            r0 = 5
            if (r5 != r0) goto L6a
            r0 = 1
        L36:
            r1.setChecked(r0)
        L39:
            X.0y17 r1 = r4.LLIZLLLIL
            if (r1 == 0) goto L44
            r0 = 6
            if (r5 != r0) goto L68
            r0 = 1
        L41:
            r1.setChecked(r0)
        L44:
            X.127h r2 = r4.LLJJ
            if (r2 == 0) goto L63
            int r0 = r4.LL
            if (r0 == 0) goto L66
            X.0iGD r0 = r4.LLJJI
            if (r0 == 0) goto L64
            java.lang.CharSequence r0 = r0.getMessage()
        L54:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r0 = r4.LLILLJJLI
            if (r1 > r0) goto L66
        L60:
            r2.setEnabled(r3)
        L63:
            return
        L64:
            r0 = 0
            goto L54
        L66:
            r3 = 0
            goto L60
        L68:
            r0 = 0
            goto L41
        L6a:
            r0 = 0
            goto L36
        L6c:
            r0 = 0
            goto L2b
        L6e:
            r0 = 0
            goto L20
        L70:
            r0 = 0
            goto L15
        L72:
            r0 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity.LLLLZI(int):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TuxTextView tuxTextView;
        int length;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        TextView textView = null;
        this.LLJJJ = C786410Ut5.Sd(R.layout.jz, C786410Ut5.ne(this), null);
        View view = this.LLJJJ;
        if (view != null) {
            WeakReference weakReference = new WeakReference(view);
            TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.t8f);
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
            c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3317));
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C20642515q3.LJI(2131822227);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.t8e);
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this), R.layout.f852k0, viewGroup, false);
            this.LLJJIJIL = new ViewTreeObserverOnGlobalLayoutListenerC1265980j36(weakReference, this, (ScrollView) view.findViewById(R.id.ofu), 0);
            C786410Ut5.x3(view.getViewTreeObserver(), this.LLJJIJIL);
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.whh);
            C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(this, c197039127h, 88));
            c197039127h.setEnabled(false);
            this.LLJJ = c197039127h;
            View viewFindViewById = viewTd.findViewById(R.id.dsg);
            C1378990lzN.LIZIZ(viewTd.findViewById(R.id.ds_), Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
            this.LLILLL = (C1841350y17) viewFindViewById.findViewById(R.id.dbq);
            this.LLILZ = (C1841350y17) viewFindViewById.findViewById(R.id.m4x);
            this.LLILZIL = (C1841350y17) viewFindViewById.findViewById(R.id.c32);
            this.LLILZLL = (C1841350y17) viewFindViewById.findViewById(R.id.unresponsive_radio);
            this.LLIZ = (C1841350y17) viewFindViewById.findViewById(R.id.vlh);
            this.LLIZLLLIL = (C1841350y17) viewFindViewById.findViewById(R.id.pvc);
            C1841350y17 c1841350y17 = this.LLILLL;
            if (c1841350y17 != null) {
                c1841350y17.setInterceptToggleListener(new AwS563S0100000_19(this, 3318));
            }
            C1841350y17 c1841350y172 = this.LLILZ;
            if (c1841350y172 != null) {
                c1841350y172.setInterceptToggleListener(new AwS563S0100000_19(this, 3319));
            }
            C1841350y17 c1841350y173 = this.LLILZIL;
            if (c1841350y173 != null) {
                c1841350y173.setInterceptToggleListener(new AwS563S0100000_19(this, 3309));
            }
            C1841350y17 c1841350y174 = this.LLILZLL;
            if (c1841350y174 != null) {
                c1841350y174.setInterceptToggleListener(new AwS563S0100000_19(this, 3310));
            }
            C1841350y17 c1841350y175 = this.LLIZ;
            if (c1841350y175 != null) {
                c1841350y175.setInterceptToggleListener(new AwS563S0100000_19(this, 3311));
            }
            C1841350y17 c1841350y176 = this.LLIZLLLIL;
            if (c1841350y176 != null) {
                c1841350y176.setInterceptToggleListener(new AwS563S0100000_19(this, 3312));
            }
            this.LLJ = (LinearLayout) viewFindViewById.findViewById(R.id.dbp);
            this.LLJI = (LinearLayout) viewFindViewById.findViewById(R.id.m4w);
            this.LLJIJIL = (LinearLayout) viewFindViewById.findViewById(R.id.c31);
            this.LLJILJIL = (LinearLayout) viewFindViewById.findViewById(R.id.unresponsive);
            this.LLJILJILJ = (LinearLayout) viewFindViewById.findViewById(R.id.vlg);
            this.LLJILLL = (LinearLayout) viewFindViewById.findViewById(R.id.pv0);
            LinearLayout linearLayout = this.LLJ;
            if (linearLayout != null) {
                C786410Ut5.R7(linearLayout, new ACListenerS154S0100000_19(this, 282));
            }
            LinearLayout linearLayout2 = this.LLJI;
            if (linearLayout2 != null) {
                C786410Ut5.R7(linearLayout2, new ACListenerS154S0100000_19(this, 283));
            }
            LinearLayout linearLayout3 = this.LLJIJIL;
            if (linearLayout3 != null) {
                C786410Ut5.R7(linearLayout3, new ACListenerS154S0100000_19(this, 289));
            }
            LinearLayout linearLayout4 = this.LLJILJIL;
            if (linearLayout4 != null) {
                C786410Ut5.R7(linearLayout4, new ACListenerS154S0100000_19(this, 290));
            }
            LinearLayout linearLayout5 = this.LLJILJILJ;
            if (linearLayout5 != null) {
                C786410Ut5.R7(linearLayout5, new ACListenerS154S0100000_19(this, 291));
            }
            LinearLayout linearLayout6 = this.LLJILLL;
            if (linearLayout6 != null) {
                C786410Ut5.R7(linearLayout6, new ACListenerS154S0100000_19(this, 292));
            }
            this.LLJJIII = C786410Ut5.Sd(R.layout.dnk, C786410Ut5.ne(this), null);
            C1235670iGD c1235670iGD = (C1235670iGD) viewTd.findViewById(R.id.xop).findViewById(R.id.xmi);
            c1235670iGD.setPlaceholder(this.LLJJIJI);
            c1235670iGD.setMessageMaxLength(this.LLILLJJLI);
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
            c1235670iGD.setAreaBoxTrailingView(this.LLJJIII);
            View view2 = this.LLJJIII;
            if (view2 != null) {
                tuxTextView = (TuxTextView) view2.findViewById(R.id.yhd);
            } else {
                tuxTextView = null;
            }
            View view3 = this.LLJJIII;
            if (view3 != null) {
                textView = (TextView) view3.findViewById(R.id.yhc);
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
                sbLIZ.append(this.LLILLJJLI);
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS7S1400000_19(c1235670iGD, tuxTextView, this, bPEAHandler, 1));
            this.LLJJI = c1235670iGD;
            viewGroup.addView(viewTd);
            setContentView(view);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity", "onCreate", false);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
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
