package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class OneClickSysPopupConfig implements Serializable {

    @C09CT("oc_freq_rule")
    public CustomizedFrequencyControl customizedFrequencyControl;

    @C09CT("oc_description")
    public String description;

    @C09CT("show_mask")
    public boolean showMask;

    public OneClickSysPopupConfig() {
        this(false, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneClickSysPopupConfig)) {
            return false;
        }
        OneClickSysPopupConfig oneClickSysPopupConfig = (OneClickSysPopupConfig) obj;
        return this.showMask == oneClickSysPopupConfig.showMask && Intrinsics.LJFF(this.description, oneClickSysPopupConfig.description) && Intrinsics.LJFF(this.customizedFrequencyControl, oneClickSysPopupConfig.customizedFrequencyControl);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.showMask) * 31;
        String str = this.description;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        CustomizedFrequencyControl customizedFrequencyControl = this.customizedFrequencyControl;
        return iHashCode + (customizedFrequencyControl != null ? customizedFrequencyControl.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneClickSysPopupConfig(showMask=");
        sbLIZ.append(this.showMask);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", customizedFrequencyControl=");
        sbLIZ.append(this.customizedFrequencyControl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setCustomizedFrequencyControl(CustomizedFrequencyControl customizedFrequencyControl) {
        this.customizedFrequencyControl = customizedFrequencyControl;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setShowMask(boolean z) {
        this.showMask = z;
    }

    public OneClickSysPopupConfig(boolean z, String str, CustomizedFrequencyControl customizedFrequencyControl) {
        this.showMask = z;
        this.description = str;
        this.customizedFrequencyControl = customizedFrequencyControl;
    }
}
