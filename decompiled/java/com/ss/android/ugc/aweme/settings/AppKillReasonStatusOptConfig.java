package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class AppKillReasonStatusOptConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_publish_click_from")
    public final String[] enablePublishClickFrom;

    public AppKillReasonStatusOptConfig() {
        this(false, new String[]{"default"});
    }

    public AppKillReasonStatusOptConfig(boolean z, String[] strArr) {
        this.enable = z;
        this.enablePublishClickFrom = strArr;
    }
}
