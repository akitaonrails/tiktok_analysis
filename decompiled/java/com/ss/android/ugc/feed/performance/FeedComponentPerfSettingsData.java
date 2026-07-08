package com.ss.android.ugc.feed.performance;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedComponentPerfSettingsData {

    @C09CT("param_config")
    public final List<String> paramConfig;

    @C09CT("sampling_rate")
    public final double samplingRate;

    public FeedComponentPerfSettingsData() {
        this(0.0d, C1697810uHb.LJIIJJI("aweme_id", "request_id", "stage", "aweme_type", "start_time", "execution_time", "thread_name", "component_name", "task_name"));
    }

    public FeedComponentPerfSettingsData(double d, List<String> list) {
        this.samplingRate = d;
        this.paramConfig = list;
    }
}
