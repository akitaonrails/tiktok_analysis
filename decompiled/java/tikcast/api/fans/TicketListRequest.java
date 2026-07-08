package tikcast.api.fans;

import X.C09CT;
import webcast.fans_platform.Namespace;

/* JADX INFO: loaded from: classes.dex */
public final class TicketListRequest {

    @C09CT("namespace")
    public Namespace namespace;

    @C09CT("page_size")
    public int pageSize;

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("page_token")
    public String pageToken = "";
}
