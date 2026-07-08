package com.ss.android.ugc.aweme.ecommerce.base.osp.starter;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.ActivityUserSelection;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonPanelSnapInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CartSummaryInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationSnapInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSubmitRequestParam implements Serializable {
    public static final int $stable = 8;

    @C09CT("activity_ids")
    public final List<String> activityIds;

    @C09CT("activity_user_selection")
    public final ActivityUserSelection activityUserSelection;

    @C09CT("addon_panel_snap_info")
    public final AddonPanelSnapInfo addonPanelSnapInfo;

    @C09CT("buyer_addr_id")
    public String addressId;

    @C09CT("bill_info_server_params")
    public final String billInfoParams;

    @C09CT("call_jsb_timestamp")
    public final Long callJsbTimestamp;

    @C09CT("cart_summary_info")
    public final CartSummaryInfo cartSummaryInfo;

    @C09CT("claim_voucher_metas")
    public final List<VoucherMeta> claimVoucherMetas;

    @C09CT("click_timestamp")
    public final Long clickTimestamp;

    @C09CT("da_info")
    public final Map<String, String> daInfo;

    @C09CT("email_authorization_snap_info")
    public final EmailAuthorizationSnapInfo emailAuthorizationSnapInfo;

    @C09CT("flow_type")
    public final Integer flowType;

    @C09CT("is_from_follow")
    public Boolean isFromFollow;

    @C09CT("key_timestamp")
    public final Long keyTimestamp;

    @C09CT("notice_voucher_type_id")
    public final String noticeVoucherTypeId;

    @C09CT("one_step_order_type")
    public final Integer oneStepOrderType;

    @C09CT("order_request_params")
    public Map<String, Object> orderRequestParams;

    @C09CT("order_shop")
    public List<OrderShopDigest> orderShopDigest;

    @C09CT("pipo_bnpl_selected_tenure")
    public final String pipoBnplSelectedTenure;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("pre_track_time")
    public final HashMap<String, Object> preTrackTime;

    @C09CT("promotion_ids")
    public final List<String> promotionIds;

    @C09CT("selected_voucher_metas")
    public final List<VoucherMeta> selectedVoucherMetas;

    @C09CT("to_auto_claim_voucher_type_ids")
    public final List<String> toAutoClaimVoucherTypeIDs;

    public OrderSubmitRequestParam() {
        this(null, null, null, null, null, null, null, 0L, 0L, 0L, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int countSkuNum() {
        List<OrderShopDigest> list = this.orderShopDigest;
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

    public final AddonPanelSnapInfo getAddonPanelSnapInfo() {
        return this.addonPanelSnapInfo;
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public final String getBillInfoParams() {
        return this.billInfoParams;
    }

    public final Long getCallJsbTimestamp() {
        return this.callJsbTimestamp;
    }

    public final CartSummaryInfo getCartSummaryInfo() {
        return this.cartSummaryInfo;
    }

    public final List<VoucherMeta> getClaimVoucherMetas() {
        return this.claimVoucherMetas;
    }

    public final Long getClickTimestamp() {
        return this.clickTimestamp;
    }

    public final Map<String, String> getDaInfo() {
        return this.daInfo;
    }

    public final EmailAuthorizationSnapInfo getEmailAuthorizationSnapInfo() {
        return this.emailAuthorizationSnapInfo;
    }

    public final Integer getFlowType() {
        return this.flowType;
    }

    public final Long getKeyTimestamp() {
        return this.keyTimestamp;
    }

    public final String getNoticeVoucherTypeId() {
        return this.noticeVoucherTypeId;
    }

    public final Integer getOneStepOrderType() {
        return this.oneStepOrderType;
    }

    public final Map<String, Object> getOrderRequestParams() {
        return this.orderRequestParams;
    }

    public final List<OrderShopDigest> getOrderShopDigest() {
        return this.orderShopDigest;
    }

    public final String getPipoBnplSelectedTenure() {
        return this.pipoBnplSelectedTenure;
    }

    public final String getPreLogId() {
        return this.preLogId;
    }

    public final HashMap<String, Object> getPreTrackTime() {
        return this.preTrackTime;
    }

    public final List<String> getPromotionIds() {
        return this.promotionIds;
    }

    public final List<VoucherMeta> getSelectedVoucherMetas() {
        return this.selectedVoucherMetas;
    }

    public final List<String> getToAutoClaimVoucherTypeIDs() {
        return this.toAutoClaimVoucherTypeIDs;
    }

    public final Boolean isFromFollow() {
        return this.isFromFollow;
    }

    public final void setAddressId(String str) {
        this.addressId = str;
    }

    public final void setFromFollow(Boolean bool) {
        this.isFromFollow = bool;
    }

    public final void setOrderRequestParams(Map<String, Object> map) {
        this.orderRequestParams = map;
    }

    public final void setOrderShopDigest(List<OrderShopDigest> list) {
        this.orderShopDigest = list;
    }

    public OrderSubmitRequestParam(String str, List<OrderShopDigest> list, Map<String, Object> map, String str2, List<String> list2, List<VoucherMeta> list3, List<String> list4, Long l, Long l2, Long l3, HashMap<String, Object> map2, Integer num, Boolean bool, Map<String, String> map3, String str3, String str4, List<String> list5, List<VoucherMeta> list6, ActivityUserSelection activityUserSelection, AddonPanelSnapInfo addonPanelSnapInfo, EmailAuthorizationSnapInfo emailAuthorizationSnapInfo, CartSummaryInfo cartSummaryInfo, Integer num2, String str5) {
        this.addressId = str;
        this.orderShopDigest = list;
        this.orderRequestParams = map;
        this.noticeVoucherTypeId = str2;
        this.toAutoClaimVoucherTypeIDs = list2;
        this.claimVoucherMetas = list3;
        this.activityIds = list4;
        this.keyTimestamp = l;
        this.clickTimestamp = l2;
        this.callJsbTimestamp = l3;
        this.preTrackTime = map2;
        this.oneStepOrderType = num;
        this.isFromFollow = bool;
        this.daInfo = map3;
        this.preLogId = str3;
        this.billInfoParams = str4;
        this.promotionIds = list5;
        this.selectedVoucherMetas = list6;
        this.activityUserSelection = activityUserSelection;
        this.addonPanelSnapInfo = addonPanelSnapInfo;
        this.emailAuthorizationSnapInfo = emailAuthorizationSnapInfo;
        this.cartSummaryInfo = cartSummaryInfo;
        this.flowType = num2;
        this.pipoBnplSelectedTenure = str5;
    }
}
