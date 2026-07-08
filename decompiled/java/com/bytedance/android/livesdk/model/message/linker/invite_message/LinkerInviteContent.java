package com.bytedance.android.livesdk.model.message.linker.invite_message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABTestSetting;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.model.message.InviteTopHostInfo;
import com.bytedance.android.livesdk.model.message.LinkmicUserInfo;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinkerInviteContent {

    @C09CT("ab_test_setting")
    public List<CohostABTestSetting> abTestSetting;

    @C09CT("action_id")
    public Long actionId;

    @C09CT("dialog")
    public PerceptionDialogInfo dialogInfo;

    @C09CT("inviter_linkmic_id_str")
    public String fromLinkmicIdStr;

    @C09CT("from_room_age_restricted")
    public int fromRoomAgeRestricted;

    @C09CT("from_room_id")
    public long fromRoomId;

    @C09CT("from_top_host_info")
    public InviteTopHostInfo fromTopHostInfo;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT("linked_users")
    public List<LinkmicUserInfo> linkedUsers;

    @C09CT("linker_invite_msg_extra")
    public LinkerInviteMessageExtra linkerInviteMsgExtra;

    @C09CT("punish_info")
    public PunishEventInfo punishEventInfo;

    @C09CT("required_mic_idx")
    public Long requiredMicIdx;

    @C09CT("rtc_join_channel")
    public boolean rtcJoinChannel;

    @C09CT("sec_from_user_id")
    public String secFromUserId;

    @C09CT("from_tag")
    public RivalExtraInfo.Tag tag;

    @C09CT("to_linkmic_id_str")
    public String toLinkmicIdStr;

    @C09CT("to_rtc_ext_info")
    public String toRtcExtInfo;

    @C09CT("from_user")
    public User user;

    @C09CT("vendor")
    public int vendor;

    @C09CT("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @C09CT("anchor_multi_live_enum")
    public int multiLiveLayoutEnable = 0;

    @C09CT("anchor_setting_info")
    public MultiLiveAnchorPanelSettings multiLiveSetting = null;
}
