package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeInterceptorConfig {

    @C09CT("enabled")
    public final boolean enabled;

    public NativeInterceptorConfig() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NativeInterceptorConfig) && this.enabled == ((NativeInterceptorConfig) obj).enabled;
    }

    public final int hashCode() {
        boolean z = this.enabled;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NativeInterceptorConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NativeInterceptorConfig(boolean z) {
        this.enabled = z;
    }
}
