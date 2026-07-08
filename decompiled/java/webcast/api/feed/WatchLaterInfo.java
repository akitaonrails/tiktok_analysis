package webcast.api.feed;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WatchLaterInfo {

    @C09CT("anchor_list")
    public List<User> anchorList = new ArrayList();

    @C09CT("latest_room")
    public Room latestRoom;
}
