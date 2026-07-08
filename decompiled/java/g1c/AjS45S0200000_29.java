package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C19471811Ga;
import X.C2097608Jq;
import X.C675940QfI;
import X.C675950QfJ;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class AjS45S0200000_29 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS45S0200000_29 ajS45S0200000_29, View view) {
        String str;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        if (view != null) {
            ((Function0) ajS45S0200000_29.l0).invoke();
            C19471811Ga.LIZ.getClass();
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZ().storeBoolean("disable_photo_search_new_guide", true);
            PhotoSearchEnterParams photoSearchEnterParams = (PhotoSearchEnterParams) ajS45S0200000_29.l1;
            Pair[] pairArr = new Pair[2];
            if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
                str = "";
            }
            pairArr[0] = new Pair("current_page", str);
            pairArr[1] = new Pair("click_type", "start");
            C675940QfI.LIZJ("photo_search_guidance_click", photoSearchEnterParams, new AwS608S0100000_29(C2097608Jq.LJIIJ(pairArr), (Map<String, String>) 513));
        }
    }

    public static final void LIZ$1(AjS45S0200000_29 ajS45S0200000_29, View view) {
        if (view != null) {
            ((Function1) ajS45S0200000_29.l0).invoke((SysRecommendFeedItem) ajS45S0200000_29.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS45S0200000_29(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
