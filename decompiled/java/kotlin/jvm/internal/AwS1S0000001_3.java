package kotlin.jvm.internal;

import X.C07WO;
import X.C09AY;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS1S0000001_3 extends C09AY implements Function1 {
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
    public AwS1S0000001_3(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS1S0000001_3 awS1S0000001_3, Object obj) {
        return Float.valueOf(awS1S0000001_3.f0);
    }

    public static final Object invoke$1(AwS1S0000001_3 awS1S0000001_3, Object obj) {
        C07WO c07wo = (C07WO) obj;
        float f = awS1S0000001_3.f0;
        boolean z = c07wo.LIZIZ;
        c07wo.getClass();
        return new C07WO(f, z);
    }
}
