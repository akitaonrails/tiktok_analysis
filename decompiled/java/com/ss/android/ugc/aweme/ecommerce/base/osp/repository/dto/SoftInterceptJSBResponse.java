package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SoftInterceptJSBResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("addon_discount_desc")
    public final String addonDiscountDesc;

    @C09CT("addon_panel_info")
    public final AddonPanelInfo addonPanelInfo;

    @C09CT("block_description_text")
    public final String blockDescriptionText;

    @C09CT("block_notice_text")
    public final String blockNoticeText;

    @C09CT("context_product_info_list")
    public final List<ContextProductInfo> contextProductInfoList;

    @C09CT("diffPrice")
    public final String diffPrice;

    @C09CT("price")
    public final String price;

    @C09CT("selectNumber")
    public final String selectNumber;

    @C09CT("summary")
    public final String summary;

    public SoftInterceptJSBResponse() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public SoftInterceptJSBResponse(List<ContextProductInfo> list, String str, String str2, String str3, String str4, String str5, AddonPanelInfo addonPanelInfo, String str6, String str7) {
        this.contextProductInfoList = list;
        this.blockNoticeText = str;
        this.blockDescriptionText = str2;
        this.price = str3;
        this.selectNumber = str4;
        this.diffPrice = str5;
        this.addonPanelInfo = addonPanelInfo;
        this.addonDiscountDesc = str6;
        this.summary = str7;
    }
}
