package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AnchorTaskRewardInfo;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorExpireAndNoReceiveRewardTask {

    @C09CT("reward_info")
    public AnchorTaskRewardInfo rewardInfo;

    @C09CT("task_ids")
    public List<Long> taskIds = new ArrayList();

    @C09CT("task_target_desc")
    public List<String> taskTargetDesc = new ArrayList();
}
