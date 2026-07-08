package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberMsg {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("badge")
    public BadgeStruct badge;

    @C09CT("is_watching_live")
    public boolean isWatchingLive;

    @C09CT("send_subs")
    public long sendSubs;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("user_id")
    public long userId;

    @C09CT("nick_name")
    public String nickName = "";

    @C09CT("status_txt")
    public String statusTxt = "";

    @C09CT("subscribe_time_txt")
    public String subscribeTimeTxt = "";
}
