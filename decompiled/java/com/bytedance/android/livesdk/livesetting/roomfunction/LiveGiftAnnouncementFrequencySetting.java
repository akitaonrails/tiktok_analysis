package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_site_wide_announcement_frequency_config")
public final class LiveGiftAnnouncementFrequencySetting {
    public static final LiveGiftAnnouncementFrequencySetting INSTANCE = new LiveGiftAnnouncementFrequencySetting();
    public static final AnnouncementFrequencyConfig DEFAULT = new AnnouncementFrequencyConfig(false, false, 1, 1, 50, 0.8f);

    public static final class AnnouncementFrequencyConfig {
        public static final TypeAdapter ADAPTER = new LiveGiftAnnouncementFrequencySetting_AnnouncementFrequencyConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("live_close_toggle_enabled")
        public boolean closeToggleEnabled;

        @C09CT("live_disable_min_count")
        public int disableMinCount;

        @C09CT("live_disable_ratio")
        public float disableRatio;

        @C09CT("live_frequency_control_enabled")
        public boolean frequencyControlEnabled;

        @C09CT("live_frequency_count")
        public int frequencyCount;

        @C09CT("live_frequency_duration")
        public int frequencyDuration;

        public AnnouncementFrequencyConfig() {
            this(false, false, 1, 1, 50, 0.8f);
        }

        public AnnouncementFrequencyConfig(boolean z, boolean z2, int i, int i2, int i3, float f) {
            this.closeToggleEnabled = z;
            this.frequencyControlEnabled = z2;
            this.frequencyCount = i;
            this.frequencyDuration = i2;
            this.disableMinCount = i3;
            this.disableRatio = f;
        }
    }

    public final AnnouncementFrequencyConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        AnnouncementFrequencyConfig announcementFrequencyConfig = DEFAULT;
        AnnouncementFrequencyConfig announcementFrequencyConfig2 = (AnnouncementFrequencyConfig) settingsManager.getValueSafely("live_gift_site_wide_announcement_frequency_config", announcementFrequencyConfig);
        return announcementFrequencyConfig2 != null ? announcementFrequencyConfig2 : announcementFrequencyConfig;
    }
}
