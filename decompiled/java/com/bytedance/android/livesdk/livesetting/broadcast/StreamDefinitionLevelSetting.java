package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("stream_definition_level")
public final class StreamDefinitionLevelSetting {
    public static final int DEFAULT = 0;
    public static final StreamDefinitionLevelSetting INSTANCE = new StreamDefinitionLevelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("stream_definition_level", DEFAULT);
    }
}
