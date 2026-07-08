package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.ProductInfoMeta;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonPanelInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("addon_banner_info")
    public AddonBannerInfo addonBannerInfo;

    @C09CT("addon_banner_infos")
    public List<AddonBannerInfo> addonBannerInfos;

    @C09CT("addon_panel_scene")
    public Integer addonPanelScene;

    @C09CT("addon_panel_type")
    public Integer addonPanelType;

    @C09CT("addon_promotion_info")
    public String addonPromotionInfo;

    @C09CT("addon_promotion_type")
    public Integer addonPromotionType;

    @C09CT("addon_for_recommendation")
    public String addonRecommendation;

    @C09CT("claim_voucher_type_ids")
    public List<String> claimVoucherTypeIds;

    @C09CT("content_stringify")
    public String contentStringify;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("amount_to_threshold")
    public String diffPrice;

    @C09CT("in_addon_progress")
    public Boolean inAddonProgress;

    @C09CT("product_info_list")
    public List<ProductInfoMeta> productInfoList;

    @C09CT("promotion_recommend_param")
    public PromotionRecommendParam promotionRecommendParam;

    @C09CT("schema")
    public String schema;

    @C09CT("top_banner_desc")
    public TopBannerDesc topBannerDesc;

    public AddonPanelInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public AddonPanelInfo(Integer num, TopBannerDesc topBannerDesc, AddonBannerInfo addonBannerInfo, String str, String str2, String str3, String str4, String str5, List<String> list, List<AddonBannerInfo> list2, Integer num2, String str6, Integer num3, List<ProductInfoMeta> list3, PromotionRecommendParam promotionRecommendParam, Boolean bool) {
        this.addonPromotionType = num;
        this.topBannerDesc = topBannerDesc;
        this.addonBannerInfo = addonBannerInfo;
        this.addonPromotionInfo = str;
        this.addonRecommendation = str2;
        this.daInfo = str3;
        this.schema = str4;
        this.diffPrice = str5;
        this.claimVoucherTypeIds = list;
        this.addonBannerInfos = list2;
        this.addonPanelType = num2;
        this.contentStringify = str6;
        this.addonPanelScene = num3;
        this.productInfoList = list3;
        this.promotionRecommendParam = promotionRecommendParam;
        this.inAddonProgress = bool;
    }
}
