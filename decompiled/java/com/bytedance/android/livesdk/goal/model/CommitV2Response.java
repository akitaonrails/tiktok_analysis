package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class CommitV2Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("extra_info")
        public ExtraInfo extraInfo;

        @C09CT("goals")
        public List<CommitV2Goal> goals;

        @C09CT("pin_results")
        public CommitPinResults pinResults;

        public static final class CommitV2Goal {

            @C09CT("commit_extra")
            public CommitGoalExtra commitExtra;

            @C09CT("goal")
            public LiveStreamGoal goal;
        }

        public static final class ExtraInfo {

            @C09CT("challenge_info")
            public ChallengeInfo challengeInfo;

            /* JADX INFO: loaded from: classes29.dex */
            public static final class ChallengeInfo {

                @C09CT("challenge_duration")
                public long challengeDuration;

                @C09CT("flare_cards_remaining")
                public long flareCardsRemaining;

                @C09CT("goals")
                public List<LiveStreamGoal> goals = new ArrayList();

                @C09CT("received_flare_card_award")
                public boolean receivedFlareCardAward;

                @C09CT("reward_duration")
                public long rewardDuration;
            }
        }
    }
}
