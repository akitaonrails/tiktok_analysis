package kotlin.jvm.internal;

import X.C09AY;
import X.C1154150g8j;
import X.C21667819r2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS83S1000000_33 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS83S1000000_33(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS83S1000000_33 awS83S1000000_33, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1154150g8j) obj).LIZ, awS83S1000000_33.s0));
    }

    public static final Object invoke$1(AwS83S1000000_33 awS83S1000000_33, Object obj) {
        return C21667819r2.LIZ((C21667819r2) obj, false, awS83S1000000_33.s0, false, false, null, null, 61);
    }
}
