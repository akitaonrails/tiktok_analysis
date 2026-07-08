package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateAIGCTaskStatusResponse {

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public UpdateAIGCTaskStatusResponse() {
        this(-12345, "", new Data(null, 1, null));
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateAIGCTaskStatusResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpdateAIGCTaskStatusResponse(int i, String str, Data data) {
        this.statusCode = i;
        this.message = str;
        this.data = data;
    }
}
