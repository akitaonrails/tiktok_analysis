package kotlin.jvm.internal;

import X.C09AY;
import X.C1690050u55;
import X.C1690080u58;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public class AwS25S0002000_25 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f979i0;
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

    public static final Object invoke$0(AwS25S0002000_25 awS25S0002000_25) {
        return new C1690080u58(awS25S0002000_25.f979i0, awS25S0002000_25.i1);
    }

    public static final Object invoke$1(AwS25S0002000_25 awS25S0002000_25) {
        return new C1690050u55(awS25S0002000_25.f979i0, awS25S0002000_25.i1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S0002000_25(int i, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.f979i0 = i;
        this.i1 = i2;
    }
}
