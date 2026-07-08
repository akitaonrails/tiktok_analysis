package tikcast.api.fans;

import X.C09CT;
import webcast.fans_platform.TicketUpdateOp;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateTicketRequest {

    @C09CT("bpm_id")
    public long bpmId;

    @C09CT("op")
    public TicketUpdateOp op;

    @C09CT("primary_id")
    public long primaryId;

    @C09CT("ticket_type")
    public int ticketType;

    @C09CT("ticket_id")
    public String ticketId = "";

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("primary_id_str")
    public String primaryIdStr = "";
}
