package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class PermitParams {

    @C09CT("action_id")
    public Long actionId;

    @C09CT("apply_room_id")
    public Long applyRoomId;

    @C09CT("apply_user_id")
    public Long applyUserId;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("effective_seconds")
    public Long effectiveSeconds;

    @C09CT("permit_status")
    public Long permitStatus;

    @C09CT("room_id")
    public Long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public Long scene;

    @C09CT("sec_apply_user_id")
    public String secApplyUserId;

    @C09CT("transparent_extra")
    public String transparentExtra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.permitStatus != null) {
            sb.append(", permit_status=");
            sb.append(this.permitStatus);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.applyUserId != null) {
            sb.append(", apply_user_id=");
            sb.append(this.applyUserId);
        }
        if (this.secApplyUserId != null) {
            sb.append(", sec_apply_user_id=");
            sb.append(this.secApplyUserId);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.effectiveSeconds != null) {
            sb.append(", effective_seconds=");
            sb.append(this.effectiveSeconds);
        }
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        sb.replace(0, 2, "PermitParams{");
        sb.append('}');
        return sb.toString();
    }
}
