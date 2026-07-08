package kotlin.jvm.internal;

import X.C09AY;
import X.C0WOV;
import X.C1002190cBd;
import X.C1015030cWL;
import X.C1023640ckE;
import X.C1037010d5n;
import X.C1042690dEx;
import X.C259800zU;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS68S0210000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AwS68S0210000_16 awS68S0210000_16, Object obj) {
        String str;
        String webUrl;
        String creativeIdStr;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1042690dEx.LIZ.getClass();
        c1023640ckE.withParam(C1042690dEx.LJJJJI, "hit");
        c1023640ckE.withParam(C1042690dEx.LJJJJJL, ((C259800zU) awS68S0210000_16.l0).element);
        C1002190cBd c1002190cBd = C1042690dEx.LJJJJIZL;
        C1037010d5n.LIZ.getClass();
        c1023640ckE.withParam(c1002190cBd, C1037010d5n.LIZJ());
        C1002190cBd c1002190cBd2 = C1042690dEx.LJJJJL;
        if (awS68S0210000_16.z2) {
            str = "third";
        } else {
            str = "first";
        }
        c1023640ckE.withParam(c1002190cBd2, str);
        C1002190cBd c1002190cBd3 = C1042690dEx.LJJL;
        AwemeRawAd awemeRawAd = (AwemeRawAd) awS68S0210000_16.l1;
        String str2 = "";
        if (awemeRawAd == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
            webUrl = "";
        }
        c1023640ckE.withParam(c1002190cBd3, webUrl);
        C1002190cBd c1002190cBd4 = C1042690dEx.LJJJLL;
        AwemeRawAd awemeRawAd2 = (AwemeRawAd) awS68S0210000_16.l1;
        if (awemeRawAd2 != null && (creativeIdStr = awemeRawAd2.getCreativeIdStr()) != null) {
            str2 = creativeIdStr;
        }
        c1023640ckE.withParam(c1002190cBd4, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS68S0210000_16 awS68S0210000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1015030cWL.LIZ.getClass();
        c1023640ckE.withParam(C1015030cWL.LIZIZ, Long.valueOf(((AnoleComponentModel) awS68S0210000_16.l0).getID()));
        c1023640ckE.withParam(C1015030cWL.LIZJ, ((AnoleComponentModel) awS68S0210000_16.l0).type);
        c1023640ckE.withParam(C1015030cWL.LIZLLL, Boolean.valueOf(awS68S0210000_16.z2));
        c1023640ckE.withParam(C1015030cWL.LJ, ((C0WOV) awS68S0210000_16.l1).name());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS68S0210000_16(C259800zU c259800zU, C259800zU<String> c259800zU2, boolean z, AwemeRawAd awemeRawAd) {
        super(1);
        this.$t = awemeRawAd;
        this.l0 = c259800zU;
        this.z2 = c259800zU2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0210000_16(AnoleComponentModel anoleComponentModel, boolean z, C0WOV c0wov, int i) {
        super(1);
        this.$t = i;
        this.l0 = anoleComponentModel;
        this.z2 = z;
        this.l1 = c0wov;
    }
}
