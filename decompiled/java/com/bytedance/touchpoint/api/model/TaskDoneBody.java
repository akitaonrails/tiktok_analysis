package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskDoneBody {

    @C09CT("auto_play_enabled")
    public Boolean autoPlayEnabled;

    @C09CT("auto_play_seconds")
    public Long autoPlaySeconds;

    @C09CT("anti_cheating_info")
    public AntiCheatingInfo cheatingInfo;

    @C09CT("has_anti_cheating")
    public boolean hasAntiCheating;

    @C09CT("items")
    public final List<Item> items;

    @C09CT("scene_type")
    public final int sceneType;

    @C09CT("task_key")
    public final String taskKey;

    @C09CT("task_type")
    public final int taskType;

    public TaskDoneBody(boolean z, AntiCheatingInfo antiCheatingInfo, Boolean bool, Long l, int i, String str, int i2, List<Item> list) {
        this.hasAntiCheating = z;
        this.cheatingInfo = antiCheatingInfo;
        this.autoPlayEnabled = bool;
        this.autoPlaySeconds = l;
        this.taskType = i;
        this.taskKey = str;
        this.sceneType = i2;
        this.items = list;
    }
}
