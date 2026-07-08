package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C2273201DyI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS2S2001000_35 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS2S2001000_35 awS2S2001000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS2S2001000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS2S2001000_35.s1);
        c1023640ckE.withParam(C2273201DyI.LJFF, Integer.valueOf(awS2S2001000_35.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2001000_35 awS2S2001000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS2S2001000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS2S2001000_35.s1);
        c1023640ckE.withParam(C2273201DyI.LJFF, Integer.valueOf(awS2S2001000_35.i2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S2001000_35 awS2S2001000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZ, Integer.valueOf(awS2S2001000_35.i2));
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS2S2001000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS2S2001000_35.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2001000_35(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.i2 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2001000_35(int i, String str, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
