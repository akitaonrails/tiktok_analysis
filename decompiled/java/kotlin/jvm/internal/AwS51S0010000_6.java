package kotlin.jvm.internal;

import X.C09AY;
import X.C426750GoL;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS51S0010000_6 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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

    public static final Object invoke$0(AwS51S0010000_6 awS51S0010000_6) {
        boolean z;
        if ((awS51S0010000_6.z0 && !C426750GoL.LJFF()) || (!awS51S0010000_6.z0 && C426750GoL.LJFF())) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS51S0010000_6 awS51S0010000_6) {
        return Boolean.valueOf(awS51S0010000_6.z0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0010000_6(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
