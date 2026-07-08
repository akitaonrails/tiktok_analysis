package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* JADX INFO: loaded from: classes26.dex */
public interface IFetchPanelInfoListener extends IEffectPlatformBaseListener<PanelInfoModel> {
    void onFail(ExceptionResult exceptionResult);
}
