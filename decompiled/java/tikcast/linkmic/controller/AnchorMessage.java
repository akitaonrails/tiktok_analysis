package tikcast.linkmic.controller;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorMessage {

    @C09CT("link_mic_id")
    public String linkMicId = "";

    @C09CT("rtc_status")
    public int rtcStatus;

    @C09CT("source")
    public int source;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("uid")
    public long uid;
}
