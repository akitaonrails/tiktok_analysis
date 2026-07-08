package kotlin.jvm.internal;

import X.AbstractC1668700tWe;
import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.AbstractC1690640u62;
import X.AbstractC1695860uES;
import X.C09AY;
import X.C1675860tiC;
import X.C1676820tjk;
import X.C1682430tsn;
import X.C1683260tu8;
import X.C1691540u7U;
import X.C1692150u8T;
import X.C1693430uAX;
import X.C1695700uEC;
import X.InterfaceC1669010tX9;
import X.InterfaceC1675870tiD;
import X.InterfaceC1679550to9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS6S0200200_25 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S0200200_25 awS6S0200200_25, Object obj) throws Throwable {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        String strValueOf = String.valueOf(((AbstractC1690640u62) awS6S0200200_25.l0).LJIIIZ() + 1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32));
        C1675860tiC.LIZLLL(interfaceC1675870tiD, awS6S0200200_25.j2, fIntBitsToFloat / 2.0f, 0L, 0.0f, C1695700uEC.LIZ, 108);
        if (!a0.LJJJIL(strValueOf)) {
            C1692150u8T c1692150u8TLIZ = C1691540u7U.LIZ((C1691540u7U) awS6S0200200_25.l1, strValueOf, new C1693430uAX(awS6S0200200_25.j3, C1682430tsn.LJ(14), null, null, null, 0L, null, 3, 0L, 16744444), 0, 0L, 1020);
            long j = c1692150u8TLIZ.LIZJ;
            float f = 2;
            C1683260tu8.LIZ(interfaceC1675870tiD, c1692150u8TLIZ, 0L, (((long) Float.floatToRawIntBits((fIntBitsToFloat - ((int) (j >> 32))) / f)) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat - ((int) (j & 4294967295L))) / f)) & 4294967295L), 250);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S0200200_25 awS6S0200200_25, Object obj) {
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) awS6S0200200_25.l0;
        long j = awS6S0200200_25.j2;
        ((AbstractC1683310tuD) obj).LJIIIZ(abstractC1686530tzP, ((int) (awS6S0200200_25.j3 >> 32)) + ((int) (j >> 32)), C1676820tjk.LIZJ(awS6S0200200_25.j3) + C1676820tjk.LIZJ(j), 0.0f, (Function1) awS6S0200200_25.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S0200200_25 awS6S0200200_25, Object obj) {
        InterfaceC1669010tX9 interfaceC1669010tX9 = (InterfaceC1669010tX9) obj;
        interfaceC1669010tX9.LLIIJLIL();
        C1675860tiC.LJIIIZ(interfaceC1669010tX9, (AbstractC1668700tWe) awS6S0200200_25.l0, awS6S0200200_25.j2, awS6S0200200_25.j3, 0.0f, (AbstractC1695860uES) awS6S0200200_25.l1, 0, 104);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0200200_25(AbstractC1668700tWe abstractC1668700tWe, long j, long j2, AbstractC1695860uES abstractC1695860uES, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC1668700tWe;
        this.j2 = j;
        this.j3 = j2;
        this.l1 = abstractC1695860uES;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:long), (r1 I:kotlin.jvm.internal.AwS6S0200200_25) (LINE:83951623) kotlin.jvm.internal.AwS6S0200200_25.j3 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0009: IPUT (r8 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS6S0200200_25) (LINE:83951625) kotlin.jvm.internal.AwS6S0200200_25.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS6S0200200_25(AbstractC1686530tzP abstractC1686530tzP, AbstractC1686530tzP abstractC1686530tzP2, long j, long j2, Function1<? super InterfaceC1679550to9, Unit> function1) {
        long j3;
        Object obj;
        super(1);
        this.$t = function1;
        this.l0 = abstractC1686530tzP;
        this.j2 = abstractC1686530tzP2;
        this.j3 = j3;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S0200200_25(AbstractC1690640u62 abstractC1690640u62, long j, C1691540u7U c1691540u7U, long j2, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC1690640u62;
        this.j2 = j;
        this.l1 = c1691540u7U;
        this.j3 = j2;
    }
}
