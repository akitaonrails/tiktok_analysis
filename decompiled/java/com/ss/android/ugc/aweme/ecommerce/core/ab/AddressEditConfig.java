package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressEditConfig {

    @C09CT("enable_protection_subtitle")
    public boolean enableProtectionSubtitle;

    @C09CT("enable_required_mark")
    public boolean enableRequiredMark;

    public AddressEditConfig() {
        this(false, false);
    }

    public AddressEditConfig(boolean z, boolean z2) {
        this.enableProtectionSubtitle = z;
        this.enableRequiredMark = z2;
    }
}
