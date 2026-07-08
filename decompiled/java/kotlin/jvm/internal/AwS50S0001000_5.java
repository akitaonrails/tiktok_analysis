package kotlin.jvm.internal;

import X.C09AY;
import X.C390810FTz;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS50S0001000_5 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1008i0;

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

    public static final Object invoke$0(AwS50S0001000_5 awS50S0001000_5) {
        return Integer.valueOf(C390810FTz.LIZ(awS50S0001000_5.f1008i0));
    }

    public static final Object invoke$1(AwS50S0001000_5 awS50S0001000_5) {
        return Integer.valueOf(C390810FTz.LIZ(awS50S0001000_5.f1008i0));
    }

    public static final Object invoke$2(AwS50S0001000_5 awS50S0001000_5) {
        return Integer.valueOf(C390810FTz.LIZ(awS50S0001000_5.f1008i0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0001000_5(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1008i0 = i;
    }
}
