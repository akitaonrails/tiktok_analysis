package com.ss.android.ugc.airemix.api.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class AIRemixIgnoreConversationIconChangeConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("interval")
    public final int interval;

    public AIRemixIgnoreConversationIconChangeConfig() {
        this(false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixIgnoreConversationIconChangeConfig)) {
            return false;
        }
        AIRemixIgnoreConversationIconChangeConfig aIRemixIgnoreConversationIconChangeConfig = (AIRemixIgnoreConversationIconChangeConfig) obj;
        return this.enable == aIRemixIgnoreConversationIconChangeConfig.enable && this.interval == aIRemixIgnoreConversationIconChangeConfig.interval;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.interval;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixIgnoreConversationIconChangeConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIRemixIgnoreConversationIconChangeConfig(boolean z, int i) {
        this.enable = z;
        this.interval = i;
    }
}
