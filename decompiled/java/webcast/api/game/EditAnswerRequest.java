package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EditAnswerRequest {

    @C09CT("is_admin")
    public boolean isAdmin;

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("round_id_str")
    public String roundIdStr = "";

    @C09CT("option_idx")
    public String optionIdx = "";
}
