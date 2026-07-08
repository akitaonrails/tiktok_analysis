package com.bytedance.android.livesdk.comp.impl.logger.slardarmonitor;

import X.C01GW;
import X.C09CT;
import X.C1152600g6E;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_slardar_sdk_config")
public final class LiveSlardarSdkConfigSetting {
    public static final String DEFAULT = "";
    public static final LiveSlardarSdkConfigSetting INSTANCE = new LiveSlardarSdkConfigSetting();
    public static final C01GW config$delegate = C452501pT.LIZIZ(new C1152600g6E());

    public final Config getConfig() {
        return (Config) config$delegate.getValue();
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_slardar_sdk_config", DEFAULT);
    }

    public static final class Config {

        @C09CT("config_url")
        public final String configUrl;

        @C09CT("enable")
        public final boolean enable;

        @C09CT("report_url")
        public final String reportUrl;

        public Config() {
            this(false, "https://mon.isnssdk.com/monitor/appmonitor/v4/settings", "https://mon.isnssdk.com/monitor/collect/");
        }

        public Config(boolean z, String str, String str2) {
            this.enable = z;
            this.configUrl = str;
            this.reportUrl = str2;
        }
    }
}
