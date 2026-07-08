package kotlin.jvm.internal;

import X.C09AY;
import X.C1411860mqO;
import X.C1431070nLN;
import X.C1431640nMI;
import X.C1435540nSa;
import X.C1435550nSb;
import X.EnumC2251001D8o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS32S0100001_22 extends C09AY implements Function0 {
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
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S0100001_22 awS32S0100001_22) {
        C1431070nLN c1431070nLN = ((C1435540nSa) awS32S0100001_22.l0).LLJJIJIL;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(new C1411860mqO(awS32S0100001_22.f1), EnumC2251001D8o.OUTER);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S0100001_22 awS32S0100001_22) {
        C1435540nSa c1435540nSa = (C1435540nSa) awS32S0100001_22.l0;
        float f = awS32S0100001_22.f1;
        if (c1435540nSa.LLJLLL.getValue() == null) {
            C1431070nLN c1431070nLN = c1435540nSa.LLJJIJIL;
            if (c1431070nLN == null) {
                c1431070nLN = null;
            }
            c1431070nLN.LIZIZ(new C1411860mqO(f), EnumC2251001D8o.OUTER);
        } else {
            C1431640nMI c1431640nMI = (C1431640nMI) c1435540nSa.LLJLLL.getValue();
            if (c1431640nMI != null) {
                C1431640nMI.LIZ(c1431640nMI, new AwS32S0100001_22(c1435540nSa, f, 0));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S0100001_22 awS32S0100001_22) {
        C1431070nLN c1431070nLN = ((C1435550nSb) awS32S0100001_22.l0).LLJJ;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZIZ(new C1411860mqO(awS32S0100001_22.f1), EnumC2251001D8o.OUTER);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS32S0100001_22 awS32S0100001_22) {
        C1435550nSb c1435550nSb = (C1435550nSb) awS32S0100001_22.l0;
        float f = awS32S0100001_22.f1;
        if (c1435550nSb.LLJL.getValue() == null) {
            C1431070nLN c1431070nLN = c1435550nSb.LLJJ;
            if (c1431070nLN == null) {
                c1431070nLN = null;
            }
            c1431070nLN.LIZIZ(new C1411860mqO(f), EnumC2251001D8o.OUTER);
        } else {
            C1431640nMI c1431640nMI = (C1431640nMI) c1435550nSb.LLJL.getValue();
            if (c1431640nMI != null) {
                C1431640nMI.LIZ(c1431640nMI, new AwS32S0100001_22(c1435550nSb, f, 2));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0100001_22(C1435540nSa c1435540nSa, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1435540nSa;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0100001_22(C1435550nSb c1435550nSb, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1435550nSb;
        this.f1 = f;
    }
}
