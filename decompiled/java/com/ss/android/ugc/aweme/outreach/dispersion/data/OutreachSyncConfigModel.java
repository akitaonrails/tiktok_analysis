package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachSyncConfigModel implements Serializable {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("min_interval")
    public final int minInterval;

    @C09CT("retry_times")
    public final int retryTimes;

    @C09CT("sync_hours")
    public final int syncHours;

    @C09CT("sync_outreach_keys")
    public final List<SyncOutreachEntry> syncOutreachKeys;

    public OutreachSyncConfigModel() {
        this(false, 2, 1, 72, null);
    }

    public OutreachSyncConfigModel(boolean z, int i, int i2, int i3, List<SyncOutreachEntry> list) {
        this.enable = z;
        this.minInterval = i;
        this.retryTimes = i2;
        this.syncHours = i3;
        this.syncOutreachKeys = list;
    }
}
