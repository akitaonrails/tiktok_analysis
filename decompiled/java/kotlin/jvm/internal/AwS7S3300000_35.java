package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1015290cWl;
import X.C1015400cWw;
import X.C1023640ckE;
import X.C19KZ;
import X.C2265371Dlf;
import X.C2275911E6j;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS7S3300000_35 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
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

    public static final Object invoke$0(AwS7S3300000_35 awS7S3300000_35, Object obj) {
        String string;
        Long creativeId;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2275911E6j.LIZ.getClass();
        c1023640ckE.withParam(C2275911E6j.LIZJ, Long.valueOf(((AnoleComponentModel) awS7S3300000_35.l3).getID()));
        c1023640ckE.withParam(C2275911E6j.LIZLLL, ((AnoleComponentModel) awS7S3300000_35.l3).type);
        c1023640ckE.withParam(C2275911E6j.LJ, C1015290cWl.LJJIIZ((AnoleComponentModel) awS7S3300000_35.l3));
        c1023640ckE.withParam(C2275911E6j.LJFF, awS7S3300000_35.s0);
        c1023640ckE.withParam(C2275911E6j.LJIJI, awS7S3300000_35.s1);
        c1023640ckE.withParam(C2275911E6j.LJJIZ, awS7S3300000_35.s2);
        C1002190cBd c1002190cBd = C2275911E6j.LJJIL;
        C1015400cWw c1015400cWw = C1015400cWw.LIZ;
        AwemeRawAd awemeRawAd = (AwemeRawAd) awS7S3300000_35.l5;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null || (string = creativeId.toString()) == null) {
            string = "";
        }
        String str = ((AnoleComponentModel) awS7S3300000_35.l3).type;
        c1015400cWw.getClass();
        c1023640ckE.withParam(c1002190cBd, C1015400cWw.LIZ(string, str).isFallBackRendering);
        c1023640ckE.withParam(C2275911E6j.LJJJ, ((AnoleComponentModel) awS7S3300000_35.l3).containerType);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S3300000_35 awS7S3300000_35, Object obj) {
        String trackingName;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2265371Dlf.LIZ.getClass();
        c1023640ckE.withParam(C2265371Dlf.LIZIZ, awS7S3300000_35.s0);
        c1023640ckE.withParam(C2265371Dlf.LIZJ, "ads_activity_history");
        c1023640ckE.withParam(C2265371Dlf.LIZLLL, awS7S3300000_35.s1);
        c1023640ckE.withParam(C2265371Dlf.LJ, awS7S3300000_35.s2);
        c1023640ckE.withParam(C2265371Dlf.LJII, ((C19KZ) awS7S3300000_35.l3).getTrackingName());
        C1002190cBd c1002190cBd = C2265371Dlf.LJIIIIZZ;
        C19KZ c19kz = (C19KZ) awS7S3300000_35.l4;
        if (c19kz != null) {
            trackingName = c19kz.getTrackingName();
        } else {
            trackingName = null;
        }
        c1023640ckE.withParam(c1002190cBd, trackingName);
        c1023640ckE.withParam(C2265371Dlf.LJIIIZ, (Long) awS7S3300000_35.l5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3300000_35(C19KZ c19kz, C19KZ c19kz2, Long l, String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = c19kz;
        this.l4 = c19kz2;
        this.l5 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S3300000_35(AnoleComponentModel anoleComponentModel, C1015290cWl c1015290cWl, String str, String str2, String str3, AwemeRawAd awemeRawAd, int i) {
        super(1);
        this.$t = i;
        this.l3 = anoleComponentModel;
        this.l4 = c1015290cWl;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l5 = awemeRawAd;
    }
}
