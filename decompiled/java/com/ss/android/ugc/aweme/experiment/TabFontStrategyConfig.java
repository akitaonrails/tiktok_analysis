package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class TabFontStrategyConfig {

    @C09CT("font_strategy")
    public final List<TabTextFontStrategy> strategies;

    public TabFontStrategyConfig() {
        this(null, 1, null);
    }

    public TabFontStrategyConfig(List<TabTextFontStrategy> list) {
        this.strategies = list;
    }

    public TabFontStrategyConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
