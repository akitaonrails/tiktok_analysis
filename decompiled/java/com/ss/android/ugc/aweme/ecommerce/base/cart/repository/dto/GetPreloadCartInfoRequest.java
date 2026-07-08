package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class GetPreloadCartInfoRequest {

    @C09CT("add_item_source_page")
    public final Integer addItemSourcePage;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("pre_add_cart_item_data")
    public final PreAddCartItemData preAddCartItemData;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer preloadCartInfoScene;

    @C09CT("request_id")
    public final String requestId;

    public GetPreloadCartInfoRequest(Integer num, PreAddCartItemData preAddCartItemData, String str, Integer num2, String str2, String str3) {
        this.preloadCartInfoScene = num;
        this.preAddCartItemData = preAddCartItemData;
        this.pageSourceInfo = str;
        this.addItemSourcePage = num2;
        this.buyerAddrId = str2;
        this.requestId = str3;
    }
}
