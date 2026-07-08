package kotlin.jvm.internal;

import X.C09AY;
import X.C1009990cOD;
import X.C1023640ckE;
import X.C2266271Dn7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS0S2001000_16 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S2001000_16 awS0S2001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1009990cOD.LIZ.getClass();
        c1023640ckE.withParam(C1009990cOD.LJJIL, String.valueOf(awS0S2001000_16.i2));
        c1023640ckE.withParam(C1009990cOD.LJJIZ, awS0S2001000_16.s0);
        c1023640ckE.withParam(C1009990cOD.LJJI, awS0S2001000_16.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S2001000_16 awS0S2001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2266271Dn7.LIZ.getClass();
        c1023640ckE.withParam(C2266271Dn7.LIZIZ, awS0S2001000_16.s0);
        c1023640ckE.withParam(C2266271Dn7.LIZJ, awS0S2001000_16.s1);
        c1023640ckE.withParam(C2266271Dn7.LIZLLL, Long.valueOf(awS0S2001000_16.i2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2001000_16(int i, String str, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S2001000_16(String str, String str2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i2 = i;
    }
}
