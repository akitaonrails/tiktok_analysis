package kotlin.jvm.internal;

import X.C09AY;
import X.C1665510tRV;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1685760tyA;
import X.C1696980uGG;
import X.C634380OuS;
import X.InterfaceC1631620sYq;
import X.InterfaceC1675750ti1;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS84S0100100_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS84S0100100_25) (LINE:50331651) kotlin.jvm.internal.AwS84S0100100_25.j1 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS84S0100100_25) (LINE:50331653) kotlin.jvm.internal.AwS84S0100100_25.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS84S0100100_25] */
    public AwS84S0100100_25(long j, long j2, Function0<Unit> function0) {
        long j3;
        Object obj;
        c09ay.$t = function0;
        c09ay.j1 = j3;
        c09ay.l0 = obj;
        ?? c09ay = new C09AY(3);
    }

    public static final Object invoke$0(AwS84S0100100_25 awS84S0100100_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(705190330);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = C1696980uGG.LIZ(0L);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        InterfaceC1675750ti1 interfaceC1675750ti1 = (InterfaceC1675750ti1) objLJJ;
        interfaceC1680500tpg.LJ();
        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean zLJIJJ = interfaceC1680500tpg.LJIJJ(awS84S0100100_25.j1) | interfaceC1680500tpg.LJJIIJ((Function0) awS84S0100100_25.l0);
        long j = awS84S0100100_25.j1;
        Function0 function0 = (Function0) awS84S0100100_25.l0;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJIJJ || objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS45S0200100_25(j, (long) function0, (Function0<Unit>) interfaceC1675750ti1, (InterfaceC1675750ti1) 1);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ2, 7);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZJ;
    }

    public static final Object invoke$1(AwS84S0100100_25 awS84S0100100_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(752412436);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1665510tRV();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C1665510tRV c1665510tRV = (C1665510tRV) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean zLJII = interfaceC1680500tpg.LJII(c1665510tRV) | interfaceC1680500tpg.LJIJJ(awS84S0100100_25.j1) | interfaceC1680500tpg.LJJIIJ((Function0) awS84S0100100_25.l0);
        long j = awS84S0100100_25.j1;
        Function0 function0 = (Function0) awS84S0100100_25.l0;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS45S0200100_25(c1665510tRV, (C1665510tRV<Long>) j, (long) function0, (Function0<Unit>) 2);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9, false, null, (Function0) objLJJ2, 7);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZJ;
    }

    public static final Object invoke$2(AwS84S0100100_25 awS84S0100100_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-965362276);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1665510tRV();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C1665510tRV c1665510tRV = (C1665510tRV) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean zLJII = interfaceC1680500tpg.LJII(c1665510tRV) | interfaceC1680500tpg.LJIJJ(awS84S0100100_25.j1) | interfaceC1680500tpg.LJJIIJ((Function0) awS84S0100100_25.l0);
        long j = awS84S0100100_25.j1;
        Function0 function0 = (Function0) awS84S0100100_25.l0;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS45S0200100_25(c1665510tRV, (C1665510tRV<Long>) j, (long) function0, (Function0<Unit>) 3);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9, false, null, (Function0) objLJJ2, 7);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZJ;
    }

    public static final Object invoke$3(AwS84S0100100_25 awS84S0100100_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(768619902);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1665510tRV();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C1665510tRV c1665510tRV = (C1665510tRV) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(-1746271574);
        boolean zLJII = interfaceC1680500tpg.LJII(c1665510tRV) | interfaceC1680500tpg.LJIJJ(awS84S0100100_25.j1) | interfaceC1680500tpg.LJJIIJ((Function0) awS84S0100100_25.l0);
        long j = awS84S0100100_25.j1;
        Function0 function0 = (Function0) awS84S0100100_25.l0;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS45S0200100_25(c1665510tRV, (C1665510tRV<Long>) j, (long) function0, (Function0<Unit>) 5);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9, false, null, (Function0) objLJJ2, 7);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZJ;
    }
}
