package kotlin.jvm.internal;

import X.C09AY;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS57S0000100_33 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

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

    public static final Object invoke$0(AwS57S0000100_33 awS57S0000100_33) {
        boolean z;
        if (awS57S0000100_33.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS57S0000100_33 awS57S0000100_33) {
        boolean z;
        if (awS57S0000100_33.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0000100_33(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
