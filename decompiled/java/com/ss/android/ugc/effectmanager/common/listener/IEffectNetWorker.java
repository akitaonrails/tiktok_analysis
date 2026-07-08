package com.ss.android.ugc.effectmanager.common.listener;

import com.ss.android.ugc.effectmanager.common.ChunkResponseCallback;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public interface IEffectNetWorker {
    InputStream execute(EffectRequest effectRequest);

    void executeChunked(EffectRequest effectRequest, ChunkResponseCallback chunkResponseCallback);
}
