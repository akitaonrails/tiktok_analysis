package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class EcSearchMiddleHistoryRequestConfigModel {

    @C09CT("enable")
    public final int enable;

    @C09CT("request_keys")
    public final List<String> requestKeys;

    public EcSearchMiddleHistoryRequestConfigModel() {
        this(0, null, 3, null);
    }

    public EcSearchMiddleHistoryRequestConfigModel(int i, List<String> list) {
        this.enable = i;
        this.requestKeys = list;
    }

    public EcSearchMiddleHistoryRequestConfigModel(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
