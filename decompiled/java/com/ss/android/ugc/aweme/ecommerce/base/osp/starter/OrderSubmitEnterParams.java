package com.ss.android.ugc.aweme.ecommerce.base.osp.starter;

import X.C09CT;
import X.C1019103yf;
import X.C2188811AlT;
import X.EnumC1014603xw;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.model.PlatformLinkBasedItem;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderSubmitEnterParams {
    public static final int $stable = 8;

    @C09CT("asyncBillFetch")
    public final Boolean asyncBillFetch;

    @C09CT("billInfo")
    public final BillInfoResponse billInfoResp;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("btm_token")
    public final String btmToken;

    @C09CT("buy_type")
    public final int buyType;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("combined_area")
    public final List<Region> combinedArea;

    @C09CT("combined_sku_osp_type")
    public final Integer combinedSkuOspType;

    @C09CT("free_shipping")
    public final Integer freeShipping;

    @C09CT("is_platform_product")
    public final Boolean isPlatformProduct;

    @C09CT("order_request_params")
    public final HashMap<String, Object> orderRequestParams;

    @C09CT("pdp_from")
    public final String pdpFrom;

    @C09CT("pipo_bnpl_selected_tenure")
    public final String pipoBnplSelectedTenure;

    @C09CT("platform_link_based_item")
    public final PlatformLinkBasedItem platformLinkBasedItem;

    @C09CT("purchase_method")
    public final Integer purchaseMethod;

    @C09CT("repo_id")
    public final String repoId;

    @C09CT("requestParams")
    public final OrderSubmitRequestParam requestParams;

    @C09CT("sea_one_step_mask")
    public final Integer seaOneStepMask;

    @C09CT("sea_one_step_type")
    public final Integer seaOneStepType;

    @C09CT("sku_panel_height_percent")
    public final Float skuPanelHeightPercent;

    @C09CT("from_soft_intercept")
    public final Integer softIntercept;

    @C09CT("trackParams")
    public final HashMap<String, Object> trackParams;

    @C09CT("voucherTypeId")
    public final String voucherTypeId;

    public OrderSubmitEnterParams() {
        this(null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null);
    }

    public final Boolean getAsyncBillFetch() {
        return this.asyncBillFetch;
    }

    public final BillInfoResponse getBillInfoResp() {
        return this.billInfoResp;
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public final String getBtmToken() {
        return this.btmToken;
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final String getChainKey() {
        return this.chainKey;
    }

    public final List<Region> getCombinedArea() {
        return this.combinedArea;
    }

    public final Integer getCombinedSkuOspType() {
        return this.combinedSkuOspType;
    }

    public final Integer getFreeShipping() {
        return this.freeShipping;
    }

    public final HashMap<String, Object> getOrderRequestParams() {
        return this.orderRequestParams;
    }

    public final String getPdpFrom() {
        return this.pdpFrom;
    }

    public final String getPipoBnplSelectedTenure() {
        return this.pipoBnplSelectedTenure;
    }

    public final PlatformLinkBasedItem getPlatformLinkBasedItem() {
        return this.platformLinkBasedItem;
    }

    public final Integer getPurchaseMethod() {
        return this.purchaseMethod;
    }

    public final String getRepoId() {
        return this.repoId;
    }

    public final OrderSubmitRequestParam getRequestParams() {
        return this.requestParams;
    }

    public final Integer getSeaOneStepMask() {
        return this.seaOneStepMask;
    }

    public final Integer getSeaOneStepType() {
        return this.seaOneStepType;
    }

    public final Float getSkuPanelHeightPercent() {
        return this.skuPanelHeightPercent;
    }

    public final Integer getSoftIntercept() {
        return this.softIntercept;
    }

    public final HashMap<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public final String getVoucherTypeId() {
        return this.voucherTypeId;
    }

    public final Boolean isPlatformProduct() {
        return this.isPlatformProduct;
    }

    public OrderSubmitEnterParams(OrderSubmitRequestParam orderSubmitRequestParam, BillInfoResponse billInfoResponse, List<Region> list, String str, HashMap<String, Object> map, String str2, int i, Boolean bool, String str3, Integer num, String str4, Integer num2, String str5, Integer num3, HashMap<String, Object> map2, Integer num4, String str6, PlatformLinkBasedItem platformLinkBasedItem, Boolean bool2, Integer num5, Float f, Integer num6, Integer num7) {
        Object obj;
        this.requestParams = orderSubmitRequestParam;
        this.billInfoResp = billInfoResponse;
        this.combinedArea = list;
        this.chainKey = str;
        this.trackParams = map;
        this.repoId = str2;
        this.buyType = i;
        this.asyncBillFetch = bool;
        this.pdpFrom = str3;
        this.combinedSkuOspType = num;
        this.voucherTypeId = str4;
        this.bizType = num2;
        this.pipoBnplSelectedTenure = str5;
        this.freeShipping = num3;
        this.orderRequestParams = map2;
        this.softIntercept = num4;
        this.btmToken = str6;
        this.platformLinkBasedItem = platformLinkBasedItem;
        this.isPlatformProduct = bool2;
        this.purchaseMethod = num5;
        this.skuPanelHeightPercent = f;
        this.seaOneStepType = num6;
        this.seaOneStepMask = num7;
        if (str == null || str.length() == 0) {
            if (map != null) {
                obj = map.get("source_page_type");
            } else {
                obj = null;
            }
            if (!Intrinsics.LJFF(obj, "mall")) {
                EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR30;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("chainKey get null init, OrderSubmitEnterParams: ");
                sbLIZ.append(this);
                C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), map);
            }
        }
    }
}
