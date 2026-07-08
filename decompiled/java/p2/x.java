package p2;

import X.AbstractC1686530tzP;
import X.AbstractC20050413ck;
import X.AbstractC20055313dX;
import X.AbstractC20055413dY;
import X.C115T;
import X.C13B8;
import X.C13BD;
import X.C1685910tyP;
import X.C1695150uDJ;
import X.C1695550uDx;
import X.C1695970uEd;
import X.C1696120uEs;
import X.C1696250uF5;
import X.C19968013Aw;
import X.C20050813co;
import X.C20052513d5;
import X.C20053013dA;
import X.C20053213dC;
import X.C20053413dE;
import X.C20053713dH;
import X.C20053813dI;
import X.C20054813dS;
import X.EnumC20038113al;
import X.EnumC20047813cK;
import X.InterfaceC1679550to9;
import X.InterfaceC1686290tz1;
import X.InterfaceC20053113dB;
import X.InterfaceC20053313dD;
import X.InterfaceC20055013dU;
import X.InterfaceC20056213dg;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public final class x extends j1 {
    public static final C1695150uDJ LLLIIL;
    public final C20053413dE LLLIIIIL;
    public AbstractC20050413ck LLLIIIL;

    @Override // p2.j1
    public final void LLFF() {
        if (this.LLLIIIL == null) {
            this.LLLIIIL = new C20053013dA(this);
        }
    }

    static {
        C1695150uDJ c1695150uDJLIZ = C1695550uDx.LIZ();
        c1695150uDJLIZ.LJIIIZ(C1685910tyP.LJFF);
        c1695150uDJLIZ.LJI(1.0f);
        c1695150uDJLIZ.LJFF(1);
        LLLIIL = c1695150uDJLIZ;
    }

    @Override // p2.j1
    public final AbstractC20050413ck LLIIII() {
        return this.LLLIIIL;
    }

    @Override // p2.j1
    public final /* bridge */ /* synthetic */ AbstractC20055413dY LLIIIL() {
        return this.LLLIIIIL;
    }

    public x(C20053713dH c20053713dH) {
        C20053013dA c20053013dA;
        super(c20053713dH);
        C20053413dE c20053413dE = new C20053413dE();
        this.LLLIIIIL = c20053413dE;
        c20053413dE.LLIZLLLIL = this;
        if (c20053713dH.LLIZLLLIL != null) {
            c20053013dA = new C20053013dA(this);
        } else {
            c20053013dA = null;
        }
        this.LLLIIIL = c20053013dA;
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJII(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZIZ(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIIJ(), i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIIZ(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZJ(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIIJ(), i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIJ(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZ(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIIJ(), i);
    }

    @Override // X.InterfaceC1676340tiy
    public final int LJJIL(int i) {
        C20053213dC c20053213dCLJJIJIIJIL = this.LLJILJILJ.LJJIJIIJIL();
        InterfaceC20053113dB interfaceC20053113dBLIZ = c20053213dCLJJIJIIJIL.LIZ();
        C20053713dH c20053713dH = c20053213dCLJJIJIIJIL.LIZ;
        return interfaceC20053113dBLIZ.LIZLLL(c20053713dH.LLJLLIL.LIZJ, c20053713dH.LJJIIJ(), i);
    }

    @Override // X.InterfaceC1673370teB
    public final AbstractC1686530tzP LJJJJZ(long j) {
        if (this.LLJJ) {
            j = this.LLLIIIL.LLILZ;
        }
        LJJLJ(j);
        C19968013Aw<C20053713dH> c19968013AwLJJIL = this.LLJILJILJ.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i = c19968013AwLJJIL.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            c20053713dHArr[i2].LLJLLL.LJIILL.LLJILJIL = EnumC20038113al.NotUsed;
        }
        C20053713dH c20053713dH = this.LLJILJILJ;
        LLJIJIL(c20053713dH.LLJJJJ.LJFF(this, c20053713dH.LJJIIJ(), j));
        LLILZIL();
        return this;
    }

    @Override // X.AbstractC20048613cS
    public final int LJJLJLI(C115T c115t) {
        AbstractC20050413ck abstractC20050413ck = this.LLLIIIL;
        if (abstractC20050413ck != null) {
            return abstractC20050413ck.LJJLJLI(c115t);
        }
        C20053813dI c20053813dI = this.LLJILJILJ.LLJLLL.LJIILL;
        if (!c20053813dI.LLJILJILJ) {
            if (c20053813dI.LLILZLL.LIZLLL == EnumC20047813cK.Measuring) {
                C20050813co c20050813co = c20053813dI.LLJJJJLIIL;
                c20050813co.LJFF = true;
                if (c20050813co.LIZIZ) {
                    c20053813dI.LLJJJJ = true;
                    c20053813dI.LLJJJJJIL = true;
                }
            } else {
                c20053813dI.LLJJJJLIIL.LJI = true;
            }
        }
        c20053813dI.LJJJJLI().LLIZLLLIL = true;
        c20053813dI.LJJJJL();
        c20053813dI.LJJJJLI().LLIZLLLIL = false;
        Integer num = (Integer) ((HashMap) c20053813dI.LLJJJJLIIL.LJIIIIZZ).get(c115t);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p2.j1
    public final void LLIZLLLIL(InterfaceC1686290tz1 interfaceC1686290tz1, C1695970uEd c1695970uEd) {
        InterfaceC20055013dU interfaceC20055013dULIZ = C1696120uEs.LIZ(this.LLJILJILJ);
        C19968013Aw<C20053713dH> c19968013AwLJJIJLIJ = this.LLJILJILJ.LJJIJLIJ();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIJLIJ.LL;
        int i = c19968013AwLJJIJLIJ.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C20053713dH c20053713dH = c20053713dHArr[i2];
            if (c20053713dH.LJIJJ()) {
                c20053713dH.LJJIFFI(interfaceC1686290tz1, c1695970uEd);
            }
        }
        if (interfaceC20055013dULIZ.getShowLayoutBounds()) {
            LJZL(interfaceC1686290tz1, LLLIIL);
        }
    }

    @Override // p2.j1, X.AbstractC1686530tzP
    public final void LJJLIIIJJI(long j, float f, C1695970uEd c1695970uEd) {
        super.LJJLIIIJJI(j, f, c1695970uEd);
        if (!this.LLIZ) {
            this.LLJILJILJ.LLJLLL.LJIILL.LJLIL();
        }
    }

    @Override // p2.j1, X.AbstractC1686530tzP
    public final void LJJLIIIJJIZ(long j, float f, Function1<? super InterfaceC1679550to9, Unit> function1) {
        super.LJJLIIIJJIZ(j, f, function1);
        if (!this.LLIZ) {
            this.LLJILJILJ.LLJLLL.LJIILL.LJLIL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.13dY] */
    @Override // p2.j1
    public final void LLILIL(InterfaceC20053313dD interfaceC20053313dD, long j, C13B8 c13b8, int i, boolean z) {
        boolean z2 = z;
        InterfaceC20053313dD interfaceC20053313dD2 = interfaceC20053313dD;
        if (interfaceC20053313dD2.LIZIZ(this.LLJILJILJ)) {
            if (!LLJJIII(j)) {
                if (i == 1 && (Float.floatToRawIntBits(LJLLLLLL(j, LLIIIILZ())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                } else {
                    return;
                }
            }
            int i2 = c13b8.LLILLL;
            C19968013Aw<C20053713dH> c19968013AwLJJIJLIJ = this.LLJILJILJ.LJJIJLIJ();
            C20053713dH[] c20053713dHArr = c19968013AwLJJIJLIJ.LL;
            loop0: for (int i3 = c19968013AwLJJIJLIJ.LLILLL - 1; i3 >= 0; i3--) {
                C20053713dH c20053713dH = c20053713dHArr[i3];
                if (c20053713dH.LJIJJ()) {
                    interfaceC20053313dD2 = interfaceC20053313dD2;
                    interfaceC20053313dD2.LIZLLL(c20053713dH, j, c13b8, i, z2);
                    long jLIZJ = c13b8.LIZJ();
                    if (C13BD.LIZIZ(jLIZJ) < 0.0f && C13BD.LIZLLL(jLIZJ) && !C13BD.LIZJ(jLIZJ)) {
                        j1 j1Var = c20053713dH.LLJLLIL.LIZJ;
                        j1Var.getClass();
                        AbstractC20055413dY abstractC20055413dYLLIIJI = j1Var.LLIIJI(C20054813dS.LJI(16));
                        if (abstractC20055413dYLLIIJI == null || !abstractC20055413dYLLIIJI.LLJILLL) {
                            break;
                        }
                        if (!abstractC20055413dYLLIIJI.LL.LLJILLL) {
                            C1696250uF5.LIZIZ("visitLocalDescendants called on an unattached node");
                        }
                        AbstractC20055413dY abstractC20055413dY = abstractC20055413dYLLIIJI.LL;
                        if ((abstractC20055413dY.LLILZ & 16) == 0) {
                            break;
                        }
                        do {
                            if ((abstractC20055413dY.LLILLL & 16) != 0) {
                                ?? LIZIZ = abstractC20055413dY;
                                ?? c19968013Aw = 0;
                                do {
                                    if (LIZIZ instanceof InterfaceC20056213dg) {
                                        if (((InterfaceC20056213dg) LIZIZ).LJL()) {
                                            c13b8.LLILLL = c13b8.LL.LIZIZ - 1;
                                        }
                                    } else if ((LIZIZ.LLILLL & 16) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                                        AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) LIZIZ).LLJJI;
                                        int i4 = 0;
                                        c19968013Aw = c19968013Aw;
                                        LIZIZ = LIZIZ;
                                        while (abstractC20055413dY2 != null) {
                                            if ((abstractC20055413dY2.LLILLL & 16) != 0) {
                                                i4++;
                                                c19968013Aw = c19968013Aw;
                                                if (i4 == 1) {
                                                    LIZIZ = abstractC20055413dY2;
                                                } else {
                                                    if (c19968013Aw == 0) {
                                                        c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                                                    }
                                                    if (LIZIZ != 0) {
                                                        c19968013Aw.LIZLLL(LIZIZ);
                                                        LIZIZ = 0;
                                                    }
                                                    c19968013Aw.LIZLLL(abstractC20055413dY2);
                                                }
                                            }
                                            abstractC20055413dY2 = abstractC20055413dY2.LLILZLL;
                                            c19968013Aw = c19968013Aw;
                                            LIZIZ = LIZIZ;
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    LIZIZ = C20052513d5.LIZIZ(c19968013Aw);
                                } while (LIZIZ != 0);
                            }
                            abstractC20055413dY = abstractC20055413dY.LLILZLL;
                        } while (abstractC20055413dY != null);
                    }
                }
            }
            c13b8.LLILLL = i2;
        }
    }
}
