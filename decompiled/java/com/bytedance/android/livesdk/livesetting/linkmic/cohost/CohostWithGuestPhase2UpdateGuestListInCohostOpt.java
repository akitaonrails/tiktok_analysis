package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_with_guest_phase2_update_guest_list_in_cohost")
public final class CohostWithGuestPhase2UpdateGuestListInCohostOpt {
    public static final CohostWithGuestPhase2UpdateGuestListInCohostOpt INSTANCE = new CohostWithGuestPhase2UpdateGuestListInCohostOpt();
    public static final Configs DEFAULT = new Configs(2, true);

    private final Configs getConfigs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_with_guest_phase2_update_guest_list_in_cohost", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean notifyWhenCohostEnd() {
        return getConfigs().notifyWhenCohostEnd;
    }

    public final boolean resetWhenNotInCohostWithLinkedHosts() {
        return getConfigs().resetWhenNotInCohost == 2;
    }

    public final boolean resetWhenNotInCohostWithLinkerMode() {
        return getConfigs().resetWhenNotInCohost == 1;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostWithGuestPhase2UpdateGuestListInCohostOpt_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("notify_when_cohost_end")
        public boolean notifyWhenCohostEnd;

        @C09CT("reset_when_not_in_cohost")
        public int resetWhenNotInCohost;

        public Configs() {
            this(2, true);
        }

        public Configs(int i, boolean z) {
            this.resetWhenNotInCohost = i;
            this.notifyWhenCohostEnd = z;
        }
    }
}
