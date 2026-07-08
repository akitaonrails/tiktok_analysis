package com.ss.android.ugc.aweme.compliance.api.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class TrashBinExperiment {
    public static final TrashBinConfig LIZ = new TrashBinConfig(false);

    public static final class TrashBinConfig {

        @C09CT("enable")
        public final boolean enable;

        public TrashBinConfig() {
            this(false);
        }

        public TrashBinConfig(boolean z) {
            this.enable = z;
        }
    }
}
