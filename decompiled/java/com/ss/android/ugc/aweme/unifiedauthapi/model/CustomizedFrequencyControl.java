package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class CustomizedFrequencyControl implements Serializable {

    @C09CT("close_time_limit")
    public int exitingLimit;

    @C09CT("name")
    public String name;

    @C09CT("show_up_interval")
    public int showUpInterval;

    @C09CT("show_up_after_3times_interval")
    public int showUpIntervalAfterExiting;

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.showUpInterval) * 31) + this.exitingLimit) * 31) + this.showUpIntervalAfterExiting;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizedFrequencyControl(name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", showUpInterval=");
        sbLIZ.append(this.showUpInterval);
        sbLIZ.append(", exitingLimit=");
        sbLIZ.append(this.exitingLimit);
        sbLIZ.append(", showUpIntervalAfterExiting=");
        sbLIZ.append(this.showUpIntervalAfterExiting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CustomizedFrequencyControl() {
        this("customized_frequency_control", 0, 0, 0);
    }

    public final void setExitingLimit(int i) {
        this.exitingLimit = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setShowUpInterval(int i) {
        this.showUpInterval = i;
    }

    public final void setShowUpIntervalAfterExiting(int i) {
        this.showUpIntervalAfterExiting = i;
    }

    public CustomizedFrequencyControl(String str, int i, int i2, int i3) {
        this.name = str;
        this.showUpInterval = i;
        this.exitingLimit = i2;
        this.showUpIntervalAfterExiting = i3;
    }
}
