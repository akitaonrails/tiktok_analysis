package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class EventStickerConfigReq {

    @C09CT("event_id")
    public long eventId;

    @C09CT("opt_type")
    public int optType;

    @C09CT("own_user_id")
    public long ownUserId;

    @C09CT("pos_x")
    public String posX = "";

    @C09CT("pos_y")
    public String posY = "";

    @C09CT("room_id")
    public long roomId;
}
