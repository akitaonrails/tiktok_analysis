package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RemoveEmoteRequest {

    @C09CT("emote_ids")
    public List<Long> emoteIds = new ArrayList();

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("emote_ids_str")
    public List<String> emoteIdsStr = new ArrayList();
}
