package kotlin.jvm.internal;

import X.AbstractC20187113yn;
import X.C09AY;
import X.C145Y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS24S1110000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

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

    public static final Object invoke$0(AwS24S1110000_30 awS24S1110000_30) {
        ((AbstractC20187113yn) awS24S1110000_30.l1).LIZLLL(awS24S1110000_30.s0, awS24S1110000_30.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S1110000_30 awS24S1110000_30) {
        C145Y c145y = (C145Y) awS24S1110000_30.l1;
        if (c145y != null) {
            c145y.LIZJ(awS24S1110000_30.s0, awS24S1110000_30.z2);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$2(AwS24S1110000_30 awS24S1110000_30) {
        AbstractC20187113yn abstractC20187113yn = (AbstractC20187113yn) awS24S1110000_30.l1;
        if (abstractC20187113yn != null) {
            abstractC20187113yn.LIZLLL(awS24S1110000_30.s0, awS24S1110000_30.z2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1110000_30(AbstractC20187113yn abstractC20187113yn, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC20187113yn;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S1110000_30(C145Y c145y, String str, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = c145y;
        this.s0 = str;
        this.z2 = z;
    }
}
