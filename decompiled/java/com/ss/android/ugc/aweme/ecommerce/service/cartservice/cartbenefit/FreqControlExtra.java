package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitBehave;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitBizType;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleType;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;

/* JADX INFO: loaded from: classes27.dex */
public final class FreqControlExtra {

    @C09CT("benefit_behave")
    public final CartBenefitBehave benefitBehave;

    @C09CT("benefit_biz_type")
    public final CartBenefitBizType benefitBizType;

    @C09CT("benefit_style_type")
    public final CartBenefitStyleType benefitStyleType;

    @C09CT("cart_entry_from")
    public final CartEntryFrom cartEntryFrom;

    @C09CT("cart_server_promo_transparent")
    public final String cartServerPromo;

    public FreqControlExtra(CartEntryFrom cartEntryFrom, CartBenefitBehave cartBenefitBehave, CartBenefitBizType cartBenefitBizType, CartBenefitStyleType cartBenefitStyleType, String str) {
        this.cartEntryFrom = cartEntryFrom;
        this.benefitBehave = cartBenefitBehave;
        this.benefitBizType = cartBenefitBizType;
        this.benefitStyleType = cartBenefitStyleType;
        this.cartServerPromo = str;
    }
}
