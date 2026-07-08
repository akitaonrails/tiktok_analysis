package webcast.api.ranklist;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.model.ActivityRankLabel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes.dex */
public final class LeagueMatchRankResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("bottom_bar_text")
        public Text bottomBarText;

        @C09CT("countdown")
        public long countdown;

        @C09CT("has_lived_before")
        public boolean hasLivedBefore;

        @C09CT("is_anchor_opt_out")
        public boolean isAnchorOptOut;

        @C09CT("league_match_info")
        public LeagueMatchInfo leagueMatchInfo;

        @C09CT("owner_info")
        public OwnerInfo ownerInfo;

        @C09CT("track")
        public int track;

        @C09CT("rule_url")
        public String ruleUrl = "";

        @C09CT("ranks")
        public List<RankInfo> ranks = new ArrayList();

        @C09CT("region")
        public String region = "";

        @C09CT("external_activity_schema")
        public String externalActivitySchema = "";
    }

    public static final class LeagueMatchInfo {

        @C09CT("end_timestamp_sec")
        public long endTimestampSec;

        @C09CT("is_rank_settled")
        public boolean isRankSettled;

        @C09CT("match_duration_threshold")
        public long matchDurationThreshold;

        @C09CT("match_score_threshold")
        public long matchScoreThreshold;

        @C09CT("stage")
        public int stage;

        @C09CT("start_timestamp_sec")
        public long startTimestampSec;

        @C09CT("score_rule")
        public Map<Long, Long> scoreRule = new LinkedHashMap();

        @C09CT("prepare_reward_list")
        public List<RewardItem> prepareRewardList = new ArrayList();

        @C09CT("detail_reward_rule")
        public List<RewardItem> detailRewardRule = new ArrayList();

        @C09CT("track_reward_list")
        public Map<Long, RewardItemList> trackRewardList = new LinkedHashMap();
    }

    public static final class OwnerInfo {

        @C09CT("gap_description")
        public Text gapDescription;

        @C09CT("obtained_reward_list")
        public List<RewardItem> obtainedRewardList = new ArrayList();

        @C09CT("rank_info")
        public RankInfo rankInfo;

        @C09CT("track")
        public int track;
    }

    public static final class RankInfo {

        @C09CT("label")
        public ActivityRankLabel label;

        @C09CT("rank")
        public long rank;

        @C09CT("room_id")
        public long roomId;

        @C09CT("score")
        public long score;

        @C09CT("user")
        public RankUser user;

        @C09CT("rank_str")
        public String rankStr = "";

        @C09CT("score_description")
        public String scoreDescription = "";
    }

    public static final class RewardItem {

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("name")
        public Text name;

        @C09CT("reward_top_range")
        public RewardedIndexRange rewardTopRange;

        @C09CT("reward_type")
        public int rewardType;
    }

    public static final class RewardItemList {

        @C09CT("reward_item_list")
        public List<RewardItem> rewardItemList = new ArrayList();
    }

    public static final class RewardedIndexRange {

        @C09CT("from_index")
        public long fromIndex;

        @C09CT("to_index")
        public long toIndex;
    }
}
