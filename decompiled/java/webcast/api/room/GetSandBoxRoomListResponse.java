package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetSandBoxRoomListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("sand_box_rooms")
        public List<SandBoxRoom> sandBoxRooms = new ArrayList();
    }

    public static final class SandBoxRoom {

        @C09CT("live_room_type")
        public int liveRoomType;

        @C09CT("room_id")
        public long roomId;

        @C09CT("user_id")
        public long userId;

        @C09CT("user_name")
        public String userName = "";

        @C09CT("image_model")
        public String imageModel = "";

        @C09CT("title")
        public String title = "";
    }
}
