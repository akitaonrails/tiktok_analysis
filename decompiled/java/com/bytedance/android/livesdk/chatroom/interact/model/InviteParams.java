package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InviteParams {

    @C09CT("effective_seconds")
    public Long effectiveSeconds;

    @C09CT("invitation_mic_idx")
    public Long invitationMicIdx;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("to_user_id")
    public Long toUserId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.toUserId != null) {
            sb.append(", to_user_id=");
            sb.append(this.toUserId);
        }
        if (this.effectiveSeconds != null) {
            sb.append(", effective_seconds=");
            sb.append(this.effectiveSeconds);
        }
        if (this.invitationMicIdx != null) {
            sb.append(", invitation_mic_idx=");
            sb.append(this.invitationMicIdx);
        }
        sb.replace(0, 2, "InviteParams{");
        sb.append('}');
        return sb.toString();
    }
}
