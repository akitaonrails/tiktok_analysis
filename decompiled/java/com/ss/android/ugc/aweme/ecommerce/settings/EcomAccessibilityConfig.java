package com.ss.android.ugc.aweme.ecommerce.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcomAccessibilityConfig {
    public static final Config LIZ = new Config(Boolean.TRUE, Boolean.TRUE);

    public static final class Config {

        @C09CT("ecom_accessibility_pdp_bottom_fix")
        public final Boolean accessibilityPdpBottomFix;

        @C09CT("ecom_accessibility_rich_text_fix")
        public final Boolean accessibilityRichTextFix;

        public Config() {
            this(Boolean.TRUE, Boolean.TRUE);
        }

        public Config(Boolean bool, Boolean bool2) {
            this.accessibilityPdpBottomFix = bool;
            this.accessibilityRichTextFix = bool2;
        }
    }
}
