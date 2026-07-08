package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CartBenefitInfo {

    @C09CT("biz_type")
    public final CartBenefitBizType cartBenefitBizType;

    @C09CT("style")
    public final CartBenefitStyleType cartBenefitStyleType;

    @C09CT("cart_server_promo_transparent")
    public final String cartServerPromo;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("dynamic_item")
    public final CartBenefitItem dynamicItem;

    @C09CT("is_disappear_after_click")
    public final Boolean isDisappearAfterClick;

    @C09CT("static_item")
    public final CartBenefitItem staticItem;

    public CartBenefitInfo(CartBenefitBizType cartBenefitBizType, CartBenefitStyleType cartBenefitStyleType, CartBenefitItem cartBenefitItem, CartBenefitItem cartBenefitItem2, String str, String str2, Boolean bool) {
        this.cartBenefitBizType = cartBenefitBizType;
        this.cartBenefitStyleType = cartBenefitStyleType;
        this.dynamicItem = cartBenefitItem;
        this.staticItem = cartBenefitItem2;
        this.daInfo = str;
        this.cartServerPromo = str2;
        this.isDisappearAfterClick = bool;
    }
}
