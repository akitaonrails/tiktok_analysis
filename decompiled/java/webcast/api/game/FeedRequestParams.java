package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedRequestParams {

    @C09CT("debug")
    public boolean debug;

    @C09CT("draw_author_id")
    public long drawAuthorId;

    @C09CT("draw_room_id")
    public long drawRoomId;

    @C09CT("draw_room_owner_id")
    public long drawRoomOwnerId;

    @C09CT("draw_video_id")
    public long drawVideoId;

    @C09CT("insert_awemes")
    public InsertAwemeStruct insertAwemes;

    @C09CT("is_non_personalized")
    public long isNonPersonalized;

    @C09CT("req_from")
    public String reqFrom = "";

    @C09CT("related_live_tag")
    public String relatedLiveTag = "";

    @C09CT("enter_source")
    public String enterSource = "";
}
