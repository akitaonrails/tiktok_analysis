package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_show_resolution_selection_config")
public final class LiveShowResolutionSelectionSetting {
    public static final LiveShowResolutionSelectionSetting INSTANCE = new LiveShowResolutionSelectionSetting();
    public static final LiveShowResolutionSelectionConfig DEFAULT = new LiveShowResolutionSelectionConfig(false, false);

    public final LiveShowResolutionSelectionConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveShowResolutionSelectionConfig liveShowResolutionSelectionConfig = DEFAULT;
        LiveShowResolutionSelectionConfig liveShowResolutionSelectionConfig2 = (LiveShowResolutionSelectionConfig) settingsManager.getValueSafely("live_show_resolution_selection_config", liveShowResolutionSelectionConfig);
        return liveShowResolutionSelectionConfig2 != null ? liveShowResolutionSelectionConfig2 : liveShowResolutionSelectionConfig;
    }

    public final boolean isEnable() {
        return getValue().getEnableResolutionSelection();
    }

    public final boolean needPersistAcrossRooms() {
        return isEnable() && getValue().getPersistAcrossRooms();
    }

    public static final class LiveShowResolutionSelectionConfig {
        public static final TypeAdapter ADAPTER = new LiveShowResolutionSelectionSetting_LiveShowResolutionSelectionConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_resolution_selection")
        public boolean enableResolutionSelection;

        @C09CT("persist_across_rooms")
        public boolean persistAcrossRooms;

        public LiveShowResolutionSelectionConfig() {
            this(false, false);
        }

        public final boolean getEnableResolutionSelection() {
            return this.enableResolutionSelection;
        }

        public final boolean getPersistAcrossRooms() {
            return this.persistAcrossRooms;
        }

        public final void setEnableResolutionSelection(boolean z) {
            this.enableResolutionSelection = z;
        }

        public final void setPersistAcrossRooms(boolean z) {
            this.persistAcrossRooms = z;
        }

        public LiveShowResolutionSelectionConfig(boolean z, boolean z2) {
            this.enableResolutionSelection = z;
            this.persistAcrossRooms = z2;
        }
    }
}
