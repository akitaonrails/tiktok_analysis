package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class Item {

    @C09CT("duration")
    public final int duration;

    @C09CT("item_duration")
    public final long itemDuration;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("item_type")
    public final String itemType;

    @C09CT("task_key")
    public final String taskKey;

    @C09CT("task_type")
    public final int taskType;

    @C09CT("timestamp")
    public final long timeStamp;

    public Item() {
        this(0, "", "", "", 0L, 0, 0L);
    }

    public Item(int i, String str, String str2, String str3, long j, int i2, long j2) {
        this.taskType = i;
        this.taskKey = str;
        this.itemType = str2;
        this.itemId = str3;
        this.itemDuration = j;
        this.duration = i2;
        this.timeStamp = j2;
    }
}
