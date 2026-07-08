package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskScheduleConfigItem {
    public static final TypeAdapter ADAPTER = new TaskScheduleConfigItem_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ignore_block_scenes")
    public List<Integer> ignoreBlockScenes;

    @C09CT("sub_biz_config")
    public Map<String, TaskScheduleSubConfigItem> subBizConfig;

    @C09CT("task_priority")
    public int taskPriority;

    public TaskScheduleConfigItem() {
        this(10, new ArrayList(), new LinkedHashMap());
    }

    public final List<Integer> getIgnoreBlockScenes() {
        return this.ignoreBlockScenes;
    }

    public final Map<String, TaskScheduleSubConfigItem> getSubBizConfig() {
        return this.subBizConfig;
    }

    public final int getTaskPriority() {
        return this.taskPriority;
    }

    public final void setIgnoreBlockScenes(List<Integer> list) {
        this.ignoreBlockScenes = list;
    }

    public final void setSubBizConfig(Map<String, TaskScheduleSubConfigItem> map) {
        this.subBizConfig = map;
    }

    public final void setTaskPriority(int i) {
        this.taskPriority = i;
    }

    public TaskScheduleConfigItem(int i, List<Integer> list, Map<String, TaskScheduleSubConfigItem> map) {
        this.taskPriority = i;
        this.ignoreBlockScenes = list;
        this.subBizConfig = map;
    }
}
