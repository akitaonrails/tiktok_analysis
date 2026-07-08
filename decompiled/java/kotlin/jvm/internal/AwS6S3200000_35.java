package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1015310cWn;
import X.C1015450cX1;
import X.C1023640ckE;
import X.C1043600dGQ;
import X.C1043630dGT;
import X.C2274391E0n;
import X.C2275891E6h;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS6S3200000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS6S3200000_35 awS6S3200000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2274391E0n.LIZ.getClass();
        c1023640ckE.withParam(C2274391E0n.LJI, ((C1043630dGT) awS6S3200000_35.l3).LIZ);
        c1023640ckE.withParam(C2274391E0n.LJ, ((C1043630dGT) awS6S3200000_35.l3).LIZ);
        c1023640ckE.withParam(C2274391E0n.LJFF, ((C1043630dGT) awS6S3200000_35.l3).LIZIZ);
        c1023640ckE.withParam(C2274391E0n.LIZLLL, ((C1043630dGT) awS6S3200000_35.l3).LIZLLL);
        c1023640ckE.withParam(C2274391E0n.LJIIIIZZ, awS6S3200000_35.s0);
        c1023640ckE.withParam(C2274391E0n.LJIIL, awS6S3200000_35.s1);
        c1023640ckE.withParam(C2274391E0n.LJIILIIL, awS6S3200000_35.s2);
        C1002190cBd c1002190cBd = C2274391E0n.LJII;
        C1043600dGQ c1043600dGQ = (C1043600dGQ) awS6S3200000_35.l4;
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(c1043600dGQ.LIZLLL - c1043600dGQ.LIZJ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S3200000_35 awS6S3200000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2275891E6h.LIZ.getClass();
        c1023640ckE.withParam(C2275891E6h.LIZJ, Long.valueOf(((AnoleComponentModel) awS6S3200000_35.l3).getID()));
        c1023640ckE.withParam(C2275891E6h.LIZLLL, ((AnoleComponentModel) awS6S3200000_35.l3).type);
        c1023640ckE.withParam(C2275891E6h.LJFF, awS6S3200000_35.s0);
        c1023640ckE.withParam(C2275891E6h.LJ, C1015310cWn.LJJIIZ((AnoleComponentModel) awS6S3200000_35.l3));
        c1023640ckE.withParam(C2275891E6h.LJIJ, awS6S3200000_35.s1);
        c1023640ckE.withParam(C2275891E6h.LJJIJL, awS6S3200000_35.s2);
        c1023640ckE.withParam(C2275891E6h.LJJIJLIJ, ((AnoleComponentModel) awS6S3200000_35.l3).containerType);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS6S3200000_35 awS6S3200000_35, Object obj) {
        String string;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2275891E6h.LIZ.getClass();
        c1023640ckE.withParam(C2275891E6h.LIZJ, Long.valueOf(((AnoleComponentModel) awS6S3200000_35.l3).getID()));
        c1023640ckE.withParam(C2275891E6h.LIZLLL, ((AnoleComponentModel) awS6S3200000_35.l3).type);
        c1023640ckE.withParam(C2275891E6h.LJ, C1015310cWn.LJJIIZ((AnoleComponentModel) awS6S3200000_35.l3));
        C1002190cBd c1002190cBd = C2275891E6h.LJIIIZ;
        C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
        AnoleComponentModel anoleComponentModel = (AnoleComponentModel) awS6S3200000_35.l3;
        c1015450cX1.getClass();
        Integer numLJ = C1015450cX1.LJ(anoleComponentModel);
        Long lValueOf = null;
        if (numLJ != null) {
            string = numLJ.toString();
        } else {
            string = null;
        }
        c1023640ckE.withParam(c1002190cBd, string);
        c1023640ckE.withParam(C2275891E6h.LJIIJ, C1015450cX1.LJFF((AnoleComponentModel) awS6S3200000_35.l3));
        c1023640ckE.withParam(C2275891E6h.LJIIJJI, C1015450cX1.LJI((AnoleComponentModel) awS6S3200000_35.l3));
        C1002190cBd c1002190cBd2 = C2275891E6h.LJIIL;
        if (C1015450cX1.LIZJ((AnoleComponentModel) awS6S3200000_35.l3) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        }
        c1023640ckE.withParam(c1002190cBd2, lValueOf);
        c1023640ckE.withParam(C2275891E6h.LJIILIIL, C1015450cX1.LIZLLL((AnoleComponentModel) awS6S3200000_35.l3));
        c1023640ckE.withParam(C2275891E6h.LJIJ, awS6S3200000_35.s0);
        c1023640ckE.withParam(C2275891E6h.LJJIJL, awS6S3200000_35.s1);
        c1023640ckE.withParam(C2275891E6h.LJIILJJIL, C1015450cX1.LJIIIZ((AnoleComponentModel) awS6S3200000_35.l3));
        c1023640ckE.withParam(C2275891E6h.LJI, awS6S3200000_35.s2);
        c1023640ckE.withParam(C2275891E6h.LJJIJLIJ, ((AnoleComponentModel) awS6S3200000_35.l3).containerType);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3200000_35(AnoleComponentModel anoleComponentModel, C1015310cWn c1015310cWn, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l3 = anoleComponentModel;
        this.s0 = "1";
        this.l4 = c1015310cWn;
        this.s1 = str;
        this.s2 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3200000_35(C1043630dGT c1043630dGT, String str, String str2, String str3, C1043600dGQ c1043600dGQ, int i) {
        super(1);
        this.$t = i;
        this.l3 = c1043630dGT;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = c1043600dGQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3200000_35(AnoleComponentModel anoleComponentModel, C1015310cWn c1015310cWn, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = anoleComponentModel;
        this.l4 = c1015310cWn;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
