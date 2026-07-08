package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* JADX INFO: loaded from: classes26.dex */
public interface IFetchCategoryEffectListener extends IEffectPlatformBaseListener<CategoryPageModel> {
    void onFail(ExceptionResult exceptionResult);
}
