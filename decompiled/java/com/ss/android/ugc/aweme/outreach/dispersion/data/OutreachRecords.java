package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecords implements Serializable {

    @C09CT("list")
    public final List<SyncOutreachModel> addList;

    public OutreachRecords(List<SyncOutreachModel> list) {
        this.addList = list;
    }
}
