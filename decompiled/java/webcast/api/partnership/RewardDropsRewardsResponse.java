package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PartnershipDropsReward;
import com.bytedance.android.livesdk.game.model.PartnershipDropsRewardV1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class RewardDropsRewardsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("total")
        public long total;

        @C09CT("rewards")
        public List<PartnershipDropsReward> rewards = new ArrayList();

        @C09CT("drop_rewards")
        public List<PartnershipDropsRewardV1> dropRewards = new ArrayList();
    }
}
