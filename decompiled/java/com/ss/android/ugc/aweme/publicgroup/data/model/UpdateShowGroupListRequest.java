package com.ss.android.ugc.aweme.publicgroup.data.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateShowGroupListRequest {

    @C09CT("conversation_short_ids")
    public final List<Long> arrangedGroupList;

    public UpdateShowGroupListRequest() {
        this(null, 1, null);
    }

    public UpdateShowGroupListRequest(List<Long> list) {
        this.arrangedGroupList = list;
    }

    public UpdateShowGroupListRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
