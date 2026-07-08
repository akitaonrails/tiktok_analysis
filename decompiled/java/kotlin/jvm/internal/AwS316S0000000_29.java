package kotlin.jvm.internal;

import X.C09AY;
import X.C11TS;
import X.C19505611Ta;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AwS316S0000000_29 extends C09AY implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS316S0000000_29(int i) {
        super(2);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS316S0000000_29 awS316S0000000_29, Object obj, Object obj2) {
        if (Intrinsics.LJFF(C11TS.class, Unit.class)) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Unit");
            }
            return obj;
        }
        if (Intrinsics.LJFF(Unit.class, Unit.class)) {
            return Unit.LIZ;
        }
        throw new RuntimeException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS316S0000000_29 awS316S0000000_29, Object obj, Object obj2) {
        if (Intrinsics.LJFF(C19505611Ta.class, Unit.class)) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Unit");
            }
            return obj;
        }
        if (Intrinsics.LJFF(Unit.class, Unit.class)) {
            return Unit.LIZ;
        }
        throw new RuntimeException();
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS316S0000000_29 awS316S0000000_29, Object obj, Object obj2) {
        if (Intrinsics.LJFF(C19505611Ta.class, Unit.class)) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Unit");
            }
            return obj;
        }
        if (Intrinsics.LJFF(Unit.class, Unit.class)) {
            return Unit.LIZ;
        }
        throw new RuntimeException();
    }
}
