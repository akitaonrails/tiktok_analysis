package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C001L;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUpdateUserSettingContent;
import com.bytedance.android.livesdk.model.message.linker.accpet_notice_message.LinkerAcceptNoticeContent;
import com.bytedance.android.livesdk.model.message.linker.cancel_message.LinkerCancelContent;
import com.bytedance.android.livesdk.model.message.linker.enter_message.LinkerEnterContent;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.linker.kick_out_message.LinkerKickOutContent;
import com.bytedance.android.livesdk.model.message.linker.leave_message.LinkerLeaveContent;
import com.bytedance.android.livesdk.model.message.linker.linked_list_change_message.LinkedListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.android.livesdk.model.message.linker.mic_update.LinkerMicIdxUpdateContent;
import com.bytedance.android.livesdk.model.message.linker.mute_message.LinkerMuteContent;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public class LinkMessage extends AbstractC1136060ffY {

    @C09CT("reply_accept_notice_content")
    public LinkerAcceptNoticeContent acceptNoticeContentMessage;

    @C09CT("cancel_content")
    public LinkerCancelContent cancelContent;

    @C09CT("linker_id")
    public long channelId;

    @C09CT("close_content")
    public LinkerCloseContent closeContent;

    @C09CT("cohost_list_change_content")
    public CohostListChangeContent cohostListChangeContent;

    @C09CT("create_content")
    public LinkerCreateContent createContent;

    @C09CT("enter_content")
    public LinkerEnterContent enterContent;

    @C09CT("expire_timestamp")
    public long expireTimestamp;

    @C09CT("extra")
    public String extraStr;

    @C09CT("invite_content")
    public LinkerInviteContent inviteContent;

    @C09CT("kick_out_content")
    public LinkerKickOutContent kickOutContent;

    @C09CT("leave_content")
    public LinkerLeaveContent leaveContent;

    @C09CT("linked_list_change_content")
    public LinkedListChangeContent linkedListChangeContent;

    @C09CT("list_change_content")
    public LinkerListChangeContent mListChangeContent;

    @C09CT("media_change_content")
    public LinkerMediaChangeContent mediaChangeContent;

    @C09CT("message_type")
    public int messageType;

    @C09CT("mic_idx_update_content")
    public LinkerMicIdxUpdateContent micIdxUpdateContent;

    @C09CT("update_user_setting_content")
    public MultiLiveUpdateUserSettingContent multiLiveUpdateUserSettingContent;

    @C09CT("mute_content")
    public LinkerMuteContent muteContent;

    @C09CT("random_match_content")
    public LinkerRandomMatchContent randomMatchContent;

    @C09CT("reply_content")
    public LinkerReplyContent replyContent;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("sys_kick_out_content")
    public LinkerSysKickOutContent sysKickOutContent;

    @C09CT("transfer_extra")
    public String transferExtra;

    @C09CT("update_user_content")
    public LinkerUpdateUserContent updateUserContent;

    @C09CT("user_toast_content")
    public LinkmicUserToastContent userToastContent;

    @C09CT("version")
    public long version;

    @C09CT("waiting_list_change_content")
    public LinkerWaitingListChangeContent waitingListChangeContent;

    public final long LIZ() {
        long j = this.expireTimestamp;
        if (j > 0) {
            return j - this.timestamp;
        }
        return 0L;
    }

    public final C001L LIZIZ() {
        int i = this.scene;
        return i != 2 ? i != 4 ? C001L.OTHER : C001L.AUDIENCE_LINKMIC : C001L.ANCHOR_LINKMIC;
    }

    public LinkMessage() {
        this.type = C001A.LINK_MESSAGE;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMessage{messageType=");
        sbLIZ.append(this.messageType);
        sbLIZ.append(", channelId=");
        sbLIZ.append(this.channelId);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", linkerInviteContent=");
        sbLIZ.append(this.inviteContent);
        sbLIZ.append(", extraStr='");
        sbLIZ.append(this.extraStr);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
