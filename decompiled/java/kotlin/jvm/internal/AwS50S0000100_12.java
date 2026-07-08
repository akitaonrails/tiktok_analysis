package kotlin.jvm.internal;

import X.C09AY;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS50S0000100_12 extends C09AY implements Function0 {
    public final int $t;
    public long j0;

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
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 >= 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 >= 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 >= 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AwS50S0000100_12 awS50S0000100_12) {
        boolean z;
        if (awS50S0000100_12.j0 != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS50S0000100_12(long j, int i) {
        super(0);
        this.$t = i;
        this.j0 = j;
    }
}
