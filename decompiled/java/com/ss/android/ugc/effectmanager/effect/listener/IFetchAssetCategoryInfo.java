package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;

/* JADX INFO: loaded from: classes26.dex */
public interface IFetchAssetCategoryInfo extends IEffectPlatformBaseListener<AssetCategoryResponse> {
    void onFailed(ExceptionResult exceptionResult);
}
