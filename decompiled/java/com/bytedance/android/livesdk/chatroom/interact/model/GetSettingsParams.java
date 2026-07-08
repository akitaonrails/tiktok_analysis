package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetSettingsParams {

    @C09CT("room_id")
    public Long roomId;

    @C09CT("sec_user_id")
    public String secUserId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.secUserId != null) {
            sb.append(", sec_user_id=");
            sb.append(this.secUserId);
        }
        sb.replace(0, 2, "GetSettingsParams{");
        sb.append('}');
        return sb.toString();
    }
}
