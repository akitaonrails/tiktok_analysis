package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomOspPrivacyPopupConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_accessory_adapt")
    public final boolean enableAccessoryAdapt;

    @C09CT("enable_custom_link_handler")
    public final boolean enableCustomLinkHandler;

    @C09CT("max_height_dp")
    public final Integer maxHeightDp;

    public EcomOspPrivacyPopupConfig() {
        this(true, true, true, null);
    }

    public EcomOspPrivacyPopupConfig(boolean z, boolean z2, boolean z3, Integer num) {
        this.enable = z;
        this.enableCustomLinkHandler = z2;
        this.enableAccessoryAdapt = z3;
        this.maxHeightDp = num;
    }
}
