package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes35.dex */
public final class CohostListUser {

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("best_teammate_uid")
    public long bestTeammateUid;

    @C09CT("display_id")
    public String displayId;

    @C09CT("follow_status")
    public Long followStatus;

    @C09CT("has_topic_perm")
    public boolean hasTopicPerm;

    @C09CT("inner_channel_id")
    public long innerChannelId;

    @C09CT("is_initiator")
    public Boolean isInitiator;

    @C09CT("is_low_version")
    public Boolean isLowVersion;

    @C09CT("link_remaining_time")
    public Long linkRemainingTime;

    @C09CT("linked_time")
    public Long linkedTime;

    @C09CT("linkmic_id_str")
    public String linkmicIdStr;

    @C09CT("linkmic_user_status")
    public int linkmicUserStatus;

    @C09CT("nick_name")
    public String nickName;

    @C09CT("permission_type")
    public int permissionType;

    @C09CT("play_type")
    public int playType;

    @C09CT("rival_room_id")
    public Long rivalRoomId;

    @C09CT("rival_user_id")
    public Long rivalUserId;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("user_id")
    public Long userId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.userId != null) {
            sb.append(", user_id=");
            sb.append(this.userId);
        }
        if (this.nickName != null) {
            sb.append(", nick_name=");
            sb.append(this.nickName);
        }
        if (this.avatarThumb != null) {
            sb.append(", avatar_thumb=");
            sb.append(this.avatarThumb);
        }
        if (this.linkedTime != null) {
            sb.append(", linked_time=");
            sb.append(this.linkedTime);
        }
        sb.append(", play_type=");
        sb.append(this.playType);
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        sb.append(", linkmic_user_status=");
        sb.append(this.linkmicUserStatus);
        if (this.linkRemainingTime != null) {
            sb.append(", link_remaining_time=");
            sb.append(this.linkRemainingTime);
        }
        sb.append(", permission_type=");
        sb.append(this.permissionType);
        if (this.displayId != null) {
            sb.append(", display_id=");
            sb.append(this.displayId);
        }
        if (this.followStatus != null) {
            sb.append(", follow_status=");
            sb.append(this.followStatus);
        }
        if (this.isLowVersion != null) {
            sb.append(", is_low_version=");
            sb.append(this.isLowVersion);
        }
        if (this.rivalUserId != null) {
            sb.append(", rival_user_id=");
            sb.append(this.rivalUserId);
        }
        if (this.rivalRoomId != null) {
            sb.append(", rival_room_id=");
            sb.append(this.rivalRoomId);
        }
        sb.replace(0, 2, "CohostListUser{");
        sb.append('}');
        return sb.toString();
    }
}
