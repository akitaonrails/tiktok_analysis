package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C03R6;
import X.C09CT;
import X.C13LP;
import X.C15438062q;
import X.C2085508Ez;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C848530XQl;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.ActivityUserSelection;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayTrackInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BillInfoRequest implements Serializable, C03R6 {
    public static final int $stable = 8;
    public String LL;
    public Boolean LLILLJJLI;

    @C09CT("activity_ids")
    public final List<String> activityIds;

    @C09CT("activity_user_selection")
    public final ActivityUserSelection activityUserSelection;

    @C09CT("addon_product_infos")
    public final List<AddonProductInfo> addOnProductInfos;

    @C09CT("addon_panel_snap_info")
    public final AddonPanelSnapInfo addonPanelSnapInfo;

    @C09CT("addon_scene")
    public final Integer addonScene;

    @C09CT("age_confirm_status")
    public Integer ageConfirmStatus;

    @C09CT("bill_info_client_params")
    public final BillInfoClientParam billInfoClientParam;

    @C09CT("bill_info_server_params")
    public final String billInfoParams;

    @C09CT("buy_type")
    public final int buyType;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("change_info")
    public final ChangeInfo changeInfo;

    @C09CT("claim_voucher_metas")
    public final List<VoucherMeta> claimVoucherMetas;

    @C09CT("claim_voucher_type_ids")
    public final List<String> claimVoucherTypeIds;

    @C09CT("client_template")
    public final int clientTemplate;

    @C09CT("coupon_selected_status")
    public final Integer couponSelectedStatus;

    @C09CT("displayed_addon_product_id")
    public String displayedAddonProductId;

    @C09CT("email_authorization_snap_info")
    public final EmailAuthorizationSnapInfo emailAuthorizationSnapInfo;

    @C09CT("extra_info")
    public final AddonExtraInfo extraInfo;

    @C09CT("financing_details")
    public FinancingDetails financingDetails;

    @C09CT("flow_type")
    public final Integer flowType;

    @C09CT("hide_shipping_addon_panel")
    public final Boolean hideShippingAddonPanel;

    @C09CT("identity_info")
    public final IdentityInfo identityInfo;

    @C09CT("is_from_follow")
    public final Boolean isFromFollow;

    @C09CT("is_new_payment")
    public final boolean isNewPayment;

    @C09CT("need_addr_upgrade_exception")
    public final Boolean needCheckAddressUpgrade;

    @C09CT("notice_voucher_type_id")
    public final String noticeVoucherTypeId;

    @C09CT("one_click_pay_context")
    public final String oneClickPayContextString;

    @C09CT("one_step_flow_page_type")
    public Integer oneStepFlowPageType;

    @C09CT("one_step_order_type")
    public final Integer oneStepOrderType;

    @C09CT("order_request_params")
    public final Map<String, Object> orderRequestParams;

    @C09CT("order_shop")
    public final List<OrderShopDigest> orderShop;

    @C09CT("__rd_tiktokec_verifier_scene_params__")
    public final OspScene ospScene;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("pay_risk_control_param")
    public PayRiskControlParam payRiskControlParams;

    @C09CT("pay_track_info")
    public final PayTrackInfo payTrackInfo;

    @C09CT("payment_method")
    public final PaymentMethodInfo paymentMethod;

    @C09CT("payment_param")
    public final Map<String, String> paymentParam;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("previous_pay_order_id")
    public String previousPayOrderId;

    @C09CT("promotion_ids")
    public final List<String> promotionIds;

    @C09CT("refundable_sample_selected_status")
    public Integer refundableSampleSelectStatus;

    @C09CT("retry_time")
    public final Integer retryTime;

    @C09CT("select_addon_order_skus")
    public final List<AddonOrderSku> selectAddonOrderSkus;

    @C09CT("selected_addon_sku_ids")
    public final List<String> selectedAddonSKUIds;

    @C09CT("selected_voucher_metas")
    public final List<VoucherMeta> selectedVoucherMetas;

    @C09CT("server_issued_params")
    public final String serverIssuedParams;

    @C09CT("shipping_addr_param")
    public final ShippingAddressParam shippingAddressParam;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    @C09CT("use_activity_user_selection")
    public final Boolean useActivityUserSelection;

    @C09CT("use_bonus_redeem")
    public final Boolean useBonusRedeem;

    @C09CT("use_user_selection")
    public final Boolean useUserSelection;

    @C09CT("with_address_input_item")
    public final boolean withAddressInputItem;

    @C09CT("with_donation")
    public Boolean withDonation;

    @C09CT("with_pre_risk_param")
    public final boolean withPreRiskParam;

    @C09CT("with_product_info")
    public final boolean withProductInfo;

    @C09CT("with_seller_info")
    public final boolean withSellerInfo;

    public final BillInfoRequest copy(String str, int i, List<OrderShopDigest> list, boolean z, boolean z2, boolean z3, boolean z4, List<String> list2, Boolean bool, List<String> list3, List<VoucherMeta> list4, boolean z5, PaymentMethodInfo paymentMethodInfo, Map<String, ? extends Object> map, String str2, List<String> list5, List<String> list6, int[] iArr, String str3, List<AddonProductInfo> list7, Integer num, Boolean bool2, String str4, List<VoucherMeta> list8, String str5, String str6, int i2, Boolean bool3, AddonExtraInfo addonExtraInfo, ChangeInfo changeInfo, ActivityUserSelection activityUserSelection, Boolean bool4, Boolean bool5, String str7, AddonPanelSnapInfo addonPanelSnapInfo, OspScene ospScene, List<AddonOrderSku> list9, ShippingAddressParam shippingAddressParam, EmailAuthorizationSnapInfo emailAuthorizationSnapInfo, Integer num2, Integer num3, Integer num4, Boolean bool6, BillInfoClientParam billInfoClientParam, IdentityInfo identityInfo, Map<String, String> map2, PayTrackInfo payTrackInfo, Integer num5, FinancingDetails financingDetails, String str8, String str9, PayRiskControlParam payRiskControlParam, Boolean bool7, Integer num6, String str10, Integer num7, Integer num8) {
        return new BillInfoRequest(str, i, list, z, z2, z3, z4, list2, bool, list3, list4, z5, paymentMethodInfo, map, str2, list5, list6, iArr, str3, list7, num, bool2, str4, list8, str5, str6, i2, bool3, addonExtraInfo, changeInfo, activityUserSelection, bool4, bool5, str7, addonPanelSnapInfo, ospScene, list9, shippingAddressParam, emailAuthorizationSnapInfo, num2, num3, num4, bool6, billInfoClientParam, identityInfo, map2, payTrackInfo, num5, financingDetails, str8, str9, payRiskControlParam, bool7, num6, str10, num7, num8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillInfoRequest)) {
            return false;
        }
        BillInfoRequest billInfoRequest = (BillInfoRequest) obj;
        return Intrinsics.LJFF(this.buyerAddrId, billInfoRequest.buyerAddrId) && this.buyType == billInfoRequest.buyType && Intrinsics.LJFF(this.orderShop, billInfoRequest.orderShop) && this.withProductInfo == billInfoRequest.withProductInfo && this.withSellerInfo == billInfoRequest.withSellerInfo && this.withAddressInputItem == billInfoRequest.withAddressInputItem && this.withPreRiskParam == billInfoRequest.withPreRiskParam && Intrinsics.LJFF(this.promotionIds, billInfoRequest.promotionIds) && Intrinsics.LJFF(this.useUserSelection, billInfoRequest.useUserSelection) && Intrinsics.LJFF(this.claimVoucherTypeIds, billInfoRequest.claimVoucherTypeIds) && Intrinsics.LJFF(this.claimVoucherMetas, billInfoRequest.claimVoucherMetas) && this.isNewPayment == billInfoRequest.isNewPayment && Intrinsics.LJFF(this.paymentMethod, billInfoRequest.paymentMethod) && Intrinsics.LJFF(this.orderRequestParams, billInfoRequest.orderRequestParams) && Intrinsics.LJFF(this.serverIssuedParams, billInfoRequest.serverIssuedParams) && Intrinsics.LJFF(this.activityIds, billInfoRequest.activityIds) && Intrinsics.LJFF(this.selectedAddonSKUIds, billInfoRequest.selectedAddonSKUIds) && Intrinsics.LJFF(this.trafficSourceList, billInfoRequest.trafficSourceList) && Intrinsics.LJFF(this.noticeVoucherTypeId, billInfoRequest.noticeVoucherTypeId) && Intrinsics.LJFF(this.addOnProductInfos, billInfoRequest.addOnProductInfos) && Intrinsics.LJFF(this.oneStepOrderType, billInfoRequest.oneStepOrderType) && Intrinsics.LJFF(this.isFromFollow, billInfoRequest.isFromFollow) && Intrinsics.LJFF(this.billInfoParams, billInfoRequest.billInfoParams) && Intrinsics.LJFF(this.selectedVoucherMetas, billInfoRequest.selectedVoucherMetas) && Intrinsics.LJFF(this.preLogId, billInfoRequest.preLogId) && Intrinsics.LJFF(this.pageSourceInfo, billInfoRequest.pageSourceInfo) && this.clientTemplate == billInfoRequest.clientTemplate && Intrinsics.LJFF(this.useBonusRedeem, billInfoRequest.useBonusRedeem) && Intrinsics.LJFF(this.extraInfo, billInfoRequest.extraInfo) && Intrinsics.LJFF(this.changeInfo, billInfoRequest.changeInfo) && Intrinsics.LJFF(this.activityUserSelection, billInfoRequest.activityUserSelection) && Intrinsics.LJFF(this.useActivityUserSelection, billInfoRequest.useActivityUserSelection) && Intrinsics.LJFF(this.needCheckAddressUpgrade, billInfoRequest.needCheckAddressUpgrade) && Intrinsics.LJFF(this.oneClickPayContextString, billInfoRequest.oneClickPayContextString) && Intrinsics.LJFF(this.addonPanelSnapInfo, billInfoRequest.addonPanelSnapInfo) && Intrinsics.LJFF(this.ospScene, billInfoRequest.ospScene) && Intrinsics.LJFF(this.selectAddonOrderSkus, billInfoRequest.selectAddonOrderSkus) && Intrinsics.LJFF(this.shippingAddressParam, billInfoRequest.shippingAddressParam) && Intrinsics.LJFF(this.emailAuthorizationSnapInfo, billInfoRequest.emailAuthorizationSnapInfo) && Intrinsics.LJFF(this.retryTime, billInfoRequest.retryTime) && Intrinsics.LJFF(this.flowType, billInfoRequest.flowType) && Intrinsics.LJFF(this.addonScene, billInfoRequest.addonScene) && Intrinsics.LJFF(this.hideShippingAddonPanel, billInfoRequest.hideShippingAddonPanel) && Intrinsics.LJFF(this.billInfoClientParam, billInfoRequest.billInfoClientParam) && Intrinsics.LJFF(this.identityInfo, billInfoRequest.identityInfo) && Intrinsics.LJFF(this.paymentParam, billInfoRequest.paymentParam) && Intrinsics.LJFF(this.payTrackInfo, billInfoRequest.payTrackInfo) && Intrinsics.LJFF(this.couponSelectedStatus, billInfoRequest.couponSelectedStatus) && Intrinsics.LJFF(this.financingDetails, billInfoRequest.financingDetails) && Intrinsics.LJFF(this.previousPayOrderId, billInfoRequest.previousPayOrderId) && Intrinsics.LJFF(this.pipoErrorCodeParams, billInfoRequest.pipoErrorCodeParams) && Intrinsics.LJFF(this.payRiskControlParams, billInfoRequest.payRiskControlParams) && Intrinsics.LJFF(this.withDonation, billInfoRequest.withDonation) && Intrinsics.LJFF(this.refundableSampleSelectStatus, billInfoRequest.refundableSampleSelectStatus) && Intrinsics.LJFF(this.displayedAddonProductId, billInfoRequest.displayedAddonProductId) && Intrinsics.LJFF(this.ageConfirmStatus, billInfoRequest.ageConfirmStatus) && Intrinsics.LJFF(this.oneStepFlowPageType, billInfoRequest.oneStepFlowPageType);
    }

    public int hashCode() {
        String str = this.buyerAddrId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.buyType) * 31;
        List<OrderShopDigest> list = this.orderShop;
        int iHashCode2 = (((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.withProductInfo)) * 31) + C786410Ut5.Z2(this.withSellerInfo)) * 31) + C786410Ut5.Z2(this.withAddressInputItem)) * 31) + C786410Ut5.Z2(this.withPreRiskParam)) * 31;
        List<String> list2 = this.promotionIds;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.useUserSelection;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list3 = this.claimVoucherTypeIds;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VoucherMeta> list4 = this.claimVoucherMetas;
        int iHashCode6 = (((iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31) + C786410Ut5.Z2(this.isNewPayment)) * 31;
        PaymentMethodInfo paymentMethodInfo = this.paymentMethod;
        int iHashCode7 = (iHashCode6 + (paymentMethodInfo == null ? 0 : paymentMethodInfo.hashCode())) * 31;
        Map<String, Object> map = this.orderRequestParams;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.serverIssuedParams;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list5 = this.activityIds;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.selectedAddonSKUIds;
        int iHashCode11 = (iHashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        int[] iArr = this.trafficSourceList;
        int iHashCode12 = (iHashCode11 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        String str3 = this.noticeVoucherTypeId;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AddonProductInfo> list7 = this.addOnProductInfos;
        int iHashCode14 = (iHashCode13 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Integer num = this.oneStepOrderType;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.isFromFollow;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.billInfoParams;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<VoucherMeta> list8 = this.selectedVoucherMetas;
        int iHashCode18 = (iHashCode17 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str5 = this.preLogId;
        int iHashCode19 = (iHashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.pageSourceInfo;
        int iHashCode20 = (((iHashCode19 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.clientTemplate) * 31;
        Boolean bool3 = this.useBonusRedeem;
        int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        AddonExtraInfo addonExtraInfo = this.extraInfo;
        int iHashCode22 = (iHashCode21 + (addonExtraInfo == null ? 0 : addonExtraInfo.hashCode())) * 31;
        ChangeInfo changeInfo = this.changeInfo;
        int iHashCode23 = (iHashCode22 + (changeInfo == null ? 0 : changeInfo.hashCode())) * 31;
        ActivityUserSelection activityUserSelection = this.activityUserSelection;
        int iHashCode24 = (iHashCode23 + (activityUserSelection == null ? 0 : activityUserSelection.hashCode())) * 31;
        Boolean bool4 = this.useActivityUserSelection;
        int iHashCode25 = (iHashCode24 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.needCheckAddressUpgrade;
        int iHashCode26 = (iHashCode25 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str7 = this.oneClickPayContextString;
        int iHashCode27 = (iHashCode26 + (str7 == null ? 0 : str7.hashCode())) * 31;
        AddonPanelSnapInfo addonPanelSnapInfo = this.addonPanelSnapInfo;
        int iHashCode28 = (iHashCode27 + (addonPanelSnapInfo == null ? 0 : addonPanelSnapInfo.hashCode())) * 31;
        OspScene ospScene = this.ospScene;
        int iHashCode29 = (iHashCode28 + (ospScene == null ? 0 : ospScene.hashCode())) * 31;
        List<AddonOrderSku> list9 = this.selectAddonOrderSkus;
        int iHashCode30 = (iHashCode29 + (list9 == null ? 0 : list9.hashCode())) * 31;
        ShippingAddressParam shippingAddressParam = this.shippingAddressParam;
        int iHashCode31 = (iHashCode30 + (shippingAddressParam == null ? 0 : shippingAddressParam.hashCode())) * 31;
        EmailAuthorizationSnapInfo emailAuthorizationSnapInfo = this.emailAuthorizationSnapInfo;
        int iHashCode32 = (iHashCode31 + (emailAuthorizationSnapInfo == null ? 0 : emailAuthorizationSnapInfo.hashCode())) * 31;
        Integer num2 = this.retryTime;
        int iHashCode33 = (iHashCode32 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.flowType;
        int iHashCode34 = (iHashCode33 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.addonScene;
        int iHashCode35 = (iHashCode34 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool6 = this.hideShippingAddonPanel;
        int iHashCode36 = (iHashCode35 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        BillInfoClientParam billInfoClientParam = this.billInfoClientParam;
        int iHashCode37 = (iHashCode36 + (billInfoClientParam == null ? 0 : billInfoClientParam.hashCode())) * 31;
        IdentityInfo identityInfo = this.identityInfo;
        int iHashCode38 = (iHashCode37 + (identityInfo == null ? 0 : identityInfo.hashCode())) * 31;
        Map<String, String> map2 = this.paymentParam;
        int iHashCode39 = (iHashCode38 + (map2 == null ? 0 : map2.hashCode())) * 31;
        PayTrackInfo payTrackInfo = this.payTrackInfo;
        int iHashCode40 = (iHashCode39 + (payTrackInfo == null ? 0 : payTrackInfo.hashCode())) * 31;
        Integer num5 = this.couponSelectedStatus;
        int iHashCode41 = (iHashCode40 + (num5 == null ? 0 : num5.hashCode())) * 31;
        FinancingDetails financingDetails = this.financingDetails;
        int iHashCode42 = (iHashCode41 + (financingDetails == null ? 0 : financingDetails.hashCode())) * 31;
        String str8 = this.previousPayOrderId;
        int iHashCode43 = (iHashCode42 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.pipoErrorCodeParams;
        int iHashCode44 = (iHashCode43 + (str9 == null ? 0 : str9.hashCode())) * 31;
        PayRiskControlParam payRiskControlParam = this.payRiskControlParams;
        int iHashCode45 = (iHashCode44 + (payRiskControlParam == null ? 0 : payRiskControlParam.hashCode())) * 31;
        Boolean bool7 = this.withDonation;
        int iHashCode46 = (iHashCode45 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num6 = this.refundableSampleSelectStatus;
        int iHashCode47 = (iHashCode46 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str10 = this.displayedAddonProductId;
        int iHashCode48 = (iHashCode47 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num7 = this.ageConfirmStatus;
        int iHashCode49 = (iHashCode48 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.oneStepFlowPageType;
        return iHashCode49 + (num8 != null ? num8.hashCode() : 0);
    }

    public String toString() {
        return "BillInfoRequest(buyerAddrId=" + this.buyerAddrId + ", buyType=" + this.buyType + ", orderShop=" + this.orderShop + ", withProductInfo=" + this.withProductInfo + ", withSellerInfo=" + this.withSellerInfo + ", withAddressInputItem=" + this.withAddressInputItem + ", withPreRiskParam=" + this.withPreRiskParam + ", promotionIds=" + this.promotionIds + ", useUserSelection=" + this.useUserSelection + ", claimVoucherTypeIds=" + this.claimVoucherTypeIds + ", claimVoucherMetas=" + this.claimVoucherMetas + ", isNewPayment=" + this.isNewPayment + ", paymentMethod=" + this.paymentMethod + ", orderRequestParams=" + this.orderRequestParams + ", serverIssuedParams=" + this.serverIssuedParams + ", activityIds=" + this.activityIds + ", selectedAddonSKUIds=" + this.selectedAddonSKUIds + ", trafficSourceList=" + Arrays.toString(this.trafficSourceList) + ", noticeVoucherTypeId=" + this.noticeVoucherTypeId + ", addOnProductInfos=" + this.addOnProductInfos + ", oneStepOrderType=" + this.oneStepOrderType + ", isFromFollow=" + this.isFromFollow + ", billInfoParams=" + this.billInfoParams + ", selectedVoucherMetas=" + this.selectedVoucherMetas + ", preLogId=" + this.preLogId + ", pageSourceInfo=" + this.pageSourceInfo + ", clientTemplate=" + this.clientTemplate + ", useBonusRedeem=" + this.useBonusRedeem + ", extraInfo=" + this.extraInfo + ", changeInfo=" + this.changeInfo + ", activityUserSelection=" + this.activityUserSelection + ", useActivityUserSelection=" + this.useActivityUserSelection + ", needCheckAddressUpgrade=" + this.needCheckAddressUpgrade + ", oneClickPayContextString=" + this.oneClickPayContextString + ", addonPanelSnapInfo=" + this.addonPanelSnapInfo + ", ospScene=" + this.ospScene + ", selectAddonOrderSkus=" + this.selectAddonOrderSkus + ", shippingAddressParam=" + this.shippingAddressParam + ", emailAuthorizationSnapInfo=" + this.emailAuthorizationSnapInfo + ", retryTime=" + this.retryTime + ", flowType=" + this.flowType + ", addonScene=" + this.addonScene + ", hideShippingAddonPanel=" + this.hideShippingAddonPanel + ", billInfoClientParam=" + this.billInfoClientParam + ", identityInfo=" + this.identityInfo + ", paymentParam=" + this.paymentParam + ", payTrackInfo=" + this.payTrackInfo + ", couponSelectedStatus=" + this.couponSelectedStatus + ", financingDetails=" + this.financingDetails + ", previousPayOrderId=" + this.previousPayOrderId + ", pipoErrorCodeParams=" + this.pipoErrorCodeParams + ", payRiskControlParams=" + this.payRiskControlParams + ", withDonation=" + this.withDonation + ", refundableSampleSelectStatus=" + this.refundableSampleSelectStatus + ", displayedAddonProductId=" + this.displayedAddonProductId + ", ageConfirmStatus=" + this.ageConfirmStatus + ", oneStepFlowPageType=" + this.oneStepFlowPageType + ')';
    }

    public int countSkuNum() {
        List<OrderShopDigest> list = this.orderShop;
        int size = 0;
        if (list != null) {
            Iterator<OrderShopDigest> it2 = list.iterator();
            size = 0;
            while (it2.hasNext()) {
                List<OrderSKUDTO> list2 = it2.next().orderSKUs;
                size += list2 != null ? list2.size() : 0;
            }
        }
        return size;
    }

    public final List<String> getActivityIds() {
        return this.activityIds;
    }

    public final ActivityUserSelection getActivityUserSelection() {
        return this.activityUserSelection;
    }

    public final List<AddonProductInfo> getAddOnProductInfos() {
        return this.addOnProductInfos;
    }

    public final AddonPanelSnapInfo getAddonPanelSnapInfo() {
        return this.addonPanelSnapInfo;
    }

    public final Integer getAddonScene() {
        return this.addonScene;
    }

    public final Integer getAgeConfirmStatus() {
        return this.ageConfirmStatus;
    }

    public final BillInfoClientParam getBillInfoClientParam() {
        return this.billInfoClientParam;
    }

    public final String getBillInfoParams() {
        return this.billInfoParams;
    }

    public final String getBizType() {
        return this.LL;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final String getBuyerAddrId() {
        return this.buyerAddrId;
    }

    public final ChangeInfo getChangeInfo() {
        return this.changeInfo;
    }

    public final List<VoucherMeta> getClaimVoucherMetas() {
        return this.claimVoucherMetas;
    }

    public final List<String> getClaimVoucherTypeIds() {
        return this.claimVoucherTypeIds;
    }

    public final int getClientTemplate() {
        return this.clientTemplate;
    }

    public final Integer getCouponSelectedStatus() {
        return this.couponSelectedStatus;
    }

    public final String getDisplayedAddonProductId() {
        return this.displayedAddonProductId;
    }

    public final EmailAuthorizationSnapInfo getEmailAuthorizationSnapInfo() {
        return this.emailAuthorizationSnapInfo;
    }

    public final AddonExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public final FinancingDetails getFinancingDetails() {
        return this.financingDetails;
    }

    public final Boolean getFirstLoad() {
        return this.LLILLJJLI;
    }

    public final Integer getFlowType() {
        return this.flowType;
    }

    public final Boolean getHideShippingAddonPanel() {
        return this.hideShippingAddonPanel;
    }

    public final IdentityInfo getIdentityInfo() {
        return this.identityInfo;
    }

    public final Boolean getNeedCheckAddressUpgrade() {
        return this.needCheckAddressUpgrade;
    }

    public final String getNoticeVoucherTypeId() {
        return this.noticeVoucherTypeId;
    }

    public final String getOneClickPayContextString() {
        return this.oneClickPayContextString;
    }

    public final Integer getOneStepFlowPageType() {
        return this.oneStepFlowPageType;
    }

    public final Integer getOneStepOrderType() {
        return this.oneStepOrderType;
    }

    public final Map<String, Object> getOrderRequestParams() {
        return this.orderRequestParams;
    }

    public final List<OrderShopDigest> getOrderShop() {
        return this.orderShop;
    }

    public final OspScene getOspScene() {
        return this.ospScene;
    }

    public final String getPageSourceInfo() {
        return this.pageSourceInfo;
    }

    public final PayRiskControlParam getPayRiskControlParams() {
        return this.payRiskControlParams;
    }

    public final PayTrackInfo getPayTrackInfo() {
        return this.payTrackInfo;
    }

    public final PaymentMethodInfo getPaymentMethod() {
        return this.paymentMethod;
    }

    public final Map<String, String> getPaymentParam() {
        return this.paymentParam;
    }

    public final String getPipoErrorCodeParams() {
        return this.pipoErrorCodeParams;
    }

    public final String getPreLogId() {
        return this.preLogId;
    }

    public final String getPreviousPayOrderId() {
        return this.previousPayOrderId;
    }

    public final List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public final Integer getRefundableSampleSelectStatus() {
        return this.refundableSampleSelectStatus;
    }

    public Integer getReqFlowType() {
        return this.flowType;
    }

    public final Integer getRetryTime() {
        return this.retryTime;
    }

    public final List<AddonOrderSku> getSelectAddonOrderSkus() {
        return this.selectAddonOrderSkus;
    }

    public final List<String> getSelectedAddonSKUIds() {
        return this.selectedAddonSKUIds;
    }

    public final List<VoucherMeta> getSelectedVoucherMetas() {
        return this.selectedVoucherMetas;
    }

    public final String getServerIssuedParams() {
        return this.serverIssuedParams;
    }

    public final ShippingAddressParam getShippingAddressParam() {
        return this.shippingAddressParam;
    }

    public final int[] getTrafficSourceList() {
        return this.trafficSourceList;
    }

    public final Boolean getUseActivityUserSelection() {
        return this.useActivityUserSelection;
    }

    public final Boolean getUseBonusRedeem() {
        return this.useBonusRedeem;
    }

    public final Boolean getUseUserSelection() {
        return this.useUserSelection;
    }

    public final boolean getWithAddressInputItem() {
        return this.withAddressInputItem;
    }

    public final Boolean getWithDonation() {
        return this.withDonation;
    }

    public final boolean getWithPreRiskParam() {
        return this.withPreRiskParam;
    }

    public final boolean getWithProductInfo() {
        return this.withProductInfo;
    }

    public final boolean getWithSellerInfo() {
        return this.withSellerInfo;
    }

    public final Boolean isFromFollow() {
        return this.isFromFollow;
    }

    public final boolean isNewPayment() {
        return this.isNewPayment;
    }

    public final void appendEntranceInfo(View view) {
        List<OrderShopDigest> list = this.orderShop;
        if (list != null) {
            Iterator<OrderShopDigest> it2 = list.iterator();
            while (it2.hasNext()) {
                List<OrderSKUDTO> list2 = it2.next().orderSKUs;
                if (list2 != null) {
                    for (OrderSKUDTO orderSKUDTO : list2) {
                        String str = orderSKUDTO.entranceInfo;
                        if (str != null) {
                            orderSKUDTO.entranceInfo = C848530XQl.LIZIZ(C848530XQl.LIZ, view, str);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C03R6
    public String genCacheKey(Integer num) {
        String strLIZIZ;
        String strLJJLIIIJ;
        Integer num2 = num;
        List<OrderShopDigest> list = this.orderShop;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<OrderShopDigest> it2 = list.iterator();
            while (it2.hasNext()) {
                List<OrderSKUDTO> list2 = it2.next().orderSKUs;
                if (list2 != null) {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(266), 30);
                } else {
                    strLJJLIIIJ = null;
                }
                arrayList.add(strLJJLIIIJ);
            }
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, "_", null, null, 0, null, null, 62);
            if (strLJJLIIIJ2 != null) {
                if (num2 == null) {
                    num2 = this.flowType;
                }
                if (num2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJJLIIIJ2);
                    sbLIZ.append('_');
                    sbLIZ.append(this.buyerAddrId);
                    sbLIZ.append('_');
                    sbLIZ.append(num2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLJJLIIIJ2);
                    sbLIZ2.append('_');
                    sbLIZ2.append(this.buyerAddrId);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                String strLIZ = C2085508Ez.LIZ(strLIZIZ);
                if (strLIZ != null) {
                    return strLIZ;
                }
                return strLIZIZ;
            }
        }
        return null;
    }

    public final void setAgeConfirmStatus(Integer num) {
        this.ageConfirmStatus = num;
    }

    public final void setBizType(String str) {
        this.LL = str;
    }

    public final void setDisplayedAddonProductId(String str) {
        this.displayedAddonProductId = str;
    }

    public final void setFinancingDetails(FinancingDetails financingDetails) {
        this.financingDetails = financingDetails;
    }

    public final void setFirstLoad(Boolean bool) {
        this.LLILLJJLI = bool;
    }

    public final void setOneStepFlowPageType(Integer num) {
        this.oneStepFlowPageType = num;
    }

    public final void setPayRiskControlParams(PayRiskControlParam payRiskControlParam) {
        this.payRiskControlParams = payRiskControlParam;
    }

    public final void setPipoErrorCodeParams(String str) {
        this.pipoErrorCodeParams = str;
    }

    public final void setPreviousPayOrderId(String str) {
        this.previousPayOrderId = str;
    }

    public final void setRefundableSampleSelectStatus(Integer num) {
        this.refundableSampleSelectStatus = num;
    }

    public final void setWithDonation(Boolean bool) {
        this.withDonation = bool;
    }

    public BillInfoRequest(String str, int i, List<OrderShopDigest> list, boolean z, boolean z2, boolean z3, boolean z4, List<String> list2, Boolean bool, List<String> list3, List<VoucherMeta> list4, boolean z5, PaymentMethodInfo paymentMethodInfo, Map<String, ? extends Object> map, String str2, List<String> list5, List<String> list6, int[] iArr, String str3, List<AddonProductInfo> list7, Integer num, Boolean bool2, String str4, List<VoucherMeta> list8, String str5, String str6, int i2, Boolean bool3, AddonExtraInfo addonExtraInfo, ChangeInfo changeInfo, ActivityUserSelection activityUserSelection, Boolean bool4, Boolean bool5, String str7, AddonPanelSnapInfo addonPanelSnapInfo, OspScene ospScene, List<AddonOrderSku> list9, ShippingAddressParam shippingAddressParam, EmailAuthorizationSnapInfo emailAuthorizationSnapInfo, Integer num2, Integer num3, Integer num4, Boolean bool6, BillInfoClientParam billInfoClientParam, IdentityInfo identityInfo, Map<String, String> map2, PayTrackInfo payTrackInfo, Integer num5, FinancingDetails financingDetails, String str8, String str9, PayRiskControlParam payRiskControlParam, Boolean bool7, Integer num6, String str10, Integer num7, Integer num8) {
        this.buyerAddrId = str;
        this.buyType = i;
        this.orderShop = list;
        this.withProductInfo = z;
        this.withSellerInfo = z2;
        this.withAddressInputItem = z3;
        this.withPreRiskParam = z4;
        this.promotionIds = list2;
        this.useUserSelection = bool;
        this.claimVoucherTypeIds = list3;
        this.claimVoucherMetas = list4;
        this.isNewPayment = z5;
        this.paymentMethod = paymentMethodInfo;
        this.orderRequestParams = map;
        this.serverIssuedParams = str2;
        this.activityIds = list5;
        this.selectedAddonSKUIds = list6;
        this.trafficSourceList = iArr;
        this.noticeVoucherTypeId = str3;
        this.addOnProductInfos = list7;
        this.oneStepOrderType = num;
        this.isFromFollow = bool2;
        this.billInfoParams = str4;
        this.selectedVoucherMetas = list8;
        this.preLogId = str5;
        this.pageSourceInfo = str6;
        this.clientTemplate = i2;
        this.useBonusRedeem = bool3;
        this.extraInfo = addonExtraInfo;
        this.changeInfo = changeInfo;
        this.activityUserSelection = activityUserSelection;
        this.useActivityUserSelection = bool4;
        this.needCheckAddressUpgrade = bool5;
        this.oneClickPayContextString = str7;
        this.addonPanelSnapInfo = addonPanelSnapInfo;
        this.ospScene = ospScene;
        this.selectAddonOrderSkus = list9;
        this.shippingAddressParam = shippingAddressParam;
        this.emailAuthorizationSnapInfo = emailAuthorizationSnapInfo;
        this.retryTime = num2;
        this.flowType = num3;
        this.addonScene = num4;
        this.hideShippingAddonPanel = bool6;
        this.billInfoClientParam = billInfoClientParam;
        this.identityInfo = identityInfo;
        this.paymentParam = map2;
        this.payTrackInfo = payTrackInfo;
        this.couponSelectedStatus = num5;
        this.financingDetails = financingDetails;
        this.previousPayOrderId = str8;
        this.pipoErrorCodeParams = str9;
        this.payRiskControlParams = payRiskControlParam;
        this.withDonation = bool7;
        this.refundableSampleSelectStatus = num6;
        this.displayedAddonProductId = str10;
        this.ageConfirmStatus = num7;
        this.oneStepFlowPageType = num8;
    }
}
