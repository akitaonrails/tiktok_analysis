package com.tiktok.ef.absettings.impl.api;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class ABTestRequestBody {

    @C09CT("group_num")
    public final int groupNum;

    @C09CT("value_group_hash")
    public final List<String> valueGroupHash;

    public ABTestRequestBody() {
        this(0, null, 3, null);
    }

    public ABTestRequestBody(int i, List<String> list) {
        this.groupNum = i;
        this.valueGroupHash = list;
    }

    public ABTestRequestBody(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 256 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
