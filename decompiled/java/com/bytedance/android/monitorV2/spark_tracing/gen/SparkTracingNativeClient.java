package com.bytedance.android.monitorV2.spark_tracing.gen;

/* JADX INFO: loaded from: classes24.dex */
public interface SparkTracingNativeClient {
    double getSampleRatio(String str);

    void onEvent(int i, String str, String str2);

    void onPropertyChanged(String str, String str2, String str3);
}
