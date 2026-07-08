package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class TakoHideEntranceByActiveLevelModel {

    @C09CT("hide")
    public final List<String> hide;

    @C09CT("level")
    public final int level;

    public TakoHideEntranceByActiveLevelModel() {
        this(0, null, 3, null);
    }

    public TakoHideEntranceByActiveLevelModel(int i, List<String> list) {
        this.level = i;
        this.hide = list;
    }

    public TakoHideEntranceByActiveLevelModel(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
