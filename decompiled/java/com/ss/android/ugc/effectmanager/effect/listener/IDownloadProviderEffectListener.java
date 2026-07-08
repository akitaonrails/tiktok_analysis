package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* JADX INFO: loaded from: classes26.dex */
public interface IDownloadProviderEffectListener extends IEffectPlatformBaseListener<ProviderEffect> {
    void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult);
}
