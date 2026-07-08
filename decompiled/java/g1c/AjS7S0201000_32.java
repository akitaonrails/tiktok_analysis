package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.AnonymousClass1830;
import X.C182N;
import X.C183I;
import X.C18PU;
import X.C18QB;
import X.C212203182n;
import X.C212208182s;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.model.BcmStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public class AjS7S0201000_32 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS7S0201000_32 ajS7S0201000_32, View view) throws JSONException {
        Map<String, String> mapH0;
        if (view != null) {
            C212203182n c212203182n = (C212203182n) ajS7S0201000_32.l0;
            C212208182s c212208182s = c212203182n.LLJIJIL;
            String strE0 = null;
            if (c212208182s != null) {
                AnonymousClass1830 anonymousClass1830 = c212203182n.LLILZ;
                if (anonymousClass1830 != null) {
                    mapH0 = anonymousClass1830.h0(null);
                } else {
                    mapH0 = null;
                }
                c212208182s.LIZJ(ajS7S0201000_32.i2, mapH0);
            }
            C212203182n c212203182n2 = (C212203182n) ajS7S0201000_32.l0;
            Function1<? super C183I, Unit> function1 = c212203182n2.LLIZLLLIL;
            if (function1 != null) {
                BcmStandardTrack bcmStandardTrackLIZ = ((C182N) ajS7S0201000_32.l1).LIZ(c212203182n2.LIZJ(view));
                AnonymousClass1830 anonymousClass18302 = ((C212203182n) ajS7S0201000_32.l0).LLILZ;
                if (anonymousClass18302 != null) {
                    strE0 = anonymousClass18302.e0(view);
                }
                function1.invoke(new C183I(view, bcmStandardTrackLIZ, strE0));
            }
        }
    }

    public static final void LIZ$1(AjS7S0201000_32 ajS7S0201000_32, View view) {
        C18QB c18qb;
        if (view != null && (c18qb = (C18QB) ajS7S0201000_32.l0) != null) {
            c18qb.LIZIZ(ajS7S0201000_32.i2, (EcUgProduct) ajS7S0201000_32.l1, C18PU.BENEFIT_IMPACT_VSA_CARD_PRODUCT);
        }
    }

    public static final void LIZ$2(AjS7S0201000_32 ajS7S0201000_32, View view) {
        C18QB c18qb;
        if (view != null && (c18qb = (C18QB) ajS7S0201000_32.l0) != null) {
            c18qb.LIZIZ(ajS7S0201000_32.i2, (EcUgProduct) ajS7S0201000_32.l1, C18PU.SMALL_VSA_CARD_PRODUCT);
        }
    }

    public static final void LIZ$3(AjS7S0201000_32 ajS7S0201000_32, View view) {
        C18QB c18qb;
        if (view != null && (c18qb = (C18QB) ajS7S0201000_32.l0) != null) {
            c18qb.LIZIZ(ajS7S0201000_32.i2, (EcUgProduct) ajS7S0201000_32.l1, C18PU.LARGE_VSA_CARD_PRODUCT);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS7S0201000_32(Object obj, int i, Object obj2, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
