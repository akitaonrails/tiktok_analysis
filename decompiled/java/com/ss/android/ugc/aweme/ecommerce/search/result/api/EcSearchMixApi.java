package com.ss.android.ugc.aweme.ecommerce.search.result.api;

import X.C01GW;
import X.C040I;
import X.C040J;
import X.C080U;
import X.C08S1;
import X.C098200Yq;
import X.C0C64;
import X.C1493620oyG;
import X.C1515820pY4;
import X.C15O7;
import X.C189200o6;
import X.C452501pT;
import X.C675230Qe9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1485605ri;
import X.InterfaceC1485705rj;
import X.InterfaceC1501040pAE;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501190pAT;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501260pAa;
import X.InterfaceC1501370pAl;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import X.InterfaceC2336009Di;
import X.InterfaceC2661011f;
import X.InterfaceC675040Qdq;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.ECAiChatStreamTimeoutConfig;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS95S1000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMixApi {
    public static final String LIZ = Api.LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(103));

    public interface RealApi {
        @C040J
        @InterfaceC1501240pAY("/aweme/v1/search_ecom/chat/stream/")
        @InterfaceC1485505rh
        Object aiChatStreamPost(@InterfaceC1501190pAT Map<String, String> map, @InterfaceC1485605ri Map<String, String> map2, @InterfaceC2177008fw Object obj, InterfaceC1364105Vn<? super C1515820pY4<n>> interfaceC1364105Vn);

        @InterfaceC1501200pAU
        ListenableFuture<n> doGet(@InterfaceC1485705rj String str, @InterfaceC1501260pAa Map<String, Object> map, @InterfaceC1485605ri Map<String, Object> map2);

        @C040J
        @InterfaceC1501240pAY("/aweme/v1/search/ecom/stream/load_more/bff/")
        @InterfaceC1485505rh
        C15O7<C1515820pY4<n>> doMixSingleSearchChunkPost(@InterfaceC1501190pAT Map<String, String> map, @InterfaceC1485605ri Map<String, String> map2);

        @InterfaceC1501240pAY("/aweme/v1/search/single/bff/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<n> doMixSingleSearchPost(@InterfaceC1501190pAT Map<String, String> map, @InterfaceC1485605ri Map<String, String> map2);

        @InterfaceC1501240pAY
        ListenableFuture<n> doPost(@InterfaceC1485705rj String str, @C040I Map<String, Object> map, @InterfaceC1485605ri Map<String, Object> map2);

        @C040J
        @InterfaceC1501240pAY("/aweme/v1/search/photo/bff/ecom/")
        @InterfaceC1485505rh
        C15O7<C1515820pY4<n>> loadMorePhotoMixListByChunkPost(@InterfaceC1501190pAT Map<String, String> map, @InterfaceC1485605ri Map<String, String> map2);

        @InterfaceC1501240pAY("/aweme/v1/search/photo/bff/ecom/")
        @InterfaceC1485505rh
        ListenableFuture<n> refreshPhotoContentListPost(@InterfaceC1501190pAT Map<String, String> map, @InterfaceC1485605ri Map<String, String> map2);

        @InterfaceC1501240pAY("/aweme/v1/search/stream/bff/ecom/")
        @InterfaceC1485505rh
        @InterfaceC2336009Di
        @C040J
        C15O7<C1515820pY4<n>> searchDynamicShopMixListByChunkPost(@InterfaceC1501100pAK("chunk_size_list") String str, @InterfaceC1501100pAK("search_channel") String str2, @InterfaceC1501100pAK("cursor") long j, @InterfaceC1501100pAK("keyword") String str3, @InterfaceC1501100pAK("enter_from") String str4, @InterfaceC1501100pAK("count") int i, @InterfaceC1501100pAK("hot_search") int i2, @InterfaceC1501100pAK("search_id") String str5, @InterfaceC1501100pAK("last_search_id") String str6, @InterfaceC1501100pAK("source") String str7, @InterfaceC1501100pAK("search_source") String str8, @InterfaceC1501100pAK("query_correct_type") int i3, @InterfaceC1501100pAK("is_filter_search") int i4, @InterfaceC1501100pAK("filter_by") int i5, @InterfaceC1501100pAK("sort_type") int i6, @InterfaceC1501190pAT LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501100pAK("search_context") String str9, @InterfaceC1501100pAK("sug_tag_text") String str10, @InterfaceC1501100pAK("sug_type") String str11, @InterfaceC1501100pAK("sug_query_state") String str12, @InterfaceC1501100pAK("sug_creator_id") String str13, @InterfaceC1501100pAK("attach_products") String str14, @InterfaceC1501100pAK("attach_ecom_cards") String str15, @InterfaceC1501100pAK("traffic_source_list") String str16, @InterfaceC1501100pAK("cmpl_enc") String str17, @InterfaceC1501100pAK("origin_is_mall_tab") String str18, @InterfaceC1501100pAK("ec_search_session_id") String str19, @InterfaceC1501100pAK("sug_shop_id") String str20, @InterfaceC1501100pAK("user_rt_acts") String str21, @InterfaceC1501370pAl("x-api-version") String str22, @InterfaceC1501100pAK("search_session_id") String str23, @InterfaceC1501100pAK("ecom_user_actions") String str24, @InterfaceC1501100pAK("last_search_pid_list") String str25, @InterfaceC1501100pAK("passThroughParams") String str26, @InterfaceC1501190pAT Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501100pAK("end_to_end_search_session_id") Long l, @InterfaceC1501100pAK("filters_data") String str27, @InterfaceC1501100pAK("is_low_device") Integer num, @InterfaceC1501100pAK("is_weak_network") Integer num2, @InterfaceC1501100pAK("use_new_filter_arch") Integer num3, @InterfaceC1501100pAK("is_non_personalized_search") Integer num4, @InterfaceC1501100pAK("dma_consent_status") Integer num5, @InterfaceC1501100pAK("edm_consent_status") Integer num6, @InterfaceC1501100pAK("new_user_extra_info_list") String str28, @InterfaceC1501100pAK("top_product_id") String str29, @InterfaceC1501100pAK("search_keyword_strategy") Integer num7, @InterfaceC1501100pAK("enter_from_second") String str30, @InterfaceC1501100pAK("pre_search_idx") Integer num8, @InterfaceC1501100pAK("search_promotion_params") String str31, @InterfaceC1501100pAK("traffic_diversion_info") String str32, @InterfaceC1501100pAK("bcm_chain") String str33, @InterfaceC1501190pAT Map<String, String> map2, @InterfaceC1501100pAK("device_level") Integer num9, @InterfaceC1501100pAK("user_interaction_type") int i7, @InterfaceC1501100pAK("root_enter_from_type") Integer num10, @InterfaceC1501100pAK("client_request_id") String str34, @InterfaceC1501100pAK("no_need_page_style") Integer num11, @InterfaceC1501120pAM("key_preload_hash") String str35, @InterfaceC2177008fw Object obj);

        @C040J
        @InterfaceC1501240pAY("/aweme/v1/search/photo/bff/ecom/")
        @InterfaceC675040Qdq
        C15O7<C1515820pY4<n>> searchPhotoMixListByChunkPost(@InterfaceC1501370pAl("x-api-version") String str, @InterfaceC1501120pAM("key_preload_hash") String str2, @InterfaceC1501040pAE("image") TypedOutput typedOutput, @InterfaceC1501040pAE("image_uri") C08S1 c08s1, @InterfaceC1501040pAE("detection") C08S1 c08s12, @InterfaceC1501040pAE("detection_index") C08S1 c08s13, @InterfaceC1501040pAE("search_channel") C08S1 c08s14, @InterfaceC1501040pAE("cursor") Long l, @InterfaceC1501040pAE("keyword") C08S1 c08s15, @InterfaceC1501040pAE("enter_from") C08S1 c08s16, @InterfaceC1501040pAE("count") Integer num, @InterfaceC1501040pAE("hot_search") Integer num2, @InterfaceC1501040pAE("search_id") C08S1 c08s17, @InterfaceC1501040pAE("last_search_id") C08S1 c08s18, @InterfaceC1501040pAE("source") C08S1 c08s19, @InterfaceC1501040pAE("search_source") C08S1 c08s110, @InterfaceC1501040pAE("query_correct_type") Integer num3, @InterfaceC1501040pAE("search_context") C08S1 c08s111, @InterfaceC1501040pAE("attach_products") C08S1 c08s112, @InterfaceC1501040pAE("traffic_source_list") C08S1 c08s113, @InterfaceC1501040pAE("ec_search_session_id") C08S1 c08s114, @InterfaceC1501040pAE("search_session_id") C08S1 c08s115, @InterfaceC1501040pAE("product_detail_uri") C08S1 c08s116, @InterfaceC1501040pAE("recall_shield") Integer num4, @InterfaceC1501040pAE("photo_search_extra") C08S1 c08s117, @InterfaceC1501040pAE("force_intervene_card") List<PhotoSearchForceInterveneCard> list, @InterfaceC1501040pAE("end_to_end_search_session_id") Long l2, @InterfaceC1501040pAE("bcm_chain") C08S1 c08s118, @InterfaceC1501040pAE("ecom_user_actions") C08S1 c08s119, @InterfaceC1501040pAE("passThroughParams") C08S1 c08s120, @InterfaceC1501040pAE("photo_product_info") C08S1 c08s121, @InterfaceC1501040pAE("ec_page_feature_params") C08S1 c08s122, @InterfaceC1501040pAE("device_level") Integer num5, @InterfaceC1501040pAE("is_low_device") Integer num6, @InterfaceC1501040pAE("is_weak_network") Integer num7, @InterfaceC1501040pAE("user_interaction_type") int i, @InterfaceC1501040pAE("section_cursor") Long l3, @InterfaceC1501040pAE("enter_from_second") C08S1 c08s123, @InterfaceC1501040pAE("root_enter_from_type") Integer num8, @InterfaceC1501040pAE("client_request_id") C08S1 c08s124, @InterfaceC1501040pAE("is_retry") Integer num9, @InterfaceC2177008fw Object obj);
    }

    public static n LIZIZ(Map map, Map map2) {
        return ((RealApi) LIZIZ.getValue()).doMixSingleSearchPost(map, map2).get();
    }

    public static Object LIZ(@InterfaceC1501190pAT Map map, @InterfaceC1485605ri Map map2, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object c098200Yq;
        C1493620oyG c1493620oyG;
        RealApi realApi = (RealApi) ((InterfaceC2661011f) C452501pT.LIZIZ(new AwS95S1000000_10(LIZ, 13)).getValue()).create(RealApi.class);
        try {
            c098200Yq = (ECAiChatStreamTimeoutConfig) C0C64.LJIILLIIL().LJJII(ECAiChatStreamTimeoutConfig.class, C675230Qe9.LIZ, "ec_search_ai_chat_stream_timeout", true);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ECAiChatStreamTimeoutConfig eCAiChatStreamTimeoutConfig = (ECAiChatStreamTimeoutConfig) c098200Yq;
        if (eCAiChatStreamTimeoutConfig == null) {
            eCAiChatStreamTimeoutConfig = C675230Qe9.LIZ;
        }
        if (eCAiChatStreamTimeoutConfig.enable) {
            c1493620oyG = new C1493620oyG();
            long j = eCAiChatStreamTimeoutConfig.connectTimeoutMs;
            if (j > 0) {
                c1493620oyG.LIZJ = j;
            }
            long j2 = eCAiChatStreamTimeoutConfig.writeTimeoutMs;
            if (j2 > 0) {
                c1493620oyG.LJ = j2;
            }
            long j3 = eCAiChatStreamTimeoutConfig.readTimeoutMs;
            if (j3 > 0) {
                c1493620oyG.LIZLLL = j3;
            }
        } else {
            c1493620oyG = null;
        }
        if (realApi == null) {
            return null;
        }
        return realApi.aiChatStreamPost(map, map2, c1493620oyG, interfaceC1364105Vn);
    }
}
