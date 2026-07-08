package com.ss.android.ugc.aweme.ad.feed.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class AppInfo {

    @C09CT("index")
    public final int index;

    @C09CT("name")
    public final String name;

    @C09CT("package_name")
    public final String packageName;

    @C09CT("url")
    public final String url;

    public AppInfo() {
        this("", -1, "", "");
    }

    public AppInfo(String str, int i, String str2, String str3) {
        this.name = str;
        this.index = i;
        this.url = str2;
        this.packageName = str3;
    }
}
