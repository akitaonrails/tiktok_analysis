package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class MonitorSampleData {
    public static final TypeAdapter ADAPTER = new MonitorSampleData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_slardar_dolphin_monitor_sample_experiment")
    public boolean isDolphinExperiment;

    @C09CT("live_slardar_before_monitor_sample_experiment")
    public boolean isSlardarBeforeExperiment;

    @C09CT("live_slardar_sample_list")
    public Map<String, Double> sampleList = new LinkedHashMap();
}
