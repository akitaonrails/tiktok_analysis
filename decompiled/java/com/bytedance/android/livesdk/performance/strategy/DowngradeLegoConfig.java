package com.bytedance.android.livesdk.performance.strategy;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DowngradeLegoConfig {
    public static final TypeAdapter ADAPTER = new DowngradeLegoConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public int strategy;

    @C09CT("task_list")
    public List<String> taskList;

    @C09CT("stop_downgrade_time")
    public long time;

    @C09CT("trigger_type_list")
    public List<String> triggerTypeList;

    public DowngradeLegoConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this.triggerTypeList = c13bv;
        this.taskList = c13bv;
    }
}
