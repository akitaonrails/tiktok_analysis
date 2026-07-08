package com.bytedance.vcloud.strategy.drm;

/* JADX INFO: loaded from: classes35.dex */
public interface NetworkTask<T> {
    NetworkResult<T> execute();

    Priority priority();

    String requestId();
}
