package com.ss.android.ugc.aweme.cla.experiments.captions;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class ToastFrequencyConfig {

    @C09CT("see_original")
    public List<Integer> seeOriginalFrequencies;

    @C09CT("see_translation")
    public List<Integer> seeTranslationFrequencies;

    public ToastFrequencyConfig() {
        this(null, null, 3, null);
    }

    public ToastFrequencyConfig(List<Integer> list, List<Integer> list2) {
        this.seeOriginalFrequencies = list;
        this.seeTranslationFrequencies = list2;
    }

    public ToastFrequencyConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
