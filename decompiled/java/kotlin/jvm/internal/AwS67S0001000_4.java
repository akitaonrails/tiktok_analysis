package kotlin.jvm.internal;

import X.C09AY;
import X.C1667560tUo;
import X.C1667570tUp;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public class AwS67S0001000_4 extends C09AY implements Function2 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1026i0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS67S0001000_4(int i, int i2) {
        super(2);
        this.$t = i2;
        this.f1026i0 = i;
    }

    public static final Object invoke$0(AwS67S0001000_4 awS67S0001000_4, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667570tUp.LIZIZ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS67S0001000_4.f1026i0 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS67S0001000_4 awS67S0001000_4, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1667560tUo.LIZ((InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS67S0001000_4.f1026i0 | 1));
        return Unit.LIZ;
    }
}
