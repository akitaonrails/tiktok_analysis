package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SubQueuePanelRequest {

    @C09CT("offset")
    public long offset;

    @C09CT("read_raw")
    public boolean readRaw;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("queue_id")
    public String queueId = "";
}
