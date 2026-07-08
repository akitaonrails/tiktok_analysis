package com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto;

import X.C09CT;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsPeriodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherMeta;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddItemPageCtx;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.BizExtra;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.UserVirtualAtcInfo;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class AddItemToCartRequest {

    @C09CT("add_count")
    public final Integer addCount;

    @C09CT("add_item_page_ctx")
    public final AddItemPageCtx addItemCtx;

    @C09CT("add_item_source_page")
    public final Integer addItemSourcePage;

    @C09CT("bcm_chain")
    public final String bcmChain;

    @C09CT("biz_extra")
    public final BizExtra bizExtra;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("chain_key")
    public final String chainKey;

    @C09CT("claim_voucher_metas")
    public final List<VoucherMeta> claimVoucherMetas;

    @C09CT("claim_voucher_type_ids")
    public final List<String> claimVoucherTypeIds;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("insurance_info")
    public final InsuranceInfo insuranceInfo;

    @C09CT("kol_id")
    public final String kolId;

    @C09CT("logistics_service_id")
    public final String logisticsServiceID;

    @C09CT("mobile_pipe_ctx")
    public final String mobilePipeCtx;

    @C09CT("need_recommend")
    public final Boolean needRecommend;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("platform_link_based_item")
    public final PlatformLinkInfo platformLinkInfo;

    @C09CT("product_id")
    public final String productId;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("ship_to_addr")
    public final List<District> shipToAddr;

    @C09CT("sku_id")
    public final String skuId;

    @C09CT("sku_price")
    public final String skuPrice;

    @C09CT("sns_period_info")
    public final SnsPeriodInfo snsPeriodInfo;

    @C09CT("source")
    public final Integer source;

    @C09CT("source_info")
    public final String sourceInfo;

    @C09CT("user_virtual_info")
    public final UserVirtualAtcInfo virtualInfo;

    @C09CT("warehouse_id")
    public final String warehouseId;

    public final AddToCartRequestParam LIZ(Map<String, ? extends Object> map) {
        int iIntValue = 0;
        int iIntValue2 = 1;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("claim_voucher_type_ids", this.claimVoucherTypeIds), new Pair("claim_voucher_metas", this.claimVoucherMetas), new Pair("source_info", this.sourceInfo), new Pair("source", this.source), new Pair("kol_id", this.kolId), new Pair("warehouse_id", this.warehouseId), new Pair("mobile_pipe_ctx", this.mobilePipeCtx), new Pair("sns_period_info", this.snsPeriodInfo), new Pair("insurance_info", this.insuranceInfo));
        if (map != null) {
            mapLJIIJ.putAll(map);
        }
        String str = this.productId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.sellerId;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.skuId;
        if (str4 != null) {
            str2 = str4;
        }
        Integer num = this.addCount;
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        String str5 = this.chainKey;
        Integer num2 = this.addItemSourcePage;
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return new AddToCartRequestParam(str, str3, str2, iIntValue2, iIntValue, this.pageSourceInfo, str5, this.entranceInfo, mapLJIIJ, this.addItemCtx, this.platformLinkInfo, this.bizExtra, this.buyerAddrId, this.shipToAddr, this.virtualInfo);
    }

    public AddItemToCartRequest(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, String str7, List<String> list, String str8, String str9, String str10, String str11, String str12, Integer num3, Boolean bool, String str13, AddItemPageCtx addItemPageCtx, PlatformLinkInfo platformLinkInfo, BizExtra bizExtra, String str14, SnsPeriodInfo snsPeriodInfo, InsuranceInfo insuranceInfo, List<District> list2, UserVirtualAtcInfo userVirtualAtcInfo, List<VoucherMeta> list3) {
        this.sellerId = str;
        this.warehouseId = str2;
        this.productId = str3;
        this.skuId = str4;
        this.addCount = num;
        this.chainKey = str5;
        this.entranceInfo = str6;
        this.source = num2;
        this.kolId = str7;
        this.claimVoucherTypeIds = list;
        this.sourceInfo = str8;
        this.buyerAddrId = str9;
        this.skuPrice = str10;
        this.logisticsServiceID = str11;
        this.pageSourceInfo = str12;
        this.addItemSourcePage = num3;
        this.needRecommend = bool;
        this.bcmChain = str13;
        this.addItemCtx = addItemPageCtx;
        this.platformLinkInfo = platformLinkInfo;
        this.bizExtra = bizExtra;
        this.mobilePipeCtx = str14;
        this.snsPeriodInfo = snsPeriodInfo;
        this.insuranceInfo = insuranceInfo;
        this.shipToAddr = list2;
        this.virtualInfo = userVirtualAtcInfo;
        this.claimVoucherMetas = list3;
    }
}
