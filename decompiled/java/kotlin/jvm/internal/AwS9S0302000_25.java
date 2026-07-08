package kotlin.jvm.internal;

import X.AbstractC1683310tuD;
import X.AbstractC1686530tzP;
import X.C09AY;
import X.C1676820tjk;
import X.C1682900ttY;
import X.C1683980tvI;
import X.C1692150u8T;
import X.C259800zU;
import X.EnumC1671200tag;
import X.InterfaceC1689940u4u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS9S0302000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS9S0302000_25 awS9S0302000_25, Object obj) {
        int i;
        int iLJIIJ;
        int iLJIIL;
        int iLJFF;
        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj;
        int i2 = 0;
        abstractC1683310tuD.LIZLLL((AbstractC1686530tzP) ((C259800zU) awS9S0302000_25.l0).element, 0, 0, 0.0f);
        C1692150u8T c1692150u8T = (C1692150u8T) ((C259800zU) awS9S0302000_25.l1).element;
        if (c1692150u8T != null) {
            i = c1692150u8T.LIZIZ.LJFF;
        } else {
            i = 1;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (c1692150u8T != null) {
            iLJIIJ = (int) c1692150u8T.LJIIJ(i3);
        } else {
            iLJIIJ = ((AbstractC1686530tzP) ((C259800zU) awS9S0302000_25.l0).element).LL;
        }
        C1692150u8T c1692150u8T2 = (C1692150u8T) ((C259800zU) awS9S0302000_25.l1).element;
        if (c1692150u8T2 != null) {
            iLJIIL = (int) c1692150u8T2.LJIIL(i3);
        } else {
            iLJIIL = 0;
        }
        C1692150u8T c1692150u8T3 = (C1692150u8T) ((C259800zU) awS9S0302000_25.l1).element;
        if (c1692150u8T3 != null) {
            iLJFF = (int) c1692150u8T3.LJFF(i3);
        } else {
            iLJFF = ((AbstractC1686530tzP) ((C259800zU) awS9S0302000_25.l0).element).LLILLJJLI;
        }
        int i4 = iLJIIJ + awS9S0302000_25.i3;
        int i5 = awS9S0302000_25.i4;
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) awS9S0302000_25.l2;
        int i6 = i5 - abstractC1686530tzP.LL;
        if (i4 > i6) {
            i4 = i6;
        }
        if (i4 >= 0) {
            i2 = i4;
        }
        abstractC1683310tuD.LIZLLL(abstractC1686530tzP, i2, iLJIIL + (((iLJFF - iLJIIL) - abstractC1686530tzP.LLILLJJLI) / 2), 0.0f);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0302000_25 awS9S0302000_25, Object obj) {
        Function2<? super C1682900ttY, ? super EnumC1671200tag, C1676820tjk> function2 = ((C1683980tvI) awS9S0302000_25.l0).LLJJIII;
        int i = awS9S0302000_25.i3;
        AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) awS9S0302000_25.l1;
        AbstractC1683310tuD.LJ((AbstractC1683310tuD) obj, (AbstractC1686530tzP) awS9S0302000_25.l1, function2.invoke(new C1682900ttY((((long) (i - abstractC1686530tzP.LL)) << 32) | (((long) (awS9S0302000_25.i4 - abstractC1686530tzP.LLILLJJLI)) & 4294967295L)), ((InterfaceC1689940u4u) awS9S0302000_25.l2).getLayoutDirection()).LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS9S0302000_25(C259800zU c259800zU, C259800zU<AbstractC1686530tzP> c259800zU2, C259800zU<C1692150u8T> c259800zU3, int i, int i2, AbstractC1686530tzP abstractC1686530tzP) {
        super(1);
        this.$t = abstractC1686530tzP;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.i3 = c259800zU3;
        this.i4 = i;
        this.l2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0302000_25(C1683980tvI c1683980tvI, int i, AbstractC1686530tzP abstractC1686530tzP, int i2, InterfaceC1689940u4u interfaceC1689940u4u, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = c1683980tvI;
        this.i3 = i;
        this.l1 = abstractC1686530tzP;
        this.i4 = i2;
        this.l2 = interfaceC1689940u4u;
    }
}
