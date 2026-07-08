package com.bytedance.pumbaa.pipeline.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class AggregatedReportConfig {

    @C09CT("max_storage_limit")
    public final int maxStorageLimit;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AggregatedReportConfig) && this.maxStorageLimit == ((AggregatedReportConfig) obj).maxStorageLimit;
    }

    public AggregatedReportConfig(int i) {
        this.maxStorageLimit = i;
    }
}
