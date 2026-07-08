package com.ss.android.ugc.aweme.account.leaked.password;

import X.C0MBB;
import X.C0MXE;
import X.C0XQ7;
import X.C1308910kAL;
import X.C13D2;
import X.C13Z4;
import X.C13ZC;
import X.C1665740tRs;
import X.C1665930tSB;
import X.C1666340tSq;
import X.C1666920tTm;
import X.C1667750tV7;
import X.C1668040tVa;
import X.C1668060tVc;
import X.C1668230tVt;
import X.C1669430tXp;
import X.C1669670tYD;
import X.C1669720tYI;
import X.C1670400tZO;
import X.C1670890taB;
import X.C1671840tbi;
import X.C1673400teE;
import X.C1675980tiO;
import X.C1678400tmI;
import X.C1679930tol;
import X.C1680030tov;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1682520tsw;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685850tyJ;
import X.C1687990u1l;
import X.C1688130u1z;
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
import android.os.Bundle;
import androidx.compose.foundation.layout.c;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS49S0102000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class LeakedPasswordInboxDialogActivity extends BaseActivity {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSoyIyAoZz8yHELIOSOzY7Jj03ZgkpKCQ2LBUtOjwkJzcoACExJz0IIC4/JyINKjs6Piw4MA==";
    public String LL = "go_passwordless";

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.leaked.password.LeakedPasswordInboxDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.leaked.password.LeakedPasswordInboxDialogActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.leaked.password.LeakedPasswordInboxDialogActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.leaked.password.LeakedPasswordInboxDialogActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.leaked.password.LeakedPasswordInboxDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void LLLLZI() {
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String str = this.LL;
        c1669720tYI.getClass();
        C1669720tYI.LIZ("system_notification", str, "change_password");
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIIJJI().changePassword(this, "system_notification", "password_click", new Bundle(), null);
        finish();
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

    public final void LLLLZIL(String str) {
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String str2 = this.LL;
        c1669720tYI.getClass();
        C1669720tYI.LIZ("system_notification", str2, str);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "//account/passwordless/leaked_pw");
        smartRouteBuildRoute.withParam("enter_from", "system_notification");
        smartRouteBuildRoute.open();
        finish();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle extras;
        String string;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.leaked.password.LeakedPasswordInboxDialogActivity", "onCreate", true);
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
        }
        if (extras == null || (string = extras.getString("popup")) == null) {
            i = 1;
        } else {
            i = CastIntegerProtector.parseInt(string);
        }
        C1669670tYD.LJFF(this, new C19719212De(-1501190770, new AwS181S0101000_25(this, i, 12), true));
        if (i != 1) {
            if (i != 2) {
                this.LL = "create_passkey";
            } else {
                this.LL = "go_passwordless";
            }
        } else {
            this.LL = "change_password";
        }
        C1669720tYI.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "system_notification");
        C20684815ws.LJIILLIIL("change_pwd_notification_click", c2344009Gk.LIZ);
        C1669720tYI.LIZIZ("system_notification", this.LL);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.leaked.password.LeakedPasswordInboxDialogActivity", "onCreate", false);
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

    public final void LLLLLZL(int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        String strLIZIZ;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-415094999);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1671840tbi.LIZ(C1671840tbi.LIZIZ(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).F2(), C1669430tXp.LIZ))), 1.0f);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1687990u1l c1687990u1l = C1687990u1l.LIZ;
                float f = 0;
                C1668060tVc.LIZ(C1682520tsw.LJIIJJI(c1685760tyA, f, f, f, f), false, 0L, C1685850tyJ.LIZIZ(0), null, null, null, C13Z4.LIZJ(-1138145932, new AwS639S0100000_25(this, 13), c13zcLJIIJ), c13zcLJIIJ, 12585984, 118);
                float f2 = 56;
                float f3 = 16;
                C1668230tVt.LIZ(C1670890taB.LIZ(C1667750tV7.LJIIJJI, c13zcLJIIJ), "main image", c.LJ(C1682520tsw.LJIIJJI(c1685760tyA, f2, 112, f2, f3), 1.0f), null, null, 0.0f, null, c13zcLJIIJ, 48, 120);
                float f4 = 32;
                C1685190txF.LIZ(C0MBB.LIZIZ(2131824627, c13zcLJIIJ), C1682520tsw.LJIIL(c1685760tyA, f4, 0.0f, f4, f3, 2), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIJIIJIL, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                if (i == 1) {
                    i4 = 2131824594;
                } else {
                    i4 = 2131824597;
                }
                C1678400tmI c1678400tmI = C1678400tmI.LIZ;
                String strLIZIZ2 = C0MBB.LIZIZ(i4, c13zcLJIIJ);
                String strLIZIZ3 = C0MBB.LIZIZ(2131824611, c13zcLJIIJ);
                c1678400tmI.getClass();
                C1685190txF.LIZIZ(C1678400tmI.LIZ(strLIZIZ2, strLIZIZ3, c13zcLJIIJ), C1682520tsw.LJIIL(c1685760tyA, f4, 0.0f, f4, f3, 2), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJZLJL, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                k.LIZ(c1687990u1l.LIZ(c1685760tyA, 1.0f, true), c13zcLJIIJ, 0);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = AFwS214S0000000_25.get$arr$(79);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                Function0 function0 = (Function0) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = AFwS214S0000000_25.get$arr$(80);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                Function0 function02 = (Function0) objLJJ2;
                c13zcLJIIJ.LJJJJL(false);
                String strLIZIZ4 = "";
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            c13zcLJIIJ.LJJIIJZLJL(-1936156413);
                            c13zcLJIIJ.LJJJJL(false);
                            strLIZIZ = "";
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(-1936573487);
                            strLIZIZ = C0MBB.LIZIZ(2131839114, c13zcLJIIJ);
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            boolean zLJII = c13zcLJIIJ.LJII(this);
                            Object objLJJ3 = c13zcLJIIJ.LJJ();
                            if (zLJII || objLJJ3 == c1680520tpi) {
                                objLJJ3 = new AwS569S0100000_25(this, 100);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                            }
                            function0 = (Function0) objLJJ3;
                            c13zcLJIIJ.LJJJJL(false);
                            strLIZIZ4 = C0MBB.LIZIZ(2131824629, c13zcLJIIJ);
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            boolean zLJII2 = c13zcLJIIJ.LJII(this);
                            Object objLJJ4 = c13zcLJIIJ.LJJ();
                            if (zLJII2 || objLJJ4 == c1680520tpi) {
                                objLJJ4 = new AwS569S0100000_25(this, 101);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                            }
                            function02 = (Function0) objLJJ4;
                            c13zcLJIIJ.LJJJJL(false);
                            c13zcLJIIJ.LJJJJL(false);
                        }
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(-1937024134);
                        strLIZIZ = C0MBB.LIZIZ(2131824631, c13zcLJIIJ);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        boolean zLJII3 = c13zcLJIIJ.LJII(this);
                        Object objLJJ5 = c13zcLJIIJ.LJJ();
                        if (zLJII3 || objLJJ5 == c1680520tpi) {
                            objLJJ5 = new AwS569S0100000_25(this, 98);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                        }
                        function0 = (Function0) objLJJ5;
                        c13zcLJIIJ.LJJJJL(false);
                        strLIZIZ4 = C0MBB.LIZIZ(2131824629, c13zcLJIIJ);
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        boolean zLJII4 = c13zcLJIIJ.LJII(this);
                        Object objLJJ6 = c13zcLJIIJ.LJJ();
                        if (zLJII4 || objLJJ6 == c1680520tpi) {
                            objLJJ6 = new AwS569S0100000_25(this, 99);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                        }
                        function02 = (Function0) objLJJ6;
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(false);
                    }
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-1937306327);
                    strLIZIZ = C0MBB.LIZIZ(2131824629, c13zcLJIIJ);
                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                    boolean zLJII5 = c13zcLJIIJ.LJII(this);
                    Object objLJJ7 = c13zcLJIIJ.LJJ();
                    if (zLJII5 || objLJJ7 == c1680520tpi) {
                        objLJJ7 = new AwS569S0100000_25(this, 97);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ7);
                    }
                    function0 = (Function0) objLJJ7;
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(false);
                }
                float f5 = 8;
                C1673400teE.LIZJ(function0, strLIZIZ, c.LJ(C1682520tsw.LJIIJJI(c1685760tyA, f4, f5, f4, f5), 1.0f), false, 0L, false, null, null, null, C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15), C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zcLJIIJ, 0, 31), null, false, c13zcLJIIJ, 0, 0, 6648);
                c13zcLJIIJ.LJJIIJZLJL(1600125427);
                if (i == 2 || i == 3) {
                    C1673400teE.LIZJ(function02, strLIZIZ4, c.LJ(C1682520tsw.LJIIL(c1685760tyA, f4, 0.0f, f4, 12, 2), 1.0f), false, 0L, false, null, null, null, C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15), C1666340tSq.LIZIZ(0L, 0L, 0L, c13zcLJIIJ, 0, 31), null, false, c13zcLJIIJ, 384, 0, 6648);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(this, i, i2, 0);
        }
    }
}
