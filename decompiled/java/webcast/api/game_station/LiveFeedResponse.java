package webcast.api.game_station;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveFeedResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("room_list")
        public List<Room> roomList = new ArrayList();
    }
}
