package kotlin.jvm.internal;

import X.C09AY;
import X.C1671420tb2;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S1002000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final Object invoke$0(AwS0S1002000_25 awS0S1002000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = awS0S1002000_25.s0;
        C1671420tb2.LIZJ(C341440Da2.LIZ(awS0S1002000_25.i1 | 1), awS0S1002000_25.i2, (InterfaceC1680500tpg) obj, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1002000_25 awS0S1002000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        String str = awS0S1002000_25.s0;
        C1671420tb2.LIZJ(C341440Da2.LIZ(awS0S1002000_25.i1 | 1), awS0S1002000_25.i2, (InterfaceC1680500tpg) obj, str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1002000_25(String str, int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.s0 = str;
        this.i1 = i;
        this.i2 = i2;
    }
}
