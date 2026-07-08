package kotlin.jvm.internal;

import X.C09AY;
import X.C0SZ4;
import X.C13IQ;
import X.C1606906Qx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS20S1101000_2 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS20S1101000_2 awS20S1101000_2, Object obj) {
        C0SZ4 c0sz4 = (C0SZ4) obj;
        c0sz4.LL = (C13IQ) awS20S1101000_2.l1;
        c0sz4.LLIZLLLIL = awS20S1101000_2.i2;
        c0sz4.LLILLJJLI = awS20S1101000_2.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S1101000_2 awS20S1101000_2, Object obj) {
        C1606906Qx c1606906Qx = (C1606906Qx) awS20S1101000_2.l1;
        String str = awS20S1101000_2.s0;
        int i = awS20S1101000_2.i2;
        c1606906Qx.getClass();
        C1606906Qx.LIZJ(i, "click", "cancel", str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1101000_2(int i, String str, C13IQ c13iq, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c13iq;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S1101000_2(C1606906Qx c1606906Qx, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c1606906Qx;
        this.s0 = str;
        this.i2 = i;
    }
}
