package com.ss.android.ugc.aweme.poi.mapmode.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;

/* JADX INFO: loaded from: classes19.dex */
public interface PoiMapModePoiListApi {
    @InterfaceC1501200pAU("tiktok/poi/card_feed/get/v1")
    Object getPoiCategoryList(@InterfaceC1501070pAH("feed_sub_scene") Integer num, @InterfaceC1501070pAH("target_region") String str, @InterfaceC1501070pAH("tab_code") String str2, @InterfaceC1501070pAH("page") Integer num2, @InterfaceC1501070pAH("limit") Integer num3, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("region_name") String str3, @InterfaceC1501070pAH("poi_id") String str4, @InterfaceC1501070pAH("recommend_max_lng") String str5, @InterfaceC1501070pAH("recommend_max_lat") String str6, @InterfaceC1501070pAH("recommend_min_lng") String str7, @InterfaceC1501070pAH("recommend_min_lat") String str8, @InterfaceC1501070pAH("nearby_tab_name") String str9, @InterfaceC1501070pAH("recommend_center_lng") String str10, @InterfaceC1501070pAH("recommend_center_lat") String str11, @InterfaceC1501070pAH("gps_is_encrypted") Boolean bool, @InterfaceC1501070pAH("recall_radius") Integer num4, @InterfaceC1501070pAH("from_group_id") String str12, @InterfaceC1501070pAH("from_poi_id") String str13, InterfaceC1364105Vn<? super PoiMapModeResponse> interfaceC1364105Vn);
}
