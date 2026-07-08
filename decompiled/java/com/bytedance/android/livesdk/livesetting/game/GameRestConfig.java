package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes32.dex */
public final class GameRestConfig {
    public static final TypeAdapter ADAPTER = new GameRestConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("game_rest_function_switcher")
    public boolean enableFunction;

    @C09CT("game_rest_screenshot_max_interval")
    public long screenshotMaxInterval = 10000;

    @C09CT("game_rest_screenshot_min_interval")
    public long screenshotMinInterval = 3000;

    @C09CT("game_rest_get_server_result_interval")
    public long serverInferInterval = Mp4ScreenVideoLoadTimeout.CONTROL;

    @C09CT("game_rest_model_score_threshold")
    public Float[] scoreThreshold = new Float[0];

    @C09CT("recognition_games")
    public Long[] recognitionGames = new Long[0];

    @C09CT("recognition_game_tags")
    public Long[] recognitionGameTags = new Long[0];
}
