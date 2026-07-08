package com.bytedance.android.livesdk.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class FlareInfo {

    @C09CT("is_flare")
    public boolean isFlare;

    @C09CT("task_id")
    public String taskId;

    public FlareInfo() {
    }

    public FlareInfo(boolean z, String str) {
        this.isFlare = z;
        this.taskId = str;
    }
}
