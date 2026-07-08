package com.ss.android.ugc.aweme.tools.draft.monitor;

import X.C09CT;
import X.C570430MYv;

/* JADX INFO: loaded from: classes9.dex */
public final class ClearCacheParams extends C570430MYv {

    @C09CT("needClearPaths")
    public final String needClearPaths;

    @C09CT("needKeepDirectory")
    public final String needKeepDirectory;

    @C09CT("stackTrace")
    public final String stackTrace;

    public ClearCacheParams() {
        this("", "", null);
    }

    public ClearCacheParams(String str, String str2, String str3) {
        this.needClearPaths = str;
        this.stackTrace = str2;
        this.needKeepDirectory = str3;
    }
}
