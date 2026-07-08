package kotlin.jvm.internal;

import X.C09AY;
import X.C1668650tWZ;
import X.C1688620u2m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS0S0000004_25 extends C09AY implements Function1 {
    public final int $t;
    public float f0;
    public float f1;
    public float f2;
    public float f3;

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

    public static final Object invoke$0(AwS0S0000004_25 awS0S0000004_25, Object obj) {
        C1688620u2m c1688620u2m = (C1688620u2m) obj;
        c1688620u2m.getClass();
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f0));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f1));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f2));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f3));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0000004_25 awS0S0000004_25, Object obj) {
        C1688620u2m c1688620u2m = (C1688620u2m) obj;
        c1688620u2m.getClass();
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f0));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f1));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f2));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS0S0000004_25.f3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0000004_25(float f, float f2, float f3, float f4, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
        this.f1 = f2;
        this.f2 = f3;
        this.f3 = f4;
    }
}
