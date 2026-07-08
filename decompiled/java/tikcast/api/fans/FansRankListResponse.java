package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.creator_succ.CRMUserDisplayItem;
import webcast.data.DiscordEntrance;
import webcast.data.FansChatGroupInfo;
import webcast.data.FansClubBanner;
import webcast.data.FansClubCountInfo;
import webcast.data.FansClubNameInfo;
import webcast.data.SlotFansRecord;
import webcast.data.SuperFanRelation;

/* JADX INFO: loaded from: classes29.dex */
public final class FansRankListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class Rank {

        @C09CT("crm_user_display_item")
        public CRMUserDisplayItem crmUserDisplayItem;

        @C09CT("fans_level")
        public long fansLevel;

        @C09CT("fans_score")
        public long fansScore;

        @C09CT("join_time_seconds")
        public long joinTimeSeconds;

        @C09CT("live_online")
        public boolean liveOnline;

        @C09CT("rank")
        public long rank;

        @C09CT("room_id")
        public long roomId;

        @C09CT("super_fan_relation")
        public SuperFanRelation superFanRelation;

        @C09CT("user")
        public User user;

        @C09CT("user_level")
        public long userLevel;

        @C09CT("fans_tag_for_fans")
        public String fansTagForFans = "";

        @C09CT("fans_tag_for_anchor")
        public String fansTagForAnchor = "";

        @C09CT("daily_task_status")
        public List<MiniTaskProcess> dailyTaskStatus = new ArrayList();
    }

    public static final class ResponseData {

        @C09CT("banner")
        public FansClubBanner banner;

        @C09CT("chat_group_info")
        public FansChatGroupInfo chatGroupInfo;

        @C09CT("discord_entrance")
        public DiscordEntrance discordEntrance;

        @C09CT("extra")
        public FanRankExtra extra;

        @C09CT("fans_club_count_info")
        public FansClubCountInfo fansClubCountInfo;

        @C09CT("fans_club_name_info")
        public FansClubNameInfo fansClubNameInfo;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("next_offset")
        public long nextOffset;

        @C09CT("ranks")
        public List<Rank> ranks = new ArrayList();

        @C09CT("scroll_to_user_id")
        public String scrollToUserId = "";

        @C09CT("slot_fans_record")
        public SlotFansRecord slotFansRecord;

        @C09CT("total")
        public long total;
    }
}
