package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeStampStore {

    @C09CT("recorders")
    public final List<TimeStampRecorder> recorders;

    public TimeStampStore() {
        this(null, 1, null);
    }

    public TimeStampStore(List<TimeStampRecorder> list) {
        this.recorders = list;
    }

    public TimeStampStore(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
