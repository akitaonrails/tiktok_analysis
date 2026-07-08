package webcast.api.partnership;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorToggleInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("event_count")
        public int eventCount;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("task_count")
        public int taskCount;
    }
}
