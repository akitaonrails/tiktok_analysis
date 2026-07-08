package kotlin.jvm.internal;

import X.C09AY;
import X.C1668650tWZ;
import X.C1780100wQK;
import X.C1890107al;
import X.C2267031DoL;
import X.C2267051DoN;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS15S0000001_35 extends C09AY implements Function1 {
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0000001_35(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS15S0000001_35 awS15S0000001_35, Object obj) {
        float f = 1024;
        ((C1780100wQK) obj).LJ((int) (awS15S0000001_35.f0 * 4 * f * f));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S0000001_35 awS15S0000001_35, Object obj) {
        return C1890107al.LIZ((C1890107al) obj, false, false, null, Float.valueOf(awS15S0000001_35.f0), 7);
    }

    public static final Object invoke$2(AwS15S0000001_35 awS15S0000001_35, Object obj) {
        float f = 1024;
        ((C1780100wQK) obj).LJ((int) (awS15S0000001_35.f0 * f * f));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS15S0000001_35 awS15S0000001_35, Object obj) {
        return C2267031DoL.LIZIZ(((C2267051DoN) obj).LIZIZ(new C1668650tWZ(awS15S0000001_35.f0)));
    }
}
