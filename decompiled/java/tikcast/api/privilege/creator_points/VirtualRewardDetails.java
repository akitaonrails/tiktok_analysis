package tikcast.api.privilege.creator_points;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VirtualRewardDetails {

    @C09CT("available_rewards")
    public List<OwnedRewardInstance> availableRewards = new ArrayList();

    @C09CT("not_available_rewards")
    public List<OwnedRewardInstance> notAvailableRewards = new ArrayList();
}
