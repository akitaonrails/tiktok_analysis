package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ToggleCompliance {

    @C09CT("bc_custom_alert_terminology")
    public int bcCustomAlertTerminology;

    @C09CT("bc_switch_on")
    public final boolean bcSwitchOn;

    @C09CT("bc_switch_readonly")
    public final boolean bcSwitchReadOnly;

    @C09CT("bo_switch_on")
    public final boolean boSwitchOn;

    @C09CT("bo_switch_readonly")
    public final boolean boSwitchReadOnly;

    public ToggleCompliance() {
        this(false, false, false, false, 0);
    }

    public ToggleCompliance(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.bcSwitchOn = z;
        this.bcSwitchReadOnly = z2;
        this.boSwitchOn = z3;
        this.boSwitchReadOnly = z4;
        this.bcCustomAlertTerminology = i;
    }
}
