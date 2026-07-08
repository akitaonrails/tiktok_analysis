package com.ss.android.ugc.aweme.ecommerce.search.suggest.api;

import X.C01GW;
import X.C098200Yq;
import X.C0QCT;
import X.C11NZ;
import X.C1389890mGx;
import X.C15O7;
import X.C189200o6;
import X.C20481080p;
import X.C2232408os;
import X.C2286608xc;
import X.C341050DYp;
import X.C452501pT;
import X.C670980QTo;
import X.C671380QVc;
import X.C671410QVf;
import X.C683820Qs0;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501260pAa;
import X.InterfaceC1501300pAe;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickRecommendProductsResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSuggestWordsApi {
    public static final EcSuggestWordsApi LIZ = new EcSuggestWordsApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(108));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(107));

    public interface SuggestApi {
        @InterfaceC1501240pAY("/aweme/v1/search/related_product/ecom/")
        @InterfaceC1501300pAe
        Object fetchClickRecommendProductsData(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("search_id") String str2, @InterfaceC1501100pAK("aweme_index") Integer num, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("search_channel") String str4, @InterfaceC1501100pAK("search_source") String str5, @InterfaceC1501100pAK("shown_count") int i, InterfaceC1364105Vn<? super EcClickRecommendProductsResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/search/clicksug/ecom/")
        @InterfaceC1501300pAe
        Object fetchClickSearchData(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("card_position") String str2, @InterfaceC1501100pAK("card_type") String str3, @InterfaceC1501100pAK("group_card_type") String str4, @InterfaceC1501100pAK("src_id") String str5, @InterfaceC1501100pAK("from_group_id") String str6, @InterfaceC1501100pAK("ecom_user_actions") String str7, @InterfaceC1501100pAK("src_product_id") String str8, @InterfaceC1501100pAK("ctx_product_ids") String str9, @InterfaceC1501100pAK("dma_consent_status") Integer num, @InterfaceC1501100pAK("edm_consent_status") Integer num2, InterfaceC1364105Vn<? super EcClickSearchResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/aweme/v1/search/ttec/banner/")
        ListenableFuture<MiddleCouponModel> fetchCouponRequestData(@InterfaceC1501260pAa Map<String, String> map);

        @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
        @InterfaceC1501300pAe
        Object getSuggestWords(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("last_search_query") String str7, @InterfaceC1501100pAK("last_search_source") String str8, @InterfaceC1501100pAK("last_search_group_id") String str9, @InterfaceC1501100pAK("has_effective_click") Integer num2, @InterfaceC1501100pAK("total_play_time") Long l, @InterfaceC1501100pAK("back_from_search") Integer num3, @InterfaceC1501100pAK("last_suggest_words") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("type") String str14, @InterfaceC1501100pAK("feedback_query_list") String str15, @InterfaceC1501100pAK("feedback_product_id_list") String str16, @InterfaceC1501100pAK("src_live_room_id") String str17, @InterfaceC1501100pAK("src_author_id") String str18, @InterfaceC1501100pAK("ecom_user_actions") String str19, @InterfaceC1501100pAK("extra") String str20, @InterfaceC1501100pAK("passThroughParams") String str21, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("traffic_diversion_info") String str22, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/search/ttec/guide/")
        @InterfaceC1501300pAe
        Object getSuggestWordsNew(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("last_search_query") String str7, @InterfaceC1501100pAK("last_search_source") String str8, @InterfaceC1501100pAK("last_search_group_id") String str9, @InterfaceC1501100pAK("has_effective_click") Integer num2, @InterfaceC1501100pAK("total_play_time") Long l, @InterfaceC1501100pAK("back_from_search") Integer num3, @InterfaceC1501100pAK("last_suggest_words") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("type") String str14, @InterfaceC1501100pAK("feedback_query_list") String str15, @InterfaceC1501100pAK("feedback_product_id_list") String str16, @InterfaceC1501100pAK("src_live_room_id") String str17, @InterfaceC1501100pAK("src_author_id") String str18, @InterfaceC1501100pAK("ecom_user_actions") String str19, @InterfaceC1501100pAK("extra") String str20, @InterfaceC1501100pAK("passThroughParams") String str21, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("traffic_diversion_info") String str22, @InterfaceC1501100pAK("root_enter_from_type") Integer num6, @InterfaceC1501100pAK("session_first_request") Integer num7, @InterfaceC1501100pAK("last_search_method") String str23, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/search/ttec/guide/")
        @InterfaceC1501300pAe
        ListenableFuture<String> getSuggestWordsNew2(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("last_search_query") String str7, @InterfaceC1501100pAK("last_search_source") String str8, @InterfaceC1501100pAK("last_search_group_id") String str9, @InterfaceC1501100pAK("has_effective_click") Integer num2, @InterfaceC1501100pAK("total_play_time") Long l, @InterfaceC1501100pAK("back_from_search") Integer num3, @InterfaceC1501100pAK("last_suggest_words") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("type") String str14, @InterfaceC1501100pAK("feedback_query_list") String str15, @InterfaceC1501100pAK("feedback_product_id_list") String str16, @InterfaceC1501100pAK("src_live_room_id") String str17, @InterfaceC1501100pAK("src_author_id") String str18, @InterfaceC1501100pAK("ecom_user_actions") String str19, @InterfaceC1501100pAK("extra") String str20, @InterfaceC1501100pAK("passThroughParams") String str21, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("traffic_diversion_info") String str22, @InterfaceC1501100pAK("root_enter_from_type") Integer num6, @InterfaceC1501100pAK("session_first_request") Integer num7, @InterfaceC1501100pAK("last_search_method") String str23);

        @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
        @InterfaceC1501300pAe
        C15O7<String> getSuggestWordsWithRawString(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("last_search_query") String str7, @InterfaceC1501100pAK("last_search_source") String str8, @InterfaceC1501100pAK("last_search_group_id") String str9, @InterfaceC1501100pAK("has_effective_click") Integer num2, @InterfaceC1501100pAK("total_play_time") Long l, @InterfaceC1501100pAK("back_from_search") Integer num3, @InterfaceC1501100pAK("last_suggest_words") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("type") String str14, @InterfaceC1501100pAK("feedback_query_list") String str15, @InterfaceC1501100pAK("feedback_product_id_list") String str16, @InterfaceC1501100pAK("ecom_user_actions") String str17, @InterfaceC1501100pAK("extra") String str18, @InterfaceC1501100pAK("passThroughParams") String str19);

        @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
        @InterfaceC1501300pAe
        C11NZ<String> getSuggestWordsWithRawStringSingle(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("last_search_query") String str7, @InterfaceC1501100pAK("last_search_source") String str8, @InterfaceC1501100pAK("last_search_group_id") String str9, @InterfaceC1501100pAK("has_effective_click") Integer num2, @InterfaceC1501100pAK("total_play_time") Long l, @InterfaceC1501100pAK("back_from_search") Integer num3, @InterfaceC1501100pAK("last_suggest_words") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("type") String str14, @InterfaceC1501100pAK("feedback_query_list") String str15, @InterfaceC1501100pAK("feedback_product_id_list") String str16, @InterfaceC1501100pAK("ecom_user_actions") String str17, @InterfaceC1501100pAK("extra") String str18, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("passThroughParams") String str19);

        @InterfaceC1501240pAY("/aweme/v1/search/ttec/guide/")
        @InterfaceC1501300pAe
        C11NZ<String> getSuggestWordsWithRawStringSingleNew(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("last_search_query") String str7, @InterfaceC1501100pAK("last_search_source") String str8, @InterfaceC1501100pAK("last_search_group_id") String str9, @InterfaceC1501100pAK("has_effective_click") Integer num2, @InterfaceC1501100pAK("total_play_time") Long l, @InterfaceC1501100pAK("back_from_search") Integer num3, @InterfaceC1501100pAK("last_suggest_words") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("type") String str14, @InterfaceC1501100pAK("feedback_query_list") String str15, @InterfaceC1501100pAK("feedback_product_id_list") String str16, @InterfaceC1501100pAK("ecom_user_actions") String str17, @InterfaceC1501100pAK("extra") String str18, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("passThroughParams") String str19, @InterfaceC1501100pAK("traffic_diversion_info") String str20, @InterfaceC1501100pAK("root_enter_from_type") Integer num6, @InterfaceC1501100pAK("session_first_request") Integer num7, @InterfaceC1501100pAK("last_search_method") String str21);
    }

    public static Object LIZ(C671380QVc c671380QVc, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object c098200Yq;
        int i;
        EcIntermediatePreload.Companion.getClass();
        String strLIZIZ = EcIntermediatePreload.ecomUserActions;
        if (strLIZIZ == null) {
            C2232408os c2232408os = C341050DYp.LIZ;
            strLIZIZ = C341050DYp.LIZIZ(C2286608xc.LJ(C0QCT.LIZ()), C20481080p.LIZ(c671380QVc.LJJI));
        }
        Object obj = null;
        EcIntermediatePreload.ecomUserActions = null;
        try {
            JSONObject jSONObject = new JSONObject();
            if (c671380QVc.LJJIIJ) {
                i = 0;
            } else {
                i = 1;
            }
            jSONObject.put("is_first_search", i);
            String str = c671380QVc.LJJIII;
            if (str != null) {
                jSONObject.put("refresh_time", str);
            }
            c098200Yq = C786410Ut5.J3(jSONObject);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = "";
        }
        SuggestApi suggestApi = (SuggestApi) LIZJ.getValue();
        String str3 = c671380QVc.LIZ;
        String str4 = c671380QVc.LIZIZ;
        String str5 = c671380QVc.LJFF;
        Integer num = c671380QVc.LIZLLL;
        String str6 = c671380QVc.LJ;
        String strLIZ = C670980QTo.LIZIZ.LIZ().LIZ();
        String str7 = c671380QVc.LJII;
        String str8 = c671380QVc.LJIIIIZZ;
        String str9 = c671380QVc.LJIIIZ;
        Integer num2 = c671380QVc.LJIIJ;
        Long l = c671380QVc.LJIIJJI;
        Integer num3 = c671380QVc.LJIIL;
        String str10 = c671380QVc.LJIILIIL;
        String str11 = c671380QVc.LJIILJJIL;
        String str12 = c671380QVc.LJIJJLI;
        String str13 = c671380QVc.LJIL;
        WeakReference<C1389890mGx> weakReference = C683820Qs0.LLILLL;
        return suggestApi.getSuggestWordsNew(str3, str4, null, str5, num, str6, strLIZ, str7, str8, str9, num2, l, num3, str10, str11, str12, str13, "grec", C671410QVf.LIZ(false), C671410QVf.LIZ(true), c671380QVc.LJJIFFI, c671380QVc.LJJII, strLIZIZ, str2, c671380QVc.LJJIIJZLJL, c671380QVc.LJJIIZ, c671380QVc.LJJIIZI, c671380QVc.LJJIJIIJI, c671380QVc.LJJIJIIJIL, c671380QVc.LJJIJIL, c671380QVc.LJJIJL, interfaceC1364105Vn);
    }
}
