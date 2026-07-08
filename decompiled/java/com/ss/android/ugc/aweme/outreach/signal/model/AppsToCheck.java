package com.ss.android.ugc.aweme.outreach.signal.model;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class AppsToCheck {

    @C09CT("app_id")
    public final String appId;

    @C09CT("package_name")
    public final String packageName;

    public AppsToCheck() {
        this(null, null);
    }

    public AppsToCheck(String str, String str2) {
        this.appId = str;
        this.packageName = str2;
    }
}
