package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.CustomizedEffectsResponse;

/* JADX INFO: loaded from: classes31.dex */
public interface IQueryCustomizedEffectsListener extends IEffectPlatformBaseListener<CustomizedEffectsResponse> {
    void onFail(ExceptionResult exceptionResult);
}
