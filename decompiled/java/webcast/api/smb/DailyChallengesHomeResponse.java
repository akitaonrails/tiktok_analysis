package webcast.api.smb;

import X.C09CT;
import webcast.data.DailyChallenges;
import webcast.data.SMBReward;

/* JADX INFO: loaded from: classes18.dex */
public final class DailyChallengesHomeResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("can_claim_all")
        public boolean canClaimAll;

        @C09CT("daily_challenges")
        public DailyChallenges dailyChallenges;

        @C09CT("in_season")
        public boolean inSeason;

        @C09CT("is_eligible")
        public boolean isEligible;

        @C09CT("latest_unclaimed_reward")
        public SMBReward latestUnclaimedReward;

        @C09CT("onboarding_completed")
        public boolean onboardingCompleted;

        @C09CT("season_end")
        public long seasonEnd;

        @C09CT("unclaimed_rewards_total_count")
        public long unclaimedRewardsTotalCount;

        @C09CT("unclaimed_rewards_total_value")
        public long unclaimedRewardsTotalValue;

        @C09CT("unclaimed_rewards_total_value_local")
        public long unclaimedRewardsTotalValueLocal;

        @C09CT("viewer_boost")
        public long viewerBoost;

        @C09CT("viewer_boost_abbreviated")
        public String viewerBoostAbbreviated = "";

        @C09CT("unclaimed_rewards_total_value_local_formatted")
        public String unclaimedRewardsTotalValueLocalFormatted = "";
    }
}
