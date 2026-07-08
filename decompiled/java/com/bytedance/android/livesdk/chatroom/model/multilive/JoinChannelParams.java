package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class JoinChannelParams {

    @C09CT("access_key")
    public String accessKey;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("transparent_extra")
    public String transparentExtra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.accessKey != null) {
            sb.append(", access_key=");
            sb.append(this.accessKey);
        }
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        sb.replace(0, 2, "JoinChannelParams{");
        sb.append('}');
        return sb.toString();
    }
}
