package com.ss.android.ugc.aweme.translation.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class CLAPrefetchTaskMemoryOptConfig {

    @C09CT("cla_prefetch_drop_old_aweme")
    public final boolean claPrefetchDropOldAweme;

    @C09CT("disable_prefetch_when_auto_translation_disable")
    public final boolean disablePrefetchWhenAutoTranslationDisable;

    @C09CT("enable_cla_prefetch_task_memory_opt")
    public final boolean enableClaPrefetchTaskMemoryOpt;

    public CLAPrefetchTaskMemoryOptConfig() {
        this(false, false, false);
    }

    public CLAPrefetchTaskMemoryOptConfig(boolean z, boolean z2, boolean z3) {
        this.enableClaPrefetchTaskMemoryOpt = z;
        this.claPrefetchDropOldAweme = z2;
        this.disablePrefetchWhenAutoTranslationDisable = z3;
    }
}
