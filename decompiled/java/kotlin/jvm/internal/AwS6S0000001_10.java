package kotlin.jvm.internal;

import X.C09AY;
import X.C0QS8;
import X.C291001Au;
import X.C674530Qd1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS6S0000001_10 extends C09AY implements Function1 {
    public final int $t;
    public float f0;

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
    public AwS6S0000001_10(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS6S0000001_10 awS6S0000001_10, Object obj) {
        return C0QS8.LIZ((C0QS8) obj, 0.0f, awS6S0000001_10.f0, false, false, null, 61);
    }

    public static final Object invoke$1(AwS6S0000001_10 awS6S0000001_10, Object obj) {
        return C0QS8.LIZ((C0QS8) obj, awS6S0000001_10.f0, 0.0f, false, false, null, 62);
    }

    public static final Object invoke$2(AwS6S0000001_10 awS6S0000001_10, Object obj) {
        C674530Qd1 c674530Qd1 = (C674530Qd1) obj;
        C291001Au c291001Au = new C291001Au(Float.valueOf(awS6S0000001_10.f0));
        C291001Au<Boolean> c291001Au2 = c674530Qd1.LL;
        c674530Qd1.getClass();
        return new C674530Qd1(c291001Au2, c291001Au);
    }
}
