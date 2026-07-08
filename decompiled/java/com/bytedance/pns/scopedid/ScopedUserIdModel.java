package com.bytedance.pns.scopedid;

import X.C09CT;
import X.C830410Whr;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class ScopedUserIdModel {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("scoped_biz_id")
    public final List<String> scopedBizIds;

    public ScopedUserIdModel() {
        this(false, null, 3, null);
    }

    public ScopedUserIdModel(boolean z, List<String> list) {
        this.enabled = z;
        this.scopedBizIds = list;
    }

    public ScopedUserIdModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C830410Whr.LIZ() : z, (i & 2) != 0 ? Collections.singletonList("slardar") : list);
    }
}
