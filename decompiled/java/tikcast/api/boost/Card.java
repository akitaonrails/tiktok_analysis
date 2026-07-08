package tikcast.api.boost;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes30.dex */
public final class Card {

    @C09CT("create_time")
    public long createTime;

    @C09CT("effective_duration")
    public long effectiveDuration;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("goal")
    public long goal;

    @C09CT("goal_tier")
    public int goalTier;

    @C09CT("list_shown")
    public boolean listShown;

    @C09CT("task_source")
    public int taskSource;

    @C09CT("tier")
    public int tier;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("task_id")
    public String taskId = "";
}
