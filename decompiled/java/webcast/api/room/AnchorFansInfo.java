package webcast.api.room;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorFansInfo {

    @C09CT("avatar_type")
    public long avatarType;

    @C09CT("living_friend_count")
    public long livingFriendCount;

    @C09CT("no_online_fans_count_reason")
    public long noOnlineFansCountReason;

    @C09CT("online_fans_count")
    public long onlineFansCount;

    @C09CT("online_friend_count")
    public long onlineFriendCount;

    @C09CT("avatars")
    public List<ImageModel> avatars = new ArrayList();

    @C09CT("avatar_pick_reason")
    public List<Long> avatarPickReason = new ArrayList();
}
