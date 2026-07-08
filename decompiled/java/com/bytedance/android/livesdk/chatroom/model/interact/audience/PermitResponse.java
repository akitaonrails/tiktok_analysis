package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PermitResponse {

    @C09CT("data")
    public PermitResult data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "PermitResponse{");
        sb.append('}');
        return sb.toString();
    }
}
