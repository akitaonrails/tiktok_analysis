package webcast.api.feed;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes.dex */
public final class FeedUserItem {

    @C09CT("data")
    public Room data;

    @C09CT("owner")
    public User owner;

    @C09CT("watch_days")
    public long watchDays;
}
