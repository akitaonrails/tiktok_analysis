package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C2265451Dln;
import X.C2273201DyI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS0S3002000_35 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public int i4;
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
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S3002000_35 awS0S3002000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS0S3002000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS0S3002000_35.s1);
        c1023640ckE.withParam(C2273201DyI.LJI, awS0S3002000_35.s2);
        c1023640ckE.withParam(C2273201DyI.LJII, Integer.valueOf(awS0S3002000_35.i3));
        c1023640ckE.withParam(C2273201DyI.LJIIIZ, Integer.valueOf(awS0S3002000_35.i4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S3002000_35 awS0S3002000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZIZ, Integer.valueOf(awS0S3002000_35.i3));
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS0S3002000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS0S3002000_35.s1);
        c1023640ckE.withParam(C2273201DyI.LJ, awS0S3002000_35.s2);
        c1023640ckE.withParam(C2273201DyI.LJFF, Integer.valueOf(awS0S3002000_35.i4));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S3002000_35 awS0S3002000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZIZ, Integer.valueOf(awS0S3002000_35.i3));
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS0S3002000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS0S3002000_35.s1);
        c1023640ckE.withParam(C2273201DyI.LJ, awS0S3002000_35.s2);
        c1023640ckE.withParam(C2273201DyI.LJFF, Integer.valueOf(awS0S3002000_35.i4));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S3002000_35 awS0S3002000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265451Dln.LIZ.getClass();
        c1023640ckE.withParam(C2265451Dln.LJIIZILJ, Integer.valueOf(awS0S3002000_35.i3));
        c1023640ckE.withParam(C2265451Dln.LJIJ, Integer.valueOf(awS0S3002000_35.i3));
        c1023640ckE.withParam(C2265451Dln.LJIJI, awS0S3002000_35.s0);
        c1023640ckE.withParam(C2265451Dln.LJIJJ, awS0S3002000_35.s1);
        c1023640ckE.withParam(C2265451Dln.LJIJJLI, awS0S3002000_35.s2);
        c1023640ckE.withParam(C2265451Dln.LJIL, Integer.valueOf(awS0S3002000_35.i4));
        c1023640ckE.withParam(C2265451Dln.LJJ, 1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3002000_35(int i, int i2, String str, String str2, String str3, int i3) {
        super(1);
        this.$t = i3;
        this.i3 = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.i4 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3002000_35(String str, String str2, String str3, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.i3 = i;
        this.i4 = i2;
    }
}
