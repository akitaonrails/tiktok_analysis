package com.ss.android.ugc.aweme.compliance.api.settings;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkConfig {

    @C09CT("auto_skip_api_configs")
    public final Map<String, String> autoSkipApiConfigs;

    @C09CT("enabled")
    public final boolean enabled;

    public NetworkConfig() {
        this(false, C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkConfig)) {
            return false;
        }
        NetworkConfig networkConfig = (NetworkConfig) obj;
        return this.enabled == networkConfig.enabled && Intrinsics.LJFF(this.autoSkipApiConfigs, networkConfig.autoSkipApiConfigs);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enabled) * 31) + this.autoSkipApiConfigs.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", autoSkipApiConfigs=");
        sbLIZ.append(this.autoSkipApiConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NetworkConfig(boolean z, Map<String, String> map) {
        this.enabled = z;
        this.autoSkipApiConfigs = map;
    }
}
