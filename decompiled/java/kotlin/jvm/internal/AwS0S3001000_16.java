package kotlin.jvm.internal;

import X.C09AY;
import X.C1018070cbF;
import X.C1023640ckE;
import X.C1046980dLs;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS0S3001000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS0S3001000_16 awS0S3001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1046980dLs.LIZ.getClass();
        c1023640ckE.withParam(C1046980dLs.LJIIIZ, awS0S3001000_16.s0);
        c1023640ckE.withParam(C1046980dLs.LJIIJ, awS0S3001000_16.s1);
        c1023640ckE.withParam(C1046980dLs.LJIIIIZZ, awS0S3001000_16.s2);
        c1023640ckE.withParam(C1046980dLs.LJIILJJIL, Long.valueOf(awS0S3001000_16.i3));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S3001000_16 awS0S3001000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1018070cbF.LIZ.getClass();
        c1023640ckE.withContext(C1018070cbF.LIZLLL, awS0S3001000_16.s0);
        c1023640ckE.withContext(C1018070cbF.LJFF, awS0S3001000_16.s1);
        c1023640ckE.withParam(C1018070cbF.LJI, Integer.valueOf(awS0S3001000_16.i3));
        c1023640ckE.withParam(C1018070cbF.LJII, awS0S3001000_16.s2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3001000_16(String str, String str2, int i, String str3, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
        this.s2 = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3001000_16(String str, String str2, String str3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.i3 = i;
    }
}
