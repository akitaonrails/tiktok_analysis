package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubActAnchorActInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("activity_finish_num")
        public long activityFinishNum;

        @C09CT("activity_have_finished")
        public boolean activityHaveFinished;

        @C09CT("anchor_can_claim")
        public boolean anchorCanClaim;

        @C09CT("anchor_claim_num")
        public long anchorClaimNum;

        @C09CT("anchor_have_claimed")
        public boolean anchorHaveClaimed;

        @C09CT("audience_can_claim")
        public boolean audienceCanClaim;

        @C09CT("audience_have_claimed")
        public boolean audienceHaveClaimed;

        @C09CT("can_subscribe")
        public boolean canSubscribe;

        @C09CT("claim_num")
        public long claimNum;

        @C09CT("expired")
        public boolean expired;

        @C09CT("in_activity")
        public boolean inActivity;

        @C09CT("reward_claimed_num")
        public long rewardClaimedNum;

        @C09CT("reward_unclaimed_num")
        public long rewardUnclaimedNum;

        @C09CT("subscribe_audience_num")
        public long subscribeAudienceNum;

        @C09CT("anchor_id")
        public String anchorId = "";

        @C09CT("anchor_avatar")
        public String anchorAvatar = "";

        @C09CT("anchor_name")
        public String anchorName = "";
    }
}
