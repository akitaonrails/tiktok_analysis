package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class PlayerSmartPrerenderConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("prediction_cache_enabled")
    public boolean predictionCacheEnabled;

    @C09CT("prediction_delay_map")
    public Map<String, Integer> predictionDelayMap;

    @C09CT("prediction_skip_count")
    public int predictionSkipCount;

    @C09CT("effect_value")
    public double effectValue = 0.8d;

    @C09CT("delay_ms")
    public int delayMs = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    @C09CT("option")
    public int option = 0;

    @C09CT("prediction_delay_ms")
    public int predictionDelayMs = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    @C09CT("prediction_feature_key")
    public int predictionFeatureKey = 3504;

    @C09CT("prediction_cache_size")
    public int predictionCacheSize = 5;
}
