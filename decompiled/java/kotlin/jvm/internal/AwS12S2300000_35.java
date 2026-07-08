package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1015290cWl;
import X.C1015400cWw;
import X.C1023640ckE;
import X.C2275911E6j;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS12S2300000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
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

    public static final Object invoke$0(AwS12S2300000_35 awS12S2300000_35, Object obj) {
        String string;
        Long creativeId;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2275911E6j.LIZ.getClass();
        c1023640ckE.withParam(C2275911E6j.LIZJ, Long.valueOf(((AnoleComponentModel) awS12S2300000_35.l2).getID()));
        c1023640ckE.withParam(C2275911E6j.LIZLLL, ((AnoleComponentModel) awS12S2300000_35.l2).type);
        c1023640ckE.withParam(C2275911E6j.LJ, C1015290cWl.LJJIIZ((AnoleComponentModel) awS12S2300000_35.l2));
        c1023640ckE.withParam(C2275911E6j.LJIJI, awS12S2300000_35.s0);
        c1023640ckE.withParam(C2275911E6j.LJJIZ, awS12S2300000_35.s1);
        C1002190cBd c1002190cBd = C2275911E6j.LJJIL;
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        AwemeRawAd awemeRawAd = (AwemeRawAd) awS12S2300000_35.l4;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str = ((AnoleComponentModel) awS12S2300000_35.l2).type;
        c1015400cWw.getClass();
        c1023640ckE.withParam(c1002190cBd, C1015400cWw.LIZ(string, str).isFallBackRendering);
        c1023640ckE.withParam(C2275911E6j.LJJJ, ((AnoleComponentModel) awS12S2300000_35.l2).containerType);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S2300000_35 awS12S2300000_35, Object obj) {
        String string;
        Long creativeId;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2275911E6j.LIZ.getClass();
        c1023640ckE.withParam(C2275911E6j.LIZJ, Long.valueOf(((AnoleComponentModel) awS12S2300000_35.l2).getID()));
        c1023640ckE.withParam(C2275911E6j.LIZLLL, ((AnoleComponentModel) awS12S2300000_35.l2).type);
        c1023640ckE.withParam(C2275911E6j.LJ, C1015290cWl.LJJIIZ((AnoleComponentModel) awS12S2300000_35.l2));
        c1023640ckE.withParam(C2275911E6j.LJIJI, awS12S2300000_35.s0);
        c1023640ckE.withParam(C2275911E6j.LJJIZ, awS12S2300000_35.s1);
        C1002190cBd c1002190cBd = C2275911E6j.LJJIL;
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        AwemeRawAd awemeRawAd = (AwemeRawAd) awS12S2300000_35.l4;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str = ((AnoleComponentModel) awS12S2300000_35.l2).type;
        c1015400cWw.getClass();
        c1023640ckE.withParam(c1002190cBd, C1015400cWw.LIZ(string, str).isFallBackRendering);
        c1023640ckE.withParam(C2275911E6j.LJJJ, ((AnoleComponentModel) awS12S2300000_35.l2).containerType);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S2300000_35(AnoleComponentModel anoleComponentModel, C1015290cWl c1015290cWl, String str, String str2, AwemeRawAd awemeRawAd, int i) {
        super(1);
        this.$t = i;
        this.l2 = anoleComponentModel;
        this.l3 = c1015290cWl;
        this.s0 = str;
        this.s1 = str2;
        this.l4 = awemeRawAd;
    }
}
