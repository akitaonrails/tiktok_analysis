package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_extended_public_screen_max_msg_config")
public final class LiveExtendedPublicScreenMaxMessageConfig {
    public static final LiveExtendedPublicScreenMaxMessageConfig INSTANCE = new LiveExtendedPublicScreenMaxMessageConfig();
    public static final BufferConfig DEFAULT = new BufferConfig();

    public static final class BufferConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("max_message_count")
        public int maxMessageCount = 200;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveExtendedPublicScreenMaxMessageConfig_BufferConfig_OptTypeAdapter();
        }
    }

    public static final BufferConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BufferConfig bufferConfig = DEFAULT;
        BufferConfig bufferConfig2 = (BufferConfig) settingsManager.getValueSafely("live_extended_public_screen_max_msg_config", bufferConfig);
        return bufferConfig2 != null ? bufferConfig2 : bufferConfig;
    }
}
