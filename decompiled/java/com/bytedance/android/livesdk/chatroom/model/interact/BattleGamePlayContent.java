package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleGamePlayContent {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("invite_type")
    public int inviteType;

    @C09CT("source_type")
    public long sourceType;

    @C09CT("team_member")
    public List<TeamUser> teamMember = new ArrayList();

    public static final class TeamUser {

        @C09CT("team_id")
        public long teamId;

        @C09CT("user_id")
        public List<Long> userId = new ArrayList();

        @C09CT("user_info_list")
        public List<UserInfo> userInfoList = new ArrayList();

        public static final class UserInfo {

            @C09CT("invitation_role")
            public int invitationRole;

            @C09CT("room_id")
            public long roomId;

            @C09CT("user_id")
            public long userId;
        }
    }
}
