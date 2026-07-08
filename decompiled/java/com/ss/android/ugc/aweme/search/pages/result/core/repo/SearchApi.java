package com.ss.android.ugc.aweme.search.pages.result.core.repo;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C15O7;
import X.C1ER1;
import X.C452501pT;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501240pAY;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.n;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.repo.SearchEffectListResponse;
import com.ss.android.ugc.aweme.search.pages.result.hashtagsearch.core.model.SearchChallengeList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchApi {
    public static final SearchApi LIZ = new SearchApi();
    public static final String LIZIZ = C1ER1.LIZIZ.LJIILJJIL();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(291));

    public interface RealApi {
        @InterfaceC1501240pAY("/aweme/v1/search/effect/")
        @InterfaceC1485505rh
        C15O7<SearchEffectListResponse> LIZ(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("alasrc") String str2, @InterfaceC1501100pAK("search_source") String str3, @InterfaceC1501100pAK("offset") int i, @InterfaceC1501100pAK("limit") int i2, @InterfaceC1501100pAK("aid") int i3, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("effect_sdk_version") String str5, @InterfaceC1501100pAK("is_load_more") int i4);

        @InterfaceC1501240pAY("/aweme/v1/challenge/search/")
        @InterfaceC1485505rh
        ListenableFuture<SearchChallengeList> searchChallengeList(@InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("enter_from") String str2, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("source") String str3, @InterfaceC1501100pAK("search_source") String str4, @InterfaceC1501100pAK("search_id") String str5, @InterfaceC1501100pAK("last_search_id") String str6, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("search_context") String str7, @InterfaceC1501100pAK("personal_context_info") String str8, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str9, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("end_to_end_search_session_id") String str10, @InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501240pAY("/aweme/v1/music/search/")
        @InterfaceC1485505rh
        ListenableFuture<n> searchDynamicMusicList(@InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("enter_from") String str2, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str3, @InterfaceC1501100pAK("last_search_id") String str4, @InterfaceC1501100pAK("source") String str5, @InterfaceC1501100pAK("search_source") String str6, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501150pAP LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str7, @InterfaceC1501100pAK("personal_context_info") String str8, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str9, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("end_to_end_search_session_id") String str10, @InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501240pAY("/aweme/v1/live/search/")
        @InterfaceC1485505rh
        ListenableFuture<SearchLiveList> searchLiveList(@InterfaceC1501100pAK("offset") long j, @InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("search_source") String str2, @InterfaceC1501100pAK("enter_from") String str3, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("source") String str5, @InterfaceC1501100pAK("live_id_list") String str6, @InterfaceC1501100pAK("last_search_id") String str7, @InterfaceC1501100pAK("search_context") String str8, @InterfaceC1501100pAK("personal_context_info") String str9, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str10, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("end_to_end_search_session_id") String str11, @InterfaceC1501100pAK("bcm_chain") String str12, @InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501240pAY("/aweme/v1/search/place/")
        @InterfaceC1485505rh
        ListenableFuture<n> searchPlaceList(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("offset") long j, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("search_source") String str2, @InterfaceC1501100pAK("search_id") String str3, @InterfaceC1501100pAK("last_search_id") String str4, @InterfaceC1501100pAK("search_context") String str5, @InterfaceC1501100pAK("personal_context_info") String str6, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str7, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("end_to_end_search_session_id") String str8, @InterfaceC1501100pAK("encrypt_location") String str9, @InterfaceC1501100pAK("current_location_status") Integer num2, @InterfaceC1501100pAK("enable_debug_tool") Integer num3, @InterfaceC1501100pAK("poi_card_id_list") String str10, @InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501240pAY("/aweme/v1/discover/search/")
        @InterfaceC1485505rh
        ListenableFuture<SearchUserList> searchUserList(@InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("enter_from") String str2, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("type") int i2, @InterfaceC1501100pAK("hot_search") int i3, @InterfaceC1501100pAK("search_source") String str3, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("last_search_id") String str5, @InterfaceC1501100pAK("query_correct_type") int i4, @InterfaceC1501100pAK("search_channel") String str6, @InterfaceC1501100pAK("sug_user_id") String str7, @InterfaceC1501100pAK("is_rich_sug") String str8, @InterfaceC1501100pAK("search_context") String str9, @InterfaceC1501100pAK("is_filter_search") int i5, @InterfaceC1501150pAP LinkedHashMap<String, String> linkedHashMap, @InterfaceC1501100pAK("personal_context_info") String str10, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str11, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("end_to_end_search_session_id") String str12, @InterfaceC1501100pAK("bcm_chain") String str13, @InterfaceC1501150pAP Map<String, String> map);
    }

    public static RealApi LIZ() {
        return (RealApi) LIZJ.getValue();
    }

    public static SearchLiveList LIZIZ(SearchRequestParam searchRequestParam) {
        try {
            return LIZ().searchLiveList(searchRequestParam.cursor, searchRequestParam.keyword, searchRequestParam.count, searchRequestParam.searchSource, searchRequestParam.enterFrom, searchRequestParam.searchId, searchRequestParam.source, searchRequestParam.roomIdList, searchRequestParam.lastSearchId, searchRequestParam.searchContext, searchRequestParam.personalContextInfo, searchRequestParam.isNonPersonalizedSearch, searchRequestParam.sugGenerateType, searchRequestParam.searchSessionId, searchRequestParam.endToEndSearchSessionId, searchRequestParam.bcmChain, searchRequestParam.LIZJ).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
