package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGrowLevelLevelInfo {

    @C09CT("is_special")
    public boolean isSpecial;

    @C09CT("level")
    public long level;

    @C09CT("desc")
    public String desc = "";

    @C09CT("reward_list")
    public List<AnchorGrowRewardInfo> rewardList = new ArrayList();
}
