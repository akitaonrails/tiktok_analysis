package com.ss.android.ugc.aweme.account.pin;

import X.C01GW;
import X.C05P0;
import X.C098200Yq;
import X.C0MXE;
import X.C0XGR;
import X.C13D2;
import X.C13LE;
import X.C13ZC;
import X.C1665740tRs;
import X.C1665790tRx;
import X.C1665930tSB;
import X.C1666330tSp;
import X.C1666340tSq;
import X.C1666920tTm;
import X.C1666930tTn;
import X.C1668040tVa;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1673400teE;
import X.C1679930tol;
import X.C1680030tov;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1682520tsw;
import X.C1682700ttE;
import X.C1682750ttJ;
import X.C1685190txF;
import X.C1685300txQ;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1687990u1l;
import X.C1688130u1z;
import X.C1748440vbG;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20084413iE;
import X.C20088213iq;
import X.C20684815ws;
import X.C23250099c;
import X.C336720DHy;
import X.C452501pT;
import X.C756030TlB;
import X.EnumC1427810nG7;
import X.EnumC452301pR;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS120S0400000_25;
import kotlin.jvm.internal.AwS177S0101000_12;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS82S0500000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class CreateOrResetPINFragment extends BasePINFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjHELIOSFiOSY9ZgY+LC4nLQo+GyogLTEcAAEVOiQrJCo9PA==";
    public final ViewModelLazy LLIZLLLIL;
    public final C01GW LLJ;

    public final boolean bS() {
        return ((Boolean) this.LLJ.getValue()).booleanValue();
    }

    public CreateOrResetPINFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(new AwS569S0100000_25((Fragment) this, 129), (Function0<Unit>) 130));
        this.LLIZLLLIL = C336720DHy.LIZ(this, C13LE.LIZ(CreateOrResetPINViewModel.class), new AwS569S0100000_25(c01gwLIZ, 131), new AwS426S0200000_25((Function0) null, c01gwLIZ, 22), new AwS426S0200000_25(this, c01gwLIZ, 23));
        this.LLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(49));
    }

    public final String aS() {
        return bS() ? "change_pin" : "create_pin";
    }

    public static void cS(C1748440vbG c1748440vbG) {
        c1748440vbG.LJIILIIL(128, true);
        c1748440vbG.setEditTextInputType(130);
        if (Build.VERSION.SDK_INT >= 26) {
            c1748440vbG.setImportantForAutofill(2);
        }
        c1748440vbG.LJIIZILJ(false);
        c1748440vbG.LJIILLIIL(true);
        c1748440vbG.setEditTextFilters(new InputFilter[]{new InputFilter.LengthFilter(6), new InputFilter() { // from class: X.0uCG
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
                for (int i5 = 0; i5 < charSequenceSubSequence.length(); i5++) {
                    if (!Character.isDigit(charSequenceSubSequence.charAt(i5))) {
                        return "";
                    }
                }
                return null;
            }
        }});
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1682700ttE c1682700ttE = C1682700ttE.LIZ;
        String enterFrom = getEnterFrom();
        String strAS = aS();
        c1682700ttE.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", enterFrom);
        c0xgr.LIZLLL("page_type", strAS);
        C20684815ws.LJIILLIIL("pin_setup_page_show", c0xgr.LIZ);
    }

    public final void ZR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zc;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(510049573);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
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
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI("");
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI("");
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p03 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05P0 c05p04 = (C05P0) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(((CreateOrResetPINViewModel) this.LLIZLLLIL.getValue()).LLILLJJLI, c13zcLJIIJ, 0);
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
                Object objLJJ5 = c13zcLJIIJ.LJJ();
                if (objLJJ5 == c1680520tpi) {
                    objLJJ5 = C1682750ttJ.LLIZ;
                    c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                }
                Function1 function1 = (Function1) objLJJ5;
                c13zcLJIIJ.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1685760tyA, 1.0f);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII = c13zcLJIIJ.LJII(this);
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ6 == c1680520tpi) {
                    objLJJ6 = new AwS591S0100000_12(this, 597);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(54, 0, c13zcLJIIJ, interfaceC1685750ty9LJ, function1, (Function1) objLJJ6);
                if (bS()) {
                    i3 = 2131838976;
                } else {
                    i3 = 2131838975;
                }
                String string = getString(i3);
                float f = 32;
                C1685190txF.LIZ(string, C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f, f, f, 0.0f, 8), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LIZ, 0L, 1, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                c13zc = c13zcLJIIJ;
                SR(getString(2131838971), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILJJIL, 1, c13zc, (i2 << 15) & 458752);
                c13zc.LJJIIJZLJL(-1224400529);
                boolean zLJII2 = c13zc.LJII(this);
                Object objLJJ7 = c13zc.LJJ();
                if (zLJII2 || objLJJ7 == c1680520tpi) {
                    objLJJ7 = new AwS120S0400000_25(this, (CreateOrResetPINFragment) c05p0, (C05P0<String>) c05p03, (C05P0<String>) c05p04, (C05P0<String>) 1);
                    c13zc.LJJIJIIJI(objLJJ7);
                }
                Function1 function12 = (Function1) objLJJ7;
                c13zc.LJJJJL(false);
                float f2 = 16;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f, f2, f, 0.0f, 8);
                c13zc.LJJIIJZLJL(5004770);
                Object objLJJ8 = c13zc.LJJ();
                if (objLJJ8 == c1680520tpi) {
                    objLJJ8 = new AwS604S0100000_25(c05p03, (C05P0<Boolean>) 74);
                    c13zc.LJJIJIIJI(objLJJ8);
                }
                c13zc.LJJJJL(false);
                C20084413iE.LIZ(432, 0, c13zc, interfaceC1685750ty9LJIIL, function12, (Function1) objLJJ8);
                c13zc.LJJIIJZLJL(-1224400529);
                boolean zLJII3 = c13zc.LJII(this);
                Object objLJJ9 = c13zc.LJJ();
                if (zLJII3 || objLJJ9 == c1680520tpi) {
                    objLJJ9 = new AwS120S0400000_25(this, (CreateOrResetPINFragment) c05p02, (C05P0<String>) c05p03, (C05P0<String>) c05p04, (C05P0<String>) 2);
                    c13zc.LJJIJIIJI(objLJJ9);
                }
                Function1 function13 = (Function1) objLJJ9;
                c13zc.LJJJJL(false);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f, f2, f, 0.0f, 8);
                c13zc.LJJIIJZLJL(5004770);
                Object objLJJ10 = c13zc.LJJ();
                if (objLJJ10 == c1680520tpi) {
                    objLJJ10 = new AwS604S0100000_25(c05p04, (C05P0<Boolean>) 75);
                    c13zc.LJJIJIIJI(objLJJ10);
                }
                c13zc.LJJJJL(false);
                C20084413iE.LIZ(432, 0, c13zc, interfaceC1685750ty9LJIIL2, function13, (Function1) objLJJ10);
                C1685190txF.LIZ(getString(2131838974), C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f, f2, f2, 0.0f, 8), C1670400tZO.LIZIZ(c13zc).N3(), C1670400tZO.LJ(c13zc).LJJ, 0L, 1, 0, false, 0, null, null, c13zc, 48, 0, 2000);
                C1665790tRx.LIZ(c1687990u1l.LIZ(c1685760tyA, 1.0f, true), c13zc);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL3 = C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), f, 0.0f, f, f2, 2);
                if (bS()) {
                    i4 = 2131838970;
                } else {
                    i4 = 2131838969;
                }
                String string2 = getString(i4);
                boolean zBooleanValue = ((Boolean) c05p0LIZIZ.getValue()).booleanValue();
                C1666330tSp c1666330tSpLIZ = C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zc, 0, 31);
                C1666930tTn c1666930tTnLIZ = C1666920tTm.LIZ(0.0f, null, 0.0f, c13zc, 0, 15);
                c13zc.LJJIIJZLJL(-1224400529);
                boolean zLJII4 = c13zc.LJII(this);
                Object objLJJ11 = c13zc.LJJ();
                if (zLJII4 || objLJJ11 == c1680520tpi) {
                    objLJJ11 = new AwS82S0500000_25(this, (CreateOrResetPINFragment) c05p0, (C05P0<String>) c05p03, (C05P0<String>) c05p02, (C05P0<String>) c05p04, (C05P0<String>) 0);
                    c13zc.LJJIJIIJI(objLJJ11);
                }
                c13zc.LJJJJL(false);
                C1673400teE.LIZJ((Function0) objLJJ11, string2, interfaceC1685750ty9LJIIL3, false, 0L, false, null, null, null, c1666930tTnLIZ, c1666330tSpLIZ, null, zBooleanValue, c13zc, 384, 0, 2552);
                c13zc.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS177S0101000_12(this, i, 7);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C756030TlB(this, null), 3);
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(100032429, new AwS626S0100000_12(this, 22), true));
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
