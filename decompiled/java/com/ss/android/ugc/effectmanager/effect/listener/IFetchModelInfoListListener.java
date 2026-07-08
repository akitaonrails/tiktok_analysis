package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public interface IFetchModelInfoListListener extends IEffectPlatformBaseListener<List<ModelInfo>> {
    void onFail(ExceptionResult exceptionResult);
}
