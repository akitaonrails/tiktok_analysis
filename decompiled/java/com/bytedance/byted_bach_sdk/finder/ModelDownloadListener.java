package com.bytedance.byted_bach_sdk.finder;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ModelDownloadListener {
    public long m_nativeListener;

    private native void deleteNativeObject(long j);

    public abstract void onFailed();

    public abstract void onSuccess();

    public void finalize() throws Throwable {
        super.finalize();
        deleteNativeObject(this.m_nativeListener);
    }

    public final void setNativeListener(long j) {
        this.m_nativeListener = j;
    }
}
