package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class DeferredMigrationConfig {

    @C09CT("enable_deferred_migration")
    public final boolean enableDeferredMigration;

    public DeferredMigrationConfig() {
        this(true);
    }

    public DeferredMigrationConfig(boolean z) {
        this.enableDeferredMigration = z;
    }
}
