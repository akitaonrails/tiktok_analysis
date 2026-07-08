package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpRecommendPreloadRequest {

    @C09CT("author_id")
    public final String authorId;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("enter_from_info")
    public final String enterFromInfo;

    @C09CT("experiment")
    public final Map<String, Object> experiment;

    @C09CT("first_source_page")
    public final String firstSourcePage;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_source_info")
    public final Integer productSourceInfo;

    @C09CT("recommend_parameter")
    public final Map<String, Object> recommendParams;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("session_refresh_index")
    public final int sessionRefreshIndex;

    @C09CT("size")
    public final int size;

    @C09CT("sub_scene")
    public final String subScene;

    @C09CT("traffic_source_list")
    public final List<Integer> trafficSourceList;

    public PdpRecommendPreloadRequest(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, String str6, String str7, Integer num, List<Integer> list, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.productId = str;
        this.scene = str2;
        this.subScene = str3;
        this.size = i;
        this.cursor = i2;
        this.sessionRefreshIndex = i3;
        this.firstSourcePage = str4;
        this.enterFromInfo = str5;
        this.authorId = str6;
        this.sellerId = str7;
        this.productSourceInfo = num;
        this.trafficSourceList = list;
        this.recommendParams = map;
        this.experiment = map2;
    }
}
