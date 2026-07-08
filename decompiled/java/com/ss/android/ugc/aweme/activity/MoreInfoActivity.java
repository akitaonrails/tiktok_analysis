package com.ss.android.ugc.aweme.activity;

import X.C0MXE;
import X.C0TVI;
import X.C1308910kAL;
import X.C13D2;
import X.C13ZC;
import X.C14K9;
import X.C1665750tRt;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1679920tok;
import X.C1679930tol;
import X.C1680190tpB;
import X.C1682430tsn;
import X.C1682520tsw;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1688120u1y;
import X.C1692220u8a;
import X.C1692230u8b;
import X.C1693430uAX;
import X.C1693450uAZ;
import X.C1697810uHb;
import X.C19719212De;
import X.C20030013Ys;
import X.C20684815ws;
import X.C2344009Gk;
import X.C299020Bno;
import X.C335910DEv;
import X.EnumC335920DEw;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class MoreInfoActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiHELIOSQvPSYlITE1ZwI8OiAFJyk8CSY4IDk6PDw=";
    public String LL = "";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.MoreInfoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.MoreInfoActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.MoreInfoActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.MoreInfoActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.MoreInfoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    public final void LLLLZLLIL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "effect_info_page");
        c2344009Gk.LJIIIIZZ("prop_id", this.LL);
        String str2 = "got_it";
        if (!Intrinsics.LJFF(str, "got_it")) {
            str2 = "click_close_button";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684815ws.LJIILLIIL("effect_page_info_close", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        String string;
        View viewFindViewById;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.MoreInfoActivity", "onCreate", true);
        super.onCreate(bundle);
        String string2 = null;
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        C1669670tYD.LJFF(this, new C19719212De(1183646731, new AwS460S0200000_25(extras, this, 9), true));
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
        if (Build.VERSION.SDK_INT >= 35 && (viewFindViewById = getWindow().getDecorView().findViewById(android.R.id.content)) != null) {
            C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0tiQ
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view.setPadding(c20244914JjLIZ.LIZ, view.getPaddingTop(), c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        if (extras != null) {
            string = extras.getString("enter_from");
        } else {
            string = null;
        }
        if (extras != null) {
            string2 = extras.getString("prop_id");
        }
        this.LL = string2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", string);
        c2344009Gk.LJIIIIZZ("prop_id", this.LL);
        C20684815ws.LJIILLIIL("effect_page_info_show", c2344009Gk.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.activity.MoreInfoActivity", "onCreate", false);
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

    public static C1692220u8a LLLLZLLLI(InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        interfaceC1680500tpg.LJJIIJZLJL(107210534);
        C1692230u8b c1692230u8b = new C1692230u8b();
        int iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(C1670400tZO.LIZIZ(interfaceC1680500tpg).K3(), C1682430tsn.LJ(16), C1680190tpB.LLJ, null, null, null, null, 0L, null, null, null, 0L, null, null, 65528));
        try {
            c1692230u8b.LIZLLL(str);
            c1692230u8b.LJII(iLJIIJJI);
            C1692220u8a c1692220u8aLJIIL = c1692230u8b.LJIIL();
            interfaceC1680500tpg.LJ();
            return c1692220u8aLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1692230u8b.LJII(iLJIIJJI);
            throw th;
        }
    }

    public final void LLLLLZL(C1692220u8a c1692220u8a, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(523021987);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                float f = 4;
                C1685190txF.LIZ("•", C1682520tsw.LJIIL(c1685760tyA, f, 0.0f, f, 0.0f, 10), 0L, new C1693430uAX(C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1682430tsn.LJ(16), C1680190tpB.LLJ, null, null, 0L, null, 0, 0L, 16777208), 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 6, 0, 2036);
                C1685190txF.LIZIZ(c1692220u8a, null, 0L, null, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, i2 & 14, 0, 2046);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1692220u8a, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZI(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r19, X.InterfaceC1680500tpg r20, int r21) {
        /*
            r18 = this;
            r0 = 401206026(0x17e9eb0a, float:1.5116604E-24)
            r1 = r20
            X.13ZC r15 = r1.LJIIJ(r0)
            r3 = r21
            r0 = r3 & 6
            r1 = 4
            r5 = 2
            r4 = r19
            if (r0 != 0) goto L89
            boolean r0 = r15.LJII(r4)
            if (r0 == 0) goto L87
            r2 = 4
        L1a:
            r2 = r2 | r3
        L1b:
            r0 = r2 & 3
            if (r0 != r5) goto L39
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L39
            r15.LIZJ()
        L28:
            X.13Ys r2 = r15.LJJJJZI()
            if (r2 == 0) goto L38
            kotlin.jvm.internal.AwS120S0201000_8 r1 = new kotlin.jvm.internal.AwS120S0201000_8
            r0 = 0
            r5 = r18
            r1.<init>(r5, r4, r3, r0)
            r2.LIZLLL = r1
        L38:
            return
        L39:
            X.0tWw r7 = X.C1669660tYC.Z
            r0 = 24
            float r12 = (float) r0
            X.1ETK r0 = X.C1670400tZO.LIZIZ(r15)
            long r10 = r0.K3()
            X.0tyA r6 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r2 & 14
            r5 = 0
            if (r0 != r1) goto L85
            r0 = 1
        L54:
            java.lang.Object r2 = r15.LJJ()
            if (r0 != 0) goto L63
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L6d
        L63:
            kotlin.jvm.internal.AwS569S0100000_25 r2 = new kotlin.jvm.internal.AwS569S0100000_25
            r0 = 136(0x88, float:1.9E-43)
            r2.<init>(r4, r0)
            r15.LJJIJIIJI(r2)
        L6d:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r15.LJJJJL(r5)
            r1 = 7
            r0 = 0
            X.0ty9 r9 = X.C634380OuS.LIZJ(r6, r5, r0, r2, r1)
            java.lang.String r8 = "X button for quitting page"
            r14 = 0
            r16 = 221232(0x36030, float:3.10012E-40)
            r17 = 64
            r13 = r12
            X.C1668930tX1.LIZIZ(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            goto L28
        L85:
            r0 = 0
            goto L54
        L87:
            r2 = 2
            goto L1a
        L89:
            r2 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.activity.MoreInfoActivity.LLLLZI(kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0512  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLL(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r56, X.InterfaceC1680500tpg r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.activity.MoreInfoActivity.LLLLZLL(kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZIL(java.lang.String r39, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r40, X.InterfaceC1680500tpg r41, int r42) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.activity.MoreInfoActivity.LLLLZIL(java.lang.String, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }
}
