package com.ss.android.ugc.aweme.poi.mapdetail.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiMapDetailPoiListApi {
    @InterfaceC1501200pAU("tiktok/poi/card_feed/get/v2")
    Object getPoiCategoryList(@InterfaceC1501070pAH("page") Integer num, @InterfaceC1501070pAH("limit") Integer num2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num3, @InterfaceC1501070pAH("recommend_max_lng") String str, @InterfaceC1501070pAH("recommend_max_lat") String str2, @InterfaceC1501070pAH("recommend_min_lng") String str3, @InterfaceC1501070pAH("recommend_min_lat") String str4, @InterfaceC1501070pAH("center_id") String str5, @InterfaceC1501070pAH("from_poi_id") String str6, @InterfaceC1501070pAH("center_recall_type") Integer num4, @InterfaceC1501070pAH("recall_radius_meter") Integer num5, @InterfaceC1501070pAH("filter_local_service_key_category") String str7, @InterfaceC1501070pAH("filter_option_list") String str8, @InterfaceC1501070pAH("is_user_select_window") Boolean bool, InterfaceC1364105Vn<? super PoiMapDetailResponse> interfaceC1364105Vn);
}
