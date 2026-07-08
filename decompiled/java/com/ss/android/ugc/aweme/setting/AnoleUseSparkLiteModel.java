package com.ss.android.ugc.aweme.setting;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleUseSparkLiteModel {

    @C09CT("effect_component_type")
    public final List<String> effectComponentType;

    @C09CT("effect_rit_list")
    public final List<Integer> effectRitList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("report_performance")
    public final boolean reportPerformance;

    public AnoleUseSparkLiteModel() {
        this(false, false, null, null);
    }

    public AnoleUseSparkLiteModel(boolean z, boolean z2, List<Integer> list, List<String> list2) {
        this.enable = z;
        this.reportPerformance = z2;
        this.effectRitList = list;
        this.effectComponentType = list2;
    }
}
