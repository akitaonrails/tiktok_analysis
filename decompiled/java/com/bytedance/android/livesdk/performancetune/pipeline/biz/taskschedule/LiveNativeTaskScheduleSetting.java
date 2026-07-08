package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "watch_live_native_task_schedule_setting")
public final class LiveNativeTaskScheduleSetting {
    public static final LiveNativeTaskScheduleSetting INSTANCE = new LiveNativeTaskScheduleSetting();
    public static final TaskScheduleConfig DEFAULT = new TaskScheduleConfig(new LinkedHashMap());

    public final Map<String, TaskScheduleConfigItem> getAllTaskConfigs() {
        TaskScheduleConfig taskScheduleConfig = (TaskScheduleConfig) SettingsManager.INSTANCE.getValueSafely(LiveNativeTaskScheduleSetting.class);
        if (taskScheduleConfig == null) {
            taskScheduleConfig = DEFAULT;
        }
        return taskScheduleConfig.getTaskScheduleConfigs();
    }
}
