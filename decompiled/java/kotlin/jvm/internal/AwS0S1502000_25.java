package kotlin.jvm.internal;

import X.AbstractC1676640tjS;
import X.AbstractC1676650tjT;
import X.C09AY;
import X.C1676630tjR;
import X.C1676880tjq;
import X.C1679460to0;
import X.C1686970u07;
import X.C341440Da2;
import X.EnumC1679580toC;
import X.InterfaceC1631620sYq;
import X.InterfaceC1671930tbr;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1502000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i6;
    public int i7;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

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

    public static final Object invoke$0(AwS0S1502000_25 awS0S1502000_25, Object obj, Object obj2) throws Throwable {
        ((Number) obj2).intValue();
        C1676630tjR.LIZIZ((C1676880tjq) awS0S1502000_25.l1, (InterfaceC1685750ty9) awS0S1502000_25.l2, (AbstractC1676640tjS) awS0S1502000_25.l3, (AbstractC1676650tjT) awS0S1502000_25.l4, awS0S1502000_25.s0, (InterfaceC1631620sYq) awS0S1502000_25.l5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1502000_25.i6 | 1), awS0S1502000_25.i7);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1502000_25 awS0S1502000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1679460to0.LJ((EnumC1679580toC) awS0S1502000_25.l1, awS0S1502000_25.s0, (C1686970u07) awS0S1502000_25.l2, (Function1) awS0S1502000_25.l3, (Function1) awS0S1502000_25.l4, (InterfaceC1685750ty9) awS0S1502000_25.l5, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1502000_25.i6 | 1), awS0S1502000_25.i7);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1502000_25(C1676880tjq c1676880tjq, C1676880tjq<Boolean> c1676880tjq2, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = c1676880tjq;
        this.l2 = c1676880tjq2;
        this.l3 = interfaceC1685750ty9;
        this.l4 = abstractC1676640tjS;
        this.s0 = abstractC1676650tjT;
        this.l5 = str;
        this.i6 = interfaceC1631620sYq;
        this.i7 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1502000_25(EnumC1679580toC enumC1679580toC, EnumC1679580toC enumC1679580toC2, String str, C1686970u07 c1686970u07, Function1<? super C1686970u07, Unit> function1, Function1<? super EnumC1679580toC, Unit> function12, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = enumC1679580toC;
        this.s0 = enumC1679580toC2;
        this.l2 = str;
        this.l3 = c1686970u07;
        this.l4 = function1;
        this.l5 = function12;
        this.i6 = interfaceC1685750ty9;
        this.i7 = i;
    }
}
