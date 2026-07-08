package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1546650qLn;
import X.InterfaceC2217711Bqz;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes35.dex */
public class AwS322S0000000_34 extends C09AY implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS322S0000000_34(Bundle bundle, int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS322S0000000_34(boolean z, int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AwS322S0000000_34 awS322S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJJJJZ((InterfaceC1546650qLn) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS322S0000000_34 awS322S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJIJI();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS322S0000000_34 awS322S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJJ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS322S0000000_34 awS322S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJII();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS322S0000000_34 awS322S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJJLIIIJLJLI((InterfaceC1546650qLn) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS322S0000000_34 awS322S0000000_34, Object obj, Object obj2) {
        ((InterfaceC2217711Bqz) obj).LJIIJJI();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS322S0000000_34(int i, String[] strArr, int[] iArr, int i2) {
        super(2);
        this.$t = i2;
    }
}
