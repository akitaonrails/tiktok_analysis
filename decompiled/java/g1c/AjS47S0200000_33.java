package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C1038660d8S;
import X.C1075640e66;
import X.C1389890mGx;
import X.C1865890yeh;
import X.C19EG;
import X.C20546015aU;
import X.C724240Sb0;
import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCard;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist.HighlightCardCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.ui.SearchTop1InteractionAssem;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.web.share.model.SearchShareUIConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AjS47S0200000_33 extends AbstractViewOnClickListenerC420730Ged {
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
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AjS47S0200000_33 ajS47S0200000_33, View view) {
        String strInvoke;
        C1865890yeh c1865890yehTp;
        Function0<Boolean> function0;
        Function0<String> function02;
        Function0<String> function03;
        if (view != null) {
            Object value = ((SearchTop1InteractionAssem) ajS47S0200000_33.l0).LLJLILLLLZIIL.getValue();
            Map<String, String> mapOp = ((SearchTop1InteractionAssem) ajS47S0200000_33.l0).op();
            value.getClass();
            C20546015aU.LIZ("click_share", mapOp);
            C1865890yeh c1865890yehTp2 = ((SearchTop1InteractionAssem) ajS47S0200000_33.l0).tp();
            String strInvoke2 = null;
            if (c1865890yehTp2 != null && (function03 = c1865890yehTp2.LLILZ) != null) {
                strInvoke = function03.invoke();
            } else {
                strInvoke = null;
            }
            if ((strInvoke == null || strInvoke.length() == 0) && (c1865890yehTp = ((SearchTop1InteractionAssem) ajS47S0200000_33.l0).tp()) != null && (function0 = c1865890yehTp.LLILZIL) != null && function0.invoke().booleanValue()) {
                C1389890mGx c1389890mGx = new C1389890mGx((View) ajS47S0200000_33.l1);
                c1389890mGx.LJIIIZ(2131850680);
                c1389890mGx.LJIIJJI();
                return;
            }
            C1865890yeh c1865890yehTp3 = ((SearchTop1InteractionAssem) ajS47S0200000_33.l0).tp();
            if (c1865890yehTp3 != null && (function02 = c1865890yehTp3.LLILZ) != null) {
                strInvoke2 = function02.invoke();
            }
            C19EG c19egLIZ = C724240Sb0.LIZ((SearchTop1InteractionAssem) ajS47S0200000_33.l0);
            if (c19egLIZ == null) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            ShareH5Service shareH5ServiceLIZ = C1038660d8S.LIZ();
            SearchShareUIConfig searchShareUIConfig = new SearchShareUIConfig(1, 1);
            Gson gson = (Gson) ((SearchTop1InteractionAssem) ajS47S0200000_33.l0).LLJLLL.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(((SearchTop1InteractionAssem) ajS47S0200000_33.l0).op());
            linkedHashMap.put("is_search_scene", CardStruct.IStatusCode.DEFAULT);
            shareH5ServiceLIZ.LJIILLIIL(c19egLIZ, new C1075640e66(null, null, null, null, null, GsonProtectorUtils.toJson(gson, linkedHashMap), searchShareUIConfig, strInvoke2, null, 287));
        }
    }

    public static final void LIZ$1(AjS47S0200000_33 ajS47S0200000_33, View view) {
        if (view != null) {
            HighlightsListViewModel highlightsListViewModelN5 = ((HighlightCardCell) ajS47S0200000_33.l0).N5();
            HighlightCard highlightCard = (HighlightCard) ajS47S0200000_33.l1;
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((HighlightCardCell) ajS47S0200000_33.l0, 4110);
            int iHashCode = highlightCard.hashCode();
            if (highlightsListViewModelN5.LLJILJIL.contains(Integer.valueOf(iHashCode))) {
                highlightsListViewModelN5.LLJILJIL.remove(Integer.valueOf(iHashCode));
                HighlightsListViewModel.yQ2(highlightsListViewModelN5, "click_see_less", null, null, 14);
            } else {
                highlightsListViewModelN5.LLJILJIL.add(Integer.valueOf(iHashCode));
                HighlightsListViewModel.yQ2(highlightsListViewModelN5, "click_see_more", null, null, 14);
            }
            awS577S0100000_33.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.1A0s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(g1c.AjS47S0200000_33 r15, android.view.View r16) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g1c.AjS47S0200000_33.LIZ$2(g1c.AjS47S0200000_33, android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS47S0200000_33(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
