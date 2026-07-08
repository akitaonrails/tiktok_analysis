package com.ss.android.ugc.aweme.search.pages.result.photosearch.repo;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchPhotoApi {
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/aweme/v1/search/photo/")
    Object getSearchPhotoList(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("offset") long j, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("search_source") String str3, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("last_search_id") String str5, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("sort_type") int i5, @InterfaceC1501100pAK("publish_time") int i6, @InterfaceC1501100pAK("enter_from") String str6, @InterfaceC1501100pAK("search_channel") String str7, @InterfaceC1501100pAK("show_results_source") String str8, @InterfaceC1501100pAK("search_context") String str9, @InterfaceC1501150pAP LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("personal_context_info") String str10, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str11, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501100pAK("end_to_end_search_session_id") String str12, @InterfaceC1501100pAK("screen_reader_enable") Boolean bool, InterfaceC1364105Vn<? super SearchMix> interfaceC1364105Vn);
}
