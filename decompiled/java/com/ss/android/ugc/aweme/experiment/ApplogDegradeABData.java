package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplogDegradeABData {

    @C09CT("ttk_applog_downgrade_list")
    public final List<ApplogDegradeInfoList> degradeInfoList;

    @C09CT("ttk_applog_downgrade_total_switch")
    public final boolean enable;

    public ApplogDegradeABData() {
        this(false, null);
    }

    public ApplogDegradeABData(boolean z, List<ApplogDegradeInfoList> list) {
        this.enable = z;
        this.degradeInfoList = list;
    }
}
