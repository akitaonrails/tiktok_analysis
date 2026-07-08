package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("fans_level_config_request_interval")
public final class FansLevelConfigRequestInterval {
    public static final int DEFAULT = 24;
    public static final FansLevelConfigRequestInterval INSTANCE = new FansLevelConfigRequestInterval();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("fans_level_config_request_interval", DEFAULT) * 3600000;
    }
}
