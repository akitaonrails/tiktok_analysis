package kotlin.jvm.internal;

import X.C09AY;
import X.C912350Zqj;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS57S0001000_14 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1015i0;

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

    public static final Object invoke$0(AwS57S0001000_14 awS57S0001000_14) {
        return new C912350Zqj(awS57S0001000_14.f1015i0);
    }

    public static final Object invoke$1(AwS57S0001000_14 awS57S0001000_14) {
        return new C912350Zqj(awS57S0001000_14.f1015i0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S0001000_14(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1015i0 = i;
    }
}
