package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class JoinChannelResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }

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
