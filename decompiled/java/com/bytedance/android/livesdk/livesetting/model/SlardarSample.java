package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class SlardarSample {
    public static final TypeAdapter ADAPTER = new SlardarSample_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_slardar_is_sample_experiment")
    public boolean isExperiment;

    @C09CT("live_slardar_sample_list")
    public Map<String, Double> sampleList = new LinkedHashMap();
}
