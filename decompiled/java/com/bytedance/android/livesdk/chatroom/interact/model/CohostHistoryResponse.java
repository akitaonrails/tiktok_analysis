package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CohostHistoryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class CohostSession {

        @C09CT("history_group_channel_id")
        public long historyGroupChannelId;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("start_timestamp_sec")
        public long startTimestampSec;

        @C09CT("viewers_accumulated")
        public long viewersAccumulated;

        @C09CT("hosts")
        public List<Host> hosts = new ArrayList();

        @C09CT("match_records")
        public List<MatchRecord> matchRecords = new ArrayList();

        @C09CT("take_the_stage_records")
        public List<TakeTheStageRecord> takeTheStageRecords = new ArrayList();

        public static final class Host {

            @C09CT("history_group_channel_id")
            public long historyGroupChannelId;

            @C09CT("user_id")
            public long userId;
        }
    }

    public static final class MatchRecord {

        @C09CT("history_group_channel_id")
        public long historyGroupChannelId;

        @C09CT("match_id")
        public long matchId;

        @C09CT("match_type")
        public int matchType;

        @C09CT("my_info")
        public Team.User myInfo;

        @C09CT("my_team")
        public Team myTeam;

        @C09CT("opposing_teams")
        public List<Team> opposingTeams = new ArrayList();

        @C09CT("result")
        public int result;

        @C09CT("start_timestamp_sec")
        public long startTimestampSec;

        public static final class Team {

            @C09CT("users")
            public List<User> users = new ArrayList();

            public static final class User {

                @C09CT("points")
                public long points;

                @C09CT("user_id")
                public long userId;
            }
        }
    }

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("oldest_timestamp_sec")
        public long oldestTimestampSec;

        @C09CT("cohost_sessions")
        public List<CohostSession> cohostSessions = new ArrayList();

        @C09CT("user_infos")
        public Map<Long, UserInfo> userInfos = new LinkedHashMap();
    }

    public static final class TakeTheStageRecord {

        @C09CT("history_group_channel_id")
        public long historyGroupChannelId;

        @C09CT("my_take_the_stage_info")
        public TakeTheStageUser myTakeTheStageInfo;

        @C09CT("other_take_the_stage_infos")
        public List<TakeTheStageUser> otherTakeTheStageInfos = new ArrayList();

        @C09CT("showdown_id")
        public long showdownId;

        @C09CT("start_timestamp_sec")
        public long startTimestampSec;

        public static final class TakeTheStageUser {

            @C09CT("points")
            public long points;

            @C09CT("rank")
            public long rank;

            @C09CT("user_id")
            public long userId;
        }
    }

    public static final class UserInfo {

        @C09CT("extra_info")
        public RivalExtraInfo extraInfo;

        @C09CT("room")
        public Room room;
    }
}
