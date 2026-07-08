package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_cohost_username_opt")
public final class CohostWithGuestPhase2CohostUserNamePosOpt {
    public static final CohostWithGuestPhase2CohostUserNamePosOpt INSTANCE = new CohostWithGuestPhase2CohostUserNamePosOpt();
    public static final Configs DEFAULT = new Configs(true, true, true);

    private final Configs getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_phase2_cohost_username_opt", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean oldLayoutLayerCacheMarginBottom() {
        return getConfig().oldLayoutLayerCacheMarginBottom;
    }

    public final boolean updateOnAttached() {
        return getConfig().updateOnAttached;
    }

    public final boolean updateOnGuestListChange() {
        return getConfig().updateOnGuestListChange;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestPhase2CohostUserNamePosOpt_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("old_layout_layer_cache_margin_bottom")
        public boolean oldLayoutLayerCacheMarginBottom;

        @C09CT("update_on_attached")
        public boolean updateOnAttached;

        @C09CT("update_on_guest_list_change")
        public boolean updateOnGuestListChange;

        public Configs() {
            this(true, true, true);
        }

        public Configs(boolean z, boolean z2, boolean z3) {
            this.updateOnGuestListChange = z;
            this.updateOnAttached = z2;
            this.oldLayoutLayerCacheMarginBottom = z3;
        }
    }
}
