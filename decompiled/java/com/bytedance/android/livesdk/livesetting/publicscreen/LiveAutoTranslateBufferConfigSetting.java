package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_auto_translate_buffer_config")
public final class LiveAutoTranslateBufferConfigSetting {
    public static LiveTranslateBufferConfig cacheValue;
    public static final LiveAutoTranslateBufferConfigSetting INSTANCE = new LiveAutoTranslateBufferConfigSetting();
    public static final LiveTranslateBufferConfig DEFAULT = new LiveTranslateBufferConfig();

    public static final class LiveTranslateBufferConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("live_auto_translate_buffer_size")
        public int autoTranslateBufferSize = 10;

        @C09CT("live_auto_translate_buffer_timeout")
        public long autoTranslateBufferTimeout = 1500;

        @C09CT("live_message_auto_translate_request_timeout")
        public long messageAutoTranslateRequestTimeout = 1500;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveAutoTranslateBufferConfigSetting_LiveTranslateBufferConfig_OptTypeAdapter();
        }
    }

    public static final LiveTranslateBufferConfig getValue() {
        if (cacheValue == null) {
            cacheValue = (LiveTranslateBufferConfig) SettingsManager.INSTANCE.getValueSafely(LiveAutoTranslateBufferConfigSetting.class);
        }
        LiveTranslateBufferConfig liveTranslateBufferConfig = cacheValue;
        return liveTranslateBufferConfig == null ? DEFAULT : liveTranslateBufferConfig;
    }

    public final LiveTranslateBufferConfig getCacheValue() {
        return cacheValue;
    }

    public final void setCacheValue(LiveTranslateBufferConfig liveTranslateBufferConfig) {
        cacheValue = liveTranslateBufferConfig;
    }
}
