package com.ss.android.ugc.aweme.setting.performance;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ToolsNetworkRequest {
    public static final int $stable = 0;

    @C09CT("extra")
    public final String extra;

    @C09CT("path")
    public final String path;

    public ToolsNetworkRequest() {
        this("", "");
    }

    public ToolsNetworkRequest(String str, String str2) {
        this.path = str;
        this.extra = str2;
    }
}
