package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CreateGuessRequest {

    @C09CT("bet_duration_in_second")
    public long betDurationInSecond;

    @C09CT("is_admin")
    public boolean isAdmin;

    @C09CT("is_auto_pin")
    public boolean isAutoPin;

    @C09CT("template_id")
    public long templateId;

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("msg_id_str")
    public String msgIdStr = "";

    @C09CT("entrance")
    public String entrance = "";
}
