package com.ss.android.ugc.aweme.ecommerce.base.addon.dto;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GetAddonPanelLayoutRequest {

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("new_scene")
    public final Integer newScene;

    @C09CT("page_context_info")
    public final PageContextInfo pageContext;

    @C09CT("pass_through_param")
    public final AddonPanelLayoutPassThroughParam passThroughParam;

    @C09CT("product_info_list")
    public final List<ProductInfoMeta> productInfoList;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("ship_to_addr")
    public final List<District> shipToAddr;

    @C09CT("page_source_info")
    public final String sourceInfo;

    @C09CT("winner_item_list")
    public final List<Feed> winnerItemList;

    public GetAddonPanelLayoutRequest(String str, PageContextInfo pageContextInfo, int i, List<ProductInfoMeta> list, Integer num, List<Feed> list2, String str2, List<District> list3, AddonPanelLayoutPassThroughParam addonPanelLayoutPassThroughParam) {
        this.sourceInfo = str;
        this.pageContext = pageContextInfo;
        this.scene = i;
        this.productInfoList = list;
        this.newScene = num;
        this.winnerItemList = list2;
        this.buyerAddrId = str2;
        this.shipToAddr = list3;
        this.passThroughParam = addonPanelLayoutPassThroughParam;
    }
}
