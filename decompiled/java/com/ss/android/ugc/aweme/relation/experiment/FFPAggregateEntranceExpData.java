package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class FFPAggregateEntranceExpData {

    @C09CT("cooldown_duration")
    public final Long cooldownDuration;

    @C09CT("cooldown_list_load_no_show_threshold")
    public final Integer cooldownListLoadNotShowThreshold;

    @C09CT("cooldown_list_show_threshold")
    public final Integer cooldownListShowThreshold;

    @C09CT("recommend_card_count")
    public final Integer recommendCardCount;

    @C09CT("scenes")
    public final List<String> scenes;

    public FFPAggregateEntranceExpData() {
        this(null, null, null, null, null, 31, null);
    }

    public FFPAggregateEntranceExpData(List<String> list, Integer num, Integer num2, Integer num3, Long l) {
        this.scenes = list;
        this.recommendCardCount = num;
        this.cooldownListShowThreshold = num2;
        this.cooldownListLoadNotShowThreshold = num3;
        this.cooldownDuration = l;
    }

    public FFPAggregateEntranceExpData(List list, Integer num, Integer num2, Integer num3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 3 : num2, (i & 8) != 0 ? 20 : num3, (i & 16) != 0 ? 0L : l);
    }
}
