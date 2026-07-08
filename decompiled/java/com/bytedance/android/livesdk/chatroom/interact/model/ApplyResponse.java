package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.ApplyResult;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyResponse {

    @C09CT("data")
    public ApplyResult data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "ApplyResponse{");
        sb.append('}');
        return sb.toString();
    }
}
