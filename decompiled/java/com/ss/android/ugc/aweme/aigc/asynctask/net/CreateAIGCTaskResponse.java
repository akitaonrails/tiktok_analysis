package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateAIGCTaskResponse {

    @C09CT("data")
    public final com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail data;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public CreateAIGCTaskResponse() {
        this(-12345, "", new com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail(null, 0, null, 0L, 0L, 0L, null, 0.0f, 0L, null, 1023, null));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateAIGCTaskResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateAIGCTaskResponse(int i, String str, com.ss.android.ugc.aweme.aigc.asynctask.TaskDetail taskDetail) {
        this.statusCode = i;
        this.message = str;
        this.data = taskDetail;
    }
}
