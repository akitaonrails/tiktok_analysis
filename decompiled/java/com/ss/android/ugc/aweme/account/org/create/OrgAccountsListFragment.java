package com.ss.android.ugc.aweme.account.org.create;

import X.AbstractC1682580tt2;
import X.C01GW;
import X.C05P0;
import X.C098200Yq;
import X.C0MBB;
import X.C0MXE;
import X.C0XGR;
import X.C1175204ik;
import X.C1296860jqu;
import X.C1308910kAL;
import X.C13D2;
import X.C13LE;
import X.C13Z4;
import X.C13ZC;
import X.C1665740tRs;
import X.C1665750tRt;
import X.C1665930tSB;
import X.C1666330tSp;
import X.C1666340tSq;
import X.C1666920tTm;
import X.C1666930tTn;
import X.C1667750tV7;
import X.C1667870tVJ;
import X.C1668040tVa;
import X.C1668060tVc;
import X.C1669050tXD;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1670540tZc;
import X.C1670890taB;
import X.C1672220tcK;
import X.C1673400teE;
import X.C1675980tiO;
import X.C1679930tol;
import X.C1680030tov;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1682520tsw;
import X.C1682570tt1;
import X.C1682610tt5;
import X.C1685190txF;
import X.C1685300txQ;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685850tyJ;
import X.C1687980u1k;
import X.C1688120u1y;
import X.C1688130u1z;
import X.C1693430uAX;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20088213iq;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C336720DHy;
import X.C452501pT;
import X.C636400Oxi;
import X.C752250Tf5;
import X.C752300TfA;
import X.EnumC1427810nG7;
import X.EnumC1667890tVL;
import X.EnumC1667900tVM;
import X.EnumC452301pR;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS177S0101000_12;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
@InterfaceC836760Ws6(attachActivity = OrgAccountsListHostActivity.class)
public final class OrgAccountsListFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJjHELIOS00ZiY+LC4nLWsDOygSKyYjPCEnOwklOjsVOiQrJCo9PA==";
    public boolean LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 369));
    public final ViewModelLazy LLJ;
    public final C01GW LLJI;

    public final OrgAccountsListViewModel aS() {
        return (OrgAccountsListViewModel) this.LLJ.getValue();
    }

    public OrgAccountsListFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(new AwS569S0100000_25((Fragment) this, 107), (Function0<Unit>) 108));
        this.LLJ = C336720DHy.LIZ(this, C13LE.LIZ(OrgAccountsListViewModel.class), new AwS556S0100000_12(c01gwLIZ, 371), new AwS413S0200000_12((Function0) null, c01gwLIZ, 19), new AwS413S0200000_12(this, c01gwLIZ, 20));
        this.LLJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 370));
    }

    public final void cS() {
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || supportFragmentManager.LJJLIIIIJ() <= 0) {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        C19EG activity3 = getActivity();
        if (activity3 == null || (supportFragmentManager2 = activity3.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager2.LJLLILLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLIZ) {
            aS().vQ2();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aS().vQ2();
    }

    public final void UR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1001647786);
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
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 0.0f, 32, 0.0f, 0.0f, 13);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
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
                C1685190txF.LIZ(getString(2131835968), null, C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 17);
        }
    }

    public final void VR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        List<OrgAccount> list;
        OrgInfo orgInfo;
        int size;
        String str;
        C1682570tt1 c1682570tt1;
        C1682570tt1 c1682570tt12;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-414222008);
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
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LJ(R.attr.zp);
            tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
            tuxImmersionBarLIZLLL.LIZ(true);
            tuxImmersionBarLIZLLL.LIZLLL();
            C05P0 c05p0LIZIZ = C20028913Yh.LIZIZ(aS().LLILZLL, c13zcLJIIJ, 0);
            C05P0 c05p0LIZIZ2 = C20028913Yh.LIZIZ(aS().LLILZ, c13zcLJIIJ, 0);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Object value = c05p0LIZIZ.getValue();
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LIZIZ) | c13zcLJIIJ.LJII(this);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C752300TfA(this, c05p0LIZIZ, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(value, (Function2) objLJJ2, c13zcLJIIJ);
            if (c05p0LIZIZ.getValue() instanceof C1682610tt5) {
                c13zcLJIIJ.LJJIIJZLJL(-645973729);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
                C1680030tov c1680030tov = C1679930tol.LIZJ;
                InterfaceC1668050tVb.LIZ.getClass();
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
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
                    C1668060tVc.LIZ(null, false, 0L, C1685850tyJ.LIZIZ(0), null, C13Z4.LIZJ(735776864, new AwS639S0100000_25(this, 19), c13zcLJIIJ), null, null, c13zcLJIIJ, 199680, 215);
                    C1667870tVJ.LIZ(c.LIZLLL(c1685760tyA), false, null, EnumC1667900tVM.FillContainer, EnumC1667890tVL.IllustrationS, C1670890taB.LIZ(C1667750tV7.LIZIZ, c13zcLJIIJ), null, C0MBB.LIZIZ(2131838987, c13zcLJIIJ), C0MBB.LIZIZ(2131838986, c13zcLJIIJ), C13Z4.LIZJ(1390022137, new AwS674S0100000_25(this, 9), c13zcLJIIJ), null, c13zcLJIIJ, 805334022, 0, 1094);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else if (c05p0LIZIZ.getValue() instanceof C1682570tt1) {
                c13zcLJIIJ.LJJIIJZLJL(-644176907);
                AbstractC1682580tt2 abstractC1682580tt2 = (AbstractC1682580tt2) c05p0LIZIZ.getValue();
                if ((abstractC1682580tt2 instanceof C1682570tt1) && (c1682570tt12 = (C1682570tt1) abstractC1682580tt2) != null) {
                    list = c1682570tt12.LIZIZ;
                } else {
                    list = null;
                }
                AbstractC1682580tt2 abstractC1682580tt22 = (AbstractC1682580tt2) c05p0LIZIZ.getValue();
                if ((abstractC1682580tt22 instanceof C1682570tt1) && (c1682570tt1 = (C1682570tt1) abstractC1682580tt22) != null) {
                    orgInfo = c1682570tt1.LIZ;
                } else {
                    orgInfo = null;
                }
                if (!((Boolean) c05p0.getValue()).booleanValue()) {
                    c05p0.setValue(Boolean.TRUE);
                    if (list != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    if (orgInfo == null || (str = orgInfo.bizSubjectId) == null) {
                        str = "";
                    }
                    C0XGR c0xgr = new C0XGR();
                    c0xgr.LIZLLL("enter_from", (String) this.LLIZLLLIL.getValue());
                    c0xgr.LIZ(size, "org_account_cnt");
                    c0xgr.LIZLLL("biz_subject_id", str);
                    C20684815ws.LJIILLIIL("orgacct_manage_page_show", c0xgr.LIZ);
                }
                C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = c.LIZLLL(c1685760tyA2);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2);
                g.LJLIIIL.getClass();
                AFwS214S0000000_25 aFwS214S0000000_252 = g.a.LIZIZ;
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_252);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJI;
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_252);
                    AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJFF;
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_253);
                    AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LJIIIIZZ;
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_254);
                    }
                    AFwS311S0000000_25 aFwS311S0000000_255 = g.a.LIZLLL;
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_255);
                    C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c.LIZIZ(c.LJ(c1685760tyA2, 1.0f), 1.0f);
                    C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_252);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_252);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_253);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_254);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_255);
                        C1668060tVc.LIZ(null, false, 0L, C1685850tyJ.LIZIZ(0), null, C13Z4.LIZJ(107292817, new AwS460S0200000_25(list, this, 6), c13zcLJIIJ), null, C13Z4.LIZJ(-1993038701, new AwS460S0200000_25(list, this, 7), c13zcLJIIJ), c13zcLJIIJ, 12782592, 87);
                        float f = 16;
                        InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LIZIZ(c.LIZJ, 1.0f), f, 0.0f, f, 80, 2);
                        c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                        boolean zLJII = c13zcLJIIJ.LJII(this) | c13zcLJIIJ.LJJIIJ(orgInfo) | c13zcLJIIJ.LJII(list);
                        Object objLJJ3 = c13zcLJIIJ.LJJ();
                        if (zLJII || objLJJ3 == c1680520tpi) {
                            objLJJ3 = new AwS234S0300000_25(orgInfo, (OrgInfo) list, (List<OrgAccount>) this, (OrgAccountsListFragment) 3);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        C636400Oxi.LIZ(interfaceC1685750ty9LJIIL, null, null, false, null, null, null, false, null, (Function1) objLJJ3, c13zcLJIIJ, 6, 510);
                        c13zcLJIIJ.LJJJJL(true);
                        C1666330tSp c1666330tSpLIZ = C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, c13zcLJIIJ, 0, 31);
                        C1666930tTn c1666930tTnLIZ = C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15);
                        boolean zBooleanValue = ((Boolean) c05p0LIZIZ2.getValue()).booleanValue();
                        String string = getString(2131835965);
                        InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(C1682520tsw.LJIIIIZZ(c1672220tcK.LIZIZ(c1685760tyA2, C1668040tVa.LJIIIIZZ), f), 1.0f);
                        c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                        boolean zLJII2 = c13zcLJIIJ.LJII(this) | c13zcLJIIJ.LJII(list);
                        Object objLJJ4 = c13zcLJIIJ.LJJ();
                        if (zLJII2 || objLJJ4 == c1680520tpi) {
                            objLJJ4 = new AwS413S0200000_12(list, this, 18);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        C1673400teE.LIZJ((Function0) objLJJ4, string, interfaceC1685750ty9LJ, false, 0L, false, null, null, null, c1666930tTnLIZ, c1666330tSpLIZ, null, zBooleanValue, c13zcLJIIJ, 0, 0, 2552);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-640820134);
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS177S0101000_12(this, i, 6);
        }
    }

    public final void WR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(553281891);
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
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3), 0.0f, 36, 1);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
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
                C1685190txF.LIZ(getString(2131835970), c.LJ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIJIIJIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2032);
                C1685190txF.LIZ(getString(2131835969), c.LJ(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 8, 0.0f, 0.0f, 13), 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2032);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 18);
        }
    }

    public final void bS(int i, String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", (String) this.LLIZLLLIL.getValue());
        c0xgr.LIZ(i, "org_account_cnt");
        c0xgr.LIZLLL("btn_click", str);
        C20684815ws.LJIILLIIL("orgacct_manage_page_click", c0xgr.LIZ);
    }

    public final void SR(OrgAccount orgAccount, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1735610844);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(orgAccount)) {
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
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            float f = 16;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), C1670400tZO.LIZIZ(c13zcLJIIJ).J2(), C1669050tXD.LIZIZ(12));
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILIIL;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
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
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c.LJ(c1685760tyA, 1.0f), f);
                C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 48);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIIZZ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                    C1175204ik c1175204ik = new C1175204ik(orgAccount.avatar);
                    float f2 = 56;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(c1685760tyA, f2), f2);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = AFwS266S0000000_25.get$arr$(80);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1670540tZc.LIZ(c1175204ik, "avatar", interfaceC1685750ty9LJI, null, null, null, null, null, null, null, (Function1) objLJJ, null, c13zcLJIIJ, 432, 6, 3064);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ = c1687980u1k.LIZ(C1682520tsw.LJIIL(c1685760tyA, f, 0.0f, 0.0f, 0.0f, 14), 1.0f, true);
                    C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        C1685190txF.LIZ(orgAccount.nickname, c.LJ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2032);
                        C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJJ;
                        long jN3 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
                        String str = orgAccount.username;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('@');
                        sbLIZ.append(str);
                        C1685190txF.LIZ(C2188811AlT.LIZIZ(sbLIZ), c.LJ(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 6, 0.0f, 0.0f, 13), 1.0f), jN3, c1693430uAX, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2032);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, orgAccount, i, 22);
        }
    }

    public final void ZR(OrgInfo orgInfo, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1357255124);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(orgInfo)) {
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
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(c.LJ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).J3(), C1669050tXD.LIZIZ(14));
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILIIL;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
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
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c.LJ(c1685760tyA, 1.0f), 16);
                C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIIZZ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    C1685190txF.LIZ(getString(2131835966), null, C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                    float f = 4;
                    C1685190txF.LIZ(orgInfo.organizationName, C1682520tsw.LJIIL(c1685760tyA, 0.0f, f, 0.0f, 0.0f, 13), 0L, C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2036);
                    C1685190txF.LIZ(getString(2131835967), C1682520tsw.LJIIL(c1685760tyA, 0.0f, 12, 0.0f, 0.0f, 13), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2032);
                    C1685190txF.LIZ(orgInfo.region, C1682520tsw.LJIIL(c1685760tyA, 0.0f, f, 0.0f, 0.0f, 13), 0L, C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2036);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, orgInfo, i, 23);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C752250Tf5(this, null), 3);
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, requireContext());
        if (numLIZJ != null) {
            composeView.setBackgroundColor(numLIZJ.intValue());
        }
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-1036722532, new AwS626S0100000_12(this, 21), true));
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
