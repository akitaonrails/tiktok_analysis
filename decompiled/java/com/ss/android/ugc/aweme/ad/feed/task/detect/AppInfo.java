package com.ss.android.ugc.aweme.ad.feed.task.detect;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class AppInfo {

    @C09CT("index")
    public final Integer index;

    @C09CT("package_name")
    public final String packageName;

    public AppInfo() {
        this(-1, "");
    }

    public AppInfo(Integer num, String str) {
        this.index = num;
        this.packageName = str;
    }
}
