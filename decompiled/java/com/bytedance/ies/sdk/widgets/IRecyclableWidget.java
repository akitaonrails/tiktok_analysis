package com.bytedance.ies.sdk.widgets;

/* JADX INFO: loaded from: classes8.dex */
public interface IRecyclableWidget {
    boolean isInitialized();

    void onInit(Object[] objArr);

    void onLoad(Object[] objArr);

    void onUnload();

    void resetInternal();
}
