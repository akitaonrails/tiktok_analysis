package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_play_together_schema")
public final class TtlivePlayTogetherSchemaSetting {
    public static final TtlivePlayTogetherSchemaSetting INSTANCE = new TtlivePlayTogetherSchemaSetting();
    public static final GamePlayTogetherSchema DEFAULT = new GamePlayTogetherSchema();

    public static final class GamePlayTogetherSchema {
        public static final TypeAdapter ADAPTER;

        @C09CT("creator_guide")
        public String creatorGuideSchema = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_play_together_creator%2Fpages%2Fcreator_guide%2Ftemplate.js&height=70%25&use_spark=1&radius=12&transition_animation=bottom&starling_fallback=1&starling_channel=3588__53523&bdhm_bid=tiktok_live_interaction_play_together_creator";

        @C09CT("creator_setting")
        public String creatorSettingSchema = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_play_together_creator%2Fpages%2Fcreator_setting%2Ftemplate.js&height=70%25&use_spark=1&radius=12&transition_animation=bottom&starling_fallback=1&starling_channel=3588__53523&bdhm_bid=tiktok_live_interaction_play_together_creator";

        @C09CT("creator_queue")
        public String creatprQueueSchema = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_play_together_creator%2Fpages%2Fcreator_queue%2Ftemplate.js&height=70%25&use_spark=1&radius=12&transition_animation=bottom&starling_fallback=1&starling_channel=3588__53523&bdhm_bid=tiktok_live_interaction_play_together_creator";

        static {
            NormalGson.singleton();
            ADAPTER = new TtlivePlayTogetherSchemaSetting_GamePlayTogetherSchema_OptTypeAdapter();
        }
    }

    private final GamePlayTogetherSchema getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GamePlayTogetherSchema gamePlayTogetherSchema = DEFAULT;
        GamePlayTogetherSchema gamePlayTogetherSchema2 = (GamePlayTogetherSchema) settingsManager.getValueSafely("ttlive_play_together_schema", gamePlayTogetherSchema);
        return gamePlayTogetherSchema2 != null ? gamePlayTogetherSchema2 : gamePlayTogetherSchema;
    }

    public final String getCreatorGuideSchema() {
        return getValue().creatorGuideSchema;
    }

    public final String getCreatorSettingSchema() {
        return getValue().creatorSettingSchema;
    }

    public final String getCreatprQueueSchema() {
        return getValue().creatprQueueSchema;
    }
}
