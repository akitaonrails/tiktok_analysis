package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes13.dex */
public interface IEffectDownloadProgressListener extends IFetchEffectListener {
    void onProgress(Effect effect, int i, long j);
}
