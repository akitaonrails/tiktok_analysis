package com.ss.android.ugc.aweme.ecommerce.search.result.api;

import X.AbstractC2126608Uu;
import X.C01GW;
import X.C040J;
import X.C080U;
import X.C0PSG;
import X.C11NZ;
import X.C1515820pY4;
import X.C15O7;
import X.C452501pT;
import X.C674800QdS;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501190pAT;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import X.InterfaceC2174808fa;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.model.VideoVerticalResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchApi {
    public static final EcSearchApi LIZ = new EcSearchApi();
    public static final String LIZIZ = Api.LIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(102));

    public interface RealApi {
        @InterfaceC1501240pAY("/aweme/v1/search/frequency/ecom/")
        @InterfaceC1485505rh
        Object ackEcSearchFrequency(@InterfaceC1501100pAK(Scene.SCENE_SERVICE) int i, @InterfaceC1501100pAK("sub_name") String str, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

        @C040J
        @InterfaceC1501240pAY("/aweme/v1/search/ecom/record/")
        @InterfaceC1485505rh
        C15O7<n> ackShopRequest(@InterfaceC1501100pAK("chunk_size_list") String str, @InterfaceC1501100pAK("search_channel") String str2, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("enter_from") String str4, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str5, @InterfaceC1501100pAK("last_search_id") String str6, @InterfaceC1501100pAK("source") String str7, @InterfaceC1501100pAK("search_source") String str8, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str9, @InterfaceC1501100pAK("sug_tag_text") String str10, @InterfaceC1501100pAK("sug_type") String str11, @InterfaceC1501100pAK("sug_query_state") String str12, @InterfaceC1501100pAK("sug_creator_id") String str13, @InterfaceC1501100pAK("attach_products") String str14, @InterfaceC1501100pAK("traffic_source_list") String str15, @InterfaceC1501100pAK("cmpl_enc") String str16, @InterfaceC1501100pAK("origin_is_mall_tab") String str17, @InterfaceC1501100pAK("ec_search_session_id") String str18, @InterfaceC1501100pAK("sug_shop_id") String str19, @InterfaceC1501100pAK("user_rt_acts") String str20, @InterfaceC1501370pAl("x-api-version") String str21, @InterfaceC1501100pAK("search_session_id") String str22, @InterfaceC1501100pAK("ecom_user_actions") String str23, @InterfaceC1501100pAK("last_search_pid_list") String str24, @InterfaceC1501100pAK("passThroughParams") String str25, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("filters_data") String str26, @InterfaceC1501100pAK("is_low_device") Integer num, @InterfaceC1501100pAK("is_weak_network") Integer num2, @InterfaceC1501100pAK("use_new_filter_arch") Integer num3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("edm_consent_status") Integer num6, @InterfaceC1501100pAK("new_user_extra_info_list") String str27, @InterfaceC1501100pAK("top_product_id") String str28, @InterfaceC1501100pAK("search_keyword_strategy") Integer num7, @InterfaceC1501100pAK("enter_from_second") String str29, @InterfaceC1501100pAK("pre_search_idx") Integer num8, @InterfaceC1501100pAK("search_promotion_params") String str30, @InterfaceC1501100pAK("traffic_diversion_info") String str31, @InterfaceC1501100pAK("bcm_chain") String str32, @InterfaceC1501190pAT Map<String, String> map, @InterfaceC1501100pAK("root_enter_from_type") Integer num9, @InterfaceC1501100pAK("client_request_id") String str33);

        @InterfaceC1501240pAY("/aweme/v1/search/pack_product/ecom/")
        @InterfaceC1485505rh
        Object fetchEcSearchFeedCardData(@InterfaceC1501100pAK("source") String str, @InterfaceC1501100pAK("pack_product_id") String str2, @InterfaceC1501100pAK("traffic_source_list") String str3, @InterfaceC1501100pAK("cover_size") Integer num, @InterfaceC1501100pAK("feed_card_voucher") Integer num2, @InterfaceC1501100pAK("feed_card_content_type") Integer num3, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/search/pack_product/ecom/")
        @InterfaceC1485505rh
        C11NZ<n> fetchEcSearchFeedCardDataNoSuspend(@InterfaceC1501100pAK("source") String str, @InterfaceC1501100pAK("pack_product_id") String str2, @InterfaceC1501100pAK("traffic_source_list") String str3);

        @InterfaceC1501240pAY("/aweme/v1/search/voucher/info/")
        @InterfaceC1485505rh
        C15O7<n> fetchSearchVoucherInfo(@InterfaceC1501100pAK("search_channel") String str, @InterfaceC1501100pAK("keyword") String str2, @InterfaceC1501100pAK("depth") String str3, @InterfaceC1501100pAK("version") Long l, @InterfaceC1501100pAK("is_first_request") Boolean bool, @InterfaceC1501100pAK("source") String str4, @InterfaceC1501100pAK("banner_voucher_type_ids") String str5, @InterfaceC1501100pAK("edm_consent_status") Integer num, @InterfaceC1501100pAK("dma_consent_status") Integer num2, @InterfaceC1501100pAK("traffic_source_list") String str6, @InterfaceC1501100pAK("search_promotion_scene_list") String str7, @InterfaceC1501100pAK("banner_voucher_type_ids") String str8);

        @InterfaceC1501240pAY("/aweme/v1/search/mall_live/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<n> searchDynamicLiveList(@InterfaceC1501100pAK("search_channel") String str, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str2, @InterfaceC1501100pAK("enter_from") String str3, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("last_search_id") String str5, @InterfaceC1501100pAK("source") String str6, @InterfaceC1501100pAK("search_source") String str7, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str8, @InterfaceC1501100pAK("sug_tag_text") String str9, @InterfaceC1501100pAK("sug_type") String str10, @InterfaceC1501100pAK("sug_query_state") String str11, @InterfaceC1501100pAK("sug_creator_id") String str12, @InterfaceC1501100pAK("attach_products") String str13, @InterfaceC1501100pAK("traffic_source_list") String str14, @InterfaceC1501100pAK("sug_shop_id") String str15, @InterfaceC1501100pAK("ec_search_session_id") String str16, @InterfaceC1501100pAK("search_session_id") String str17, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("dma_consent_status") Integer num2, @InterfaceC1501100pAK("edm_consent_status") Integer num3, @InterfaceC1501100pAK("enter_from_second") String str18, @InterfaceC1501100pAK("bcm_chain") String str19);

        @InterfaceC1501240pAY("/aweme/v1/search/mall_live/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<String> searchDynamicLiveListString(@InterfaceC1501100pAK("search_channel") String str, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str2, @InterfaceC1501100pAK("enter_from") String str3, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("last_search_id") String str5, @InterfaceC1501100pAK("source") String str6, @InterfaceC1501100pAK("search_source") String str7, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str8, @InterfaceC1501100pAK("sug_tag_text") String str9, @InterfaceC1501100pAK("sug_type") String str10, @InterfaceC1501100pAK("sug_query_state") String str11, @InterfaceC1501100pAK("sug_creator_id") String str12, @InterfaceC1501100pAK("attach_products") String str13, @InterfaceC1501100pAK("traffic_source_list") String str14, @InterfaceC1501100pAK("sug_shop_id") String str15, @InterfaceC1501100pAK("ec_search_session_id") String str16, @InterfaceC1501100pAK("search_session_id") String str17, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("dma_consent_status") Integer num2, @InterfaceC1501100pAK("edm_consent_status") Integer num3, @InterfaceC1501100pAK("enter_from_second") String str18, @InterfaceC1501100pAK("bcm_chain") String str19);

        @InterfaceC1501240pAY("/aweme/v1/search/ecom/order/")
        @InterfaceC1485505rh
        ListenableFuture<n> searchDynamicOrderList(@InterfaceC1501100pAK("search_channel") String str, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str2, @InterfaceC1501100pAK("enter_from") String str3, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("last_search_id") String str5, @InterfaceC1501100pAK("source") String str6, @InterfaceC1501100pAK("search_source") String str7, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str8, @InterfaceC1501100pAK("sug_tag_text") String str9, @InterfaceC1501100pAK("sug_type") String str10, @InterfaceC1501100pAK("sug_query_state") String str11, @InterfaceC1501100pAK("sug_creator_id") String str12, @InterfaceC1501100pAK("attach_products") String str13, @InterfaceC1501100pAK("traffic_source_list") String str14, @InterfaceC1501100pAK("sug_shop_id") String str15, @InterfaceC1501100pAK("page_type") Integer num, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("bcm_chain") String str16);

        @InterfaceC1501240pAY("/aweme/v1/search/ecom/live_bag/")
        @InterfaceC1485505rh
        ListenableFuture<n> searchDynamicRoomProductList(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("search_channel") String str3, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("search_source") String str4, @InterfaceC1501100pAK("search_id") String str5, @InterfaceC1501100pAK("query_correct_type") int i2, @InterfaceC1501100pAK("enter_from") String str6, @InterfaceC1501100pAK("search_context") String str7, @InterfaceC1501100pAK("last_search_id") String str8, @InterfaceC1501100pAK("search_session_id") String str9, @InterfaceC1501100pAK("room_id") String str10, @InterfaceC1501100pAK("author_id") String str11, @InterfaceC1501100pAK("traffic_source_list") String str12, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l);

        @C040J
        @InterfaceC1501240pAY("/aweme/v1/search/stream/ecom/")
        @InterfaceC1485505rh
        C15O7<C1515820pY4<n>> searchDynamicShopListByChunkPost(@InterfaceC1501100pAK("chunk_size_list") String str, @InterfaceC1501100pAK("search_channel") String str2, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("enter_from") String str4, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str5, @InterfaceC1501100pAK("last_search_id") String str6, @InterfaceC1501100pAK("source") String str7, @InterfaceC1501100pAK("search_source") String str8, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str9, @InterfaceC1501100pAK("sug_tag_text") String str10, @InterfaceC1501100pAK("sug_type") String str11, @InterfaceC1501100pAK("sug_query_state") String str12, @InterfaceC1501100pAK("sug_creator_id") String str13, @InterfaceC1501100pAK("attach_products") String str14, @InterfaceC1501100pAK("attach_ecom_cards") String str15, @InterfaceC1501100pAK("traffic_source_list") String str16, @InterfaceC1501100pAK("cmpl_enc") String str17, @InterfaceC1501100pAK("origin_is_mall_tab") String str18, @InterfaceC1501100pAK("ec_search_session_id") String str19, @InterfaceC1501100pAK("sug_shop_id") String str20, @InterfaceC1501100pAK("user_rt_acts") String str21, @InterfaceC1501370pAl("x-api-version") String str22, @InterfaceC1501100pAK("search_session_id") String str23, @InterfaceC1501100pAK("ecom_user_actions") String str24, @InterfaceC1501100pAK("last_search_pid_list") String str25, @InterfaceC1501100pAK("passThroughParams") String str26, @InterfaceC1501190pAT Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("filters_data") String str27, @InterfaceC1501100pAK("is_low_device") Integer num, @InterfaceC1501100pAK("is_weak_network") Integer num2, @InterfaceC1501100pAK("use_new_filter_arch") Integer num3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("edm_consent_status") Integer num6, @InterfaceC1501100pAK("new_user_extra_info_list") String str28, @InterfaceC1501100pAK("top_product_id") String str29, @InterfaceC1501100pAK("search_keyword_strategy") Integer num7, @InterfaceC1501100pAK("enter_from_second") String str30, @InterfaceC1501100pAK("pre_search_idx") Integer num8, @InterfaceC1501100pAK("search_promotion_params") String str31, @InterfaceC1501100pAK("traffic_diversion_info") String str32, @InterfaceC1501100pAK("bcm_chain") String str33, @InterfaceC1501190pAT Map<String, String> map2, @InterfaceC1501100pAK("root_enter_from_type") Integer num9, @InterfaceC1501100pAK("client_request_id") String str34);

        @InterfaceC1501240pAY("/aweme/v1/search/single/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<n> searchDynamicSingleShopListPost(@InterfaceC1501370pAl("x-api-version") String str, @InterfaceC1501100pAK("search_channel") String str2, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("enter_from") String str4, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str5, @InterfaceC1501100pAK("last_search_id") String str6, @InterfaceC1501100pAK("source") String str7, @InterfaceC1501100pAK("search_source") String str8, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str9, @InterfaceC1501100pAK("sug_tag_text") String str10, @InterfaceC1501100pAK("sug_type") String str11, @InterfaceC1501100pAK("sug_query_state") String str12, @InterfaceC1501100pAK("sug_creator_id") String str13, @InterfaceC1501100pAK("attach_products") String str14, @InterfaceC1501100pAK("traffic_source_list") String str15, @InterfaceC1501100pAK("cmpl_enc") String str16, @InterfaceC1501100pAK("origin_is_mall_tab") String str17, @InterfaceC1501100pAK("ec_search_session_id") String str18, @InterfaceC1501100pAK("sug_shop_id") String str19, @InterfaceC1501100pAK("user_rt_acts") String str20, @InterfaceC1501100pAK("search_session_id") String str21, @InterfaceC1501100pAK("ecom_user_actions") String str22, @InterfaceC1501100pAK("passThroughParams") String str23, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("use_new_filter_arch") Integer num, @InterfaceC1501100pAK("new_user_extra_info_list") String str24, @InterfaceC1501100pAK("top_product_id") String str25, @InterfaceC1501100pAK("search_keyword_strategy") Integer num2, @InterfaceC1501100pAK("enter_from_second") String str26, @InterfaceC1501100pAK("bcm_chain") String str27, @InterfaceC1501100pAK("root_enter_from_type") Integer num3, @InterfaceC1501100pAK("client_request_id") String str28);

        @InterfaceC1501240pAY("/aweme/v1/search/mall_store/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<n> searchDynamicStoreList(@InterfaceC1501100pAK("search_channel") String str, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str2, @InterfaceC1501100pAK("enter_from") String str3, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str4, @InterfaceC1501100pAK("last_search_id") String str5, @InterfaceC1501100pAK("source") String str6, @InterfaceC1501100pAK("search_source") String str7, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str8, @InterfaceC1501100pAK("sug_tag_text") String str9, @InterfaceC1501100pAK("sug_type") String str10, @InterfaceC1501100pAK("sug_query_state") String str11, @InterfaceC1501100pAK("sug_creator_id") String str12, @InterfaceC1501100pAK("attach_products") String str13, @InterfaceC1501100pAK("traffic_source_list") String str14, @InterfaceC1501100pAK("sug_shop_id") String str15, @InterfaceC1501100pAK("ec_search_session_id") String str16, @InterfaceC1501100pAK("search_session_id") String str17, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("is_non_personalized_search") Integer num, @InterfaceC1501100pAK("enter_from_second") String str18, @InterfaceC1501100pAK("bcm_chain") String str19);

        @InterfaceC1501240pAY("/aweme/v1/search/mall_video/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<VideoVerticalResponse> searchDynamicVideoList(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("cursor") int i2, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("search_source") String str3, @InterfaceC1501100pAK("search_channel") String str4, @InterfaceC1501100pAK("enter_from") String str5, @InterfaceC1501100pAK("search_context") String str6, @InterfaceC1501100pAK("traffic_source_list") String str7, @InterfaceC1501100pAK("search_id") String str8, @InterfaceC1501100pAK("last_search_id") String str9, @InterfaceC1501100pAK("search_session_id") String str10, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("hot_search") int i3, @InterfaceC1501100pAK("query_correct_type") int i4, @InterfaceC1501100pAK("is_non_personalized_search") Integer num);
    }

    public static RealApi LIZJ() {
        return (RealApi) LIZJ.getValue();
    }

    public static n LIZLLL(C674800QdS c674800QdS) {
        boolean zIsDefaultOption;
        int filterBy;
        LinkedHashMap<String, Integer> linkedHashMap;
        try {
            RealApi realApiLIZJ = LIZJ();
            String str = c674800QdS.searchChannel;
            if (str == null) {
                str = "tiktok_mall_live_tab";
            }
            long j = c674800QdS.cursor;
            String str2 = c674800QdS.keyword;
            String str3 = c674800QdS.enterFrom;
            int i = c674800QdS.count;
            int i2 = c674800QdS.hotSearch;
            String str4 = c674800QdS.searchId;
            String str5 = c674800QdS.lastSearchId;
            String str6 = c674800QdS.source;
            String str7 = c674800QdS.searchSource;
            int i3 = c674800QdS.correctType;
            C0PSG c0psg = c674800QdS.filterOption;
            int i4 = 1;
            if (c0psg != null) {
                zIsDefaultOption = c0psg.isDefaultOption();
            } else {
                zIsDefaultOption = true;
            }
            int sortType = 0;
            if (zIsDefaultOption) {
                i4 = 0;
            }
            C0PSG c0psg2 = c674800QdS.filterOption;
            if (c0psg2 != null) {
                filterBy = c0psg2.getFilterBy();
            } else {
                filterBy = 0;
            }
            C0PSG c0psg3 = c674800QdS.filterOption;
            if (c0psg3 != null) {
                sortType = c0psg3.getSortType();
            }
            C0PSG c0psg4 = c674800QdS.filterOption;
            if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            return realApiLIZJ.searchDynamicLiveList(str, j, str2, str3, i, i2, str4, str5, str6, str7, i3, i4, filterBy, sortType, linkedHashMap, c674800QdS.searchContext, c674800QdS.sugTagText, c674800QdS.sugType, c674800QdS.sugQueryState, c674800QdS.sugCreatorId, c674800QdS.attachProducts, c674800QdS.trafficSourceList, c674800QdS.sugShopId, c674800QdS.ecSearchSessionId, c674800QdS.searchSessionId, c674800QdS.endToEndSearchSessionId, c674800QdS.isNonPersonalizedSearch(), c674800QdS.dmaConsentStatus, c674800QdS.edmConsentStatus, c674800QdS.enterFromSecond, c674800QdS.bcmChain).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static String LJ(C674800QdS c674800QdS) {
        boolean zIsDefaultOption;
        int filterBy;
        LinkedHashMap<String, Integer> linkedHashMap;
        try {
            RealApi realApiLIZJ = LIZJ();
            String str = c674800QdS.searchChannel;
            if (str == null) {
                str = "tiktok_mall_live_tab";
            }
            long j = c674800QdS.cursor;
            String str2 = c674800QdS.keyword;
            String str3 = c674800QdS.enterFrom;
            int i = c674800QdS.count;
            int i2 = c674800QdS.hotSearch;
            String str4 = c674800QdS.searchId;
            String str5 = c674800QdS.lastSearchId;
            String str6 = c674800QdS.source;
            String str7 = c674800QdS.searchSource;
            int i3 = c674800QdS.correctType;
            C0PSG c0psg = c674800QdS.filterOption;
            int i4 = 1;
            if (c0psg != null) {
                zIsDefaultOption = c0psg.isDefaultOption();
            } else {
                zIsDefaultOption = true;
            }
            int sortType = 0;
            if (zIsDefaultOption) {
                i4 = 0;
            }
            C0PSG c0psg2 = c674800QdS.filterOption;
            if (c0psg2 != null) {
                filterBy = c0psg2.getFilterBy();
            } else {
                filterBy = 0;
            }
            C0PSG c0psg3 = c674800QdS.filterOption;
            if (c0psg3 != null) {
                sortType = c0psg3.getSortType();
            }
            C0PSG c0psg4 = c674800QdS.filterOption;
            if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            return realApiLIZJ.searchDynamicLiveListString(str, j, str2, str3, i, i2, str4, str5, str6, str7, i3, i4, filterBy, sortType, linkedHashMap, c674800QdS.searchContext, c674800QdS.sugTagText, c674800QdS.sugType, c674800QdS.sugQueryState, c674800QdS.sugCreatorId, c674800QdS.attachProducts, c674800QdS.trafficSourceList, c674800QdS.sugShopId, c674800QdS.ecSearchSessionId, c674800QdS.searchSessionId, c674800QdS.endToEndSearchSessionId, c674800QdS.isNonPersonalizedSearch(), c674800QdS.dmaConsentStatus, c674800QdS.edmConsentStatus, c674800QdS.enterFromSecond, c674800QdS.bcmChain).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static n LJFF(C674800QdS c674800QdS) {
        boolean zIsDefaultOption;
        int filterBy;
        LinkedHashMap<String, Integer> linkedHashMap;
        try {
            RealApi realApiLIZJ = LIZJ();
            String str = c674800QdS.searchChannel;
            if (str == null) {
                str = "tiktok_mall_live_tab";
            }
            long j = c674800QdS.cursor;
            String str2 = c674800QdS.keyword;
            String str3 = c674800QdS.enterFrom;
            int i = c674800QdS.count;
            int i2 = c674800QdS.hotSearch;
            String str4 = c674800QdS.searchId;
            String str5 = c674800QdS.lastSearchId;
            String str6 = c674800QdS.source;
            String str7 = c674800QdS.searchSource;
            int i3 = c674800QdS.correctType;
            C0PSG c0psg = c674800QdS.filterOption;
            int i4 = 1;
            if (c0psg != null) {
                zIsDefaultOption = c0psg.isDefaultOption();
            } else {
                zIsDefaultOption = true;
            }
            int sortType = 0;
            if (zIsDefaultOption) {
                i4 = 0;
            }
            C0PSG c0psg2 = c674800QdS.filterOption;
            if (c0psg2 != null) {
                filterBy = c0psg2.getFilterBy();
            } else {
                filterBy = 0;
            }
            C0PSG c0psg3 = c674800QdS.filterOption;
            if (c0psg3 != null) {
                sortType = c0psg3.getSortType();
            }
            C0PSG c0psg4 = c674800QdS.filterOption;
            if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            return realApiLIZJ.searchDynamicOrderList(str, j, str2, str3, i, i2, str4, str5, str6, str7, i3, i4, filterBy, sortType, linkedHashMap, c674800QdS.searchContext, c674800QdS.sugTagText, c674800QdS.sugType, c674800QdS.sugQueryState, c674800QdS.sugCreatorId, c674800QdS.attachProducts, c674800QdS.trafficSourceList, c674800QdS.sugShopId, c674800QdS.pageType, c674800QdS.endToEndSearchSessionId, c674800QdS.bcmChain).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static n LJI(C674800QdS c674800QdS) {
        try {
            RealApi realApiLIZJ = LIZJ();
            String str = c674800QdS.keyword;
            String str2 = c674800QdS.source;
            String str3 = c674800QdS.searchChannel;
            if (str3 == null) {
                str3 = "tiktok_mall_live_tab";
            }
            return realApiLIZJ.searchDynamicRoomProductList(str, str2, str3, c674800QdS.count, c674800QdS.cursor, c674800QdS.searchSource, c674800QdS.searchId, c674800QdS.correctType, c674800QdS.enterFrom, c674800QdS.searchContext, c674800QdS.lastSearchId, c674800QdS.searchSessionId, c674800QdS.roomId, c674800QdS.authorId, c674800QdS.trafficSourceList, c674800QdS.endToEndSearchSessionId).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public static n LJII(C674800QdS c674800QdS) {
        boolean zIsDefaultOption;
        int filterBy;
        LinkedHashMap<String, Integer> linkedHashMap;
        try {
            RealApi realApiLIZJ = LIZJ();
            String str = c674800QdS.searchChannel;
            if (str == null) {
                str = "tiktok_store_tab";
            }
            long j = c674800QdS.cursor;
            String str2 = c674800QdS.keyword;
            String str3 = c674800QdS.enterFrom;
            int i = c674800QdS.count;
            int i2 = c674800QdS.hotSearch;
            String str4 = c674800QdS.searchId;
            String str5 = c674800QdS.lastSearchId;
            String str6 = c674800QdS.source;
            String str7 = c674800QdS.searchSource;
            int i3 = c674800QdS.correctType;
            C0PSG c0psg = c674800QdS.filterOption;
            int i4 = 1;
            if (c0psg != null) {
                zIsDefaultOption = c0psg.isDefaultOption();
            } else {
                zIsDefaultOption = true;
            }
            int sortType = 0;
            if (zIsDefaultOption) {
                i4 = 0;
            }
            C0PSG c0psg2 = c674800QdS.filterOption;
            if (c0psg2 != null) {
                filterBy = c0psg2.getFilterBy();
            } else {
                filterBy = 0;
            }
            C0PSG c0psg3 = c674800QdS.filterOption;
            if (c0psg3 != null) {
                sortType = c0psg3.getSortType();
            }
            C0PSG c0psg4 = c674800QdS.filterOption;
            if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            return realApiLIZJ.searchDynamicStoreList(str, j, str2, str3, i, i2, str4, str5, str6, str7, i3, i4, filterBy, sortType, linkedHashMap, c674800QdS.searchContext, c674800QdS.sugTagText, c674800QdS.sugType, c674800QdS.sugQueryState, c674800QdS.sugCreatorId, c674800QdS.attachProducts, c674800QdS.trafficSourceList, c674800QdS.sugShopId, c674800QdS.ecSearchSessionId, c674800QdS.searchSessionId, c674800QdS.endToEndSearchSessionId, c674800QdS.isNonPersonalizedSearch(), c674800QdS.enterFromSecond, c674800QdS.bcmChain).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C674920Qde
            if (r0 == 0) goto L20
            r4 = r7
            X.0Qde r4 = (X.C674920Qde) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L3f
        L20:
            X.0Qde r4 = new X.0Qde
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi$RealApi r1 = LIZJ()     // Catch: java.lang.Throwable -> L48
            r4.LLILLL = r0     // Catch: java.lang.Throwable -> L48
            r0 = 0
            java.lang.Object r3 = r1.ackEcSearchFrequency(r6, r0, r4)     // Catch: java.lang.Throwable -> L48
            if (r3 != r2) goto L42
            return r2
        L3f:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L48
        L42:
            com.google.gson.n r3 = (com.google.gson.n) r3     // Catch: java.lang.Throwable -> L48
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L48
            goto L54
        L48:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L54:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi.LIZ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r6, java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C674930Qdf
            if (r0 == 0) goto L20
            r4 = r8
            X.0Qdf r4 = (X.C674930Qdf) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L3e
        L20:
            X.0Qdf r4 = new X.0Qdf
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi$RealApi r0 = LIZJ()     // Catch: java.lang.Throwable -> L47
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r0.ackEcSearchFrequency(r6, r7, r4)     // Catch: java.lang.Throwable -> L47
            if (r3 != r2) goto L41
            return r2
        L3e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L47
        L41:
            com.google.gson.n r3 = (com.google.gson.n) r3     // Catch: java.lang.Throwable -> L47
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L47
            goto L53
        L47:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L53:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchApi.LIZIZ(int, java.lang.String, X.05Vn):java.lang.Object");
    }
}
