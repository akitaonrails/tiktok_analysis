package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class QuotaRefreshBody {

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("task_type")
    public final String taskType;

    public QuotaRefreshBody() {
        this(null, null);
    }

    public QuotaRefreshBody(String str, String str2) {
        this.businessScene = str;
        this.taskType = str2;
    }
}
