package com.ss.android.ugc.aweme.aigc.asynctask.tasks;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class Resource {

    @C09CT("key")
    public final String key;

    @C09CT("path")
    public final String path;

    @C09CT("type")
    public final String type;

    public Resource() {
        this("", "", "");
    }

    public Resource(String str, String str2, String str3) {
        this.type = str;
        this.path = str2;
        this.key = str3;
    }
}
