package com.bytedance.im.core.client.configs;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class SendMessageRefactorConfig {

    @C09CT("enable_media_v2")
    public final boolean enableMediaV2;

    @C09CT("enabled")
    public final boolean enabled;

    public SendMessageRefactorConfig() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageRefactorConfig)) {
            return false;
        }
        SendMessageRefactorConfig sendMessageRefactorConfig = (SendMessageRefactorConfig) obj;
        return this.enabled == sendMessageRefactorConfig.enabled && this.enableMediaV2 == sendMessageRefactorConfig.enableMediaV2;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.enableMediaV2);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageRefactorConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", enableMediaV2=");
        sbLIZ.append(this.enableMediaV2);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SendMessageRefactorConfig(boolean z, boolean z2) {
        this.enabled = z;
        this.enableMediaV2 = z2;
    }
}
