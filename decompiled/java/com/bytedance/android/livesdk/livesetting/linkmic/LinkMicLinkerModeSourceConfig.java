package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_linker_mode_source_config")
public final class LinkMicLinkerModeSourceConfig {
    public static final int DEFAULT = 7;
    public static final LinkMicLinkerModeSourceConfig INSTANCE = new LinkMicLinkerModeSourceConfig();

    public static final int getConfig() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_linker_mode_source_config", DEFAULT);
    }
}
