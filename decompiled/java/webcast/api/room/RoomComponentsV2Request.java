package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class RoomComponentsV2Request {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("need_components")
    public long needComponents;

    @C09CT("need_online_audience")
    public long needOnlineAudience;

    @C09CT("need_rankings")
    public long needRankings;

    @C09CT("need_room_pcu")
    public long needRoomPcu;

    @C09CT("room_id")
    public long roomId;

    @C09CT("room_tag")
    public String roomTag = "";

    @C09CT("source")
    public long source;
}
