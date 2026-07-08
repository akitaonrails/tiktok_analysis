package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCPollUserListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("total_count")
        public long totalCount;

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;

        @C09CT("user_list")
        public List<User> userList = new ArrayList();
    }
}
