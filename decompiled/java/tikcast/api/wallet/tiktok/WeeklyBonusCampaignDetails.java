package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class WeeklyBonusCampaignDetails {

    @C09CT("is_in_campaign")
    public boolean isInCampaign;

    @C09CT("campaign_reward_amount")
    public String campaignRewardAmount = "";

    @C09CT("campaign_added_percentage")
    public String campaignAddedPercentage = "";

    @C09CT("applied_weekly_passes")
    public List<WeeklyPassSelection> appliedWeeklyPasses = new ArrayList();
}
