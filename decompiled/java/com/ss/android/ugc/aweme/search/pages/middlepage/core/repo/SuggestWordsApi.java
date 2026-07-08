package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo;

import X.C01GW;
import X.C080U;
import X.C11NZ;
import X.C15O7;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchResponse;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SuggestWordsApi {
    public static final SuggestWordsApi LIZ = new SuggestWordsApi();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(269));

    public interface SuggestApi {
        @InterfaceC1501240pAY("/aweme/v1/search/clicksug/")
        @InterfaceC1501300pAe
        C15O7<ClickSearchResponse> fetchClickSearchData(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("aweme_id") String str2, @InterfaceC1501100pAK("from_group_id") String str3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("number_of_click_sug") Integer num2, @InterfaceC1501100pAK("use_dynamic_count") Boolean bool);

        @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
        @InterfaceC1501300pAe
        Object getSuggestWordsData(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("history_list_timestamp") String str7, @InterfaceC1501100pAK("sug_signal_v2") String str8, @InterfaceC1501100pAK("back_from_search") Integer num2, @InterfaceC1501100pAK("last_suggest_words") String str9, @InterfaceC1501100pAK("src_material_id") String str10, @InterfaceC1501100pAK("src_anchor_product_id") String str11, @InterfaceC1501100pAK("search_position") String str12, @InterfaceC1501100pAK("type") String str13, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("current_placeholder_info") String str14, @InterfaceC1501100pAK("showed_suggest_words") String str15, @InterfaceC1501100pAK("intervention_guide_info") String str16, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501100pAK("count") Integer num4, @InterfaceC1501100pAK("dynamic_resolution") String str17, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
        @InterfaceC1501300pAe
        C15O7<String> getSuggestWordsWithRawString(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("history_list_timestamp") String str7, @InterfaceC1501100pAK("sug_signal_v2") String str8, @InterfaceC1501100pAK("back_from_search") Integer num2, @InterfaceC1501100pAK("last_suggest_words") String str9, @InterfaceC1501100pAK("src_material_id") String str10, @InterfaceC1501100pAK("src_anchor_product_id") String str11, @InterfaceC1501100pAK("search_position") String str12, @InterfaceC1501100pAK("type") String str13, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("current_placeholder_info") String str14, @InterfaceC1501100pAK("showed_suggest_words") String str15, @InterfaceC1501100pAK("intervention_guide_info") String str16, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501100pAK("count") Integer num4, @InterfaceC1501100pAK("dynamic_resolution") String str17);

        @InterfaceC1501240pAY("/aweme/v1/suggest/guide/")
        @InterfaceC1501300pAe
        C11NZ<String> getSuggestWordsWithRawStringSingle(@InterfaceC1501100pAK("business_id") String str, @InterfaceC1501100pAK("from_group_id") String str2, @InterfaceC1501100pAK("word_in_box") String str3, @InterfaceC1501100pAK("current_placeholder") String str4, @InterfaceC1501100pAK("data_type") Integer num, @InterfaceC1501100pAK("req_source") String str5, @InterfaceC1501100pAK("history_list") String str6, @InterfaceC1501100pAK("history_list_timestamp") String str7, @InterfaceC1501100pAK("sug_signal_v2") String str8, @InterfaceC1501100pAK("back_from_search") Integer num2, @InterfaceC1501100pAK("last_suggest_words") String str9, @InterfaceC1501100pAK("src_material_id") String str10, @InterfaceC1501100pAK("src_anchor_product_id") String str11, @InterfaceC1501100pAK("search_position") String str12, @InterfaceC1501100pAK("type") String str13, @InterfaceC1501100pAK("is_non_personalized_search") Integer num3, @InterfaceC1501100pAK("current_placeholder_info") String str14, @InterfaceC1501100pAK("count") Integer num4, @InterfaceC1501100pAK("dynamic_resolution") String str15);
    }
}
