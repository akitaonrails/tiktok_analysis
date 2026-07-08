package com.ss.android.ugc.aweme.outreach.dispersion.save;

import X.C09CT;
import X.C13LP;
import X.C261890AOd;
import X.C823050WQl;
import Y.ARunnableS64S0300000_31;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class OutreachRecordConfig {

    @C09CT("outreachRecordList")
    public volatile List<OutreachRecordData> _outreachRecordList;

    private final synchronized void upgradeToThreadSafe() {
        if (this._outreachRecordList instanceof CopyOnWriteArrayList) {
            return;
        }
        this._outreachRecordList = new CopyOnWriteArrayList(C13LP.LJJJJLI(this._outreachRecordList));
    }

    public final List<OutreachRecordData> getOutreachRecordList() {
        if (((Boolean) C261890AOd.LIZ.getValue()).booleanValue() && !(this._outreachRecordList instanceof CopyOnWriteArrayList)) {
            upgradeToThreadSafe();
        }
        return this._outreachRecordList;
    }

    public OutreachRecordConfig() {
        this._outreachRecordList = new ArrayList();
    }

    public OutreachRecordConfig(List<OutreachRecordData> list) {
        this();
        this._outreachRecordList = list;
    }

    public final void addRecord(OutreachRecordData outreachRecordData) {
        List<OutreachRecordData> outreachRecordList = getOutreachRecordList();
        ListProtector.add(outreachRecordList, 0, outreachRecordData);
        C823050WQl.LJFF().submit(new ARunnableS64S0300000_31(this, outreachRecordData, outreachRecordList, 5));
    }
}
