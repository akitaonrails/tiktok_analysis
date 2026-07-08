package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* JADX INFO: loaded from: classes31.dex */
public interface IFetchResourceListener extends IEffectPlatformBaseListener<ResourceListModel> {
    void onFail(ExceptionResult exceptionResult);
}
