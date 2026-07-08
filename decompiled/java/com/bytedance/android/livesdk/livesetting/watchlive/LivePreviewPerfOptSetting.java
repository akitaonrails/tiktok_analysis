package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_preview_perf_opt_setting")
public final class LivePreviewPerfOptSetting {
    public static final LivePreviewPerfOptSetting INSTANCE = new LivePreviewPerfOptSetting();
    public static final Config DEFAULT = new Config(false, false, false, false);

    public static final boolean disableTopAndBottomMaskWidget() {
        return INSTANCE.getConfig().disableTopAndBottomMaskWidget;
    }

    public static final boolean enablePcsDecorationLazyLoad() {
        return INSTANCE.getConfig().enablePcsDecorationLazyLoad;
    }

    public static final boolean enablePreviewPullStrategyOpt() {
        return INSTANCE.getConfig().enablePreviewPullStrategyOpt;
    }

    public static final boolean enablePullStreamDataJsonParseOpt() {
        return INSTANCE.getConfig().enablePullStreamDataJsonParseOpt;
    }

    private final Config getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_preview_perf_opt_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LivePreviewPerfOptSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("disable_top_and_bottom_mask_widget")
        public boolean disableTopAndBottomMaskWidget;

        @C09CT("enable_pcs_decoration_lazy_load")
        public boolean enablePcsDecorationLazyLoad;

        @C09CT("enable_preview_pull_strategy_opt")
        public boolean enablePreviewPullStrategyOpt;

        @C09CT("enable_pull_stream_data_json_parse_opt")
        public boolean enablePullStreamDataJsonParseOpt;

        public Config() {
            this(false, false, false, false);
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4) {
            this.enablePullStreamDataJsonParseOpt = z;
            this.disableTopAndBottomMaskWidget = z2;
            this.enablePcsDecorationLazyLoad = z3;
            this.enablePreviewPullStrategyOpt = z4;
        }
    }
}
