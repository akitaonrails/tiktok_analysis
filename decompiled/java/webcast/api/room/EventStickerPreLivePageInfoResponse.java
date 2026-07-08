package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;

/* JADX INFO: loaded from: classes18.dex */
public final class EventStickerPreLivePageInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("roomEventMessageInfo")
        public RoomEventMessage roomeventmessageinfo;
    }
}
