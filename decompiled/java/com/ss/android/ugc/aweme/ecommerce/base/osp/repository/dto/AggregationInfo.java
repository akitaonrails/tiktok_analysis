package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionPanel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregationInfo {

    @C09CT("addon_desc_info")
    public AddonDescInfo addonDescInfo;

    @C09CT("group_rich_title")
    public ECRichText aggregationRichTitle;

    @C09CT("group_title")
    public String aggregationTitle;

    @C09CT("da_info")
    public Map<String, String> daInfo;

    @C09CT("disable_logistics_area_page")
    public Boolean disableLogisticsAreaPage;

    @C09CT("free_shipping_addon_panel")
    public AddonPanelInfo freeShippingAddonPanel;

    @C09CT("fulfill_title")
    public String fulfillTitle;

    @C09CT("group_shop_bill")
    public ShopBill groupShopBill;

    @C09CT("group_sub_title")
    public String groupSubTitle;

    @C09CT("item_quantity_desc")
    public String itemQuantityDesc;

    @C09CT("logistics")
    public List<LogisticDTO> logistics;

    @C09CT("logistic_expression_module")
    public LogisticPanelModule logisticsExpressionModule;

    @C09CT("logistics_title")
    public String logisticsTitle;

    @C09CT("group_logistics_panel_module")
    public LogisticsExpressionPanel mainOrderAggregateLogistic;

    @C09CT("main_order_ids")
    public List<String> mainOrderIds;

    @C09CT("product_panel_title")
    public String productPanelTitle;

    @C09CT("purchase_reward_banner")
    public PurchaseRewardInfo purchaseRewardBanner;

    @C09CT("selected_logistics_service_id")
    public String selectedLogisticsServiceId;

    @C09CT("shipment_type_title")
    public String shipmentTypeTitle;

    @C09CT("sku_num")
    public Integer skuNum;

    @C09CT("sub_order_group")
    public List<SubOrderGroup> subOrderGroup;

    public AggregationInfo() {
        this(null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, 0, null, null);
    }

    public AggregationInfo(List<String> list, List<SubOrderGroup> list2, String str, ECRichText eCRichText, List<LogisticDTO> list3, String str2, String str3, String str4, String str5, LogisticPanelModule logisticPanelModule, Boolean bool, LogisticsExpressionPanel logisticsExpressionPanel, String str6, Map<String, String> map, AddonPanelInfo addonPanelInfo, AddonDescInfo addonDescInfo, PurchaseRewardInfo purchaseRewardInfo, ShopBill shopBill, Integer num, String str7, String str8) {
        this.mainOrderIds = list;
        this.subOrderGroup = list2;
        this.aggregationTitle = str;
        this.aggregationRichTitle = eCRichText;
        this.logistics = list3;
        this.logisticsTitle = str2;
        this.selectedLogisticsServiceId = str3;
        this.itemQuantityDesc = str4;
        this.productPanelTitle = str5;
        this.logisticsExpressionModule = logisticPanelModule;
        this.disableLogisticsAreaPage = bool;
        this.mainOrderAggregateLogistic = logisticsExpressionPanel;
        this.fulfillTitle = str6;
        this.daInfo = map;
        this.freeShippingAddonPanel = addonPanelInfo;
        this.addonDescInfo = addonDescInfo;
        this.purchaseRewardBanner = purchaseRewardInfo;
        this.groupShopBill = shopBill;
        this.skuNum = num;
        this.shipmentTypeTitle = str7;
        this.groupSubTitle = str8;
    }
}
