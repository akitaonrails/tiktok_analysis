package kotlin.jvm.internal;

import X.C09AY;
import X.C0MXE;
import X.C13D2;
import X.C1665930tSB;
import X.C1668040tVa;
import X.C1678940tnA;
import X.C1679680toM;
import X.C1679800toY;
import X.C1685720ty6;
import X.InterfaceC1668050tVb;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC20032213Zo;
import X.InterfaceC20053113dB;
import androidx.compose.foundation.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o0.k;
import p2.g;

/* JADX INFO: loaded from: classes26.dex */
public class AwS82S0100100_25 extends C09AY implements Function2 {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0100100_25(long j, InterfaceC1685750ty9 interfaceC1685750ty9, int i) {
        super(2);
        this.$t = i;
        this.j1 = j;
        this.l0 = interfaceC1685750ty9;
    }

    public static final Object invoke$0(AwS82S0100100_25 awS82S0100100_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1678940tnA.LIZIZ(awS82S0100100_25.j1, null, null, (Function2) awS82S0100100_25.l0, interfaceC1680500tpg, 0, 6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS82S0100100_25 awS82S0100100_25, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1678940tnA.LIZIZ(awS82S0100100_25.j1, null, null, (Function2) awS82S0100100_25.l0, interfaceC1680500tpg, 0, 6);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS82S0100100_25 awS82S0100100_25, Object obj, Object obj2) {
        boolean z;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        int iIntValue = ((Number) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1680500tpg.LJIJJLI(iIntValue & 1, z)) {
            if (awS82S0100100_25.j1 != 9205357640488583168L) {
                interfaceC1680500tpg.LJJIIJZLJL(1828931592);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = c.LJIIL((InterfaceC1685750ty9) awS82S0100100_25.l0, C1679680toM.LIZIZ(awS82S0100100_25.j1), C1679680toM.LIZ(awS82S0100100_25.j1), 0.0f, 0.0f, 12);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZJ, false);
                int iLIZ = C0MXE.LIZ(interfaceC1680500tpg);
                C13D2 c13d2LJJIFFI = interfaceC1680500tpg.LJJIFFI();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(interfaceC1680500tpg, interfaceC1685750ty9LJIIL);
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
                    C1679800toY.LIZIZ(null, interfaceC1680500tpg, 0, 1);
                    interfaceC1680500tpg.LJIIIZ();
                    interfaceC1680500tpg.LJ();
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                interfaceC1680500tpg.LJJIIJZLJL(1829298756);
                C1679800toY.LIZIZ((InterfaceC1685750ty9) awS82S0100100_25.l0, interfaceC1680500tpg, 0, 0);
                interfaceC1680500tpg.LJ();
            }
        } else {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS82S0100100_25) (LINE:50397187) kotlin.jvm.internal.AwS82S0100100_25.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS82S0100100_25) (LINE:50397189) kotlin.jvm.internal.AwS82S0100100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS82S0100100_25] */
    public AwS82S0100100_25(long j, long j2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        long j3;
        Object obj;
        c09ay.$t = function2;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(2);
    }
}
