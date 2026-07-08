package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C01GW;
import X.C0QER;
import X.C0QXE;
import X.C2097608Jq;
import X.C669590QOf;
import X.C669750QOv;
import X.C683760Qru;
import X.EnumC683800Qry;
import android.view.View;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.ecommerce.search.result.ui.HalfDynamicSearchShopFragment;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.assem.VideoVerticalAssem;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public class AjS3S1100000_10 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final void LIZ$0(AjS3S1100000_10 ajS3S1100000_10, View view) {
        String str;
        String stringOrNullStrategy;
        SearchResultParam searchResultParam;
        C0QER searchEnterParam;
        ECSearchEntranceData ecSearchEntranceData;
        if (view != null) {
            EnumC683800Qry enumC683800Qry = EnumC683800Qry.TT_DSA_SEARCH_CONSENT;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_method", "click_setting"), new Pair("enter_from", ajS3S1100000_10.s0));
            C01GW<C669750QOv> c01gw = C669750QOv.LIZLLL;
            LastSearch lastSearchLIZIZ = C669590QOf.LIZ().LIZIZ();
            if (lastSearchLIZIZ == null || (str = lastSearchLIZIZ.search_id) == null) {
                str = "";
            }
            mapLJIIJ.put("search_id", str);
            C0QXE c0qxe = ((HalfDynamicSearchShopFragment) ajS3S1100000_10.l1).LLIZ;
            if (c0qxe == null || (searchResultParam = c0qxe.searchResultParam) == null || (searchEnterParam = searchResultParam.getSearchEnterParam()) == null || (ecSearchEntranceData = searchEnterParam.getEcSearchEntranceData()) == null || (stringOrNullStrategy = ecSearchEntranceData.getStringOrNullStrategy("page_type")) == null) {
                stringOrNullStrategy = "fyp_seven_tenths_search_page";
            }
            mapLJIIJ.put("page_name", stringOrNullStrategy);
            C683760Qru.LIZJ((HalfDynamicSearchShopFragment) ajS3S1100000_10.l1, enumC683800Qry, mapLJIIJ, new AwS554S0100000_10((HalfDynamicSearchShopFragment) ajS3S1100000_10.l1, 954), new AwS554S0100000_10((HalfDynamicSearchShopFragment) ajS3S1100000_10.l1, 955), true);
        }
    }

    public static final void LIZ$1(AjS3S1100000_10 ajS3S1100000_10, View view) {
        if (view != null) {
            ((VideoVerticalAssem) ajS3S1100000_10.l1).Go(ajS3S1100000_10.s0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS3S1100000_10(Object obj, String str, int i) {
        super(700L);
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
