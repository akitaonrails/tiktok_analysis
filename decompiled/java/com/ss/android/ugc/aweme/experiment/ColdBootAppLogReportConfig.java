package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public final class ColdBootAppLogReportConfig {

    @C09CT("boot_finish_task_list")
    public final ArrayList<String> bootFinishTaskList;

    @C09CT("boot_task_list")
    public final ArrayList<String> bootTaskList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("runnable_list")
    public final ArrayList<String> runableList;

    public ColdBootAppLogReportConfig() {
        this(true, new ArrayList(), new ArrayList(), new ArrayList());
    }

    public ColdBootAppLogReportConfig(boolean z, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        this.enable = z;
        this.bootTaskList = arrayList;
        this.runableList = arrayList2;
        this.bootFinishTaskList = arrayList3;
    }
}
