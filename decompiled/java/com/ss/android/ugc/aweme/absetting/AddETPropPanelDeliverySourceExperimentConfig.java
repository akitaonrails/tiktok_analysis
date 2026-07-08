package com.ss.android.ugc.aweme.absetting;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class AddETPropPanelDeliverySourceExperimentConfig {

    @C09CT("enable")
    public final boolean enable;

    public AddETPropPanelDeliverySourceExperimentConfig() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddETPropPanelDeliverySourceExperimentConfig) && this.enable == ((AddETPropPanelDeliverySourceExperimentConfig) obj).enable;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.enable);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddETPropPanelDeliverySourceExperimentConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddETPropPanelDeliverySourceExperimentConfig(boolean z) {
        this.enable = z;
    }
}
