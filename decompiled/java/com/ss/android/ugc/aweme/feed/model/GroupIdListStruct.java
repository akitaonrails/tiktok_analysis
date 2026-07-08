package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GroupIdListStruct implements Serializable {

    @C09CT("GroupdIdList0")
    public List<Long> groupIdList0;

    @C09CT("GroupdIdList1")
    public List<Long> groupIdList1;

    public GroupIdListStruct() {
        this(null, null);
    }

    public final boolean isEmpty0() {
        List<Long> list = this.groupIdList0;
        return list == null || list.isEmpty();
    }

    public final boolean isEmpty1() {
        List<Long> list = this.groupIdList1;
        return list == null || list.isEmpty();
    }

    public GroupIdListStruct(List<Long> list, List<Long> list2) {
        this.groupIdList0 = list;
        this.groupIdList1 = list2;
    }
}
