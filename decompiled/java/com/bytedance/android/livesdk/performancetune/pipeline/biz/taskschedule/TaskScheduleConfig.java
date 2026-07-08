package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskScheduleConfig {
    public static final TypeAdapter ADAPTER = new TaskScheduleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("task_schedule_configs")
    public Map<String, TaskScheduleConfigItem> taskScheduleConfigs;

    public TaskScheduleConfig() {
        this(new LinkedHashMap());
    }

    public final Map<String, TaskScheduleConfigItem> getTaskScheduleConfigs() {
        return this.taskScheduleConfigs;
    }

    public TaskScheduleConfig(Map<String, TaskScheduleConfigItem> map) {
        this.taskScheduleConfigs = map;
    }

    public final void setTaskScheduleConfigs(Map<String, TaskScheduleConfigItem> map) {
        this.taskScheduleConfigs = map;
    }
}
