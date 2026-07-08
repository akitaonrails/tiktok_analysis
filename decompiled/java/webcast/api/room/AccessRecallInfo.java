package webcast.api.room;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AccessRecallInfo {

    @C09CT("access_type")
    public int accessType;

    @C09CT("duration")
    public long duration;

    @C09CT("end_timestamp")
    public long endTimestamp;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;
}
