package kotlin.jvm.internal;

import X.C09AY;
import X.C1436310nTp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS24S0002000_22 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f977i0;
    public int i1;

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

    public static final Object invoke$0(AwS24S0002000_22 awS24S0002000_22) {
        C1436310nTp c1436310nTp = C1436310nTp.LIZ;
        int i = awS24S0002000_22.f977i0;
        int i2 = awS24S0002000_22.i1;
        c1436310nTp.getClass();
        C1436310nTp.LIZLLL(i, i2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S0002000_22 awS24S0002000_22) {
        return new Pair(Integer.valueOf(awS24S0002000_22.f977i0), Integer.valueOf(awS24S0002000_22.i1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0002000_22(int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.f977i0 = i;
        this.i1 = i2;
    }
}
