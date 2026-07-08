package kotlin.jvm.internal;

import X.AbstractC1676270tir;
import X.C05P1;
import X.C09AY;
import X.C0MXE;
import X.C1320770kTT;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1331090kk7;
import X.C1335990ks1;
import X.C13D2;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1668200tVq;
import X.C1668230tVt;
import X.C1671610tbL;
import X.C1672220tcK;
import X.C1675980tiO;
import X.C1679520to6;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1682380tsi;
import X.C1685380txY;
import X.C1685720ty6;
import X.C1685760tyA;
import X.C1685910tyP;
import X.InterfaceC1631620sYq;
import X.InterfaceC1665500tRU;
import X.InterfaceC1668050tVb;
import X.InterfaceC1668850tWt;
import X.InterfaceC1671600tbK;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AwS165S1200000_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S1200000_25(C05P1 c05p1, C05P1 c05p12, String str, int i) {
        super(3);
        this.$t = i;
        this.l1 = c05p1;
        this.l2 = c05p12;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS165S1200000_25 awS165S1200000_25, Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C1672220tcK c1672220tcK = C1672220tcK.LIZ;
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        InterfaceC1668050tVb.LIZ.getClass();
        InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJFF), 1.0f);
        C1679520to6.LIZJ((C05P1) awS165S1200000_25.l1, (C05P1) awS165S1200000_25.l2, interfaceC1685750ty9LJ, awS165S1200000_25.s0, (InterfaceC1680500tpg) obj2, 0, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS165S1200000_25 awS165S1200000_25, Object obj, Object obj2, Object obj3) {
        int i;
        InterfaceC1668850tWt interfaceC1668850tWt = (InterfaceC1668850tWt) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            if (interfaceC1680500tpg.LJJIIJ(interfaceC1668850tWt)) {
                i = 4;
            } else {
                i = 2;
            }
            iIntValue |= i;
        }
        if ((iIntValue & 19) == 18 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1675980tiO.LIZ(c.LIZLLL((InterfaceC1685750ty9) awS165S1200000_25.l2), C1668200tVq.LIZLLL((InterfaceC1665500tRU) awS165S1200000_25.l1, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(C1682380tsi.LJII(interfaceC1668850tWt.LIZLLL()))) & 4294967295L), 8), null, 6);
            String str = awS165S1200000_25.s0;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
            C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (interfaceC1680500tpg.LJIIJJI() instanceof InterfaceC20032213Zo) {
                interfaceC1680500tpg.LJJIII();
                if (interfaceC1680500tpg.LJJIIZ()) {
                    interfaceC1680500tpg.LJJI(aFwS214S0000000_25);
                } else {
                    interfaceC1680500tpg.LJIILJJIL();
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(interfaceC1680500tpg, c13d2LJJIFFI, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (interfaceC1680500tpg.LJJIIZ() || !Intrinsics.LJFF(interfaceC1680500tpg.LJJ(), Integer.valueOf(iLIZ))) {
                    interfaceC1680500tpg.LJJIJIIJI(Integer.valueOf(iLIZ));
                    interfaceC1680500tpg.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(interfaceC1680500tpg, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                interfaceC1680500tpg.LJJIIJZLJL(1728067494);
                if (str != null) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = c.LIZLLL(InterfaceC1685750ty9.LIZ);
                    interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                    Object objLJJ = interfaceC1680500tpg.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                    if (objLJJ == c1680520tpi) {
                        objLJJ = AFwS258S0000000_20.get$arr$(18);
                        interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                    }
                    Function1 function1 = (Function1) objLJJ;
                    interfaceC1680500tpg.LJ();
                    interfaceC1680500tpg.LJJIIJZLJL(818291841);
                    Context context = (Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
                    interfaceC1680500tpg.LJJIIJZLJL(5004770);
                    boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ(str);
                    Object objLJJ2 = interfaceC1680500tpg.LJJ();
                    if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                        interfaceC1680500tpg.LJJIJIIJI(str);
                        objLJJ2 = str;
                    }
                    String str2 = (String) objLJJ2;
                    interfaceC1680500tpg.LJ();
                    interfaceC1680500tpg.LJJIIJZLJL(1849434622);
                    Object objLJJ3 = interfaceC1680500tpg.LJJ();
                    if (objLJJ3 == c1680520tpi) {
                        C1331090kk7 c1331090kk7LIZLLL = C1335990ks1.LIZLLL(context, null);
                        function1.invoke(c1331090kk7LIZLLL);
                        objLJJ3 = new C1320770kTT(c1331090kk7LIZLLL.LIZ());
                        interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
                    }
                    C1320770kTT c1320770kTT = (C1320770kTT) objLJJ3;
                    interfaceC1680500tpg.LJ();
                    interfaceC1680500tpg.LJJIIJZLJL(5004770);
                    boolean zLJJIIJ2 = interfaceC1680500tpg.LJJIIJ(str);
                    Object objLJJ4 = interfaceC1680500tpg.LJJ();
                    if (zLJJIIJ2 || objLJJ4 == c1680520tpi) {
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        c1320810kTXLIZJ.LJII(str2);
                        c1320810kTXLIZJ.LJIIJJI = true;
                        c1320810kTXLIZJ.LJIILJJIL = c1320770kTT.LLILZIL;
                        c1320770kTT.LJIIIIZZ(c1320810kTXLIZJ.LIZ());
                        objLJJ4 = new C1685380txY(c1320770kTT.LIZLLL());
                        interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
                    }
                    interfaceC1680500tpg.LJ();
                    interfaceC1680500tpg.LJ();
                    InterfaceC1671600tbK.LIZ.getClass();
                    C1668230tVt.LIZ((AbstractC1676270tir) objLJJ4, null, interfaceC1685750ty9LIZLLL2, null, C1671610tbL.LIZIZ, 0.0f, null, interfaceC1680500tpg, 25008, 104);
                }
                interfaceC1680500tpg.LJ();
                interfaceC1680500tpg.LJIIIZ();
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS165S1200000_25(InterfaceC1665500tRU interfaceC1665500tRU, InterfaceC1665500tRU<C1685910tyP> interfaceC1665500tRU2, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        super(3);
        this.$t = str;
        this.l1 = interfaceC1665500tRU;
        this.l2 = interfaceC1665500tRU2;
        this.s0 = interfaceC1685750ty9;
    }
}
