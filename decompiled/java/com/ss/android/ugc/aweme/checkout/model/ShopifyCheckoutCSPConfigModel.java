package com.ss.android.ugc.aweme.checkout.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ShopifyCheckoutCSPConfigModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("exclude_thank_you_page")
    public final Boolean excludeThankYouPage;

    @C09CT("prefill_email")
    public final Boolean prefillEmail;

    @C09CT("remove_non_checkout_ua")
    public final Boolean removeNonCheckoutUa;

    @C09CT("show_discount_banner")
    public final Boolean showDiscountBanner;

    public ShopifyCheckoutCSPConfigModel() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE);
    }

    public ShopifyCheckoutCSPConfigModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.excludeThankYouPage = bool;
        this.showDiscountBanner = bool2;
        this.prefillEmail = bool3;
        this.removeNonCheckoutUa = bool4;
    }
}
