package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostSettingsInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicSessionStatus;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RoomLinkInfo {

    @C09CT("multi_live_enum")
    public long MultiLiveType;

    @C09CT("ab_infos")
    public Map<Long, CohostABInfo> abInfos;

    @C09CT("audience_id_list")
    public List<Long> audienceIdList;

    @C09CT("audience_linkmic_relation")
    public AudienceLinkmicRelation audienceLinkmicRelation;

    @C09CT("battle_info")
    public BattleInfoResponse battleInfo;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("channel_info")
    public ChannelInfo channelInfo;

    @C09CT("cohost_settings_info")
    public CohostSettingsInfo cohostSettingsInfo;

    @C09CT("competition_info")
    public CompetitionInfo competitionInfo;

    @C09CT("followed_count")
    public long followedCount;

    @C09CT("layout_config")
    public LinkmicLayoutConfig layoutConfig;

    @C09CT("link_mic_channel")
    public long linkMicChannel;

    @C09CT("linked_user_list")
    public List<User> linkedUsers;

    @C09CT("linker_mode")
    public int linkerMode;

    @C09CT("linkmic_unify_channel_id")
    public long linkmicUnifyChannelId;

    @C09CT("multi_guest_enable")
    public boolean multiGuestEnable;

    @C09CT("rival_anchor_id")
    public long rivalAnchorId;

    @C09CT("show_user_list")
    public List<User> showUserList;

    @C09CT("subtitle_enable")
    public int subtitleEnable;

    @C09CT("topic_info")
    public CohostTopic topicInfo;

    @C09CT("topic_status")
    public TopicSessionStatus topicStatus;

    public static final class AudienceLinkmicRelation {

        @C09CT("relation_map")
        public Map<Long, Long> relationMap;
    }

    public static final class LinkmicLayoutConfig {

        @C09CT("cohost_enlarge_enabled")
        public boolean cohostEnlargeEnabled;

        @C09CT("cohost_match_enlarge_enabled")
        public boolean cohostMatchEnlargeEnabled;

        @C09CT("cohost_server_layout_enabled")
        public boolean cohostServerLayoutEnabled;
    }
}
