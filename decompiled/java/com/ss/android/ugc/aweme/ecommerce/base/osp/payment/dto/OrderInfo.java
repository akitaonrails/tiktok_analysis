package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class OrderInfo {

    @C09CT("benefit_emphasis_info")
    public final String benefitEmphasisInfo;

    @C09CT("sku_number_info")
    public final Integer skuNumberInfo;

    public OrderInfo(String str, Integer num) {
        this.benefitEmphasisInfo = str;
        this.skuNumberInfo = num;
    }
}
