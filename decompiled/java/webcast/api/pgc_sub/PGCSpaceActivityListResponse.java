package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSpaceActivityListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("activity_list")
        public List<SpaceActivityInfo> activityList = new ArrayList();

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
