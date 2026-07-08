package com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto;

import X.C03R6;
import X.C09CT;
import X.C13LP;
import X.C15438062q;
import X.C2085508Ez;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PreloadBillInfoRequest implements C03R6 {

    @C09CT("bill_info_server_params")
    public final String billInfoParams;

    @C09CT("buy_type")
    public final int buyType;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("client_template")
    public final int clientTemplate;

    @C09CT("extra_info")
    public final AddonExtraInfo extraInfo;

    @C09CT("flow_type")
    public final Integer flowType;

    @C09CT("is_from_follow")
    public final Boolean isFromFollow;

    @C09CT("need_addr_upgrade_exception")
    public final Boolean needCheckAddressUpgrade;

    @C09CT("one_step_order_type")
    public final Integer oneStepOrderType;

    @C09CT("order_shop")
    public final List<OrderShopDigest> orderShop;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @C09CT("pre_load_check_param")
    public final PreloadCheckParam preLoadCheckParam;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadBillInfoRequest)) {
            return false;
        }
        PreloadBillInfoRequest preloadBillInfoRequest = (PreloadBillInfoRequest) obj;
        return Intrinsics.LJFF(this.buyerAddrId, preloadBillInfoRequest.buyerAddrId) && Intrinsics.LJFF(this.orderShop, preloadBillInfoRequest.orderShop) && this.buyType == preloadBillInfoRequest.buyType && Intrinsics.LJFF(this.trafficSourceList, preloadBillInfoRequest.trafficSourceList) && Intrinsics.LJFF(this.oneStepOrderType, preloadBillInfoRequest.oneStepOrderType) && Intrinsics.LJFF(this.isFromFollow, preloadBillInfoRequest.isFromFollow) && Intrinsics.LJFF(this.preLogId, preloadBillInfoRequest.preLogId) && Intrinsics.LJFF(this.billInfoParams, preloadBillInfoRequest.billInfoParams) && Intrinsics.LJFF(this.pageSourceInfo, preloadBillInfoRequest.pageSourceInfo) && this.clientTemplate == preloadBillInfoRequest.clientTemplate && Intrinsics.LJFF(this.needCheckAddressUpgrade, preloadBillInfoRequest.needCheckAddressUpgrade) && Intrinsics.LJFF(this.extraInfo, preloadBillInfoRequest.extraInfo) && Intrinsics.LJFF(this.payRiskControlParam, preloadBillInfoRequest.payRiskControlParam) && Intrinsics.LJFF(this.preLoadCheckParam, preloadBillInfoRequest.preLoadCheckParam) && Intrinsics.LJFF(this.flowType, preloadBillInfoRequest.flowType);
    }

    public final int hashCode() {
        String str = this.buyerAddrId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<OrderShopDigest> list = this.orderShop;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.buyType) * 31;
        int[] iArr = this.trafficSourceList;
        int iHashCode3 = (iHashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        Integer num = this.oneStepOrderType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isFromFollow;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.preLogId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billInfoParams;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pageSourceInfo;
        int iHashCode8 = (((iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.clientTemplate) * 31;
        Boolean bool2 = this.needCheckAddressUpgrade;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AddonExtraInfo addonExtraInfo = this.extraInfo;
        int iHashCode10 = (iHashCode9 + (addonExtraInfo == null ? 0 : addonExtraInfo.hashCode())) * 31;
        PayRiskControlParam payRiskControlParam = this.payRiskControlParam;
        int iHashCode11 = (iHashCode10 + (payRiskControlParam == null ? 0 : payRiskControlParam.hashCode())) * 31;
        PreloadCheckParam preloadCheckParam = this.preLoadCheckParam;
        int iHashCode12 = (iHashCode11 + (preloadCheckParam == null ? 0 : preloadCheckParam.hashCode())) * 31;
        Integer num2 = this.flowType;
        return iHashCode12 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "PreloadBillInfoRequest(buyerAddrId=" + this.buyerAddrId + ", orderShop=" + this.orderShop + ", buyType=" + this.buyType + ", trafficSourceList=" + Arrays.toString(this.trafficSourceList) + ", oneStepOrderType=" + this.oneStepOrderType + ", isFromFollow=" + this.isFromFollow + ", preLogId=" + this.preLogId + ", billInfoParams=" + this.billInfoParams + ", pageSourceInfo=" + this.pageSourceInfo + ", clientTemplate=" + this.clientTemplate + ", needCheckAddressUpgrade=" + this.needCheckAddressUpgrade + ", extraInfo=" + this.extraInfo + ", payRiskControlParam=" + this.payRiskControlParam + ", preLoadCheckParam=" + this.preLoadCheckParam + ", flowType=" + this.flowType + ')';
    }

    public final int LIZ() {
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

    @Override // X.C03R6
    public final String genCacheKey(Integer num) {
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
                    strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(265), 30);
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

    public PreloadBillInfoRequest(String str, List<OrderShopDigest> list, int i, int[] iArr, Integer num, Boolean bool, String str2, String str3, String str4, int i2, Boolean bool2, AddonExtraInfo addonExtraInfo, PayRiskControlParam payRiskControlParam, PreloadCheckParam preloadCheckParam, Integer num2) {
        this.buyerAddrId = str;
        this.orderShop = list;
        this.buyType = i;
        this.trafficSourceList = iArr;
        this.oneStepOrderType = num;
        this.isFromFollow = bool;
        this.preLogId = str2;
        this.billInfoParams = str3;
        this.pageSourceInfo = str4;
        this.clientTemplate = i2;
        this.needCheckAddressUpgrade = bool2;
        this.extraInfo = addonExtraInfo;
        this.payRiskControlParam = payRiskControlParam;
        this.preLoadCheckParam = preloadCheckParam;
        this.flowType = num2;
    }
}
