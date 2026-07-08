package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class GcStwBoostConfig {

    @C09CT("priority")
    public int priority;

    @C09CT("use_thread_local")
    public boolean useThreadLocal;

    public GcStwBoostConfig() {
        this(0, true);
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public final void setUseThreadLocal(boolean z) {
        this.useThreadLocal = z;
    }

    public GcStwBoostConfig(int i, boolean z) {
        this.priority = i;
        this.useThreadLocal = z;
    }
}
