package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C13LQ;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkSettingsSnapshot {

    @C09CT("background_freeze_duration")
    public final long backgroundFreezeDuration;

    @C09CT("check_app_scenes")
    public final Set<String> checkAppScenes;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("network_config")
    public final NetworkConfig networkConfig;

    @C09CT("sample_rate_config")
    public final SampleRateConfig sampleRateConfig;

    @C09CT("test_env_channels")
    public final List<String> testEnvChannels;

    @C09CT("ttp_region")
    public final Set<String> ttpRegion;

    @C09CT("version")
    public String version;

    public NetworkSettingsSnapshot() {
        this(null, false, null, null, 0L, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkSettingsSnapshot)) {
            return false;
        }
        NetworkSettingsSnapshot networkSettingsSnapshot = (NetworkSettingsSnapshot) obj;
        return Intrinsics.LJFF(this.version, networkSettingsSnapshot.version) && this.enabled == networkSettingsSnapshot.enabled && Intrinsics.LJFF(this.testEnvChannels, networkSettingsSnapshot.testEnvChannels) && Intrinsics.LJFF(this.sampleRateConfig, networkSettingsSnapshot.sampleRateConfig) && this.backgroundFreezeDuration == networkSettingsSnapshot.backgroundFreezeDuration && Intrinsics.LJFF(this.checkAppScenes, networkSettingsSnapshot.checkAppScenes) && Intrinsics.LJFF(this.networkConfig, networkSettingsSnapshot.networkConfig) && Intrinsics.LJFF(this.ttpRegion, networkSettingsSnapshot.ttpRegion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    public final int hashCode() {
        int iHashCode = this.version.hashCode() * 31;
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return ((((((((((((iHashCode + r0) * 31) + this.testEnvChannels.hashCode()) * 31) + this.sampleRateConfig.hashCode()) * 31) + C786410Ut5.Y2(this.backgroundFreezeDuration)) * 31) + this.checkAppScenes.hashCode()) * 31) + this.networkConfig.hashCode()) * 31) + this.ttpRegion.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkSettingsSnapshot(version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", testEnvChannels=");
        sbLIZ.append(this.testEnvChannels);
        sbLIZ.append(", sampleRateConfig=");
        sbLIZ.append(this.sampleRateConfig);
        sbLIZ.append(", backgroundFreezeDuration=");
        sbLIZ.append(this.backgroundFreezeDuration);
        sbLIZ.append(", checkAppScenes=");
        sbLIZ.append(this.checkAppScenes);
        sbLIZ.append(", networkConfig=");
        sbLIZ.append(this.networkConfig);
        sbLIZ.append(", ttpRegion=");
        sbLIZ.append(this.ttpRegion);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        new NetworkSettingsSnapshot("helios_default", false, null, null, 0L, null, null, null, 254, null);
    }

    public NetworkSettingsSnapshot(String str, boolean z, List<String> list, SampleRateConfig sampleRateConfig, long j, Set<String> set, NetworkConfig networkConfig, Set<String> set2) {
        this.version = str;
        this.enabled = z;
        this.testEnvChannels = list;
        this.sampleRateConfig = sampleRateConfig;
        this.backgroundFreezeDuration = j;
        this.checkAppScenes = set;
        this.networkConfig = networkConfig;
        this.ttpRegion = set2;
    }

    public NetworkSettingsSnapshot(String str, boolean z, List list, SampleRateConfig sampleRateConfig, long j, Set set, NetworkConfig networkConfig, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "default" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C1697810uHb.LJIIJJI("snpqa_permission_test", "tools_autotest", "local_test", "autotest", "monkey", "qtp") : list, (i & 8) != 0 ? new SampleRateConfig(0.0d, null, null, null, 15, null) : sampleRateConfig, (i & 16) != 0 ? TimeUnit.SECONDS.toMillis(2L) : j, (i & 32) != 0 ? new LinkedHashSet() : set, (i & 64) != 0 ? new NetworkConfig(false, false, 0L, 0L, null, null, null, null, null, 0L, 0.0d, null, null, null, 0.0d, false, false, 0.0d, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, 0.0d, null, null, false, -1, 63, null) : networkConfig, (i & 128) != 0 ? C13LQ.LJLIIL(new String[]{"us", "as", "gu", "mp", "pr", "vi", "um"}) : set2);
    }
}
