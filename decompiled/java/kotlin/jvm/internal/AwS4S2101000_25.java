package kotlin.jvm.internal;

import X.C09AY;
import X.C1674120tfO;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS4S2101000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS4S2101000_25 awS4S2101000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1674120tfO) awS4S2101000_25.l2).LIZ(awS4S2101000_25.s0, awS4S2101000_25.s1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S2101000_25.i3 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S2101000_25 awS4S2101000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((C1674120tfO) awS4S2101000_25.l2).LIZ(awS4S2101000_25.s0, awS4S2101000_25.s1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS4S2101000_25.i3 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S2101000_25(C1674120tfO c1674120tfO, String str, String str2, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l2 = c1674120tfO;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
    }
}
