package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class CommunityGiftInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("gift_id")
    public String giftId = "";

    @C09CT("image")
    public String image = "";

    @C09CT("gift_name")
    public String giftName = "";
}
