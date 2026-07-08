package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C2249171D1n;
import X.C2250091D5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS45S0000100_35 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0000100_35(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS45S0000100_35 awS45S0000100_35, Object obj) {
        C2249171D1n.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C2249171D1n.LIZLLL, Long.valueOf(awS45S0000100_35.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S0000100_35 awS45S0000100_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2250091D5b.LIZ.getClass();
        c1023640ckE.withParam(C2250091D5b.LJIIIIZZ, 1);
        c1023640ckE.withParam(C2250091D5b.LIZIZ, String.valueOf(awS45S0000100_35.j0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS45S0000100_35 awS45S0000100_35, Object obj) {
        C2250091D5b.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C2250091D5b.LIZIZ, String.valueOf(awS45S0000100_35.j0));
        return Unit.LIZ;
    }
}
