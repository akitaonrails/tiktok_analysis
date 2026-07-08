package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeStampRecorder {

    @C09CT("group")
    public final String group;

    @C09CT("records")
    public final List<Long> records;

    @C09CT("window")
    public final int window;

    public TimeStampRecorder() {
        this(0, null, null, 7, null);
    }

    public TimeStampRecorder(int i, List<Long> list, String str) {
        this.window = i;
        this.records = list;
        this.group = str;
    }

    public TimeStampRecorder(int i, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? null : str);
    }
}
