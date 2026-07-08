package com.ss.android.ugc.aweme.account.pin;

import X.C098200Yq;
import X.C0MXE;
import X.C0XGR;
import X.C13D2;
import X.C13ZC;
import X.C1665740tRs;
import X.C1665790tRx;
import X.C1665930tSB;
import X.C1666330tSp;
import X.C1666340tSq;
import X.C1666920tTm;
import X.C1666930tTn;
import X.C1667750tV7;
import X.C1668040tVa;
import X.C1668230tVt;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1670890taB;
import X.C1671610tbL;
import X.C1673400teE;
import X.C1679930tol;
import X.C1680030tov;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1682520tsw;
import X.C1682630tt7;
import X.C1682700ttE;
import X.C1685190txF;
import X.C1685300txQ;
import X.C1685380txY;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1687990u1l;
import X.C1688130u1z;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20030013Ys;
import X.C20084413iE;
import X.C20088213iq;
import X.C20684815ws;
import X.EnumC1427810nG7;
import X.InterfaceC1668050tVb;
import X.InterfaceC1671600tbK;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class PINManagementFragment extends BasePINFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmHELIOSJjFiOSY9ZhUFBwIyJiQrLCI2JjEKOy40JSAiPQ==";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1682700ttE c1682700ttE = C1682700ttE.LIZ;
        String enterFrom = getEnterFrom();
        c1682700ttE.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", enterFrom);
        C20684815ws.LJIILLIIL("pin_setup_manage_page_show", c0xgr.LIZ);
    }

    public final void ZR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        C13ZC c13zc;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(294562233);
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
            c13zc = c13zcLJIIJ;
        } else {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LJ(R.attr.bx);
            tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
            tuxImmersionBarLIZLLL.LIZ(true);
            tuxImmersionBarLIZLLL.LIZLLL();
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c.LIZIZ(c.LJ(c1685760tyA, 1.0f), 1.0f);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
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
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = C1682630tt7.LLIZ;
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                Function1 function1 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII = c13zcLJIIJ.LJII(this);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS604S0100000_25(this, 76);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(54, 0, c13zcLJIIJ, interfaceC1685750ty9LJ, function1, (Function1) objLJJ2);
                float f = 16;
                float f2 = 32;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(c.LJI(c1685760tyA, 200), 1.0f), f, f2, 0.0f, f, 4);
                C1685380txY c1685380txYLIZ = C1670890taB.LIZ(C1667750tV7.LJI, c13zcLJIIJ);
                InterfaceC1671600tbK.LIZ.getClass();
                C1668230tVt.LIZ(c1685380txYLIZ, null, interfaceC1685750ty9LJIIL, null, C1671610tbL.LJFF, 0.0f, null, c13zcLJIIJ, 25008, 104);
                C1685190txF.LIZ(getString(2131838958), C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f2, f, f2, 0.0f, 8), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LIZ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                c13zc = c13zcLJIIJ;
                SR(getString(2131838957), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILJJIL, 3, c13zc, (i2 << 15) & 458752);
                C1665790tRx.LIZ(c1687990u1l.LIZ(c1685760tyA, 1.0f, true), c13zc);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f2, 0.0f, f2, f, 2);
                String string = getString(2131838956);
                C1666330tSp c1666330tSpLIZ = C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zc, 0, 31);
                C1666930tTn c1666930tTnLIZ = C1666920tTm.LIZ(0.0f, null, 0.0f, c13zc, 0, 15);
                c13zc.LJJIIJZLJL(5004770);
                boolean zLJII2 = c13zc.LJII(this);
                Object objLJJ3 = c13zc.LJJ();
                if (zLJII2 || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new AwS569S0100000_25(this, 133);
                    c13zc.LJJIJIIJI(objLJJ3);
                }
                c13zc.LJJJJL(false);
                C1673400teE.LIZJ((Function0) objLJJ3, string, interfaceC1685750ty9LJIIL2, false, 0L, false, null, null, null, c1666930tTnLIZ, c1666330tSpLIZ, null, false, c13zc, 384, 0, 6648);
                c13zc.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 20);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(1007473217, new AwS639S0100000_25(this, 24), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }
}
