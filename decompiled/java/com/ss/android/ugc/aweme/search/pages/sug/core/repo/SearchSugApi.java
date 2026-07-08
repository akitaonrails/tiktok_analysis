package com.ss.android.ugc.aweme.search.pages.sug.core.repo;

import X.C01GW;
import X.C080U;
import X.C0PP3;
import X.C0X9S;
import X.C1515820pY4;
import X.C15O7;
import X.C452501pT;
import X.C668540QKe;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174608fY;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugPreInfoResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSugApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1847));

    public interface SugApi {
        @InterfaceC1501240pAY("/aweme/v1/search/sug_cached_words/")
        C0X9S<String> LIZ();

        @InterfaceC1501240pAY("/aweme/v1/search/sug_cached_words/")
        C15O7<String> LIZIZ();

        @InterfaceC1501240pAY("/aweme/v1/search/user/sug/")
        @InterfaceC1485505rh
        C0X9S<SearchUserSugResponse> LIZJ(@InterfaceC1501100pAK("mention_type") long j, @InterfaceC1501100pAK("aweme_id") Long l, @InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("count") long j2, @InterfaceC1501100pAK("uid_filter_list") String str3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num);

        @InterfaceC1501240pAY("/aweme/v1/search/drama/sug/")
        @InterfaceC1501300pAe(enableRecord = true)
        C0X9S<SearchSugResponse> fetchDramaSug(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("history_list") String str3, @InterfaceC1501100pAK("history_list_timestamp") String str4, @InterfaceC1501100pAK("from_group_id") String str5, @InterfaceC1501100pAK("count") Integer num, @InterfaceC1501100pAK("sug_session_params") String str6, @InterfaceC1501100pAK("sug_request_params") String str7, @InterfaceC1501100pAK("performance_params") String str8, @InterfaceC1501100pAK("rich_sug_count") Integer num2, @InterfaceC1501100pAK("request_order") Long l, @InterfaceC1501100pAK("enter_from") String str9, @InterfaceC1501100pAK("sug_cost_degradation") int i, @InterfaceC1501100pAK("new_sug_session_id") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("pre_info_id") String str14, @InterfaceC1501100pAK("last_search_params") String str15, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/aweme/v1/search/sug/")
        @InterfaceC1501300pAe(enableRecord = true)
        ListenableFuture<SearchSugResponse> fetchSug(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("history_list") String str3, @InterfaceC1501100pAK("history_list_timestamp") String str4, @InterfaceC1501100pAK("from_group_id") String str5, @InterfaceC1501100pAK("count") Integer num, @InterfaceC1501100pAK("sug_session_params") String str6, @InterfaceC1501100pAK("sug_request_params") String str7, @InterfaceC1501100pAK("performance_params") String str8, @InterfaceC1501100pAK("rich_sug_count") Integer num2, @InterfaceC1501100pAK("request_order") Long l, @InterfaceC1501100pAK("enter_from") String str9, @InterfaceC1501100pAK("sug_cost_degradation") int i, @InterfaceC1501100pAK("new_sug_session_id") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("pre_info_id") String str14, @InterfaceC1501100pAK("last_search_params") String str15, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC2174608fY
        @InterfaceC1501240pAY("/aweme/v1/search/sug/stream/")
        @InterfaceC1501300pAe(enableRecord = true)
        C15O7<C1515820pY4<SearchSugResponse>> fetchSugByChunk(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("history_list") String str3, @InterfaceC1501100pAK("history_list_timestamp") String str4, @InterfaceC1501100pAK("from_group_id") String str5, @InterfaceC1501100pAK("count") Integer num, @InterfaceC1501100pAK("sug_session_params") String str6, @InterfaceC1501100pAK("sug_request_params") String str7, @InterfaceC1501100pAK("performance_params") String str8, @InterfaceC1501100pAK("rich_sug_count") Integer num2, @InterfaceC1501100pAK("request_order") Long l, @InterfaceC1501100pAK("enter_from") String str9, @InterfaceC1501100pAK("sug_cost_degradation") int i, @InterfaceC1501100pAK("new_sug_session_id") String str10, @InterfaceC1501100pAK("is_beginning_of_session") String str11, @InterfaceC1501100pAK("src_material_id") String str12, @InterfaceC1501100pAK("src_anchor_product_id") String str13, @InterfaceC1501100pAK("search_position") String str14, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("pre_info_id") String str15, @InterfaceC1501100pAK("last_search_params") String str16, @InterfaceC1501100pAK("enable_sug_tako") Integer num4, @InterfaceC1501100pAK("ecom_user_actions") String str17, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC1501240pAY("/aweme/v1/search/sug_pre_info/")
        @InterfaceC1485505rh
        C15O7<SugPreInfoResponse> sendSugPreInfo(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("history_list") String str3, @InterfaceC1501100pAK("history_list_timestamp") String str4, @InterfaceC1501100pAK("from_group_id") String str5, @InterfaceC1501100pAK("count") Integer num, @InterfaceC1501100pAK("sug_session_params") String str6, @InterfaceC1501100pAK("sug_request_params") String str7, @InterfaceC1501100pAK("performance_params") String str8, @InterfaceC1501100pAK("rich_sug_count") Integer num2, @InterfaceC1501100pAK("request_order") Long l, @InterfaceC1501100pAK("enter_from") String str9, @InterfaceC1501100pAK("sug_cost_degradation") int i, @InterfaceC1501100pAK("new_sug_session_id") String str10, @InterfaceC1501100pAK("src_material_id") String str11, @InterfaceC1501100pAK("src_anchor_product_id") String str12, @InterfaceC1501100pAK("search_position") String str13, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("search_context") String str14, @InterfaceC1501100pAK("last_search_params") String str15, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

        @InterfaceC2174608fY
        @InterfaceC1501240pAY("/aweme/v1/search/sug/stream/")
        @InterfaceC1501300pAe(enableRecord = true)
        C0X9S<C1515820pY4<SearchSugResponse>> syncFetchSugByChunk(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("history_list") String str3, @InterfaceC1501100pAK("history_list_timestamp") String str4, @InterfaceC1501100pAK("from_group_id") String str5, @InterfaceC1501100pAK("count") Integer num, @InterfaceC1501100pAK("sug_session_params") String str6, @InterfaceC1501100pAK("sug_request_params") String str7, @InterfaceC1501100pAK("performance_params") String str8, @InterfaceC1501100pAK("rich_sug_count") Integer num2, @InterfaceC1501100pAK("request_order") Long l, @InterfaceC1501100pAK("enter_from") String str9, @InterfaceC1501100pAK("sug_cost_degradation") int i, @InterfaceC1501100pAK("new_sug_session_id") String str10, @InterfaceC1501100pAK("is_beginning_of_session") String str11, @InterfaceC1501100pAK("src_material_id") String str12, @InterfaceC1501100pAK("src_anchor_product_id") String str13, @InterfaceC1501100pAK("search_position") String str14, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("pre_info_id") String str15, @InterfaceC1501100pAK("last_search_params") String str16, @InterfaceC1501100pAK("enable_sug_tako") Integer num4, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);
    }

    public static SugApi LIZ() {
        return (SugApi) LIZ.getValue();
    }

    public static final C15O7<SugPreInfoResponse> LIZIZ(C668540QKe c668540QKe) {
        Long l = c668540QKe.requestOrder;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("check_preload", "true"));
        return LIZ().sendSugPreInfo(c668540QKe.keywords, c668540QKe.source, c668540QKe.historyJson, c668540QKe.historyTimestampJson, c668540QKe.gid, c668540QKe.totalCount, c668540QKe.sessionParams, c668540QKe.requestParams, c668540QKe.prefParams, c668540QKe.richSugCount, l, c668540QKe.enterFrom, c668540QKe.sugCostDegradation, c668540QKe.newSugSessionId, c668540QKe.srcMaterialId, c668540QKe.srcAnchorProductId, c668540QKe.searchPosition, c668540QKe.isNonPersonalizedSearch(), c668540QKe.searchContext, C0PP3.LIZ(), null, arrayList);
    }
}
