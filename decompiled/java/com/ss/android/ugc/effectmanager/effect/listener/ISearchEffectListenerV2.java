package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;

/* JADX INFO: loaded from: classes26.dex */
public interface ISearchEffectListenerV2 extends IEffectPlatformBaseListener<SearchEffectResponseV2> {
    void onFail(ExceptionResult exceptionResult);
}
