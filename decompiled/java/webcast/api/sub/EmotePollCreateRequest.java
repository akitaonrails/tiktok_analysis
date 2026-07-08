package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollCreateRequest {

    @C09CT("duration_ms")
    public long durationMs;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("user_emote_ids")
    public List<Long> userEmoteIds = new ArrayList();
}
