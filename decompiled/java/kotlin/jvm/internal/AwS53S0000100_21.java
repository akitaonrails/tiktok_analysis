package kotlin.jvm.internal;

import X.C09AY;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS53S0000100_21 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

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

    public static final Object invoke$0(AwS53S0000100_21 awS53S0000100_21) {
        return Long.valueOf(awS53S0000100_21.j0);
    }

    public static final Object invoke$1(AwS53S0000100_21 awS53S0000100_21) {
        return Long.valueOf(awS53S0000100_21.j0);
    }

    public static final Object invoke$2(AwS53S0000100_21 awS53S0000100_21) {
        return Long.valueOf(awS53S0000100_21.j0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0000100_21(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
