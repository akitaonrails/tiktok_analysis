package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_subtitle_config")
public final class LiveCoHostSubtitleConfig {
    public static final LiveCoHostSubtitleConfig INSTANCE = new LiveCoHostSubtitleConfig();
    public static final Configs DEFAULT = new Configs(true, 30, "aweme://roma_redirect/?spark_page=live_cohost_subtitle_first_guide", false, false, 10, true);

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Configs {
        public static final TypeAdapter ADAPTER = new LiveCoHostSubtitleConfig_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_alog_receive_subtitle")
        public boolean enableALogReceiveSubtitle;

        @C09CT("first_guide_url")
        public String firstGuideUrl;

        @C09CT("monitor_display_sample_divisor")
        public int monitorDisplaySampleDivisor;

        @C09CT("no_speaker_exit_timeout_sec")
        public int noSpeakerExitTimeoutSec;

        @C09CT("show_room_owner_subtitle")
        public boolean showRoomOwnerSubtitle;

        @C09CT("show_unconfirmed")
        public boolean showUnconfirmed;

        public Configs() {
            this(true, 30, "aweme://roma_redirect/?spark_page=live_cohost_subtitle_first_guide", false, false, 10, true);
        }

        public Configs(boolean z, int i, String str, boolean z2, boolean z3, int i2, boolean z4) {
            this.enable = z;
            this.noSpeakerExitTimeoutSec = i;
            this.firstGuideUrl = str;
            this.showRoomOwnerSubtitle = z2;
            this.showUnconfirmed = z3;
            this.monitorDisplaySampleDivisor = i2;
            this.enableALogReceiveSubtitle = z4;
        }
    }

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("live_cohost_subtitle_config", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isEnabled() {
        return getValue().enable;
    }
}
