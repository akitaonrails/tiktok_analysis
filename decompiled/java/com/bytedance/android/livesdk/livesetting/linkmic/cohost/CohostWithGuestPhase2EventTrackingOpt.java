package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_event_tracking_opt")
public final class CohostWithGuestPhase2EventTrackingOpt {
    public static final CohostWithGuestPhase2EventTrackingOpt INSTANCE = new CohostWithGuestPhase2EventTrackingOpt();
    public static final Configs DEFAULT = new Configs(true, true, true, true);

    private final Configs getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_phase2_event_tracking_opt", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isEnabled() {
        return getConfig().isEnabled;
    }

    public final boolean isListShowOpt() {
        return getConfig().isEnabled && getConfig().listShowOptEnabled;
    }

    public final boolean listShowConnectionSuccessOpt() {
        return getConfig().isEnabled && getConfig().listShowConnectionSuccessOpt;
    }

    public final boolean optDataConnectionOver() {
        return getConfig().isEnabled && getConfig().optDataConnectionOver;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestPhase2EventTrackingOpt_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("is_enabled")
        public boolean isEnabled;

        @C09CT("list_show_connection_success_opt")
        public boolean listShowConnectionSuccessOpt;

        @C09CT("list_show_opt_enabled")
        public boolean listShowOptEnabled;

        @C09CT("opt_data_connection_over")
        public boolean optDataConnectionOver;

        public Configs() {
            this(true, true, true, true);
        }

        public Configs(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isEnabled = z;
            this.listShowOptEnabled = z2;
            this.listShowConnectionSuccessOpt = z3;
            this.optDataConnectionOver = z4;
        }
    }
}
