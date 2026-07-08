package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InviteResponse {

    @C09CT("data")
    public LinkInRoomInviteResponse data;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "InviteResponse{");
        sb.append('}');
        return sb.toString();
    }
}
