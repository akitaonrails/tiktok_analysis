package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class MonitorItem implements Serializable {

    @C09CT("location")
    public final List<String> location;

    @C09CT("max_length")
    public final int maxLength;

    @C09CT("remove_bcm_keys")
    public final List<String> removeBcmKeys;

    @C09CT("rule")
    public final List<String> rules;

    public MonitorItem() {
        this(null, null, null, 0, 15, null);
    }

    public MonitorItem(List<String> list, List<String> list2, List<String> list3, int i) {
        this.rules = list;
        this.location = list2;
        this.removeBcmKeys = list3;
        this.maxLength = i;
    }

    public MonitorItem(List list, List list2, List list3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? C13BV.INSTANCE : list2, (i2 & 4) != 0 ? C13BV.INSTANCE : list3, (i2 & 8) != 0 ? Integer.MAX_VALUE : i);
    }
}
