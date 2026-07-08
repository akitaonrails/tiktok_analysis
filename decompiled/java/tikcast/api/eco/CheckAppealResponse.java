package tikcast.api.eco;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckAppealResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("check_status")
        public int checkStatus;

        @C09CT("live")
        public String live = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public boolean status;
    }
}
