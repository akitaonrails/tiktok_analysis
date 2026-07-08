package com.ss.android.ugc.aweme.ecommerce.base.sku;

import X.AnonymousClass0405;
import X.C044N;
import X.C054G;
import X.C093Y;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C09CT;
import X.C0FNT;
import X.C1758140vqu;
import X.C189200o6;
import X.C23260099m;
import X.C919503ib;
import X.C958103op;
import X.C960603pE;
import X.C991303uB;
import X.InterfaceC1364105Vn;
import X.InterfaceC1748810vbr;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.goda.v2.model.dto.GodaV2Facade;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpProductMeasurementModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPriceV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecipientInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssemFragment;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartUiConfig;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.BizExtra;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelStarter {
    public static C23260099m LIZIZ;
    public static Long LIZJ;
    public static final SkuPanelStarter LIZ = new SkuPanelStarter();
    public static final HashSet<String> LIZLLL = C093Y.LIZJ("author_id", "campaign_channel", "campaign_id", "campaign_type", "campaign_user_tag", "enter_from", "enter_from_info", "enter_method", "entrance_form", "entrance_info", "follow_status", "filter_name", "filter_result", "is_fullscreen", "list_name", "list_num", "list_set", "original_price", "original_price_value", "product_id", "product_source", "product_type", "purchase_path", "request_id", "rights_cnt", "rights_content", "saleable_sku_num", "sales_price", "shop_id", "source", "source_button", "source_content_id", "source_page_type", "source_previous_page", "track_id", "volume", "video_shopping_list_style", "compo_name", "compo_type", "shop_status", "ad_id", "is_ad", "creative_id", "previous_page", "source_module", "shop_id", "is_cc_installment", "total_installment_cnt", "amount_per_installment", "is_free_interest", "free_interest_installment_cnt", "original_interest", "original_total_interest", "sales_interest", "sales_total_interest");

    public static final class SkuEnterParams implements Serializable {
        public static final int $stable = 8;

        @C09CT("add_to_cart_biz_extra")
        public final BizExtra addToCartBizExtra;

        @C09CT("add_to_cart_delegate_key")
        public final String addToCartDelegateKey;

        @C09CT("add_tocart_uiconfig")
        public AddToCartUiConfig addToCartUiConfig;

        @C09CT("biz_type")
        public final Integer bizType;

        @C09CT("button_area_id")
        public final String buttonAreaId;

        @C09CT("buyer_addr_id")
        public final String buyerAddrId;

        @C09CT("checked_spec_ids")
        public final String[] checkedSkuIds;

        @C09CT("click_from")
        public final int clickFrom;

        @C09CT("data_trans_id")
        public final String dataTransId;

        @C09CT("display_mode")
        public final Integer displayMode;

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("height")
        public final Float height;

        @C09CT("hide_pdp_entrance")
        public final Integer hidePdpEntrance;

        @C09CT("hide_stepper")
        public final boolean hideStepper;

        @C09CT("is_async_add_cart")
        public final boolean isAsyncAddCart;

        @C09CT("is_from_bundle_deal")
        public final Boolean isFromBundleDeal;

        @C09CT("is_slide_to_bnpl")
        public final Boolean isSlideToBnpl;

        @C09CT("logistics_service_id")
        public final String logisticsServiceID;

        @C09CT("virtual_bundle_main_product_id ")
        public final String mainProductId;

        @C09CT("need_request")
        public final boolean needRequest;

        @C09CT("need_toast")
        public final boolean needToast;

        @C09CT("ocp_context")
        public OneClickPayContext ocpContext;

        @C09CT("should_use_ocp")
        public final Integer ocpFlag;

        @C09CT("ocp_main_order_id")
        public final String ocpOrderId;

        @C09CT("old_price")
        public final String oldPrice;

        @C09CT("one_step_order_type")
        public final Integer oneStepOrderType;

        @C09CT("orderRequestParams")
        public final Map<String, Object> orderRequestParams;

        @C09CT("original_sku_info_for_exchange")
        public final Map<String, Object> originalSkuInfoForExchange;

        @C09CT("pdp_facade")
        public final GodaV2Facade pdpFacade;

        @C09CT("pdp_from")
        public final String pdpFrom;

        @C09CT("needs_dim")
        public final Boolean pdpFullScreen;

        @C09CT("pdpPageType")
        public final Integer pdpPageType;

        @C09CT("previous_page_id")
        public final String pdpPreviousPageId;

        @C09CT("pdp_unique_id")
        public final String pdpUniqueId;

        @C09CT("pdp_pipe_params")
        public final String pipeParams;

        @C09CT("previous_page")
        public final String previousPage;

        @C09CT("product_enter_context")
        public final Map<String, Object> productEnterContext;

        @C09CT("product_id")
        public final String productId;

        @C09CT("quantity")
        public Integer productQuantity;

        @C09CT("recipient_Info")
        public final RecipientInfo recipientInfo;

        @C09CT("user_virtual_info_id")
        public final String recipientInfoId;

        @C09CT("chain_key")
        public final String schemaChainKey;

        @C09CT("schema_custom_fields")
        public Map<String, ? extends Object> schemaCustomField;

        @C09CT("selected_insurance_info")
        public final InsuranceInfo selectedInsuranceInfo;

        @C09CT("skip_add_to_cart_ex_toast")
        public final Boolean skipAddToCartEXToast;

        @C09CT("sku_type")
        public final Integer skuType;

        @C09CT("source_btm_token")
        public final String sourceBtmToken;

        @C09CT("source_info")
        public final String sourceInfo;

        @C09CT("virtual_bundle_sub_product_index")
        public final Integer subProductIndex;

        @C09CT("trackParams")
        public final Map<String, Object> trackParams;

        @C09CT("visitReportParams")
        public final Map<String, Object> visitReportParams;

        @C09CT("voucher_type_id")
        public final String voucherTypeId;

        public final boolean isAsyncAddCart() {
            return this.isAsyncAddCart;
        }

        public final Boolean isFromBundleDeal() {
            return this.isFromBundleDeal;
        }

        public final Boolean isSlideToBnpl() {
            return this.isSlideToBnpl;
        }

        public final void setAddToCartUiConfig(AddToCartUiConfig addToCartUiConfig) {
            this.addToCartUiConfig = addToCartUiConfig;
        }

        public final void setOcpContext(OneClickPayContext oneClickPayContext) {
            this.ocpContext = oneClickPayContext;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public final void setSchemaCustomField(Map<String, ? extends Object> map) {
            this.schemaCustomField = map;
        }

        public SkuEnterParams(String str, Boolean bool, boolean z, int i, String str2, String[] strArr, Integer num, Map<String, Object> map, Map<String, Object> map2, String str3, Map<String, Object> map3, String str4, String str5, String str6, Map<String, Object> map4, String str7, String str8, String str9, Integer num2, Boolean bool2, Boolean bool3, String str10, Integer num3, Integer num4, Integer num5, Integer num6, Map<String, ? extends Object> map5, Float f, Integer num7, boolean z2, Integer num8, String str11, OneClickPayContext oneClickPayContext, boolean z3, String str12, boolean z4, String str13, String str14, String str15, Map<String, ? extends Object> map6, AddToCartUiConfig addToCartUiConfig, InsuranceInfo insuranceInfo, BizExtra bizExtra, String str16, String str17, GodaV2Facade godaV2Facade, String str18, Integer num9, RecipientInfo recipientInfo, String str19, String str20, Boolean bool4) {
            this.productId = str;
            this.pdpFullScreen = bool;
            this.needRequest = z;
            this.clickFrom = i;
            this.enterFrom = str2;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.trackParams = map;
            this.orderRequestParams = map2;
            this.pipeParams = str3;
            this.visitReportParams = map3;
            this.sourceInfo = str4;
            this.buyerAddrId = str5;
            this.logisticsServiceID = str6;
            this.productEnterContext = map4;
            this.pdpFrom = str7;
            this.oldPrice = str8;
            this.voucherTypeId = str9;
            this.pdpPageType = num2;
            this.isFromBundleDeal = bool2;
            this.isSlideToBnpl = bool3;
            this.previousPage = str10;
            this.hidePdpEntrance = num3;
            this.bizType = num4;
            this.skuType = num5;
            this.displayMode = num6;
            this.originalSkuInfoForExchange = map5;
            this.height = f;
            this.oneStepOrderType = num7;
            this.isAsyncAddCart = z2;
            this.ocpFlag = num8;
            this.ocpOrderId = str11;
            this.ocpContext = oneClickPayContext;
            this.hideStepper = z3;
            this.sourceBtmToken = str12;
            this.needToast = z4;
            this.addToCartDelegateKey = str13;
            this.schemaChainKey = str14;
            this.pdpUniqueId = str15;
            this.schemaCustomField = map6;
            this.addToCartUiConfig = addToCartUiConfig;
            this.selectedInsuranceInfo = insuranceInfo;
            this.addToCartBizExtra = bizExtra;
            this.buttonAreaId = str16;
            this.pdpPreviousPageId = str17;
            this.pdpFacade = godaV2Facade;
            this.mainProductId = str18;
            this.subProductIndex = num9;
            this.recipientInfo = recipientInfo;
            this.recipientInfoId = str19;
            this.dataTransId = str20;
            this.skipAddToCartEXToast = bool4;
        }
    }

    public static final class SkuRenderParams {
        public static final int $stable = 8;

        @C09CT("add_to_cart_button")
        public final AddToCartButton addToCartButton;

        @C09CT("checked_sku_ids")
        public String[] checkedSkuIds;

        @C09CT("click_spec_group_ids")
        public ArrayList<Integer> clickSpecGroupIds;

        @C09CT("default_pre_select_sku_ids")
        public String[] defaultPreSelectSkuIds;

        @C09CT("default_pre_select_type")
        public String defaultPreSelectType;

        @C09CT("enter_from")
        public final String enterFrom;

        @C09CT("is_default_pre_select")
        public Integer isDefaultPreSelect;

        @C09CT("is_sku_manually_selected")
        public Boolean isSkuManuallySelected;

        @C09CT("product_image")
        public final Image mainPicture;

        @C09CT("payment_module")
        public final PdpPaymentModule paymentModule;

        @C09CT("product_measurement_module")
        public final PdpProductMeasurementModule pdpProductMeasurementModule;

        @C09CT("period_text")
        public final String periodText;

        @C09CT("product_price")
        public final ProductPrice price;

        @C09CT("product_price_v2")
        public final List<ProductPriceV2> priceV2;

        @C09CT("product_id")
        public final String productId;

        @C09CT("product")
        public final ProductPackStruct productInfoPack;

        @C09CT("quantity")
        public Integer productQuantity;

        @C09CT("purchase_method_type")
        public final Integer purchaseMethodType;

        @C09CT("specs")
        public final List<SaleProp> salePropList;

        @C09CT("address_id")
        public String selectedAddressId;

        @C09CT("seller_id")
        public final String sellerId;

        @C09CT("sku_core_biz_da_info")
        public final Map<String, Map<String, Object>> skuCoreBizDaInfo;

        @C09CT("skus")
        public final List<SkuItem> skuList;

        @C09CT("sku_selling_point_group")
        public final SellingPointGroup skuSellingPointGroup;

        public final AddToCartButton getAddToCartButton() {
            return this.addToCartButton;
        }

        public final String[] getCheckedSkuIds() {
            return this.checkedSkuIds;
        }

        public final ArrayList<Integer> getClickSpecGroupIds() {
            return this.clickSpecGroupIds;
        }

        public final String[] getDefaultPreSelectSkuIds() {
            return this.defaultPreSelectSkuIds;
        }

        public final String getDefaultPreSelectType() {
            return this.defaultPreSelectType;
        }

        public final String getEnterFrom() {
            return this.enterFrom;
        }

        public final Image getMainPicture() {
            return this.mainPicture;
        }

        public final PdpPaymentModule getPaymentModule() {
            return this.paymentModule;
        }

        public final PdpProductMeasurementModule getPdpProductMeasurementModule() {
            return this.pdpProductMeasurementModule;
        }

        public final String getPeriodText() {
            return this.periodText;
        }

        public final ProductPrice getPrice() {
            return this.price;
        }

        public final List<ProductPriceV2> getPriceV2() {
            return this.priceV2;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final ProductPackStruct getProductInfoPack() {
            return this.productInfoPack;
        }

        public final Integer getProductQuantity() {
            return this.productQuantity;
        }

        public final Integer getPurchaseMethodType() {
            return this.purchaseMethodType;
        }

        public final List<SaleProp> getSalePropList() {
            return this.salePropList;
        }

        public final String getSelectedAddressId() {
            return this.selectedAddressId;
        }

        public final String getSellerId() {
            return this.sellerId;
        }

        public final Map<String, Map<String, Object>> getSkuCoreBizDaInfo() {
            return this.skuCoreBizDaInfo;
        }

        public final List<SkuItem> getSkuList() {
            return this.skuList;
        }

        public final SellingPointGroup getSkuSellingPointGroup() {
            return this.skuSellingPointGroup;
        }

        public final Integer isDefaultPreSelect() {
            return this.isDefaultPreSelect;
        }

        public final Boolean isSkuManuallySelected() {
            return this.isSkuManuallySelected;
        }

        public final void setCheckedSkuIds(String[] strArr) {
            this.checkedSkuIds = strArr;
        }

        public final void setClickSpecGroupIds(ArrayList<Integer> arrayList) {
            this.clickSpecGroupIds = arrayList;
        }

        public final void setDefaultPreSelect(Integer num) {
            this.isDefaultPreSelect = num;
        }

        public final void setDefaultPreSelectSkuIds(String[] strArr) {
            this.defaultPreSelectSkuIds = strArr;
        }

        public final void setDefaultPreSelectType(String str) {
            this.defaultPreSelectType = str;
        }

        public final void setProductQuantity(Integer num) {
            this.productQuantity = num;
        }

        public final void setSelectedAddressId(String str) {
            this.selectedAddressId = str;
        }

        public final void setSkuManuallySelected(Boolean bool) {
            this.isSkuManuallySelected = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SkuRenderParams(String str, String[] strArr, Integer num, List<SkuItem> list, List<SaleProp> list2, String str2, ProductPrice productPrice, List<ProductPriceV2> list3, Image image, String str3, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, ProductPackStruct productPackStruct, String str4, ArrayList<Integer> arrayList, PdpProductMeasurementModule pdpProductMeasurementModule, SellingPointGroup sellingPointGroup, Integer num2, String str5, Integer num3, String str6, String[] strArr2, Boolean bool, Map<String, ? extends Map<String, ? extends Object>> map) {
            this.productId = str;
            this.checkedSkuIds = strArr;
            this.productQuantity = num;
            this.skuList = list;
            this.salePropList = list2;
            this.enterFrom = str2;
            this.price = productPrice;
            this.priceV2 = list3;
            this.mainPicture = image;
            this.sellerId = str3;
            this.addToCartButton = addToCartButton;
            this.paymentModule = pdpPaymentModule;
            this.productInfoPack = productPackStruct;
            this.selectedAddressId = str4;
            this.clickSpecGroupIds = arrayList;
            this.pdpProductMeasurementModule = pdpProductMeasurementModule;
            this.skuSellingPointGroup = sellingPointGroup;
            this.purchaseMethodType = num2;
            this.periodText = str5;
            this.isDefaultPreSelect = num3;
            this.defaultPreSelectType = str6;
            this.defaultPreSelectSkuIds = strArr2;
            this.isSkuManuallySelected = bool;
            this.skuCoreBizDaInfo = map;
        }
    }

    public static Long LJ() {
        return LIZJ;
    }

    public static void LIZ(SkuPanelState skuPanelState) {
        C23260099m c23260099m = LIZIZ;
        if (c23260099m != null) {
            C189200o6.m2constructorimpl(skuPanelState);
            c23260099m.resumeWith(skuPanelState);
        }
        LIZIZ = null;
    }

    public static void LJII(Long l) {
        LIZJ = l;
    }

    public static final class SkuKeyboardVisibilityParams {

        @C09CT("keyboard_height")
        public final int keyboardHeight;

        @C09CT("keyboard_visibility")
        public final boolean keyboardVisibility;

        public SkuKeyboardVisibilityParams(boolean z, int i) {
            this.keyboardVisibility = z;
            this.keyboardHeight = i;
        }
    }

    public static final class SkuOperationParams {

        @C09CT("product_id")
        public final String productId;

        @C09CT("type")
        public final int type;

        public SkuOperationParams(String str, int i) {
            this.productId = str;
            this.type = i;
        }
    }

    public static IPdpStarter.PdpEnterParam LIZIZ(SkuEnterParams skuEnterParams, String str) {
        Map<String, Object> map;
        String str2;
        Map<String, Object> map2;
        OneClickPayContext oneClickPayContext;
        int i;
        Map<String, Object> map3;
        Integer num;
        Integer num2;
        String str3;
        OneClickPayContext oneClickPayContext2;
        String str4;
        Object obj;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (skuEnterParams != null) {
            String str5 = skuEnterParams.productId;
            if (str5 != null) {
                concurrentHashMap.put("product_id", Collections.singletonList(str5));
            }
            Map<String, Object> map4 = skuEnterParams.orderRequestParams;
            if (map4 != null && (obj = map4.get("is_from_follow")) != null) {
                concurrentHashMap.put("is_from_follow", obj);
            }
            OneClickPayContext oneClickPayContext3 = skuEnterParams.ocpContext;
            if (oneClickPayContext3 != null) {
                concurrentHashMap.put("one_click_pay_context", oneClickPayContext3);
            }
            Integer num3 = skuEnterParams.displayMode;
            if (num3 != null) {
                concurrentHashMap.put("sku_panel_display_mode", Integer.valueOf(num3.intValue()));
            }
            Map<String, Object> map5 = skuEnterParams.originalSkuInfoForExchange;
            if (map5 != null) {
                concurrentHashMap.put("original_sku_info_for_exchange", map5);
            }
            String str6 = skuEnterParams.mainProductId;
            if (str6 != null) {
                concurrentHashMap.put("virtual_bundle_main_product_id", str6);
            }
            Integer num4 = skuEnterParams.subProductIndex;
            if (num4 != null) {
                concurrentHashMap.put("virtual_bundle_sub_product_index", Integer.valueOf(num4.intValue()));
            }
        }
        String str7 = null;
        if (skuEnterParams != null) {
            map = skuEnterParams.orderRequestParams;
            str2 = skuEnterParams.pipeParams;
            map2 = skuEnterParams.visitReportParams;
        } else {
            map = null;
            str2 = null;
            map2 = null;
        }
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        if (skuEnterParams != null) {
            Map<String, Object> map6 = skuEnterParams.trackParams;
            if (map6 != null) {
                concurrentHashMap2.putAll(map6);
            }
            oneClickPayContext = skuEnterParams.ocpContext;
        } else {
            oneClickPayContext = null;
        }
        boolean zBooleanValue = false;
        if (oneClickPayContext != null) {
            i = 1;
        } else {
            i = 0;
        }
        concurrentHashMap2.put("is_one_click_pay", Integer.valueOf(i));
        concurrentHashMap2.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        if (skuEnterParams != null) {
            Boolean bool = skuEnterParams.pdpFullScreen;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            map3 = skuEnterParams.productEnterContext;
            num = skuEnterParams.bizType;
            num2 = skuEnterParams.ocpFlag;
            str3 = skuEnterParams.ocpOrderId;
            oneClickPayContext2 = skuEnterParams.ocpContext;
            str4 = skuEnterParams.recipientInfoId;
        } else {
            map3 = null;
            num = null;
            num2 = null;
            str3 = null;
            oneClickPayContext2 = null;
            str4 = null;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam = new IPdpStarter.PdpEnterParam(concurrentHashMap, map, concurrentHashMap2, str2, map2, zBooleanValue, null, C958103op.LIZJ(), null, true, true, false, map3, null, new ConcurrentHashMap(), null, null, null, num, null, oneClickPayContext2, num2, str3, null, str, null, null, false, null, null, false, 0, null, null, str4, false, null);
        if (skuEnterParams != null) {
            str7 = skuEnterParams.sourceInfo;
        }
        pdpEnterParam.setSourceInfo(str7);
        return pdpEnterParam;
    }

    public static Map LIZLLL(SkuEnterParams skuEnterParams, String str, Map map) {
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = skuEnterParams.productId;
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("product_id", str2);
        Boolean bool = skuEnterParams.pdpFullScreen;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        linkedHashMap.put("needs_dim", Boolean.valueOf(zBooleanValue));
        linkedHashMap.put("need_request", Boolean.valueOf(skuEnterParams.needRequest));
        linkedHashMap.put("click_from", Integer.valueOf(skuEnterParams.clickFrom));
        String str3 = skuEnterParams.enterFrom;
        if (str3 != null) {
            linkedHashMap.put("enter_from", str3);
        }
        Integer num = skuEnterParams.hidePdpEntrance;
        if (num != null) {
            linkedHashMap.put("hide_pdp_entrance", Integer.valueOf(num.intValue()));
        }
        Integer num2 = skuEnterParams.skuType;
        if (num2 != null) {
            linkedHashMap.put("sku_type", Integer.valueOf(num2.intValue()));
        }
        String[] strArr = skuEnterParams.checkedSkuIds;
        if (strArr != null) {
            linkedHashMap.put("checked_spec_ids", strArr);
        }
        Integer num3 = skuEnterParams.productQuantity;
        if (num3 != null) {
            linkedHashMap.put("quantity", Integer.valueOf(num3.intValue()));
        }
        Map<String, Object> map2 = skuEnterParams.trackParams;
        if (map2 != null) {
            linkedHashMap.put("trackParams", map2);
            if (map != null) {
                map.put("previous_page", str);
            }
        }
        String str4 = skuEnterParams.pipeParams;
        if (str4 != null) {
            linkedHashMap.put("pdp_pipe_params", str4);
        }
        Map<String, Object> map3 = skuEnterParams.orderRequestParams;
        if (map3 != null) {
            linkedHashMap.put("orderRequestParams", map3);
        }
        Map<String, Object> map4 = skuEnterParams.visitReportParams;
        if (map4 != null) {
            linkedHashMap.put("visitReportParams", map4);
        }
        String str5 = skuEnterParams.sourceInfo;
        if (str5 != null) {
            linkedHashMap.put("source_info", str5);
        }
        String str6 = skuEnterParams.buyerAddrId;
        if (str6 != null) {
            linkedHashMap.put("buyer_addr_id", str6);
        }
        String str7 = skuEnterParams.logisticsServiceID;
        if (str7 != null) {
            linkedHashMap.put("logistics_service_id", str7);
        }
        String str8 = skuEnterParams.pdpFrom;
        if (str8 != null) {
            linkedHashMap.put("pdp_from", str8);
        }
        String str9 = skuEnterParams.oldPrice;
        if (str9 != null) {
            linkedHashMap.put("old_price", str9);
        }
        String str10 = skuEnterParams.voucherTypeId;
        if (str10 != null) {
            linkedHashMap.put("voucher_type_id", str10);
        }
        Integer num4 = skuEnterParams.pdpPageType;
        if (num4 != null) {
            linkedHashMap.put("pdp_page_type", Integer.valueOf(num4.intValue()));
        }
        linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("is_async_add_cart", Boolean.valueOf(skuEnterParams.isAsyncAddCart()));
        Integer num5 = skuEnterParams.ocpFlag;
        if (num5 != null) {
            linkedHashMap.put("should_use_ocp", Integer.valueOf(num5.intValue()));
        }
        String str11 = skuEnterParams.ocpOrderId;
        if (str11 != null) {
            linkedHashMap.put("ocp_main_order_id", str11);
        }
        OneClickPayContext oneClickPayContext = skuEnterParams.ocpContext;
        if (oneClickPayContext != null) {
            linkedHashMap.put("ocp_context", oneClickPayContext);
        }
        Integer num6 = skuEnterParams.bizType;
        if (num6 != null) {
            linkedHashMap.put("biz_type", Integer.valueOf(num6.intValue()));
        }
        String str12 = skuEnterParams.sourceBtmToken;
        if (str12 != null) {
            linkedHashMap.put("source_btm_token", str12);
        }
        String str13 = skuEnterParams.schemaChainKey;
        if (str13 != null) {
            linkedHashMap.put("chain_key", str13);
        }
        Boolean boolIsSlideToBnpl = skuEnterParams.isSlideToBnpl();
        if (boolIsSlideToBnpl != null) {
            linkedHashMap.put("is_slide_to_bnpl", Boolean.valueOf(boolIsSlideToBnpl.booleanValue()));
        }
        String str14 = skuEnterParams.pdpUniqueId;
        if (str14 != null) {
            linkedHashMap.put("pdp_unique_id", str14);
        }
        Map<String, ? extends Object> map5 = skuEnterParams.schemaCustomField;
        if (map5 != null) {
            linkedHashMap.put("schema_custom_fields", map5);
        }
        InsuranceInfo insuranceInfo = skuEnterParams.selectedInsuranceInfo;
        if (insuranceInfo != null) {
            linkedHashMap.put("selected_insurance_info", insuranceInfo);
        }
        Integer num7 = skuEnterParams.displayMode;
        if (num7 != null) {
            linkedHashMap.put("display_mode", Integer.valueOf(num7.intValue()));
        }
        BizExtra bizExtra = skuEnterParams.addToCartBizExtra;
        if (bizExtra != null) {
            linkedHashMap.put("add_to_cart_biz_extra", bizExtra);
        }
        String str15 = skuEnterParams.buttonAreaId;
        if (str15 != null) {
            linkedHashMap.put("button_area_id", str15);
        }
        GodaV2Facade godaV2Facade = skuEnterParams.pdpFacade;
        if (godaV2Facade != null) {
            linkedHashMap.put("pdp_facade", godaV2Facade);
        }
        String str16 = skuEnterParams.mainProductId;
        if (str16 != null) {
            linkedHashMap.put("virtual_bundle_main_product_id ", str16);
        }
        Integer num8 = skuEnterParams.subProductIndex;
        if (num8 != null) {
            linkedHashMap.put("virtual_bundle_sub_product_index", Integer.valueOf(num8.intValue()));
        }
        RecipientInfo recipientInfo = skuEnterParams.recipientInfo;
        if (recipientInfo != null) {
            linkedHashMap.put("recipient_info", recipientInfo);
        }
        String str17 = skuEnterParams.dataTransId;
        if (str17 != null) {
            linkedHashMap.put("data_trans_id", str17);
        }
        Boolean bool2 = skuEnterParams.skipAddToCartEXToast;
        if (bool2 != null) {
            linkedHashMap.put("skip_add_to_cart_ex_toast", Boolean.valueOf(bool2.booleanValue()));
        }
        return linkedHashMap;
    }

    public static Object LJFF(Context context, SkuEnterParams skuEnterParams, String str, InterfaceC1748810vbr interfaceC1748810vbr, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (skuEnterParams.productId == null) {
            return null;
        }
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        LIZIZ = c23260099m;
        LIZ.getClass();
        SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, "aweme://ec/sku", LIZLLL(skuEnterParams, str, skuEnterParams.trackParams), false);
        if (interfaceC1748810vbr != null) {
            C960603pE.LJIIIIZZ(smartRouteLIZIZ, interfaceC1748810vbr);
        }
        smartRouteLIZIZ.open();
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final void LJI(Context context, FragmentManager fragmentManager, Bundle bundle, String str, SkuEnterParams skuEnterParams) {
        ProductPackStruct productPackStruct;
        if (str == null) {
            return;
        }
        if (!AnonymousClass0405.LIZIZ()) {
            C044N.LIZJ(0L, context);
            SkuPanelAssemFragment skuPanelAssemFragment = new SkuPanelAssemFragment();
            skuPanelAssemFragment.setArguments(bundle);
            skuPanelAssemFragment.show(fragmentManager, "SkuPanelFragment");
            return;
        }
        C054G c054g = C1758140vqu.LIZ;
        Pair pairLIZJ = C1758140vqu.LIZJ(skuEnterParams.productId);
        Activity activityLIZ = C0FNT.LIZ(context);
        if (pairLIZJ != null) {
            productPackStruct = (ProductPackStruct) pairLIZJ.getFirst();
        } else {
            productPackStruct = null;
        }
        C991303uB.LIZJ(activityLIZ, productPackStruct, null);
        SeaSkuPanelFragment seaSkuPanelFragment = new SeaSkuPanelFragment();
        seaSkuPanelFragment.setArguments(bundle);
        seaSkuPanelFragment.show(fragmentManager, "SkuPanelFragment");
    }
}
