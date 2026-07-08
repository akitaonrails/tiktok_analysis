package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_item_guide")
public final class MatchItemUseGuideStrategySetting {
    public static final MatchItemUseGuideStrategySetting INSTANCE = new MatchItemUseGuideStrategySetting();
    public static final MatchItemGuideConfig DEFAULT = new MatchItemGuideConfig();

    public static final class MatchItemGuideConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("group")
        public int group;

        @C09CT("minimum_display_interval")
        public long minDisplayInterval = 30;

        static {
            NormalGson.singleton();
            ADAPTER = new MatchItemUseGuideStrategySetting_MatchItemGuideConfig_OptTypeAdapter();
        }
    }

    private final MatchItemGuideConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MatchItemGuideConfig matchItemGuideConfig = DEFAULT;
        MatchItemGuideConfig matchItemGuideConfig2 = (MatchItemGuideConfig) settingsManager.getValueSafely("live_match_item_guide", matchItemGuideConfig);
        return matchItemGuideConfig2 != null ? matchItemGuideConfig2 : matchItemGuideConfig;
    }

    private final int getGroup() {
        return getConfig().group;
    }

    public final boolean enableStrategyGuide() {
        return getGroup() > 0;
    }

    public final long getMinDisplayInterval() {
        return getConfig().minDisplayInterval;
    }
}
