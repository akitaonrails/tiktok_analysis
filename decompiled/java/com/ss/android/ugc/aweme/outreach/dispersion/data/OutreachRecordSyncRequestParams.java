package com.ss.android.ugc.aweme.outreach.dispersion.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecordSyncRequestParams implements Serializable {

    /* JADX INFO: renamed from: did, reason: collision with root package name */
    @C09CT("did")
    public final String f389did;

    @C09CT("records")
    public final OutreachRecords records;

    @C09CT("snapshot")
    public final OutreachRecordSnapshot snapshot;

    @C09CT("type")
    public final Integer type;

    public OutreachRecordSyncRequestParams(String str, Integer num, OutreachRecords outreachRecords, OutreachRecordSnapshot outreachRecordSnapshot) {
        this.f389did = str;
        this.type = num;
        this.records = outreachRecords;
        this.snapshot = outreachRecordSnapshot;
    }
}
