package webcast.api.room;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes18.dex */
public final class FirstScreenResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("room")
        public Room room;

        @C09CT("room_msg")
        public RoomMessage roomMsg;

        @C09CT("user")
        public User user;
    }
}
