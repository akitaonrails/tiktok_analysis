package webcast.api.smb;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class GetSMBCourseOrderStatusResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("notify_time")
        public long notifyTime;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}
