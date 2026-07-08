package com.ss.android.ugc.effectmanager.effect.listener;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;

/* JADX INFO: loaded from: classes31.dex */
public interface IFetchAssetItemInfo extends IEffectPlatformBaseListener<AssetItemResponse> {
    void onFailed(ExceptionResult exceptionResult);
}
