package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyParams {

    @C09CT("algo_request_id")
    public String algoRequestId = "";

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("invite_user_id")
    public Long inviteUserId;

    @C09CT("reply_status")
    public Long replyStatus;

    @C09CT("room_id")
    public Long roomId;

    @C09CT(Scene.SCENE_SERVICE)
    public Long scene;

    @C09CT("sec_invite_user_id")
    public String secInviteUserId;

    @C09CT("transparent_extra")
    public String transparentExtra;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.replyStatus != null) {
            sb.append(", reply_status=");
            sb.append(this.replyStatus);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.inviteUserId != null) {
            sb.append(", invite_user_id=");
            sb.append(this.inviteUserId);
        }
        if (this.secInviteUserId != null) {
            sb.append(", sec_invite_user_id=");
            sb.append(this.secInviteUserId);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        sb.replace(0, 2, "ReplyParams{");
        sb.append('}');
        return sb.toString();
    }
}
