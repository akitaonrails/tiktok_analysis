package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1015290cWl;
import X.C1015400cWw;
import X.C1023640ckE;
import X.C2273201DyI;
import X.C2275911E6j;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS6S3400000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
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

    public static final Object invoke$0(AwS6S3400000_35 awS6S3400000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS6S3400000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LJI, awS6S3400000_35.s1);
        c1023640ckE.withParam(C2273201DyI.LJIIJ, (Long) awS6S3400000_35.l3);
        c1023640ckE.withParam(C2273201DyI.LJIIJJI, (Long) awS6S3400000_35.l4);
        c1023640ckE.withParam(C2273201DyI.LJIIL, (Long) awS6S3400000_35.l5);
        c1023640ckE.withParam(C2273201DyI.LJIILIIL, awS6S3400000_35.s2);
        c1023640ckE.withParam(C2273201DyI.LJIILJJIL, (Long) awS6S3400000_35.l6);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS6S3400000_35 awS6S3400000_35, Object obj) {
        Long lValueOf;
        String string;
        Long creativeId;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2275911E6j.LIZ.getClass();
        c1023640ckE.withParam(C2275911E6j.LIZJ, Long.valueOf(((AnoleComponentModel) awS6S3400000_35.l3).getID()));
        c1023640ckE.withParam(C2275911E6j.LIZLLL, ((AnoleComponentModel) awS6S3400000_35.l3).type);
        c1023640ckE.withParam(C2275911E6j.LJ, C1015290cWl.LJJIIZ((AnoleComponentModel) awS6S3400000_35.l3));
        c1023640ckE.withParam(C2275911E6j.LJIIIZ, awS6S3400000_35.s0);
        C1002190cBd c1002190cBd = C2275911E6j.LJIIZILJ;
        if (((Integer) awS6S3400000_35.l5) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd, lValueOf);
        c1023640ckE.withParam(C2275911E6j.LJIJI, awS6S3400000_35.s1);
        c1023640ckE.withParam(C2275911E6j.LJJIZ, awS6S3400000_35.s2);
        C1002190cBd c1002190cBd2 = C2275911E6j.LJJIL;
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        AwemeRawAd awemeRawAd = (AwemeRawAd) awS6S3400000_35.l6;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str = ((AnoleComponentModel) awS6S3400000_35.l3).type;
        c1015400cWw.getClass();
        c1023640ckE.withParam(c1002190cBd2, C1015400cWw.LIZ(string, str).isFallBackRendering);
        c1023640ckE.withParam(C2275911E6j.LJJJ, ((AnoleComponentModel) awS6S3400000_35.l3).containerType);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3400000_35(AnoleComponentModel anoleComponentModel, C1015290cWl c1015290cWl, String str, Integer num, String str2, String str3, AwemeRawAd awemeRawAd, int i) {
        super(1);
        this.$t = i;
        this.l3 = anoleComponentModel;
        this.l4 = c1015290cWl;
        this.s0 = str;
        this.l5 = num;
        this.s1 = str2;
        this.s2 = str3;
        this.l6 = awemeRawAd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S3400000_35(String str, String str2, Long l, Long l2, Long l3, String str3, Long l4, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = l;
        this.l4 = l2;
        this.l5 = l3;
        this.s2 = str3;
        this.l6 = l4;
    }
}
