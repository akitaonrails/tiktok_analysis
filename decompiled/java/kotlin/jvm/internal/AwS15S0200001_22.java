package kotlin.jvm.internal;

import X.C09AY;
import X.C1419590n2r;
import X.C1424850nBL;
import X.C1425090nBj;
import X.C299160Bo2;
import X.C337180DJs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS15S0200001_22 extends C09AY implements Function0 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS15S0200001_22 awS15S0200001_22) {
        if (!C299160Bo2.LIZ() || awS15S0200001_22.f2 == 0.0f) {
            C337180DJs.LIZJ(((C1425090nBj) awS15S0200001_22.l0).LLIZ);
            C337180DJs.LIZ(((C1425090nBj) awS15S0200001_22.l0).LLJIJIL);
        }
        C337180DJs.LIZJ(((C1425090nBj) awS15S0200001_22.l0).LLIZLLLIL);
        ((Function0) awS15S0200001_22.l1).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS15S0200001_22 awS15S0200001_22) {
        ((C1424850nBL) awS15S0200001_22.l0).LJIJJ(false, (C1419590n2r) awS15S0200001_22.l1, awS15S0200001_22.f2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0200001_22(float f, C1425090nBj c1425090nBj, AwS1S0201001_22 awS1S0201001_22, int i) {
        super(0);
        this.$t = i;
        this.f2 = f;
        this.l0 = c1425090nBj;
        this.l1 = awS1S0201001_22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S0200001_22(C1424850nBL c1424850nBL, C1419590n2r c1419590n2r, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1424850nBL;
        this.l1 = c1419590n2r;
        this.f2 = f;
    }
}
