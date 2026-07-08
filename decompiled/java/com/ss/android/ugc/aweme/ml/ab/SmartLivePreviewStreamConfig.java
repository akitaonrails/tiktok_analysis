package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartLivePreviewStreamConfig extends SmartSceneConfig {

    @C09CT("async")
    public boolean async;

    @C09CT("base_keep_dur")
    public int baseKeepDur;

    @C09CT("delay_prepare")
    public boolean delayPrepare;

    @C09CT("delta_dur")
    public float deltaDur;

    @C09CT("fast_pre_fetch_time")
    public int fastPreFetchTime;

    @C09CT("is_dynamic_dur")
    public boolean isDynamicDur;

    @C09CT("mapping_gap")
    public float mappingGap;

    @C09CT("preload")
    public boolean preload;

    @C09CT("prob_key")
    public String probKey;

    @C09CT("slow_pre_fetch_configs")
    public List<DurationConfig> slowPreFetchConfigs;

    @C09CT("slow_pre_fetch_on")
    public boolean slowPreFetchOn;

    @C09CT("slow_pre_fetch_time")
    public int slowPreFetchTime;

    @C09CT("threshold")
    public float threshold;

    public SmartLivePreviewStreamConfig() {
        setScene(SmartLivePreviewStreamExperiment.SCENE);
        this.threshold = 0.5f;
        this.probKey = "gt8s";
        this.fastPreFetchTime = 2500;
        this.slowPreFetchTime = 8000;
        this.slowPreFetchConfigs = new ArrayList();
        this.baseKeepDur = 5000;
        this.mappingGap = 1.0f;
        this.deltaDur = 1.0f;
    }
}
