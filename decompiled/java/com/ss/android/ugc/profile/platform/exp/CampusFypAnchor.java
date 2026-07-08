package com.ss.android.ugc.profile.platform.exp;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class CampusFypAnchor {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("should_show_add_button_in_post_tab")
    public final boolean shouldShowAddButtonInPostTab;

    @C09CT("support_potential")
    public final boolean supportPotential;

    public CampusFypAnchor() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampusFypAnchor)) {
            return false;
        }
        CampusFypAnchor campusFypAnchor = (CampusFypAnchor) obj;
        return this.enabled == campusFypAnchor.enabled && this.shouldShowAddButtonInPostTab == campusFypAnchor.shouldShowAddButtonInPostTab && this.supportPotential == campusFypAnchor.supportPotential;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.shouldShowAddButtonInPostTab)) * 31) + C786410Ut5.Z2(this.supportPotential);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CampusFypAnchor(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", shouldShowAddButtonInPostTab=");
        sbLIZ.append(this.shouldShowAddButtonInPostTab);
        sbLIZ.append(", supportPotential=");
        sbLIZ.append(this.supportPotential);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CampusFypAnchor(boolean z, boolean z2, boolean z3) {
        this.enabled = z;
        this.shouldShowAddButtonInPostTab = z2;
        this.supportPotential = z3;
    }
}
