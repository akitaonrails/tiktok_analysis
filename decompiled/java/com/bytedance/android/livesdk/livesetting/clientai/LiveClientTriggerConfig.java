package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey("live_client_trigger_framework_config")
public final class LiveClientTriggerConfig {
    public static final LiveClientTriggerConfig INSTANCE = new LiveClientTriggerConfig();
    public static final Config DEFAULT = new Config(0, null, 0, null, null, null, 63, null);

    private final Config getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_client_trigger_framework_config", config);
        return config2 != null ? config2 : config;
    }

    public final int delayDownloadPkgs() {
        return getConfig().delayDownloadPkgs;
    }

    public final boolean enable() {
        return getConfig().enable > 0;
    }

    public final List<String> getCepPkgCoverageReportList() {
        return getConfig().cepPkgCoverageReportList;
    }

    public final List<String> guideTriggerBusinessNames() {
        return getConfig().guideTriggerBusinessNames;
    }

    public final List<String> imEventList() {
        return getConfig().imMsgEnableList;
    }

    public final AlgoPkgConfig getAlgoPkgConfig(String str) {
        return getConfig().algoPackageConfigMap.get(str);
    }
}
