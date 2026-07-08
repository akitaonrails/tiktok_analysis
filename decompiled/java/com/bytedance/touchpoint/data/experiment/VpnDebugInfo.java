package com.bytedance.touchpoint.data.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class VpnDebugInfo {

    @C09CT("ug_block_vpn_path")
    public final String blockPath;

    @C09CT("disable")
    public final boolean disable;

    @C09CT("disable_update_force")
    public final boolean disableUpdateForce;

    public VpnDebugInfo() {
        this("/tiktok/incentive/", false, false);
    }

    public VpnDebugInfo(String str, boolean z, boolean z2) {
        this.blockPath = str;
        this.disable = z;
        this.disableUpdateForce = z2;
    }
}
