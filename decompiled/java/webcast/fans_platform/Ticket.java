package webcast.fans_platform;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ticket {

    @C09CT("created_at_ms")
    public long createdAtMs;

    @C09CT("release_plan")
    public ReleasePlan releasePlan;

    @C09CT("snapshot")
    public TicketSnapshot snapshot;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("ticket_type")
    public int ticketType;

    @C09CT("updated_at_ms")
    public long updatedAtMs;

    @C09CT("ticket_id")
    public String ticketId = "";

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("bpm_id")
    public String bpmId = "";

    @C09CT("creator")
    public String creator = "";

    @C09CT("change_desc")
    public String changeDesc = "";

    @C09CT("idempotency_key")
    public String idempotencyKey = "";

    @C09CT("events")
    public List<TicketEvent> events = new ArrayList();
}
