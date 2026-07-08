package com.ss.android.ugc.aweme.services.effect;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes30.dex */
public interface IEffectModelLoggerService {
    void endDownloadEffectModelAlog(Effect effect, Object obj, long j, int i, Exception exc, String str);

    void reportModelListAlog(boolean z, String str, long j, String str2);

    void startDownloadEffectModelAlog(Effect effect, Object obj, String str);
}
