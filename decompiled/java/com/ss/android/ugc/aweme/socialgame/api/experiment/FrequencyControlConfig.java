package com.ss.android.ugc.aweme.socialgame.api.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyControlConfig {

    @C09CT("config_list")
    public final List<FrequencyControlItem> frequencyControlConfig;

    public FrequencyControlConfig() {
        this(null, 1, null);
    }

    public FrequencyControlConfig(List<FrequencyControlItem> list) {
        this.frequencyControlConfig = list;
    }

    public FrequencyControlConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
