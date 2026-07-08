package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessTemplateRequest {

    @C09CT("count")
    public long count;

    @C09CT("offset")
    public long offset;

    @C09CT("game_type_name")
    public String gameTypeName = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";
}
