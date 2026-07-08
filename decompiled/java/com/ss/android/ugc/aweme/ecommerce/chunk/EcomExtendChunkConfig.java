package com.ss.android.ugc.aweme.ecommerce.chunk;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class EcomExtendChunkConfig {

    @C09CT("enable")
    public final int enable;

    public EcomExtendChunkConfig() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcomExtendChunkConfig) && this.enable == ((EcomExtendChunkConfig) obj).enable;
    }

    public final int hashCode() {
        return this.enable;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcomExtendChunkConfig(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcomExtendChunkConfig(int i) {
        this.enable = i;
    }
}
