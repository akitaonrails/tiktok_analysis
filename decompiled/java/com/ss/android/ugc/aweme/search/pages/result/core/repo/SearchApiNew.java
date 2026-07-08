package com.ss.android.ugc.aweme.search.pages.result.core.repo;

import X.AbstractC19484711Kz;
import X.C0QAL;
import X.C0X9S;
import X.C11NZ;
import X.C1227904rF;
import X.C1499850p8J;
import X.C1507060pJw;
import X.C1515820pY4;
import X.C15O7;
import X.C1822607Bw;
import X.C1ER1;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1485705rj;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501110pAL;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501320pAg;
import X.InterfaceC1501370pAl;
import X.InterfaceC2174608fY;
import X.InterfaceC2661011f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.core.uitils.SearchDynamicPatchDeserializer;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugWordResponse;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchApiNew {
    public static final SearchApiNew LIZ = new SearchApiNew();
    public static final String LIZIZ;
    public static final InterfaceC2661011f LIZJ;
    public static final Set<String> LIZLLL;

    public interface RealApi {
        public static final C0QAL LIZ = C0QAL.LIZ;

        @InterfaceC1501240pAY("{apiPath}")
        @InterfaceC1485505rh
        AbstractC19484711Kz<SearchMixFeedList> LIZ(@InterfaceC1501110pAL(encoded = true, value = "apiPath") String str, @InterfaceC1501100pAK("search_id") String str2, @InterfaceC1501100pAK("inner_search_id") String str3, @InterfaceC1501100pAK("offset") int i, @InterfaceC1501100pAK("preload_num") int i2, @InterfaceC1501100pAK("keyword") String str4, @InterfaceC1501100pAK("search_source") String str5, @InterfaceC1501100pAK("inner_flow_context") String str6, @InterfaceC1501100pAK("backtrace") String str7, @InterfaceC1501100pAK("consume_infos") String str8, @InterfaceC1501100pAK("inflow_ad_info") String str9, @InterfaceC1501100pAK("ad_user_agent") String str10, @InterfaceC1501100pAK("gaid") String str11, @InterfaceC1501100pAK("ad_personality_mode") int i3, @InterfaceC1501100pAK("cmpl_enc") String str12, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str13, @InterfaceC1501100pAK("inner_flow_rs_context") String str14, @InterfaceC1501100pAK("translate_language_code") String str15, @InterfaceC1501100pAK("disable_translate_language_code") String str16, @InterfaceC1501100pAK("search_context") String str17, @InterfaceC1501100pAK("count") int i4, @InterfaceC1501100pAK("user_rt_acts") String str18, @InterfaceC1501100pAK("ecom_user_actions") String str19, @InterfaceC1501100pAK("disableReorder") int i5, @InterfaceC1501100pAK("overall_score") String str20, @InterfaceC1501100pAK("last_search_params") String str21, @InterfaceC1501100pAK("innerflow_adgap") int i6, @InterfaceC1501100pAK("mix_adgap") int i7, @InterfaceC1501100pAK("ads_list") String str22);

        @InterfaceC1501240pAY("/aweme/v1/search/prefetch/ack/")
        @InterfaceC1485505rh
        C11NZ<String> LIZIZ(@InterfaceC1501100pAK("prefetch_id") String str, @InterfaceC1501100pAK("prefetch_result") String str2, @InterfaceC1501100pAK("search_source") String str3, @InterfaceC1501100pAK("cancel_reason") String str4, @InterfaceC1501100pAK("prefetch_type") String str5, @InterfaceC1501100pAK("degrade_info") Integer num);

        @InterfaceC1501240pAY("/aweme/v1/search/horizontal/loadmore/")
        @InterfaceC1485505rh
        C11NZ<String> LIZJ(@InterfaceC1501370pAl("x-ecom-api-version") String str, @InterfaceC1501100pAK("search_id") String str2, @InterfaceC1501100pAK("query") String str3, @InterfaceC1501100pAK("backtrace") String str4, @InterfaceC1501100pAK("log_id") String str5, @InterfaceC1501100pAK("token_type") String str6, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("count") Long l);

        @InterfaceC1501240pAY("/aweme/v1/search/videosug/")
        @InterfaceC1485505rh
        C11NZ<SearchSugWordResponse> LIZLLL(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("is_non_personalized_search") Integer num);

        @InterfaceC1501240pAY
        @InterfaceC1485505rh
        Object commonHorizontalLodMore(@InterfaceC1485705rj String str, @InterfaceC1501150pAP Map<String, String> map, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

        @InterfaceC1501240pAY
        @InterfaceC1485505rh
        C11NZ<String> jsbRequestAwemeList(@InterfaceC1485705rj String str, @InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501240pAY("/aweme/v1/search/item/")
        @InterfaceC1485505rh
        ListenableFuture<SearchMix> searchFeedList(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("offset") long j, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("search_source") String str3, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("last_search_id") String str5, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("sort_type") int i5, @InterfaceC1501100pAK("publish_time") int i6, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501100pAK("enter_from") String str6, @InterfaceC1501100pAK("search_channel") String str7, @InterfaceC1501100pAK("show_results_source") String str8, @InterfaceC1501100pAK("search_context") String str9, @InterfaceC1501150pAP LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("personal_context_info") String str10, @InterfaceC1501100pAK("translate_language_code") String str11, @InterfaceC1501100pAK("disable_translate_language_code") String str12, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("sug_generate_type") String str13, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("filter_item_ids") String str14, @InterfaceC1501150pAP Map<String, String> map2, @InterfaceC1501100pAK("end_to_end_search_session_id") String str15, @InterfaceC1501100pAK("bcm_chain") String str16);

        @InterfaceC1501240pAY("{apiPath}")
        @InterfaceC1485505rh
        @InterfaceC1501320pAg(3)
        C15O7<SearchMixFeedList> searchMTMixFeedList(@InterfaceC1501110pAL(encoded = true, value = "apiPath") String str, @InterfaceC1501370pAl("x-ecom-api-version") String str2, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("offset") int i, @InterfaceC1501100pAK("count") int i2, @InterfaceC1501100pAK("enter_from") String str4, @InterfaceC1501100pAK("search_source") String str5, @InterfaceC1501100pAK("hot_search") int i3, @InterfaceC1501100pAK("search_id") String str6, @InterfaceC1501100pAK("last_search_id") String str7, @InterfaceC1501100pAK("query_correct_type") int i4, @InterfaceC1501100pAK("multi_mod") int i5, @InterfaceC1501120pAM("sug_tag_text") String str8, @InterfaceC1501100pAK("sug_user_id") String str9, @InterfaceC1501100pAK("is_live_sug") String str10, @InterfaceC1501100pAK("is_rich_sug") String str11, @InterfaceC1501100pAK("is_filter_search") int i6, @InterfaceC1501100pAK("publish_time") int i7, @InterfaceC1501100pAK("sort_type") int i8, @InterfaceC1501100pAK("backtrace") String str12, @InterfaceC1501100pAK("words_type") String str13, @InterfaceC1501100pAK("search_context") String str14, @InterfaceC1501100pAK("ad_user_agent") String str15, @InterfaceC1501100pAK("search_ad_extra") String str16, @InterfaceC1501100pAK("trending_event_id") String str17, @InterfaceC1501100pAK("auto_play_user_video") int i9, @InterfaceC1501100pAK("preset_queries_loaded") int i10, @InterfaceC1501100pAK("in_preset_queries") int i11, @InterfaceC1501150pAP LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501100pAK("from_group_id") String str18, @InterfaceC1501100pAK("research_filter_type") String str19, @InterfaceC1501100pAK("general_filter_sort_type") Integer num, @InterfaceC1501100pAK("personal_context_info") String str20, @InterfaceC1501100pAK("hashtag_id") String str21, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l2, @InterfaceC1501100pAK("is_pull_refresh") Integer num2, @InterfaceC1501100pAK("visible_modules") Long l3, @InterfaceC1501100pAK("gaid") String str22, @InterfaceC1501100pAK("ad_personality_mode") int i12, @InterfaceC1501100pAK("cmpl_enc") String str23, @InterfaceC1501100pAK("translate_language_code") String str24, @InterfaceC1501100pAK("disable_translate_language_code") String str25, @InterfaceC1501100pAK("song_id") String str26, @InterfaceC1501100pAK("is_song_recog") Integer num3, @InterfaceC1501100pAK("app_theme") String str27, @InterfaceC1501100pAK("app_name") String str28, @InterfaceC1501100pAK("screen_width") Integer num4, @InterfaceC1501100pAK("screen_height") Integer num5, @InterfaceC1501100pAK("effect_sdk_version") String str29, @InterfaceC1501100pAK("is_non_personalized_search") Integer num6, @InterfaceC1501100pAK("sug_generate_type") String str30, @InterfaceC1501100pAK("user_rt_acts") String str31, @InterfaceC1501100pAK("fe_context") String str32, @InterfaceC1501100pAK("ecom_user_actions") String str33, @InterfaceC1501100pAK("lynx_ssr_extra") String str34, @InterfaceC1501100pAK("encrypt_location") String str35, @InterfaceC1501100pAK("current_location_status") Integer num7, @InterfaceC1501150pAP Map<String, String> map2, @InterfaceC1501150pAP Map<String, String> map3, @InterfaceC1501100pAK("enable_debug_tool") int i13, @InterfaceC1501100pAK("intervene_cards") String str36, @InterfaceC1501100pAK("dma_consent_status") Integer num8, @InterfaceC1501100pAK("edm_consent_status") Integer num9, @InterfaceC1501100pAK("consume_infos") String str37, @InterfaceC1501100pAK("search_enable_auto_play") Integer num10, @InterfaceC1501100pAK("bcm_chain") String str38, @InterfaceC1501100pAK("search_single_rs_card") Integer num11, @InterfaceC1501100pAK("screen_reader_enable") Boolean bool, @InterfaceC1501100pAK("dynamic_resolution") String str39, @InterfaceC1501100pAK("disable_reorder") int i14, @InterfaceC1501100pAK("last_search_params") String str40, @InterfaceC1501100pAK("show_latest_refine") Integer num12, @InterfaceC1501100pAK("from_latest_sort") Integer num13, @InterfaceC1501100pAK("overall_score") String str41, @InterfaceC1501100pAK("outflow_adgap") int i15, @InterfaceC1501100pAK("mix_adgap") int i16, @InterfaceC1501100pAK("ads_list") String str42);

        @InterfaceC1501240pAY("{apiPath}")
        @InterfaceC1485505rh
        @InterfaceC1501320pAg(3)
        @InterfaceC2174608fY
        C15O7<C1515820pY4<SearchMixFeedList>> searchMTMixFeedListByChunk(@InterfaceC1501110pAL(encoded = true, value = "apiPath") String str, @InterfaceC1501370pAl("x-ecom-api-version") String str2, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("offset") int i, @InterfaceC1501100pAK("count") int i2, @InterfaceC1501100pAK("enter_from") String str4, @InterfaceC1501100pAK("search_source") String str5, @InterfaceC1501100pAK("hot_search") int i3, @InterfaceC1501100pAK("search_id") String str6, @InterfaceC1501100pAK("last_search_id") String str7, @InterfaceC1501100pAK("query_correct_type") int i4, @InterfaceC1501100pAK("multi_mod") int i5, @InterfaceC1501100pAK("sug_tag_text") String str8, @InterfaceC1501100pAK("sug_user_id") String str9, @InterfaceC1501100pAK("is_live_sug") String str10, @InterfaceC1501100pAK("is_rich_sug") String str11, @InterfaceC1501100pAK("is_filter_search") int i6, @InterfaceC1501100pAK("publish_time") int i7, @InterfaceC1501100pAK("sort_type") int i8, @InterfaceC1501100pAK("ad_user_agent") String str12, @InterfaceC1501100pAK("search_ad_extra") String str13, @InterfaceC1501100pAK("trending_event_id") String str14, @InterfaceC1501100pAK("search_context") String str15, @InterfaceC1501100pAK("backtrace") String str16, @InterfaceC1501100pAK("words_type") String str17, @InterfaceC1501100pAK("auto_play_user_video") int i9, @InterfaceC1501100pAK("preset_queries_loaded") int i10, @InterfaceC1501100pAK("in_preset_queries") int i11, @InterfaceC1501150pAP LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501150pAP Map<String, String> map, @InterfaceC1501100pAK("from_group_id") String str18, @InterfaceC1501100pAK("with_raw_data") int i12, @InterfaceC1501100pAK("research_filter_type") String str19, @InterfaceC1501100pAK("general_filter_sort_type") Integer num, @InterfaceC1501100pAK("personal_context_info") String str20, @InterfaceC1501100pAK("hashtag_id") String str21, @InterfaceC1501100pAK("search_session_id") Long l, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l2, @InterfaceC1501100pAK("is_pull_refresh") Integer num2, @InterfaceC1501100pAK("visible_modules") Long l3, @InterfaceC1501100pAK("gaid") String str22, @InterfaceC1501100pAK("ad_personality_mode") int i13, @InterfaceC1501100pAK("cmpl_enc") String str23, @InterfaceC1501100pAK("translate_language_code") String str24, @InterfaceC1501100pAK("disable_translate_language_code") String str25, @InterfaceC1501100pAK("song_id") String str26, @InterfaceC1501100pAK("is_song_recog") Integer num3, @InterfaceC1501100pAK("app_theme") String str27, @InterfaceC1501100pAK("app_name") String str28, @InterfaceC1501100pAK("screen_width") Integer num4, @InterfaceC1501100pAK("screen_height") Integer num5, @InterfaceC1501100pAK("effect_sdk_version") String str29, @InterfaceC1501100pAK("is_non_personalized_search") Integer num6, @InterfaceC1501100pAK("prefetch_type") String str30, @InterfaceC1501100pAK("prefetch_id") String str31, @InterfaceC1501100pAK("sug_generate_type") String str32, @InterfaceC1501100pAK("user_rt_acts") String str33, @InterfaceC1501100pAK("fe_context") String str34, @InterfaceC1501100pAK("ecom_user_actions") String str35, @InterfaceC1501100pAK("lynx_ssr_extra") String str36, @InterfaceC1501150pAP Map<String, String> map2, @InterfaceC1501100pAK("intervene_cards") String str37, @InterfaceC1501100pAK("dma_consent_status") Integer num7, @InterfaceC1501100pAK("edm_consent_status") Integer num8, @InterfaceC1501100pAK("search_request_id") String str38, @InterfaceC1501100pAK("encrypt_location") String str39, @InterfaceC1501100pAK("current_location_status") Integer num9, @InterfaceC1501100pAK("click_user_id") String str40, @InterfaceC1501100pAK("enable_tako_top1") Integer num10, @InterfaceC1501100pAK("enable_tako_entrance") Integer num11, @InterfaceC1501100pAK("search_enable_auto_play") Integer num12, @InterfaceC1501100pAK("bcm_chain") String str41, @InterfaceC1501100pAK("search_single_rs_card") Integer num13, @InterfaceC1501100pAK("screen_reader_enable") Boolean bool, @InterfaceC1501100pAK("overall_score") String str42);

        @InterfaceC1501240pAY("{apiPath}")
        @InterfaceC1485505rh
        @InterfaceC1501320pAg(3)
        @InterfaceC2174608fY
        C15O7<C1515820pY4<SearchMixFeedList>> searchMTMixFeedListByChunkV2(@InterfaceC1501110pAL(encoded = true, value = "apiPath") String str, @InterfaceC1501370pAl("x-ecom-api-version") String str2, @InterfaceC1501150pAP Map<String, String> map);

        @InterfaceC1501240pAY("{apiPath}")
        @InterfaceC1485505rh
        @InterfaceC1501320pAg(3)
        @InterfaceC2174608fY
        C0X9S<C1515820pY4<SearchMixFeedList>> syncSearchMTMixFeedListByChunkV2(@InterfaceC1501110pAL(encoded = true, value = "apiPath") String str, @InterfaceC1501370pAl("x-ecom-api-version") String str2, @InterfaceC1501150pAP Map<String, String> map);
    }

    static {
        InterfaceC2661011f interfaceC2661011fLIZ;
        String strLJIILJJIL = C1ER1.LIZIZ.LJIILJJIL();
        LIZIZ = strLJIILJJIL;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        if (((Number) C1822607Bw.LIZ.getValue()).intValue() == 1) {
            C1499850p8J c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(strLJIILJJIL);
            C1227904rF.LIZ.getClass();
            Gson gsonLIZLLL = C1227904rF.LIZLLL();
            gsonLIZLLL.getClass();
            e eVar = new e(gsonLIZLLL);
            eVar.LIZJ(new SearchDynamicPatchDeserializer(), DynamicPatch.class);
            c1499850p8JCreateBuilder.LIZJ(new C1507060pJw(eVar.LIZ()));
            interfaceC2661011fLIZ = c1499850p8JCreateBuilder.build();
        } else {
            interfaceC2661011fLIZ = iRetrofitFactory.LIZ(strLJIILJJIL);
        }
        LIZJ = interfaceC2661011fLIZ;
        LIZLLL = new LinkedHashSet();
    }

    public static final RealApi LIZ() {
        RealApi.LIZ.getClass();
        return C0QAL.LIZIZ;
    }
}
