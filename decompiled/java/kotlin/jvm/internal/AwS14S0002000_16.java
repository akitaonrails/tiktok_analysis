package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C2265911DmX;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS14S0002000_16 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f956i0;
    public int i1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS14S0002000_16 awS14S0002000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265911DmX.LIZ.getClass();
        c1023640ckE.withParam(C2265911DmX.LIZIZ, Integer.valueOf(awS14S0002000_16.f956i0));
        c1023640ckE.withParam(C2265911DmX.LIZJ, Integer.valueOf(awS14S0002000_16.i1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS14S0002000_16 awS14S0002000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265911DmX.LIZ.getClass();
        c1023640ckE.withParam(C2265911DmX.LIZIZ, Integer.valueOf(awS14S0002000_16.f956i0));
        c1023640ckE.withParam(C2265911DmX.LIZJ, Integer.valueOf(awS14S0002000_16.i1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS14S0002000_16(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f956i0 = i;
        this.i1 = i2;
    }
}
