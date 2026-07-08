package com.ss.android.ugc.aweme.internalshare.impl.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class SharePanelSearchDebugLabelConfig {

    @C09CT("enabled")
    public final int enabled;

    public SharePanelSearchDebugLabelConfig() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharePanelSearchDebugLabelConfig) && this.enabled == ((SharePanelSearchDebugLabelConfig) obj).enabled;
    }

    public final int hashCode() {
        return this.enabled;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelSearchDebugLabelConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SharePanelSearchDebugLabelConfig(int i) {
        this.enabled = i;
    }
}
