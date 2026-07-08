package tikcast.api.anchor_data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RealtimeViolationRecord;

/* JADX INFO: loaded from: classes34.dex */
public final class RealtimeLiveCenterViolationRecordInfo {

    @C09CT("keep_showing_time")
    public long keepShowingTime;

    @C09CT("violation_records")
    public List<RealtimeViolationRecord> violationRecords = new ArrayList();
}
