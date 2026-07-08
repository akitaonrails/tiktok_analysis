package com.bytedance.android.monitorV2.spark_tracing.gen;

/* JADX INFO: loaded from: classes24.dex */
public interface SparkTracingNativeConfig {
    String getManifestSrc();

    long getPulseInterval();

    String getReferenceMapSrc();

    String getReferencesUsed();

    String getRepoDbStoragePath();

    long getRepoSize();

    boolean isLogEnable();

    boolean isRecordUsedPropertyOnly();

    boolean isReferenceMappingEnabled();
}
