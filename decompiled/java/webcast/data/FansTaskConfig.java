package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FansTaskConfig {

    @C09CT("average_reward_config")
    public FansTaskAverageRewardConfig averageRewardConfig;

    @C09CT("duration_type")
    public int durationType;

    @C09CT("level_reward_config")
    public List<FansTaskLevelRewardConfig> levelRewardConfig = new ArrayList();

    @C09CT("reward_type")
    public int rewardType;
}
