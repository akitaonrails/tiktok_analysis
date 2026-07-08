package com.bytedance.android.livesdk.adminsetting.toggle;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class EcToggleSwitchConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("promote_myself_available")
    public final boolean promoteMyselfAvailable;

    @C09CT("promote_third_party_available")
    public final boolean promoteThirdPartyAvailable;

    public EcToggleSwitchConfig() {
        this(false, true, true);
    }

    public EcToggleSwitchConfig(boolean z, boolean z2, boolean z3) {
        this.enabled = z;
        this.promoteMyselfAvailable = z2;
        this.promoteThirdPartyAvailable = z3;
    }
}
