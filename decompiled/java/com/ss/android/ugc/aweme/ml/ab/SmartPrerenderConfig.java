package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartPrerenderConfig extends SmartSceneConfig {

    @C09CT("debug_force_result")
    public int debugForceResult;

    @C09CT("time_threshold")
    public long timeThreshold;

    @C09CT("wait_count_for_monitor")
    public int waitCountForMonitor;

    public SmartPrerenderConfig() {
        setScene(SmartPrerenderExperiment.SCENE);
        this.waitCountForMonitor = 3;
        this.timeThreshold = 2000L;
    }
}
