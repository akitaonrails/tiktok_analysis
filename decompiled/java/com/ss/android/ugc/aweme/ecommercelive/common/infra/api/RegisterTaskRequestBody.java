package com.ss.android.ugc.aweme.ecommercelive.common.infra.api;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class RegisterTaskRequestBody {

    @C09CT("room_id")
    public final String roomId;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("user_id")
    public final String userId;

    public RegisterTaskRequestBody(String str, String str2, String str3) {
        this.roomId = str;
        this.userId = str2;
        this.taskId = str3;
    }
}
