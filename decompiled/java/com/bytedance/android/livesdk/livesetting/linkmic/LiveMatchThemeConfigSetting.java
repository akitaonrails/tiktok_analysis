package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_theme_config")
public final class LiveMatchThemeConfigSetting {
    public static final LiveMatchThemeConfig DEFAULT;
    public static final List<Integer> DEFAULT_MATCH_THEME_CONFIG;
    public static final LiveMatchThemeConfigSetting INSTANCE = new LiveMatchThemeConfigSetting();

    public static final class LiveMatchThemeConfig {
        public static final TypeAdapter ADAPTER = new LiveMatchThemeConfigSetting_LiveMatchThemeConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("match_theme_config")
        public List<Integer> matchThemeConfig;

        public LiveMatchThemeConfig() {
            this(LiveMatchThemeConfigSetting.DEFAULT_MATCH_THEME_CONFIG);
        }

        public final List<Integer> getMatchThemeConfig() {
            return this.matchThemeConfig;
        }

        public LiveMatchThemeConfig(List<Integer> list) {
            this.matchThemeConfig = list;
        }

        public final void setMatchThemeConfig(List<Integer> list) {
            this.matchThemeConfig = list;
        }
    }

    static {
        List<Integer> listSingletonList = Collections.singletonList(3);
        DEFAULT_MATCH_THEME_CONFIG = listSingletonList;
        DEFAULT = new LiveMatchThemeConfig(listSingletonList);
    }

    public final LiveMatchThemeConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchThemeConfig liveMatchThemeConfig = DEFAULT;
        LiveMatchThemeConfig liveMatchThemeConfig2 = (LiveMatchThemeConfig) settingsManager.getValueSafely("live_match_theme_config", liveMatchThemeConfig);
        return liveMatchThemeConfig2 != null ? liveMatchThemeConfig2 : liveMatchThemeConfig;
    }

    public final boolean isConfiguredTheme(Integer num) {
        if (num != null && getValue().getMatchThemeConfig().contains(num)) {
            return true;
        }
        return false;
    }
}
