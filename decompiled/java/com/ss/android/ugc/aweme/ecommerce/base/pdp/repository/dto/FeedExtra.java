package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class FeedExtra {

    @C09CT("recommend_info")
    public final String recommendInfo;

    @C09CT("shop_promotion_schema")
    public final String shopPromotionSchema;

    @C09CT("voucher_count")
    public final Integer voucherCount;

    public FeedExtra() {
        this(null, null, null);
    }

    public final int hashCode() {
        String str = this.recommendInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.voucherCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.shopPromotionSchema;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public FeedExtra(String str, Integer num, String str2) {
        this.recommendInfo = str;
        this.voucherCount = num;
        this.shopPromotionSchema = str2;
    }
}
