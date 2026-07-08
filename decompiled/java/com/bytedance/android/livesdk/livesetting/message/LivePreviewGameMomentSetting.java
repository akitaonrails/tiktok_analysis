package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_preview_game_moment")
public final class LivePreviewGameMomentSetting {
    public static final LivePreviewGameMomentSetting INSTANCE = new LivePreviewGameMomentSetting();
    public static final LivePreviewGameMomentConfig DEFAULT = new LivePreviewGameMomentConfig(false, new ArrayList());

    private final LivePreviewGameMomentConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePreviewGameMomentConfig livePreviewGameMomentConfig = DEFAULT;
        LivePreviewGameMomentConfig livePreviewGameMomentConfig2 = (LivePreviewGameMomentConfig) settingsManager.getValueSafely("live_preview_game_moment", livePreviewGameMomentConfig);
        return livePreviewGameMomentConfig2 != null ? livePreviewGameMomentConfig2 : livePreviewGameMomentConfig;
    }

    public final boolean enableShowGameName() {
        return getValue().getEnableShowGameName();
    }

    public final List<Integer> supportGameMomentType() {
        return getValue().getSupportGameMomentType();
    }

    public static final class LivePreviewGameMomentConfig {
        public static final TypeAdapter ADAPTER = new LivePreviewGameMomentSetting_LivePreviewGameMomentConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable_show_game_name")
        public boolean enableShowGameName;

        @C09CT("support_game_moment_type")
        public List<Integer> supportGameMomentType;

        public LivePreviewGameMomentConfig() {
            this(false, new ArrayList());
        }

        public final boolean getEnableShowGameName() {
            return this.enableShowGameName;
        }

        public final List<Integer> getSupportGameMomentType() {
            return this.supportGameMomentType;
        }

        public final void setEnableShowGameName(boolean z) {
            this.enableShowGameName = z;
        }

        public final void setSupportGameMomentType(List<Integer> list) {
            this.supportGameMomentType = list;
        }

        public LivePreviewGameMomentConfig(boolean z, List<Integer> list) {
            this.enableShowGameName = z;
            this.supportGameMomentType = list;
        }
    }
}
