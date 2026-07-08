package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class SubUnPinRequest {

    @C09CT("pin_source")
    public int pinSource;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("type")
    public int type;

    @C09CT("unpin_id")
    public long unpinId;
}
