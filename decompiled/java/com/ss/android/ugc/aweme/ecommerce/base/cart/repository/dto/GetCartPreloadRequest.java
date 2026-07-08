package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class GetCartPreloadRequest {

    @C09CT("biz_id")
    public final String bizId;

    @C09CT("entry_from")
    public final Integer cartEntryFrom;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    @C09CT("traffic_source_list")
    public final List<Integer> trafficSourceList;

    public GetCartPreloadRequest(List<Integer> list, String str, String str2, Integer num, Integer num2) {
        this.trafficSourceList = list;
        this.pageSourceInfo = str;
        this.bizId = str2;
        this.cartEntryFrom = num;
        this.scene = num2;
    }
}
