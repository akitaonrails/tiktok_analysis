package kotlin.jvm.internal;

import X.C09AY;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS277S0000000_32 extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS277S0000000_32(String str, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS277S0000000_32 awS277S0000000_32, Object obj) {
        obj.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS277S0000000_32 awS277S0000000_32, Object obj) {
        obj.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS277S0000000_32 awS277S0000000_32, Object obj) {
        obj.getClass();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS277S0000000_32(String str, Exception exc, int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS277S0000000_32(String str, Throwable th, int i) {
        super(1);
        this.$t = i;
    }
}
