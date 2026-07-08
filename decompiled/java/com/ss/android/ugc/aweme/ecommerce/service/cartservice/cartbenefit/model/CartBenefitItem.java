package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CartBenefitItem {

    @C09CT("content_info")
    public final CartBenefitContentInfo contentInfo;

    @C09CT("style_info")
    public final CartBenefitStyleInfo styleInfo;

    public CartBenefitItem(CartBenefitStyleInfo cartBenefitStyleInfo, CartBenefitContentInfo cartBenefitContentInfo) {
        this.styleInfo = cartBenefitStyleInfo;
        this.contentInfo = cartBenefitContentInfo;
    }
}
