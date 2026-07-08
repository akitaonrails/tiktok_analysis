package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class InputAnswerRequest {

    @C09CT("is_admin")
    public boolean isAdmin;

    @C09CT("settle_immediately")
    public boolean settleImmediately;

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("round_id_str")
    public String roundIdStr = "";

    @C09CT("option_idx")
    public String optionIdx = "";

    @C09CT("show_entrance")
    public String showEntrance = "";
}
