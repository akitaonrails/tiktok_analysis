package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes4.dex */
public final class IMRecallEnhancementConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("one_hour_recall_window")
    public final boolean oneHourRecallWindow;

    public IMRecallEnhancementConfig() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMRecallEnhancementConfig)) {
            return false;
        }
        IMRecallEnhancementConfig iMRecallEnhancementConfig = (IMRecallEnhancementConfig) obj;
        return this.enabled == iMRecallEnhancementConfig.enabled && this.oneHourRecallWindow == iMRecallEnhancementConfig.oneHourRecallWindow;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.oneHourRecallWindow);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMRecallEnhancementConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", oneHourRecallWindow=");
        sbLIZ.append(this.oneHourRecallWindow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMRecallEnhancementConfig(boolean z, boolean z2) {
        this.enabled = z;
        this.oneHourRecallWindow = z2;
    }
}
