package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C03O0;
import X.C09CT;
import X.C1019103yf;
import X.C13BV;
import X.C15438062q;
import X.C718702rJ;
import X.C722002rq;
import X.EnumC1014603xw;
import X.EnumC804703Cj;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Promotion;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.MiniCheckoutPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.usertrust.UserTrustModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes2.dex */
public final class BillInfoData {
    public transient Boolean LIZ;

    @C09CT("add_note_statement")
    public LinkRichText addNoteText;

    @C09CT("addition_payment_summary")
    public Map<String, PaymentBillSummaryList> additionPaymentSummary;

    @C09CT("addition_summary")
    public Map<String, Summary> additionSummary;

    @C09CT("addon_order")
    public AddonOrder addonOrder;

    @C09CT("addon_panel_info")
    public AddonPanelInfo addonPanelInfo;

    @C09CT("address_input_item")
    public InputItemData addressInputItemData;

    @C09CT("age_confirm_module")
    public AgeConfirmModule ageConfirmModule;

    @C09CT("announcements")
    public List<Announcement> announcement;

    @C09CT("auto_claimed_vouchers")
    public List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> autoVouchers;

    @C09CT("begin_render_chunk")
    public Boolean beginRenderChunk;

    @C09CT("bill_info_server_params")
    public String billInfoParams;

    @C09CT("bonus_module")
    public BonusModule bonusModule;

    @C09CT("bottom_abnormal_banner")
    public BottomAbnormalBanner bottomAbnormalBanner;

    @C09CT("bottom_cashback_banner")
    public BottomCashbackBanner bottomCashbackBanner;

    @C09CT("bottom_notice")
    public OSPBottomNotice bottomNotice;

    @C09CT("button_pop_tips")
    public String buttonPopTips;

    @C09CT("buyer_protection_program")
    public LinkRichText buyerProtectionProgram;

    @C09CT("change_info")
    public ChangeInfo changeInfo;

    @C09CT("chunk_debug_info")
    public ChunkDebugInfo chunkDebugInfo;

    @C09CT("cost_da_info")
    public String costDaInfo;

    @C09CT("cpf_info")
    public BillCpfInfo cpfInfo;

    @C09CT("create_order_info_from_bill")
    public String createOrderInfoFromBill;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("digital_delivery")
    public DigitalDelivery digitalDelivery;

    @C09CT("donation_display_module")
    public DonationDisplayModule donationDisplayModule;

    @C09CT("email_authorization_info")
    public EmailAuthorizationInfo emailAuthorizationInfo;

    @C09CT("exception_ux")
    public ExceptionUX exceptionUX;

    @C09CT("extra_fee_statement")
    public ExtraFeeStatement extraFeeStatement;

    @C09CT("first_load_da_info")
    public String firstLoadDaInfo;

    @C09CT("fulfillment_group_display_type")
    public Integer fullfillmentGroupDisplayType;

    @C09CT("identity_info")
    public IdentityInfo identityInfo;

    @C09CT("last_chunk")
    public Boolean lastChunk;

    @C09CT("leading_elevator_bar")
    public LeadingElevatorBar leadingElevatorBar;

    @C09CT("logistic_data")
    public LogisticData logisticData;

    @C09CT("mini_checkout_popup_list")
    public List<MiniCheckoutPopup> miniCheckoutPopupList;

    @C09CT("shop_orders_new")
    public List<ShopOrderNew> newShopOrders;

    @C09CT("order_group")
    public List<AggregationInfo> orderGroup;

    @C09CT("order_secret")
    public String orderSecret;

    @C09CT("osp_button_banner_info")
    public OspButtonBannerInfo ospButtonBannerInfo;

    @C09CT("osp_button_info")
    public ButtonInfo ospButtonInfo;

    @C09CT("osp_place_order_button")
    public OspPlaceOrderButton ospPlaceOrderButton;

    @C09CT("outside_selling_points_bubble")
    public SeaPdpSellingPointsGroup outsideSellingPointsBubble;

    @C09CT("page_header_carousel")
    public PageHeaderCarousel pageHeaderCarousel;

    @C09CT("payment_methods")
    public PaymentMethodsData paymentMethods;

    @C09CT("payment_summary")
    public List<PaymentBillSummary> paymentSummary;

    @C09CT("place_order_button_text")
    public StarlingKeyValue placeOrderButtonText;

    @C09CT("place_order_intercept_info")
    public String placeOrderInterceptInfo;

    @C09CT("platform_promotion")
    public PlatformPromotion platformPromotion;

    @C09CT("platform_right")
    public PlatformRight platformRight;

    @C09CT("policy_data")
    public PolicyModule policyModule;

    @C09CT("pre_risk_param")
    public n preRiskParam;

    @C09CT("privacy_policy_statement")
    public LinkRichText privacyPolicyStatement;

    @C09CT("privacy_popup")
    public PrivacyPopup privacyPopup;

    @C09CT("promotion_da_info")
    public String promotionDaInfo;

    @C09CT("pudo_shipping_address")
    public ShippingAddress pudoShippingAddress;

    @C09CT("refundable_sample_module")
    public RefundableSampleModule refundableSampleModule;

    @C09CT("layout")
    public Map<String, ModuleLayout> remoteLayoutMap;

    @C09CT("request_id")
    public String requestId;

    @C09CT("retention_dialog_info")
    public RetentionDialogInfo retentionDialogInfo;

    @C09CT("right_guidance_module")
    public RightGuidanceModule rightGuidanceModule;

    @C09CT("schema_info")
    public DynamicSchema schemaInfo;

    @C09CT("settings")
    public BillInfoSetting settings;

    @C09CT("shipping_address")
    public ShippingAddress shippingAddress;

    @C09CT("shipping_address_switch")
    public ShippingAddressSwitch shippingAddressSwitch;

    @C09CT("sku_common_config")
    public SkuCommonConfig skuCommonConfig;

    @C09CT("sku_selection")
    public SkuSelection skuSelection;

    @C09CT("place_order_block_panel")
    public SoftInterceptItem softInterceptItem;

    @C09CT("starling_texts")
    public BillStarling starlingTexts;

    @C09CT("summary")
    public Summary summary;

    @C09CT("toast")
    public String toast;

    @C09CT("top_banners")
    public List<Banner> topBanners;

    @C09CT("top_notice")
    public String topNotice;

    @C09CT("top_user_trust_infos")
    public List<TopUserTrustInfo> topUserTrustInfos;

    @C09CT("under_age_confirm_dialog")
    public AuthorizationDialog underAgeConfirmDialog;

    @C09CT("use_user_selection")
    public String useUserSelection;

    @C09CT("user_benefit_draw_schema")
    public String userBenefitDrawSchema;

    @C09CT("user_right_module_info")
    public ExposeUserRightPanel userRightModuleInfo;

    @C09CT("user_trust_module")
    public UserTrustModule userTrustModule;

    @C09CT("version")
    public String version;

    public BillInfoData() {
    }

    public final List<ShopOrderNew> LIZIZ() {
        ArrayList arrayList;
        List<ShopOrderNew> list = this.newShopOrders;
        if (list == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (ShopOrderNew shopOrderNew : list) {
            List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (MainOrderInfo mainOrderInfo : list2) {
                    String str = mainOrderInfo.warehouseId;
                    List<PackedSku> list3 = mainOrderInfo.packedSkus;
                    Boolean bool = mainOrderInfo.reachable;
                    String str2 = mainOrderInfo.unreachableReason;
                    List<LogisticDTO> list4 = mainOrderInfo.logistics;
                    String str3 = mainOrderInfo.selectedLogisticsServiceId;
                    MultiLogisticsPanelInfo multiLogisticsPanelInfo = mainOrderInfo.multiLogisticsPanelInfo;
                    WarehouseTag warehouseTag = mainOrderInfo.warehouseTag;
                    String str4 = mainOrderInfo.shippingTitle;
                    String str5 = mainOrderInfo.mainOrderId;
                    MainOrderAvailableInfo mainOrderAvailableInfo = mainOrderInfo.availableInfo;
                    LogisticPanelModule logisticPanelModule = mainOrderInfo.logisticsExpressionModule;
                    LogisticPanelModule logisticPanelModule2 = mainOrderInfo.logisticsPanelModule;
                    AddonPanelInfo addonPanelInfo = mainOrderInfo.freeShippingAddonPanel;
                    Boolean bool2 = mainOrderInfo.isPudoLogisticsServiceSelected;
                    String str6 = mainOrderInfo.selectedPudoId;
                    mainOrderInfo.getClass();
                    arrayList.add(MainOrderInfo.LIZ(str, list3, bool, str2, list4, str3, multiLogisticsPanelInfo, warehouseTag, str4, str5, mainOrderAvailableInfo, logisticPanelModule, logisticPanelModule2, addonPanelInfo, bool2, str6));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(ShopOrderNew.LIZ(shopOrderNew, arrayList, 131007));
        }
        return arrayList2;
    }

    public final String LIZLLL() {
        List<MainOrderInfo> list;
        List<PackedSku> list2;
        Map<String, String> map;
        String str;
        StringBuilder sb = new StringBuilder();
        List<ShopOrderNew> list3 = this.newShopOrders;
        if (list3 != null) {
            for (ShopOrderNew shopOrderNew : list3) {
                if (shopOrderNew != null && (list = shopOrderNew.mainOrderInfos) != null) {
                    for (MainOrderInfo mainOrderInfo : list) {
                        if (mainOrderInfo != null && (list2 = mainOrderInfo.packedSkus) != null) {
                            for (PackedSku packedSku : list2) {
                                if (packedSku != null && (map = packedSku.extra) != null && (str = map.get("first_category_name")) != null) {
                                    if (sb.length() > 0) {
                                        sb.append(";");
                                    }
                                    sb.append(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] LJ() {
        Object value;
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        if (map == null || map.isEmpty()) {
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR26;
            RuntimeException runtimeException = new RuntimeException("orderSubmit layout is null or empty");
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, runtimeException, C03O0.LIZIZ);
            return new String[0];
        }
        TreeMap treeMap = new TreeMap();
        Map<String, ModuleLayout> map2 = this.remoteLayoutMap;
        if (map2 != null) {
            for (Map.Entry<String, ModuleLayout> entry : map2.entrySet()) {
                String key = entry.getKey();
                C718702rJ c718702rJLIZ = entry.getValue().LIZ();
                if (u.LJIJI(c718702rJLIZ.LIZIZ, EnumC804703Cj.OSP_PAGE.getValue(), true)) {
                    treeMap.put(Integer.valueOf(c718702rJLIZ.LIZ), key);
                }
            }
        }
        int size = treeMap.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            Map.Entry entryPollFirstEntry = treeMap.pollFirstEntry();
            if (entryPollFirstEntry == null || (value = entryPollFirstEntry.getValue()) == null) {
                value = "";
            }
            strArr[i] = value;
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OSPPageModuleConfig[] LJFF() {
        Object oSPPageModuleConfig;
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        if (map == null || map.isEmpty()) {
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR26;
            RuntimeException runtimeException = new RuntimeException("orderSubmit layout is null or empty");
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, runtimeException, C03O0.LIZIZ);
            return new OSPPageModuleConfig[0];
        }
        TreeMap treeMap = new TreeMap();
        Map<String, ModuleLayout> map2 = this.remoteLayoutMap;
        if (map2 != null) {
            for (Map.Entry<String, ModuleLayout> entry : map2.entrySet()) {
                String key = entry.getKey();
                C718702rJ c718702rJLIZ = entry.getValue().LIZ();
                if (u.LJIJI(c718702rJLIZ.LIZIZ, EnumC804703Cj.OSP_PAGE.getValue(), true)) {
                    treeMap.put(Integer.valueOf(c718702rJLIZ.LIZ), new OSPPageModuleConfig(key, c718702rJLIZ.LIZJ, c718702rJLIZ.LIZLLL, c718702rJLIZ.LJ));
                }
            }
        }
        int size = treeMap.size();
        OSPPageModuleConfig[] oSPPageModuleConfigArr = new OSPPageModuleConfig[size];
        for (int i = 0; i < size; i++) {
            Map.Entry entryPollFirstEntry = treeMap.pollFirstEntry();
            if (entryPollFirstEntry == null || (oSPPageModuleConfig = entryPollFirstEntry.getValue()) == null) {
                oSPPageModuleConfig = new OSPPageModuleConfig("", 0, 0, 0);
            }
            oSPPageModuleConfigArr[i] = oSPPageModuleConfig;
        }
        return oSPPageModuleConfigArr;
    }

    public final int LJIIJ() {
        List<ShopOrderNew> list = this.newShopOrders;
        int size = 0;
        if (list != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            size = 0;
            while (it2.hasNext()) {
                List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List<PackedSku> list3 = it3.next().packedSkus;
                        size += list3 != null ? list3.size() : 0;
                    }
                }
            }
        }
        return size;
    }

    public final boolean LJIIJJI() {
        Address address;
        List<AddressItem> list;
        ShippingAddress shippingAddress = this.pudoShippingAddress;
        ShippingAddress shippingAddress2 = null;
        if (shippingAddress != null) {
            if (shippingAddress != null && Intrinsics.LJFF(shippingAddress.isSelected, Boolean.TRUE)) {
                shippingAddress2 = this.pudoShippingAddress;
            }
            ShippingAddress shippingAddress3 = this.shippingAddress;
            if (shippingAddress3 != null && Intrinsics.LJFF(shippingAddress3.isSelected, Boolean.TRUE)) {
                shippingAddress2 = this.shippingAddress;
            }
        } else {
            shippingAddress2 = this.shippingAddress;
        }
        return !(shippingAddress2 == null || (address = shippingAddress2.shippingAddress) == null || (list = address.items) == null || list.isEmpty());
    }

    public final boolean LJIIL() {
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        if (map != null) {
            return map.containsKey("cpf");
        }
        return false;
    }

    public final boolean LJIILIIL() {
        Price price;
        List<Promotion> promotions;
        Price price2;
        List<Promotion> promotions2;
        Price price3;
        List<Promotion> promotions3;
        List<ShopOrderNew> list = this.newShopOrders;
        if (list != null) {
            for (ShopOrderNew shopOrderNew : list) {
                List<MainOrderInfo> list2 = shopOrderNew.mainOrderInfos;
                if (list2 != null) {
                    Iterator<MainOrderInfo> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List<PackedSku> list3 = it2.next().packedSkus;
                        if (list3 != null) {
                            Iterator<PackedSku> it3 = list3.iterator();
                            while (it3.hasNext()) {
                                SkuPrice skuPrice = it3.next().price;
                                if (skuPrice != null && (price3 = skuPrice.realPrice) != null && (promotions3 = price3.getPromotions()) != null && (!promotions3.isEmpty())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                ShopBill shopBill = shopOrderNew.shopBill;
                if (shopBill != null && (price2 = shopBill.total) != null && (promotions2 = price2.getPromotions()) != null && (!promotions2.isEmpty())) {
                    return true;
                }
            }
        }
        Summary summary = this.summary;
        if (summary == null || (price = summary.total) == null || (promotions = price.getPromotions()) == null) {
            return false;
        }
        return !promotions.isEmpty();
    }

    public final boolean LJIILJJIL() {
        Boolean bool = this.LIZ;
        Boolean bool2 = Boolean.TRUE;
        return !Intrinsics.LJFF(bool, bool2) || Intrinsics.LJFF(this.lastChunk, bool2);
    }

    public final boolean LJIIZILJ() {
        List<ShopOrderNew> list = this.newShopOrders;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<ShopOrderNew> it2 = list.iterator();
        while (it2.hasNext()) {
            List<MainOrderInfo> list2 = it2.next().mainOrderInfos;
            if (list2 != null && !list2.isEmpty()) {
                Iterator<MainOrderInfo> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next().reachable, Boolean.TRUE)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final BillInfoData LJIILLIIL(BillInfoData billInfoData) {
        PaymentMethodsData paymentMethodsData;
        if (billInfoData == null) {
            return this;
        }
        Map<String, ModuleLayout> map = this.remoteLayoutMap;
        if (map == null) {
            map = billInfoData.remoteLayoutMap;
        }
        List<Announcement> list = this.announcement;
        if (list == null) {
            list = billInfoData.announcement;
        }
        Summary summary = this.summary;
        if (summary == null) {
            summary = billInfoData.summary;
        }
        List<PaymentBillSummary> list2 = this.paymentSummary;
        if (list2 == null) {
            list2 = billInfoData.paymentSummary;
        }
        ShippingAddress shippingAddress = this.shippingAddress;
        if (shippingAddress == null) {
            shippingAddress = billInfoData.shippingAddress;
        }
        ShippingAddress shippingAddress2 = this.pudoShippingAddress;
        if (shippingAddress2 == null) {
            shippingAddress2 = billInfoData.pudoShippingAddress;
        }
        ExceptionUX exceptionUX = this.exceptionUX;
        if (exceptionUX == null) {
            exceptionUX = billInfoData.exceptionUX;
        }
        InputItemData inputItemData = this.addressInputItemData;
        if (inputItemData == null) {
            inputItemData = billInfoData.addressInputItemData;
        }
        PaymentMethodsData paymentMethodsData2 = this.paymentMethods;
        if (paymentMethodsData2 == null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
            paymentMethodsData2 = paymentMethodsData;
        }
        String str = this.orderSecret;
        if (str == null) {
            str = billInfoData.orderSecret;
        }
        DynamicSchema dynamicSchema = this.schemaInfo;
        if (dynamicSchema == null) {
            dynamicSchema = billInfoData.schemaInfo;
        }
        OSPBottomNotice oSPBottomNotice = this.bottomNotice;
        if (oSPBottomNotice == null) {
            oSPBottomNotice = billInfoData.bottomNotice;
        }
        String str2 = this.topNotice;
        if (str2 == null) {
            str2 = billInfoData.topNotice;
        }
        LinkRichText linkRichText = this.privacyPolicyStatement;
        if (linkRichText == null) {
            linkRichText = billInfoData.privacyPolicyStatement;
        }
        StarlingKeyValue starlingKeyValue = this.placeOrderButtonText;
        if (starlingKeyValue == null) {
            starlingKeyValue = billInfoData.placeOrderButtonText;
        }
        List<ShopOrderNew> list3 = this.newShopOrders;
        if (list3 == null) {
            list3 = billInfoData.newShopOrders;
        }
        String str3 = this.version;
        if (str3 == null) {
            str3 = billInfoData.version;
        }
        PlatformPromotion platformPromotion = this.platformPromotion;
        if (platformPromotion == null) {
            platformPromotion = billInfoData.platformPromotion;
        }
        String str4 = this.buttonPopTips;
        if (str4 == null) {
            str4 = billInfoData.buttonPopTips;
        }
        List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list4 = this.autoVouchers;
        if (list4 == null) {
            list4 = billInfoData.autoVouchers;
        }
        AddonOrder addonOrder = this.addonOrder;
        if (addonOrder == null) {
            addonOrder = billInfoData.addonOrder;
        }
        String str5 = this.requestId;
        if (str5 == null) {
            str5 = billInfoData.requestId;
        }
        ExtraFeeStatement extraFeeStatement = this.extraFeeStatement;
        if (extraFeeStatement == null) {
            extraFeeStatement = billInfoData.extraFeeStatement;
        }
        String str6 = this.daInfo;
        if (str6 == null) {
            str6 = billInfoData.daInfo;
        }
        String str7 = this.firstLoadDaInfo;
        if (str7 == null) {
            str7 = billInfoData.firstLoadDaInfo;
        }
        SkuCommonConfig skuCommonConfig = this.skuCommonConfig;
        if (skuCommonConfig == null) {
            skuCommonConfig = billInfoData.skuCommonConfig;
        }
        Boolean bool = this.beginRenderChunk;
        if (bool == null) {
            bool = billInfoData.beginRenderChunk;
        }
        Boolean bool2 = this.lastChunk;
        if (bool2 == null) {
            bool2 = billInfoData.lastChunk;
        }
        Boolean bool3 = this.LIZ;
        String str8 = this.toast;
        if (str8 == null) {
            str8 = billInfoData.toast;
        }
        String str9 = this.promotionDaInfo;
        if (str9 == null) {
            str9 = billInfoData.promotionDaInfo;
        }
        String str10 = this.createOrderInfoFromBill;
        if (str10 == null) {
            str10 = billInfoData.createOrderInfoFromBill;
        }
        LogisticData logisticData = this.logisticData;
        if (logisticData == null) {
            logisticData = billInfoData.logisticData;
        }
        n nVar = this.preRiskParam;
        if (nVar == null) {
            nVar = billInfoData.preRiskParam;
        }
        PolicyModule policyModule = this.policyModule;
        if (policyModule == null) {
            policyModule = billInfoData.policyModule;
        }
        BillCpfInfo billCpfInfo = this.cpfInfo;
        if (billCpfInfo == null) {
            billCpfInfo = billInfoData.cpfInfo;
        }
        UserTrustModule userTrustModule = this.userTrustModule;
        if (userTrustModule == null) {
            userTrustModule = billInfoData.userTrustModule;
        }
        BillStarling billStarling = this.starlingTexts;
        if (billStarling == null) {
            billStarling = billInfoData.starlingTexts;
        }
        LinkRichText linkRichText2 = this.buyerProtectionProgram;
        if (linkRichText2 == null) {
            linkRichText2 = billInfoData.buyerProtectionProgram;
        }
        ChunkDebugInfo chunkDebugInfo = billInfoData.chunkDebugInfo;
        if (chunkDebugInfo == null) {
            chunkDebugInfo = this.chunkDebugInfo;
        }
        String str11 = this.billInfoParams;
        if (str11 == null) {
            str11 = billInfoData.billInfoParams;
        }
        SoftInterceptItem softInterceptItem = this.softInterceptItem;
        if (softInterceptItem == null) {
            softInterceptItem = billInfoData.softInterceptItem;
        }
        List<AggregationInfo> list5 = this.orderGroup;
        if (list5 == null) {
            list5 = billInfoData.orderGroup;
        }
        Integer num = this.fullfillmentGroupDisplayType;
        if (num == null) {
            num = billInfoData.fullfillmentGroupDisplayType;
        }
        BillInfoSetting billInfoSetting = this.settings;
        if (billInfoSetting == null) {
            billInfoSetting = billInfoData.settings;
        }
        ButtonInfo buttonInfo = this.ospButtonInfo;
        if (buttonInfo == null) {
            buttonInfo = billInfoData.ospButtonInfo;
        }
        AddonPanelInfo addonPanelInfo = this.addonPanelInfo;
        if (addonPanelInfo == null) {
            addonPanelInfo = billInfoData.addonPanelInfo;
        }
        ShippingAddressSwitch shippingAddressSwitch = this.shippingAddressSwitch;
        if (shippingAddressSwitch == null) {
            shippingAddressSwitch = billInfoData.shippingAddressSwitch;
        }
        OspButtonBannerInfo ospButtonBannerInfo = this.ospButtonBannerInfo;
        if (ospButtonBannerInfo == null) {
            ospButtonBannerInfo = billInfoData.ospButtonBannerInfo;
        }
        EmailAuthorizationInfo emailAuthorizationInfo = this.emailAuthorizationInfo;
        if (emailAuthorizationInfo == null) {
            emailAuthorizationInfo = billInfoData.emailAuthorizationInfo;
        }
        LinkRichText linkRichText3 = this.addNoteText;
        if (linkRichText3 == null) {
            linkRichText3 = billInfoData.addNoteText;
        }
        RetentionDialogInfo retentionDialogInfo = this.retentionDialogInfo;
        if (retentionDialogInfo == null) {
            retentionDialogInfo = billInfoData.retentionDialogInfo;
        }
        ExposeUserRightPanel exposeUserRightPanel = this.userRightModuleInfo;
        if (exposeUserRightPanel == null) {
            exposeUserRightPanel = billInfoData.userRightModuleInfo;
        }
        String str12 = this.userBenefitDrawSchema;
        if (str12 == null) {
            str12 = billInfoData.userBenefitDrawSchema;
        }
        OspPlaceOrderButton ospPlaceOrderButton = this.ospPlaceOrderButton;
        if (ospPlaceOrderButton == null) {
            ospPlaceOrderButton = billInfoData.ospPlaceOrderButton;
        }
        IdentityInfo identityInfo = this.identityInfo;
        if (identityInfo == null) {
            identityInfo = billInfoData.identityInfo;
        }
        String str13 = this.placeOrderInterceptInfo;
        if (str13 == null) {
            str13 = billInfoData.placeOrderInterceptInfo;
        }
        List<Banner> list6 = this.topBanners;
        if (list6 == null) {
            list6 = billInfoData.topBanners;
        }
        PlatformRight platformRight = this.platformRight;
        if (platformRight == null) {
            platformRight = billInfoData.platformRight;
        }
        AuthorizationDialog authorizationDialog = this.underAgeConfirmDialog;
        if (authorizationDialog == null) {
            authorizationDialog = billInfoData.underAgeConfirmDialog;
        }
        SkuSelection skuSelection = this.skuSelection;
        if (skuSelection == null) {
            skuSelection = billInfoData.skuSelection;
        }
        List<MiniCheckoutPopup> list7 = this.miniCheckoutPopupList;
        if (list7 == null) {
            list7 = billInfoData.miniCheckoutPopupList;
        }
        String str14 = this.useUserSelection;
        if (str14 == null) {
            str14 = billInfoData.useUserSelection;
        }
        List<TopUserTrustInfo> list8 = this.topUserTrustInfos;
        if (list8 == null) {
            list8 = billInfoData.topUserTrustInfos;
        }
        DonationDisplayModule donationDisplayModule = this.donationDisplayModule;
        if (donationDisplayModule == null) {
            donationDisplayModule = billInfoData.donationDisplayModule;
        }
        BonusModule bonusModule = this.bonusModule;
        if (bonusModule == null) {
            bonusModule = billInfoData.bonusModule;
        }
        Map<String, Summary> map2 = this.additionSummary;
        if (map2 == null) {
            map2 = billInfoData.additionSummary;
        }
        Map<String, PaymentBillSummaryList> map3 = this.additionPaymentSummary;
        if (map3 == null) {
            map3 = billInfoData.additionPaymentSummary;
        }
        LeadingElevatorBar leadingElevatorBar = this.leadingElevatorBar;
        if (leadingElevatorBar == null) {
            leadingElevatorBar = billInfoData.leadingElevatorBar;
        }
        BottomCashbackBanner bottomCashbackBanner = this.bottomCashbackBanner;
        if (bottomCashbackBanner == null) {
            bottomCashbackBanner = billInfoData.bottomCashbackBanner;
        }
        PageHeaderCarousel pageHeaderCarousel = this.pageHeaderCarousel;
        if (pageHeaderCarousel == null) {
            pageHeaderCarousel = billInfoData.pageHeaderCarousel;
        }
        RefundableSampleModule refundableSampleModule = this.refundableSampleModule;
        if (refundableSampleModule == null) {
            refundableSampleModule = billInfoData.refundableSampleModule;
        }
        PrivacyPopup privacyPopup = this.privacyPopup;
        if (privacyPopup == null) {
            privacyPopup = billInfoData.privacyPopup;
        }
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = this.outsideSellingPointsBubble;
        if (seaPdpSellingPointsGroup == null) {
            seaPdpSellingPointsGroup = billInfoData.outsideSellingPointsBubble;
        }
        ChangeInfo changeInfo = this.changeInfo;
        if (changeInfo == null) {
            changeInfo = billInfoData.changeInfo;
        }
        AgeConfirmModule ageConfirmModule = this.ageConfirmModule;
        if (ageConfirmModule == null) {
            ageConfirmModule = billInfoData.ageConfirmModule;
        }
        BottomAbnormalBanner bottomAbnormalBanner = billInfoData.bottomAbnormalBanner;
        if (bottomAbnormalBanner == null) {
            bottomAbnormalBanner = this.bottomAbnormalBanner;
        }
        return new BillInfoData(addonOrder, map, list, summary, shippingAddress, shippingAddress2, exceptionUX, inputItemData, paymentMethodsData2, str, dynamicSchema, oSPBottomNotice, str2, linkRichText, starlingKeyValue, list3, platformPromotion, str4, str3, list4, str5, extraFeeStatement, str6, str7, skuCommonConfig, str8, bool, bool2, str9, nVar, billCpfInfo, bool3, str10, logisticData, policyModule, userTrustModule, billStarling, list2, linkRichText2, chunkDebugInfo, str11, softInterceptItem, list5, billInfoSetting, buttonInfo, addonPanelInfo, shippingAddressSwitch, ospButtonBannerInfo, emailAuthorizationInfo, linkRichText3, retentionDialogInfo, exposeUserRightPanel, str12, ospPlaceOrderButton, num, identityInfo, null, str13, list6, platformRight, authorizationDialog, skuSelection, list7, str14, list8, donationDisplayModule, bonusModule, map2, map3, leadingElevatorBar, bottomCashbackBanner, pageHeaderCarousel, refundableSampleModule, privacyPopup, null, changeInfo, null, ageConfirmModule, seaPdpSellingPointsGroup, bottomAbnormalBanner);
    }

    public static List LIZJ(List list, Map map) {
        String str;
        String str2;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PackedSku packedSku = (PackedSku) it2.next();
                if (packedSku != null && (str = packedSku.skuId) != null && map != null && map.containsKey(str) && Intrinsics.LJFF(map.get(str), Boolean.TRUE) && (str2 = packedSku.productId) != null) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a8  */
    /* JADX WARN: Type inference failed for: r20v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo>] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku>] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku>] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku>] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData LJIILL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r107, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r108) {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData.LJIILL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest):com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LJI(int r49, int r50, java.lang.String r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData.LJI(int, int, java.lang.String, boolean):java.util.List");
    }

    public final String LJII(String str, String str2, List list, boolean z) {
        Price price;
        String priceStr;
        Summary summaryLIZIZ = C722002rq.LIZIZ(this, str, z, list, null, str2);
        if (summaryLIZIZ != null && (price = summaryLIZIZ.total) != null && (priceStr = price.getPriceStr()) != null) {
            return priceStr;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[PHI: r1
      0x001b: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x0014, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LJIIIZ(java.lang.String r7, java.lang.String r8, java.util.List r9, boolean r10) {
        /*
            r6 = this;
            r4 = 0
            r2 = r10
            r3 = r9
            r5 = r8
            r1 = r7
            r0 = r6
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary r0 = X.C722002rq.LIZIZ(r0, r1, r2, r3, r4, r5)
            kotlin.Pair r2 = new kotlin.Pair
            if (r0 == 0) goto L12
            java.lang.String r1 = r0.desc
            if (r1 != 0) goto L1b
        L12:
            java.lang.String r1 = ""
            if (r0 != 0) goto L1b
            r0 = 0
        L17:
            r2.<init>(r1, r0)
            return r2
        L1b:
            com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText r0 = r0.descRichText
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData.LJIIIZ(java.lang.String, java.lang.String, java.util.List, boolean):kotlin.Pair");
    }

    public static String LJIIIIZZ(BillInfoData billInfoData, String str, boolean z, List list, int i) {
        String str2;
        List list2 = list;
        boolean z2 = z;
        String str3 = str;
        if ((i & 1) != 0) {
            str3 = null;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        billInfoData.getClass();
        Summary summaryLIZIZ = C722002rq.LIZIZ(billInfoData, str3, z2, list2, null, null);
        if (summaryLIZIZ != null && (str2 = summaryLIZIZ.desc) != null) {
            return str2;
        }
        return "";
    }

    public static BillInfoData LIZ(BillInfoData billInfoData, AddonOrder addonOrder, PaymentMethodsData paymentMethodsData, List list, PlatformPromotion platformPromotion, EmailAuthorizationInfo emailAuthorizationInfo, IdentityInfo identityInfo, SkuSelection skuSelection, BonusModule bonusModule, int i, int i2, int i3) {
        Map<String, ModuleLayout> map;
        List<Announcement> list2;
        Summary summary;
        ShippingAddress shippingAddress;
        ShippingAddress shippingAddress2;
        ExceptionUX exceptionUX;
        InputItemData inputItemData;
        String str;
        DynamicSchema dynamicSchema;
        OSPBottomNotice oSPBottomNotice;
        String str2;
        LinkRichText linkRichText;
        StarlingKeyValue starlingKeyValue;
        String str3;
        String str4;
        List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list3;
        String str5;
        ExtraFeeStatement extraFeeStatement;
        String str6;
        String str7;
        SkuCommonConfig skuCommonConfig;
        String str8;
        Boolean bool;
        Boolean bool2;
        String str9;
        n nVar;
        BillCpfInfo billCpfInfo;
        Boolean bool3;
        String str10;
        LogisticData logisticData;
        PolicyModule policyModule;
        UserTrustModule userTrustModule;
        BillStarling billStarling;
        List<PaymentBillSummary> list4;
        LinkRichText linkRichText2;
        ChunkDebugInfo chunkDebugInfo;
        String str11;
        SoftInterceptItem softInterceptItem;
        List<AggregationInfo> list5;
        BillInfoSetting billInfoSetting;
        ButtonInfo buttonInfo;
        AddonPanelInfo addonPanelInfo;
        ShippingAddressSwitch shippingAddressSwitch;
        int i4;
        OspButtonBannerInfo ospButtonBannerInfo;
        int i5;
        LinkRichText linkRichText3;
        int i6;
        RetentionDialogInfo retentionDialogInfo;
        int i7;
        ExposeUserRightPanel exposeUserRightPanel;
        int i8;
        String str12;
        int i9;
        OspPlaceOrderButton ospPlaceOrderButton;
        int i10;
        Integer num;
        int i11;
        String str13;
        int i12;
        String str14;
        int i13;
        List<Banner> list6;
        PlatformRight platformRight;
        AuthorizationDialog authorizationDialog;
        List<MiniCheckoutPopup> list7;
        String str15;
        List<TopUserTrustInfo> list8;
        DonationDisplayModule donationDisplayModule;
        Map<String, Summary> map2;
        Map<String, PaymentBillSummaryList> map3;
        LeadingElevatorBar leadingElevatorBar;
        BottomCashbackBanner bottomCashbackBanner;
        PageHeaderCarousel pageHeaderCarousel;
        RefundableSampleModule refundableSampleModule;
        PrivacyPopup privacyPopup;
        DigitalDelivery digitalDelivery;
        ChangeInfo changeInfo;
        RightGuidanceModule rightGuidanceModule;
        AgeConfirmModule ageConfirmModule;
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup;
        BottomAbnormalBanner bottomAbnormalBanner;
        BonusModule bonusModule2 = bonusModule;
        SkuSelection skuSelection2 = skuSelection;
        AddonOrder addonOrder2 = addonOrder;
        List list9 = list;
        EmailAuthorizationInfo emailAuthorizationInfo2 = emailAuthorizationInfo;
        IdentityInfo identityInfo2 = identityInfo;
        PaymentMethodsData paymentMethodsData2 = paymentMethodsData;
        PlatformPromotion platformPromotion2 = platformPromotion;
        if ((i & 1) != 0) {
            addonOrder2 = billInfoData.addonOrder;
        }
        if ((i & 2) != 0) {
            map = billInfoData.remoteLayoutMap;
        } else {
            map = null;
        }
        if ((i & 4) != 0) {
            list2 = billInfoData.announcement;
        } else {
            list2 = null;
        }
        if ((i & 8) != 0) {
            summary = billInfoData.summary;
        } else {
            summary = null;
        }
        if ((i & 16) != 0) {
            shippingAddress = billInfoData.shippingAddress;
        } else {
            shippingAddress = null;
        }
        if ((i & 32) != 0) {
            shippingAddress2 = billInfoData.pudoShippingAddress;
        } else {
            shippingAddress2 = null;
        }
        if ((i & 64) != 0) {
            exceptionUX = billInfoData.exceptionUX;
        } else {
            exceptionUX = null;
        }
        if ((i & 128) != 0) {
            inputItemData = billInfoData.addressInputItemData;
        } else {
            inputItemData = null;
        }
        if ((i & 256) != 0) {
            paymentMethodsData2 = billInfoData.paymentMethods;
        }
        if ((i & 512) != 0) {
            str = billInfoData.orderSecret;
        } else {
            str = null;
        }
        if ((i & 1024) != 0) {
            dynamicSchema = billInfoData.schemaInfo;
        } else {
            dynamicSchema = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            oSPBottomNotice = billInfoData.bottomNotice;
        } else {
            oSPBottomNotice = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str2 = billInfoData.topNotice;
        } else {
            str2 = null;
        }
        if ((i & 8192) != 0) {
            linkRichText = billInfoData.privacyPolicyStatement;
        } else {
            linkRichText = null;
        }
        if ((i & 16384) != 0) {
            starlingKeyValue = billInfoData.placeOrderButtonText;
        } else {
            starlingKeyValue = null;
        }
        if ((i & 32768) != 0) {
            list9 = billInfoData.newShopOrders;
        }
        if ((65536 & i) != 0) {
            platformPromotion2 = billInfoData.platformPromotion;
        }
        if ((131072 & i) != 0) {
            str3 = billInfoData.buttonPopTips;
        } else {
            str3 = null;
        }
        if ((262144 & i) != 0) {
            str4 = billInfoData.version;
        } else {
            str4 = null;
        }
        if ((524288 & i) != 0) {
            list3 = billInfoData.autoVouchers;
        } else {
            list3 = null;
        }
        if ((1048576 & i) != 0) {
            str5 = billInfoData.requestId;
        } else {
            str5 = null;
        }
        if ((2097152 & i) != 0) {
            extraFeeStatement = billInfoData.extraFeeStatement;
        } else {
            extraFeeStatement = null;
        }
        if ((4194304 & i) != 0) {
            str6 = billInfoData.daInfo;
        } else {
            str6 = null;
        }
        if ((8388608 & i) != 0) {
            str7 = billInfoData.firstLoadDaInfo;
        } else {
            str7 = null;
        }
        if ((16777216 & i) != 0) {
            skuCommonConfig = billInfoData.skuCommonConfig;
        } else {
            skuCommonConfig = null;
        }
        if ((33554432 & i) != 0) {
            str8 = billInfoData.toast;
        } else {
            str8 = null;
        }
        if ((67108864 & i) != 0) {
            bool = billInfoData.beginRenderChunk;
        } else {
            bool = null;
        }
        if ((134217728 & i) != 0) {
            bool2 = billInfoData.lastChunk;
        } else {
            bool2 = null;
        }
        if ((268435456 & i) != 0) {
            str9 = billInfoData.promotionDaInfo;
        } else {
            str9 = null;
        }
        if ((536870912 & i) != 0) {
            nVar = billInfoData.preRiskParam;
        } else {
            nVar = null;
        }
        if ((1073741824 & i) != 0) {
            billCpfInfo = billInfoData.cpfInfo;
        } else {
            billCpfInfo = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            bool3 = billInfoData.LIZ;
        } else {
            bool3 = null;
        }
        if ((i2 & 1) != 0) {
            str10 = billInfoData.createOrderInfoFromBill;
        } else {
            str10 = null;
        }
        if ((i2 & 2) != 0) {
            logisticData = billInfoData.logisticData;
        } else {
            logisticData = null;
        }
        if ((i2 & 4) != 0) {
            policyModule = billInfoData.policyModule;
        } else {
            policyModule = null;
        }
        if ((i2 & 8) != 0) {
            userTrustModule = billInfoData.userTrustModule;
        } else {
            userTrustModule = null;
        }
        if ((i2 & 16) != 0) {
            billStarling = billInfoData.starlingTexts;
        } else {
            billStarling = null;
        }
        if ((i2 & 32) != 0) {
            list4 = billInfoData.paymentSummary;
        } else {
            list4 = null;
        }
        if ((i2 & 64) != 0) {
            linkRichText2 = billInfoData.buyerProtectionProgram;
        } else {
            linkRichText2 = null;
        }
        if ((i2 & 128) != 0) {
            chunkDebugInfo = billInfoData.chunkDebugInfo;
        } else {
            chunkDebugInfo = null;
        }
        if ((i2 & 256) != 0) {
            str11 = billInfoData.billInfoParams;
        } else {
            str11 = null;
        }
        if ((i2 & 512) != 0) {
            softInterceptItem = billInfoData.softInterceptItem;
        } else {
            softInterceptItem = null;
        }
        if ((i2 & 1024) != 0) {
            list5 = billInfoData.orderGroup;
        } else {
            list5 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            billInfoSetting = billInfoData.settings;
        } else {
            billInfoSetting = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            buttonInfo = billInfoData.ospButtonInfo;
        } else {
            buttonInfo = null;
        }
        if ((i2 & 8192) != 0) {
            addonPanelInfo = billInfoData.addonPanelInfo;
        } else {
            addonPanelInfo = null;
        }
        if ((i2 & 16384) != 0) {
            shippingAddressSwitch = billInfoData.shippingAddressSwitch;
        } else {
            shippingAddressSwitch = null;
        }
        if ((i2 & 32768) != 0) {
            ospButtonBannerInfo = billInfoData.ospButtonBannerInfo;
            i4 = 65536;
        } else {
            i4 = 65536;
            ospButtonBannerInfo = null;
        }
        if ((i4 & i2) != 0) {
            emailAuthorizationInfo2 = billInfoData.emailAuthorizationInfo;
        }
        if ((131072 & i2) != 0) {
            linkRichText3 = billInfoData.addNoteText;
            i5 = 262144;
        } else {
            i5 = 262144;
            linkRichText3 = null;
        }
        if ((i5 & i2) != 0) {
            retentionDialogInfo = billInfoData.retentionDialogInfo;
            i6 = 524288;
        } else {
            i6 = 524288;
            retentionDialogInfo = null;
        }
        if ((i6 & i2) != 0) {
            exposeUserRightPanel = billInfoData.userRightModuleInfo;
            i7 = 1048576;
        } else {
            i7 = 1048576;
            exposeUserRightPanel = null;
        }
        if ((i7 & i2) != 0) {
            str12 = billInfoData.userBenefitDrawSchema;
            i8 = 2097152;
        } else {
            i8 = 2097152;
            str12 = null;
        }
        if ((i8 & i2) != 0) {
            ospPlaceOrderButton = billInfoData.ospPlaceOrderButton;
            i9 = 4194304;
        } else {
            i9 = 4194304;
            ospPlaceOrderButton = null;
        }
        if ((i9 & i2) != 0) {
            num = billInfoData.fullfillmentGroupDisplayType;
            i10 = 8388608;
        } else {
            i10 = 8388608;
            num = null;
        }
        if ((i10 & i2) != 0) {
            identityInfo2 = billInfoData.identityInfo;
        }
        if ((16777216 & i2) != 0) {
            str13 = billInfoData.costDaInfo;
            i11 = 33554432;
        } else {
            i11 = 33554432;
            str13 = null;
        }
        if ((i11 & i2) != 0) {
            str14 = billInfoData.placeOrderInterceptInfo;
            i12 = 67108864;
        } else {
            i12 = 67108864;
            str14 = null;
        }
        if ((i12 & i2) != 0) {
            list6 = billInfoData.topBanners;
            i13 = 134217728;
        } else {
            i13 = 134217728;
            list6 = null;
        }
        if ((i13 & i2) != 0) {
            platformRight = billInfoData.platformRight;
        } else {
            platformRight = null;
        }
        if ((268435456 & i2) != 0) {
            authorizationDialog = billInfoData.underAgeConfirmDialog;
        } else {
            authorizationDialog = null;
        }
        if ((536870912 & i2) != 0) {
            skuSelection2 = billInfoData.skuSelection;
        }
        if ((1073741824 & i2) != 0) {
            list7 = billInfoData.miniCheckoutPopupList;
        } else {
            list7 = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            str15 = billInfoData.useUserSelection;
        } else {
            str15 = null;
        }
        if ((i3 & 1) != 0) {
            list8 = billInfoData.topUserTrustInfos;
        } else {
            list8 = null;
        }
        if ((i3 & 2) != 0) {
            donationDisplayModule = billInfoData.donationDisplayModule;
        } else {
            donationDisplayModule = null;
        }
        if ((i3 & 4) != 0) {
            bonusModule2 = billInfoData.bonusModule;
        }
        if ((i3 & 8) != 0) {
            map2 = billInfoData.additionSummary;
        } else {
            map2 = null;
        }
        if ((i3 & 16) != 0) {
            map3 = billInfoData.additionPaymentSummary;
        } else {
            map3 = null;
        }
        if ((i3 & 32) != 0) {
            leadingElevatorBar = billInfoData.leadingElevatorBar;
        } else {
            leadingElevatorBar = null;
        }
        if ((i3 & 64) != 0) {
            bottomCashbackBanner = billInfoData.bottomCashbackBanner;
        } else {
            bottomCashbackBanner = null;
        }
        if ((i3 & 128) != 0) {
            pageHeaderCarousel = billInfoData.pageHeaderCarousel;
        } else {
            pageHeaderCarousel = null;
        }
        if ((i3 & 256) != 0) {
            refundableSampleModule = billInfoData.refundableSampleModule;
        } else {
            refundableSampleModule = null;
        }
        if ((i3 & 512) != 0) {
            privacyPopup = billInfoData.privacyPopup;
        } else {
            privacyPopup = null;
        }
        if ((i3 & 1024) != 0) {
            digitalDelivery = billInfoData.digitalDelivery;
        } else {
            digitalDelivery = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            changeInfo = billInfoData.changeInfo;
        } else {
            changeInfo = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            rightGuidanceModule = billInfoData.rightGuidanceModule;
        } else {
            rightGuidanceModule = null;
        }
        if ((i3 & 8192) != 0) {
            ageConfirmModule = billInfoData.ageConfirmModule;
        } else {
            ageConfirmModule = null;
        }
        if ((i3 & 16384) != 0) {
            seaPdpSellingPointsGroup = billInfoData.outsideSellingPointsBubble;
        } else {
            seaPdpSellingPointsGroup = null;
        }
        if ((i3 & 32768) != 0) {
            bottomAbnormalBanner = billInfoData.bottomAbnormalBanner;
        } else {
            bottomAbnormalBanner = null;
        }
        billInfoData.getClass();
        return new BillInfoData(addonOrder2, map, list2, summary, shippingAddress, shippingAddress2, exceptionUX, inputItemData, paymentMethodsData2, str, dynamicSchema, oSPBottomNotice, str2, linkRichText, starlingKeyValue, list9, platformPromotion2, str3, str4, list3, str5, extraFeeStatement, str6, str7, skuCommonConfig, str8, bool, bool2, str9, nVar, billCpfInfo, bool3, str10, logisticData, policyModule, userTrustModule, billStarling, list4, linkRichText2, chunkDebugInfo, str11, softInterceptItem, list5, billInfoSetting, buttonInfo, addonPanelInfo, shippingAddressSwitch, ospButtonBannerInfo, emailAuthorizationInfo2, linkRichText3, retentionDialogInfo, exposeUserRightPanel, str12, ospPlaceOrderButton, num, identityInfo2, str13, str14, list6, platformRight, authorizationDialog, skuSelection2, list7, str15, list8, donationDisplayModule, bonusModule2, map2, map3, leadingElevatorBar, bottomCashbackBanner, pageHeaderCarousel, refundableSampleModule, privacyPopup, digitalDelivery, changeInfo, rightGuidanceModule, ageConfirmModule, seaPdpSellingPointsGroup, bottomAbnormalBanner);
    }

    public BillInfoData(AddonOrder addonOrder, Map<String, ModuleLayout> map, List<Announcement> list, Summary summary, ShippingAddress shippingAddress, ShippingAddress shippingAddress2, ExceptionUX exceptionUX, InputItemData inputItemData, PaymentMethodsData paymentMethodsData, String str, DynamicSchema dynamicSchema, OSPBottomNotice oSPBottomNotice, String str2, LinkRichText linkRichText, StarlingKeyValue starlingKeyValue, List<ShopOrderNew> list2, PlatformPromotion platformPromotion, String str3, String str4, List<com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher> list3, String str5, ExtraFeeStatement extraFeeStatement, String str6, String str7, SkuCommonConfig skuCommonConfig, String str8, Boolean bool, Boolean bool2, String str9, n nVar, BillCpfInfo billCpfInfo, Boolean bool3, String str10, LogisticData logisticData, PolicyModule policyModule, UserTrustModule userTrustModule, BillStarling billStarling, List<PaymentBillSummary> list4, LinkRichText linkRichText2, ChunkDebugInfo chunkDebugInfo, String str11, SoftInterceptItem softInterceptItem, List<AggregationInfo> list5, BillInfoSetting billInfoSetting, ButtonInfo buttonInfo, AddonPanelInfo addonPanelInfo, ShippingAddressSwitch shippingAddressSwitch, OspButtonBannerInfo ospButtonBannerInfo, EmailAuthorizationInfo emailAuthorizationInfo, LinkRichText linkRichText3, RetentionDialogInfo retentionDialogInfo, ExposeUserRightPanel exposeUserRightPanel, String str12, OspPlaceOrderButton ospPlaceOrderButton, Integer num, IdentityInfo identityInfo, String str13, String str14, List<Banner> list6, PlatformRight platformRight, AuthorizationDialog authorizationDialog, SkuSelection skuSelection, List<MiniCheckoutPopup> list7, String str15, List<TopUserTrustInfo> list8, DonationDisplayModule donationDisplayModule, BonusModule bonusModule, Map<String, Summary> map2, Map<String, PaymentBillSummaryList> map3, LeadingElevatorBar leadingElevatorBar, BottomCashbackBanner bottomCashbackBanner, PageHeaderCarousel pageHeaderCarousel, RefundableSampleModule refundableSampleModule, PrivacyPopup privacyPopup, DigitalDelivery digitalDelivery, ChangeInfo changeInfo, RightGuidanceModule rightGuidanceModule, AgeConfirmModule ageConfirmModule, SeaPdpSellingPointsGroup seaPdpSellingPointsGroup, BottomAbnormalBanner bottomAbnormalBanner) {
        this.addonOrder = addonOrder;
        this.remoteLayoutMap = map;
        this.announcement = list;
        this.summary = summary;
        this.shippingAddress = shippingAddress;
        this.pudoShippingAddress = shippingAddress2;
        this.exceptionUX = exceptionUX;
        this.addressInputItemData = inputItemData;
        this.paymentMethods = paymentMethodsData;
        this.orderSecret = str;
        this.schemaInfo = dynamicSchema;
        this.bottomNotice = oSPBottomNotice;
        this.topNotice = str2;
        this.privacyPolicyStatement = linkRichText;
        this.placeOrderButtonText = starlingKeyValue;
        this.newShopOrders = list2;
        this.platformPromotion = platformPromotion;
        this.buttonPopTips = str3;
        this.version = str4;
        this.autoVouchers = list3;
        this.requestId = str5;
        this.extraFeeStatement = extraFeeStatement;
        this.daInfo = str6;
        this.firstLoadDaInfo = str7;
        this.skuCommonConfig = skuCommonConfig;
        this.toast = str8;
        this.beginRenderChunk = bool;
        this.lastChunk = bool2;
        this.promotionDaInfo = str9;
        this.preRiskParam = nVar;
        this.cpfInfo = billCpfInfo;
        this.LIZ = bool3;
        this.createOrderInfoFromBill = str10;
        this.logisticData = logisticData;
        this.policyModule = policyModule;
        this.userTrustModule = userTrustModule;
        this.starlingTexts = billStarling;
        this.paymentSummary = list4;
        this.buyerProtectionProgram = linkRichText2;
        this.chunkDebugInfo = chunkDebugInfo;
        this.billInfoParams = str11;
        this.softInterceptItem = softInterceptItem;
        this.orderGroup = list5;
        this.settings = billInfoSetting;
        this.ospButtonInfo = buttonInfo;
        this.addonPanelInfo = addonPanelInfo;
        this.shippingAddressSwitch = shippingAddressSwitch;
        this.ospButtonBannerInfo = ospButtonBannerInfo;
        this.emailAuthorizationInfo = emailAuthorizationInfo;
        this.addNoteText = linkRichText3;
        this.retentionDialogInfo = retentionDialogInfo;
        this.userRightModuleInfo = exposeUserRightPanel;
        this.userBenefitDrawSchema = str12;
        this.ospPlaceOrderButton = ospPlaceOrderButton;
        this.fullfillmentGroupDisplayType = num;
        this.identityInfo = identityInfo;
        this.costDaInfo = str13;
        this.placeOrderInterceptInfo = str14;
        this.topBanners = list6;
        this.platformRight = platformRight;
        this.underAgeConfirmDialog = authorizationDialog;
        this.skuSelection = skuSelection;
        this.miniCheckoutPopupList = list7;
        this.useUserSelection = str15;
        this.topUserTrustInfos = list8;
        this.donationDisplayModule = donationDisplayModule;
        this.bonusModule = bonusModule;
        this.additionSummary = map2;
        this.additionPaymentSummary = map3;
        this.leadingElevatorBar = leadingElevatorBar;
        this.bottomCashbackBanner = bottomCashbackBanner;
        this.pageHeaderCarousel = pageHeaderCarousel;
        this.refundableSampleModule = refundableSampleModule;
        this.privacyPopup = privacyPopup;
        this.digitalDelivery = digitalDelivery;
        this.changeInfo = changeInfo;
        this.rightGuidanceModule = rightGuidanceModule;
        this.ageConfirmModule = ageConfirmModule;
        this.outsideSellingPointsBubble = seaPdpSellingPointsGroup;
        this.bottomAbnormalBanner = bottomAbnormalBanner;
    }
}
