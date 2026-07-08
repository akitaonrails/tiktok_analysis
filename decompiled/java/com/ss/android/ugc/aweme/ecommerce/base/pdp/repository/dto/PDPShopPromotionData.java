package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;

/* JADX INFO: loaded from: classes27.dex */
public final class PDPShopPromotionData {

    @C09CT("flash_sale_info")
    public final FlashSale flashSaleInfo;

    @C09CT("shop_promotion_schema")
    public final String shopPromotionSchema;

    @C09CT("voucher")
    public final Voucher voucher;

    @C09CT("voucher_button_next_stage")
    public final String voucherButtonNextStage;

    public PDPShopPromotionData() {
        this(null, null, null, null);
    }

    public PDPShopPromotionData(Voucher voucher, FlashSale flashSale, String str, String str2) {
        this.voucher = voucher;
        this.flashSaleInfo = flashSale;
        this.shopPromotionSchema = str;
        this.voucherButtonNextStage = str2;
    }
}
