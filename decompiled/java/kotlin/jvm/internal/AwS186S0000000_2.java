package kotlin.jvm.internal;

import X.C09AY;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS186S0000000_2 extends C09AY implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS186S0000000_2(int i) {
        super(0);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(AwS186S0000000_2 awS186S0000000_2) {
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS186S0000000_2 awS186S0000000_2) {
        return Boolean.FALSE;
    }
}
