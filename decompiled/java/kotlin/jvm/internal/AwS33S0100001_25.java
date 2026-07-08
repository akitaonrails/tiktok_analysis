package kotlin.jvm.internal;

import X.C09AY;
import X.C13LZ;
import X.C1645330sux;
import X.C1678520tmU;
import X.C1678560tmY;
import X.EnumC430170Gtr;
import X.InterfaceC1645340suy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS33S0100001_25 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS33S0100001_25 awS33S0100001_25) {
        float f = awS33S0100001_25.f1;
        float fLJFF = ((C1678560tmY) awS33S0100001_25.l0).LIZ.LJFF();
        float f2 = C1678520tmU.LIZ;
        return Float.valueOf(C13LZ.LIZLLL((fLJFF - f) / (0.0f - f), 0.0f, 1.0f));
    }

    public static final Object invoke$1(AwS33S0100001_25 awS33S0100001_25) {
        EnumC430170Gtr enumC430170Gtr;
        InterfaceC1645340suy interfaceC1645340suy = ((C1645330sux) awS33S0100001_25.l0).LIZIZ;
        if (interfaceC1645340suy != null) {
            float f = awS33S0100001_25.f1;
            if (f < 1.0E-5f) {
                enumC430170Gtr = EnumC430170Gtr.LEFT;
            } else {
                enumC430170Gtr = EnumC430170Gtr.RIGHT;
            }
            interfaceC1645340suy.LIZ(f, enumC430170Gtr);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS33S0100001_25 awS33S0100001_25) {
        ((Function1) awS33S0100001_25.l0).invoke(Float.valueOf(awS33S0100001_25.f1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0100001_25(float f, C1678560tmY c1678560tmY, int i) {
        super(0);
        this.$t = i;
        this.f1 = f;
        this.l0 = c1678560tmY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0100001_25(float f, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = function1;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0100001_25(C1645330sux c1645330sux, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1645330sux;
        this.f1 = f;
    }
}
