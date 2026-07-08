package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecordResultModel implements Serializable {

    @C09CT("full_sync")
    public final boolean fullSync;

    public OutreachRecordResultModel() {
        this(false);
    }

    public OutreachRecordResultModel(boolean z) {
        this.fullSync = z;
    }
}
