package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class JoinChannelResponse {

    @C09CT("data")
    public MultiLiveLayoutInfo data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "JoinChannelResponse{");
        sb.append('}');
        return sb.toString();
    }
}
