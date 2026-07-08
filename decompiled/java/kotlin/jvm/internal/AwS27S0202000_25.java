package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C09AY;
import X.C1676330tix;
import X.C1676820tjk;
import X.C1691070u6j;
import X.C20028313Yb;
import X.EnumC1671200tag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS27S0202000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public int i3;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS27S0202000_25 awS27S0202000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AbstractC1686530tzP[] abstractC1686530tzPArr = (AbstractC1686530tzP[]) awS27S0202000_25.l0;
        C1676330tix c1676330tix = (C1676330tix) awS27S0202000_25.l1;
        int i = awS27S0202000_25.i2;
        int i2 = awS27S0202000_25.i3;
        for (AbstractC1686530tzP abstractC1686530tzP : abstractC1686530tzPArr) {
            if (abstractC1686530tzP != null) {
                long jLIZ = c1676330tix.LIZ.LIZIZ.LIZ((((long) abstractC1686530tzP.LL) << 32) | (((long) abstractC1686530tzP.LLILLJJLI) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), EnumC1671200tag.Ltr);
                abstractC1683310tuD.LIZLLL(abstractC1686530tzP, (int) (jLIZ >> 32), C1676820tjk.LIZJ(jLIZ), 0.0f);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S0202000_25 awS27S0202000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) awS27S0202000_25.l0;
        AbstractC1683310tuD.LJI(abstractC1683310tuD, abstractC1686530tzP, awS27S0202000_25.i2 - abstractC1686530tzP.LL, 0, new AwS37S0001000_25(awS27S0202000_25.i3, 6), 4);
        AbstractC1686530tzP abstractC1686530tzP2 = (AbstractC1686530tzP) awS27S0202000_25.l1;
        abstractC1683310tuD.LIZLLL(abstractC1686530tzP2, awS27S0202000_25.i2 - abstractC1686530tzP2.LL, awS27S0202000_25.i3, 0.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS27S0202000_25 awS27S0202000_25, Object obj) {
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) awS27S0202000_25.l0;
        AbstractC1683310tuD.LJI(abstractC1683310tuD, abstractC1686530tzP, awS27S0202000_25.i2 - abstractC1686530tzP.LL, 0, new AwS37S0001000_25(awS27S0202000_25.i3, 7), 4);
        AbstractC1686530tzP abstractC1686530tzP2 = (AbstractC1686530tzP) awS27S0202000_25.l1;
        AbstractC1683310tuD.LJFF(abstractC1683310tuD, abstractC1686530tzP2, awS27S0202000_25.i2 - abstractC1686530tzP2.LL, awS27S0202000_25.i3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b A[LOOP:0: B:4:0x0021->B:10:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[EDGE_INSN: B:13:0x004e->B:11:0x004e BREAK  A[LOOP:0: B:4:0x0021->B:10:0x004b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS27S0202000_25 r6, java.lang.Object r7) {
        /*
            X.0u6h r7 = (X.C1691050u6h) r7
            T r0 = r7.LIZJ
            X.0u6l r0 = (X.InterfaceC1691090u6l) r0
            kotlin.jvm.functions.Function1 r5 = r0.getKey()
            int r1 = r6.i2
            int r0 = r7.LIZ
            int r4 = java.lang.Math.max(r1, r0)
            int r2 = r6.i3
            int r1 = r7.LIZ
            int r0 = r7.LIZIZ
            int r1 = r1 + r0
            int r0 = r1 + (-1)
            int r3 = java.lang.Math.min(r2, r0)
            if (r4 > r3) goto L4e
        L21:
            if (r5 == 0) goto L31
            int r0 = r7.LIZ
            int r0 = r4 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r0)
            if (r2 != 0) goto L36
        L31:
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r2 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r2.<init>(r4)
        L36:
            java.lang.Object r0 = r6.l0
            X.13Yb r0 = (X.C20028313Yb) r0
            r0.LJII(r4, r2)
            java.lang.Object r0 = r6.l1
            X.0u6j r0 = (X.C1691070u6j) r0
            java.lang.Object[] r1 = r0.LIZIZ
            int r0 = r0.LIZJ
            int r0 = r4 - r0
            r1[r0] = r2
            if (r4 == r3) goto L4e
            int r4 = r4 + 1
            goto L21
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS27S0202000_25.invoke$3(kotlin.jvm.internal.AwS27S0202000_25, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S0202000_25(int i, int i2, int i3, C20028313Yb<Object> c20028313Yb, C1691070u6j c1691070u6j) {
        super(1);
        this.$t = c1691070u6j;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = i3;
        this.l1 = c20028313Yb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0202000_25(AbstractC1686530tzP abstractC1686530tzP, int i, AbstractC1686530tzP abstractC1686530tzP2, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = abstractC1686530tzP;
        this.i2 = i;
        this.l1 = abstractC1686530tzP2;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0202000_25(AbstractC1686530tzP[] abstractC1686530tzPArr, C1676330tix c1676330tix, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = abstractC1686530tzPArr;
        this.l1 = c1676330tix;
        this.i2 = i;
        this.i3 = i2;
    }
}
