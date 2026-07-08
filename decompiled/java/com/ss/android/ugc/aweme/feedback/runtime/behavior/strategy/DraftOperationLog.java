package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class DraftOperationLog {
    public static final int $stable = 8;

    @C09CT("count")
    public final int count;

    @C09CT("e_code")
    public final List<DraftOperationCode> errorCode;

    @C09CT("name")
    public final String name;

    @C09CT("success_count")
    public final int successCount;

    public DraftOperationLog() {
        this(null, 0, null, 0, 15, null);
    }

    public DraftOperationLog(String str, int i, List<DraftOperationCode> list, int i2) {
        this.name = str;
        this.count = i;
        this.errorCode = list;
        this.successCount = i2;
    }

    public DraftOperationLog(String str, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
