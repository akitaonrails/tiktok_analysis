package kotlin.jvm.internal;

import X.AbstractC1686530tzP;
import X.C09AY;
import X.C13LZ;
import X.C1669050tXD;
import X.C1670400tZO;
import X.C1675890tiF;
import X.C1682380tsi;
import X.C2097608Jq;
import X.InterfaceC1631620sYq;
import X.InterfaceC1673370teB;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1689940u4u;

/* JADX INFO: loaded from: classes26.dex */
public class AwS17S0000001_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public float f0;

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
    public AwS17S0000001_25(float f, int i) {
        super(3);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS17S0000001_25 awS17S0000001_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) obj;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = ((InterfaceC1673370teB) obj2).LJJJJZ(((C1682380tsi) obj3).LIZ);
        int iLJ = C13LZ.LJ(interfaceC1689940u4u.LJLLJ(awS17S0000001_25.f0), 0, abstractC1686530tzPLJJJJZ.LLILLJJLI);
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI - iLJ, C2097608Jq.LJ(), new AwS131S0101000_25(iLJ, abstractC1686530tzPLJJJJZ, 9));
    }

    public static final Object invoke$1(AwS17S0000001_25 awS17S0000001_25, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(-1029067099);
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1675890tiF.LIZ((InterfaceC1685750ty9) obj, 0.5f, C1670400tZO.LIZIZ(interfaceC1680500tpg).U2(), C1669050tXD.LIZIZ(awS17S0000001_25.f0));
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }
}
