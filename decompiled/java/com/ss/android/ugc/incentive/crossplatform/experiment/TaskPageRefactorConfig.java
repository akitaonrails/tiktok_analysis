package com.ss.android.ugc.incentive.crossplatform.experiment;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskPageRefactorConfig {

    @C09CT("enable")
    public final boolean enablePageRedirect;

    @C09CT("page_replace_infos")
    public final HashMap<String, PageConfig> pageReplaceInfos;

    public TaskPageRefactorConfig() {
        this(false, new HashMap());
    }

    public TaskPageRefactorConfig(boolean z, HashMap<String, PageConfig> map) {
        this.enablePageRedirect = z;
        this.pageReplaceInfos = map;
    }
}
