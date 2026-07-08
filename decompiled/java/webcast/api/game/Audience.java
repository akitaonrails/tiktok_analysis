package webcast.api.game;

import X.C09CT;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* JADX INFO: loaded from: classes.dex */
public final class Audience {

    @C09CT("badge")
    public BadgeStruct badge;

    @C09CT("have_claimed")
    public boolean haveClaimed;

    @C09CT("sub_time")
    public long subTime;

    @C09CT("user_id")
    public String userId = "";

    @C09CT("user_name")
    public String userName = "";

    @C09CT("user_avatar")
    public String userAvatar = "";
}
