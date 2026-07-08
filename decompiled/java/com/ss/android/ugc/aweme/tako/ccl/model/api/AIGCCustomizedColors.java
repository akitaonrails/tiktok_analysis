package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class AIGCCustomizedColors {

    @C09CT("indicator_colors")
    public final List<String> arrowColors;

    @C09CT("title_colors")
    public final List<String> titleColors;

    public AIGCCustomizedColors() {
        this(null, null);
    }

    public AIGCCustomizedColors(List<String> list, List<String> list2) {
        this.titleColors = list;
        this.arrowColors = list2;
    }
}
