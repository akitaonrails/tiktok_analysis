package com.ss.android.ugc.aweme.checkout.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class ShopifyCheckoutPrivacyConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("allowed_privacy_regions")
    public final String allowedPrivacyRegions;

    @C09CT("hide_disclaimer_text_non_US")
    public final Boolean hideDisclaimerTextNonUS;

    @C09CT("hide_welcome_window_non_US")
    public final Boolean hideWelcomeWindowNonUS;

    @C09CT("use_ui_black_theme")
    public final Boolean useUiBlackTheme;

    public ShopifyCheckoutPrivacyConfig() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, "US");
    }

    public ShopifyCheckoutPrivacyConfig(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.hideWelcomeWindowNonUS = bool;
        this.hideDisclaimerTextNonUS = bool2;
        this.useUiBlackTheme = bool3;
        this.allowedPrivacyRegions = str;
    }
}
