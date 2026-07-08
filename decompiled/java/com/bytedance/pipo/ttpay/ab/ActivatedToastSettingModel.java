package com.bytedance.pipo.ttpay.ab;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class ActivatedToastSettingModel {

    @C09CT("delay_time_ms")
    public final long delayTimeMs;

    @C09CT("entrances")
    public final List<String> entrances;

    public ActivatedToastSettingModel() {
        this(null, 0L, 3, null);
    }

    public ActivatedToastSettingModel(List<String> list, long j) {
        this.entrances = list;
        this.delayTimeMs = j;
    }

    public ActivatedToastSettingModel(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Collections.singletonList("portal_balance_card") : list, (i & 2) != 0 ? 150L : j);
    }
}
