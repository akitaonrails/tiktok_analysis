package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicExtraInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RivalsListsData {

    @C09CT("auto_match_banner")
    public AutoMatchBanner autoMatchBanner;

    @C09CT("auto_match_info")
    public BannerText bannerText;

    @C09CT("battle_opt_pair_list")
    public List<BattleOptPair> battleOptPairList;

    @C09CT("best_teammate_list")
    public List<Room> bestTeammateList;

    @C09CT("cohost_panel_banner")
    public CohostPanelBanner cohostPanelBanner;

    @C09CT("dynamic_list_config")
    public DynamicListConfig dynamicListConfig;

    @C09CT("eoy_banner")
    public EOYBanner eoyBanner;

    @C09CT("eoy_rank_list")
    public List<Room> eoyRankList;

    @C09CT("followed_list")
    public List<Room> followedList;

    @C09CT("friend_search_list")
    public List<Room> friendSearchList;

    @C09CT("game_list")
    public List<Room> gameList;

    @C09CT("guide_popup_banner")
    public GuidePopupBanner guidePopupBanner;

    @C09CT("league_recommend_list")
    public List<Room> leagueRecommendList;

    @C09CT("may_know_list")
    public List<Room> mayKnowList;

    @C09CT("mixed_list")
    public List<Room> mixedList;

    @C09CT("offlive_invitation_info")
    public OffliveInvitationInfo offliveInvitationInfo;

    @C09CT("recent_list")
    public List<Room> recentList;

    @C09CT("recommend_list")
    public List<Room> recommendList;

    @C09CT("reserved_list")
    public List<Room> reservedList;

    @C09CT("rival_extra_infos")
    public Map<Long, RivalExtraInfo> rivalExtraInfos;

    @C09CT("room_top_host_info")
    public Map<Long, TopHostInfo> roomTopHostInfo;

    @C09CT("search_bar")
    public SearchBar searchBar;

    @C09CT("status_text_type")
    public int statusTextType;

    @C09CT("tips")
    public String tips;

    @C09CT("topic_banner")
    public CohostTopic topicBanner;

    @C09CT("topic_extra_info")
    public TopicExtraInfo topicExtraInfo;

    @C09CT("viewer_suggestion_list")
    public List<Room> viewerSuggestionList;

    @C09CT("refresh_session_id")
    public String refreshSessionId = "";

    @C09CT("status_text")
    public String statusText = "";

    public static class BannerText {

        @C09CT("banner_style")
        public int bannerStyle;

        @C09CT("button")
        public String buttonText;

        @C09CT("in_ui_exp")
        public boolean isInUiExp;

        @C09CT("match_valid")
        public boolean isMatchValid;

        @C09CT("quick_cohost_content_info")
        public QuickCohostContentInfo quickCohostContentInfo;

        @C09CT("subtitle")
        public String subTitle;

        @C09CT("title")
        public String title;
    }

    public static final class OffliveInvitationBanner {

        @C09CT("description")
        public Text description;

        @C09CT("icon")
        public ImageModel icon;

        @C09CT("title")
        public Text title;
    }

    public static final class OffliveInvitationInfo {

        @C09CT("enable_offlive_invite")
        public boolean enableOffliveInvite;

        @C09CT("offlive_invitation_banner")
        public OffliveInvitationBanner offliveInvitationBanner;
    }

    public static class TopHostInfo {
        public static final TopHostInfo LIZ = new TopHostInfo();

        @C09CT("rank_type")
        public String rankType = "";

        @C09CT("top_index")
        public long topIndex;
    }

    public static boolean isBannerTextValid(BannerText bannerText) {
        if (bannerText != null && !TextUtils.isEmpty(bannerText.title) && !TextUtils.isEmpty(bannerText.subTitle) && !TextUtils.isEmpty(bannerText.buttonText)) {
            return true;
        }
        return false;
    }

    public boolean isInTopHost(long j) {
        TopHostInfo topHostInfo;
        Map<Long, TopHostInfo> map = this.roomTopHostInfo;
        if (map == null || map.size() == 0 || !this.roomTopHostInfo.containsKey(Long.valueOf(j)) || (topHostInfo = this.roomTopHostInfo.get(Long.valueOf(j))) == null || topHostInfo.topIndex <= 0) {
            return false;
        }
        return true;
    }
}
