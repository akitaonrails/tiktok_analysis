package com.ss.android.ugc.aweme.live.skylight.tooltip;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ToolTipShowRecordModel {

    @C09CT("cur_client_ts")
    public long curClientTimeStamps;

    @C09CT("show_record")
    public final ShowRecordsModel showRecords;

    public ToolTipShowRecordModel() {
        this(new ShowRecordsModel(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()), 0L);
    }

    public ToolTipShowRecordModel(ShowRecordsModel showRecordsModel, long j) {
        this.showRecords = showRecordsModel;
        this.curClientTimeStamps = j;
    }
}
