package webcast.im;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.RivalsGameTag;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class JoinGroupBizContent {

    @C09CT("cohost_layout_mode")
    public int cohostLayoutMode;

    @C09CT("dialog")
    public PerceptionDialogInfo dialog;

    @C09CT("from_room_age_restricted")
    public int fromRoomAgeRestricted;

    @C09CT("from_tag")
    public RivalExtraInfo.Tag fromTag;

    @C09CT("game_tag")
    public RivalsGameTag gameTag;

    @C09CT("join_group_msg_extra")
    public JoinGroupMessageExtra joinGroupMsgExtra;

    @C09CT("matched_preference_tag")
    public int matchedPreferenceTag;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("tag")
    public TagV2 tag;

    @C09CT("topic_info")
    public CohostTopic topicInfo;

    @C09CT("algo_request_id")
    public String algoRequestId = "";

    @C09CT("new_user_education")
    public String newUserEducation = "";

    @C09CT("ab_infos")
    public Map<Long, CohostABInfo> abInfos = new LinkedHashMap();
}
