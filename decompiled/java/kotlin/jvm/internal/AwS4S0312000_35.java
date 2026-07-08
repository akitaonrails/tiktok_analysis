package kotlin.jvm.internal;

import X.AbstractC1446660nkW;
import X.C09AY;
import X.C2280651EOp;
import X.C2280661EOq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class AwS4S0312000_35 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS4S0312000_35 awS4S0312000_35) {
        AbstractC1446660nkW abstractC1446660nkWLJI = ((C2280661EOq) awS4S0312000_35.l0).LJI();
        if (abstractC1446660nkWLJI != null) {
            abstractC1446660nkWLJI.LJFF(awS4S0312000_35.l1, awS4S0312000_35.l2, awS4S0312000_35.z3, awS4S0312000_35.i4, awS4S0312000_35.i5);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0312000_35 awS4S0312000_35) {
        AbstractC1446660nkW abstractC1446660nkW = ((C2280651EOp) awS4S0312000_35.l0).LJ;
        if (abstractC1446660nkW != null) {
            abstractC1446660nkW.LJFF(awS4S0312000_35.l1, awS4S0312000_35.l2, awS4S0312000_35.z3, awS4S0312000_35.i4, awS4S0312000_35.i5);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0312000_35(C2280651EOp c2280651EOp, Object obj, Object obj2, boolean z, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c2280651EOp;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
        this.i4 = i;
        this.i5 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0312000_35(C2280661EOq c2280661EOq, Object obj, Object obj2, boolean z, int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c2280661EOq;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
        this.i4 = i;
        this.i5 = i2;
    }
}
