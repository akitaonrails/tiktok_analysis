package kotlin.jvm.internal;

import X.C09AY;
import X.C0JC4;
import X.C0JC5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS5S0000001_7 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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
    public AwS5S0000001_7(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS5S0000001_7 awS5S0000001_7, Object obj) {
        return C0JC4.LIZ((C0JC4) obj, null, null, null, null, awS5S0000001_7.f0, 31);
    }

    public static final Object invoke$1(AwS5S0000001_7 awS5S0000001_7, Object obj) {
        return C0JC5.LIZ((C0JC5) obj, null, null, null, null, awS5S0000001_7.f0, 31);
    }
}
