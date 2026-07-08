package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowLevelRewardRecordItem {

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("has_next_level")
    public boolean hasNextLevel;

    @C09CT("level")
    public long level;

    @C09CT("receive_time")
    public long receiveTime;

    @C09CT("reward_list")
    public List<AnchorGrowRewardInfo> rewardList = new ArrayList();
}
