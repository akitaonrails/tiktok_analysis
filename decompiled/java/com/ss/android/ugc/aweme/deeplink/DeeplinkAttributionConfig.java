package com.ss.android.ugc.aweme.deeplink;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class DeeplinkAttributionConfig {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("max_size")
    public final int maxSize;

    public DeeplinkAttributionConfig() {
        this(true, 200);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeeplinkAttributionConfig)) {
            return false;
        }
        DeeplinkAttributionConfig deeplinkAttributionConfig = (DeeplinkAttributionConfig) obj;
        return this.isEnable == deeplinkAttributionConfig.isEnable && this.maxSize == deeplinkAttributionConfig.maxSize;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.isEnable) * 31) + this.maxSize;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeeplinkAttributionConfig(isEnable=");
        sbLIZ.append(this.isEnable);
        sbLIZ.append(", maxSize=");
        sbLIZ.append(this.maxSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DeeplinkAttributionConfig(boolean z, int i) {
        this.isEnable = z;
        this.maxSize = i;
    }
}
