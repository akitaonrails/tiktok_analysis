package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_play_together_v2_schema")
public final class TtlivePlayTogetherSchemaV2Setting {
    public static final TtlivePlayTogetherSchemaV2Setting INSTANCE = new TtlivePlayTogetherSchemaV2Setting();
    public static final GamePlayTogetherSchemaV2 DEFAULT = new GamePlayTogetherSchemaV2();

    public static final class GamePlayTogetherSchemaV2 {
        public static final TypeAdapter ADAPTER;

        @C09CT("creator_guide")
        public String creatorGuideSchema = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Fsf-teko-proxy-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-multiversion-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_play_together_creator_v2%2Fpages%2Fcreator_guide%2Ftemplate.js&use_spark=1&radius=12&transition_animation=bottom&starling_fallback=1&starling_channel=3588__53523&bdhm_bid=tiktok_live_interaction_play_together_creator_v2&use_live_sheet=1&height_mode=fixed_7&launch_mode=navigate";

        @C09CT("creator_setting")
        public String creatorSettingSchema = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Fsf-teko-proxy-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-multiversion-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_play_together_creator_v2%2Fpages%2Fcreator_setting%2Ftemplate.js&use_spark=1&radius=12&transition_animation=bottom&starling_fallback=1&starling_channel=3588__53523&bdhm_bid=tiktok_live_interaction_play_together_creator_v2&use_live_sheet=1&height_mode=fixed_7&launch_mode=navigate";

        @C09CT("creator_queue")
        public String creatorQueueSchema = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Fsf-teko-proxy-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-multiversion-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_play_together_creator_v2%2Fpages%2Fcreator_queue%2Ftemplate.js&use_spark=1&radius=12&transition_animation=bottom&starling_fallback=1&starling_channel=3588__53523&bdhm_bid=tiktok_live_interaction_play_together_creator_v2&use_live_sheet=1&height_mode=fixed_7&launch_mode=navigate";

        static {
            NormalGson.singleton();
            ADAPTER = new TtlivePlayTogetherSchemaV2Setting_GamePlayTogetherSchemaV2_OptTypeAdapter();
        }
    }

    private final GamePlayTogetherSchemaV2 getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GamePlayTogetherSchemaV2 gamePlayTogetherSchemaV2 = DEFAULT;
        GamePlayTogetherSchemaV2 gamePlayTogetherSchemaV22 = (GamePlayTogetherSchemaV2) settingsManager.getValueSafely("ttlive_play_together_v2_schema", gamePlayTogetherSchemaV2);
        return gamePlayTogetherSchemaV22 != null ? gamePlayTogetherSchemaV22 : gamePlayTogetherSchemaV2;
    }

    public final String getCreatorGuideSchema() {
        return getValue().creatorGuideSchema;
    }

    public final String getCreatorQueueSchema() {
        return getValue().creatorQueueSchema;
    }

    public final String getCreatorSettingSchema() {
        return getValue().creatorSettingSchema;
    }
}
