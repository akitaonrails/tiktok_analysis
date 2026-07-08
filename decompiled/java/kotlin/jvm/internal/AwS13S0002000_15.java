package kotlin.jvm.internal;

import X.C09AY;
import X.C948130amR;
import X.C948300ami;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS13S0002000_15 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f955i0;
    public int i1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS13S0002000_15 awS13S0002000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, awS13S0002000_15.f955i0, false, awS13S0002000_15.i1, true, false, 37), 0, 6);
    }

    public static final Object invoke$1(AwS13S0002000_15 awS13S0002000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, awS13S0002000_15.f955i0, false, awS13S0002000_15.i1, false, false, 37), 0, 6);
    }

    public static final Object invoke$2(AwS13S0002000_15 awS13S0002000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, awS13S0002000_15.f955i0, false, awS13S0002000_15.i1, false, false, 37), 0, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0002000_15(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f955i0 = i;
        this.i1 = i2;
    }
}
