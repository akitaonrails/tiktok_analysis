package kotlin.jvm.internal;

import X.C09AY;
import X.C19EG;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS230S0000000_3 extends C09AY implements Function1 {
    public final int $t;

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
    public AwS230S0000000_3(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS230S0000000_3(C19EG c19eg, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS230S0000000_3 awS230S0000000_3, Object obj) {
        ((Boolean) obj).booleanValue();
        return Boolean.FALSE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AwS230S0000000_3 awS230S0000000_3, Object obj) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }
}
