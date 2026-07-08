package com.ss.android.ugc.effectmanager.common;

/* JADX INFO: loaded from: classes14.dex */
public interface ChunkResponseCallback {
    void onChunkReceived(EffectRequest effectRequest, String str, boolean z, long j);

    void onError(EffectRequest effectRequest, Throwable th);

    void onSuccess(EffectRequest effectRequest, long j);
}
