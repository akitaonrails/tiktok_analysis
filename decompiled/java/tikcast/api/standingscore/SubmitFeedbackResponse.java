package tikcast.api.standingscore;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class SubmitFeedbackResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public long status;
    }
}
