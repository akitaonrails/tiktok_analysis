package com.bytedance.android.livesdk.performancetune.pipeline.biz.taskschedule;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class TaskScheduleSubConfigItem {
    public static final TypeAdapter ADAPTER = new TaskScheduleSubConfigItem_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ignore_block_scenes")
    public List<Integer> ignoreBlockScenes;

    @C09CT("task_priority")
    public int taskPriority;

    public TaskScheduleSubConfigItem() {
        this(10, new ArrayList());
    }

    public final List<Integer> getIgnoreBlockScenes() {
        return this.ignoreBlockScenes;
    }

    public final int getTaskPriority() {
        return this.taskPriority;
    }

    public final void setIgnoreBlockScenes(List<Integer> list) {
        this.ignoreBlockScenes = list;
    }

    public final void setTaskPriority(int i) {
        this.taskPriority = i;
    }

    public TaskScheduleSubConfigItem(int i, List<Integer> list) {
        this.taskPriority = i;
        this.ignoreBlockScenes = list;
    }
}
