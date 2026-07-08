package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class SMBBookingEventStatusUpdateRequest {

    @C09CT("dm_status")
    public int dmStatus;

    @C09CT("event_status")
    public int eventStatus;

    @C09CT("event_id")
    public String eventId = "";

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";
}
