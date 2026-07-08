package kotlin.jvm.internal;

import X.C00GP;
import X.C00GQ;
import X.C09AY;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS7S0000001_11 extends C09AY implements Function1 {
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
    public AwS7S0000001_11(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AwS7S0000001_11 awS7S0000001_11, Object obj) {
        float f = awS7S0000001_11.f0;
        obj.getClass();
        return new C00GP(f);
    }

    public static final Object invoke$1(AwS7S0000001_11 awS7S0000001_11, Object obj) {
        float f = awS7S0000001_11.f0;
        obj.getClass();
        return new C00GQ(f);
    }
}
