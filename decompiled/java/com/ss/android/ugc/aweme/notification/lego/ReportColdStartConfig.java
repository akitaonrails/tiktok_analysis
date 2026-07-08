package com.ss.android.ugc.aweme.notification.lego;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ReportColdStartConfig {

    @C09CT("interval")
    public final long interval;

    @C09CT("name")
    public final String name;

    @C09CT("version")
    public final long version;

    public ReportColdStartConfig(String str, long j, long j2) {
        this.name = str;
        this.interval = j;
        this.version = j2;
    }
}
