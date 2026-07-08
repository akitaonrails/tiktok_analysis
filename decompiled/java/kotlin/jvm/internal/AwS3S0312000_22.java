package kotlin.jvm.internal;

import X.AbstractC1412880ms2;
import X.C09AY;
import X.C1412860ms0;
import X.C1414650mut;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS3S0312000_22 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS3S0312000_22 awS3S0312000_22) {
        C1414650mut.LJ(awS3S0312000_22.z3, (C1412860ms0) awS3S0312000_22.l0, (C1414650mut) awS3S0312000_22.l1, (AbstractC1412880ms2) awS3S0312000_22.l2, awS3S0312000_22.i4, awS3S0312000_22.i5);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0312000_22 awS3S0312000_22) {
        C1414650mut.LJ(awS3S0312000_22.z3, (C1412860ms0) awS3S0312000_22.l0, (C1414650mut) awS3S0312000_22.l1, (AbstractC1412880ms2) awS3S0312000_22.l2, awS3S0312000_22.i4, awS3S0312000_22.i5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0312000_22(boolean z, C1412860ms0 c1412860ms0, C1414650mut c1414650mut, AbstractC1412880ms2 abstractC1412880ms2, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.z3 = z;
        this.l0 = c1412860ms0;
        this.l1 = c1414650mut;
        this.l2 = abstractC1412880ms2;
        this.i4 = i;
        this.i5 = i2;
    }
}
