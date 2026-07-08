package com.ss.mediakit.medialoader;

/* JADX INFO: loaded from: classes24.dex */
public interface AVMDLDataLoaderListener {
    String getCheckSumInfo(String str);

    long getInt64Value(int i, long j);

    String getStringValue(int i, long j, String str);

    void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo);
}
