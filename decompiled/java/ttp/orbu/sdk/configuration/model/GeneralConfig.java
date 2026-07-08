package ttp.orbu.sdk.configuration.model;

import X.C786410Ut5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ttpobfuscated.gc;
import ttpobfuscated.u5;

/* JADX INFO: loaded from: classes24.dex */
public final class GeneralConfig implements Config {
    public final Map<IntRange, Long> adaptiveDelayConfig;
    public final long configRefreshIntervalMillis;
    public final List<EventSetting> events;
    public final List<FeatureSetting> features;
    public final u5 geckoScanSettings;
    public final GeckoValidation geckoValidation;
    public final int heartbeatGenericData;
    public final String logIdOverride;
    public final boolean refreshConfigOnInactiveState;
    public final gc requestValidation;
    public final long sendInterval;
    public final List<ServerConfig> serverConfigs;
    public final SessionIdHeaderFrequency sessionIdHeaderFrequency;
    public final int telemetryRetentionInDays;
    public final ConfigType type;
    public final List<String> usRegions;
    public final int version;

    public final int component1() {
        return getVersion();
    }

    public final ConfigType component2() {
        return getType();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeneralConfig)) {
            return false;
        }
        GeneralConfig generalConfig = (GeneralConfig) obj;
        return getVersion() == generalConfig.getVersion() && Intrinsics.LJFF(getType(), generalConfig.getType()) && this.sendInterval == generalConfig.sendInterval && Intrinsics.LJFF(this.features, generalConfig.features) && Intrinsics.LJFF(this.events, generalConfig.events) && this.sessionIdHeaderFrequency == generalConfig.sessionIdHeaderFrequency && Intrinsics.LJFF(this.usRegions, generalConfig.usRegions) && Intrinsics.LJFF(this.serverConfigs, generalConfig.serverConfigs) && this.configRefreshIntervalMillis == generalConfig.configRefreshIntervalMillis && this.refreshConfigOnInactiveState == generalConfig.refreshConfigOnInactiveState && Intrinsics.LJFF(this.logIdOverride, generalConfig.logIdOverride) && this.geckoValidation == generalConfig.geckoValidation && this.heartbeatGenericData == generalConfig.heartbeatGenericData && Intrinsics.LJFF(this.requestValidation, generalConfig.requestValidation) && Intrinsics.LJFF(this.geckoScanSettings, generalConfig.geckoScanSettings) && Intrinsics.LJFF(this.adaptiveDelayConfig, generalConfig.adaptiveDelayConfig) && this.telemetryRetentionInDays == generalConfig.telemetryRetentionInDays;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    public int hashCode() {
        int iY2 = (C786410Ut5.Y2(this.configRefreshIntervalMillis) + ((this.serverConfigs.hashCode() + ((this.usRegions.hashCode() + ((this.sessionIdHeaderFrequency.hashCode() + ((this.events.hashCode() + ((this.features.hashCode() + ((C786410Ut5.Y2(this.sendInterval) + ((getType().hashCode() + (getVersion() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        boolean z = this.refreshConfigOnInactiveState;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iY2 + r0) * 31;
        String str = this.logIdOverride;
        return this.telemetryRetentionInDays + ((this.adaptiveDelayConfig.hashCode() + ((this.geckoScanSettings.hashCode() + ((this.requestValidation.hashCode() + ((this.heartbeatGenericData + ((this.geckoValidation.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "GeneralConfig(version=" + getVersion() + ", type=" + getType() + ", sendInterval=" + this.sendInterval + ", features=" + this.features + ", events=" + this.events + ", sessionIdHeaderFrequency=" + this.sessionIdHeaderFrequency + ", usRegions=" + this.usRegions + ", serverConfigs=" + this.serverConfigs + ", configRefreshIntervalMillis=" + this.configRefreshIntervalMillis + ", refreshConfigOnInactiveState=" + this.refreshConfigOnInactiveState + ", logIdOverride=" + this.logIdOverride + ", geckoValidation=" + this.geckoValidation + ", heartbeatGenericData=" + this.heartbeatGenericData + ", requestValidation=" + this.requestValidation + ", geckoScanSettings=" + this.geckoScanSettings + ", adaptiveDelayConfig=" + this.adaptiveDelayConfig + ", telemetryRetentionInDays=" + this.telemetryRetentionInDays + ')';
    }

    public final Map<IntRange, Long> getAdaptiveDelayConfig() {
        return this.adaptiveDelayConfig;
    }

    public final long getConfigRefreshIntervalMillis() {
        return this.configRefreshIntervalMillis;
    }

    public final List<EventSetting> getEvents() {
        return this.events;
    }

    public final List<FeatureSetting> getFeatures() {
        return this.features;
    }

    public final u5 getGeckoScanSettings() {
        return this.geckoScanSettings;
    }

    public final GeckoValidation getGeckoValidation() {
        return this.geckoValidation;
    }

    public final int getHeartbeatGenericData() {
        return this.heartbeatGenericData;
    }

    public final String getLogIdOverride() {
        return this.logIdOverride;
    }

    public final boolean getRefreshConfigOnInactiveState() {
        return this.refreshConfigOnInactiveState;
    }

    public final gc getRequestValidation() {
        return this.requestValidation;
    }

    public final long getSendInterval() {
        return this.sendInterval;
    }

    public final List<ServerConfig> getServerConfigs() {
        return this.serverConfigs;
    }

    public final SessionIdHeaderFrequency getSessionIdHeaderFrequency() {
        return this.sessionIdHeaderFrequency;
    }

    public final int getTelemetryRetentionInDays() {
        return this.telemetryRetentionInDays;
    }

    @Override // ttp.orbu.sdk.configuration.model.Config
    public ConfigType getType() {
        return this.type;
    }

    public final List<String> getUsRegions() {
        return this.usRegions;
    }

    @Override // ttp.orbu.sdk.configuration.model.Config
    public int getVersion() {
        return this.version;
    }

    public final boolean isFeatureEnabled(String str) {
        FeatureSetting next;
        Iterator<FeatureSetting> it2 = this.features.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.name, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        FeatureSetting featureSetting = next;
        if (featureSetting != null && featureSetting.enabled) {
            return true;
        }
        return false;
    }

    public GeneralConfig(int i, ConfigType configType, long j, List<FeatureSetting> list, List<EventSetting> list2, SessionIdHeaderFrequency sessionIdHeaderFrequency, List<String> list3, List<ServerConfig> list4, long j2, boolean z, String str, GeckoValidation geckoValidation, int i2, gc gcVar, u5 u5Var, Map<IntRange, Long> map, int i3) {
        this.version = i;
        this.type = configType;
        this.sendInterval = j;
        this.features = list;
        this.events = list2;
        this.sessionIdHeaderFrequency = sessionIdHeaderFrequency;
        this.usRegions = list3;
        this.serverConfigs = list4;
        this.configRefreshIntervalMillis = j2;
        this.refreshConfigOnInactiveState = z;
        this.logIdOverride = str;
        this.geckoValidation = geckoValidation;
        this.heartbeatGenericData = i2;
        this.requestValidation = gcVar;
        this.geckoScanSettings = u5Var;
        this.adaptiveDelayConfig = map;
        this.telemetryRetentionInDays = i3;
    }

    public final GeneralConfig copy(int i, ConfigType configType, long j, List<FeatureSetting> list, List<EventSetting> list2, SessionIdHeaderFrequency sessionIdHeaderFrequency, List<String> list3, List<ServerConfig> list4, long j2, boolean z, String str, GeckoValidation geckoValidation, int i2, gc gcVar, u5 u5Var, Map<IntRange, Long> map, int i3) {
        return new GeneralConfig(i, configType, j, list, list2, sessionIdHeaderFrequency, list3, list4, j2, z, str, geckoValidation, i2, gcVar, u5Var, map, i3);
    }
}
