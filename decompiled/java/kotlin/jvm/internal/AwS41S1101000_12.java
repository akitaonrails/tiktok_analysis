package kotlin.jvm.internal;

import X.C09AY;
import X.C1674230tfZ;
import X.C1696320uFC;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
public class AwS41S1101000_12 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l1;
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

    public static final Object invoke$0(AwS41S1101000_12 awS41S1101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1674230tfZ c1674230tfZ = (C1674230tfZ) awS41S1101000_12.l1;
        String str = awS41S1101000_12.s0;
        c1674230tfZ.LIZIZ(C341440Da2.LIZ(awS41S1101000_12.i2 | 1), (InterfaceC1680500tpg) obj, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S1101000_12 awS41S1101000_12, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1696320uFC.LIZ(awS41S1101000_12.s0, (Function2) awS41S1101000_12.l1, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS41S1101000_12.i2 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S1101000_12(C1674230tfZ c1674230tfZ, String str, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l1 = c1674230tfZ;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS41S1101000_12(String str, int i, Function2 function2, int i2) {
        super(2);
        this.$t = i2;
        this.s0 = str;
        this.l1 = function2;
        this.i2 = i;
    }
}
