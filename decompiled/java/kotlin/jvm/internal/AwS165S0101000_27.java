package kotlin.jvm.internal;

import X.C09AY;
import X.C1802050wzj;
import X.C1806980x7g;
import X.C1806990x7h;
import X.C1850820yGO;
import X.C1850830yGP;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AwS165S0101000_27 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS165S0101000_27 awS165S0101000_27) {
        ((C1850830yGP) awS165S0101000_27.l0).LIZJ(awS165S0101000_27.i1, "click");
        ((C1850830yGP) awS165S0101000_27.l0).getClass();
        C1850830yGP.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS165S0101000_27 awS165S0101000_27) {
        ((C1850820yGO) awS165S0101000_27.l0).LIZ(awS165S0101000_27.i1, "click");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS165S0101000_27 awS165S0101000_27) {
        if (((C1802050wzj) awS165S0101000_27.l0).LIZIZ(awS165S0101000_27.i1)) {
            ((C1802050wzj) awS165S0101000_27.l0).LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS165S0101000_27 awS165S0101000_27) {
        ((C1806980x7g) awS165S0101000_27.l0).LLILLJJLI.LJIILJJIL(awS165S0101000_27.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS165S0101000_27 awS165S0101000_27) {
        ((C1806990x7h) awS165S0101000_27.l0).LLILLJJLI.LJIILJJIL(awS165S0101000_27.i1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S0101000_27(C1802050wzj c1802050wzj, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1802050wzj;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S0101000_27(C1806980x7g c1806980x7g, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1806980x7g;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S0101000_27(C1806990x7h c1806990x7h, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1806990x7h;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S0101000_27(C1850820yGO c1850820yGO, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1850820yGO;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS165S0101000_27(C1850830yGP c1850830yGP, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1850830yGP;
        this.i1 = i;
    }
}
