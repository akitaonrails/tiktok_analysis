package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_public_screen_message_config")
public final class LiveRankingPublicScreenMessageConfig {
    public static final LiveRankingPublicScreenMessageConfig INSTANCE = new LiveRankingPublicScreenMessageConfig();
    public static final Config DEFAULT = new Config(new ArrayList(), 600, new ArrayList());

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingPublicScreenMessageConfig_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("frequency_control_limit_in_seconds")
        public int frequencyControlLimitInSeconds;

        @C09CT("frequency_control_scene_list")
        public List<Integer> frequencyControlSceneList;

        @C09CT("music_spotlight_scene_list")
        public List<Integer> musicSpotlightSceneList;

        public Config() {
            this(new ArrayList(), 600, new ArrayList());
        }

        public Config(List<Integer> list, int i, List<Integer> list2) {
            this.frequencyControlSceneList = list;
            this.frequencyControlLimitInSeconds = i;
            this.musicSpotlightSceneList = list2;
        }
    }

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_ranking_public_screen_message_config", config);
        return config2 != null ? config2 : config;
    }
}
