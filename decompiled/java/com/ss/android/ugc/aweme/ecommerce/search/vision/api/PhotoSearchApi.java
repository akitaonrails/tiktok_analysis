package com.ss.android.ugc.aweme.ecommerce.search.vision.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501040pAE;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501370pAl;
import X.InterfaceC675040Qdq;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface PhotoSearchApi {
    @InterfaceC675040Qdq
    @InterfaceC1501170pAR("/aweme/v1/search/photo/ecom/")
    Object photoSearchRequest(@InterfaceC1501370pAl("x-api-version") String str, @InterfaceC1501040pAE("image") TypedOutput typedOutput, @InterfaceC1501040pAE("image_uri") String str2, @InterfaceC1501040pAE("detection") String str3, @InterfaceC1501040pAE("detection_index") String str4, @InterfaceC1501040pAE("search_channel") String str5, @InterfaceC1501040pAE("cursor") Long l, @InterfaceC1501040pAE("keyword") String str6, @InterfaceC1501040pAE("enter_from") String str7, @InterfaceC1501040pAE("count") Integer num, @InterfaceC1501040pAE("hot_search") Integer num2, @InterfaceC1501040pAE("search_id") String str8, @InterfaceC1501040pAE("last_search_id") String str9, @InterfaceC1501040pAE("source") String str10, @InterfaceC1501040pAE("search_source") String str11, @InterfaceC1501040pAE("query_correct_type") Integer num3, @InterfaceC1501040pAE("is_filter_search") Integer num4, @InterfaceC1501040pAE("filter_by") Integer num5, @InterfaceC1501040pAE("sort_type") Integer num6, @InterfaceC1501040pAE LinkedHashMap<String, Integer> linkedHashMap, @InterfaceC1501040pAE("search_context") String str12, @InterfaceC1501040pAE("sug_tag_text") String str13, @InterfaceC1501040pAE("sug_type") String str14, @InterfaceC1501040pAE("sug_query_state") String str15, @InterfaceC1501040pAE("sug_creator_id") String str16, @InterfaceC1501040pAE("attach_products") String str17, @InterfaceC1501040pAE("traffic_source_list") String str18, @InterfaceC1501040pAE("ec_search_session_id") String str19, @InterfaceC1501040pAE("search_session_id") String str20, @InterfaceC1501040pAE("product_detail_uri") String str21, @InterfaceC1501040pAE("recall_shield") Integer num7, @InterfaceC1501040pAE("photo_search_extra") String str22, @InterfaceC1501040pAE("force_intervene_card") List<PhotoSearchForceInterveneCard> list, @InterfaceC1501040pAE("end_to_end_search_session_id") Long l2, @InterfaceC1501040pAE("bcm_chain") String str23, @InterfaceC1501040pAE("ecom_user_actions") String str24, @InterfaceC1501040pAE("passThroughParams") String str25, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);
}
