package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes13.dex */
public interface IFetchEffectListener extends IEffectPlatformBaseListener<Effect> {
    void onFail(Effect effect, ExceptionResult exceptionResult);

    void onStart(Effect effect);
}
