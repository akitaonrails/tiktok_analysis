package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("cohost_with_guest_tracking_setting")
public final class CohostWithGuestTrackingSetting {
    public static final CohostWithGuestTrackingSetting INSTANCE = new CohostWithGuestTrackingSetting();
    public static final Configs DEFAULT = new Configs(true, true, true);

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_tracking_setting", configs);
        return configs2 != null ? configs2 : configs;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestTrackingSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("feed_tracking_enabled")
        public boolean isFeedTrackingEnabled;

        @C09CT("follow_user_role_enabled")
        public boolean isFollowUserRoleEnabled;

        @C09CT("get_guest_log_global_enabled")
        public boolean isGetGuestLogGlobalEnabled;

        public Configs() {
            this(true, true, true);
        }

        public Configs(boolean z, boolean z2, boolean z3) {
            this.isGetGuestLogGlobalEnabled = z;
            this.isFeedTrackingEnabled = z2;
            this.isFollowUserRoleEnabled = z3;
        }
    }
}
