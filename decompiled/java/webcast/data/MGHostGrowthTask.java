package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class MGHostGrowthTask {

    @C09CT("aggregation_duration")
    public int aggregationDuration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("req_user_acc_val")
    public long reqUserAccVal;

    @C09CT("required_threshold")
    public long requiredThreshold;

    @C09CT("task_phase")
    public long taskPhase;

    @C09CT("type")
    public int type;
}
