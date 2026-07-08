package com.ss.android.ugc.aweme.account.passwordless.leaked;

import X.C01GW;
import X.C05P0;
import X.C1243260iSS;
import X.C1308910kAL;
import X.C13Z4;
import X.C13ZC;
import X.C1669670tYD;
import X.C1671870tbl;
import X.C1672060tc4;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1697810uHb;
import X.C19719212De;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.EnumC335920DEw;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.os.Bundle;
import androidx.compose.foundation.layout.c;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS195S1100000_19;
import kotlin.jvm.internal.AwS42S1101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class LeakedGoPasswordlessActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiOS4gOzIjOyHELIOSs/LTY/ZyM2KS4pLWEfLSQnLCsUJxUtOjwkJzcoJSogOwQvPSYlITE1";
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 353));
    public boolean LLILLJJLI = true;
    public String LLILLL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity", "onWindowFocusChanged", true);
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

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        String string;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity", "onCreate", true);
        super.onCreate(bundle);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
        tuxImmersionBar.LJ(R.attr.bx);
        tuxImmersionBar.LJIIIIZZ(R.attr.bx);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
        try {
            extras = getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        String str = "";
        if (extras != null && (string = extras.getString("enter_from", "")) != null) {
            str = string;
        }
        C1669670tYD.LJFF(this, new C19719212De(105885489, new AwS195S1100000_19(this, str, 0), true));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.passwordless.leaked.LeakedGoPasswordlessActivity", "onCreate", false);
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

    public final void LLLLLZL(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2120750484);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(C1243260iSS.LIZ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(InterfaceC1685750ty9.LIZ);
            Object value = c05p0.getValue();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = AFwS266S0000000_25.get$arr$(83);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1671870tbl.LIZIZ(value, interfaceC1685750ty9LIZLLL, (Function1) objLJJ2, null, null, null, C13Z4.LIZJ(2065253756, new C1672060tc4(this, str, c05p0), c13zcLJIIJ), c13zcLJIIJ, 1573296, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS42S1101000_19(this, str, i, 1);
        }
    }
}
