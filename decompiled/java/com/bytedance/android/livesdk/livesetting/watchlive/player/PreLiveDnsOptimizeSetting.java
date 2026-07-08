package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_dns_optimize_config")
public final class PreLiveDnsOptimizeSetting {
    public static final PreLiveDnsOptimizeSetting INSTANCE = new PreLiveDnsOptimizeSetting();
    public static final LiveDnsOptimizeConfig DEFAULT = new LiveDnsOptimizeConfig(0, 0);
    public static final LiveDnsOptimizeConfig enableValue = new LiveDnsOptimizeConfig(1, 6);

    private final LiveDnsOptimizeConfig getDnsOptimizeConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveDnsOptimizeConfig liveDnsOptimizeConfig = DEFAULT;
        LiveDnsOptimizeConfig liveDnsOptimizeConfig2 = (LiveDnsOptimizeConfig) settingsManager.getValueSafely("live_dns_optimize_config", liveDnsOptimizeConfig);
        return liveDnsOptimizeConfig2 != null ? liveDnsOptimizeConfig2 : liveDnsOptimizeConfig;
    }

    public final int checkDNSCnt() {
        LiveDnsOptimizeConfig dnsOptimizeConfig = getDnsOptimizeConfig();
        if (dnsOptimizeConfig != null) {
            return dnsOptimizeConfig.checkHostCount;
        }
        return 0;
    }

    public final boolean isEnable() {
        LiveDnsOptimizeConfig dnsOptimizeConfig = getDnsOptimizeConfig();
        return dnsOptimizeConfig != null && dnsOptimizeConfig.enableCheckDns > 0;
    }

    public final LiveDnsOptimizeConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveDnsOptimizeConfig getEnableValue() {
        return enableValue;
    }
}
