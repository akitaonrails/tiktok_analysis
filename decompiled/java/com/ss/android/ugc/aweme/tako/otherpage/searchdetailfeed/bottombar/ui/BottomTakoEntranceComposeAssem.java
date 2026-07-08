package com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui;

import X.C019F;
import X.C0MXE;
import X.C1214550hi9;
import X.C127G;
import X.C13D2;
import X.C13LE;
import X.C13Z4;
import X.C13ZC;
import X.C1637806bA;
import X.C1665740tRs;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1668160tVm;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1670410tZP;
import X.C1679930tol;
import X.C1682520tsw;
import X.C1685190txF;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1688130u1z;
import X.C19719912Dl;
import X.C20030013Ys;
import X.C2217381BqS;
import X.C724750Sbp;
import X.InterfaceC1668050tVb;
import X.InterfaceC1675480tha;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC2217461Bqa;
import Y.AObjectS75S0000000_25;
import androidx.compose.foundation.layout.c;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.communication.IBottomTakoEntranceVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS319S0300000_25;
import kotlin.jvm.internal.AwS33S1201000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS62S0301000_25;
import kotlin.jvm.internal.AwS8S2201000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: loaded from: classes26.dex */
public final class BottomTakoEntranceComposeAssem extends UiComposableAssem<C1214550hi9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJI;
    public C127G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomTakoEntranceComposeAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tako/otherpage/searchdetailfeed/bottombar/communication/IBottomTakoEntranceVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BottomTakoEntranceComposeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IBottomTakoEntranceVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1352), AFwS266S0000000_25.get$arr$(264), null, true);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IBottomTakoEntranceVM.class, new AObjectS75S0000000_25(this, 14)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // tiktok.compose.assem.UiComposableAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final void Co(C1214550hi9 c1214550hi9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        boolean zLJII;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2085490084);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1214550hi9);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1214550hi9);
            }
            if (zLJII) {
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
            C1670410tZP.LIZ(C1669670tYD.LIZJ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(-1791227735, new AwS460S0200000_25(this, c1214550hi9, 20), c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, c1214550hi9, i, 53);
        }
    }

    public final void Lo(C1214550hi9 c1214550hi9, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        boolean zLJII;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(557760367);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1214550hi9);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1214550hi9);
            }
            if (zLJII) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1668160tVm.LIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), null, false, C13Z4.LIZJ(-4421543, new AwS319S0300000_25(this, (BottomTakoEntranceComposeAssem) c1214550hi9, (C1214550hi9) function0, (Function0<Unit>) 1), c13zcLJIIJ), c13zcLJIIJ, 3078, 6);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(this, (BottomTakoEntranceComposeAssem) c1214550hi9, (C1214550hi9) function0, (Function0<Unit>) i, 16);
        }
    }

    public final void No(InterfaceC1675480tha interfaceC1675480tha, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1137890885);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1675480tha)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685190txF.LIZ(str, C1682520tsw.LJIIL(interfaceC1675480tha.LIZ(InterfaceC1685750ty9.LIZ, 1.0f, true), 8, 0.0f, 12, 0.0f, 10), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, ((i2 >> 3) & 14) | 102236160, 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS33S1201000_25(this, interfaceC1675480tha, str, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jo(X.C1214550hi9 r39, float r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.InterfaceC1680500tpg r42, int r43) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.ui.BottomTakoEntranceComposeAssem.Jo(X.0hi9, float, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public final void So(InterfaceC1675480tha interfaceC1675480tha, String str, String str2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1712094344);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1675480tha)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(interfaceC1675480tha.LIZ(c1685760tyA, 1.0f, true), 8, 0.0f, 12, 0.0f, 10);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = interfaceC1675480tha.LIZIZ(interfaceC1685750ty9LJIIL, C1668040tVa.LJIIJJI);
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
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
                C1685190txF.LIZ(str, c.LJ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, ((i2 >> 3) & 14) | 102236208, 0, 1712);
                C1685190txF.LIZ(str2, c.LJ(c1685760tyA, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, ((i2 >> 6) & 14) | 102236208, 0, 1712);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS8S2201000_25(this, interfaceC1675480tha, str, str2, i, 2);
        }
    }
}
