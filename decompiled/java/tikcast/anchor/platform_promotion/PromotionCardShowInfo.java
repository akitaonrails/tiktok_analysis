package tikcast.anchor.platform_promotion;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionCardShowInfo {

    @C09CT("effective")
    public boolean effective;

    @C09CT("end_time")
    public long endTime;

    @C09CT("priority")
    public int priority;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("style")
    public int style;

    @C09CT("type")
    public int type;

    @C09CT("weight")
    public int weight;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("name")
    public String name = "";

    @C09CT("creator_email")
    public String creatorEmail = "";
}
