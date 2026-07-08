package com.bytedance.vcloud.strategy.drm;

/* JADX INFO: loaded from: classes35.dex */
public final class NetworkResult<T> {
    public final int code;
    public final T data;
    public final RequestMetrics metrics;
    public final boolean success;

    public static <T> NetworkResult<T> failure(int i, RequestMetrics requestMetrics) {
        return new NetworkResult<>(false, i, null, requestMetrics);
    }

    public static <T> NetworkResult<T> success(T t, RequestMetrics requestMetrics) {
        return new NetworkResult<>(true, 0, t, requestMetrics);
    }

    public NetworkResult(boolean z, int i, T t, RequestMetrics requestMetrics) {
        this.success = z;
        this.code = i;
        this.data = t;
        this.metrics = requestMetrics;
    }
}
