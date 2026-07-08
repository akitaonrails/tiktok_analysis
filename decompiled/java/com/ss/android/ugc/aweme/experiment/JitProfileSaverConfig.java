package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class JitProfileSaverConfig {

    @C09CT("min_classes_to_save")
    public final int minClassesToSave;

    @C09CT("min_methods_to_save")
    public final int minMethodsToSave;

    @C09CT("min_save_period_ms")
    public final int minSavePeriodMs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JitProfileSaverConfig)) {
            return false;
        }
        JitProfileSaverConfig jitProfileSaverConfig = (JitProfileSaverConfig) obj;
        return this.minSavePeriodMs == jitProfileSaverConfig.minSavePeriodMs && this.minMethodsToSave == jitProfileSaverConfig.minMethodsToSave && this.minClassesToSave == jitProfileSaverConfig.minClassesToSave;
    }

    public JitProfileSaverConfig() {
        this(40000, 10, 10);
    }

    public JitProfileSaverConfig(int i, int i2, int i3) {
        this.minSavePeriodMs = i;
        this.minMethodsToSave = i2;
        this.minClassesToSave = i3;
    }
}
