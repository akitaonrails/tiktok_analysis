package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class InstalledAppCheckConfig {

    @C09CT("apps_to_check")
    public final List<AppsToCheck> appsToCheck;

    public InstalledAppCheckConfig() {
        this(null);
    }

    public InstalledAppCheckConfig(List<AppsToCheck> list) {
        this.appsToCheck = list;
    }
}
