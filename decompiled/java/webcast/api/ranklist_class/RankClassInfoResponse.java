package webcast.api.ranklist_class;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.model.FragmentReward;
import com.bytedance.android.livesdk.rank.model.RestCard;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.persona.SkillInfo;
import webcast.data.RankUser;

/* JADX INFO: loaded from: classes28.dex */
public final class RankClassInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class AnchorInfo {

        @C09CT("rank_user")
        public RankUser rankUser;
    }

    public static final class ClassBenefit {

        @C09CT("desc")
        public Text desc;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("schema")
        public String schema = "";

        @C09CT("title")
        public Text title;

        @C09CT("type")
        public int type;
    }

    public static final class ClassInfo {

        @C09CT("creator_class")
        public int creatorClass;

        @C09CT("cur_class_stars")
        public long curClassStars;

        @C09CT("rest_card_num")
        public long restCardNum;

        @C09CT("rewards_mission_ratio")
        public long rewardsMissionRatio;
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class ClassStarRule {

        @C09CT("class_list")
        public List<Integer> classList = new ArrayList();

        @C09CT("class_star_rule")
        public List<ProgressBarSection> classStarRule = new ArrayList();
    }

    public static final class Data {

        @C09CT("anchor_info")
        public AnchorInfo anchorInfo;

        @C09CT("anchor_information")
        public AnchorInfo anchorInformation;

        @C09CT("class_creator")
        public RankUser classCreator;

        @C09CT("class_info")
        public ClassInfo classInfo;

        @C09CT("countdown")
        public long countdown;

        @C09CT("gift_gallery_info")
        public GiftGalleryInfo giftGalleryInfo;

        @C09CT("guardian_info")
        public GuardianInfo guardianInfo;

        @C09CT("is_opt_out")
        public boolean isOptOut;

        @C09CT("is_settling")
        public boolean isSettling;

        @C09CT("league_rewards_entrance")
        public LeagueRewardsEntrance leagueRewardsEntrance;

        @C09CT("limited_bonus_info")
        public LimitedBonusInfo limitedBonusInfo;

        @C09CT("progress_bar")
        public ProgressBar progressBar;

        @C09CT("rest_card_info")
        public RestCardInfo restCardInfo;

        @C09CT("reward_guide")
        public Text rewardGuide;

        @C09CT("rule_template_version")
        public long ruleTemplateVersion;

        @C09CT("settle_notice")
        public SettleNotice settleNotice;

        @C09CT("settle_timestamp")
        public long settleTimestamp;

        @C09CT("tile_extra")
        public TileExtra tileExtra;

        @C09CT("viewer_guide")
        public Text viewerGuide;

        @C09CT("rule_url")
        public String ruleUrl = "";

        @C09CT("rank_page_schema")
        public String rankPageSchema = "";

        @C09CT("major_benefits")
        public List<MajorClassBenefit> majorBenefits = new ArrayList();

        @C09CT("major_class_rule")
        public List<MajorClassRule> majorClassRule = new ArrayList();
    }

    public static final class GiftGalleryInfo {

        @C09CT("class_type")
        public int classType;

        @C09CT("opt_out")
        public boolean optOut;
    }

    public static final class GuardianInfo {

        @C09CT("forged_rest_card")
        public RestCard forgedRestCard;

        @C09CT("fragment_reward")
        public FragmentReward fragmentReward;

        @C09CT("guardian_end_timestamp")
        public long guardianEndTimestamp;

        @C09CT("guardian_user")
        public RankUser guardianUser;

        @C09CT("skills")
        public List<SkillInfo> skills = new ArrayList();
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class LeagueRewardsEntrance {

        @C09CT("ratio")
        public long ratio;

        @C09CT("ratio_options")
        public List<Long> ratioOptions = new ArrayList();

        @C09CT("show_entrance")
        public boolean showEntrance;

        @C09CT("upper_limit_reward")
        public long upperLimitReward;
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class LimitedBonusInfo {

        @C09CT("end_time")
        public long endTime;

        @C09CT("region")
        public String region = "";

        @C09CT("start_time")
        public long startTime;
    }

    public static final class MajorClassBenefit {

        @C09CT("benefits")
        public List<ClassBenefit> benefits = new ArrayList();

        @C09CT("desc")
        public Text desc;

        @C09CT("major_class_type")
        public int majorClassType;
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class MajorClassRule {

        @C09CT("major_class_type")
        public int majorClassType;

        @C09CT("rules")
        public List<ClassStarRule> rules = new ArrayList();
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class ProgressBar {

        @C09CT("current_user_percent")
        public long currentUserPercent;

        @C09CT("is_show_water_level_info")
        public boolean isShowWaterLevelInfo;

        @C09CT("sections")
        public List<ProgressBarSection> sections = new ArrayList();
    }

    public static final class RestCardInfo {

        @C09CT("card_ids")
        public List<String> cardIds = new ArrayList();

        @C09CT("card_number")
        public long cardNumber;

        @C09CT("event_animation")
        public int eventAnimation;

        @C09CT("lock_tip")
        public Text lockTip;

        @C09CT("period")
        public long period;

        @C09CT("temporary_tip")
        public Text temporaryTip;
    }

    public static final class SettleNotice {

        @C09CT("bonus_star_num")
        public long bonusStarNum;

        @C09CT("current_period")
        public long currentPeriod;

        @C09CT("desc")
        public Text desc;

        @C09CT("new_info")
        public ClassInfo newInfo;

        @C09CT("old_info")
        public ClassInfo oldInfo;

        @C09CT("type")
        public int type;
    }

    public static final class TileExtra {

        @C09CT("tiles_available")
        public long tilesAvailable;

        @C09CT("redeem_config")
        public List<TileRedeemConfig> redeemConfig = new ArrayList();

        @C09CT("faq_reward_config")
        public List<TileRewardConfig> faqRewardConfig = new ArrayList();

        @C09CT("education_reward_config")
        public List<TileRewardConfig> educationRewardConfig = new ArrayList();
    }
}
