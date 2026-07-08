package kotlin.jvm.internal;

import X.C09AY;
import X.C1668890tWx;
import X.C1669890tYZ;
import X.C1671420tb2;
import X.C341440Da2;
import X.InterfaceC1680500tpg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS26S0002000_25 extends C09AY implements Function2 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f981i0;
    public int i1;

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
    public AwS26S0002000_25(int i, int i2, int i3) {
        super(2);
        this.$t = i3;
        this.f981i0 = i;
        this.i1 = i2;
    }

    public static final Object invoke$0(AwS26S0002000_25 awS26S0002000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1668890tWx.LJIIIZ(awS26S0002000_25.f981i0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS26S0002000_25.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S0002000_25 awS26S0002000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671420tb2.LIZ(awS26S0002000_25.f981i0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS26S0002000_25.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS26S0002000_25 awS26S0002000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1671420tb2.LIZ(awS26S0002000_25.f981i0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS26S0002000_25.i1 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS26S0002000_25 awS26S0002000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669890tYZ.LIZ(awS26S0002000_25.f981i0, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS26S0002000_25.i1 | 1));
        return Unit.LIZ;
    }
}
