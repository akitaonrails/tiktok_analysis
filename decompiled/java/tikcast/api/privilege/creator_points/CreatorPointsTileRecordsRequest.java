package tikcast.api.privilege.creator_points;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class CreatorPointsTileRecordsRequest {

    @C09CT("bill_type")
    public int billType;

    @C09CT("get_first_batch")
    public boolean getFirstBatch;

    @C09CT("last_bill_update_time")
    public long lastBillUpdateTime;

    @C09CT("record_count")
    public long recordCount;

    @C09CT("bill_id")
    public String billId = "";

    @C09CT("last_redeemed_record_id")
    public String lastRedeemedRecordId = "";
}
