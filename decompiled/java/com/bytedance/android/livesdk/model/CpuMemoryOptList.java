package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class CpuMemoryOptList {
    public static final TypeAdapter ADAPTER = new CpuMemoryOptList_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_cpu_memory_opt_list")
    public Map<String, Integer> optList = new LinkedHashMap();
}
