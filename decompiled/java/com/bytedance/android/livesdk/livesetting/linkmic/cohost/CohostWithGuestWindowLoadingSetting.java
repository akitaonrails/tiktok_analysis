package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_window_loading_setting")
public final class CohostWithGuestWindowLoadingSetting {
    public static final CohostWithGuestWindowLoadingSetting INSTANCE = new CohostWithGuestWindowLoadingSetting();
    public static final Configs DEFAULT = new Configs(true, Mp4ScreenVideoLoadTimeout.CONTROL);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_window_loading_setting", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isEnabled() {
        return getValue().isEnabled;
    }

    public final boolean isTimeOutEnabled() {
        return timeOutMs() > 0;
    }

    public final long timeOutMs() {
        return getValue().timeOutMs;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestWindowLoadingSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("time_out_ms")
        public long timeOutMs;

        public Configs() {
            this(true, Mp4ScreenVideoLoadTimeout.CONTROL);
        }

        public Configs(boolean z, long j) {
            this.isEnabled = z;
            this.timeOutMs = j;
        }
    }
}
