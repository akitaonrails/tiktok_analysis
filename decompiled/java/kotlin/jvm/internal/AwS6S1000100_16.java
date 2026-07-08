package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1040110dAn;
import X.C1040440dBK;
import X.C1047590dMr;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS6S1000100_16 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public String s0;

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

    public static final Object invoke$0(AwS6S1000100_16 awS6S1000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1047590dMr.LIZ.getClass();
        c1023640ckE.withParam(C1047590dMr.LJIIIZ, awS6S1000100_16.s0);
        c1023640ckE.withParam(C1047590dMr.LIZLLL, Long.valueOf(awS6S1000100_16.j1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S1000100_16 awS6S1000100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040440dBK.LIZ.getClass();
        c1023640ckE.withParam(C1040440dBK.LIZIZ, "AI_AUTOFILL");
        c1023640ckE.withParam(C1040440dBK.LIZJ, 0L);
        c1023640ckE.withParam(C1040440dBK.LIZLLL, "exception");
        c1023640ckE.withParam(C1040440dBK.LJ, awS6S1000100_16.s0);
        c1023640ckE.withParam(C1040440dBK.LJFF, C1040110dAn.LLILZIL.LIZJ(awS6S1000100_16.j1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S1000100_16(String str, long j, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
