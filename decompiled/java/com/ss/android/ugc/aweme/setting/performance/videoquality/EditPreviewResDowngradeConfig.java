package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPreviewResDowngradeConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("resolution")
    public final List<Integer> levels;

    @C09CT("min_level_index")
    public final int minLevelIndex;

    public EditPreviewResDowngradeConfig() {
        this(false, 0, null, 7, null);
    }

    public EditPreviewResDowngradeConfig(boolean z, int i, List<Integer> list) {
        this.enable = z;
        this.minLevelIndex = i;
        this.levels = list;
    }

    public EditPreviewResDowngradeConfig(boolean z, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
