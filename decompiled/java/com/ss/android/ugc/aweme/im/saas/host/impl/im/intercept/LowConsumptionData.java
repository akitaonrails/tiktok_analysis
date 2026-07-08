package com.ss.android.ugc.aweme.im.saas.host.impl.im.intercept;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class LowConsumptionData {

    @C09CT("click_timestamps")
    public List<Long> clickTimestamps;

    @C09CT("hit_low_consumption")
    public long hitLowConsumptionTimestamp;

    @C09CT("low_consumption_strategy_version")
    public long lowConsumptionStrategyVersion;

    @C09CT("show_timestamps")
    public List<Long> showTimestamps;

    public LowConsumptionData() {
        this(null, null, 0L, 0L, 15, null);
    }

    public LowConsumptionData(List<Long> list, List<Long> list2, long j, long j2) {
        this.showTimestamps = list;
        this.clickTimestamps = list2;
        this.hitLowConsumptionTimestamp = j;
        this.lowConsumptionStrategyVersion = j2;
    }

    public static LowConsumptionData LIZ(LowConsumptionData lowConsumptionData, List list, List list2, int i) {
        long j;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = lowConsumptionData.showTimestamps;
        }
        if ((i & 2) != 0) {
            list3 = lowConsumptionData.clickTimestamps;
        }
        long j2 = 0;
        if ((i & 4) != 0) {
            j = lowConsumptionData.hitLowConsumptionTimestamp;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            j2 = lowConsumptionData.lowConsumptionStrategyVersion;
        }
        return new LowConsumptionData(list4, list3, j, j2);
    }

    public LowConsumptionData(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? 0L : j, (i & 8) == 0 ? j2 : 0L);
    }
}
