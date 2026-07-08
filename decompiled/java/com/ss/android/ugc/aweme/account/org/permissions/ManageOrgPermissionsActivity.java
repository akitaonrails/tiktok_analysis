package com.ss.android.ugc.aweme.account.org.permissions;

import X.AbstractC1220800hsE;
import X.C01GW;
import X.C05P0;
import X.C1220810hsF;
import X.C1266270j3Z;
import X.C1308910kAL;
import X.C13Z4;
import X.C13ZC;
import X.C1669670tYD;
import X.C1671780tbc;
import X.C1671840tbi;
import X.C1671870tbl;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1697810uHb;
import X.C19719212De;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C299020Bno;
import X.C335910DEv;
import X.C452501pT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS179S0101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageOrgPermissionsActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJj00ZjUpHELIOSOyI6OzYlJiEgZggtJy40LQo+Lh82OiglOjw6Jys/CCwnITMlPTY=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 317));

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final DialogC1389620mGW LLLLZI() {
        return (DialogC1389620mGW) this.LL.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C786410Ut5.LJIIJ(LLLLZI());
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

    @Override // X.ActivityC21503719Dn, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity", "onCreate", true);
        super.onCreate(bundle);
        C1669670tYD.LJFF(this, new C19719212De(1655766931, new AwS633S0100000_19(this, 15), true));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity", "onCreate", false);
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

    public final void LLLLLZL(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(488829916);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
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
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(this, ImmersionBar.LJIILJJIL(this));
            tuxImmersionBar.LJ(R.attr.zp);
            tuxImmersionBar.LJIIIIZZ(R.attr.zp);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(C1220810hsF.LIZ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            boolean zLJFF = true ^ Intrinsics.LJFF(c05p0.getValue(), C1220810hsF.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS563S0100000_19(c05p0, (C05P0<AbstractC1220800hsE>) 316);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1671780tbc.LIZ(48, 0, c13zcLJIIJ, (Function0) objLJJ2, zLJFF);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(C1671840tbi.LIZIZ(InterfaceC1685750ty9.LIZ));
            Object value = c05p0.getValue();
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS604S0100000_25(c05p0, (C05P0<Boolean>) 71);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1671870tbl.LIZIZ(value, interfaceC1685750ty9LIZLLL, (Function1) objLJJ3, null, null, null, C13Z4.LIZJ(1282955204, new C1266270j3Z(this, (ManageOrgPermissionsActivity) c05p0, (C05P0<AbstractC1220800hsE>) 0), c13zcLJIIJ), c13zcLJIIJ, 1573248, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS179S0101000_19(this, i, 3);
        }
    }
}
