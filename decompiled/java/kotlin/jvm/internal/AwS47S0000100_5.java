package kotlin.jvm.internal;

import X.C09AY;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS47S0000100_5 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

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

    public static final Object invoke$0(AwS47S0000100_5 awS47S0000100_5) {
        return Long.valueOf(System.currentTimeMillis() - awS47S0000100_5.j0);
    }

    public static final Object invoke$1(AwS47S0000100_5 awS47S0000100_5) {
        return Long.valueOf(System.currentTimeMillis() - awS47S0000100_5.j0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0000100_5(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
