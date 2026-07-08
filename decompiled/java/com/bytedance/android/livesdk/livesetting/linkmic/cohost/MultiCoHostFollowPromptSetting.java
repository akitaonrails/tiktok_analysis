package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_cohost_follow_prompt_configuration")
public final class MultiCoHostFollowPromptSetting {
    public static final MultiCoHostFollowPromptSetting INSTANCE = new MultiCoHostFollowPromptSetting();
    public static final Configs DEFAULT = new Configs(10000, 3);

    public static final class Configs {
        public static final TypeAdapter ADAPTER;

        @C09CT("auto_dismiss_time_ms")
        public long autoDismissTimeMs;

        @C09CT("max_show_time_per_room")
        public int maxShowTimePerRoom;

        static {
            NormalGson.singleton();
            ADAPTER = new MultiCoHostFollowPromptSetting_Configs_OptTypeAdapter();
        }

        public Configs() {
            this(10000L, 3);
        }

        public Configs(long j, int i) {
            this.autoDismissTimeMs = j;
            this.maxShowTimePerRoom = i;
        }
    }

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("multi_cohost_follow_prompt_configuration", configs);
        return configs2 != null ? configs2 : configs;
    }
}
