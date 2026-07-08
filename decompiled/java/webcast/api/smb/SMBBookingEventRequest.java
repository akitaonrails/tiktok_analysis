package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SMBBookingEventRequest {

    @C09CT("room_id")
    public long roomId;

    @C09CT("sku_id")
    public long skuId;

    @C09CT("event_id")
    public String eventId = "";

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";
}
