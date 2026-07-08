package com.bytedance.android.livesdk.livesetting.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveLogSampleConfigData {
    public static final TypeAdapter ADAPTER = new LiveLogSampleConfigData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_integrated_tracker_dolphin_configuration_sample_list")
    public Map<String, Double> sampleConfigList = new LinkedHashMap();
}
