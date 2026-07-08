package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class DiscountBackInfo {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("discount_back_desc_text")
    public String discountBackDescText;

    @C09CT("discount_back_title")
    public String discountBackTitle;

    @C09CT("reduction_type")
    public Integer reductionType;

    public DiscountBackInfo() {
        this(null, null, null, null, null);
    }

    public DiscountBackInfo(Integer num, String str, String str2, String str3, String str4) {
        this.reductionType = num;
        this.discountBackTitle = str;
        this.discountBackDescText = str2;
        this.buttonText = str3;
        this.daInfo = str4;
    }
}
