package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PermitParams {

    @C09CT("effective_seconds")
    public Long effectiveSeconds;

    @C09CT("from_user_role")
    public Long fromUserRole;

    @C09CT("permit_status")
    public int permitStatus;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("sec_to_user_id")
    public String secToUserId;

    @C09CT("to_user_id")
    public Long toUserId;

    @C09CT("transparent_extra")
    public String transparentExtra;

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
        if (this.secToUserId != null) {
            sb.append(", sec_to_user_id=");
            sb.append(this.secToUserId);
        }
        if (this.fromUserRole != null) {
            sb.append(", from_user_role=");
            sb.append(this.fromUserRole);
        }
        if (this.effectiveSeconds != null) {
            sb.append(", effective_seconds=");
            sb.append(this.effectiveSeconds);
        }
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        sb.append(", permit_status=");
        sb.append(this.permitStatus);
        sb.replace(0, 2, "PermitParams{");
        sb.append('}');
        return sb.toString();
    }
}
