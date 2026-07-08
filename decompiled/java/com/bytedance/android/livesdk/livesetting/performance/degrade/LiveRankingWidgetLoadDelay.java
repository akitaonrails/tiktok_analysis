package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_widget_load_delay_setting")
public final class LiveRankingWidgetLoadDelay {
    public static final LiveRankingWidgetLoadDelay INSTANCE = new LiveRankingWidgetLoadDelay();
    public static final Config DEFAULT = new Config(false, 0);

    public static final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_ranking_widget_load_delay_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final long getWidgetLoadDelayTime() {
        return getValue().widgetLoadingDelaySwitch ? getValue().loadingDelayTimeForCreatorRankingWidget : LiveRankingAndPrivilegeDowngradeSetting.getValue().loadingDelayTimeForCreatorRankingWidget;
    }

    public static final boolean isEnabled() {
        return getValue().widgetLoadingDelaySwitch || LiveRankingAndPrivilegeDowngradeSetting.getValue().widgetLoadingDelaySwitch;
    }

    public static final Config getDefaultValue() {
        return DEFAULT;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveRankingWidgetLoadDelay_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("loading_delay_time_for_creator_ranking_widget")
        public long loadingDelayTimeForCreatorRankingWidget;

        @C09CT("widget_loading_delay_switch")
        public boolean widgetLoadingDelaySwitch;

        public Config() {
            this(false, 0L);
        }

        public Config(boolean z, long j) {
            this.widgetLoadingDelaySwitch = z;
            this.loadingDelayTimeForCreatorRankingWidget = j;
        }
    }
}
