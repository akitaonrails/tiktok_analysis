package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_ranking_sticker_anim_arrow_extra_width")
public final class LiveRankStickerAnimArrowWidthSettings {
    public static final LiveRankStickerAnimArrowWidthSettings INSTANCE = new LiveRankStickerAnimArrowWidthSettings();
    public static final RankStickerExtraWidthConfig DEFAULT = new RankStickerExtraWidthConfig(4, 9);

    public final RankStickerExtraWidthConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RankStickerExtraWidthConfig rankStickerExtraWidthConfig = DEFAULT;
        RankStickerExtraWidthConfig rankStickerExtraWidthConfig2 = (RankStickerExtraWidthConfig) settingsManager.getValueSafely("live_ranking_sticker_anim_arrow_extra_width", rankStickerExtraWidthConfig);
        return rankStickerExtraWidthConfig2 != null ? rankStickerExtraWidthConfig2 : rankStickerExtraWidthConfig;
    }

    public static final class RankStickerExtraWidthConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("daily_width")
        public int dailyWidth;

        @C09CT("hourly_width")
        public int hourlyWidth;

        static {
            NormalGson.singleton();
            ADAPTER = new LiveRankStickerAnimArrowWidthSettings_RankStickerExtraWidthConfig_OptTypeAdapter();
        }

        public RankStickerExtraWidthConfig() {
            this(0, 0);
        }

        public RankStickerExtraWidthConfig(int i, int i2) {
            this.dailyWidth = i;
            this.hourlyWidth = i2;
        }
    }
}
