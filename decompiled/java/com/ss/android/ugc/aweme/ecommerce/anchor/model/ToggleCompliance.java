package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes31.dex */
public final class ToggleCompliance implements Serializable {

    @C09CT("bc_custom_alert_terminology")
    public int bcCustomAlertTerminology;

    @C09CT("bc_switch_on")
    public final boolean bcSwitchOn;

    @C09CT("bc_switch_readonly")
    public final boolean bcSwitchReadonly;

    @C09CT("bo_switch_on")
    public final boolean boSwitchOn;

    @C09CT("bo_switch_readonly")
    public final boolean boSwitchReadonly;

    public ToggleCompliance() {
        this(false, false, false, false, 0);
    }

    public final void setBcCustomAlertTerminology(int i) {
        this.bcCustomAlertTerminology = i;
    }

    public ToggleCompliance(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.bcSwitchOn = z;
        this.bcSwitchReadonly = z2;
        this.boSwitchOn = z3;
        this.boSwitchReadonly = z4;
        this.bcCustomAlertTerminology = i;
    }
}
