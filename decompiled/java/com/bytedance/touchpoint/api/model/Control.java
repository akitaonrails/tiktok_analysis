package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Control {

    @C09CT("count")
    public int count;

    @C09CT("match_setting_task_key")
    public String taskName;

    @C09CT("time")
    public int time;

    @C09CT("type")
    public int type;

    public Control(int i, int i2, int i3, String str) {
        this.type = i;
        this.time = i2;
        this.count = i3;
        this.taskName = str;
    }
}
