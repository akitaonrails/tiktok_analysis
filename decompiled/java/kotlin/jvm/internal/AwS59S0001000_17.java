package kotlin.jvm.internal;

import X.C09AY;
import X.C1114110f69;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS59S0001000_17 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1017i0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS59S0001000_17 awS59S0001000_17) {
        ThreadLocal<Integer> threadLocal = C1114110f69.LIZIZ;
        Integer num = threadLocal.get();
        if (num != null) {
            if (num.intValue() == awS59S0001000_17.f1017i0) {
                threadLocal.set(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS59S0001000_17 awS59S0001000_17) {
        ThreadLocal<Integer> threadLocal = C1114110f69.LIZIZ;
        if (threadLocal.get() == null) {
            threadLocal.set(Integer.valueOf(awS59S0001000_17.f1017i0));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS59S0001000_17(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1017i0 = i;
    }
}
