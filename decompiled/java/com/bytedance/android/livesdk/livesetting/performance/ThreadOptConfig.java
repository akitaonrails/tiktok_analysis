package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class ThreadOptConfig {
    public static final TypeAdapter ADAPTER = new ThreadOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("opt_value")
    public int optValue;

    @C09CT("delay_time_ms")
    public long delayTimeMs = 1000;

    @C09CT("target_thread_name")
    public List<String> targetThreadNamePrefix = C13BV.INSTANCE;

    @C09CT("slow_down_priority")
    public int slowDownPriority = 12;

    @C09CT("slow_down_ops")
    public int slowDownOps = 3;
}
