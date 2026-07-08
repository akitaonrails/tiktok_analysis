package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class MgetPullStreamInfosParams {

    @C09CT("room_ids")
    public String roomIds;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomIds != null) {
            sb.append(", room_ids=");
            sb.append(this.roomIds);
        }
        sb.replace(0, 2, "MgetPullStreamInfosParams{");
        sb.append('}');
        return sb.toString();
    }
}
