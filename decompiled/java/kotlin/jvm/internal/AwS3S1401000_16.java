package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1013560cTy;
import X.C1013570cTz;
import X.C1023640ckE;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS3S1401000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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

    public static final Object invoke$0(AwS3S1401000_16 awS3S1401000_16, Object obj) {
        Long lValueOf;
        Long lValueOf2;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1013570cTz.LIZ.getClass();
        C1002190cBd c1002190cBd = C1013570cTz.LIZJ;
        Long lValueOf3 = null;
        if (((Integer) awS3S1401000_16.l1) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd, lValueOf);
        C1002190cBd c1002190cBd2 = C1013570cTz.LIZLLL;
        if (((Integer) awS3S1401000_16.l2) != null) {
            lValueOf2 = Long.valueOf(r0.intValue());
        } else {
            lValueOf2 = null;
        }
        c1023640ckE.withParam(c1002190cBd2, lValueOf2);
        C1002190cBd c1002190cBd3 = C1013570cTz.LJ;
        C1013560cTy c1013560cTy = (C1013560cTy) awS3S1401000_16.l3;
        int i = awS3S1401000_16.i5;
        c1013560cTy.getClass();
        c1023640ckE.withParam(c1002190cBd3, C1013560cTy.LJJIIZ(i));
        c1023640ckE.withParam(C1013570cTz.LJFF, awS3S1401000_16.s0);
        C1002190cBd c1002190cBd4 = C1013570cTz.LIZIZ;
        if (((Integer) awS3S1401000_16.l4) != null) {
            lValueOf3 = Long.valueOf(r0.intValue());
        }
        c1023640ckE.withParam(c1002190cBd4, lValueOf3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S1401000_16 awS3S1401000_16, Object obj) {
        Long lValueOf;
        Long lValueOf2;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1013570cTz.LIZ.getClass();
        C1002190cBd c1002190cBd = C1013570cTz.LIZJ;
        Long lValueOf3 = null;
        if (((Integer) awS3S1401000_16.l1) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd, lValueOf);
        C1002190cBd c1002190cBd2 = C1013570cTz.LIZLLL;
        if (((Integer) awS3S1401000_16.l2) != null) {
            lValueOf2 = Long.valueOf(r0.intValue());
        } else {
            lValueOf2 = null;
        }
        c1023640ckE.withParam(c1002190cBd2, lValueOf2);
        C1002190cBd c1002190cBd3 = C1013570cTz.LJ;
        C1013560cTy c1013560cTy = (C1013560cTy) awS3S1401000_16.l3;
        int i = awS3S1401000_16.i5;
        c1013560cTy.getClass();
        c1023640ckE.withParam(c1002190cBd3, C1013560cTy.LJJIIZ(i));
        c1023640ckE.withParam(C1013570cTz.LJFF, awS3S1401000_16.s0);
        C1002190cBd c1002190cBd4 = C1013570cTz.LIZIZ;
        if (((Integer) awS3S1401000_16.l4) != null) {
            lValueOf3 = Long.valueOf(r0.intValue());
        }
        c1023640ckE.withParam(c1002190cBd4, lValueOf3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S1401000_16(Integer num, Integer num2, C1013560cTy c1013560cTy, int i, String str, Integer num3, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = num;
        this.l2 = num2;
        this.l3 = c1013560cTy;
        this.i5 = i;
        this.s0 = str;
        this.l4 = num3;
    }
}
