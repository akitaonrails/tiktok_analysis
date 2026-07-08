package webcast.api.audience;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class WatchLaterHistoryResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("recently_missed")
        public List<Item> recentlyMissed = new ArrayList();

        @C09CT("recently_watched")
        public List<Item> recentlyWatched = new ArrayList();
    }

    public static final class Item {

        @C09CT("anchor")
        public User anchor;

        @C09CT("last_room_finish_time")
        public long lastRoomFinishTime;

        @C09CT("living_room")
        public Room livingRoom;

        @C09CT("upcoming_live_event")
        public LiveEventInfo upcomingLiveEvent;
    }
}
