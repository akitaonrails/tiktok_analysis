package com.bytedance.android.livesdk.rank.list.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.model.PrimaryRankTabInfo;
import com.bytedance.android.livesdk.rank.model.RankInteractAction;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.android.livesdk.rank.model.TeamRankBonusTime;
import java.util.List;
import webcast.api.ranklist.LynxRankView;
import webcast.api.ranklist.OfflineListResponse;
import webcast.api.ranklist.RankExtraInfo;
import webcast.api.ranklist_class.TileRewardConfig;

/* JADX INFO: loaded from: classes28.dex */
public final class RankListV2Response {

    @C09CT("data")
    public Data data;

    public static final class BottomBarAnchorSkipStruct {

        @C09CT("is_skip")
        public boolean isSkip;

        @C09CT("skip_schema")
        public String skipSchema = "";
    }

    public static final class BottomBarButton {

        @C09CT("action")
        public int action;

        @C09CT("button_content")
        public Text buttonContent;

        @C09CT("button_display_type")
        public int buttonDisplayType;

        @C09CT("button_image")
        public ImageModel buttonImage;

        @C09CT("schema_url")
        public String schemaUrl = "";

        @C09CT("button_type")
        public String buttonType = "";
    }

    public static final class BottomBarFAQ {

        @C09CT("schema")
        public String schema = "";
    }

    public static final class BottomBarTag {

        @C09CT("content")
        public Text content;

        @C09CT("schema")
        public String schema = "";

        @C09CT("type")
        public int type;
    }

    public static final class BriefDescription {

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("rule")
        public Text rule;

        @C09CT("title")
        public Text title;
    }

    public static final class Bulletin {

        @C09CT("button")
        public Text button;

        @C09CT("content")
        public Text content;

        @C09CT("dark_icon")
        public ImageModel darkIcon;

        @C09CT("enable")
        public boolean enable;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("notice_config")
        public NoticeConfig noticeConfig;

        @C09CT("notice_type")
        public String noticeType = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("title")
        public Text title;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.content != null) {
                sb.append(", content=");
                sb.append(this.content);
            }
            sb.append(", enable=");
            sb.append(this.enable);
            if (this.icon != null) {
                sb.append(", icon=");
                sb.append(this.icon);
            }
            if (this.noticeType != null) {
                sb.append(", notice_type=");
                sb.append(this.noticeType);
            }
            sb.replace(0, 2, "Bulletin{");
            sb.append('}');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            Text text;
            String str;
            if (this == obj) {
                return true;
            }
            if (obj != null && Bulletin.class == obj.getClass()) {
                Bulletin bulletin = (Bulletin) obj;
                Text text2 = this.content;
                if (text2 != null && (text = bulletin.content) != null && (str = text2.key) != null && str.equals(text.key) && this.enable == bulletin.enable && this.noticeType.equals(bulletin.noticeType)) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public static final class BulletinLoop {

        @C09CT("bulletins")
        public List<Bulletin> bulletins;
    }

    public static final class ClassActivityBannerExtra {

        @C09CT("activity_banner_title")
        public Text activityBannerTitle;

        @C09CT("activity_banner_type")
        public int activityBannerType;

        @C09CT("angle")
        public long angle;

        @C09CT("arrow_image")
        public ImageModel arrowImage;

        @C09CT("background_image")
        public ImageModel backgroundImage;

        @C09CT("countdown_info")
        public CountdownInfo countdownInfo;

        @C09CT("right_image")
        public ImageModel rightImage;

        @C09CT("rtl_right_image")
        public ImageModel rtlRightImage;

        @C09CT("start_color")
        public String startColor = "";

        @C09CT("end_color")
        public String endColor = "";

        @C09CT("schema")
        public String schema = "";

        public static final class CountdownInfo {

            @C09CT("desc_text")
            public Text descText;

            @C09CT("end_timestamp_sec")
            public long endTimestampSec;
        }
    }

    public static final class ClassExtra {

        @C09CT("class_type")
        public int classType;

        @C09CT("creator_class_image")
        public ImageModel creatorClassImage;
    }

    public static final class ClassRankLoopTips {

        @C09CT("loop_content")
        public Text loopContent;

        @C09CT("loop_tips_type")
        public int loopTipsType;
    }

    public static final class ClassTitle {

        @C09CT("class_label")
        public RankLabel classLabel;

        @C09CT("dark_default_star_icon")
        public ImageModel darkDefaultStarIcon;

        @C09CT("dark_get_star_icon")
        public ImageModel darkGetStarIcon;

        @C09CT("default_star_icon")
        public ImageModel defaultStarIcon;

        @C09CT("get_star_icon")
        public ImageModel getStarIcon;

        @C09CT("get_star_number")
        public long getStarNumber;

        @C09CT("total_star_number")
        public long totalStarNumber;
    }

    public static final class CutOffLine {

        @C09CT("content")
        public Text content;

        @C09CT("cut_off_index")
        public long cutOffIndex;
    }

    public static final class DailyAndRookieExtra {

        @C09CT("path_to_league")
        public PathToOtherList pathToLeague;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Data {

        @C09CT("lynx_rank_view")
        public LynxRankView lynxRankView;

        @C09CT("rank_view")
        public RankView rankView;

        @C09CT("tab_infos")
        public List<OfflineListResponse.TabInfo> tabInfos;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.rankView != null) {
                sb.append(", rank_view=");
                sb.append(this.rankView);
            }
            sb.replace(0, 2, "Data{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class Gap {

        @C09CT("ban_Info")
        public int banInfo;

        @C09CT("bottom_bar_faq")
        public BottomBarFAQ bottomBarFaq;

        @C09CT("bottom_bar_tag")
        public BottomBarTag bottomBarTag;

        @C09CT("button")
        public BottomBarButton button;

        @C09CT("display_type")
        public int displayType;

        @C09CT("gap_description")
        public Text gapDescription;

        @C09CT("gap_extra")
        public GapExtra gapExtra;

        @C09CT("gap_score")
        public long gapScore;

        @C09CT("IndexDescription")
        public Text indexdescription;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.gapDescription != null) {
                sb.append(", gap_description=");
                sb.append(this.gapDescription);
            }
            sb.append(", gap_score=");
            sb.append(this.gapScore);
            sb.replace(0, 2, "Gap{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class GapClassRankExtra {

        @C09CT("bottom_schema")
        public String bottomSchema = "";

        @C09CT("class_title")
        public ClassTitle classTitle;

        @C09CT("loop_tips")
        public ClassRankLoopTips loopTips;
    }

    public static final class GapExtra {

        @C09CT("class_rank_extra")
        public GapClassRankExtra classRankExtra;

        @C09CT("skip_info")
        public BottomBarAnchorSkipStruct skipInfo;

        @C09CT("tile_bottom_bar")
        public GapTileExtra tileBottomBar;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class GapTileExtra {

        @C09CT("tile_content")
        public Text tileContent;
    }

    public static final class HistoryAchievementNotice {

        @C09CT("history_achievement_notice_type")
        public int historyAchievementNoticeType;

        @C09CT("is_period_first_show")
        public boolean isPeriodFirstShow;

        @C09CT("last_period_settle_timestamp")
        public long lastPeriodSettleTimestamp;
    }

    public static final class HistoryEntrance {

        @C09CT("entrance_text")
        public Text entranceText;

        @C09CT("if_has_history")
        public boolean ifHasHistory;

        @C09CT("last_period_rank")
        public long lastPeriodRank;

        @C09CT("ranks")
        public List<RankInfo> ranks;

        @C09CT("title_text")
        public Text titleText;
    }

    public static final class LeagueTabInfo {

        @C09CT("standard_tab")
        public List<RankLeagueTab> standardTab;

        @C09CT("super_tab")
        public RankLeagueTab superTab;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class LynxRankData {

        @C09CT("lynx_rank_view")
        public RankView lynxRankView;
    }

    public static final class NoticeConfig {

        @C09CT("close_count_limit")
        public long closeCountLimit;

        @C09CT("end_timestamp")
        public long endTimestamp;

        @C09CT("priority")
        public long priority;
    }

    public static final class PathToOtherList {

        @C09CT("description")
        public Text description;

        @C09CT("exist_flow_path")
        public boolean existFlowPath;

        @C09CT("schema")
        public String schema = "";
    }

    public static final class RankInfo {
        public boolean LIZ;

        @C09CT("creator_image")
        public ImageModel creatorImage;

        @C09CT("gap")
        public Gap gap;

        @C09CT("interact_action")
        public RankInteractAction interactAction;

        @C09CT("labels")
        public List<RankLabel> labels;

        @C09CT("rank")
        public long rank;

        @C09CT("rank_str")
        public String rankStr;

        @C09CT("rank_user")
        public User rankUser;

        @C09CT("room_id")
        public long roomId;

        @C09CT("score")
        public long score;

        @C09CT("score_description")
        public String scoreDescription;

        @C09CT("team_rank_extra")
        public TeamRankExtra teamRankExtra;

        @C09CT("user")
        public User user;

        @C09CT("weekly_rank_extra")
        public WeeklyRankExtra weeklyRankExtra;

        @C09CT("weekly_rookie_rank_extra")
        public WeeklyRookieRankExtra weeklyRookieRankExtra;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.user != null) {
                sb.append(", user=");
                sb.append(this.user);
            }
            sb.append(", rank=");
            sb.append(this.rank);
            if (this.rankStr != null) {
                sb.append(", rank_str=");
                sb.append(this.rankStr);
            }
            sb.append(", score=");
            sb.append(this.score);
            if (this.scoreDescription != null) {
                sb.append(", score_description=");
                sb.append(this.scoreDescription);
            }
            sb.append(", room_id=");
            sb.append(this.roomId);
            if (this.gap != null) {
                sb.append(", gap=");
                sb.append(this.gap);
            }
            if (this.weeklyRankExtra != null) {
                sb.append(", weekly_rank_extra=");
                sb.append(this.weeklyRankExtra);
            }
            if (this.weeklyRookieRankExtra != null) {
                sb.append(", weekly_rookie_rank_extra=");
                sb.append(this.weeklyRookieRankExtra);
            }
            sb.replace(0, 2, "RankInfo{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class RankLabel {

        @C09CT("dark_icon")
        public ImageModel darkIcon;

        @C09CT("dark_right_icon")
        public ImageModel darkRightIcon;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("right_icon")
        public ImageModel rightIcon;

        @C09CT("type")
        public int type;

        @C09CT("schema")
        public String schema = "";

        @C09CT("dark_text_color")
        public String darkTextColor = "";

        @C09CT("tip_text")
        public String tipText = "";

        @C09CT("bg_color")
        public String bgColor = "";

        @C09CT("text_color")
        public String textColor = "";

        @C09CT("dark_bg_color")
        public String darkBgColor = "";
    }

    public static final class RankLeagueBase {

        @C09CT("if_show_promotion_effect")
        public boolean ifShowPromotionEffect;

        @C09CT("league_period")
        public long leaguePeriod;

        @C09CT("rank_type")
        public int rankType;

        @C09CT("show_league_phase")
        public int showLeaguePhase;

        @C09CT("show_league_phase_indicator")
        public int showLeaguePhaseIndicator;

        @C09CT("show_league_phase_status")
        public int showLeaguePhaseStatus;
    }

    public static final class RankLeagueExtra {

        @C09CT("brief_description")
        public BriefDescription briefDescription;

        @C09CT("path_to_daily")
        public PathToOtherList pathToDaily;

        @C09CT("rank_league_base")
        public RankLeagueBase rankLeagueBase;

        @C09CT("rank_league_header")
        public RankLeagueHeader rankLeagueHeader;

        @C09CT("rank_league_history_entrance")
        public HistoryEntrance rankLeagueHistoryEntrance;
    }

    public static final class RankLeagueHeader {

        @C09CT("league_tab_info")
        public LeagueTabInfo leagueTabInfo;
    }

    public static final class RankLeagueTab {

        @C09CT("brief_description")
        public Text briefDescription;

        @C09CT("league_phase")
        public int leaguePhase;

        @C09CT("rank_type")
        public int rankType;

        @C09CT("title_text")
        public Text titleText;
    }

    public static final class RankView {
        public long LIZ;
        public boolean LIZIZ;

        @C09CT("bulletin")
        public Bulletin bulletin;

        @C09CT("bulletin_loop")
        public BulletinLoop bulletinLoop;

        @C09CT("countdown")
        public long countdown;

        @C09CT("cut_off_line")
        public List<CutOffLine> cutOffLine;

        @C09CT("has_last_rank")
        public boolean history;

        @C09CT("midday_peak_time_stamp")
        public long middayPeakTimeStamp;

        @C09CT("next_period_time_stamp")
        public long nextPeriodTimeStamp;

        @C09CT("owner_rank")
        public RankInfo ownerRank;

        @C09CT("primary_tabs")
        public List<PrimaryRankTabInfo> primaryTabs;

        @C09CT("rank_extra_info")
        public RankExtraInfo rankExtraInfo;

        @C09CT("rank_type")
        public int rankType;

        @C09CT("ranks")
        public List<RankInfo> ranks;

        @C09CT("rule_url")
        public String ruleUrl;

        @C09CT("sub_tabs")
        public List<SubRankTabInfo> subTabs;

        @C09CT("title")
        public String title;

        @C09CT("view_status")
        public int viewStatus;

        @C09CT("weekly_region_info")
        public WeeklyRankRegionInfo weeklyRegionInfo;

        @C09CT("empty_rank_schema")
        public String emptyRankSchema = "";

        @C09CT("is_position_safe")
        public boolean isPositionSafe = true;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.title != null) {
                sb.append(", title=");
                sb.append(this.title);
            }
            if (this.ruleUrl != null) {
                sb.append(", rule_url=");
                sb.append(this.ruleUrl);
            }
            List<RankInfo> list = this.ranks;
            if (list != null && !list.isEmpty()) {
                sb.append(", ranks=");
                sb.append(this.ranks);
            }
            if (this.ownerRank != null) {
                sb.append(", owner_rank=");
                sb.append(this.ownerRank);
            }
            sb.append(", countdown=");
            sb.append(this.countdown);
            sb.append(", rank_type=");
            sb.append(this.rankType);
            if (this.bulletin != null) {
                sb.append(", bulletin=");
                sb.append(this.bulletin);
            }
            sb.replace(0, 2, "RankView{");
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class RestCardExtra {

        @C09CT("card_ids")
        public List<Long> cardIds;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class TeamExtra {

        @C09CT("team_rank_bonus_time")
        public TeamRankBonusTime teamRankBonusTime;
    }

    public static final class TeamRankExtra {

        @C09CT("club_name")
        public String clubName = "";

        @C09CT("community_image")
        public ImageModel communityImage;

        @C09CT("community_level")
        public long communityLevel;

        @C09CT("contributor_num")
        public long contributorNum;
    }

    public static final class TileExtra {

        @C09CT("pop_window_redeem_item")
        public TileRewardConfig popWindowRedeemItem;

        @C09CT("tiles_available")
        public long tilesAvailable;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class WeeklyRankExtra {

        @C09CT("curr_week_rank")
        public long currWeekRank;

        @C09CT("last_week_rank")
        public long lastWeekRank;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", curr_week_rank=");
            sb.append(this.currWeekRank);
            sb.append(", last_week_rank=");
            sb.append(this.lastWeekRank);
            sb.replace(0, 2, "WeeklyRankExtra{");
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class WeeklyRookieRankExtra {

        @C09CT("LastRankAnchorBeyondThresholdValue")
        public long LastRankAnchorBeyondThresholdValue;

        @C09CT("LastRankAnchorBeyondThreshold")
        public boolean lastrankanchorbeyondthreshold;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", LastRankAnchorBeyondThreshold=");
            sb.append(this.lastrankanchorbeyondthreshold);
            sb.replace(0, 2, "WeeklyRookieRankExtra{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "RankListV2Response{");
        sb.append('}');
        return sb.toString();
    }
}
