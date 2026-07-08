package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyParams {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("invite_user_id")
    public Long inviteUserId;

    @C09CT("join_channel")
    public Boolean joinChannel;

    @C09CT("link_type")
    public Long linkType;

    @C09CT("reply_status")
    public Long replyStatus;

    @C09CT("room_id")
    public Long roomId;

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
        if (this.transparentExtra != null) {
            sb.append(", transparent_extra=");
            sb.append(this.transparentExtra);
        }
        if (this.linkType != null) {
            sb.append(", link_type=");
            sb.append(this.linkType);
        }
        if (this.joinChannel != null) {
            sb.append(", join_channel=");
            sb.append(this.joinChannel);
        }
        sb.replace(0, 2, "ReplyParams{");
        sb.append('}');
        return sb.toString();
    }
}
