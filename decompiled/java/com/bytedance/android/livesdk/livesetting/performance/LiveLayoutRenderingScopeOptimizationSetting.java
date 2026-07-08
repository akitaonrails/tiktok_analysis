package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_layout_rendering_scope_optimization_setting")
public final class LiveLayoutRenderingScopeOptimizationSetting {
    public static final LiveLayoutRenderingScopeOptimizationSetting INSTANCE = new LiveLayoutRenderingScopeOptimizationSetting();
    public static final Config DEFAULT = new Config(false, false, false, false, false);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_layout_rendering_scope_optimization_setting", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveLayoutRenderingScopeOptimizationSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("announcement_opt")
        public boolean announcementOpt;

        @C09CT("audience_ranking_opt")
        public boolean audienceRankingOpt;

        @C09CT("barrage_opt")
        public boolean barrageOpt;

        @C09CT("creator_ranking_opt")
        public boolean creatorRankingOpt;

        @C09CT("gift_guide_opt")
        public boolean giftGuideOpt;

        public Config() {
            this(false, false, false, false, false);
        }

        public Config(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.creatorRankingOpt = z;
            this.audienceRankingOpt = z2;
            this.announcementOpt = z3;
            this.barrageOpt = z4;
            this.giftGuideOpt = z5;
        }
    }
}
