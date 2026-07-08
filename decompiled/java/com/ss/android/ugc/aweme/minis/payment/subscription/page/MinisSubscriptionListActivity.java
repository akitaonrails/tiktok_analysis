package com.ss.android.ugc.aweme.minis.payment.subscription.page;

import X.AbstractC1250290idn;
import X.C0HTI;
import X.C0OM1;
import X.C1232500iB6;
import X.C1232790iBZ;
import X.C1233080iC2;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2196681AyA;
import X.C299020Bno;
import X.C335910DEv;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC1094560eac;
import X.EnumC335920DEw;
import X.InterfaceC197023126r;
import Y.AsS33S0200000_19;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisSubscriptionListActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyYgZjUtMCI2JjFiOjoxOyHELIOSY+ID8nISoiZz8yLyBiBCY9ITYfPC0gKzclOTs6JysAIDwnCSY4IDk6PDw=";
    public TuxNavBar LL;
    public C1749280vcc LLILLJJLI;
    public RecyclerView LLILLL;
    public C1233080iC2 LLILZ;
    public ArrayList<MinisSubscriptionInfo> LLILZIL = new ArrayList<>();
    public final ArrayList<MinisSubscriptionInfo> LLILZLL = new ArrayList<>();
    public final ArrayList<MinisSubscriptionInfo> LLIZ = new ArrayList<>();
    public final AsS33S0200000_19 LLIZLLLIL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity", "onResume", true);
        super.onResume();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public MinisSubscriptionListActivity() {
        new C1232790iBZ();
        this.LLIZLLLIL = new AsS33S0200000_19(this, 0);
    }

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackPressed, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        RecyclerView recyclerView = this.LLILLL;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.LLIZLLLIL);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause, instance:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
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

    public static int LLLLLZL(Long l) {
        long value = EnumC1094560eac.ACTIVE.getValue();
        if (l != null && l.longValue() == value) {
            return 1;
        }
        long value2 = EnumC1094560eac.INACTIVE.getValue();
        if (l == null) {
            return 3;
        }
        if (l.longValue() == value2) {
            return 2;
        }
        return 4;
    }

    public final void LLLLZI(boolean z) {
        if (z) {
            C1749280vcc c1749280vcc = this.LLILLJJLI;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
                return;
            }
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLILLJJLI;
        if (c1749280vcc2 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc2, 8);
        }
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerView2, 0);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iIntValue;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity", "onCreate", true);
        super.onCreate(bundle);
        C2196681AyA.LIZ.getClass();
        C2196681AyA.LJFF(this);
        setContentView(R.layout.dnd);
        int i = C2187451AjH.LIZ;
        this.LL = (TuxNavBar) findViewById(R.id.aeb);
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
        c1251150ifB.LJI = true;
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZIZ = "nav_back";
        c1251150ifB.LJIIIIZZ = "nav_back";
        c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0iB1
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                int i2 = C2187451AjH.LIZ;
                this.LIZ.finish();
            }
        };
        c0om1.LJ(c1251150ifB);
        c0om1.LIZIZ(new AbstractC1250290idn[0]);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(false);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            tuxNavBar.setNavBackground(iIntValue);
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131822295);
        TuxNavBar tuxNavBar2 = this.LL;
        if (tuxNavBar2 != null) {
            tuxNavBar2.LJIJJ(c1250250idj);
        }
        this.LLILLJJLI = (C1749280vcc) findViewById(R.id.ogt);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.nd;
        Drawable drawableLIZ = c0hti.LIZ(this);
        String string = getString(2131822314);
        String string2 = getString(2131822311);
        C1749280vcc c1749280vcc = this.LLILLJJLI;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = string;
            c1722300uv6.LJIIIIZZ = string2;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1749280vcc.setStatus(c1722300uv6);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.t0w);
        this.LLILLL = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(this.LLIZLLLIL);
        }
        C1233080iC2 c1233080iC2 = new C1233080iC2(new AwS598S0100000_19(this, 910));
        this.LLILZ = c1233080iC2;
        RecyclerView recyclerView3 = this.LLILLL;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(c1233080iC2);
        }
        C1232500iB6.LIZ.getClass();
        C1232500iB6.LIZJ.observe(this, new Observer() { // from class: X.0iB3
            /* JADX WARN: Removed duplicated region for block: B:101:0x019a  */
            /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00f2 A[PHI: r1
              0x00f2: PHI (r1v4 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>) = 
              (r1v3 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
              (r1v20 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
              (r1v20 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
             binds: [B:58:0x00ee, B:27:0x0054, B:29:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00fa A[PHI: r2
              0x00fa: PHI (r2v1 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>) = 
              (r2v0 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
              (r2v9 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
              (r2v9 java.util.Map<java.lang.String, com.ss.android.ugc.aweme.minis.model.payment.subscription.MinisSubscriptionInfo>)
             binds: [B:62:0x00f6, B:10:0x0026, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x0174  */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 436
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1232470iB3.onChanged(java.lang.Object):void");
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionListActivity", "onCreate", false);
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
