package com.ss.android.ugc.aweme.relation.ffp.nearby.ui;

import X.C05P0;
import X.C0MXE;
import X.C1153970g8R;
import X.C1296860jqu;
import X.C1383370m6R;
import X.C13D2;
import X.C13Z4;
import X.C13ZC;
import X.C1559260qg8;
import X.C1665740tRs;
import X.C1665790tRx;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1668160tVm;
import X.C1669430tXp;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1670410tZP;
import X.C1671840tbi;
import X.C1675150th3;
import X.C1675980tiO;
import X.C1679930tol;
import X.C1680030tov;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1682520tsw;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1687630u1B;
import X.C1687990u1l;
import X.C1688130u1z;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C723590SZx;
import X.EnumC1675160th4;
import X.EnumC1687770u1P;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS319S0300000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public final class WaitingAssem extends ConnectNowBasePage {
    public static final /* synthetic */ int LLJILJIL = 0;
    public Long LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, C1153970g8R.class, null), checkSupervisorPrepared());

    public final void Lo(C1687630u1B c1687630u1B, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-911894008);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1687630u1B)) {
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
            User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
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
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1671840tbi.LIZ(C1671840tbi.LIZIZ(C1675980tiO.LIZIZ(c.LIZLLL(c1685760tyA), C1670400tZO.LIZIZ(c13zcLJIIJ).F2(), C1669430tXp.LIZ)));
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                EnumC1675160th4 enumC1675160th4 = EnumC1675160th4.WAITING_ROOM;
                C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1687990u1l.LIZIZ(c1685760tyA, c1296860jqu);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJII = c13zcLJIIJ.LJII(this);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS569S0100000_25(this, 220);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1675150th3.LIZ(enumC1675160th4, interfaceC1685750ty9LIZIZ, null, (Function0) objLJJ2, this, c13zcLJIIJ, ((i2 << 9) & 57344) | 6, 4);
                C1665790tRx.LIZ(c1687990u1l.LIZ(c1685760tyA, 1.0f, true), c13zcLJIIJ);
                C1668160tVm.LIZ(C1687990u1l.LIZIZ(c.LJ(c1685760tyA, 1.0f), c1296860jqu), null, false, C13Z4.LIZJ(-1403615788, new AwS319S0300000_25(c1687630u1B, (C1687630u1B) currentUser, (User) c05p0, (C05P0<Boolean>) 0), c13zcLJIIJ), c13zcLJIIJ, 3072, 6);
                C1665790tRx.LIZ(c1687990u1l.LIZ(c1685760tyA, 1.2f, true), c13zcLJIIJ);
                c13zcLJIIJ.LJJIIJZLJL(-665481944);
                if (c1687630u1B.LLILLL == EnumC1687770u1P.GRANTED) {
                    Oo(C1687990u1l.LIZIZ(c1685760tyA, c1296860jqu), c13zcLJIIJ, i2 & 112);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1687630u1B, i, 34);
        }
    }

    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: No, reason: merged with bridge method [inline-methods] */
    public final void Co(C1687630u1B c1687630u1B, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-786648290);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1687630u1B)) {
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
            this.LLJI = Long.valueOf(System.currentTimeMillis());
            C1670410tZP.LIZ(C1669670tYD.LIZJ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(1063809209, new AwS460S0200000_25(this, c1687630u1B, 13), c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1687630u1B, i, 35);
        }
    }

    public final void Oo(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1112801449);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
            float f = 24;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJIJI(c.LJ(interfaceC1685750ty9, 1.0f), null, 3), f, 0.0f, f, 32, 2);
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
                String strLJIIJ = C1383370m6R.LJIIJ(2131824860);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1685190txF.LIZ(strLJIIJ, C1682520tsw.LJIIL(c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3), 0.0f, 0.0f, 0.0f, 8, 7), C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), C1670400tZO.LJ(c13zcLJIIJ).LIZLLL, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                C1685190txF.LIZ(C1383370m6R.LJIIJ(2131824859), c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1685750ty9, i, 36);
        }
    }
}
