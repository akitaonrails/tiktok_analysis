package com.ss.android.ugc.aweme.wavepublish.monitor.callback;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishNodeTimeout {
    public static final int $stable = 0;

    @C09CT("node_name")
    public final String nodeName;

    @C09CT("timeout_setting")
    public final int timeoutSetting;

    public PublishNodeTimeout(String str, int i) {
        this.nodeName = str;
        this.timeoutSetting = i;
    }
}
