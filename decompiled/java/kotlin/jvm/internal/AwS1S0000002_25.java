package kotlin.jvm.internal;

import X.C09AY;
import X.C1647990szF;
import X.C1668650tWZ;
import X.C1688620u2m;
import X.C21593019ey;
import X.InterfaceC1679550to9;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS1S0000002_25 extends C09AY implements Function1 {
    public final int $t;
    public float f0;
    public float f1;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S0000002_25 awS1S0000002_25, Object obj) {
        C1688620u2m c1688620u2m = (C1688620u2m) obj;
        c1688620u2m.getClass();
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS1S0000002_25.f0));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS1S0000002_25.f1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0000002_25 awS1S0000002_25, Object obj) {
        return C21593019ey.LIZ((C21593019ey) obj, null, new C1647990szF(awS1S0000002_25.f0, awS1S0000002_25.f1), null, null, null, null, null, 251);
    }

    public static final Object invoke$2(AwS1S0000002_25 awS1S0000002_25, Object obj) {
        InterfaceC1679550to9 interfaceC1679550to9 = (InterfaceC1679550to9) obj;
        interfaceC1679550to9.LJI(awS1S0000002_25.f0);
        interfaceC1679550to9.setAlpha(awS1S0000002_25.f1);
        interfaceC1679550to9.LJIJ(2);
        interfaceC1679550to9.LJIILIIL(false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS1S0000002_25 awS1S0000002_25, Object obj) {
        C1688620u2m c1688620u2m = (C1688620u2m) obj;
        c1688620u2m.getClass();
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS1S0000002_25.f0));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS1S0000002_25.f1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS1S0000002_25 awS1S0000002_25, Object obj) {
        C1688620u2m c1688620u2m = (C1688620u2m) obj;
        c1688620u2m.getClass();
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS1S0000002_25.f0));
        c1688620u2m.LIZ.LIZJ(new C1668650tWZ(awS1S0000002_25.f1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0000002_25(float f, float f2, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
        this.f1 = f2;
    }
}
