package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_border_view_init_opt")
public final class CohostWithGuestBorderViewInitOpt {
    public static final CohostWithGuestBorderViewInitOpt INSTANCE = new CohostWithGuestBorderViewInitOpt();
    public static final Configs DEFAULT = new Configs(1, 2000, false);

    private final Configs getConfigs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_phase2_border_view_init_opt", configs);
        return configs2 != null ? configs2 : configs;
    }

    private final int allowType() {
        return getConfigs().allowType;
    }

    public final boolean clearAllOnLinkerModeChanged() {
        return getConfigs().clearAllOnLinkerModeChanged;
    }

    public final long getCreateBorderDelayMs() {
        return getConfigs().createBorderDelayMs;
    }

    public final boolean isEnabledForAll() {
        return allowType() == 2;
    }

    public final boolean isEnabledForAudienceOnly() {
        return allowType() == 1;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestBorderViewInitOpt_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("allow_type")
        public int allowType;

        @C09CT("clear_all_on_linker_mode_changed")
        public boolean clearAllOnLinkerModeChanged;

        @C09CT("create_border_delay_ms")
        public long createBorderDelayMs;

        public Configs() {
            this(1, 2000L, false);
        }

        public Configs(int i, long j, boolean z) {
            this.allowType = i;
            this.createBorderDelayMs = j;
            this.clearAllOnLinkerModeChanged = z;
        }
    }
}
