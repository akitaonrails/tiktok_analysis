package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class PageCreateOptConfig {

    @C09CT("always_valid_path_list")
    public final List<String> alwaysValidPathList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_for_all_path")
    public final boolean enableForAllPath;

    public PageCreateOptConfig() {
        this(false, false, null, 7, null);
    }

    public PageCreateOptConfig(boolean z, boolean z2, List<String> list) {
        this.enable = z;
        this.enableForAllPath = z2;
        this.alwaysValidPathList = list;
    }

    public PageCreateOptConfig(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
