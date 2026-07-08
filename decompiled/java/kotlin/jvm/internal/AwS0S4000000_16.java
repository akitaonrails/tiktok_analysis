package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1043500dGG;
import X.C1046800dLa;
import X.C1053250dVz;
import X.C1E1Y;
import X.C2188811AlT;
import X.C2265771DmJ;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS0S4000000_16 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S4000000_16 awS0S4000000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1053250dVz.LIZ.getClass();
        c1023640ckE.withParam(C1053250dVz.LIZJ, awS0S4000000_16.s0);
        c1023640ckE.withParam(C1053250dVz.LIZIZ, awS0S4000000_16.s1);
        c1023640ckE.withParam(C1053250dVz.LIZLLL, awS0S4000000_16.s2);
        c1023640ckE.withParam(C1053250dVz.LJ, awS0S4000000_16.s3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S4000000_16 awS0S4000000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1046800dLa.LIZ.getClass();
        c1023640ckE.withParam(C1046800dLa.LJ, awS0S4000000_16.s0);
        C1002190cBd c1002190cBd = C1046800dLa.LJIIIZ;
        String str = awS0S4000000_16.s1;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1023640ckE.withParam(c1002190cBd, str);
        C1002190cBd c1002190cBd2 = C1046800dLa.LJIIJ;
        String str3 = awS0S4000000_16.s2;
        if (str3 != null) {
            str2 = str3;
        }
        c1023640ckE.withParam(c1002190cBd2, str2);
        c1023640ckE.withParam(C1046800dLa.LJFF, awS0S4000000_16.s3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS0S4000000_16 awS0S4000000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265771DmJ.LIZ.getClass();
        c1023640ckE.withParam(C2265771DmJ.LJIIJJI, awS0S4000000_16.s0);
        c1023640ckE.withParam(C2265771DmJ.LJIIJ, awS0S4000000_16.s1);
        c1023640ckE.withParam(C2265771DmJ.LJJIFFI, awS0S4000000_16.s2);
        c1023640ckE.withParam(C2265771DmJ.LJIILL, awS0S4000000_16.s3);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS0S4000000_16 awS0S4000000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJZL, awS0S4000000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LL, awS0S4000000_16.s1);
        c1023640ckE.withParam(C1043500dGG.LLD, awS0S4000000_16.s2);
        c1023640ckE.withParam(C1043500dGG.LJJII, awS0S4000000_16.s3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS0S4000000_16 awS0S4000000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1E1Y.LIZ.getClass();
        C1002190cBd c1002190cBd = C1E1Y.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check_subdomain_failed_");
        sbLIZ.append(awS0S4000000_16.s0);
        c1023640ckE.withParam(c1002190cBd, C2188811AlT.LIZIZ(sbLIZ));
        c1023640ckE.withParam(C1E1Y.LJJIJL, awS0S4000000_16.s1);
        c1023640ckE.withParam(C1E1Y.LIZLLL, awS0S4000000_16.s2);
        c1023640ckE.withParam(C1E1Y.LJ, awS0S4000000_16.s3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S4000000_16(String str, String str2, String str3, String str4, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
    }
}
