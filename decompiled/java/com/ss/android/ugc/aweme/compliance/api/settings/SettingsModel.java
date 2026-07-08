package com.ss.android.ugc.aweme.compliance.api.settings;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsModel {

    @C09CT("alog_enabled")
    public final boolean alogEnabled;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("network_config")
    public final NetworkConfig networkConfig;

    @C09CT("strict_mode_configs")
    public final Map<String, StrictModeConfig> strictModeConfigs;

    public SettingsModel() {
        this(false, false, new NetworkConfig(false, C2097608Jq.LJ()), C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsModel)) {
            return false;
        }
        SettingsModel settingsModel = (SettingsModel) obj;
        return this.enabled == settingsModel.enabled && this.alogEnabled == settingsModel.alogEnabled && Intrinsics.LJFF(this.networkConfig, settingsModel.networkConfig) && Intrinsics.LJFF(this.strictModeConfigs, settingsModel.strictModeConfigs);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.alogEnabled)) * 31) + this.networkConfig.hashCode()) * 31) + this.strictModeConfigs.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingsModel(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", alogEnabled=");
        sbLIZ.append(this.alogEnabled);
        sbLIZ.append(", networkConfig=");
        sbLIZ.append(this.networkConfig);
        sbLIZ.append(", strictModeConfigs=");
        sbLIZ.append(this.strictModeConfigs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SettingsModel(boolean z, boolean z2, NetworkConfig networkConfig, Map<String, StrictModeConfig> map) {
        this.enabled = z;
        this.alogEnabled = z2;
        this.networkConfig = networkConfig;
        this.strictModeConfigs = map;
    }
}
