package com.ss.android.ugc.aweme.ecommerce.base.addon.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GetRecommendDataRequest {

    @C09CT("cursor")
    public final int cursor;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("is_preload")
    public final boolean isPreload;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("previous_page")
    public final String previousPage;

    @C09CT("context_product_info_list")
    public final List<ProductInfoMeta> productInfoList;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("size")
    public final int size;

    @C09CT("winner_item_list")
    public final List<Feed> winnerItemList;

    public GetRecommendDataRequest(List<ProductInfoMeta> list, String str, String str2, String str3, String str4, int i, String str5, int i2, boolean z, List<Feed> list2) {
        this.productInfoList = list;
        this.scene = str;
        this.enterFrom = str2;
        this.previousPage = str3;
        this.pageSourceInfo = str4;
        this.cursor = i;
        this.sessionId = str5;
        this.size = i2;
        this.isPreload = z;
        this.winnerItemList = list2;
    }
}
