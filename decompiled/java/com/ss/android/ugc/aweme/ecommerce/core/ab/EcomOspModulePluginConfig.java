package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomOspModulePluginConfig {

    @C09CT("donation_module_config")
    public final DonationModuleConfig donationModuleConfig;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_add_cart")
    public final boolean enableAddCart;

    @C09CT("enable_donation")
    public final boolean enableDonation;

    @C09CT("enable_ephamacy")
    public final boolean enableEphamacy;

    public EcomOspModulePluginConfig() {
        this(true, true, true, true, null);
    }

    public EcomOspModulePluginConfig(boolean z, boolean z2, boolean z3, boolean z4, DonationModuleConfig donationModuleConfig) {
        this.enable = z;
        this.enableAddCart = z2;
        this.enableEphamacy = z3;
        this.enableDonation = z4;
        this.donationModuleConfig = donationModuleConfig;
    }
}
