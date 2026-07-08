package webcast.api.smb;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes4.dex */
public final class TriggerAIDMResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}
