package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class BulletinBoardInfo {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("subscribe_count")
    public long subscribeCount;

    @C09CT("name")
    public String name = "";

    @C09CT("avatar_show_url")
    public String avatarShowUrl = "";
}
