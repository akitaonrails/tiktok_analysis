package kotlin.jvm.internal;

import X.C09AY;
import X.C0ET4;
import X.C1422560n7e;
import X.C1422980n8K;
import X.C1424180nAG;
import X.C1424220nAK;
import X.C1427280nFG;
import X.C1659700tI8;
import X.C2188811AlT;
import X.C559610Lx9;
import X.EnumC1642750sqn;
import X.EnumC371580EhY;
import X.InterfaceC1423900n9o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public class AwS19S0111000_22 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S0111000_22 awS19S0111000_22, Object obj, Object obj2) {
        C559610Lx9 c559610Lx9 = (C559610Lx9) obj;
        C1424220nAK c1424220nAK = (C1424220nAK) obj2;
        int i = c1424220nAK.LIZIZ;
        C1422560n7e c1422560n7e = (C1422560n7e) awS19S0111000_22.l0;
        int i2 = awS19S0111000_22.i2;
        boolean z = awS19S0111000_22.z1;
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.SHOW;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C1424180nAG.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1423900n9o.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c559610Lx9.LIZ.LIZIZ(c559610Lx9.LIZIZ, enumC1642750sqn, null, InterfaceC1423900n9o.class, C1424180nAG.class, C1427280nFG.class, i, enumC371580EhY, new AwS3S0311000_22(new C0ET4(), c559610Lx9, c1424220nAK, c1422560n7e, i2, z, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS19S0111000_22 awS19S0111000_22, Object obj, Object obj2) {
        C559610Lx9 c559610Lx9 = (C559610Lx9) obj;
        C1424220nAK c1424220nAK = (C1424220nAK) obj2;
        int i = c1424220nAK.LIZIZ;
        C1422980n8K c1422980n8K = (C1422980n8K) awS19S0111000_22.l0;
        boolean z = awS19S0111000_22.z1;
        int i2 = awS19S0111000_22.i2;
        EnumC371580EhY enumC371580EhY = EnumC371580EhY.SHOW;
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register slotUIComponent ");
        sbLIZ.append(C1424180nAG.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1423900n9o.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c559610Lx9.LIZ.LIZIZ(c559610Lx9.LIZIZ, enumC1642750sqn, null, InterfaceC1423900n9o.class, C1424180nAG.class, C1427280nFG.class, i, enumC371580EhY, new AwS3S0311000_22(new C0ET4(), c559610Lx9, c1422980n8K, z, c1424220nAK, i2, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0111000_22(C1422560n7e c1422560n7e, int i, boolean z, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1422560n7e;
        this.i2 = i;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S0111000_22(C1422980n8K c1422980n8K, boolean z, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = c1422980n8K;
        this.z1 = z;
        this.i2 = i;
    }
}
