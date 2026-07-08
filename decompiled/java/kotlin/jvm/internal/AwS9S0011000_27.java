package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1850340yFc;
import X.C1853320yKQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS9S0011000_27 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public boolean z0;

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

    public static final Object invoke$0(AwS9S0011000_27 awS9S0011000_27, Object obj) {
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1850340yFc.LIZ.getClass();
        c1023640ckE.withParam(C1850340yFc.LIZIZ, Long.valueOf(awS9S0011000_27.i1));
        C1002190cBd c1002190cBd = C1850340yFc.LIZJ;
        if (awS9S0011000_27.z0) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(j));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0011000_27 awS9S0011000_27, Object obj) {
        return C1853320yKQ.LIZ((C1853320yKQ) obj, null, null, null, null, null, null, null, null, awS9S0011000_27.i1, awS9S0011000_27.z0, 511);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0011000_27(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }
}
