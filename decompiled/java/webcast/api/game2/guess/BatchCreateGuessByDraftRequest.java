package webcast.api.game2.guess;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BatchCreateGuessByDraftRequest {

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("draft_ids")
    public List<String> draftIds = new ArrayList();
}
