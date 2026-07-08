package com.ss.android.ugc.effectmanager.common.download;

/* JADX INFO: loaded from: classes4.dex */
public interface DownloadListener {
    void onFinish(DownloadResult downloadResult);

    void onProgress(int i, long j);

    void onStart();
}
