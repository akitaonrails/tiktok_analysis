package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetCampaignMainPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("campaign_status")
        public int campaignStatus;

        @C09CT("creators_ranking")
        public CreatorsRankingInfo creatorsRanking;

        @C09CT("header")
        public HeaderInfo header;

        @C09CT("share_panel")
        public SharePanel sharePanel;

        @C09CT("weekly_rewards")
        public WeeklyRewardsInfo weeklyRewards;

        @C09CT("weekly_task")
        public WeeklyTaskInfo weeklyTask;

        @C09CT("winner_popup")
        public WinnerPopupInfo winnerPopup;
    }
}
