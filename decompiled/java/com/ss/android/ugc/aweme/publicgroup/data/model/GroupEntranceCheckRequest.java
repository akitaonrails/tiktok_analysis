package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.EnumC1219960hqs;
import X.EnumC1228990i5R;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupEntranceCheckRequest {

    @C09CT("query_params")
    public final List<GroupCompositeType> queryParams;

    public GroupEntranceCheckRequest() {
        this(null, 1, null);
    }

    public GroupEntranceCheckRequest(List<GroupCompositeType> list) {
        this.queryParams = list;
    }

    public GroupEntranceCheckRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.singletonList(new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), "", EnumC1219960hqs.UNKNOWN.getValue())) : list);
    }
}
