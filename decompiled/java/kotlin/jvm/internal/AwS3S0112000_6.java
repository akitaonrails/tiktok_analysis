package kotlin.jvm.internal;

import X.C09AY;
import X.C1668390tW9;
import X.C1671780tbc;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS3S0112000_6 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public int i3;
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

    public static final Object invoke$0(AwS3S0112000_6 awS3S0112000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = awS3S0112000_6.z1;
        int i = awS3S0112000_6.i2;
        Function1 function1 = (Function1) awS3S0112000_6.l0;
        C1668390tW9.LIZIZ(i, C341440Da2.LIZ(awS3S0112000_6.i3 | 1), (InterfaceC1680500tpg) obj, function1, z);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0112000_6 awS3S0112000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        boolean z = awS3S0112000_6.z1;
        Function0 function0 = (Function0) awS3S0112000_6.l0;
        C1671780tbc.LIZ(C341440Da2.LIZ(awS3S0112000_6.i2 | 1), awS3S0112000_6.i3, (InterfaceC1680500tpg) obj, function0, z);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0112000_6(int i, int i2, Function0 function0, boolean z, int i3) {
        super(2);
        this.$t = i3;
        this.z1 = z;
        this.l0 = function0;
        this.i2 = i;
        this.i3 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0112000_6(int i, int i2, Function1 function1, boolean z, int i3) {
        super(2);
        this.$t = i3;
        this.z1 = z;
        this.i2 = i;
        this.l0 = function1;
        this.i3 = i2;
    }
}
