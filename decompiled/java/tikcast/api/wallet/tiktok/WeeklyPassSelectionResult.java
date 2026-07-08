package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class WeeklyPassSelectionResult {

    @C09CT("all_missions_completed")
    public boolean allMissionsCompleted;

    @C09CT("num_pass_used")
    public long numPassUsed;

    @C09CT("available_weekly_passes")
    public List<WeeklyPass> availableWeeklyPasses = new ArrayList();

    @C09CT("applied_weekly_passes")
    public List<WeeklyPassSelection> appliedWeeklyPasses = new ArrayList();

    @C09CT("reward_factors")
    public List<RewardFactorItem> rewardFactors = new ArrayList();
}
