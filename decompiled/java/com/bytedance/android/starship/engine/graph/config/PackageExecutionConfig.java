package com.bytedance.android.starship.engine.graph.config;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class PackageExecutionConfig {

    @C09CT("extra_inputs")
    public final String extraInputs;

    @C09CT("pty_business_name")
    public final String ptyBusinessName;

    @C09CT("timeout_duration")
    public final Integer timeoutDuration;

    public PackageExecutionConfig() {
        this(null, null, null);
    }

    public PackageExecutionConfig(String str, Integer num, String str2) {
        this.ptyBusinessName = str;
        this.timeoutDuration = num;
        this.extraInputs = str2;
    }
}
