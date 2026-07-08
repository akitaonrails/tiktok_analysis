package com.bytedance.android.livesdk.model.message.linker.reply_message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.message.LinkmicUserInfo;
import com.bytedance.android.livesdk.model.message.linker.mic_update.LinkerMicIdxUpdateInfo;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinkerReplyContent {

    @C09CT("action_id")
    public Long actionId;

    @C09CT("to_user_linkmic_info")
    public LinkmicInfo inviteeLinkmicInfo;

    @C09CT("invitee_mic_idx_update_info")
    public LinkerMicIdxUpdateInfo inviteeMicIdxUpdateInfo;

    @C09CT("to_user_id")
    public long inviteeUid;

    @C09CT("to_user")
    public User inviteeUser;

    @C09CT("from_user_linkmic_info")
    public LinkmicInfo inviterLinkmicInfo;

    @C09CT("from_room_id")
    public long inviterRoomId;

    @C09CT("from_user_id")
    public long inviterUid;

    @C09CT("from_user")
    public User inviterUser;

    @C09CT("link_type")
    public long linkType;

    @C09CT("linked_users")
    public List<LinkmicUserInfo> linkedUsers;

    @C09CT("linker_setting")
    public LinkerSetting linkerSetting;

    @C09CT("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveSetting;

    @C09CT("reply_status")
    public int replyStatus;

    @C09CT("source_type")
    public long sourceType;

    @C09CT("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @C09CT("applier_mic_idx_info_map")
    public HashMap<Long, Long> applierMicIdxInfoMap = new HashMap<>();

    @C09CT("anchor_multi_live_enum")
    public int multiLiveLayoutEnable = 0;
}
