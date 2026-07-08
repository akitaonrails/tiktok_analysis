package kotlin.jvm.internal;

import X.C09AY;
import X.InterfaceC1554220qY0;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public class AwS307S0000000_23 extends C09AY implements Function2 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS307S0000000_23(Bundle bundle, int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AwS307S0000000_23 awS307S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS307S0000000_23 awS307S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJJIIZI();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS307S0000000_23 awS307S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJIIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS307S0000000_23 awS307S0000000_23, Object obj, Object obj2) {
        ((InterfaceC1554220qY0) obj).LJII();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS307S0000000_23(int i, int i2, Intent intent, int i3) {
        super(2);
        this.$t = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS307S0000000_23(int i, String[] strArr, int[] iArr, int i2) {
        super(2);
        this.$t = i2;
    }
}
