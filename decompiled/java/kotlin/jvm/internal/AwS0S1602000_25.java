package kotlin.jvm.internal;

import X.AbstractC1676640tjS;
import X.AbstractC1676650tjT;
import X.C09AY;
import X.C1671870tbl;
import X.C1672120tcA;
import X.C1676630tjR;
import X.C1676880tjq;
import X.C341440Da2;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1668050tVb;
import X.InterfaceC1671910tbp;
import X.InterfaceC1671930tbr;
import X.InterfaceC1675480tha;
import X.InterfaceC1676580tjM;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1602000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i7;
    public int i8;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
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

    public static final Object invoke$0(AwS0S1602000_25 awS0S1602000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671870tbl.LIZIZ(awS0S1602000_25.l1, (InterfaceC1685750ty9) awS0S1602000_25.l2, (Function1) awS0S1602000_25.l3, (InterfaceC1668050tVb) awS0S1602000_25.l4, awS0S1602000_25.s0, (Function1) awS0S1602000_25.l5, (InterfaceC1631630sYr) awS0S1602000_25.l6, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1602000_25.i7 | 1), awS0S1602000_25.i8);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1602000_25 awS0S1602000_25, Object obj, Object obj2) throws Throwable {
        ((Number) obj2).intValue();
        C1676630tjR.LJ((InterfaceC1675480tha) awS0S1602000_25.l1, (C1676880tjq) awS0S1602000_25.l2, (InterfaceC1685750ty9) awS0S1602000_25.l3, (AbstractC1676640tjS) awS0S1602000_25.l4, (AbstractC1676650tjT) awS0S1602000_25.l5, awS0S1602000_25.s0, (InterfaceC1631620sYq) awS0S1602000_25.l6, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS0S1602000_25.i7 | 1), awS0S1602000_25.i8);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1602000_25(InterfaceC1675480tha interfaceC1675480tha, InterfaceC1675480tha interfaceC1675480tha2, C1676880tjq<Boolean> c1676880tjq, InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, String str, InterfaceC1631620sYq<? super InterfaceC1671930tbr, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = interfaceC1675480tha;
        this.l2 = interfaceC1675480tha2;
        this.l3 = c1676880tjq;
        this.l4 = interfaceC1685750ty9;
        this.l5 = abstractC1676640tjS;
        this.s0 = abstractC1676650tjT;
        this.l6 = str;
        this.i7 = interfaceC1631620sYq;
        this.i8 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S1602000_25(Object obj, S s, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super InterfaceC1676580tjM<S>, C1672120tcA> function1, InterfaceC1668050tVb interfaceC1668050tVb, String str, Function1<? super S, ? extends Object> function12, InterfaceC1631630sYr<? super InterfaceC1671910tbp, ? super S, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = obj;
        this.l2 = s;
        this.l3 = interfaceC1685750ty9;
        this.l4 = function1;
        this.s0 = interfaceC1668050tVb;
        this.l5 = str;
        this.l6 = function12;
        this.i7 = interfaceC1631630sYr;
        this.i8 = i;
    }
}
