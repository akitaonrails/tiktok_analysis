package kotlin.jvm.internal;

import X.C09AY;
import X.C1534750q2b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public class AwS211S0000000_23 extends C09AY implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS211S0000000_23(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$0(AwS211S0000000_23 awS211S0000000_23) {
        return new C1534750q2b("PrefetchGroup", "prefetch", "cache pool already full", 24);
    }

    public static final Object invoke$1(AwS211S0000000_23 awS211S0000000_23) {
        return new C1534750q2b("PrefetchGroup", "prefetch", "cache pool already full", 24);
    }

    public static final Object invoke$2(AwS211S0000000_23 awS211S0000000_23) {
        return new C1534750q2b("ForestBufferX", "handleException", "resume successfully", 24);
    }
}
