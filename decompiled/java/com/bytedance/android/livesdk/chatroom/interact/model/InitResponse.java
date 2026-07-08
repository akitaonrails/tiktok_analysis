package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;

/* JADX INFO: loaded from: classes.dex */
public final class InitResponse {

    @C09CT("data")
    public LinkInitResult data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "InitResponse{");
        sb.append('}');
        return sb.toString();
    }
}
