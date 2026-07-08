package kotlin.jvm.internal;

import X.C09AY;
import X.C1390705cP;
import X.C1677040tk6;
import X.C1677470tkn;
import X.C1677480tko;
import X.C1679660toK;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1684240tvi;
import X.EnumC1669110tXJ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC595010NVj;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS111S0210000_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
    public AwS111S0210000_25(C1684240tvi c1684240tvi, InterfaceC595010NVj interfaceC595010NVj, boolean z, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1684240tvi;
        this.z2 = z;
        this.l1 = interfaceC595010NVj;
    }

    public static final Object invoke$0(AwS111S0210000_25 awS111S0210000_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-1500525369);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = C1677470tkn.LIZ(0.0f);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C1677480tko c1677480tko = (C1677480tko) objLJJ;
        interfaceC1680500tpg.LJ();
        Boolean boolValueOf = Boolean.valueOf(awS111S0210000_25.z2);
        EnumC1669110tXJ enumC1669110tXJ = (EnumC1669110tXJ) awS111S0210000_25.l0;
        interfaceC1680500tpg.LJJIIJZLJL(-1224400529);
        boolean zLJIIZILJ = interfaceC1680500tpg.LJIIZILJ(awS111S0210000_25.z2) | interfaceC1680500tpg.LJIJI(((EnumC1669110tXJ) awS111S0210000_25.l0).ordinal()) | interfaceC1680500tpg.LJII(c1677480tko) | interfaceC1680500tpg.LJII((C1677040tk6) awS111S0210000_25.l1);
        boolean z = awS111S0210000_25.z2;
        EnumC1669110tXJ enumC1669110tXJ2 = (EnumC1669110tXJ) awS111S0210000_25.l0;
        C1677040tk6 c1677040tk6 = (C1677040tk6) awS111S0210000_25.l1;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJIIZILJ || objLJJ2 == c1680520tpi) {
            objLJJ2 = new C1390705cP(z, enumC1669110tXJ2, c1677480tko, c1677040tk6, null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        C1680540tpk.LJ(boolValueOf, enumC1669110tXJ, (Function2) objLJJ2, interfaceC1680500tpg);
        interfaceC1680500tpg.LJJIIJZLJL(-1633490746);
        boolean zLJIIZILJ2 = interfaceC1680500tpg.LJIIZILJ(awS111S0210000_25.z2) | interfaceC1680500tpg.LJII(c1677480tko);
        boolean z2 = awS111S0210000_25.z2;
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (zLJIIZILJ2 || objLJJ3 == c1680520tpi) {
            objLJJ3 = new AwS111S0110000_25(c1677480tko, z2, 18);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        interfaceC1680500tpg.LJ();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1679660toK.LIZ(interfaceC1685750ty9, (Function1) objLJJ3);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS111S0210000_25 r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            X.0tpg r10 = (X.InterfaceC1680500tpg) r10
            java.lang.Number r11 = (java.lang.Number) r11
            r11.intValue()
            r0 = 805428266(0x3001dc2a, float:4.72428E-10)
            r10.LJJIIJZLJL(r0)
            X.13DR r0 = X.C20055113dV.LJIILIIL
            java.lang.Object r1 = r10.LJJIL(r0)
            X.0tag r0 = X.EnumC1671200tag.Rtl
            r3 = 0
            if (r1 != r0) goto Lba
            r2 = 1
        L19:
            java.lang.Object r0 = r8.l0
            X.0tvi r0 = (X.C1684240tvi) r0
            X.05P0 r0 = r0.LJFF
            X.13FE r0 = (X.C13FE) r0
            java.lang.Object r1 = r0.getValue()
            X.0tvN r0 = X.EnumC1684030tvN.Vertical
            if (r1 == r0) goto Lb7
            if (r2 == 0) goto Lb7
            r7 = 0
        L2c:
            java.lang.Object r0 = r8.l0
            X.0tvi r0 = (X.C1684240tvi) r0
            boolean r0 = r10.LJJIIJ(r0)
            java.lang.Object r2 = r8.l0
            X.0tvi r2 = (X.C1684240tvi) r2
            java.lang.Object r1 = r10.LJJ()
            if (r0 != 0) goto L47
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L51
        L47:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 917(0x395, float:1.285E-42)
            r1.<init>(r2, r0)
            r10.LJJIJIIJI(r1)
        L51:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.05h9 r3 = X.C1681350tr3.LIZ(r1, r10, r3)
            boolean r2 = r10.LJJIIJ(r3)
            java.lang.Object r0 = r8.l0
            X.0tvi r0 = (X.C1684240tvi) r0
            boolean r0 = r10.LJJIIJ(r0)
            r2 = r2 | r0
            java.lang.Object r1 = r8.l0
            X.0tvi r1 = (X.C1684240tvi) r1
            java.lang.Object r4 = r10.LJJ()
            if (r2 != 0) goto L77
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L7f
        L77:
            X.0tvf r4 = new X.0tvf
            r4.<init>(r1)
            r10.LJJIJIIJI(r4)
        L7f:
            X.0tvf r4 = (X.C1684210tvf) r4
            X.0tyA r3 = X.InterfaceC1685750ty9.LIZ
            java.lang.Object r0 = r8.l0
            X.0tvi r0 = (X.C1684240tvi) r0
            X.05P0 r0 = r0.LJFF
            X.13FE r0 = (X.C13FE) r0
            java.lang.Object r5 = r0.getValue()
            X.0tvN r5 = (X.EnumC1684030tvN) r5
            boolean r0 = r8.z2
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r8.l0
            X.0tvi r0 = (X.C1684240tvi) r0
            X.05ZL r0 = r0.LIZIZ
            X.13FI r0 = (X.C13FI) r0
            float r1 = r0.LIZIZ()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb5
            r6 = 1
        La7:
            java.lang.Object r8 = r8.l1
            X.0NVj r8 = (X.InterfaceC595010NVj) r8
            r9 = 16
            X.0ty9 r0 = k0.f2.LIZIZ(r3, r4, r5, r6, r7, r8, r9)
            r10.LJ()
            return r0
        Lb5:
            r6 = 0
            goto La7
        Lb7:
            r7 = 1
            goto L2c
        Lba:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS111S0210000_25.invoke$1(kotlin.jvm.internal.AwS111S0210000_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS111S0210000_25(boolean z, boolean z2, EnumC1669110tXJ enumC1669110tXJ, C1677040tk6<Float> c1677040tk6) {
        super(3);
        this.$t = c1677040tk6;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = enumC1669110tXJ;
    }
}
