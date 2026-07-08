package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1038500d8C;
import X.C1038510d8D;
import X.C1053250dVz;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS4S0000200_16 extends C09AY implements Function1 {
    public final int $t;
    public long j0;
    public long j1;

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

    public static final Object invoke$0(AwS4S0000200_16 awS4S0000200_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1038510d8D.LIZ.getClass();
        c1023640ckE.withParam(C1038510d8D.LIZIZ, Long.valueOf(awS4S0000200_16.j0));
        C1038500d8C.LIZ.getClass();
        c1023640ckE.withParam(C1038500d8C.LIZLLL, Long.valueOf(awS4S0000200_16.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0000200_16 awS4S0000200_16, Object obj) {
        C1053250dVz.LIZ.getClass();
        ((C1023640ckE) obj).withParam(C1053250dVz.LJFF, Double.valueOf(awS4S0000200_16.j0 - awS4S0000200_16.j1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0000200_16(long j, long j2, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
        this.j1 = j2;
    }
}
