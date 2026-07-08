package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AdminOperationRecordCommonInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("operation_time")
    public long operationTime;

    @C09CT("operation_type")
    public int operationType;

    @C09CT("operator")
    public User operator;

    @C09CT("target_user")
    public User targetUser;
}
