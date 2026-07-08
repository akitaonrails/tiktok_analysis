package tikcast.api.eco;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class GetViolationListRequest {

    @C09CT("last_id")
    public String lastId = "";

    @C09CT("max_create_timestamp")
    public long maxCreateTimestamp;

    @C09CT("min_create_timestamp")
    public long minCreateTimestamp;

    @C09CT("room_id")
    public long roomId;

    @C09CT("violation_list_type")
    public int violationListType;
}
