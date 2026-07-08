package webcast.api.audience;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class WebcastIMRegistryResponse {

    @C09CT("data")
    public ResponseData data;

    /* JADX INFO: loaded from: classes25.dex */
    public static final class FilterInfoData {

        @C09CT("is_filtered")
        public boolean isFiltered;

        @C09CT("reason")
        public String reason = "";
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ResponseData {

        @C09CT("rooms")
        public List<RoomData> rooms = new ArrayList();

        @C09CT("user_rooms")
        public Map<String, Long> userRooms = new LinkedHashMap();
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class RoomData {

        @C09CT("alive")
        public boolean alive;

        @C09CT("filter_info")
        public FilterInfoData filterInfo;

        @C09CT("room_id")
        public long roomId;
    }
}
