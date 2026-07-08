package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.HashtagResponse;

/* JADX INFO: loaded from: classes.dex */
public final class HashtagListResponse {

    @C09CT("data")
    public HashtagResponse data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "HashtagListResponse{");
        sb.append('}');
        return sb.toString();
    }
}
