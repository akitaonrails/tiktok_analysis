package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskInfo {

    @C09CT("items")
    public final List<Item> items;

    @C09CT("scene_type")
    public final int sceneType;

    @C09CT("task_key")
    public final String taskKey;

    @C09CT("task_type")
    public final int taskType;

    public TaskInfo() {
        this(0, "", 0, new ArrayList());
    }

    public TaskInfo(int i, String str, int i2, List<Item> list) {
        this.taskType = i;
        this.taskKey = str;
        this.sceneType = i2;
        this.items = list;
    }
}
