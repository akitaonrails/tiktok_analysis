package com.ss.android.ugc.aweme.services.watermark;

/* JADX INFO: loaded from: classes36.dex */
public interface WaterMarkListener {
    void onCancel();

    void onError(int i);

    void onProgress(int i);

    void onStart();

    void onSuccess(String str);
}
