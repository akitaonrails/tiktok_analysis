package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* JADX INFO: loaded from: classes31.dex */
public interface IEffectListResponseListener extends IEffectPlatformBaseListener<EffectListResponse> {
    void onFail(ExceptionResult exceptionResult);
}
